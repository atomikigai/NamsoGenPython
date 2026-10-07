package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import d6.p;
import e6.t;
import h6.b0;
import h6.r0;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzayn implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) t.f3437d.f3440c.zza(zzbcn.zzbt)).longValue();
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzayz zzj;
    private final b0 zzk = new b0(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet zzn = new HashSet();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzayn(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zze = application;
            this.zzj = new zzayz(application, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzb;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int zzh(int i) {
        return (int) (i / this.zzo.density);
    }

    private final void zzi(Activity activity, int i) {
        Window window;
        if (this.zzb == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.zzb;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzm = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134 A[PHI: r12 r13
      0x0134: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v1 boolean), (r12v1 boolean) binds: [B:59:0x013d, B:61:0x0147, B:55:0x0132, B:46:0x0108, B:48:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v4 boolean), (r13v1 boolean), (r13v1 boolean) binds: [B:59:0x013d, B:61:0x0147, B:55:0x0132, B:46:0x0108, B:48:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    public final void zzj(int i) throws Throwable {
        WeakReference weakReference;
        View view;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        ?? arrayList;
        int i10;
        int i11;
        View view2;
        boolean z4;
        ?? r18;
        if (this.zzn.isEmpty() || (weakReference = this.zzb) == null) {
            return;
        }
        View view3 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view3 != null) {
            globalVisibleRect = view3.getGlobalVisibleRect(rect2);
            localVisibleRect = view3.getLocalVisibleRect(rect3);
            view3.getHitRect(rect4);
            try {
                view3.getLocationOnScreen(iArr);
                view3.getLocationInWindow(iArr2);
            } catch (Exception e) {
                h.e("Failure getting view location.", e);
            }
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeT)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = view3.getWidth() + rect.left;
            rect.bottom = view3.getHeight() + rect.top;
            view = view3;
        } else {
            view = null;
            globalVisibleRect = false;
            localVisibleRect = false;
        }
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbw)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view4 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view4.isScrollContainer() && view4.getGlobalVisibleRect(rect5)) {
                        arrayList.add(zza(rect5));
                    }
                }
            } catch (Exception e4) {
                p.C.f2982g.zzw(e4, "PositionWatcher.getParentScrollViewRects");
                arrayList = Collections.EMPTY_LIST;
            }
        }
        ?? r31 = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i12 = this.zzm;
        if (i12 != -1) {
            windowVisibility = i12;
        }
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        long jI = r0.I(view);
        zzbce zzbceVar = zzbcn.zzkj;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (view3 == null || !r0.o(view, this.zzg, this.zzh)) {
                i10 = 0;
            } else if (!globalVisibleRect) {
                i10 = 0;
                globalVisibleRect = false;
            } else if (!localVisibleRect) {
                globalVisibleRect = true;
                i10 = 0;
                localVisibleRect = false;
            } else if (jI < ((Integer) tVar.f3440c.zza(zzbcn.zzkm)).intValue() || windowVisibility != 0) {
                globalVisibleRect = true;
                localVisibleRect = true;
                i10 = 0;
            } else {
                i10 = 1;
                globalVisibleRect = true;
                localVisibleRect = true;
                windowVisibility = 0;
            }
        } else if (view3 == null || !r0.o(view, this.zzg, this.zzh)) {
            i10 = 0;
        } else if (!globalVisibleRect) {
            i10 = 0;
            globalVisibleRect = false;
        } else if (!localVisibleRect) {
            globalVisibleRect = true;
            i10 = 0;
            localVisibleRect = false;
        } else if (windowVisibility == 0) {
            i10 = 1;
            globalVisibleRect = true;
            localVisibleRect = true;
            windowVisibility = 0;
        } else {
            globalVisibleRect = true;
            localVisibleRect = true;
            i10 = 0;
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzko)).booleanValue()) {
            int i13 = true != r0.o(view, this.zzg, this.zzh) ? 0 : 64;
            int i14 = true != globalVisibleRect ? 0 : 8;
            r18 = true != localVisibleRect ? 0 : 16;
            r0.h(view, (jI >= ((long) ((Integer) tVar.f3440c.zza(zzbcn.zzkm)).intValue()) ? 32 : 0) | i13 | i14 | r18 | (windowVisibility == 0 ? 128 : 0) | i10);
            i11 = 1;
        } else {
            i11 = 1;
        }
        if (i == i11) {
            b0 b0Var = this.zzk;
            Object obj = b0Var.f4975c;
            synchronized (obj) {
                try {
                    try {
                        pVar.f2983j.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        view2 = view;
                        if (b0Var.f4974b + b0Var.f4973a <= jElapsedRealtime) {
                            b0Var.f4974b = jElapsedRealtime;
                        } else if (i10 == this.zzl) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r18 = obj;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } else {
            view2 = view;
        }
        if (i10 != 0 || this.zzl) {
            z4 = true;
        } else {
            z4 = true;
            if (i == 1) {
                return;
            }
        }
        pVar.f2983j.getClass();
        View view5 = view2;
        ?? r30 = i10;
        zzayl zzaylVar = new zzayl(SystemClock.elapsedRealtime(), this.zzg.isScreenOn(), (view5 == null || !view5.isAttachedToWindow()) ? false : z4, view5 != null ? view5.getWindowVisibility() : 8, zza(this.zzp), zza(rect), zza(rect2), globalVisibleRect, zza(rect3), localVisibleRect, jI, zza(rect4), this.zzo.density, r30, r31);
        Iterator it = this.zzn.iterator();
        while (it.hasNext()) {
            ((zzaym) it.next()).zzdp(zzaylVar);
        }
        this.zzl = r30;
    }

    private final void zzk() {
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzayj
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzd();
            }
        });
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzayk zzaykVar = new zzayk(this);
            this.zza = zzaykVar;
            p.C.f2999z.b(this.zzd, zzaykVar, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e) {
                h.e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e) {
            h.e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e4) {
            h.e("Error while unregistering listeners from the ViewTreeObserver.", e4);
        }
        BroadcastReceiver broadcastReceiver = this.zza;
        if (broadcastReceiver != null) {
            try {
                p.C.f2999z.c(this.zzd, broadcastReceiver);
            } catch (IllegalStateException e10) {
                h.e("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                p.C.f2982g.zzw(e11, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e12) {
                h.e("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) throws Throwable {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) throws Throwable {
        zzi(activity, 4);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws Throwable {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) throws Throwable {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) throws Throwable {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) throws Throwable {
        zzj(3);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws Throwable {
        zzj(2);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() throws Throwable {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws Throwable {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws Throwable {
        this.zzm = -1;
        zzj(3);
        zzk();
        zzm(view);
    }

    public final Rect zza(Rect rect) {
        return new Rect(zzh(rect.left), zzh(rect.top), zzh(rect.right), zzh(rect.bottom));
    }

    public final void zzc(zzaym zzaymVar) throws Throwable {
        this.zzn.add(zzaymVar);
        zzj(3);
    }

    public final /* synthetic */ void zzd() throws Throwable {
        zzj(3);
    }

    public final void zze(zzaym zzaymVar) {
        this.zzn.remove(zzaymVar);
    }

    public final void zzf() {
        b0 b0Var = this.zzk;
        long j4 = zzc;
        synchronized (b0Var.f4975c) {
            b0Var.f4973a = j4;
        }
    }

    public final void zzg(long j4) {
        b0 b0Var = this.zzk;
        synchronized (b0Var.f4975c) {
            b0Var.f4973a = j4;
        }
    }
}
