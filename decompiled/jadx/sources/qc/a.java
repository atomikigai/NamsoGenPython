package qc;

import com.google.android.gms.internal.ads.zzbbs;
import jc.i;
import jd.d;
import pc.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f8056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8058d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8059a;

    static {
        int i = b.f8060a;
        f8056b = qd.b.o(4611686018427387903L);
        f8057c = qd.b.o(-4611686018427387903L);
    }

    public /* synthetic */ a(long j4) {
        this.f8059a = j4;
    }

    public static final long a(long j4, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j4 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return qd.b.o(d.h(j13));
        }
        long j14 = ((j13 * j11) + (j10 - (j12 * j11))) << 1;
        int i = b.f8060a;
        return j14;
    }

    public static final void b(StringBuilder sb2, int i, int i10, int i11, String str) {
        sb2.append(i);
        if (i10 != 0) {
            sb2.append('.');
            String strP0 = g.p0(i11, String.valueOf(i10));
            int i12 = -1;
            int length = strP0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (strP0.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (i14 < 3) {
                sb2.append((CharSequence) strP0, 0, i14);
            } else {
                sb2.append((CharSequence) strP0, 0, ((i12 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static int c(long j4, long j10) {
        long j11 = j4 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i = (((int) j4) & 1) - (((int) j10) & 1);
            return j4 < 0 ? -i : i;
        }
        if (j4 < j10) {
            return -1;
        }
        return j4 == j10 ? 0 : 1;
    }

    public static final boolean d(long j4) {
        return j4 == f8056b || j4 == f8057c;
    }

    public static final long e(long j4, c cVar) {
        i.e(cVar, "unit");
        if (j4 == f8056b) {
            return Long.MAX_VALUE;
        }
        if (j4 == f8057c) {
            return Long.MIN_VALUE;
        }
        long j10 = j4 >> 1;
        c cVar2 = (((int) j4) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS;
        i.e(cVar2, "sourceUnit");
        return cVar.f8067a.convert(j10, cVar2.f8067a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f8059a, ((a) obj).f8059a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f8059a == ((a) obj).f8059a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8059a);
    }

    public final String toString() {
        int i;
        long j4;
        int i10;
        int i11;
        long j10 = this.f8059a;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f8056b) {
            return "Infinity";
        }
        if (j10 == f8057c) {
            return "-Infinity";
        }
        boolean z4 = j10 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z4) {
            sb2.append('-');
        }
        if (j10 < 0) {
            j10 = ((long) (((int) j10) & 1)) + ((-(j10 >> 1)) << 1);
            int i12 = b.f8060a;
        }
        long jE = e(j10, c.DAYS);
        int iE = d(j10) ? 0 : (int) (e(j10, c.HOURS) % ((long) 24));
        int iE2 = d(j10) ? 0 : (int) (e(j10, c.MINUTES) % ((long) 60));
        int iE3 = d(j10) ? 0 : (int) (e(j10, c.SECONDS) % ((long) 60));
        if (d(j10)) {
            i = 1;
            i10 = 0;
        } else {
            if ((((int) j10) & 1) == 1) {
                i = 1;
                j4 = ((j10 >> 1) % ((long) zzbbs.zzq.zzf)) * ((long) 1000000);
            } else {
                i = 1;
                j4 = (j10 >> 1) % ((long) 1000000000);
            }
            i10 = (int) j4;
        }
        int i13 = jE != 0 ? i : 0;
        int i14 = iE != 0 ? i : 0;
        int i15 = iE2 != 0 ? i : 0;
        int i16 = (iE3 == 0 && i10 == 0) ? 0 : i;
        if (i13 != 0) {
            sb2.append(jE);
            sb2.append('d');
            i11 = i;
        } else {
            i11 = 0;
        }
        if (i14 != 0 || (i13 != 0 && (i15 != 0 || i16 != 0))) {
            int i17 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iE);
            sb2.append('h');
            i11 = i17;
        }
        if (i15 != 0 || (i16 != 0 && (i14 != 0 || i13 != 0))) {
            int i18 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iE2);
            sb2.append('m');
            i11 = i18;
        }
        if (i16 != 0) {
            int i19 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (iE3 != 0 || i13 != 0 || i14 != 0 || i15 != 0) {
                b(sb2, iE3, i10, 9, "s");
            } else if (i10 >= 1000000) {
                b(sb2, i10 / 1000000, i10 % 1000000, 6, "ms");
            } else if (i10 >= 1000) {
                b(sb2, i10 / zzbbs.zzq.zzf, i10 % zzbbs.zzq.zzf, 3, "us");
            } else {
                sb2.append(i10);
                sb2.append("ns");
            }
            i11 = i19;
        }
        if (z4 && i11 > i) {
            sb2.insert(i, '(').append(')');
        }
        return sb2.toString();
    }
}
