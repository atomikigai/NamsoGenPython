package lb;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6882c;

    public a(String str, String str2, String str3) {
        String str4 = Build.MANUFACTURER;
        jc.i.e(str2, "versionName");
        jc.i.e(str3, "appBuildVersion");
        jc.i.e(str4, "deviceManufacturer");
        this.f6880a = str;
        this.f6881b = str2;
        this.f6882c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f6880a.equals(aVar.f6880a) || !jc.i.a(this.f6881b, aVar.f6881b) || !jc.i.a(this.f6882c, aVar.f6882c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return jc.i.a(str, str);
    }

    public final int hashCode() {
        return Build.MANUFACTURER.hashCode() + da.v.d(da.v.d(this.f6880a.hashCode() * 31, 31, this.f6881b), 31, this.f6882c);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f6880a + ", versionName=" + this.f6881b + ", appBuildVersion=" + this.f6882c + ", deviceManufacturer=" + Build.MANUFACTURER + ')';
    }
}
