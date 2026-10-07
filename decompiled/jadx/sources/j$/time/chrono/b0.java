package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f5378c = new b0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String o() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n x(int i) {
        if (i == 0) {
            return e0.BEFORE_ROC;
        }
        if (i == 1) {
            return e0.ROC;
        }
        throw new j$.time.a("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final b A(j$.time.temporal.n nVar) {
        if (nVar instanceof d0) {
            return (d0) nVar;
        }
        return new d0(j$.time.f.C(nVar));
    }

    public final j$.time.temporal.u w(j$.time.temporal.a aVar) {
        int i = a0.f5377a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.f5516b;
            return j$.time.temporal.u.e(uVar.f5540a - 22932, uVar.f5543d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.f5516b;
            return j$.time.temporal.u.f(uVar2.f5543d - 1911, (-uVar2.f5540a) + 1912);
        }
        if (i != 3) {
            return aVar.f5516b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.f5516b;
        return j$.time.temporal.u.e(uVar3.f5540a - 1911, uVar3.f5543d - 1911);
    }

    private b0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
