package w5;

import e6.h2;
import e6.t3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3 f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9663b;

    public i(t3 t3Var) {
        this.f9662a = t3Var;
        h2 h2Var = t3Var.f3449c;
        this.f9663b = h2Var == null ? null : h2Var.g();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        t3 t3Var = this.f9662a;
        jSONObject.put("Adapter", t3Var.f3447a);
        jSONObject.put("Latency", t3Var.f3448b);
        String str = t3Var.e;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = t3Var.f3451f;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = t3Var.f3452r;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = t3Var.f3453s;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : t3Var.f3450d.keySet()) {
            jSONObject2.put(str5, t3Var.f3450d.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f9663b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", aVar.b());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
