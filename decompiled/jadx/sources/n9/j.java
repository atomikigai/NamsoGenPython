package n9;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7369d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7371g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = n7.g.f7312a;
        i0.k("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f7367b = str;
        this.f7366a = str2;
        this.f7368c = str3;
        this.f7369d = str4;
        this.e = str5;
        this.f7370f = str6;
        this.f7371g = str7;
    }

    public static j a(Context context) {
        aa.c cVar = new aa.c(context);
        String strY = cVar.y("google_app_id");
        if (TextUtils.isEmpty(strY)) {
            return null;
        }
        return new j(strY, cVar.y("google_api_key"), cVar.y("firebase_database_url"), cVar.y("ga_trackingId"), cVar.y("gcm_defaultSenderId"), cVar.y("google_storage_bucket"), cVar.y("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i0.m(this.f7367b, jVar.f7367b) && i0.m(this.f7366a, jVar.f7366a) && i0.m(this.f7368c, jVar.f7368c) && i0.m(this.f7369d, jVar.f7369d) && i0.m(this.e, jVar.e) && i0.m(this.f7370f, jVar.f7370f) && i0.m(this.f7371g, jVar.f7371g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7367b, this.f7366a, this.f7368c, this.f7369d, this.e, this.f7370f, this.f7371g});
    }

    public final String toString() {
        aa.c cVar = new aa.c(this);
        cVar.b(this.f7367b, "applicationId");
        cVar.b(this.f7366a, "apiKey");
        cVar.b(this.f7368c, "databaseUrl");
        cVar.b(this.e, "gcmSenderId");
        cVar.b(this.f7370f, "storageBucket");
        cVar.b(this.f7371g, "projectId");
        return cVar.toString();
    }
}
