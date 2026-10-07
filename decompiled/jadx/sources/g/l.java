package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f4051a = new a0(new b0(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f4052b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m0.k f4053c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static m0.k f4054d = null;
    public static Boolean e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f4055f = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r.f f4056r = new r.f(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f4057s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f4058t = new Object();

    public static void a() {
        m0.k kVar;
        r.f fVar = f4056r;
        fVar.getClass();
        r.a aVar = new r.a(fVar);
        while (aVar.hasNext()) {
            l lVar = (l) ((WeakReference) aVar.next()).get();
            if (lVar != null) {
                u uVar = (u) lVar;
                Context context = uVar.f4105v;
                if (f(context) && (kVar = f4053c) != null && !kVar.equals(f4054d)) {
                    f4051a.execute(new i(context, 1));
                }
                uVar.r(true, true);
            }
        }
    }

    public static m0.k b() {
        if (m0.b.c()) {
            Object objC = c();
            if (objC != null) {
                return new m0.k(new m0.l(k.a(objC)));
            }
        } else {
            m0.k kVar = f4053c;
            if (kVar != null) {
                return kVar;
            }
        }
        return m0.k.f6971b;
    }

    public static Object c() {
        Context context;
        r.f fVar = f4056r;
        fVar.getClass();
        r.a aVar = new r.a(fVar);
        while (aVar.hasNext()) {
            l lVar = (l) ((WeakReference) aVar.next()).get();
            if (lVar != null && (context = ((u) lVar).f4105v) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        if (e == null) {
            try {
                int i = z.f4121a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) z.class), y.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void k(u uVar) {
        synchronized (f4057s) {
            try {
                r.f fVar = f4056r;
                fVar.getClass();
                r.a aVar = new r.a(fVar);
                while (aVar.hasNext()) {
                    l lVar = (l) ((WeakReference) aVar.next()).get();
                    if (lVar == uVar || lVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void q(Context context) {
        if (f(context)) {
            if (m0.b.c()) {
                if (f4055f) {
                    return;
                }
                f4051a.execute(new i(context, 0));
                return;
            }
            synchronized (f4058t) {
                try {
                    m0.k kVar = f4053c;
                    if (kVar == null) {
                        if (f4054d == null) {
                            f4054d = m0.k.a(com.bumptech.glide.c.L(context));
                        }
                        if (f4054d.b()) {
                        } else {
                            f4053c = f4054d;
                        }
                    } else if (!kVar.equals(f4054d)) {
                        m0.k kVar2 = f4053c;
                        f4054d = kVar2;
                        com.bumptech.glide.c.C(context, kVar2.c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void d();

    public abstract void e();

    public abstract void h();

    public abstract void i();

    public abstract boolean l(int i);

    public abstract void m(int i);

    public abstract void n(View view);

    public abstract void o(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void p(CharSequence charSequence);
}
