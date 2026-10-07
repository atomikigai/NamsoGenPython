package o3;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7509d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7511g;
    public final ArrayList h;
    public final ArrayList i;

    public k(String str) {
        this.f7506a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7507b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f7508c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f7509d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f7510f = jSONObject.optString("skuDetailsToken");
        this.f7511g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new j(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.h = arrayList;
        } else {
            this.h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f7507b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f7507b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                arrayList2.add(new h(jSONArrayOptJSONArray2.getJSONObject(i10)));
            }
            this.i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.i = null;
        } else {
            arrayList2.add(new h(jSONObjectOptJSONObject));
            this.i = arrayList2;
        }
    }

    public final h a() {
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (h) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return TextUtils.equals(this.f7506a, ((k) obj).f7506a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7506a.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f7506a + "', parsedJson=" + this.f7507b.toString() + ", productId='" + this.f7508c + "', productType='" + this.f7509d + "', title='" + this.e + "', productDetailsToken='" + this.f7510f + "', subscriptionOfferDetails=" + String.valueOf(this.h) + "}";
    }
}
