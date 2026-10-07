/**
 * JVM oracle for the recovered gate/cache routines in the Namso APK.
 * Source: jd/l.java:a(long), kc/d.java:c/e, kc/e.java:a/b,
 * h3/e1.java:i0(String), and h3/j0.java cache-age branch.
 * This deliberately uses Java String.hashCode and Java signed integer rules.
 */
public final class GateOracle {
    private GateOracle() {}

    private static final class XorWow {
        int x, y, z, w, v, add;

        XorWow(long seed) {
            x = (int) seed;
            y = (int) (seed >> 32);
            z = 0;
            w = 0;
            v = ~x;
            add = (x << 10) ^ (y >>> 4);
            if ((y | x | v) == 0) throw new IllegalArgumentException("zero initial state");
            for (int i = 0; i < 64; i++) nextInt();
        }

        int nextInt() {
            int t = x ^ (x >>> 2);
            x = y;
            y = z;
            z = w;
            w = v;
            v = ((t ^ (t << 1)) ^ w) ^ (w << 4);
            add += 362437;
            return v + add;
        }

        int nextBits(int bits) {
            // kc/e.java evaluates b() on the RHS even when the mask is zero.
            return ((-bits) >> 31) & (nextInt() >>> (32 - bits));
        }

        int nextInt(int from, int until) {
            if (until <= from) throw new IllegalArgumentException("empty int range");
            int n = until - from;
            if (n > 0 || n == Integer.MIN_VALUE) {
                if ((-n & n) == n) return from + nextBits(31 - Integer.numberOfLeadingZeros(n));
                int bits, value;
                do {
                    bits = nextInt() >>> 1;
                    value = bits % n;
                } while ((n - 1) + (bits - value) < 0);
                return from + value;
            }
            int value;
            do { value = nextInt(); } while (value < from || value >= until);
            return value;
        }

        long nextLongRaw() {
            return (((long) nextInt()) << 32) + (long) nextInt();
        }

        long nextLong(long from, long until) {
            if (until <= from) throw new IllegalArgumentException("empty long range");
            long n = until - from;
            if (n > 0) {
                long value;
                if ((-n & n) == n) {
                    int low = (int) n;
                    int high = (int) (n >>> 32);
                    if (low != 0) value = nextBits(31 - Integer.numberOfLeadingZeros(low));
                    else if (high == 1) value = nextInt();
                    else value = (((long) nextBits(31 - Integer.numberOfLeadingZeros(high))) << 32)
                            + (((long) nextInt()) & 0xffffffffL);
                } else {
                    long bits;
                    do {
                        long raw = nextLongRaw();
                        bits = raw >>> 1;
                        value = bits % n;
                    } while ((n - 1) + (bits - value) < 0L);
                }
                return from + value;
            }
            long value;
            do { value = nextLongRaw(); } while (value < from || value >= until);
            return value;
        }
    }

    private static long[] config(String name) {
        if (name == null || isKotlinBlank(name)) return null;
        XorWow random = new XorWow(name.hashCode());
        int pct = random.nextInt(1, 11);
        long min = random.nextLong(1_800_000L, 21_600_000L);
        long max = random.nextLong(21_600_000L, 172_800_000L) + min;
        return new long[] { pct, min, max };
    }

    private static boolean isKotlinBlank(String value) {
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) return false;
        }
        return true;
    }

    private static boolean alive(String card, long stored, long now, String gate) {
        long ageLimit = ageLimit(card, stored, gate);
        return !(now - stored > ageLimit);
    }

    private static long ageLimit(String card, long stored, String gate) {
        long min = 1_800_000L;
        long max = 86_400_000L;
        if (gate != null && !gate.equals("GRATIS")) {
            long[] values = config(gate);
            if (values != null) { min = values[1]; max = values[2]; }
        }
        long seed = ((long) card.hashCode()) * 31L + stored;
        if (max <= min) max = min + 1;
        return new XorWow(seed).nextLong(min, max);
    }

    private static String quote(String s) {
        StringBuilder out = new StringBuilder("\"");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"': out.append("\\\""); break;
                case '\\': out.append("\\\\"); break;
                case '\n': out.append("\\n"); break;
                case '\r': out.append("\\r"); break;
                case '\t': out.append("\\t"); break;
                default:
                    if (c < 0x20) out.append(String.format("\\u%04x", (int)c));
                    else out.append(c);
            }
        }
        return out.append('"').toString();
    }

    private static void printConfig(String name) {
        long[] c = config(name);
        if (c == null) System.out.println("{\"name\":" + quote(name) + ",\"config\":null}");
        else System.out.printf("{\"name\":%s,\"livePct\":%d,\"vidaMinMs\":%d,\"vidaMaxMs\":%d}%n",
                quote(name), c[0], c[1], c[2]);
    }

    public static void main(String[] args) {
        if (args.length >= 1 && args[0].equals("config")) {
            if (args.length == 1) { System.err.println("usage: GateOracle config <name...>"); System.exit(2); }
            for (int i = 1; i < args.length; i++) printConfig(args[i]);
        } else if (args.length == 4 && args[0].equals("age-limit")) {
            String gate = args[3].equals("-") ? null : args[3];
            long stored = Long.parseLong(args[2]);
            System.out.printf("{\"card\":%s,\"stored\":%s,\"gate\":%s,\"ageLimitMs\":%d}%n",
                    quote(args[1]), args[2], gate == null ? "null" : quote(gate),
                    ageLimit(args[1], stored, gate));
        } else if (args.length == 2 && args[0].equals("probe-bits0")) {
            XorWow random = new XorWow(Long.parseLong(args[1]));
            int value = random.nextInt(0, 1);
            System.out.printf("{\"value\":%d,\"nextInt\":%d}%n", value, random.nextInt());
        } else if (args.length == 5 && args[0].equals("age")) {
            String gate = args[4].equals("-") ? null : args[4];
            boolean result = alive(args[1], Long.parseLong(args[2]), Long.parseLong(args[3]), gate);
            System.out.printf("{\"card\":%s,\"stored\":%s,\"now\":%s,\"gate\":%s,\"alive\":%s}%n",
                    quote(args[1]), args[2], args[3], gate == null ? "null" : quote(gate), result);
        } else {
            System.err.println("usage: GateOracle config <name...> | age-limit <card> <stored_ms> <gate|-> | age <card> <stored_ms> <now_ms> <gate|-> | probe-bits0 <seed>");
            System.exit(2);
        }
    }
}
