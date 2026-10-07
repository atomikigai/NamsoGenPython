package j$.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends v implements j$.time.temporal.n, j$.time.temporal.o, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient String f5372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentMap f5368c = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f5369d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = N(0);
    public static final ZoneOffset e = N(-64800);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f5370f = N(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f5371a - this.f5371a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    public static ZoneOffset K(String str) {
        int iO;
        int iO2;
        int iO3;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) f5369d).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iO = O(str, 1, false);
                    iO2 = O(str, 3, false);
                } else if (length == 6) {
                    iO = O(str, 1, false);
                    iO2 = O(str, 4, true);
                } else if (length == 7) {
                    iO = O(str, 1, false);
                    iO2 = O(str, 3, false);
                    iO3 = O(str, 5, false);
                } else if (length == 9) {
                    iO = O(str, 1, false);
                    iO2 = O(str, 4, true);
                    iO3 = O(str, 7, true);
                } else {
                    throw new a("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iO3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new a("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return M(-iO, -iO2, -iO3);
            }
            return M(iO, iO2, iO3);
        }
        iO = O(str, 1, false);
        iO2 = 0;
        iO3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return M(-iO, -iO2, -iO3);
        }
        return M(iO, iO2, iO3);
    }

    @Override // j$.time.v
    public final j$.time.zone.f u() {
        return new j$.time.zone.f(this);
    }

    public static int O(CharSequence charSequence, int i, boolean z4) {
        if (z4) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new a("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new a("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset M(int i, int i10, int i11) {
        if (i < -18 || i > 18) {
            throw new a("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i10 < 0 || i11 < 0) {
                throw new a("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i10 > 0 || i11 > 0) {
                throw new a("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i10 > 0 && i11 < 0) || (i10 < 0 && i11 > 0)) {
            throw new a("Zone offset minutes and seconds must have the same sign");
        }
        if (i10 < -59 || i10 > 59) {
            throw new a("Zone offset minutes not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (i11 < -59 || i11 > 59) {
            throw new a("Zone offset seconds not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i10 | i11) != 0) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        return N((i10 * 60) + (i * 3600) + i11);
    }

    public static ZoneOffset N(int i) {
        if (i < -64800 || i > 64800) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = f5368c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(numValueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(numValueOf);
            f5369d.putIfAbsent(zoneOffset2.f5372b, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i);
    }

    public ZoneOffset(int i) {
        String string;
        this.f5371a = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i10 = iAbs / 3600;
            int i11 = (iAbs / 60) % 60;
            sb2.append(i < 0 ? "-" : "+");
            sb2.append(i10 < 10 ? "0" : "");
            sb2.append(i10);
            sb2.append(i11 < 10 ? ":0" : ":");
            sb2.append(i11);
            int i12 = iAbs % 60;
            if (i12 != 0) {
                sb2.append(i12 < 10 ? ":0" : ":");
                sb2.append(i12);
            }
            string = sb2.toString();
        }
        this.f5372b = string;
    }

    @Override // j$.time.v
    public final String o() {
        return this.f5372b;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f5371a;
        }
        if (qVar == null) {
            return super.k(qVar).a(g(qVar), qVar);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f5371a;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return qVar.I(this);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.r.f5537d || aVar == j$.time.temporal.r.e) ? this : super.b(aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.f5371a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f5371a == ((ZoneOffset) obj).f5371a;
    }

    @Override // j$.time.v
    public final int hashCode() {
        return this.f5371a;
    }

    @Override // j$.time.v
    public final String toString() {
        return this.f5372b;
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.v
    public final void I(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        Q(dataOutput);
    }

    public final void Q(DataOutput dataOutput) {
        int i = this.f5371a;
        int i10 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static ZoneOffset P(DataInput dataInput) {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? N(dataInput.readInt()) : N(b10 * 900);
    }
}
