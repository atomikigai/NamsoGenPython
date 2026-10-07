package w5;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a {
    public final t e;

    public l(int i, String str, String str2, a aVar, t tVar) {
        super(i, str, str2, aVar);
        this.e = tVar;
    }

    @Override // w5.a
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = super.b();
        t tVar = this.e;
        if (tVar == null) {
            jSONObjectB.put("Response Info", "null");
            return jSONObjectB;
        }
        jSONObjectB.put("Response Info", tVar.a());
        return jSONObjectB;
    }

    @Override // w5.a
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
