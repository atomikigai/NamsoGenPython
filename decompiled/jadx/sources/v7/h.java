package v7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.i0;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import u7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends h7.a {
    public static final Parcelable.Creator<h> CREATOR = new v0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f9203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9205c;

    public h(d dVar, String str, String str2) {
        i0.i(dVar);
        this.f9203a = dVar;
        this.f9205c = str;
        this.f9204b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = hVar.f9204b;
        String str2 = hVar.f9205c;
        String str3 = this.f9205c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (!this.f9203a.equals(hVar.f9203a)) {
            return false;
        }
        String str4 = this.f9204b;
        if (str4 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str4.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f9205c;
        int iHashCode = this.f9203a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f9204b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        d dVar = this.f9203a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(dVar.f9193b, 11));
            f fVar = dVar.f9194c;
            if (fVar != f.UNKNOWN) {
                jSONObject.put("version", fVar.f9198a);
            }
            List list = dVar.f9195d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f9205c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f9204b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 2, this.f9203a, i, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9205c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9204b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
