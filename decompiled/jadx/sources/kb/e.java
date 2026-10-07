package kb;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Date f6155g = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f6156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f6157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f6158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f6159d;
    public final JSONObject e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6160f;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j4) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j4);
        this.f6157b = jSONObject;
        this.f6158c = date;
        this.f6159d = jSONArray;
        this.e = jSONObject2;
        this.f6160f = j4;
        this.f6156a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public static d b() {
        d dVar = new d();
        dVar.f6152b = new JSONObject();
        dVar.f6154d = f6155g;
        dVar.e = new JSONArray();
        dVar.f6153c = new JSONObject();
        dVar.f6151a = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f6156a.toString().equals(((e) obj).f6156a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f6156a.hashCode();
    }

    public final String toString() {
        return this.f6156a.toString();
    }
}
