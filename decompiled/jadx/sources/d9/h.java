package d9;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import app.namso_gen.spacehowen.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import gb.r;
import java.util.List;
import java.util.WeakHashMap;
import q0.d0;
import q0.g0;
import q0.j0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3063d;
    public final TimeInterpolator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f3065g;
    public final Context h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f3066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3067k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f3075s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j1.a f3054u = e8.a.f3492b;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f3055v = e8.a.f3491a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j1.a f3056w = e8.a.f3494d;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f3058y = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f3059z = h.class.getSimpleName();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Handler f3057x = new Handler(Looper.getMainLooper(), new c(0));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f3068l = new d(this, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f3076t = new e(this);

    public h(Context context, ViewGroup viewGroup, View view, i iVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (iVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f3065g = viewGroup;
        this.f3066j = iVar;
        this.h = context;
        n.c(context, n.f9040a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f3058y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        g gVar = (g) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = gVar;
        gVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = gVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f2513b.setTextColor(com.bumptech.glide.c.x(actionTextColorAlpha, com.bumptech.glide.c.q(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f2513b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(gVar.getMaxInlineActionWidth());
        }
        gVar.addView(view);
        WeakHashMap weakHashMap = v0.f7946a;
        g0.f(gVar, 1);
        d0.s(gVar, 1);
        gVar.setFitsSystemWindows(true);
        j0.u(gVar, new ib.c(this, 12));
        v0.l(gVar, new com.google.android.material.datepicker.j(this, 1));
        this.f3075s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f3062c = android.support.v4.media.session.a.v(context, R.attr.motionDurationLong2, 250);
        this.f3060a = android.support.v4.media.session.a.v(context, R.attr.motionDurationLong2, 150);
        this.f3061b = android.support.v4.media.session.a.v(context, R.attr.motionDurationMedium1, 75);
        this.f3063d = android.support.v4.media.session.a.w(context, R.attr.motionEasingEmphasizedInterpolator, f3055v);
        this.f3064f = android.support.v4.media.session.a.w(context, R.attr.motionEasingEmphasizedInterpolator, f3056w);
        this.e = android.support.v4.media.session.a.w(context, R.attr.motionEasingEmphasizedInterpolator, f3054u);
    }

    public final void a(int i) {
        r rVarH = r.h();
        e eVar = this.f3076t;
        synchronized (rVarH.f4493a) {
            try {
                if (rVarH.k(eVar)) {
                    rVarH.c((l) rVarH.f4495c, i);
                } else {
                    l lVar = (l) rVarH.f4496d;
                    if (lVar != null && lVar.f3079a.get() == eVar) {
                        rVarH.c((l) rVarH.f4496d, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        this.f3072p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        f();
    }

    public final void c() {
        r rVarH = r.h();
        e eVar = this.f3076t;
        synchronized (rVarH.f4493a) {
            try {
                if (rVarH.k(eVar)) {
                    rVarH.f4495c = null;
                    if (((l) rVarH.f4496d) != null) {
                        rVarH.t();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        r rVarH = r.h();
        e eVar = this.f3076t;
        synchronized (rVarH.f4493a) {
            try {
                if (rVarH.k(eVar)) {
                    rVarH.s((l) rVarH.f4495c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        g gVar = this.i;
        AccessibilityManager accessibilityManager = this.f3075s;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            gVar.post(new d(this, 2));
            return;
        }
        if (gVar.getParent() != null) {
            gVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        g gVar = this.i;
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        boolean z4 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f3059z;
        if (!z4) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (gVar.f3052u == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (gVar.getParent() == null) {
            return;
        }
        int i = this.f3069m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = gVar.f3052u;
        int i10 = rect.bottom + i;
        int i11 = rect.left + this.f3070n;
        int i12 = rect.right + this.f3071o;
        int i13 = rect.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            gVar.requestLayout();
        }
        if ((z10 || this.f3073q != this.f3072p) && Build.VERSION.SDK_INT >= 29 && this.f3072p > 0) {
            ViewGroup.LayoutParams layoutParams2 = gVar.getLayoutParams();
            if ((layoutParams2 instanceof b0.e) && (((b0.e) layoutParams2).f1319a instanceof SwipeDismissBehavior)) {
                d dVar = this.f3068l;
                gVar.removeCallbacks(dVar);
                gVar.post(dVar);
            }
        }
    }
}
