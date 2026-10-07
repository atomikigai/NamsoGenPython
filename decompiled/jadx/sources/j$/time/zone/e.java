package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.k;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f5562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f5563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.c f5564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j$.time.i f5565d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f5566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZoneOffset f5567g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(k kVar, int i, j$.time.c cVar, j$.time.i iVar, boolean z4, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f5562a = kVar;
        this.f5563b = (byte) i;
        this.f5564c = cVar;
        this.f5565d = iVar;
        this.e = z4;
        this.f5566f = dVar;
        this.f5567g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b10;
        int iT = this.e ? 86400 : this.f5565d.T();
        int i = this.f5567g.f5371a;
        int i10 = this.h.f5371a - i;
        int i11 = this.i.f5371a - i;
        if (iT % 3600 == 0) {
            b10 = this.e ? (byte) 24 : this.f5565d.f5487a;
        } else {
            b10 = 31;
        }
        int i12 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i13 = (i10 == 0 || i10 == 1800 || i10 == 3600) ? i10 / 1800 : 3;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        j$.time.c cVar = this.f5564c;
        dataOutput.writeInt((this.f5562a.getValue() << 28) + ((this.f5563b + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (b10 << 14) + (this.f5566f.ordinal() << 12) + (i12 << 4) + (i13 << 2) + i14);
        if (b10 == 31) {
            dataOutput.writeInt(iT);
        }
        if (i12 == 255) {
            dataOutput.writeInt(i);
        }
        if (i13 == 3) {
            dataOutput.writeInt(this.h.f5371a);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.i.f5371a);
        }
    }

    public static e a(DataInput dataInput) {
        j$.time.i iVarW;
        int i;
        int i10;
        int i11 = dataInput.readInt();
        k kVarI = k.I(i11 >>> 28);
        int i12 = ((264241152 & i11) >>> 22) - 32;
        int i13 = (3670016 & i11) >>> 19;
        j$.time.c cVarU = i13 == 0 ? null : j$.time.c.u(i13);
        int i14 = (507904 & i11) >>> 14;
        d dVar = d.values()[(i11 & 12288) >>> 12];
        int i15 = (i11 & 4080) >>> 4;
        int i16 = (i11 & 12) >>> 2;
        int i17 = i11 & 3;
        if (i14 == 31) {
            long j4 = dataInput.readInt();
            j$.time.i iVar = j$.time.i.e;
            j$.time.temporal.a.SECOND_OF_DAY.M(j4);
            int i18 = (int) (j4 / 3600);
            long j10 = j4 - ((long) (i18 * 3600));
            int i19 = (int) (j10 / 60);
            iVarW = j$.time.i.w(i18, i19, (int) (j10 - ((long) (i19 * 60))), 0);
        } else {
            int i20 = i14 % 24;
            j$.time.i iVar2 = j$.time.i.e;
            j$.time.temporal.a.HOUR_OF_DAY.M(i20);
            iVarW = j$.time.i.h[i20];
        }
        ZoneOffset zoneOffsetN = ZoneOffset.N(i15 == 255 ? dataInput.readInt() : (i15 - 128) * 900);
        if (i16 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i16 * 1800) + zoneOffsetN.f5371a;
        }
        ZoneOffset zoneOffsetN2 = ZoneOffset.N(i);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetN.f5371a;
        }
        ZoneOffset zoneOffsetN3 = ZoneOffset.N(i10);
        boolean z4 = i14 == 24;
        Objects.requireNonNull(kVarI, "month");
        Objects.requireNonNull(iVarW, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i12 < -28 || i12 > 31 || i12 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z4 && !iVarW.equals(j$.time.i.f5486g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (iVarW.f5490d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(kVarI, i12, cVarU, iVarW, z4, dVar, zoneOffsetN, zoneOffsetN2, zoneOffsetN3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f5562a == eVar.f5562a && this.f5563b == eVar.f5563b && this.f5564c == eVar.f5564c && this.f5566f == eVar.f5566f && this.f5565d.equals(eVar.f5565d) && this.e == eVar.e && this.f5567g.equals(eVar.f5567g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iT = ((this.f5565d.T() + (this.e ? 1 : 0)) << 15) + (this.f5562a.ordinal() << 11) + ((this.f5563b + 32) << 5);
        j$.time.c cVar = this.f5564c;
        return ((this.f5567g.f5371a ^ (this.f5566f.ordinal() + (iT + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.h.f5371a) ^ this.i.f5371a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.i.f5371a - this.h.f5371a > 0 ? "Gap " : "Overlap ");
        sb2.append(this.h);
        sb2.append(" to ");
        sb2.append(this.i);
        sb2.append(", ");
        j$.time.c cVar = this.f5564c;
        if (cVar != null) {
            byte b10 = this.f5563b;
            if (b10 == -1) {
                sb2.append(cVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f5562a.name());
            } else if (b10 < 0) {
                sb2.append(cVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f5563b) - 1);
                sb2.append(" of ");
                sb2.append(this.f5562a.name());
            } else {
                sb2.append(cVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f5562a.name());
                sb2.append(' ');
                sb2.append((int) this.f5563b);
            }
        } else {
            sb2.append(this.f5562a.name());
            sb2.append(' ');
            sb2.append((int) this.f5563b);
        }
        sb2.append(" at ");
        sb2.append(this.e ? "24:00" : this.f5565d.toString());
        sb2.append(" ");
        sb2.append(this.f5566f);
        sb2.append(", standard offset ");
        sb2.append(this.f5567g);
        sb2.append(']');
        return sb2.toString();
    }
}
