package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f696c;

    public o0(f1 f1Var, m mVar, a aVar) {
        this.f695b = f1Var;
        mVar.getClass();
        this.f696c = mVar;
        this.f694a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void a(Object obj, f0 f0Var) {
        this.f696c.getClass();
        q1.a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void b(Object obj) {
        this.f695b.getClass();
        ((t) obj).unknownFields.e = false;
        this.f696c.getClass();
        q1.a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int c(a aVar) {
        this.f695b.getClass();
        e1 e1Var = ((t) aVar).unknownFields;
        int i = e1Var.f630d;
        if (i != -1) {
            return i;
        }
        int iR = 0;
        for (int i10 = 0; i10 < e1Var.f627a; i10++) {
            int i11 = e1Var.f628b[i10] >>> 3;
            iR += j.r(3, (f) e1Var.f629c[i10]) + j.z(i11) + j.y(2) + (j.y(1) * 2);
        }
        e1Var.f630d = iR;
        return iR;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean d(Object obj) {
        this.f696c.getClass();
        q1.a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void e(t tVar, t tVar2) {
        w0.w(this.f695b, tVar, tVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int f(t tVar) {
        this.f695b.getClass();
        return tVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean g(t tVar, t tVar2) {
        this.f695b.getClass();
        return tVar.unknownFields.equals(tVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void h(Object obj, h hVar, l lVar) {
        this.f695b.getClass();
        t tVar = (t) obj;
        if (tVar.unknownFields == e1.f626f) {
            tVar.unknownFields = e1.b();
        }
        this.f696c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final Object i() {
        return ((r) ((t) this.f694a).d(5)).b();
    }
}
