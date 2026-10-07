package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import androidx.fragment.app.w;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.r;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o6.h0;
import p4.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile b f1837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile boolean f1838t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.a f1839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.c f1840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f1841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x3.f f1842d;
    public final m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.d f1843f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f1844r = new ArrayList();

    public b(Context context, w3.k kVar, y3.c cVar, x3.a aVar, x3.f fVar, m mVar, wa.d dVar, wa.d dVar2, r.e eVar, List list, ArrayList arrayList, a.a aVar2, a5.b bVar) {
        this.f1839a = aVar;
        this.f1842d = fVar;
        this.f1840b = cVar;
        this.e = mVar;
        this.f1843f = dVar;
        this.f1841c = new e(context, fVar, new r(this, arrayList, aVar2), new z9.c(), dVar2, eVar, list, kVar, bVar);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f1837s == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            }
            synchronized (b.class) {
                if (f1837s == null) {
                    if (f1838t) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f1838t = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f1838t = false;
                    } catch (Throwable th) {
                        f1838t = false;
                        throw th;
                    }
                }
            }
        }
        return f1837s;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        r.e eVar = new r.e(0);
        ib.c cVar = new ib.c(9);
        wa.d dVar = new wa.d();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        android.support.v4.media.session.a.s(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw q1.a.g(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw q1.a.g(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw q1.a.g(it3);
        }
        z3.a aVar = new z3.a();
        if (z3.d.f10966c == 0) {
            z3.d.f10966c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = z3.d.f10966c;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        z3.d dVar2 = new z3.d(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new z3.b(aVar, "source", false)));
        z3.a aVar2 = new z3.a();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        z3.d dVar3 = new z3.d(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new z3.b(aVar2, "disk-cache", true)));
        if (z3.d.f10966c == 0) {
            z3.d.f10966c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i10 = z3.d.f10966c >= 4 ? 2 : 1;
        z3.a aVar3 = new z3.a();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        z3.d dVar4 = new z3.d(new ThreadPoolExecutor(i10, i10, 0L, timeUnit, new PriorityBlockingQueue(), new z3.b(aVar3, "animation", true)));
        y3.d dVar5 = new y3.d(applicationContext);
        r7.d dVar6 = new r7.d();
        Context context2 = dVar5.f10548a;
        float f10 = dVar5.f10551d;
        ActivityManager activityManager = dVar5.f10549b;
        int i11 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        dVar6.f8198c = i11;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) dVar5.f10550c.f7990a;
        float f11 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f11 * f10);
        int iRound3 = Math.round(f11 * 2.0f);
        int i12 = iRound - i11;
        int i13 = iRound3 + iRound2;
        if (i13 <= i12) {
            dVar6.f8197b = iRound3;
            dVar6.f8196a = iRound2;
        } else {
            float f12 = i12 / (f10 + 2.0f);
            dVar6.f8197b = Math.round(2.0f * f12);
            dVar6.f8196a = Math.round(f12 * f10);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context2, dVar6.f8197b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context2, dVar6.f8196a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context2, i11));
            sb2.append(", memory class limited? ");
            sb2.append(i13 > iRound);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context2, iRound));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
        wa.d dVar7 = new wa.d();
        int i14 = dVar6.f8196a;
        x3.a gVar = i14 > 0 ? new x3.g(i14) : new r7.j();
        x3.f fVar = new x3.f(dVar6.f8198c);
        y3.c cVar2 = new y3.c(dVar6.f8197b);
        b bVar = new b(applicationContext, new w3.k(cVar2, new h0(applicationContext), dVar3, dVar2, new z3.d(new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, z3.d.f10965b, timeUnit, new SynchronousQueue(), new z3.b(new z3.a(), "source-unlimited", false))), dVar4), cVar2, gVar, fVar, new m(), dVar7, dVar, eVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new a5.b(cVar));
        applicationContext.registerComponentCallbacks(bVar);
        f1837s = bVar;
    }

    public static l c(View view) {
        View view2;
        Context context = view.getContext();
        p4.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m mVar = a(context).e;
        mVar.getClass();
        char[] cArr = n.f7811a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return mVar.c(view.getContext().getApplicationContext());
        }
        p4.f.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = m.a(view.getContext());
        if (activityA == null) {
            return mVar.c(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof w)) {
            return mVar.c(view.getContext().getApplicationContext());
        }
        w wVar = (w) activityA;
        r.e eVar = mVar.f1925b;
        eVar.clear();
        m.b(wVar.p().f879c.x(), eVar);
        View viewFindViewById = wVar.findViewById(R.id.content);
        s sVar = null;
        while (!view.equals(viewFindViewById) && (sVar = (s) eVar.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        eVar.clear();
        if (sVar == null) {
            return mVar.d(wVar);
        }
        p4.f.c(sVar.r(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return mVar.c(sVar.r().getApplicationContext());
        }
        if (sVar.g() != null) {
            mVar.f1926c.b(sVar.g());
        }
        i0 i0VarQ = sVar.q();
        Context contextR = sVar.r();
        return mVar.f1927d.a(contextR, a(contextR.getApplicationContext()), sVar.X, i0VarQ, (!sVar.y() || sVar.J || (view2 = sVar.P) == null || view2.getWindowToken() == null || sVar.P.getVisibility() != 0) ? false : true);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        n.a();
        this.f1840b.e(0L);
        this.f1839a.l();
        x3.f fVar = this.f1842d;
        synchronized (fVar) {
            fVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j4;
        n.a();
        synchronized (this.f1844r) {
            try {
                ArrayList arrayList = this.f1844r;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((l) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y3.c cVar = this.f1840b;
        cVar.getClass();
        if (i >= 40) {
            cVar.e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (cVar) {
                j4 = cVar.f7804b;
            }
            cVar.e(j4 / 2);
        }
        this.f1839a.j(i);
        x3.f fVar = this.f1842d;
        synchronized (fVar) {
            try {
                if (i >= 40) {
                    synchronized (fVar) {
                        fVar.b(0);
                    }
                } else if (i >= 20 || i == 15) {
                    fVar.b(fVar.e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
