package j$.time;

import com.google.android.gms.internal.ads.zzbbs;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    public static final i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f5485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f5486g;
    public static final i[] h = new i[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f5487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f5488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f5489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5490d;

    static {
        int i = 0;
        while (true) {
            i[] iVarArr = h;
            if (i < iVarArr.length) {
                iVarArr[i] = new i(i, 0, 0, 0);
                i++;
            } else {
                i iVar = iVarArr[0];
                f5486g = iVar;
                i iVar2 = iVarArr[12];
                e = iVar;
                f5485f = new i(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static i K(long j4) {
        j$.time.temporal.a.NANO_OF_DAY.M(j4);
        int i = (int) (j4 / 3600000000000L);
        long j10 = j4 - (((long) i) * 3600000000000L);
        int i10 = (int) (j10 / 60000000000L);
        long j11 = j10 - (((long) i10) * 60000000000L);
        int i11 = (int) (j11 / 1000000000);
        return w(i, i10, i11, (int) (j11 - (((long) i11) * 1000000000)));
    }

    public static i C(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        i iVar = (i) nVar.b(j$.time.temporal.r.f5539g);
        if (iVar != null) {
            return iVar;
        }
        throw new a("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static i w(int i, int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return h[i];
        }
        return new i(i, i10, i11, i12);
    }

    public i(int i, int i10, int i11, int i12) {
        this.f5487a = (byte) i;
        this.f5488b = (byte) i10;
        this.f5489c = (byte) i11;
        this.f5490d = i12;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).N();
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return I(qVar);
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return S();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return S() / 1000;
            }
            return I(qVar);
        }
        return qVar.I(this);
    }

    public final int I(j$.time.temporal.q qVar) {
        switch (h.f5483a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f5490d;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f5490d / zzbbs.zzq.zzf;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f5490d / 1000000;
            case 6:
                return (int) (S() / 1000000);
            case 7:
                return this.f5489c;
            case 8:
                return T();
            case 9:
                return this.f5488b;
            case 10:
                return (this.f5487a * 60) + this.f5488b;
            case 11:
                return this.f5487a % 12;
            case 12:
                int i = this.f5487a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f5487a;
            case 14:
                byte b10 = this.f5487a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f5487a / 12;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(f fVar) {
        return (i) fVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final i i(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (i) qVar.K(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.M(j4);
        switch (h.f5483a[aVar.ordinal()]) {
            case 1:
                return V((int) j4);
            case 2:
                return K(j4);
            case 3:
                return V(((int) j4) * zzbbs.zzq.zzf);
            case 4:
                return K(j4 * 1000);
            case 5:
                return V(((int) j4) * 1000000);
            case 6:
                return K(j4 * 1000000);
            case 7:
                int i = (int) j4;
                if (this.f5489c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.M(i);
                    return w(this.f5487a, this.f5488b, i, this.f5490d);
                }
                return this;
            case 8:
                return Q(j4 - ((long) T()));
            case 9:
                int i10 = (int) j4;
                if (this.f5488b != i10) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.M(i10);
                    return w(this.f5487a, i10, this.f5489c, this.f5490d);
                }
                return this;
            case 10:
                return O(j4 - ((long) ((this.f5487a * 60) + this.f5488b)));
            case 11:
                return N(j4 - ((long) (this.f5487a % 12)));
            case 12:
                if (j4 == 12) {
                    j4 = 0;
                }
                return N(j4 - ((long) (this.f5487a % 12)));
            case 13:
                int i11 = (int) j4;
                if (this.f5487a != i11) {
                    j$.time.temporal.a.HOUR_OF_DAY.M(i11);
                    return w(i11, this.f5488b, this.f5489c, this.f5490d);
                }
                return this;
            case 14:
                if (j4 == 24) {
                    j4 = 0;
                }
                int i12 = (int) j4;
                if (this.f5487a != i12) {
                    j$.time.temporal.a.HOUR_OF_DAY.M(i12);
                    return w(i12, this.f5488b, this.f5489c, this.f5490d);
                }
                return this;
            case 15:
                return N((j4 - ((long) (this.f5487a / 12))) * 12);
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    public final i V(int i) {
        if (this.f5490d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.M(i);
        return w(this.f5487a, this.f5488b, this.f5489c, i);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final i l(long j4, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (h.f5484b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return P(j4);
                case 2:
                    return P((j4 % 86400000000L) * 1000);
                case 3:
                    return P((j4 % 86400000) * 1000000);
                case 4:
                    return Q(j4);
                case 5:
                    return O(j4);
                case 6:
                    return N(j4);
                case 7:
                    return N((j4 % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (i) sVar.u(this, j4);
    }

    public final i N(long j4) {
        return j4 == 0 ? this : w(((((int) (j4 % 24)) + this.f5487a) + 24) % 24, this.f5488b, this.f5489c, this.f5490d);
    }

    public final i O(long j4) {
        if (j4 != 0) {
            int i = (this.f5487a * 60) + this.f5488b;
            int i10 = ((((int) (j4 % 1440)) + i) + 1440) % 1440;
            if (i != i10) {
                return w(i10 / 60, i10 % 60, this.f5489c, this.f5490d);
            }
        }
        return this;
    }

    public final i Q(long j4) {
        if (j4 != 0) {
            int i = (this.f5488b * 60) + (this.f5487a * 3600) + this.f5489c;
            int i10 = ((((int) (j4 % 86400)) + i) + 86400) % 86400;
            if (i != i10) {
                return w(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f5490d);
            }
        }
        return this;
    }

    public final i P(long j4) {
        if (j4 != 0) {
            long jS = S();
            long j10 = (((j4 % 86400000000000L) + jS) + 86400000000000L) % 86400000000000L;
            if (jS != j10) {
                return w((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5535b || aVar == j$.time.temporal.r.f5534a || aVar == j$.time.temporal.r.e || aVar == j$.time.temporal.r.f5537d) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f5539g) {
            return this;
        }
        if (aVar == j$.time.temporal.r.f5538f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int T() {
        return (this.f5488b * 60) + (this.f5487a * 3600) + this.f5489c;
    }

    public final long S() {
        return (((long) this.f5489c) * 1000000000) + (((long) this.f5488b) * 60000000000L) + (((long) this.f5487a) * 3600000000000L) + ((long) this.f5490d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        int iCompare = Integer.compare(this.f5487a, iVar.f5487a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f5488b, iVar.f5488b)) == 0 && (iCompare = Integer.compare(this.f5489c, iVar.f5489c)) == 0) ? Integer.compare(this.f5490d, iVar.f5490d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f5487a == iVar.f5487a && this.f5488b == iVar.f5488b && this.f5489c == iVar.f5489c && this.f5490d == iVar.f5490d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jS = S();
        return (int) (jS ^ (jS >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f5487a;
        byte b11 = this.f5488b;
        byte b12 = this.f5489c;
        int i = this.f5490d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i > 0) {
                sb2.append('.');
                if (i % 1000000 == 0) {
                    sb2.append(Integer.toString((i / 1000000) + zzbbs.zzq.zzf).substring(1));
                } else if (i % zzbbs.zzq.zzf == 0) {
                    sb2.append(Integer.toString((i / zzbbs.zzq.zzf) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void W(DataOutput dataOutput) {
        if (this.f5490d == 0) {
            if (this.f5489c == 0) {
                if (this.f5488b == 0) {
                    dataOutput.writeByte(~this.f5487a);
                    return;
                } else {
                    dataOutput.writeByte(this.f5487a);
                    dataOutput.writeByte(~this.f5488b);
                    return;
                }
            }
            dataOutput.writeByte(this.f5487a);
            dataOutput.writeByte(this.f5488b);
            dataOutput.writeByte(~this.f5489c);
            return;
        }
        dataOutput.writeByte(this.f5487a);
        dataOutput.writeByte(this.f5488b);
        dataOutput.writeByte(this.f5489c);
        dataOutput.writeInt(this.f5490d);
    }

    public static i R(DataInput dataInput) throws IOException {
        int i;
        int i10;
        int i11 = dataInput.readByte();
        int i12 = 0;
        if (i11 < 0) {
            i11 = ~i11;
            i10 = 0;
            i = 0;
        } else {
            byte b10 = dataInput.readByte();
            if (b10 < 0) {
                int i13 = ~b10;
                i = 0;
                i12 = i13;
                i10 = 0;
            } else {
                byte b11 = dataInput.readByte();
                if (b11 < 0) {
                    i10 = ~b11;
                    i = 0;
                    i12 = b10;
                } else {
                    i = dataInput.readInt();
                    i12 = b10;
                    i10 = b11;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.M(i11);
        j$.time.temporal.a.MINUTE_OF_HOUR.M(i12);
        j$.time.temporal.a.SECOND_OF_MINUTE.M(i10);
        j$.time.temporal.a.NANO_OF_SECOND.M(i);
        return w(i11, i12, i10, i);
    }
}
