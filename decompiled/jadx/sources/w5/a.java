package w5;

import e6.h2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f9635d;

    public a(int i, String str, String str2, a aVar) {
        this.f9632a = i;
        this.f9633b = str;
        this.f9634c = str2;
        this.f9635d = aVar;
    }

    public final h2 a() {
        h2 h2Var;
        a aVar = this.f9635d;
        if (aVar == null) {
            h2Var = null;
        } else {
            h2Var = new h2(aVar.f9632a, aVar.f9633b, aVar.f9634c, null, null);
        }
        return new h2(this.f9632a, this.f9633b, this.f9634c, h2Var, null);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f9632a);
        jSONObject.put("Message", this.f9633b);
        jSONObject.put("Domain", this.f9634c);
        a aVar = this.f9635d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", aVar.b());
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
