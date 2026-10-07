package lb;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6884b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        jc.i.e(str, "appId");
        jc.i.e(str2, "deviceModel");
        jc.i.e(str3, "osVersion");
        this.f6883a = str;
        this.f6884b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!jc.i.a(this.f6883a, bVar.f6883a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!jc.i.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return jc.i.a(str2, str2) && this.f6884b.equals(bVar.f6884b);
    }

    public final int hashCode() {
        return this.f6884b.hashCode() + ((o.LOG_ENVIRONMENT_PROD.hashCode() + da.v.d((((Build.MODEL.hashCode() + (this.f6883a.hashCode() * 31)) * 31) + 46670519) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f6883a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.0.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + o.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f6884b + ')';
    }
}
