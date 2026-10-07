package o3;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7517d;

    public p(String str) {
        this.f7514a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7515b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f7516c = strOptString;
        this.f7517d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.f7514a, ((p) obj).f7514a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7514a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f7515b);
        sb2.append("', productType='");
        sb2.append(this.f7516c);
        sb2.append("', statusCode=");
        return u3.b.c(sb2, this.f7517d, "}");
    }
}
