package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f709c = false;

    public r(t tVar) {
        this.f707a = tVar;
        this.f708b = (t) tVar.d(4);
    }

    public static void d(t tVar, t tVar2) {
        s0 s0Var = s0.f710c;
        s0Var.getClass();
        s0Var.a(tVar.getClass()).e(tVar, tVar2);
    }

    public final t a() {
        t tVarB = b();
        if (tVarB.g()) {
            return tVarB;
        }
        throw new d1();
    }

    public final t b() {
        if (this.f709c) {
            return this.f708b;
        }
        t tVar = this.f708b;
        tVar.getClass();
        s0 s0Var = s0.f710c;
        s0Var.getClass();
        s0Var.a(tVar.getClass()).b(tVar);
        this.f709c = true;
        return this.f708b;
    }

    public final void c() {
        if (this.f709c) {
            t tVar = (t) this.f708b.d(4);
            d(tVar, this.f708b);
            this.f708b = tVar;
            this.f709c = false;
        }
    }

    public final Object clone() {
        r rVar = (r) this.f707a.d(5);
        t tVarB = b();
        rVar.c();
        d(rVar.f708b, tVarB);
        return rVar;
    }
}
