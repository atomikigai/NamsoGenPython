package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f380a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f381b = Color.argb(128, 27, 27, 27);

    public static void a(g.g gVar) {
        s qVar;
        c0 c0Var = c0.f345a;
        d0 d0Var = new d0(0, 0, c0Var);
        d0 d0Var2 = new d0(f380a, f381b, c0Var);
        View decorView = gVar.getWindow().getDecorView();
        jc.i.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        jc.i.d(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) c0Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        jc.i.d(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) c0Var.invoke(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            qVar = new r();
        } else {
            qVar = i >= 26 ? new q() : new p();
        }
        Window window = gVar.getWindow();
        jc.i.d(window, "window");
        qVar.a(d0Var, d0Var2, window, decorView, zBooleanValue, zBooleanValue2);
    }
}
