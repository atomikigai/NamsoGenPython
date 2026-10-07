package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.r;
import com.bumptech.glide.manager.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ComponentCallbacks2, com.bumptech.glide.manager.i {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l4.e f1877v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f1878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.manager.h f1880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f1881d;
    public final n e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f1882f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.activity.i f1883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f1884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f1885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l4.e f1886u;

    static {
        l4.e eVar = (l4.e) new l4.e().c(Bitmap.class);
        eVar.f6761x = true;
        f1877v = eVar;
        ((l4.e) new l4.e().c(h4.c.class)).f6761x = true;
    }

    public l(b bVar, com.bumptech.glide.manager.h hVar, n nVar, Context context) {
        l4.e eVar;
        r rVar = new r();
        wa.d dVar = bVar.f1843f;
        this.f1882f = new s();
        androidx.activity.i iVar = new androidx.activity.i(this, 7);
        this.f1883r = iVar;
        this.f1878a = bVar;
        this.f1880c = hVar;
        this.e = nVar;
        this.f1881d = rVar;
        this.f1879b = context;
        Context applicationContext = context.getApplicationContext();
        k kVar = new k(this, rVar);
        dVar.getClass();
        boolean z4 = e0.k.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z4 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.b cVar = z4 ? new com.bumptech.glide.manager.c(applicationContext, kVar) : new com.bumptech.glide.manager.l();
        this.f1884s = cVar;
        synchronized (bVar.f1844r) {
            if (bVar.f1844r.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f1844r.add(this);
        }
        char[] cArr = p4.n.f7811a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hVar.i(this);
        } else {
            p4.n.f().post(iVar);
        }
        hVar.i(cVar);
        this.f1885t = new CopyOnWriteArrayList(bVar.f1841c.e);
        e eVar2 = bVar.f1841c;
        synchronized (eVar2) {
            try {
                if (eVar2.f1861j == null) {
                    eVar2.f1858d.getClass();
                    l4.e eVar3 = new l4.e();
                    eVar3.f6761x = true;
                    eVar2.f1861j = eVar3;
                }
                eVar = eVar2.f1861j;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            l4.e eVar4 = (l4.e) eVar.clone();
            if (eVar4.f6761x && !eVar4.f6763z) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar4.f6763z = true;
            eVar4.f6761x = true;
            this.f1886u = eVar4;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void e() {
        this.f1882f.e();
        l();
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void j() {
        m();
        this.f1882f.j();
    }

    public final void k(m4.c cVar) {
        if (cVar == null) {
            return;
        }
        boolean zN = n(cVar);
        l4.c cVarH = cVar.h();
        if (zN) {
            return;
        }
        b bVar = this.f1878a;
        synchronized (bVar.f1844r) {
            try {
                ArrayList arrayList = bVar.f1844r;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((l) obj).n(cVar)) {
                        return;
                    }
                }
                if (cVarH != null) {
                    cVar.c(null);
                    cVarH.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l() {
        r rVar = this.f1881d;
        rVar.f1937b = true;
        ArrayList arrayListE = p4.n.e((Set) rVar.f1938c);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            l4.c cVar = (l4.c) obj;
            if (cVar.isRunning()) {
                cVar.c();
                ((HashSet) rVar.f1939d).add(cVar);
            }
        }
    }

    public final synchronized void m() {
        r rVar = this.f1881d;
        int i = 0;
        rVar.f1937b = false;
        ArrayList arrayListE = p4.n.e((Set) rVar.f1938c);
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            l4.c cVar = (l4.c) obj;
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.h();
            }
        }
        ((HashSet) rVar.f1939d).clear();
    }

    public final synchronized boolean n(m4.c cVar) {
        l4.c cVarH = cVar.h();
        if (cVarH == null) {
            return true;
        }
        if (!this.f1881d.a(cVarH)) {
            return false;
        }
        this.f1882f.f1940a.remove(cVar);
        cVar.c(null);
        return true;
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void onDestroy() {
        int i;
        this.f1882f.onDestroy();
        synchronized (this) {
            try {
                ArrayList arrayListE = p4.n.e(this.f1882f.f1940a);
                int size = arrayListE.size();
                i = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayListE.get(i10);
                    i10++;
                    k((m4.c) obj);
                }
                this.f1882f.f1940a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        r rVar = this.f1881d;
        ArrayList arrayListE2 = p4.n.e((Set) rVar.f1938c);
        int size2 = arrayListE2.size();
        while (i < size2) {
            Object obj2 = arrayListE2.get(i);
            i++;
            rVar.a((l4.c) obj2);
        }
        ((HashSet) rVar.f1939d).clear();
        this.f1880c.k(this);
        this.f1880c.k(this.f1884s);
        p4.n.f().removeCallbacks(this.f1883r);
        b bVar = this.f1878a;
        synchronized (bVar.f1844r) {
            if (!bVar.f1844r.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f1844r.remove(this);
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f1881d + ", treeNode=" + this.e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
