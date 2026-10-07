package n9;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m0.o;
import x9.m;
import y9.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f7357k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r.e f7358l = new r.e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f7361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.f f7362d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f7364g;
    public final ya.b h;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7363f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f7365j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, String str, j jVar) {
        ?? arrayList;
        int i = 0;
        this.f7359a = context;
        i0.e(str);
        this.f7360b = str;
        i0.i(jVar);
        this.f7361c = jVar;
        a aVar = FirebaseInitProvider.f2738a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new x9.d((String) it.next(), i));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f10666a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 1;
        arrayList3.add(new x9.d(new FirebaseCommonRegistrar(), i10));
        arrayList3.add(new x9.d(new ExecutorsRegistrar(), i10));
        arrayList4.add(x9.b.b(context, Context.class, new Class[0]));
        arrayList4.add(x9.b.b(this, g.class, new Class[0]));
        arrayList4.add(x9.b.b(jVar, j.class, new Class[0]));
        wa.d dVar = new wa.d();
        if (o.a(context) && FirebaseInitProvider.f2739b.get()) {
            arrayList4.add(x9.b.b(aVar, a.class, new Class[0]));
        }
        x9.f fVar = new x9.f(arrayList3, arrayList4, dVar);
        this.f7362d = fVar;
        Trace.endSection();
        this.f7364g = new m(new c(i, this, context));
        this.h = fVar.d(wa.c.class);
        d dVar2 = new d(this);
        a();
        if (this.e.get()) {
            com.google.android.gms.common.api.internal.c.e.f2067a.get();
        }
        this.i.add(dVar2);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f7357k) {
            try {
                for (g gVar : (r.d) f7358l.values()) {
                    gVar.a();
                    arrayList.add(gVar.f7360b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g d() {
        g gVar;
        synchronized (f7357k) {
            try {
                gVar = (g) f7358l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + n7.f.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((wa.c) gVar.h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g e(String str) {
        g gVar;
        String str2;
        synchronized (f7357k) {
            try {
                gVar = (g) f7358l.get(str.trim());
                if (gVar == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((wa.c) gVar.h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g h(Context context) {
        synchronized (f7357k) {
            try {
                if (f7358l.containsKey("[DEFAULT]")) {
                    return d();
                }
                j jVarA = j.a(context);
                if (jVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, "[DEFAULT]", jVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g i(Context context, String str, j jVar) {
        g gVar;
        AtomicReference atomicReference = e.f7354a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f7354a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                do {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.e.a(eVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7357k) {
            r.e eVar2 = f7358l;
            i0.k("FirebaseApp name " + strTrim + " already exists!", !eVar2.containsKey(strTrim));
            i0.j(context, "Application context cannot be null.");
            gVar = new g(context, strTrim, jVar);
            eVar2.put(strTrim, gVar);
        }
        gVar.g();
        return gVar;
    }

    public final void a() {
        i0.k("FirebaseApp was deleted", !this.f7363f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f7362d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f7360b.equals(gVar.f7360b);
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f7360b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f7361c.f7367b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void g() {
        HashMap map;
        if (!o.a(this.f7359a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f7360b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f7359a;
            AtomicReference atomicReference = f.f7355b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f7360b);
        Log.i("FirebaseApp", sb3.toString());
        x9.f fVar2 = this.f7362d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f7360b);
        AtomicReference atomicReference2 = fVar2.e;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((wa.c) this.h.get()).a();
            }
        }
        synchronized (fVar2) {
            map = new HashMap(fVar2.f10324a);
        }
        fVar2.i(map, zEquals);
        ((wa.c) this.h.get()).a();
    }

    public final int hashCode() {
        return this.f7360b.hashCode();
    }

    public final boolean j() {
        boolean z4;
        a();
        db.a aVar = (db.a) this.f7364g.get();
        synchronized (aVar) {
            z4 = aVar.f3176a;
        }
        return z4;
    }

    public final String toString() {
        aa.c cVar = new aa.c((Object) this);
        cVar.b(this.f7360b, "name");
        cVar.b(this.f7361c, "options");
        return cVar.toString();
    }
}
