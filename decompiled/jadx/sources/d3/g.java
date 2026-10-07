package d3;

import android.content.ComponentName;
import android.content.Context;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2813a = t2.m.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z4) {
        String str = f2813a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            t2.m.d().a(str, cls.getName() + " " + (z4 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            t2.m.d().a(str, v.u(cls.getName(), " could not be ", z4 ? "enabled" : "disabled"), e);
        }
    }
}
