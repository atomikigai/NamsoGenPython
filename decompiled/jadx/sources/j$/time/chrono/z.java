package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f5425d;
    public static final z[] e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f5426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.f f5427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f5428c;

    static {
        z zVar = new z(-1, j$.time.f.P(1868, 1, 1), "Meiji");
        f5425d = zVar;
        e = new z[]{zVar, new z(0, j$.time.f.P(1912, 7, 30), "Taisho"), new z(1, j$.time.f.P(1926, 12, 25), "Showa"), new z(2, j$.time.f.P(1989, 1, 8), "Heisei"), new z(3, j$.time.f.P(2019, 5, 1), "Reiwa")};
    }

    public final z p() {
        z[] zVarArr = e;
        if (this == zVarArr[zVarArr.length - 1]) {
            return null;
        }
        return s(this.f5426a + 1);
    }

    public z(int i, j$.time.f fVar, String str) {
        this.f5426a = i;
        this.f5427b = fVar;
        this.f5428c = str;
    }

    public static z s(int i) {
        int i10 = i + 1;
        if (i10 >= 0) {
            z[] zVarArr = e;
            if (i10 < zVarArr.length) {
                return zVarArr[i10];
            }
        }
        throw new j$.time.a("Invalid era: " + i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static z o(j$.time.f fVar) {
        boolean z4;
        j$.time.f fVar2 = y.f5421d;
        if (fVar2 != null) {
            fVar.getClass();
            if (fVar.u(fVar2) < 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else if (fVar.E() < fVar2.E()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            throw new j$.time.a("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = e.length - 1; length >= 0; length--) {
            z zVar = e[length];
            if (fVar.compareTo(zVar.f5427b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f5426a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar == aVar) {
            return w.f5419c.w(aVar);
        }
        return super.k(qVar);
    }

    public final String toString() {
        return this.f5428c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 5, this);
    }
}
