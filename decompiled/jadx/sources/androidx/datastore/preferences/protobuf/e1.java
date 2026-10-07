package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e1 f626f = new e1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f630d = -1;
    public boolean e;

    public e1(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.f627a = i;
        this.f628b = iArr;
        this.f629c = objArr;
        this.e = z4;
    }

    public static e1 b() {
        return new e1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iY;
        int iA;
        int iU;
        int i = this.f630d;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f627a; i11++) {
            int i12 = this.f628b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f629c[i11]).getClass();
                    iU = j.u(i13);
                } else if (i14 == 2) {
                    iU = j.r(i13, (f) this.f629c[i11]);
                } else if (i14 == 3) {
                    iY = j.y(i13) * 2;
                    iA = ((e1) this.f629c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(x.b());
                    }
                    ((Integer) this.f629c[i11]).getClass();
                    iU = j.t(i13);
                }
                i10 = iU + i10;
            } else {
                long jLongValue = ((Long) this.f629c[i11]).longValue();
                iY = j.y(i13);
                iA = j.A(jLongValue);
            }
            i10 = iA + iY + i10;
        }
        this.f630d = i10;
        return i10;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.f627a;
        int[] iArr = this.f628b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f628b = Arrays.copyOf(iArr, i11);
            this.f629c = Arrays.copyOf(this.f629c, i11);
        }
        int[] iArr2 = this.f628b;
        int i12 = this.f627a;
        iArr2[i12] = i;
        this.f629c[i12] = obj;
        this.f627a = i12 + 1;
    }

    public final void d(f0 f0Var) {
        if (this.f627a == 0) {
            return;
        }
        f0Var.getClass();
        j jVar = (j) f0Var.f636a;
        for (int i = 0; i < this.f627a; i++) {
            int i10 = this.f628b[i];
            Object obj = this.f629c[i];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                jVar.U(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                jVar.K(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                f0Var.a(i11, (f) obj);
            } else if (i12 == 3) {
                jVar.R(i11, 3);
                ((e1) obj).d(f0Var);
                jVar.R(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(x.b());
                }
                jVar.I(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        int i = this.f627a;
        if (i == e1Var.f627a) {
            int[] iArr = this.f628b;
            int[] iArr2 = e1Var.f628b;
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.f629c;
            Object[] objArr2 = e1Var.f629c;
            int i11 = this.f627a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f627a;
        int i10 = (527 + i) * 31;
        int[] iArr = this.f628b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f629c;
        int i14 = this.f627a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
