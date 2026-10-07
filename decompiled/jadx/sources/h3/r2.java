package h3;

import android.util.Log;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(String str, yb.d dVar, int i) {
        super(2, dVar);
        this.f4827a = i;
        this.f4829c = str;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4827a) {
            case 0:
                r2 r2Var = new r2(this.f4829c, dVar, 0);
                r2Var.f4828b = obj;
                return r2Var;
            default:
                r2 r2Var2 = new r2(this.f4829c, dVar, 1);
                r2Var2.f4828b = obj;
                return r2Var2;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        switch (this.f4827a) {
            case 0:
                r2 r2Var = (r2) create((d1.b) obj, (yb.d) obj2);
                ub.k kVar = ub.k.f9073a;
                r2Var.invokeSuspend(kVar);
                return kVar;
            default:
                return ((r2) create((rc.a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00af  */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM;
        int i = this.f4827a;
        String str = this.f4829c;
        switch (i) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                r7.g.G(obj);
                d1.b bVar = (d1.b) this.f4828b;
                d1.d dVar = p.f4798c;
                bVar.getClass();
                jc.i.e(dVar, "key");
                bVar.c(dVar, str);
                return ub.k.f9073a;
            default:
                zb.a aVar2 = zb.a.f11555a;
                r7.g.G(obj);
                JSONObject jSONObjectPut = new JSONObject().put("id_token", str).put("action", "get_balance");
                try {
                    bd.u uVar = new bd.u();
                    uVar.j("https://api.spacehowen.com/users-proxys/get_proxy.php");
                    uVar.f("X-Client-Key", "spacehowen-verify-2026");
                    String string = jSONObjectPut.toString();
                    jc.i.d(string, "toString(...)");
                    Pattern pattern = bd.q.f1632c;
                    uVar.h("POST", android.support.v4.media.session.a.d(string, r7.g.q("application/json")));
                    bd.v vVarA = uVar.a();
                    bd.s sVar = k3.o.f5963a;
                    sVar.getClass();
                    bd.x xVarC = new fd.i(sVar, vVarA).c();
                    try {
                        bd.z zVar = xVarC.f1701r;
                        if (zVar != null) {
                            JSONObject jSONObject = new JSONObject(zVar.o());
                            if (jSONObject.optBoolean("ok", false)) {
                                objM = new k3.k(jSONObject.optBoolean("has_account", false), jSONObject.optInt("mb_left", 0), jSONObject.optLong("quota_bytes", 0L), jSONObject.optLong("used_bytes", 0L), jSONObject.optLong("expires_at", 0L), jSONObject.optBoolean("stock_available", true));
                            } else {
                                objM = null;
                            }
                        } else {
                            objM = null;
                        }
                        xVarC.close();
                        break;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r7.g.h(xVarC, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    objM = r7.g.m(th3);
                }
                Throwable thA = ub.h.a(objM);
                if (thA == null) {
                    return objM;
                }
                Log.e("PremiumProxyApi", "Error al obtener saldo: " + thA.getMessage());
                return null;
        }
    }
}
