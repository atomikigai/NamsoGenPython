package h3;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements q3.m, q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f4822a;

    public /* synthetic */ r0(q0 q0Var) {
        this.f4822a = q0Var;
    }

    @Override // q3.l
    public void c(q3.n nVar) {
        this.f4822a.invoke(null);
    }

    @Override // q3.m
    public void e(Object obj) {
        q0 q0Var = this.f4822a;
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jc.i.b(jSONObject);
            q0Var.invoke(e1.s0(jSONObject));
        } catch (Exception unused) {
            q0Var.invoke(null);
        }
    }

    public /* synthetic */ r0(e1 e1Var, q0 q0Var) {
        this.f4822a = q0Var;
    }
}
