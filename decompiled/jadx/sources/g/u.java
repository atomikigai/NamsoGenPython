package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.d3;
import l.h1;
import l.i3;
import l.j1;
import l.k1;
import l.n3;
import l.p0;
import l.p3;
import q0.e1;
import q0.j0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends l implements k.j, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final r.k f4083s0 = new r.k(0);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int[] f4084t0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final boolean f4085u0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final boolean f4086v0 = true;
    public j.i A;
    public CharSequence B;
    public j1 C;
    public e7.i D;
    public ib.c E;
    public j.a F;
    public ActionBarContextView G;
    public PopupWindow H;
    public m I;
    public boolean K;
    public ViewGroup L;
    public TextView M;
    public View N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public t[] W;
    public t X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f4087a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f4088b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Configuration f4089c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f4090d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f4091e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f4092f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f4093g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public r f4094h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public r f4095i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f4096j0;
    public int k0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f4098m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Rect f4099n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Rect f4100o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public x f4101p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OnBackInvokedDispatcher f4102q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OnBackInvokedCallback f4103r0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4104u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f4105v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Window f4106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q f4107x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f4108y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h0 f4109z;
    public e1 J = null;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final m f4097l0 = new m(this, 0);

    public u(Context context, Window window, h hVar, Object obj) {
        g gVar = null;
        this.f4090d0 = -100;
        this.f4105v = context;
        this.f4108y = hVar;
        this.f4104u = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    gVar = (g) context;
                    break;
                }
            }
            if (gVar != null) {
                this.f4090d0 = ((u) gVar.r()).f4090d0;
            }
        }
        if (this.f4090d0 == -100) {
            String name = this.f4104u.getClass().getName();
            r.k kVar = f4083s0;
            Integer num = (Integer) kVar.get(name);
            if (num != null) {
                this.f4090d0 = num.intValue();
                kVar.remove(this.f4104u.getClass().getName());
            }
        }
        if (window != null) {
            s(window);
        }
        l.r.d();
    }

    public static m0.k t(Context context) {
        m0.k kVar;
        m0.k kVar2;
        if (Build.VERSION.SDK_INT >= 33 || (kVar = l.f4053c) == null) {
            return null;
        }
        m0.l lVar = kVar.f6972a;
        m0.k kVarB = o.b(context.getApplicationContext().getResources().getConfiguration());
        if (kVar.b()) {
            kVar2 = m0.k.f6971b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < kVarB.f6972a.f6973a.size() + lVar.f6973a.size()) {
                Locale locale = i < lVar.f6973a.size() ? lVar.f6973a.get(i) : kVarB.f6972a.f6973a.get(i - lVar.f6973a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            kVar2 = new m0.k(new m0.l(m0.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return kVar2.b() ? kVarB : kVar2;
    }

    public static Configuration x(Context context, int i, m0.k kVar, Configuration configuration, boolean z4) {
        int i10;
        if (i == 1) {
            i10 = 16;
        } else if (i != 2) {
            i10 = z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i10 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (kVar != null) {
            o.d(configuration2, kVar);
        }
        return configuration2;
    }

    public final void A() {
        ViewGroup viewGroup;
        if (this.K) {
            return;
        }
        Context context = this.f4105v;
        int[] iArr = f.a.f3558j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            l(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            l(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            l(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            l(10);
        }
        this.T = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        B();
        this.f4106w.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.U) {
            viewGroup = this.S ? (ViewGroup) layoutInflaterFrom.inflate(app.namso_gen.spacehowen.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(app.namso_gen.spacehowen.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.T) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(app.namso_gen.spacehowen.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.R = false;
            this.Q = false;
        } else if (this.Q) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(app.namso_gen.spacehowen.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.d(context, typedValue.resourceId) : context).inflate(app.namso_gen.spacehowen.R.layout.abc_screen_toolbar, (ViewGroup) null);
            j1 j1Var = (j1) viewGroup.findViewById(app.namso_gen.spacehowen.R.id.decor_content_parent);
            this.C = j1Var;
            j1Var.setWindowCallback(this.f4106w.getCallback());
            if (this.R) {
                ((ActionBarOverlayLayout) this.C).j(109);
            }
            if (this.O) {
                ((ActionBarOverlayLayout) this.C).j(2);
            }
            if (this.P) {
                ((ActionBarOverlayLayout) this.C).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Q + ", windowActionBarOverlay: " + this.R + ", android:windowIsFloating: " + this.T + ", windowActionModeOverlay: " + this.S + ", windowNoTitle: " + this.U + " }");
        }
        a5.b bVar = new a5.b(this, 12);
        WeakHashMap weakHashMap = v0.f7946a;
        j0.u(viewGroup, bVar);
        if (this.C == null) {
            this.M = (TextView) viewGroup.findViewById(app.namso_gen.spacehowen.R.id.title);
        }
        Method method = p3.f6395a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(app.namso_gen.spacehowen.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f4106w.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f4106w.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new a4.b(this, 11));
        this.L = viewGroup;
        Object obj = this.f4104u;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.B;
        if (!TextUtils.isEmpty(title)) {
            j1 j1Var2 = this.C;
            if (j1Var2 != null) {
                j1Var2.setWindowTitle(title);
            } else {
                h0 h0Var = this.f4109z;
                if (h0Var != null) {
                    i3 i3Var = (i3) h0Var.e;
                    if (!i3Var.f6298g) {
                        Toolbar toolbar = i3Var.f6293a;
                        i3Var.h = title;
                        if ((i3Var.f6294b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (i3Var.f6298g) {
                                v0.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.M;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.L.findViewById(R.id.content);
        View decorView = this.f4106w.getDecorView();
        contentFrameLayout2.f491r.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = v0.f7946a;
        if (q0.g0.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.K = true;
        t tVarD = D(0);
        if (this.f4088b0 || tVarD.h != null) {
            return;
        }
        F(108);
    }

    public final void B() {
        if (this.f4106w == null) {
            Object obj = this.f4104u;
            if (obj instanceof Activity) {
                s(((Activity) obj).getWindow());
            }
        }
        if (this.f4106w == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final androidx.fragment.app.f C(Context context) {
        if (this.f4094h0 == null) {
            if (a2.l.e == null) {
                Context applicationContext = context.getApplicationContext();
                a2.l.e = new a2.l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4094h0 = new r(this, a2.l.e);
        }
        return this.f4094h0;
    }

    public final t D(int i) {
        t[] tVarArr = this.W;
        if (tVarArr == null || tVarArr.length <= i) {
            t[] tVarArr2 = new t[i + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.W = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t();
        tVar2.f4070a = i;
        tVar2.f4080n = false;
        tVarArr[i] = tVar2;
        return tVar2;
    }

    public final void E() {
        A();
        if (this.Q && this.f4109z == null) {
            Object obj = this.f4104u;
            if (obj instanceof Activity) {
                this.f4109z = new h0(this.R, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.f4109z = new h0((Dialog) obj);
            }
            h0 h0Var = this.f4109z;
            if (h0Var != null) {
                h0Var.w(this.f4098m0);
            }
        }
    }

    public final void F(int i) {
        this.k0 = (1 << i) | this.k0;
        if (this.f4096j0) {
            return;
        }
        View decorView = this.f4106w.getDecorView();
        WeakHashMap weakHashMap = v0.f7946a;
        q0.d0.m(decorView, this.f4097l0);
        this.f4096j0 = true;
    }

    public final int G(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f4095i0 == null) {
                            this.f4095i0 = new r(this, context);
                        }
                        return this.f4095i0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return C(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean H() {
        k1 k1Var;
        d3 d3Var;
        boolean z4 = this.Y;
        this.Y = false;
        t tVarD = D(0);
        if (!tVarD.f4079m) {
            j.a aVar = this.F;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            E();
            h0 h0Var = this.f4109z;
            if (h0Var == null || (k1Var = h0Var.e) == null || (d3Var = ((i3) k1Var).f6293a.W) == null || d3Var.f6258b == null) {
                return false;
            }
            d3 d3Var2 = ((i3) k1Var).f6293a.W;
            k.n nVar = d3Var2 == null ? null : d3Var2.f6258b;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z4) {
            w(tVarD, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0177, code lost:
    
        if (r2.f5855f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(g.t r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.u.I(g.t, android.view.KeyEvent):void");
    }

    public final boolean J(t tVar, int i, KeyEvent keyEvent) {
        k.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f4077k || K(tVar, keyEvent)) && (lVar = tVar.h) != null) {
            return lVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    public final boolean K(t tVar, KeyEvent keyEvent) {
        k.l lVar;
        j1 j1Var;
        j1 j1Var2;
        Resources.Theme themeNewTheme;
        j1 j1Var3;
        j1 j1Var4;
        if (!this.f4088b0) {
            boolean z4 = tVar.f4077k;
            int i = tVar.f4070a;
            if (z4) {
                return true;
            }
            t tVar2 = this.X;
            if (tVar2 != null && tVar2 != tVar) {
                w(tVar2, false);
            }
            Window.Callback callback = this.f4106w.getCallback();
            if (callback != null) {
                tVar.f4075g = callback.onCreatePanelView(i);
            }
            boolean z10 = i == 0 || i == 108;
            if (z10 && (j1Var4 = this.C) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var4;
                actionBarOverlayLayout.k();
                ((i3) actionBarOverlayLayout.e).f6301l = true;
            }
            if (tVar.f4075g == null) {
                k.l lVar2 = tVar.h;
                if (lVar2 == null || tVar.f4081o) {
                    if (lVar2 == null) {
                        Context context = this.f4105v;
                        if ((i == 0 || i == 108) && this.C != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(app.namso_gen.spacehowen.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(app.namso_gen.spacehowen.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(app.namso_gen.spacehowen.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                j.d dVar = new j.d(context, 0);
                                dVar.getTheme().setTo(themeNewTheme);
                                context = dVar;
                            }
                        }
                        k.l lVar3 = new k.l(context);
                        lVar3.e = this;
                        k.l lVar4 = tVar.h;
                        if (lVar3 != lVar4) {
                            if (lVar4 != null) {
                                lVar4.r(tVar.i);
                            }
                            tVar.h = lVar3;
                            k.h hVar = tVar.i;
                            if (hVar != null) {
                                lVar3.b(hVar, lVar3.f5861a);
                            }
                        }
                        if (tVar.h != null) {
                            if (z10 && (j1Var2 = this.C) != null) {
                                if (this.D == null) {
                                    this.D = new e7.i(this, 17);
                                }
                                ((ActionBarOverlayLayout) j1Var2).l(tVar.h, this.D);
                            }
                            tVar.h.w();
                            if (callback.onCreatePanelMenu(i, tVar.h)) {
                                tVar.f4081o = false;
                            } else {
                                lVar = tVar.h;
                                if (lVar != null) {
                                    if (lVar != null) {
                                        lVar.r(tVar.i);
                                    }
                                    tVar.h = null;
                                }
                                if (z10 && (j1Var = this.C) != null) {
                                    ((ActionBarOverlayLayout) j1Var).l(null, this.D);
                                }
                            }
                        }
                    } else {
                        if (z10) {
                            if (this.D == null) {
                                this.D = new e7.i(this, 17);
                            }
                            ((ActionBarOverlayLayout) j1Var2).l(tVar.h, this.D);
                        }
                        tVar.h.w();
                        if (callback.onCreatePanelMenu(i, tVar.h)) {
                            lVar = tVar.h;
                            if (lVar != null) {
                                if (lVar != null) {
                                    lVar.r(tVar.i);
                                }
                                tVar.h = null;
                            }
                            if (z10) {
                                ((ActionBarOverlayLayout) j1Var).l(null, this.D);
                            }
                        } else {
                            tVar.f4081o = false;
                        }
                    }
                }
                tVar.h.w();
                Bundle bundle = tVar.f4082p;
                if (bundle != null) {
                    tVar.h.s(bundle);
                    tVar.f4082p = null;
                }
                if (!callback.onPreparePanel(0, tVar.f4075g, tVar.h)) {
                    if (z10 && (j1Var3 = this.C) != null) {
                        ((ActionBarOverlayLayout) j1Var3).l(null, this.D);
                    }
                    tVar.h.v();
                    return false;
                }
                tVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                tVar.h.v();
            }
            tVar.f4077k = true;
            tVar.f4078l = false;
            this.X = tVar;
            return true;
        }
        return false;
    }

    public final void L() {
        if (this.K) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void M() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f4102q0 != null && (D(0).f4079m || this.F != null)) {
                z4 = true;
            }
            if (z4 && this.f4103r0 == null) {
                this.f4103r0 = p.b(this.f4102q0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f4103r0) == null) {
                    return;
                }
                p.c(this.f4102q0, onBackInvokedCallback);
            }
        }
    }

    @Override // g.l
    public final void d() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4105v);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof u) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.l
    public final void e() {
        if (this.f4109z != null) {
            E();
            this.f4109z.getClass();
            F(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // k.j
    public final boolean g(k.l lVar, MenuItem menuItem) {
        t tVar;
        Window.Callback callback = this.f4106w.getCallback();
        if (callback != null && !this.f4088b0) {
            k.l lVarK = lVar.k();
            t[] tVarArr = this.W;
            int length = tVarArr != null ? tVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                tVar = tVarArr[i];
                if (tVar != null && tVar.h == lVarK) {
                    if (tVar != null) {
                        return callback.onMenuItemSelected(tVar.f4070a, menuItem);
                    }
                }
            }
            tVar = null;
            if (tVar != null) {
                return callback.onMenuItemSelected(tVar.f4070a, menuItem);
            }
        }
        return false;
    }

    @Override // g.l
    public final void h() {
        String strC;
        this.Z = true;
        r(false, true);
        B();
        Object obj = this.f4104u;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = d0.f.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                h0 h0Var = this.f4109z;
                if (h0Var == null) {
                    this.f4098m0 = true;
                } else {
                    h0Var.w(true);
                }
            }
            synchronized (l.f4057s) {
                l.k(this);
                l.f4056r.add(new WeakReference(this));
            }
        }
        this.f4089c0 = new Configuration(this.f4105v.getResources().getConfiguration());
        this.f4087a0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // g.l
    public final void i() {
        if (this.f4104u instanceof Activity) {
            synchronized (l.f4057s) {
                l.k(this);
            }
        }
        if (this.f4096j0) {
            this.f4106w.getDecorView().removeCallbacks(this.f4097l0);
        }
        this.f4088b0 = true;
        if (this.f4090d0 != -100) {
            Object obj = this.f4104u;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f4083s0.put(this.f4104u.getClass().getName(), Integer.valueOf(this.f4090d0));
            } else {
                f4083s0.remove(this.f4104u.getClass().getName());
            }
        } else {
            f4083s0.remove(this.f4104u.getClass().getName());
        }
        r rVar = this.f4094h0;
        if (rVar != null) {
            rVar.c();
        }
        r rVar2 = this.f4095i0;
        if (rVar2 != null) {
            rVar2.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // k.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(k.l r6) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.u.j(k.l):void");
    }

    @Override // g.l
    public final boolean l(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.U && i == 108) {
            return false;
        }
        if (this.Q && i == 1) {
            this.Q = false;
        }
        if (i == 1) {
            L();
            this.U = true;
            return true;
        }
        if (i == 2) {
            L();
            this.O = true;
            return true;
        }
        if (i == 5) {
            L();
            this.P = true;
            return true;
        }
        if (i == 10) {
            L();
            this.S = true;
            return true;
        }
        if (i == 108) {
            L();
            this.Q = true;
            return true;
        }
        if (i != 109) {
            return this.f4106w.requestFeature(i);
        }
        L();
        this.R = true;
        return true;
    }

    @Override // g.l
    public final void m(int i) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4105v).inflate(i, viewGroup);
        this.f4107x.a(this.f4106w.getCallback());
    }

    @Override // g.l
    public final void n(View view) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4107x.a(this.f4106w.getCallback());
    }

    @Override // g.l
    public final void o(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4107x.a(this.f4106w.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View b0Var;
        View view2 = null;
        if (this.f4101p0 == null) {
            int[] iArr = f.a.f3558j;
            Context context2 = this.f4105v;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f4101p0 = new x();
            } else {
                try {
                    this.f4101p0 = (x) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f4101p0 = new x();
                }
            }
        }
        x xVar = this.f4101p0;
        int i = n3.f6374a;
        xVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f3573y, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context dVar = (resourceId == 0 || ((context instanceof j.d) && ((j.d) context).f5584a == resourceId)) ? context : new j.d(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b10 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b10 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b10 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b10 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                b10 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b10 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b10 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b10 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b10 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b10 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b10 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b10 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b10 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                b0Var = new l.b0(dVar, attributeSet);
                break;
            case 1:
                b0Var = new l.q(dVar, attributeSet);
                break;
            case 2:
                b0Var = new l.x(dVar, attributeSet);
                break;
            case 3:
                b0Var = xVar.e(dVar, attributeSet);
                break;
            case 4:
                b0Var = new l.v(dVar, attributeSet, app.namso_gen.spacehowen.R.attr.imageButtonStyle);
                break;
            case 5:
                b0Var = new l.d0(dVar, attributeSet);
                break;
            case 6:
                b0Var = new p0(dVar, attributeSet);
                break;
            case 7:
                b0Var = xVar.d(dVar, attributeSet);
                break;
            case 8:
                b0Var = new h1(dVar, attributeSet);
                break;
            case 9:
                b0Var = new l.w(dVar, attributeSet, 0);
                break;
            case 10:
                b0Var = xVar.a(dVar, attributeSet);
                break;
            case 11:
                b0Var = xVar.c(dVar, attributeSet);
                break;
            case 12:
                b0Var = new l.t(dVar, attributeSet);
                break;
            case 13:
                b0Var = xVar.b(dVar, attributeSet);
                break;
            default:
                b0Var = null;
                break;
        }
        if (b0Var != null || context == dVar) {
            view2 = b0Var;
        } else {
            Object[] objArr = xVar.f4120a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = dVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = x.f4119g;
                        if (i10 < 3) {
                            View viewF = xVar.f(dVar, str, strArr[i10]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i10++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = xVar.f(dVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th2) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th2;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = v0.f7946a;
                if (q0.c0.a(view2)) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, x.f4116c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        view2.setOnClickListener(new w(view2, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = dVar.obtainStyledAttributes(attributeSet, x.f4117d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z4 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = v0.f7946a;
                    new q0.a0(app.namso_gen.spacehowen.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(view2, Boolean.valueOf(z4));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = dVar.obtainStyledAttributes(attributeSet, x.e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    v0.m(view2, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = dVar.obtainStyledAttributes(attributeSet, x.f4118f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = v0.f7946a;
                    new q0.a0(app.namso_gen.spacehowen.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view2, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return view2;
    }

    @Override // g.l
    public final void p(CharSequence charSequence) {
        this.B = charSequence;
        j1 j1Var = this.C;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        h0 h0Var = this.f4109z;
        if (h0Var == null) {
            TextView textView = this.M;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        i3 i3Var = (i3) h0Var.e;
        if (i3Var.f6298g) {
            return;
        }
        Toolbar toolbar = i3Var.f6293a;
        i3Var.h = charSequence;
        if ((i3Var.f6294b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i3Var.f6298g) {
                v0.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(boolean z4, boolean z10) {
        int i;
        boolean z11;
        Object obj;
        Object obj2;
        if (this.f4088b0) {
            return false;
        }
        int i10 = this.f4090d0;
        if (i10 == -100) {
            i10 = l.f4052b;
        }
        Context context = this.f4105v;
        int iG = G(context, i10);
        int i11 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        m0.k kVarT = i11 < 33 ? t(context) : null;
        if (!z10 && kVarT != null) {
            kVarT = o.b(context.getResources().getConfiguration());
        }
        Configuration configurationX = x(context, iG, kVarT, null, false);
        boolean z12 = this.f4093g0;
        boolean z13 = true;
        Object obj3 = this.f4104u;
        if (z12 || !(obj3 instanceof Activity)) {
            this.f4093g0 = true;
            i = this.f4092f0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f4092f0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f4092f0 = 0;
                }
                this.f4093g0 = true;
                i = this.f4092f0;
            }
        }
        Configuration configuration = this.f4089c0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i12 = configuration.uiMode & 48;
        int i13 = configurationX.uiMode & 48;
        m0.k kVarB = o.b(configuration);
        m0.k kVarB2 = kVarT == null ? null : o.b(configurationX);
        int i14 = i12 != i13 ? 512 : 0;
        if (kVarB2 != null && !kVarB.equals(kVarB2)) {
            i14 |= 8196;
        }
        if (((~i) & i14) != 0 && z4 && this.Z && ((f4085u0 || this.f4087a0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z11 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new androidx.activity.d(activity, 8));
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i14 == 0) {
            z13 = z11;
        } else {
            boolean z14 = (i14 & i) == i14;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i13;
            if (kVarB2 != null) {
                o.d(configuration2, kVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 < 26 && i15 < 28) {
                if (!com.bumptech.glide.d.h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        com.bumptech.glide.d.f1850g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
                    }
                    com.bumptech.glide.d.h = true;
                }
                Field field = com.bumptech.glide.d.f1850g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e10) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!com.bumptech.glide.d.f1846b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                com.bumptech.glide.d.f1845a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e11) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                            }
                            com.bumptech.glide.d.f1846b = true;
                        }
                        Field field2 = com.bumptech.glide.d.f1845a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e12) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!com.bumptech.glide.d.f1848d) {
                                try {
                                    com.bumptech.glide.d.f1847c = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e13) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e13);
                                }
                                com.bumptech.glide.d.f1848d = true;
                            }
                            Class cls = com.bumptech.glide.d.f1847c;
                            if (cls != null) {
                                if (!com.bumptech.glide.d.f1849f) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        com.bumptech.glide.d.e = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e14) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e14);
                                    }
                                    com.bumptech.glide.d.f1849f = true;
                                }
                                Field field3 = com.bumptech.glide.d.e;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e15) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e15);
                                    }
                                    if (longSparseArray != null) {
                                        c0.a(longSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i16 = this.f4091e0;
            if (i16 != 0) {
                context.setTheme(i16);
                context.getTheme().applyStyle(this.f4091e0, true);
            }
            if (z14 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof androidx.lifecycle.r) {
                    if (((androidx.lifecycle.r) activity2).l().f1093d.compareTo(androidx.lifecycle.m.f1067c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f4087a0 && !this.f4088b0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z13 && kVarB2 != null) {
            o.c(o.b(context.getResources().getConfiguration()));
        }
        if (i10 == 0) {
            C(context).j();
        } else {
            r rVar = this.f4094h0;
            if (rVar != null) {
                rVar.c();
            }
        }
        if (i10 == 3) {
            if (this.f4095i0 == null) {
                this.f4095i0 = new r(this, context);
            }
            this.f4095i0.j();
        } else {
            r rVar2 = this.f4095i0;
            if (rVar2 != null) {
                rVar2.c();
            }
        }
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void s(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f4106w != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof q) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        q qVar = new q(this, callback);
        this.f4107x = qVar;
        window.setCallback(qVar);
        a2.l lVarF = a2.l.F(this.f4105v, null, f4084t0);
        Drawable drawableV = lVarF.v(0);
        if (drawableV != null) {
            window.setBackgroundDrawable(drawableV);
        }
        lVarF.I();
        this.f4106w = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f4102q0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f4103r0) != null) {
            p.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4103r0 = null;
        }
        Object obj = this.f4104u;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f4102q0 = p.a(activity);
            } else {
                this.f4102q0 = null;
            }
        } else {
            this.f4102q0 = null;
        }
        M();
    }

    public final void u(int i, t tVar, k.l lVar) {
        if (lVar == null) {
            if (tVar == null && i >= 0) {
                t[] tVarArr = this.W;
                if (i < tVarArr.length) {
                    tVar = tVarArr[i];
                }
            }
            if (tVar != null) {
                lVar = tVar.h;
            }
        }
        if ((tVar == null || tVar.f4079m) && !this.f4088b0) {
            q qVar = this.f4107x;
            Window.Callback callback = this.f4106w.getCallback();
            qVar.getClass();
            try {
                qVar.f4066d = true;
                callback.onPanelClosed(i, lVar);
            } finally {
                qVar.f4066d = false;
            }
        }
    }

    public final void v(k.l lVar) {
        l.j jVar;
        if (this.V) {
            return;
        }
        this.V = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.C;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((i3) actionBarOverlayLayout.e).f6293a.f513a;
        if (actionMenuView != null && (jVar = actionMenuView.E) != null) {
            jVar.h();
            l.f fVar = jVar.E;
            if (fVar != null && fVar.b()) {
                fVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f4106w.getCallback();
        if (callback != null && !this.f4088b0) {
            callback.onPanelClosed(108, lVar);
        }
        this.V = false;
    }

    public final void w(t tVar, boolean z4) {
        s sVar;
        j1 j1Var;
        l.j jVar;
        if (z4 && tVar.f4070a == 0 && (j1Var = this.C) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((i3) actionBarOverlayLayout.e).f6293a.f513a;
            if (actionMenuView != null && (jVar = actionMenuView.E) != null && jVar.j()) {
                v(tVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f4105v.getSystemService("window");
        if (windowManager != null && tVar.f4079m && (sVar = tVar.e) != null) {
            windowManager.removeView(sVar);
            if (z4) {
                u(tVar.f4070a, tVar, null);
            }
        }
        tVar.f4077k = false;
        tVar.f4078l = false;
        tVar.f4079m = false;
        tVar.f4074f = null;
        tVar.f4080n = true;
        if (this.X == tVar) {
            this.X = null;
        }
        if (tVar.f4070a == 0) {
            M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    public final boolean y(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        t tVarD;
        j1 j1Var;
        Context context;
        boolean z4;
        boolean z10;
        boolean zK;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        l.j jVar;
        l.j jVar2;
        l.j jVar3;
        t tVarD2;
        Object obj = this.f4104u;
        if ((!(obj instanceof q0.m) && !(obj instanceof f)) || (decorView = this.f4106w.getDecorView()) == null || !com.bumptech.glide.d.i(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                q qVar = this.f4107x;
                Window.Callback callback = this.f4106w.getCallback();
                qVar.getClass();
                try {
                    qVar.f4065c = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    qVar.f4065c = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.Y = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    tVarD2 = D(0);
                                    if (!tVarD2.f4079m) {
                                        K(tVarD2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.F == null) {
                                    tVarD = D(0);
                                    j1Var = this.C;
                                    context = this.f4105v;
                                    if (j1Var != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                                        actionBarOverlayLayout.k();
                                        toolbar = ((i3) actionBarOverlayLayout.e).f6293a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f513a) == null || !actionMenuView.D || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z4 = tVarD.f4079m;
                                            if (!z4 || tVarD.f4078l) {
                                                w(tVarD, true);
                                                z10 = z4;
                                            } else {
                                                if (tVarD.f4077k) {
                                                    if (tVarD.f4081o) {
                                                        tVarD.f4077k = false;
                                                        zK = K(tVarD, keyEvent);
                                                    } else {
                                                        zK = true;
                                                    }
                                                    if (zK) {
                                                        I(tVarD, keyEvent);
                                                        z10 = true;
                                                    }
                                                }
                                                z10 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.C;
                                            actionBarOverlayLayout2.k();
                                            ActionMenuView actionMenuView2 = ((i3) actionBarOverlayLayout2.e).f6293a.f513a;
                                            if (actionMenuView2 == null || (jVar2 = actionMenuView2.E) == null || !jVar2.j()) {
                                                if (!this.f4088b0 && K(tVarD, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.C;
                                                    actionBarOverlayLayout3.k();
                                                    ActionMenuView actionMenuView3 = ((i3) actionBarOverlayLayout3.e).f6293a.f513a;
                                                    if (actionMenuView3 != null && (jVar = actionMenuView3.E) != null && jVar.l()) {
                                                        z10 = true;
                                                    }
                                                }
                                                z10 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.C;
                                                actionBarOverlayLayout4.k();
                                                ActionMenuView actionMenuView4 = ((i3) actionBarOverlayLayout4.e).f6293a.f513a;
                                                if (actionMenuView4 == null || (jVar3 = actionMenuView4.E) == null || !jVar3.h()) {
                                                    z10 = false;
                                                } else {
                                                    z10 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z4 = tVarD.f4079m;
                                        if (z4) {
                                        }
                                        w(tVarD, true);
                                        z10 = z4;
                                    }
                                    if (z10) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (H()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    qVar.f4065c = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.Y = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            tVarD2 = D(0);
                            if (!tVarD2.f4079m) {
                                K(tVarD2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.F == null) {
                            tVarD = D(0);
                            j1Var = this.C;
                            context = this.f4105v;
                            if (j1Var != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) j1Var;
                                actionBarOverlayLayout5.k();
                                toolbar = ((i3) actionBarOverlayLayout5.e).f6293a;
                                if (toolbar.getVisibility() == 0) {
                                    z4 = tVarD.f4079m;
                                    if (z4) {
                                    }
                                    w(tVarD, true);
                                    z10 = z4;
                                } else {
                                    z4 = tVarD.f4079m;
                                    if (z4) {
                                    }
                                    w(tVarD, true);
                                    z10 = z4;
                                }
                            } else {
                                z4 = tVarD.f4079m;
                                if (z4) {
                                }
                                w(tVarD, true);
                                z10 = z4;
                            }
                            if (z10) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (H()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void z(int i) {
        t tVarD = D(i);
        if (tVarD.h != null) {
            Bundle bundle = new Bundle();
            tVarD.h.t(bundle);
            if (bundle.size() > 0) {
                tVarD.f4082p = bundle;
            }
            tVarD.h.w();
            tVarD.h.clear();
        }
        tVarD.f4081o = true;
        tVarD.f4080n = true;
        if ((i == 108 || i == 0) && this.C != null) {
            t tVarD2 = D(0);
            tVarD2.f4077k = false;
            K(tVarD2, null);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
