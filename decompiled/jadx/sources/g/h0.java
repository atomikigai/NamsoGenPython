package g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.i3;
import l.k1;
import q0.c1;
import q0.d1;
import q0.e1;
import q0.j0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends a.a implements l.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f4026y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f4027z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f4030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f4031d;
    public k1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f4032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f4033g;
    public boolean h;
    public g0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f4034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public aa.c f4035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f4037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j.k f4043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f0 f4046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f0 f4047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a5.b f4048x;

    public h0(Dialog dialog) {
        new ArrayList();
        this.f4037m = new ArrayList();
        this.f4038n = 0;
        this.f4039o = true;
        this.f4042r = true;
        this.f4046v = new f0(this, 0);
        this.f4047w = new f0(this, 1);
        this.f4048x = new a5.b(this, 13);
        v(dialog.getWindow().getDecorView());
    }

    public final void t(boolean z4) {
        e1 e1VarI;
        e1 e1VarI2;
        if (z4) {
            if (!this.f4041q) {
                this.f4041q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4030c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f4041q) {
            this.f4041q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4030c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        ActionBarContainer actionBarContainer = this.f4031d;
        WeakHashMap weakHashMap = v0.f7946a;
        if (!q0.g0.c(actionBarContainer)) {
            if (z4) {
                ((i3) this.e).f6293a.setVisibility(4);
                this.f4032f.setVisibility(0);
                return;
            } else {
                ((i3) this.e).f6293a.setVisibility(0);
                this.f4032f.setVisibility(8);
                return;
            }
        }
        if (z4) {
            i3 i3Var = (i3) this.e;
            e1VarI = v0.a(i3Var.f6293a);
            e1VarI.a(0.0f);
            e1VarI.c(100L);
            e1VarI.d(new j.j(i3Var, 4));
            e1VarI2 = this.f4032f.i(0, 200L);
        } else {
            i3 i3Var2 = (i3) this.e;
            e1 e1VarA = v0.a(i3Var2.f6293a);
            e1VarA.a(1.0f);
            e1VarA.c(200L);
            e1VarA.d(new j.j(i3Var2, 0));
            e1VarI = this.f4032f.i(8, 100L);
            e1VarI2 = e1VarA;
        }
        j.k kVar = new j.k();
        ArrayList arrayList = kVar.f5629a;
        arrayList.add(e1VarI);
        View view = (View) e1VarI.f7895a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) e1VarI2.f7895a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(e1VarI2);
        kVar.b();
    }

    public final Context u() {
        if (this.f4029b == null) {
            TypedValue typedValue = new TypedValue();
            this.f4028a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f4029b = new ContextThemeWrapper(this.f4028a, i);
            } else {
                this.f4029b = this.f4028a;
            }
        }
        return this.f4029b;
    }

    public final void v(View view) {
        k1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f4030c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof k1) {
            wrapper = (k1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f4032f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f4031d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var == null || this.f4032f == null || actionBarContainer == null) {
            throw new IllegalStateException(h0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((i3) k1Var).f6293a.getContext();
        this.f4028a = context;
        if ((((i3) this.e).f6294b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        x(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f4028a.obtainStyledAttributes(null, f.a.f3552a, R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4030c;
            if (!actionBarOverlayLayout2.f474s) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f4045u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f4031d;
            WeakHashMap weakHashMap = v0.f7946a;
            j0.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void w(boolean z4) {
        if (this.h) {
            return;
        }
        int i = z4 ? 4 : 0;
        i3 i3Var = (i3) this.e;
        int i10 = i3Var.f6294b;
        this.h = true;
        i3Var.a((i & 4) | (i10 & (-5)));
    }

    public final void x(boolean z4) {
        if (z4) {
            this.f4031d.setTabContainer(null);
            ((i3) this.e).getClass();
        } else {
            ((i3) this.e).getClass();
            this.f4031d.setTabContainer(null);
        }
        this.e.getClass();
        ((i3) this.e).f6293a.setCollapsible(false);
        this.f4030c.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z4) {
        boolean z10 = this.f4040p;
        boolean z11 = this.f4041q;
        a5.b bVar = this.f4048x;
        View view = this.f4033g;
        int i = 0;
        if (!z11 && z10) {
            if (this.f4042r) {
                this.f4042r = false;
                j.k kVar = this.f4043s;
                if (kVar != null) {
                    kVar.a();
                }
                int i10 = this.f4038n;
                f0 f0Var = this.f4046v;
                if (i10 != 0 || (!this.f4044t && !z4)) {
                    f0Var.c();
                    return;
                }
                this.f4031d.setAlpha(1.0f);
                this.f4031d.setTransitioning(true);
                j.k kVar2 = new j.k();
                float f10 = -this.f4031d.getHeight();
                if (z4) {
                    int[] iArr = {0, 0};
                    this.f4031d.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                e1 e1VarA = v0.a(this.f4031d);
                e1VarA.e(f10);
                View view2 = (View) e1VarA.f7895a.get();
                if (view2 != null) {
                    d1.a(view2.animate(), bVar != null ? new c1(bVar, view2, i) : null);
                }
                boolean z12 = kVar2.e;
                ArrayList arrayList = kVar2.f5629a;
                if (!z12) {
                    arrayList.add(e1VarA);
                }
                if (this.f4039o && view != null) {
                    e1 e1VarA2 = v0.a(view);
                    e1VarA2.e(f10);
                    if (!kVar2.e) {
                        arrayList.add(e1VarA2);
                    }
                }
                boolean z13 = kVar2.e;
                if (!z13) {
                    kVar2.f5631c = f4026y;
                }
                if (!z13) {
                    kVar2.f5630b = 250L;
                }
                if (!z13) {
                    kVar2.f5632d = f0Var;
                }
                this.f4043s = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f4042r) {
            return;
        }
        this.f4042r = true;
        j.k kVar3 = this.f4043s;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f4031d.setVisibility(0);
        int i11 = this.f4038n;
        f0 f0Var2 = this.f4047w;
        if (i11 == 0 && (this.f4044t || z4)) {
            this.f4031d.setTranslationY(0.0f);
            float f11 = -this.f4031d.getHeight();
            if (z4) {
                int[] iArr2 = {0, 0};
                this.f4031d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f4031d.setTranslationY(f11);
            j.k kVar4 = new j.k();
            e1 e1VarA3 = v0.a(this.f4031d);
            e1VarA3.e(0.0f);
            View view3 = (View) e1VarA3.f7895a.get();
            if (view3 != null) {
                d1.a(view3.animate(), bVar != null ? new c1(bVar, view3, i) : null);
            }
            boolean z14 = kVar4.e;
            ArrayList arrayList2 = kVar4.f5629a;
            if (!z14) {
                arrayList2.add(e1VarA3);
            }
            if (this.f4039o && view != null) {
                view.setTranslationY(f11);
                e1 e1VarA4 = v0.a(view);
                e1VarA4.e(0.0f);
                if (!kVar4.e) {
                    arrayList2.add(e1VarA4);
                }
            }
            boolean z15 = kVar4.e;
            if (!z15) {
                kVar4.f5631c = f4027z;
            }
            if (!z15) {
                kVar4.f5630b = 250L;
            }
            if (!z15) {
                kVar4.f5632d = f0Var2;
            }
            this.f4043s = kVar4;
            kVar4.b();
        } else {
            this.f4031d.setAlpha(1.0f);
            this.f4031d.setTranslationY(0.0f);
            if (this.f4039o && view != null) {
                view.setTranslationY(0.0f);
            }
            f0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4030c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = v0.f7946a;
            q0.h0.c(actionBarOverlayLayout);
        }
    }

    public h0(boolean z4, Activity activity) {
        new ArrayList();
        this.f4037m = new ArrayList();
        this.f4038n = 0;
        this.f4039o = true;
        this.f4042r = true;
        this.f4046v = new f0(this, 0);
        this.f4047w = new f0(this, 1);
        this.f4048x = new a5.b(this, 13);
        View decorView = activity.getWindow().getDecorView();
        v(decorView);
        if (z4) {
            return;
        }
        this.f4033g = decorView.findViewById(android.R.id.content);
    }
}
