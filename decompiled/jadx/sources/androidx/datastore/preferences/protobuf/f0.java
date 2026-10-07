package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f635b = new q(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f636a;

    public f0(j jVar) {
        v.a(jVar, "output");
        this.f636a = jVar;
        jVar.f657c = this;
    }

    public void a(int i, f fVar) {
        ((j) this.f636a).G(i, fVar);
    }

    public void b(int i, Object obj, v0 v0Var) {
        j jVar = (j) this.f636a;
        jVar.R(i, 3);
        v0Var.a((a) obj, jVar.f657c);
        jVar.R(i, 4);
    }

    public f0() {
        l0 l0Var;
        try {
            l0Var = (l0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            l0Var = f635b;
        }
        l0[] l0VarArr = {q.f702b, l0Var};
        e0 e0Var = new e0();
        e0Var.f625a = l0VarArr;
        Charset charset = v.f720a;
        this.f636a = e0Var;
    }
}
