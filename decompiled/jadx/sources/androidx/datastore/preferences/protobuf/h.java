package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f651d;

    public void A(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(gVar.m()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Long.valueOf(gVar.m()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public Object B(v0 v0Var, l lVar) throws x {
        g gVar = (g) this.f651d;
        int iA = gVar.A();
        if (gVar.f637a >= 100) {
            throw new x("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = gVar.e(iA);
        Object objI = v0Var.i();
        gVar.f637a++;
        v0Var.h(objI, this, lVar);
        v0Var.b(objI);
        gVar.a(0);
        gVar.f637a--;
        gVar.d(iE);
        return objI;
    }

    public Object C(v0 v0Var, l lVar) throws w {
        T(2);
        return B(v0Var, lVar);
    }

    public int D() throws w {
        T(5);
        return ((g) this.f651d).v();
    }

    public void E(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 2) {
            int iA = gVar.A();
            if ((iA & 3) != 0) {
                throw x.e();
            }
            int iB = gVar.b() + iA;
            do {
                list.add(Integer.valueOf(gVar.v()));
            } while (gVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw x.b();
        }
        do {
            list.add(Integer.valueOf(gVar.v()));
            if (gVar.c()) {
                return;
            } else {
                iZ = gVar.z();
            }
        } while (iZ == this.f648a);
        this.f650c = iZ;
    }

    public long F() throws w {
        T(1);
        return ((g) this.f651d).w();
    }

    public void G(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(gVar.w()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iA = gVar.A();
        if ((iA & 7) != 0) {
            throw x.e();
        }
        int iB = gVar.b() + iA;
        do {
            list.add(Long.valueOf(gVar.w()));
        } while (gVar.b() < iB);
    }

    public int H() throws w {
        T(0);
        return ((g) this.f651d).x();
    }

    public void I(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(gVar.x()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Integer.valueOf(gVar.x()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public long J() throws w {
        T(0);
        return ((g) this.f651d).y();
    }

    public void K(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(gVar.y()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Long.valueOf(gVar.y()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public String L() throws w {
        T(2);
        g gVar = (g) this.f651d;
        byte[] bArr = gVar.f640d;
        int iS = gVar.s();
        if (iS > 0) {
            int i = gVar.e;
            int i10 = gVar.f642g;
            if (iS <= i - i10) {
                String str = new String(bArr, i10, iS, v.f720a);
                gVar.f642g += iS;
                return str;
            }
        }
        if (iS == 0) {
            return "";
        }
        if (iS > gVar.e) {
            return new String(gVar.n(iS), v.f720a);
        }
        gVar.D(iS);
        String str2 = new String(bArr, gVar.f642g, iS, v.f720a);
        gVar.f642g += iS;
        return str2;
    }

    public void M(List list, boolean z4) throws w {
        int iZ;
        int iZ2;
        g gVar = (g) this.f651d;
        if ((this.f648a & 7) != 2) {
            throw x.b();
        }
        if (!(list instanceof a0) || z4) {
            do {
                list.add(z4 ? N() : L());
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        a0 a0Var = (a0) list;
        do {
            a0Var.b(h());
            if (gVar.c()) {
                return;
            } else {
                iZ2 = gVar.z();
            }
        } while (iZ2 == this.f648a);
        this.f650c = iZ2;
    }

    public String N() throws w {
        T(2);
        g gVar = (g) this.f651d;
        byte[] bArrN = gVar.f640d;
        int iS = gVar.s();
        int i = gVar.f642g;
        int i10 = gVar.e;
        if (iS <= i10 - i && iS > 0) {
            gVar.f642g = i + iS;
        } else {
            if (iS == 0) {
                return "";
            }
            i = 0;
            if (iS <= i10) {
                gVar.D(iS);
                gVar.f642g = iS;
            } else {
                bArrN = gVar.n(iS);
            }
        }
        return q1.f706a.e(i, bArrN, iS);
    }

    public int O() throws w {
        T(0);
        return ((g) this.f651d).A();
    }

    public void P(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(gVar.A()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Integer.valueOf(gVar.A()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public long Q() throws w {
        T(0);
        return ((g) this.f651d).B();
    }

    public void R(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(gVar.B()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Long.valueOf(gVar.B()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public void S(int i) throws x {
        if (((g) this.f651d).b() != i) {
            throw x.f();
        }
    }

    public void T(int i) throws w {
        if ((this.f648a & 7) != i) {
            throw x.b();
        }
    }

    public boolean U() {
        int i;
        g gVar = (g) this.f651d;
        if (gVar.c() || (i = this.f648a) == this.f649b) {
            return false;
        }
        return gVar.E(i);
    }

    public void a(a2.i iVar) {
        Object[] objArr = (Object[]) this.f651d;
        int i = this.f649b;
        objArr[i] = iVar;
        int i10 = this.f650c & (i + 1);
        this.f649b = i10;
        int i11 = this.f648a;
        if (i10 == i11) {
            int length = objArr.length;
            int i12 = length - i11;
            int i13 = length << 1;
            if (i13 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i13];
            vb.h.K(objArr, 0, objArr2, i11, length);
            vb.h.K((Object[]) this.f651d, i12, objArr2, 0, this.f648a);
            this.f651d = objArr2;
            this.f648a = 0;
            this.f649b = length;
            this.f650c = i13 - 1;
        }
    }

    public void b(int i, int i10) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f650c;
        int i12 = i11 * 2;
        int[] iArr = (int[]) this.f651d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f651d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f651d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f651d;
        iArr4[i12] = i;
        iArr4[i12 + 1] = i10;
        this.f650c++;
    }

    public void c(RecyclerView recyclerView, boolean z4) {
        this.f650c = 0;
        int[] iArr = (int[]) this.f651d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        x1.h0 h0Var = recyclerView.f1166y;
        if (recyclerView.f1164x == null || h0Var == null || !h0Var.i) {
            return;
        }
        if (z4) {
            if (!recyclerView.e.k()) {
                h0Var.i(recyclerView.f1164x.a(), this);
            }
        } else if (!recyclerView.O()) {
            h0Var.h(this.f648a, this.f649b, recyclerView.f1155s0, this);
        }
        int i = this.f650c;
        if (i > h0Var.f10088j) {
            h0Var.f10088j = i;
            h0Var.f10089k = z4;
            recyclerView.f1135c.m();
        }
    }

    public int d() {
        int i = this.f650c;
        if (i != 0) {
            this.f648a = i;
            this.f650c = 0;
        } else {
            this.f648a = ((g) this.f651d).z();
        }
        int i10 = this.f648a;
        return (i10 == 0 || i10 == this.f649b) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i10 >>> 3;
    }

    public int e() {
        return this.f648a;
    }

    public boolean f() throws w {
        T(0);
        return ((g) this.f651d).f();
    }

    public void g(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(gVar.f()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Boolean.valueOf(gVar.f()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public f h() throws w {
        T(2);
        g gVar = (g) this.f651d;
        byte[] bArr = gVar.f640d;
        int iS = gVar.s();
        int i = gVar.e;
        int i10 = gVar.f642g;
        if (iS <= i - i10 && iS > 0) {
            f fVarD = f.d(i10, bArr, iS);
            gVar.f642g += iS;
            return fVarD;
        }
        if (iS == 0) {
            return f.f631c;
        }
        byte[] bArrO = gVar.o(iS);
        if (bArrO != null) {
            return f.d(0, bArrO, bArrO.length);
        }
        int i11 = gVar.f642g;
        int i12 = gVar.e;
        int length = i12 - i11;
        gVar.i += i12;
        gVar.f642g = 0;
        gVar.e = 0;
        ArrayList arrayListP = gVar.p(iS - length);
        byte[] bArr2 = new byte[iS];
        System.arraycopy(bArr, i11, bArr2, 0, length);
        int size = arrayListP.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListP.get(i13);
            i13++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        f fVar = f.f631c;
        return new f(bArr2);
    }

    public void i(List list) throws w {
        int iZ;
        g gVar = (g) this.f651d;
        if ((this.f648a & 7) != 2) {
            throw x.b();
        }
        do {
            list.add(h());
            if (gVar.c()) {
                return;
            } else {
                iZ = gVar.z();
            }
        } while (iZ == this.f648a);
        this.f650c = iZ;
    }

    public double j() throws w {
        T(1);
        return ((g) this.f651d).g();
    }

    public void k(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(gVar.g()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iA = gVar.A();
        if ((iA & 7) != 0) {
            throw x.e();
        }
        int iB = gVar.b() + iA;
        do {
            list.add(Double.valueOf(gVar.g()));
        } while (gVar.b() < iB);
    }

    public int l() throws w {
        T(0);
        return ((g) this.f651d).h();
    }

    public void m(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(gVar.h()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Integer.valueOf(gVar.h()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public Object n(v1 v1Var, Class cls, l lVar) throws w {
        switch (v1Var.ordinal()) {
            case 0:
                return Double.valueOf(j());
            case 1:
                return Float.valueOf(s());
            case 2:
                return Long.valueOf(z());
            case 3:
                return Long.valueOf(Q());
            case 4:
                return Integer.valueOf(x());
            case 5:
                return Long.valueOf(q());
            case 6:
                return Integer.valueOf(o());
            case 7:
                return Boolean.valueOf(f());
            case 8:
                return N();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                T(2);
                return B(s0.f710c.a(cls), lVar);
            case 11:
                return h();
            case 12:
                return Integer.valueOf(O());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Integer.valueOf(D());
            case 15:
                return Long.valueOf(F());
            case 16:
                return Integer.valueOf(H());
            case 17:
                return Long.valueOf(J());
        }
    }

    public int o() throws w {
        T(5);
        return ((g) this.f651d).i();
    }

    public void p(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 2) {
            int iA = gVar.A();
            if ((iA & 3) != 0) {
                throw x.e();
            }
            int iB = gVar.b() + iA;
            do {
                list.add(Integer.valueOf(gVar.i()));
            } while (gVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw x.b();
        }
        do {
            list.add(Integer.valueOf(gVar.i()));
            if (gVar.c()) {
                return;
            } else {
                iZ = gVar.z();
            }
        } while (iZ == this.f648a);
        this.f650c = iZ;
    }

    public long q() throws w {
        T(1);
        return ((g) this.f651d).j();
    }

    public void r(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(gVar.j()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iA = gVar.A();
        if ((iA & 7) != 0) {
            throw x.e();
        }
        int iB = gVar.b() + iA;
        do {
            list.add(Long.valueOf(gVar.j()));
        } while (gVar.b() < iB);
    }

    public float s() throws w {
        T(5);
        return ((g) this.f651d).k();
    }

    public void t(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 2) {
            int iA = gVar.A();
            if ((iA & 3) != 0) {
                throw x.e();
            }
            int iB = gVar.b() + iA;
            do {
                list.add(Float.valueOf(gVar.k()));
            } while (gVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw x.b();
        }
        do {
            list.add(Float.valueOf(gVar.k()));
            if (gVar.c()) {
                return;
            } else {
                iZ = gVar.z();
            }
        } while (iZ == this.f648a);
        this.f650c = iZ;
    }

    public Object u(v0 v0Var, l lVar) {
        int i = this.f649b;
        this.f649b = ((this.f648a >>> 3) << 3) | 4;
        try {
            Object objI = v0Var.i();
            v0Var.h(objI, this, lVar);
            v0Var.b(objI);
            if (this.f648a != this.f649b) {
                throw x.e();
            }
            this.f649b = i;
            return objI;
        } catch (Throwable th) {
            this.f649b = i;
            throw th;
        }
    }

    public Object v(v0 v0Var, l lVar) throws w {
        T(3);
        return u(v0Var, lVar);
    }

    public void w(List list, v0 v0Var, l lVar) throws w {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a;
        if ((i & 7) != 3) {
            throw x.b();
        }
        do {
            list.add(u(v0Var, lVar));
            if (gVar.c() || this.f650c != 0) {
                return;
            } else {
                iZ = gVar.z();
            }
        } while (iZ == i);
        this.f650c = iZ;
    }

    public int x() throws w {
        T(0);
        return ((g) this.f651d).l();
    }

    public void y(List list) throws x {
        int iZ;
        g gVar = (g) this.f651d;
        int i = this.f648a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(gVar.l()));
                if (gVar.c()) {
                    return;
                } else {
                    iZ = gVar.z();
                }
            } while (iZ == this.f648a);
            this.f650c = iZ;
            return;
        }
        if (i != 2) {
            throw x.b();
        }
        int iB = gVar.b() + gVar.A();
        do {
            list.add(Integer.valueOf(gVar.l()));
        } while (gVar.b() < iB);
        S(iB);
    }

    public long z() throws w {
        T(0);
        return ((g) this.f651d).m();
    }
}
