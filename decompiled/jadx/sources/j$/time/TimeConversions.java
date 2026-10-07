package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public class TimeConversions {
    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        long seconds = duration.getSeconds();
        long nano = duration.getNano();
        Duration duration2 = Duration.f5356c;
        return Duration.u(Math.addExact(seconds, Math.floorDiv(nano, 1000000000L)), (int) Math.floorMod(nano, 1000000000L));
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.f5357a, duration.f5358b);
    }
}
