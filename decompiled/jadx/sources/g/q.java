package g;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import q0.e1;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f4063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4066d;
    public final /* synthetic */ u e;

    public q(u uVar, Window.Callback callback) {
        this.e = uVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f4063a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f4064b = true;
            callback.onContentChanged();
        } finally {
            this.f4064b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f4063a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f4063a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.m.a(this.f4063a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4063a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f4065c;
        Window.Callback callback = this.f4063a;
        if (z4) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.e.y(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        t tVar;
        boolean z4;
        boolean zJ;
        k.l lVar;
        boolean zPerformShortcut;
        if (!this.f4063a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            u uVar = this.e;
            uVar.E();
            h0 h0Var = uVar.f4109z;
            if (h0Var == null) {
                tVar = uVar.X;
                if (tVar == null && uVar.J(tVar, keyEvent.getKeyCode(), keyEvent)) {
                    t tVar2 = uVar.X;
                    if (tVar2 != null) {
                        tVar2.f4078l = true;
                    }
                } else {
                    if (uVar.X == null) {
                        t tVarD = uVar.D(0);
                        uVar.K(tVarD, keyEvent);
                        zJ = uVar.J(tVarD, keyEvent.getKeyCode(), keyEvent);
                        tVarD.f4077k = false;
                        if (zJ) {
                        }
                    }
                    z4 = false;
                }
                z4 = true;
            } else {
                g0 g0Var = h0Var.i;
                if (g0Var == null || (lVar = g0Var.f4023d) == null) {
                    zPerformShortcut = false;
                } else {
                    lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = lVar.performShortcut(keyCode, keyEvent, 0);
                }
                if (zPerformShortcut) {
                    z4 = true;
                } else {
                    tVar = uVar.X;
                    if (tVar == null) {
                        if (uVar.X == null) {
                            t tVarD2 = uVar.D(0);
                            uVar.K(tVarD2, keyEvent);
                            zJ = uVar.J(tVarD2, keyEvent.getKeyCode(), keyEvent);
                            tVarD2.f4077k = false;
                            if (zJ) {
                                z4 = true;
                            }
                        }
                        z4 = false;
                    } else {
                        if (uVar.X == null) {
                            t tVarD3 = uVar.D(0);
                            uVar.K(tVarD3, keyEvent);
                            zJ = uVar.J(tVarD3, keyEvent.getKeyCode(), keyEvent);
                            tVarD3.f4077k = false;
                            if (zJ) {
                                z4 = true;
                            }
                        }
                        z4 = false;
                    }
                }
            }
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4063a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4063a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4063a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f4063a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f4063a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f4063a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f4064b) {
            this.f4063a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof k.l)) {
            return this.f4063a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f4063a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f4063a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4063a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            u uVar = this.e;
            uVar.E();
            h0 h0Var = uVar.f4109z;
            if (h0Var != null) {
                ArrayList arrayList = h0Var.f4037m;
                if (true != h0Var.f4036l) {
                    h0Var.f4036l = true;
                    if (arrayList.size() > 0) {
                        throw da.v.e(arrayList, 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f4066d) {
            this.f4063a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        u uVar = this.e;
        if (i != 108) {
            if (i == 0) {
                t tVarD = uVar.D(i);
                if (tVarD.f4079m) {
                    uVar.w(tVarD, false);
                    return;
                }
                return;
            }
            return;
        }
        uVar.E();
        h0 h0Var = uVar.f4109z;
        if (h0Var != null) {
            ArrayList arrayList = h0Var.f4037m;
            if (h0Var.f4036l) {
                h0Var.f4036l = false;
                if (arrayList.size() > 0) {
                    throw da.v.e(arrayList, 0);
                }
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        j.n.a(this.f4063a, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        k.l lVar = menu instanceof k.l ? (k.l) menu : null;
        if (i == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.I = true;
        }
        boolean zOnPreparePanel = this.f4063a.onPreparePanel(i, view, menu);
        if (lVar != null) {
            lVar.I = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        k.l lVar = this.e.D(0).h;
        if (lVar != null) {
            d(list, lVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.l.a(this.f4063a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4063a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f4063a.onWindowFocusChanged(z4);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        if (i != 0) {
            return j.l.b(this.f4063a, callback, i);
        }
        u uVar = this.e;
        Context context = uVar.f4105v;
        gb.r rVar = new gb.r();
        rVar.f4494b = context;
        rVar.f4493a = callback;
        rVar.f4495c = new ArrayList();
        boolean z4 = false;
        rVar.f4496d = new r.k(0);
        j.a aVar = uVar.F;
        if (aVar != null) {
            aVar.a();
        }
        aa.c cVar = new aa.c(uVar, rVar, 25, z4);
        uVar.E();
        h0 h0Var = uVar.f4109z;
        int i10 = 1;
        if (h0Var != null) {
            g0 g0Var = h0Var.i;
            if (g0Var != null) {
                g0Var.a();
            }
            h0Var.f4030c.setHideOnContentScrollEnabled(false);
            h0Var.f4032f.e();
            g0 g0Var2 = new g0(h0Var, h0Var.f4032f.getContext(), cVar);
            k.l lVar = g0Var2.f4023d;
            lVar.w();
            try {
                boolean zO = ((gb.r) g0Var2.e.f263b).o(g0Var2, lVar);
                lVar.v();
                if (zO) {
                    h0Var.i = g0Var2;
                    g0Var2.h();
                    h0Var.f4032f.c(g0Var2);
                    h0Var.t(true);
                } else {
                    g0Var2 = null;
                }
                uVar.F = g0Var2;
            } catch (Throwable th) {
                lVar.v();
                throw th;
            }
        }
        if (uVar.F == null) {
            e1 e1Var = uVar.J;
            if (e1Var != null) {
                e1Var.b();
            }
            j.a aVar2 = uVar.F;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (uVar.G == null) {
                if (uVar.T) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        j.d dVar = new j.d(context, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                        context = dVar;
                    }
                    uVar.G = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    uVar.H = popupWindow;
                    u0.m.d(popupWindow, 2);
                    uVar.H.setContentView(uVar.G);
                    uVar.H.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    uVar.G.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    uVar.H.setHeight(-2);
                    uVar.I = new m(uVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) uVar.L.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        uVar.E();
                        h0 h0Var2 = uVar.f4109z;
                        Context contextU = h0Var2 != null ? h0Var2.u() : null;
                        if (contextU != null) {
                            context = contextU;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        uVar.G = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (uVar.G != null) {
                e1 e1Var2 = uVar.J;
                if (e1Var2 != null) {
                    e1Var2.b();
                }
                uVar.G.e();
                Context context2 = uVar.G.getContext();
                ActionBarContextView actionBarContextView = uVar.G;
                j.e eVar = new j.e();
                eVar.f5588c = context2;
                eVar.f5589d = actionBarContextView;
                eVar.e = cVar;
                k.l lVar2 = new k.l(actionBarContextView.getContext());
                lVar2.f5871w = 1;
                eVar.f5592s = lVar2;
                lVar2.e = eVar;
                if (rVar.o(eVar, lVar2)) {
                    eVar.h();
                    uVar.G.c(eVar);
                    uVar.F = eVar;
                    if (!uVar.K || (viewGroup = uVar.L) == null) {
                        uVar.G.setAlpha(1.0f);
                        uVar.G.setVisibility(0);
                        if (uVar.G.getParent() instanceof View) {
                            View view = (View) uVar.G.getParent();
                            WeakHashMap weakHashMap = v0.f7946a;
                            q0.h0.c(view);
                        }
                    } else {
                        WeakHashMap weakHashMap2 = v0.f7946a;
                        if (q0.g0.c(viewGroup)) {
                            uVar.G.setAlpha(0.0f);
                            e1 e1VarA = v0.a(uVar.G);
                            e1VarA.a(1.0f);
                            uVar.J = e1VarA;
                            e1VarA.d(new n(uVar, i10));
                        } else {
                            uVar.G.setAlpha(1.0f);
                            uVar.G.setVisibility(0);
                            if (uVar.G.getParent() instanceof View) {
                                View view2 = (View) uVar.G.getParent();
                                WeakHashMap weakHashMap3 = v0.f7946a;
                                q0.h0.c(view2);
                            }
                        }
                    }
                    if (uVar.H != null) {
                        uVar.f4106w.getDecorView().post(uVar.I);
                    }
                } else {
                    uVar.F = null;
                }
            }
            uVar.M();
            uVar.F = uVar.F;
        }
        uVar.M();
        j.a aVar3 = uVar.F;
        if (aVar3 != null) {
            return rVar.f(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f4063a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
