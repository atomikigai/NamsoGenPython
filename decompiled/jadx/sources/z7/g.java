package z7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a4.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f11133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f11134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f11135d;

    public final String d(String str) {
        a1 a1Var = (a1) this.f159a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.i0.i(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e4) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11190f.c(e4, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e10) {
            i0 i0Var3 = a1Var.f11007t;
            a1.f(i0Var3);
            i0Var3.f11190f.c(e10, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e11) {
            i0 i0Var4 = a1Var.f11007t;
            a1.f(i0Var4);
            i0Var4.f11190f.c(e11, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double e(String str, y yVar) {
        if (str == null) {
            return ((Double) yVar.a(null)).doubleValue();
        }
        String strA = this.f11134c.a(str, yVar.f11436a);
        if (TextUtils.isEmpty(strA)) {
            return ((Double) yVar.a(null)).doubleValue();
        }
        try {
            return ((Double) yVar.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) yVar.a(null)).doubleValue();
        }
    }

    public final int f(String str, y yVar) {
        if (str == null) {
            return ((Integer) yVar.a(null)).intValue();
        }
        String strA = this.f11134c.a(str, yVar.f11436a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) yVar.a(null)).intValue();
        }
        try {
            return ((Integer) yVar.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) yVar.a(null)).intValue();
        }
    }

    public final void g() {
        ((a1) this.f159a).getClass();
    }

    public final long h(String str, y yVar) {
        if (str == null) {
            return ((Long) yVar.a(null)).longValue();
        }
        String strA = this.f11134c.a(str, yVar.f11436a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) yVar.a(null)).longValue();
        }
        try {
            return ((Long) yVar.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) yVar.a(null)).longValue();
        }
    }

    public final Bundle j() {
        a1 a1Var = (a1) this.f159a;
        try {
            if (a1Var.f11000a.getPackageManager() == null) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11190f.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoD = p7.c.a(a1Var.f11000a).d(128, a1Var.f11000a.getPackageName());
            if (applicationInfoD != null) {
                return applicationInfoD.metaData;
            }
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11190f.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            i0 i0Var3 = a1Var.f11007t;
            a1.f(i0Var3);
            i0Var3.f11190f.c(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean k(String str) {
        com.google.android.gms.common.internal.i0.e(str);
        Bundle bundleJ = j();
        if (bundleJ != null) {
            if (bundleJ.containsKey(str)) {
                return Boolean.valueOf(bundleJ.getBoolean(str));
            }
            return null;
        }
        i0 i0Var = ((a1) this.f159a).f11007t;
        a1.f(i0Var);
        i0Var.f11190f.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean l(String str, y yVar) {
        if (str == null) {
            return ((Boolean) yVar.a(null)).booleanValue();
        }
        String strA = this.f11134c.a(str, yVar.f11436a);
        return TextUtils.isEmpty(strA) ? ((Boolean) yVar.a(null)).booleanValue() : ((Boolean) yVar.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final boolean m() {
        Boolean boolK = k("google_analytics_automatic_screen_reporting_enabled");
        return boolK == null || boolK.booleanValue();
    }

    public final boolean n() {
        ((a1) this.f159a).getClass();
        Boolean boolK = k("firebase_analytics_collection_deactivated");
        return boolK != null && boolK.booleanValue();
    }

    public final boolean o(String str) {
        return "1".equals(this.f11134c.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean p() {
        if (this.f11133b == null) {
            Boolean boolK = k("app_measurement_lite");
            this.f11133b = boolK;
            if (boolK == null) {
                this.f11133b = Boolean.FALSE;
            }
        }
        return this.f11133b.booleanValue() || !((a1) this.f159a).e;
    }
}
