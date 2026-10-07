package ea;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3505a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3506b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3507c;

    public b(int i) {
        this.f3507c = i;
    }

    public final synchronized boolean a(String str) {
        boolean zEquals;
        synchronized (this) {
            int i = this.f3507c;
            String strSubstring = 36 > i ? "com.crashlytics.version-control-info".substring(0, i) : "com.crashlytics.version-control-info";
            if (this.f3505a.size() >= this.f3506b && !this.f3505a.containsKey(strSubstring)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f3506b, null);
                return false;
            }
            int i10 = this.f3507c;
            String strTrim = str.trim();
            if (strTrim.length() > i10) {
                strTrim = strTrim.substring(0, i10);
            }
            String str2 = (String) this.f3505a.get(strSubstring);
            if (str2 == null) {
                zEquals = strTrim == null;
            } else {
                zEquals = str2.equals(strTrim);
            }
            if (zEquals) {
                return false;
            }
            this.f3505a.put(strSubstring, strTrim);
            return true;
        }
    }

    public final synchronized void b(Map map) {
        String strTrim;
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                int i10 = this.f3507c;
                String strTrim2 = str.trim();
                if (strTrim2.length() > i10) {
                    strTrim2 = strTrim2.substring(0, i10);
                }
                if (this.f3505a.size() < this.f3506b || this.f3505a.containsKey(strTrim2)) {
                    String str2 = (String) entry.getValue();
                    HashMap map2 = this.f3505a;
                    if (str2 == null) {
                        strTrim = "";
                    } else {
                        int i11 = this.f3507c;
                        strTrim = str2.trim();
                        if (strTrim.length() > i11) {
                            strTrim = strTrim.substring(0, i11);
                        }
                    }
                    map2.put(strTrim2, strTrim);
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f3506b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
