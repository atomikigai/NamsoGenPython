package tc;

import rc.y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8710v;

    public m(int i, int i10) {
        super(i);
        this.f8710v = i10;
        if (i10 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(q1.a.j(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + jc.r.a(b.class).c() + " instead").toString());
        }
    }

    public final Object D(Object obj, boolean z4) {
        ub.k kVar = ub.k.f9073a;
        if (this.f8710v == 3) {
            Object objA = super.a(obj);
            return (!(objA instanceof h) || (objA instanceof g)) ? objA : kVar;
        }
        i6.f fVar = d.f8691d;
        j jVar = (j) b.f8681f.get(this);
        while (true) {
            long andIncrement = b.f8678b.getAndIncrement(this);
            long j4 = 1152921504606846975L & andIncrement;
            boolean zS = s(andIncrement, false);
            int i = d.f8689b;
            long j10 = i;
            long j11 = j4 / j10;
            int i10 = (int) (j4 % j10);
            if (jVar.f9954c != j11) {
                j jVarB = b.b(this, j11, jVar);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zS) {
                    return new g(p());
                }
            }
            int iE = b.e(this, jVar, i10, obj, j4, fVar, zS);
            if (iE == 0) {
                jVar.a();
                return kVar;
            }
            if (iE != 1) {
                if (iE != 2) {
                    if (iE == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iE == 4) {
                        if (j4 < b.f8679c.get(this)) {
                            jVar.a();
                        }
                        return new g(p());
                    }
                    if (iE == 5) {
                        jVar.a();
                    }
                } else {
                    if (zS) {
                        jVar.h();
                        return new g(p());
                    }
                    y1 y1Var = fVar instanceof y1 ? (y1) fVar : null;
                    if (y1Var != null) {
                        y1Var.a(jVar, i10 + i);
                    }
                    k((jVar.f9954c * j10) + ((long) i10));
                }
            }
            return kVar;
        }
    }

    @Override // tc.b, tc.q
    public final Object a(Object obj) {
        return D(obj, false);
    }

    @Override // tc.b, tc.q
    public final Object h(Object obj, yb.d dVar) throws Throwable {
        if (D(obj, true) instanceof g) {
            throw p();
        }
        return ub.k.f9073a;
    }

    @Override // tc.b
    public final boolean t() {
        return this.f8710v == 2;
    }
}
