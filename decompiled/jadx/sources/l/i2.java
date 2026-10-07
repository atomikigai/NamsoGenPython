package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends c2 implements d2 {
    public static final Method O;
    public a5.b N;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.d2
    public final void l(k.l lVar, k.n nVar) {
        a5.b bVar = this.N;
        if (bVar != null) {
            bVar.l(lVar, nVar);
        }
    }

    @Override // l.d2
    public final void m(k.l lVar, MenuItem menuItem) {
        a5.b bVar = this.N;
        if (bVar != null) {
            bVar.m(lVar, menuItem);
        }
    }

    @Override // l.c2
    public final r1 q(Context context, boolean z4) {
        h2 h2Var = new h2(context, z4);
        h2Var.setHoverListener(this);
        return h2Var;
    }
}
