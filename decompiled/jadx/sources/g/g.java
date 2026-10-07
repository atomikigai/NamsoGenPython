package g;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.i3;
import l.k2;
import l.n3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends androidx.fragment.app.w implements h {
    public u J;

    public g() {
        ((f2.d) this.e.f1939d).f("androidx:appcompat", new androidx.fragment.app.t(this, 2));
        j(new androidx.fragment.app.u(this, 1));
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        u uVar = (u) r();
        uVar.A();
        ((ViewGroup) uVar.L.findViewById(R.id.content)).addView(view, layoutParams);
        uVar.f4107x.a(uVar.f4106w.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:107:0x019b A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #6 {, blocks: (B:98:0x017d, B:100:0x0181, B:106:0x0199, B:107:0x019b, B:109:0x019f, B:115:0x01af, B:114:0x01a6, B:105:0x0192), top: B:133:0x017d, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:73:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:0x0132  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    /* JADX WARN: Code duplicated, block: B:96:0x017a  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i;
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        j.d dVar;
        Resources.Theme theme;
        Method method;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        u uVar = (u) r();
        uVar.Z = true;
        int i46 = uVar.f4090d0;
        if (i46 == -100) {
            i46 = l.f4052b;
        }
        int iG = uVar.G(context, i46);
        if (l.f(context)) {
            l.q(context);
        }
        m0.k kVarT = u.t(context);
        if (u.f4086v0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(u.x(context, iG, kVarT, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof j.d) {
                    ((j.d) context).a(u.x(context, iG, kVarT, null, false));
                } else if (u.f4085u0) {
                    i = Build.VERSION.SDK_INT;
                    Configuration configuration4 = new Configuration();
                    configuration4.uiMode = -1;
                    configuration4.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = null;
                    } else {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            o.a(configuration, configuration2, configuration3);
                            i14 = configuration.touchscreen;
                            i15 = configuration2.touchscreen;
                            if (i14 != i15) {
                                configuration3.touchscreen = i15;
                            }
                            i16 = configuration.keyboard;
                            i17 = configuration2.keyboard;
                            if (i16 != i17) {
                                configuration3.keyboard = i17;
                            }
                            i18 = configuration.keyboardHidden;
                            i19 = configuration2.keyboardHidden;
                            if (i18 != i19) {
                                configuration3.keyboardHidden = i19;
                            }
                            i20 = configuration.navigation;
                            i21 = configuration2.navigation;
                            if (i20 != i21) {
                                configuration3.navigation = i21;
                            }
                            i22 = configuration.navigationHidden;
                            i23 = configuration2.navigationHidden;
                            if (i22 != i23) {
                                configuration3.navigationHidden = i23;
                            }
                            i24 = configuration.orientation;
                            i25 = configuration2.orientation;
                            if (i24 != i25) {
                                configuration3.orientation = i25;
                            }
                            i26 = configuration.screenLayout & 15;
                            i27 = configuration2.screenLayout & 15;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & 192;
                            i29 = configuration2.screenLayout & 192;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 48;
                            i31 = configuration2.screenLayout & 48;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            i32 = configuration.screenLayout & 768;
                            i33 = configuration2.screenLayout & 768;
                            if (i32 != i33) {
                                configuration3.screenLayout |= i33;
                            }
                            if (i >= 26) {
                                p7.a.a(configuration, configuration2, configuration3);
                            }
                            i34 = configuration.uiMode & 15;
                            i35 = configuration2.uiMode & 15;
                            if (i34 != i35) {
                                configuration3.uiMode |= i35;
                            }
                            i36 = configuration.uiMode & 48;
                            i37 = configuration2.uiMode & 48;
                            if (i36 != i37) {
                                configuration3.uiMode |= i37;
                            }
                            i38 = configuration.screenWidthDp;
                            i39 = configuration2.screenWidthDp;
                            if (i38 != i39) {
                                configuration3.screenWidthDp = i39;
                            }
                            i40 = configuration.screenHeightDp;
                            i41 = configuration2.screenHeightDp;
                            if (i40 != i41) {
                                configuration3.screenHeightDp = i41;
                            }
                            i42 = configuration.smallestScreenWidthDp;
                            i43 = configuration2.smallestScreenWidthDp;
                            if (i42 != i43) {
                                configuration3.smallestScreenWidthDp = i43;
                            }
                            i44 = configuration.densityDpi;
                            i45 = configuration2.densityDpi;
                            if (i44 != i45) {
                                configuration3.densityDpi = i45;
                            }
                        }
                    }
                    Configuration configurationX = u.x(context, iG, kVarT, configuration3, true);
                    dVar = new j.d(context, app.namso_gen.spacehowen.R.style.Theme_AppCompat_Empty);
                    dVar.a(configurationX);
                    if (context.getTheme() != null) {
                        theme = dVar.getTheme();
                        if (i >= 29) {
                            g0.m.a(theme);
                        } else {
                            synchronized (g0.b.e) {
                                if (g0.b.f4132g) {
                                    method = g0.b.f4131f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    g0.b.f4131f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                    g0.b.f4132g = true;
                                    method = g0.b.f4131f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = dVar;
                }
            }
        } else if (context instanceof j.d) {
            try {
                ((j.d) context).a(u.x(context, iG, kVarT, null, false));
            } catch (IllegalStateException unused2) {
                if (u.f4085u0) {
                    i = Build.VERSION.SDK_INT;
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            o.a(configuration, configuration2, configuration3);
                            i14 = configuration.touchscreen;
                            i15 = configuration2.touchscreen;
                            if (i14 != i15) {
                                configuration3.touchscreen = i15;
                            }
                            i16 = configuration.keyboard;
                            i17 = configuration2.keyboard;
                            if (i16 != i17) {
                                configuration3.keyboard = i17;
                            }
                            i18 = configuration.keyboardHidden;
                            i19 = configuration2.keyboardHidden;
                            if (i18 != i19) {
                                configuration3.keyboardHidden = i19;
                            }
                            i20 = configuration.navigation;
                            i21 = configuration2.navigation;
                            if (i20 != i21) {
                                configuration3.navigation = i21;
                            }
                            i22 = configuration.navigationHidden;
                            i23 = configuration2.navigationHidden;
                            if (i22 != i23) {
                                configuration3.navigationHidden = i23;
                            }
                            i24 = configuration.orientation;
                            i25 = configuration2.orientation;
                            if (i24 != i25) {
                                configuration3.orientation = i25;
                            }
                            i26 = configuration.screenLayout & 15;
                            i27 = configuration2.screenLayout & 15;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & 192;
                            i29 = configuration2.screenLayout & 192;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 48;
                            i31 = configuration2.screenLayout & 48;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            i32 = configuration.screenLayout & 768;
                            i33 = configuration2.screenLayout & 768;
                            if (i32 != i33) {
                                configuration3.screenLayout |= i33;
                            }
                            if (i >= 26) {
                                p7.a.a(configuration, configuration2, configuration3);
                            }
                            i34 = configuration.uiMode & 15;
                            i35 = configuration2.uiMode & 15;
                            if (i34 != i35) {
                                configuration3.uiMode |= i35;
                            }
                            i36 = configuration.uiMode & 48;
                            i37 = configuration2.uiMode & 48;
                            if (i36 != i37) {
                                configuration3.uiMode |= i37;
                            }
                            i38 = configuration.screenWidthDp;
                            i39 = configuration2.screenWidthDp;
                            if (i38 != i39) {
                                configuration3.screenWidthDp = i39;
                            }
                            i40 = configuration.screenHeightDp;
                            i41 = configuration2.screenHeightDp;
                            if (i40 != i41) {
                                configuration3.screenHeightDp = i41;
                            }
                            i42 = configuration.smallestScreenWidthDp;
                            i43 = configuration2.smallestScreenWidthDp;
                            if (i42 != i43) {
                                configuration3.smallestScreenWidthDp = i43;
                            }
                            i44 = configuration.densityDpi;
                            i45 = configuration2.densityDpi;
                            if (i44 != i45) {
                                configuration3.densityDpi = i45;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationX2 = u.x(context, iG, kVarT, configuration3, true);
                    dVar = new j.d(context, app.namso_gen.spacehowen.R.style.Theme_AppCompat_Empty);
                    dVar.a(configurationX2);
                    try {
                        if (context.getTheme() != null) {
                            theme = dVar.getTheme();
                            if (i >= 29) {
                                g0.m.a(theme);
                            } else {
                                synchronized (g0.b.e) {
                                    if (g0.b.f4132g) {
                                        try {
                                            Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                            g0.b.f4131f = declaredMethod2;
                                            declaredMethod2.setAccessible(true);
                                        } catch (NoSuchMethodException e) {
                                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                        }
                                        g0.b.f4132g = true;
                                        method = g0.b.f4131f;
                                        if (method != null) {
                                            try {
                                                method.invoke(theme, null);
                                            } catch (IllegalAccessException | InvocationTargetException e4) {
                                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e4);
                                                g0.b.f4131f = null;
                                            }
                                        }
                                    } else {
                                        method = g0.b.f4131f;
                                        if (method != null) {
                                            method.invoke(theme, null);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (NullPointerException unused3) {
                    }
                    context = dVar;
                }
            }
        } else if (u.f4085u0) {
            i = Build.VERSION.SDK_INT;
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f10 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f10 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i10 = configuration.mcc;
                    i11 = configuration2.mcc;
                    if (i10 != i11) {
                        configuration3.mcc = i11;
                    }
                    i12 = configuration.mnc;
                    i13 = configuration2.mnc;
                    if (i12 != i13) {
                        configuration3.mnc = i13;
                    }
                    o.a(configuration, configuration2, configuration3);
                    i14 = configuration.touchscreen;
                    i15 = configuration2.touchscreen;
                    if (i14 != i15) {
                        configuration3.touchscreen = i15;
                    }
                    i16 = configuration.keyboard;
                    i17 = configuration2.keyboard;
                    if (i16 != i17) {
                        configuration3.keyboard = i17;
                    }
                    i18 = configuration.keyboardHidden;
                    i19 = configuration2.keyboardHidden;
                    if (i18 != i19) {
                        configuration3.keyboardHidden = i19;
                    }
                    i20 = configuration.navigation;
                    i21 = configuration2.navigation;
                    if (i20 != i21) {
                        configuration3.navigation = i21;
                    }
                    i22 = configuration.navigationHidden;
                    i23 = configuration2.navigationHidden;
                    if (i22 != i23) {
                        configuration3.navigationHidden = i23;
                    }
                    i24 = configuration.orientation;
                    i25 = configuration2.orientation;
                    if (i24 != i25) {
                        configuration3.orientation = i25;
                    }
                    i26 = configuration.screenLayout & 15;
                    i27 = configuration2.screenLayout & 15;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    i28 = configuration.screenLayout & 192;
                    i29 = configuration2.screenLayout & 192;
                    if (i28 != i29) {
                        configuration3.screenLayout |= i29;
                    }
                    i30 = configuration.screenLayout & 48;
                    i31 = configuration2.screenLayout & 48;
                    if (i30 != i31) {
                        configuration3.screenLayout |= i31;
                    }
                    i32 = configuration.screenLayout & 768;
                    i33 = configuration2.screenLayout & 768;
                    if (i32 != i33) {
                        configuration3.screenLayout |= i33;
                    }
                    if (i >= 26) {
                        p7.a.a(configuration, configuration2, configuration3);
                    }
                    i34 = configuration.uiMode & 15;
                    i35 = configuration2.uiMode & 15;
                    if (i34 != i35) {
                        configuration3.uiMode |= i35;
                    }
                    i36 = configuration.uiMode & 48;
                    i37 = configuration2.uiMode & 48;
                    if (i36 != i37) {
                        configuration3.uiMode |= i37;
                    }
                    i38 = configuration.screenWidthDp;
                    i39 = configuration2.screenWidthDp;
                    if (i38 != i39) {
                        configuration3.screenWidthDp = i39;
                    }
                    i40 = configuration.screenHeightDp;
                    i41 = configuration2.screenHeightDp;
                    if (i40 != i41) {
                        configuration3.screenHeightDp = i41;
                    }
                    i42 = configuration.smallestScreenWidthDp;
                    i43 = configuration2.smallestScreenWidthDp;
                    if (i42 != i43) {
                        configuration3.smallestScreenWidthDp = i43;
                    }
                    i44 = configuration.densityDpi;
                    i45 = configuration2.densityDpi;
                    if (i44 != i45) {
                        configuration3.densityDpi = i45;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationX3 = u.x(context, iG, kVarT, configuration3, true);
            dVar = new j.d(context, app.namso_gen.spacehowen.R.style.Theme_AppCompat_Empty);
            dVar.a(configurationX3);
            if (context.getTheme() != null) {
                theme = dVar.getTheme();
                if (i >= 29) {
                    g0.m.a(theme);
                } else {
                    synchronized (g0.b.e) {
                        if (g0.b.f4132g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            g0.b.f4131f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            g0.b.f4132g = true;
                            method = g0.b.f4131f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = g0.b.f4131f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((u) r()).E();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // d0.i, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((u) r()).E();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d0.i
    public final void e() {
        r().e();
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        u uVar = (u) r();
        uVar.A();
        return uVar.f4106w.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        u uVar = (u) r();
        if (uVar.A == null) {
            uVar.E();
            h0 h0Var = uVar.f4109z;
            uVar.A = new j.i(h0Var != null ? h0Var.u() : uVar.f4105v);
        }
        return uVar.A;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = n3.f6374a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        r().e();
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u uVar = (u) r();
        if (uVar.Q && uVar.K) {
            uVar.E();
            h0 h0Var = uVar.f4109z;
            if (h0Var != null) {
                h0Var.x(h0Var.f4028a.getResources().getBoolean(app.namso_gen.spacehowen.R.bool.abc_action_bar_embed_tabs));
            }
        }
        l.r rVarA = l.r.a();
        Context context = uVar.f4105v;
        synchronized (rVarA) {
            k2 k2Var = rVarA.f6405a;
            synchronized (k2Var) {
                r.h hVar = (r.h) k2Var.f6328b.get(context);
                if (hVar != null) {
                    hVar.a();
                }
            }
        }
        uVar.f4089c0 = new Configuration(uVar.f4105v.getResources().getConfiguration());
        uVar.r(false, false);
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r().i();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentA;
        if (!super.onMenuItemSelected(i, menuItem)) {
            u uVar = (u) r();
            uVar.E();
            h0 h0Var = uVar.f4109z;
            if (menuItem.getItemId() != 16908332 || h0Var == null || (((i3) h0Var.e).f6294b & 4) == 0 || (intentA = d0.f.a(this)) == null) {
                return false;
            }
            if (!d0.k.c(this, intentA)) {
                d0.k.b(this, intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = d0.f.a(this);
            if (intentA2 == null) {
                intentA2 = d0.f.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = d0.f.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = d0.f.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!e0.k.startActivities(this, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
            }
            try {
                d0.a.a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((u) r()).A();
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        u uVar = (u) r();
        uVar.E();
        h0 h0Var = uVar.f4109z;
        if (h0Var != null) {
            h0Var.f4044t = true;
        }
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((u) r()).r(true, false);
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public void onStop() {
        super.onStop();
        u uVar = (u) r();
        uVar.E();
        h0 h0Var = uVar.f4109z;
        if (h0Var != null) {
            h0Var.f4044t = false;
            j.k kVar = h0Var.f4043s;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        r().p(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((u) r()).E();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final l r() {
        if (this.J == null) {
            a0 a0Var = l.f4051a;
            this.J = new u(this, null, this, this);
        }
        return this.J;
    }

    public final void s() {
        View decorView = getWindow().getDecorView();
        jc.i.e(decorView, "<this>");
        decorView.setTag(app.namso_gen.spacehowen.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        jc.i.e(decorView2, "<this>");
        decorView2.setTag(app.namso_gen.spacehowen.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        jc.i.e(decorView3, "<this>");
        decorView3.setTag(app.namso_gen.spacehowen.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        jc.i.e(decorView4, "<this>");
        decorView4.setTag(app.namso_gen.spacehowen.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(int i) {
        s();
        r().m(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((u) r()).f4091e0 = i;
    }

    @Override // androidx.activity.m, android.app.Activity
    public void setContentView(View view) {
        s();
        r().n(view);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        r().o(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
