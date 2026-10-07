package da;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a0 f3088b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3089a;

    public static void a(a2.l lVar, ka.d dVar) {
        String str = dVar.f6134a;
        if (str != null) {
            lVar.B("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        lVar.B("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        lVar.B("X-CRASHLYTICS-API-CLIENT-VERSION", "18.4.3");
        lVar.B("Accept", "application/json");
        String str2 = dVar.f6135b;
        if (str2 != null) {
            lVar.B("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f6136c;
        if (str3 != null) {
            lVar.B("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.f6137d;
        if (str4 != null) {
            lVar.B("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.e.b().f3095a;
        if (str5 != null) {
            lVar.B("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(ka.d dVar) {
        HashMap map = new HashMap();
        map.put("build_version", dVar.h);
        map.put("display_version", dVar.f6139g);
        map.put("source", Integer.toString(dVar.i));
        String str = dVar.f6138f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(ea.j jVar) {
        String str = this.f3089a;
        int i = jVar.f3529a;
        aa.d dVar = aa.d.f265a;
        dVar.c("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            if (dVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = (String) jVar.f3530b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            dVar.d("Failed to parse settings JSON from " + str, e);
            dVar.d("Settings response " + str3, null);
            return null;
        }
    }
}
