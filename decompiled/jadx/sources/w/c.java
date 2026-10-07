package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f9362d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9363f;
    public u.f i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f9359a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9364g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.f9362d = dVar;
        this.e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i10, boolean z4) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z4 && !i(cVar)) {
            return false;
        }
        this.f9363f = cVar;
        if (cVar.f9359a == null) {
            cVar.f9359a = new HashSet();
        }
        HashSet hashSet = this.f9363f.f9359a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f9364g = i;
        this.h = i10;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f9359a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x.h.b(((c) it.next()).f9362d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f9361c) {
            return this.f9360b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f9362d.f9377g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f9363f) == null || cVar.f9362d.f9377g0 != 8) ? this.f9364g : i;
    }

    public final c f() {
        int i = this.e;
        int iD = u.e.d(i);
        d dVar = this.f9362d;
        switch (iD) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(u3.b.f(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f9359a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f9363f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.f9362d;
            int i = cVar.e;
            int i10 = this.e;
            if (i != i10) {
                switch (u.e.d(i10)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z4 = i == 2 || i == 4;
                        if (!(dVar instanceof h)) {
                            return z4;
                        }
                        if (z4 || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z10 = i == 3 || i == 5;
                        if (!(dVar instanceof h)) {
                            return z10;
                        }
                        if (z10 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(u3.b.f(i10));
                }
            } else if (i10 != 6 || (dVar.E && this.f9362d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f9363f;
        if (cVar != null && (hashSet = cVar.f9359a) != null) {
            hashSet.remove(this);
            if (this.f9363f.f9359a.size() == 0) {
                this.f9363f.f9359a = null;
            }
        }
        this.f9359a = null;
        this.f9363f = null;
        this.f9364g = 0;
        this.h = Integer.MIN_VALUE;
        this.f9361c = false;
        this.f9360b = 0;
    }

    public final void k() {
        u.f fVar = this.i;
        if (fVar == null) {
            this.i = new u.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i) {
        this.f9360b = i;
        this.f9361c = true;
    }

    public final String toString() {
        return this.f9362d.f9378h0 + ":" + u3.b.f(this.e);
    }
}
