package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import app.namso_gen.spacehowen.R;
import java.util.WeakHashMap;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5906d;
    public View e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5908g;
    public x h;
    public t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f5909j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5907f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f5910k = new u(this);

    public w(Context context, l lVar, View view, boolean z4, int i, int i10) {
        this.f5903a = context;
        this.f5904b = lVar;
        this.e = view;
        this.f5905c = z4;
        this.f5906d = i;
    }

    public final t a() {
        t d0Var;
        if (this.i == null) {
            Context context = this.f5903a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            v.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new f(context, this.e, this.f5906d, this.f5905c);
            } else {
                d0Var = new d0(this.f5903a, this.f5904b, this.e, this.f5906d, this.f5905c);
            }
            d0Var.l(this.f5904b);
            d0Var.r(this.f5910k);
            d0Var.n(this.e);
            d0Var.f(this.h);
            d0Var.o(this.f5908g);
            d0Var.p(this.f5907f);
            this.i = d0Var;
        }
        return this.i;
    }

    public final boolean b() {
        t tVar = this.i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f5909j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i10, boolean z4, boolean z10) {
        t tVarA = a();
        tVarA.s(z10);
        if (z4) {
            int i11 = this.f5907f;
            View view = this.e;
            WeakHashMap weakHashMap = v0.f7946a;
            if ((Gravity.getAbsoluteGravity(i11, q0.e0.d(view)) & 7) == 5) {
                i -= this.e.getWidth();
            }
            tVarA.q(i);
            tVarA.t(i10);
            int i12 = (int) ((this.f5903a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f5901a = new Rect(i - i12, i10 - i12, i + i12, i10 + i12);
        }
        tVarA.h();
    }
}
