package j$.time.zone;

import com.google.android.gms.internal.ads.zzbbs;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.temporal.o;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e[] f5568j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f5569k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f5570l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f5571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f5572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f5573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f5574d;
    public final ZoneOffset[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f5575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeZone f5576g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f5557b;
        if (bVar.u()) {
            if (localDateTime.C(localDateTime2)) {
                return bVar.f5558c;
            }
            if (!localDateTime.C(bVar.f5557b.N(bVar.f5559d.f5371a - bVar.f5558c.f5371a))) {
                return bVar.f5559d;
            }
        } else {
            if (!localDateTime.C(localDateTime2)) {
                return bVar.f5559d;
            }
            if (localDateTime.C(bVar.f5557b.N(bVar.f5559d.f5371a - bVar.f5558c.f5371a))) {
                return bVar.f5558c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f5571a = jArr;
        this.f5572b = zoneOffsetArr;
        this.f5573c = jArr2;
        this.e = zoneOffsetArr2;
        this.f5575f = eVarArr;
        if (jArr2.length == 0) {
            this.f5574d = f5569k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.u()) {
                    arrayList.add(bVar.f5557b);
                    arrayList.add(bVar.f5557b.N(bVar.f5559d.f5371a - bVar.f5558c.f5371a));
                } else {
                    arrayList.add(bVar.f5557b.N(bVar.f5559d.f5371a - bVar.f5558c.f5371a));
                    arrayList.add(bVar.f5557b);
                }
                i10 = i11;
            }
            this.f5574d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f5576g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f5572b = zoneOffsetArr;
        long[] jArr = i;
        this.f5571a = jArr;
        this.f5573c = jArr;
        this.f5574d = f5569k;
        this.e = zoneOffsetArr;
        this.f5575f = f5568j;
        this.f5576g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.f5572b = zoneOffsetArr;
        long[] jArr = i;
        this.f5571a = jArr;
        this.f5573c = jArr;
        this.f5574d = f5569k;
        this.e = zoneOffsetArr;
        this.f5575f = f5568j;
        this.f5576g = timeZone;
    }

    public static ZoneOffset g(int i10) {
        return ZoneOffset.N(i10 / zzbbs.zzq.zzf);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f5576g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j4, ZoneOffset zoneOffset) {
        return j$.time.f.Q(Math.floorDiv(j4 + ((long) zoneOffset.f5371a), 86400)).f5434a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f5576g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f5573c;
        if (jArr.length == 0) {
            return this.f5572b[0];
        }
        long j4 = instant.f5359a;
        if (this.f5575f.length > 0 && j4 > jArr[jArr.length - 1]) {
            ZoneOffset[] zoneOffsetArr = this.e;
            b[] bVarArrB = b(c(j4, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i10 = 0; i10 < bVarArrB.length; i10++) {
                bVar = bVarArrB[i10];
                if (j4 < bVar.f5556a) {
                    return bVar.f5558c;
                }
            }
            return bVar.f5559d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, j4);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        if (bVar.u()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.f5558c, bVar.f5559d};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.u(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f5364b.S() <= r0.f5364b.S()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b[] b(int i10) {
        j$.time.f fVarW;
        b[] bVarArr = f5570l;
        Integer numValueOf = Integer.valueOf(i10);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j4 = 1;
        final int i11 = 0;
        final int i12 = 1;
        if (this.f5576g != null) {
            if (i10 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f5361c;
            j$.time.f fVarP = j$.time.f.P(i10 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.M(0);
            long jT = new LocalDateTime(fVarP, j$.time.i.h[0]).t(this.f5572b[0]);
            long j10 = 1000;
            int offset = this.f5576g.getOffset(jT * 1000);
            long j11 = 31968000 + jT;
            while (jT < j11) {
                long j12 = jT + 7776000;
                long j13 = j10;
                if (offset != this.f5576g.getOffset(j12 * j13)) {
                    while (j12 - jT > j4) {
                        long jFloorDiv = Math.floorDiv(j12 + jT, 2L);
                        if (this.f5576g.getOffset(jFloorDiv * j13) == offset) {
                            jT = jFloorDiv;
                        } else {
                            j12 = jFloorDiv;
                        }
                        j4 = 1;
                    }
                    if (this.f5576g.getOffset(jT * j13) == offset) {
                        jT = j12;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.f5576g.getOffset(jT * j13);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(jT, zoneOffsetG2) == i10) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jT, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    jT = j12;
                }
                j10 = j13;
                j4 = 1;
            }
            if (1916 <= i10 && i10 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f5575f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i13 = 0;
        while (i13 < eVarArr.length) {
            e eVar = eVarArr[i13];
            byte b10 = eVar.f5563b;
            if (b10 < 0) {
                k kVar = eVar.f5562a;
                long j14 = i10;
                t.f5416c.getClass();
                int iW = kVar.w(t.w(j14)) + 1 + eVar.f5563b;
                j$.time.f fVar = j$.time.f.f5433d;
                j$.time.temporal.a.YEAR.M(j14);
                j$.time.temporal.a.DAY_OF_MONTH.M(iW);
                fVarW = j$.time.f.w(i10, kVar.getValue(), iW);
                j$.time.c cVar = eVar.f5564c;
                if (cVar != null) {
                    final int value = cVar.getValue();
                    fVarW = fVarW.j(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m c(m mVar) {
                            switch (i12) {
                                case 0:
                                    int iE = mVar.e(a.DAY_OF_WEEK);
                                    int i14 = value;
                                    if (iE == i14) {
                                        return mVar;
                                    }
                                    int i15 = iE - i14;
                                    return mVar.l(i15 >= 0 ? 7 - i15 : -i15, b.DAYS);
                                default:
                                    int iE2 = mVar.e(a.DAY_OF_WEEK);
                                    int i16 = value;
                                    if (iE2 == i16) {
                                        return mVar;
                                    }
                                    int i17 = i16 - iE2;
                                    return mVar.a(i17 >= 0 ? 7 - i17 : -i17, b.DAYS);
                            }
                        }
                    });
                }
            } else {
                k kVar2 = eVar.f5562a;
                j$.time.f fVar2 = j$.time.f.f5433d;
                j$.time.temporal.a.YEAR.M(i10);
                j$.time.temporal.a.DAY_OF_MONTH.M(b10);
                fVarW = j$.time.f.w(i10, kVar2.getValue(), b10);
                j$.time.c cVar2 = eVar.f5564c;
                if (cVar2 != null) {
                    final int value2 = cVar2.getValue();
                    fVarW = fVarW.j(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m c(m mVar) {
                            switch (i11) {
                                case 0:
                                    int iE = mVar.e(a.DAY_OF_WEEK);
                                    int i14 = value2;
                                    if (iE == i14) {
                                        return mVar;
                                    }
                                    int i15 = iE - i14;
                                    return mVar.l(i15 >= 0 ? 7 - i15 : -i15, b.DAYS);
                                default:
                                    int iE2 = mVar.e(a.DAY_OF_WEEK);
                                    int i16 = value2;
                                    if (iE2 == i16) {
                                        return mVar;
                                    }
                                    int i17 = i16 - iE2;
                                    return mVar.a(i17 >= 0 ? 7 - i17 : -i17, b.DAYS);
                            }
                        }
                    });
                }
            }
            if (eVar.e) {
                fVarW = fVarW.S(1L);
            }
            LocalDateTime localDateTimeI = LocalDateTime.I(fVarW, eVar.f5565d);
            d dVar = eVar.f5566f;
            ZoneOffset zoneOffset = eVar.f5567g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i14 = c.f5560a[dVar.ordinal()];
            if (i14 == 1) {
                localDateTimeI = localDateTimeI.N(zoneOffset2.f5371a - ZoneOffset.UTC.f5371a);
            } else if (i14 == 2) {
                localDateTimeI = localDateTimeI.N(zoneOffset2.f5371a - zoneOffset.f5371a);
            }
            bVarArr3[i13] = new b(localDateTimeI, eVar.h, eVar.i);
            i13++;
            i11 = 0;
        }
        if (i10 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f5576g, fVar.f5576g) && Arrays.equals(this.f5571a, fVar.f5571a) && Arrays.equals(this.f5572b, fVar.f5572b) && Arrays.equals(this.f5573c, fVar.f5573c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f5575f, fVar.f5575f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f5576g) ^ Arrays.hashCode(this.f5571a)) ^ Arrays.hashCode(this.f5572b)) ^ Arrays.hashCode(this.f5573c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f5575f);
    }

    public final String toString() {
        TimeZone timeZone = this.f5576g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f5572b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
