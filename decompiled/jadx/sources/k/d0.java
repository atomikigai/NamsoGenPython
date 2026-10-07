package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.n0;
import app.namso_gen.spacehowen.R;
import java.util.WeakHashMap;
import l.i2;
import l.r1;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean A;
    public boolean B;
    public int C;
    public boolean E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f5821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f5822d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5823f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i2 f5825s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PopupWindow.OnDismissListener f5828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f5829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f5830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f5831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f5832z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f5826t = new d(this, 1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n0 f5827u = new n0(this, 3);
    public int D = 0;

    public d0(Context context, l lVar, View view, int i, boolean z4) {
        this.f5820b = context;
        this.f5821c = lVar;
        this.e = z4;
        this.f5822d = new i(lVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f5824r = i;
        Resources resources = context.getResources();
        this.f5823f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f5829w = view;
        this.f5825s = new i2(context, null, i, 0);
        lVar.b(this, context);
    }

    @Override // k.c0
    public final boolean a() {
        return !this.A && this.f5825s.K.isShowing();
    }

    @Override // k.y
    public final void b(l lVar, boolean z4) {
        if (lVar != this.f5821c) {
            return;
        }
        dismiss();
        x xVar = this.f5831y;
        if (xVar != null) {
            xVar.b(lVar, z4);
        }
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f5820b, e0Var, this.f5830x, this.e, this.f5824r, 0);
            x xVar = this.f5831y;
            wVar.h = xVar;
            t tVar = wVar.i;
            if (tVar != null) {
                tVar.f(xVar);
            }
            int size = e0Var.f5865f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i++;
            }
            wVar.f5908g = z4;
            t tVar2 = wVar.i;
            if (tVar2 != null) {
                tVar2.o(z4);
            }
            wVar.f5909j = this.f5828v;
            this.f5828v = null;
            this.f5821c.c(false);
            i2 i2Var = this.f5825s;
            int width = i2Var.f6246f;
            int iO = i2Var.o();
            int i10 = this.D;
            View view = this.f5829w;
            WeakHashMap weakHashMap = v0.f7946a;
            if ((Gravity.getAbsoluteGravity(i10, q0.e0.d(view)) & 7) == 5) {
                width += this.f5829w.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.e != null) {
                    wVar.d(width, iO, true, true);
                }
            }
            x xVar2 = this.f5831y;
            if (xVar2 != null) {
                xVar2.h(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // k.c0
    public final void dismiss() {
        if (a()) {
            this.f5825s.dismiss();
        }
    }

    @Override // k.y
    public final void f(x xVar) {
        this.f5831y = xVar;
    }

    @Override // k.y
    public final boolean g() {
        return false;
    }

    @Override // k.c0
    public final void h() {
        View view;
        if (a()) {
            return;
        }
        if (this.A || (view = this.f5829w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f5830x = view;
        i2 i2Var = this.f5825s;
        l.y yVar = i2Var.K;
        l.y yVar2 = i2Var.K;
        yVar.setOnDismissListener(this);
        i2Var.A = this;
        i2Var.J = true;
        yVar2.setFocusable(true);
        View view2 = this.f5830x;
        boolean z4 = this.f5832z == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f5832z = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f5826t);
        }
        view2.addOnAttachStateChangeListener(this.f5827u);
        i2Var.f6255z = view2;
        i2Var.f6252w = this.D;
        boolean z10 = this.B;
        Context context = this.f5820b;
        i iVar = this.f5822d;
        if (!z10) {
            this.C = t.m(iVar, context, this.f5823f);
            this.B = true;
        }
        i2Var.r(this.C);
        yVar2.setInputMethodMode(2);
        Rect rect = this.f5901a;
        i2Var.I = rect != null ? new Rect(rect) : null;
        i2Var.h();
        r1 r1Var = i2Var.f6244c;
        r1Var.setOnKeyListener(this);
        if (this.E) {
            l lVar = this.f5821c;
            if (lVar.f5872x != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f5872x);
                }
                frameLayout.setEnabled(false);
                r1Var.addHeaderView(frameLayout, null, false);
            }
        }
        i2Var.p(iVar);
        i2Var.h();
    }

    @Override // k.y
    public final void i() {
        this.B = false;
        i iVar = this.f5822d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // k.c0
    public final r1 j() {
        return this.f5825s.f6244c;
    }

    @Override // k.t
    public final void n(View view) {
        this.f5829w = view;
    }

    @Override // k.t
    public final void o(boolean z4) {
        this.f5822d.f5858c = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A = true;
        this.f5821c.c(true);
        ViewTreeObserver viewTreeObserver = this.f5832z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f5832z = this.f5830x.getViewTreeObserver();
            }
            this.f5832z.removeGlobalOnLayoutListener(this.f5826t);
            this.f5832z = null;
        }
        this.f5830x.removeOnAttachStateChangeListener(this.f5827u);
        PopupWindow.OnDismissListener onDismissListener = this.f5828v;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.t
    public final void p(int i) {
        this.D = i;
    }

    @Override // k.t
    public final void q(int i) {
        this.f5825s.f6246f = i;
    }

    @Override // k.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f5828v = onDismissListener;
    }

    @Override // k.t
    public final void s(boolean z4) {
        this.E = z4;
    }

    @Override // k.t
    public final void t(int i) {
        this.f5825s.i(i);
    }

    @Override // k.t
    public final void l(l lVar) {
    }
}
