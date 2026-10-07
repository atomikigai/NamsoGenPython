package kc;

import jd.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6206a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6207b;

    static {
        Integer num = ec.a.f3534a;
        f6207b = (num == null || num.intValue() >= 34) ? new lc.a() : new b();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i, int i10) {
        int iB;
        int i11;
        int iA;
        if (i10 <= i) {
            throw new IllegalArgumentException(l.b(Integer.valueOf(i), Integer.valueOf(i10)).toString());
        }
        int i12 = i10 - i;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                iA = a(31 - Integer.numberOfLeadingZeros(i12));
            } else {
                do {
                    iB = b() >>> 1;
                    i11 = iB % i12;
                } while ((i12 - 1) + (iB - i11) < 0);
                iA = i11;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i10) {
                return iB2;
            }
        }
    }

    public long d() {
        return (((long) b()) << 32) + ((long) b());
    }

    public long e(long j4, long j10) {
        long jD;
        long j11;
        long jA;
        int iB;
        if (j10 <= j4) {
            throw new IllegalArgumentException(l.b(Long.valueOf(j4), Long.valueOf(j10)).toString());
        }
        long j12 = j10 - j4;
        if (j12 > 0) {
            if (((-j12) & j12) == j12) {
                int i = (int) j12;
                int i10 = (int) (j12 >>> 32);
                if (i != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i10 == 1) {
                    iB = b();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i10))) << 32) + (((long) b()) & 4294967295L);
                }
                jA = ((long) iB) & 4294967295L;
            } else {
                do {
                    jD = d() >>> 1;
                    j11 = jD % j12;
                } while ((j12 - 1) + (jD - j11) < 0);
                jA = j11;
            }
            return j4 + jA;
        }
        while (true) {
            long jD2 = d();
            if (j4 <= jD2 && jD2 < j10) {
                return jD2;
            }
        }
    }
}
