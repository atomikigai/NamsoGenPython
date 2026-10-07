package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f5419c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String o() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final b A(j$.time.temporal.n nVar) {
        if (nVar instanceof y) {
            return (y) nVar;
        }
        return new y(j$.time.f.C(nVar));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n x(int i) {
        return z.s(i);
    }

    public final j$.time.temporal.u w(j$.time.temporal.a aVar) {
        switch (v.f5418a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                z[] zVarArr = z.e;
                int i = zVarArr[zVarArr.length - 1].f5427b.f5434a;
                int iMin = 1000000000 - zVarArr[zVarArr.length - 1].f5427b.f5434a;
                int i10 = zVarArr[0].f5427b.f5434a;
                int i11 = 1;
                while (true) {
                    z[] zVarArr2 = z.e;
                    if (i11 >= zVarArr2.length) {
                        return j$.time.temporal.u.f(iMin, 999999999 - i);
                    }
                    z zVar = zVarArr2[i11];
                    iMin = Math.min(iMin, (zVar.f5427b.f5434a - i10) + 1);
                    i10 = zVar.f5427b.f5434a;
                    i11++;
                }
                break;
            case 6:
                z zVar2 = z.f5425d;
                long jMin = j$.time.temporal.a.DAY_OF_YEAR.f5516b.f5542c;
                for (z zVar3 : z.e) {
                    jMin = Math.min(jMin, ((zVar3.f5427b.N() ? 366 : 365) - zVar3.f5427b.M()) + 1);
                    if (zVar3.p() != null) {
                        jMin = Math.min(jMin, zVar3.p().f5427b.M() - 1);
                    }
                }
                return j$.time.temporal.u.f(jMin, j$.time.temporal.a.DAY_OF_YEAR.f5516b.f5543d);
            case 7:
                return j$.time.temporal.u.e(y.f5421d.f5434a, 999999999L);
            case 8:
                long j4 = z.f5425d.f5426a;
                z[] zVarArr3 = z.e;
                return j$.time.temporal.u.e(j4, zVarArr3[zVarArr3.length - 1].f5426a);
            default:
                return aVar.f5516b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
