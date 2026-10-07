package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import q0.e2;
import q0.f2;
import q0.g2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements s {
    @Override // androidx.activity.s
    public void a(d0 d0Var, d0 d0Var2, Window window, View view, boolean z4, boolean z10) {
        n9.b f2Var;
        jc.i.e(d0Var, "statusBarStyle");
        jc.i.e(d0Var2, "navigationBarStyle");
        jc.i.e(window, "window");
        jc.i.e(view, "view");
        jd.d.F(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        wa.d dVar = new wa.d(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            f2Var = new g2(window, dVar);
        } else {
            f2Var = i >= 26 ? new f2(window, dVar) : new e2(window, dVar);
        }
        f2Var.A(!z4);
        f2Var.z(true ^ z10);
    }
}
