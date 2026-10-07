package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements p4.g {
    public static volatile r e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1939d;

    public r() {
        this.f1936a = 3;
        this.f1938c = Collections.newSetFromMap(new WeakHashMap());
        this.f1939d = new HashSet();
    }

    public static r b(Context context) {
        if (e == null) {
            synchronized (r.class) {
                try {
                    if (e == null) {
                        e = new r(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public boolean a(l4.c cVar) {
        boolean z4 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f1938c).remove(cVar);
        if (!((HashSet) this.f1939d).remove(cVar) && !zRemove) {
            z4 = false;
        }
        if (z4) {
            cVar.clear();
        }
        return z4;
    }

    public void c() {
        if (this.f1937b || ((HashSet) this.f1939d).isEmpty()) {
            return;
        }
        q qVar = (q) this.f1938c;
        g7.i iVar = (g7.i) qVar.f1934c;
        boolean z4 = false;
        qVar.f1932a = ((ConnectivityManager) iVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) iVar.get()).registerDefaultNetworkCallback((a3.g) qVar.f1935d);
            z4 = true;
        } catch (RuntimeException e4) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e4);
            }
        }
        this.f1937b = z4;
    }

    public void d() {
        f2.e eVar = (f2.e) this.f1938c;
        t tVarL = eVar.l();
        if (tVarL.f1093d != androidx.lifecycle.m.f1066b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        tVarL.a(new Recreator(eVar));
        final f2.d dVar = (f2.d) this.f1939d;
        dVar.getClass();
        if (dVar.f3580a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        tVarL.a(new androidx.lifecycle.p() { // from class: f2.a
            @Override // androidx.lifecycle.p
            public final void a(r rVar, l lVar) {
                d dVar2 = dVar;
                i.e(dVar2, "this$0");
                if (lVar == l.ON_START) {
                    dVar2.f3582c = true;
                } else if (lVar == l.ON_STOP) {
                    dVar2.f3582c = false;
                }
            }
        });
        dVar.f3580a = true;
        this.f1937b = true;
    }

    public void e(Bundle bundle) {
        if (!this.f1937b) {
            d();
        }
        t tVarL = ((f2.e) this.f1938c).l();
        if (tVarL.f1093d.compareTo(androidx.lifecycle.m.f1068d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + tVarL.f1093d).toString());
        }
        f2.d dVar = (f2.d) this.f1939d;
        if (!dVar.f3580a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f3581b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f3581b = true;
    }

    public void f(Bundle bundle) {
        jc.i.e(bundle, "outBundle");
        f2.d dVar = (f2.d) this.f1939d;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.f3583d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f7129c.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((f2.c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // p4.g
    public Object get() {
        if (this.f1937b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f1937b = true;
        try {
            return p3.a.i((com.bumptech.glide.b) this.f1938c, (ArrayList) this.f1939d);
        } finally {
            this.f1937b = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f1936a) {
            case 3:
                return super.toString() + "{numRequests=" + ((Set) this.f1938c).size() + ", isPaused=" + this.f1937b + "}";
            default:
                return super.toString();
        }
    }

    public r(f2.e eVar) {
        this.f1936a = 4;
        this.f1938c = eVar;
        this.f1939d = new f2.d();
    }

    public r(androidx.activity.l lVar, a2.d dVar) {
        this.f1936a = 1;
        this.f1938c = new Object();
        this.f1939d = new ArrayList();
    }

    public r(Context context) {
        this.f1936a = 0;
        this.f1939d = new HashSet();
        g7.i iVar = new g7.i(new a4.i(context, 4, false));
        o oVar = new o(this);
        q qVar = new q();
        qVar.f1935d = new a3.g(qVar, 1);
        qVar.f1934c = iVar;
        qVar.f1933b = oVar;
        this.f1938c = qVar;
    }

    public r(com.bumptech.glide.b bVar, ArrayList arrayList, a.a aVar) {
        this.f1936a = 2;
        this.f1938c = bVar;
        this.f1939d = arrayList;
    }
}
