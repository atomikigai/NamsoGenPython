package j$.time;

import com.google.android.gms.internal.ads.zzbbs;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f5356c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5358b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f5357a, duration2.f5357a);
        return iCompare != 0 ? iCompare : this.f5358b - duration2.f5358b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofSeconds(long j4) {
        return u(j4, 0);
    }

    public static Duration ofMillis(long j4) {
        long j10 = j4 / 1000;
        int i = (int) (j4 % 1000);
        if (i < 0) {
            i += zzbbs.zzq.zzf;
            j10--;
        }
        return u(j10, i * 1000000);
    }

    public static Duration w(long j4) {
        long j10 = j4 / 1000000000;
        int i = (int) (j4 % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j10--;
        }
        return u(j10, i);
    }

    public static Duration u(long j4, int i) {
        if ((((long) i) | j4) == 0) {
            return f5356c;
        }
        return new Duration(j4, i);
    }

    public Duration(long j4, int i) {
        this.f5357a = j4;
        this.f5358b = i;
    }

    public long toMillis() {
        long j4 = this.f5357a;
        long j10 = this.f5358b;
        if (j4 < 0) {
            j4++;
            j10 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j4, zzbbs.zzq.zzf), j10 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f5357a == duration.f5357a && this.f5358b == duration.f5358b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f5357a;
        return (this.f5358b * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        if (this == f5356c) {
            return "PT0S";
        }
        long j4 = this.f5357a;
        if (j4 < 0 && this.f5358b > 0) {
            j4++;
        }
        long j10 = j4 / 3600;
        int i = (int) ((j4 % 3600) / 60);
        int i10 = (int) (j4 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j10 != 0) {
            sb2.append(j10);
            sb2.append('H');
        }
        if (i != 0) {
            sb2.append(i);
            sb2.append('M');
        }
        if (i10 == 0 && this.f5358b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f5357a < 0 && this.f5358b > 0 && i10 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i10);
        }
        if (this.f5358b > 0) {
            int length = sb2.length();
            if (this.f5357a < 0) {
                sb2.append(2000000000 - ((long) this.f5358b));
            } else {
                sb2.append(((long) this.f5358b) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
