package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5543d;

    public static u e(long j4, long j10) {
        if (j4 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(j4, j4, j10, j10);
    }

    public static u f(long j4, long j10) {
        if (j4 > j10) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(1L, 1L, j4, j10);
    }

    public u(long j4, long j10, long j11, long j12) {
        this.f5540a = j4;
        this.f5541b = j10;
        this.f5542c = j11;
        this.f5543d = j12;
    }

    public final int a(long j4, q qVar) {
        if (this.f5540a < -2147483648L || this.f5543d > 2147483647L || !d(j4)) {
            throw new j$.time.a(c(j4, qVar));
        }
        return (int) j4;
    }

    public final boolean d(long j4) {
        return j4 >= this.f5540a && j4 <= this.f5543d;
    }

    public final void b(long j4, q qVar) {
        if (!d(j4)) {
            throw new j$.time.a(c(j4, qVar));
        }
    }

    public final String c(long j4, q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j4;
        }
        return "Invalid value (valid values " + this + "): " + j4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j4 = this.f5540a;
        long j10 = this.f5541b;
        if (j4 > j10) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j11 = this.f5542c;
        long j12 = this.f5543d;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 > j12) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f5540a == uVar.f5540a && this.f5541b == uVar.f5541b && this.f5542c == uVar.f5542c && this.f5543d == uVar.f5543d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f5540a;
        long j10 = this.f5541b;
        long j11 = j4 + (j10 << 16) + (j10 >> 48);
        long j12 = this.f5542c;
        long j13 = j11 + (j12 << 32) + (j12 >> 32);
        long j14 = this.f5543d;
        long j15 = j13 + (j14 << 48) + (j14 >> 16);
        return (int) (j15 ^ (j15 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5540a);
        if (this.f5540a != this.f5541b) {
            sb2.append('/');
            sb2.append(this.f5541b);
        }
        sb2.append(" - ");
        sb2.append(this.f5542c);
        if (this.f5542c != this.f5543d) {
            sb2.append('/');
            sb2.append(this.f5543d);
        }
        return sb2.toString();
    }
}
