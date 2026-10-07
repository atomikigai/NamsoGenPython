package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.g f2083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f2085d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q0 f2088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2089t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f2093x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f2082a = new LinkedList();
    public final HashSet e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f2086f = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f2090u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g7.b f2091v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2092w = 0;

    public f0(h hVar, com.google.android.gms.common.api.l lVar) {
        this.f2093x = hVar;
        zau zauVar = hVar.f2112y;
        com.google.android.gms.common.api.g gVarZab = lVar.zab(zauVar.getLooper(), this);
        this.f2083b = gVarZab;
        this.f2084c = lVar.getApiKey();
        this.f2085d = new a0();
        this.f2087r = lVar.zaa();
        if (gVarZab.requiresSignIn()) {
            this.f2088s = lVar.zac(hVar.e, zauVar);
        } else {
            this.f2088s = null;
        }
    }

    public final void a(g7.b bVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (com.google.android.gms.common.internal.i0.m(bVar, g7.b.e)) {
                this.f2083b.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z4) {
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f2082a.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (!z4 || y0Var.f2162a == 2) {
                if (status != null) {
                    y0Var.a(status);
                } else {
                    y0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f2082a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y0 y0Var = (y0) arrayList.get(i);
            if (!this.f2083b.isConnected()) {
                return;
            }
            if (h(y0Var)) {
                linkedList.remove(y0Var);
            }
        }
    }

    public final void e() {
        h hVar = this.f2093x;
        com.google.android.gms.common.internal.i0.c(hVar.f2112y);
        this.f2091v = null;
        a(g7.b.e);
        zau zauVar = hVar.f2112y;
        if (this.f2089t) {
            a aVar = this.f2084c;
            zauVar.removeMessages(11, aVar);
            zauVar.removeMessages(9, aVar);
            this.f2089t = false;
        }
        Iterator it = this.f2086f.values().iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        d();
        g();
    }

    public final void f(int i) {
        h hVar = this.f2093x;
        zau zauVar = hVar.f2112y;
        com.google.android.gms.common.internal.i0.c(hVar.f2112y);
        this.f2091v = null;
        this.f2089t = true;
        String lastDisconnectMessage = this.f2083b.getLastDisconnectMessage();
        a0 a0Var = this.f2085d;
        a0Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        a0Var.a(new Status(20, sb2.toString(), null, null), true);
        a aVar = this.f2084c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, aVar), 5000L);
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 11, aVar), 120000L);
        ((SparseIntArray) hVar.f2105r.f263b).clear();
        Iterator it = this.f2086f.values().iterator();
        if (it.hasNext()) {
            q1.a.q(it.next());
            throw null;
        }
    }

    public final void g() {
        h hVar = this.f2093x;
        zau zauVar = hVar.f2112y;
        a aVar = this.f2084c;
        zauVar.removeMessages(12, aVar);
        zauVar.sendMessageDelayed(zauVar.obtainMessage(12, aVar), hVar.f2100a);
    }

    public final boolean h(y0 y0Var) {
        g7.d dVar;
        if (!(y0Var instanceof l0)) {
            a0 a0Var = this.f2085d;
            com.google.android.gms.common.api.g gVar = this.f2083b;
            y0Var.d(a0Var, gVar.requiresSignIn());
            try {
                y0Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        l0 l0Var = (l0) y0Var;
        g7.d[] dVarArrG = l0Var.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
            break;
        }
        g7.d[] availableFeatures = this.f2083b.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new g7.d[0];
        }
        r.e eVar = new r.e(availableFeatures.length);
        for (g7.d dVar2 : availableFeatures) {
            eVar.put(dVar2.f4235a, Long.valueOf(dVar2.g()));
        }
        int length = dVarArrG.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrG[i];
            Long l2 = (Long) eVar.get(dVar.f4235a);
            if (l2 == null || l2.longValue() < dVar.g()) {
                break;
            }
            i++;
        }
        if (dVar == null) {
            a0 a0Var2 = this.f2085d;
            com.google.android.gms.common.api.g gVar2 = this.f2083b;
            y0Var.d(a0Var2, gVar2.requiresSignIn());
            try {
                y0Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f2083b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f4235a + ", " + dVar.g() + ").");
        if (!this.f2093x.f2113z || !l0Var.f(this)) {
            l0Var.b(new com.google.android.gms.common.api.w(dVar));
            return true;
        }
        g0 g0Var = new g0(this.f2084c, dVar);
        int iIndexOf = this.f2090u.indexOf(g0Var);
        if (iIndexOf >= 0) {
            g0 g0Var2 = (g0) this.f2090u.get(iIndexOf);
            this.f2093x.f2112y.removeMessages(15, g0Var2);
            zau zauVar = this.f2093x.f2112y;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, g0Var2), 5000L);
        } else {
            this.f2090u.add(g0Var);
            zau zauVar2 = this.f2093x.f2112y;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, g0Var), 5000L);
            zau zauVar3 = this.f2093x.f2112y;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, g0Var), 120000L);
            g7.b bVar = new g7.b(2, null);
            if (!i(bVar)) {
                this.f2093x.d(bVar, this.f2087r);
            }
        }
        return false;
    }

    public final boolean i(g7.b bVar) {
        synchronized (h.C) {
            try {
                h hVar = this.f2093x;
                if (hVar.f2109v == null || !hVar.f2110w.contains(this.f2084c)) {
                    return false;
                }
                this.f2093x.f2109v.c(bVar, this.f2087r);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(boolean z4) {
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        com.google.android.gms.common.api.g gVar = this.f2083b;
        if (!gVar.isConnected() || !this.f2086f.isEmpty()) {
            return false;
        }
        a0 a0Var = this.f2085d;
        if (((Map) a0Var.f2057a).isEmpty() && ((Map) a0Var.f2058b).isEmpty()) {
            gVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z4) {
            return false;
        }
        g();
        return false;
    }

    public final void k() {
        h hVar = this.f2093x;
        com.google.android.gms.common.internal.i0.c(hVar.f2112y);
        com.google.android.gms.common.api.g gVar = this.f2083b;
        if (gVar.isConnected() || gVar.isConnecting()) {
            return;
        }
        try {
            aa.c cVar = hVar.f2105r;
            Context context = hVar.e;
            SparseIntArray sparseIntArray = (SparseIntArray) cVar.f263b;
            com.google.android.gms.common.internal.i0.i(context);
            int iD = 0;
            if (gVar.requiresGooglePlayServices()) {
                int minApkVersion = gVar.getMinApkVersion();
                int i = ((SparseIntArray) cVar.f263b).get(minApkVersion, -1);
                if (i != -1) {
                    iD = i;
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= sparseIntArray.size()) {
                            iD = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i10);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (iD == -1) {
                        iD = ((g7.e) cVar.f264c).d(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iD);
                }
            }
            if (iD != 0) {
                g7.b bVar = new g7.b(iD, null);
                Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + bVar.toString());
                m(bVar, null);
                return;
            }
            h0 h0Var = new h0();
            h0Var.f2118f = hVar;
            h0Var.f2117d = null;
            h0Var.e = null;
            h0Var.f2114a = false;
            h0Var.f2115b = gVar;
            h0Var.f2116c = this.f2084c;
            if (gVar.requiresSignIn()) {
                q0 q0Var = this.f2088s;
                com.google.android.gms.common.internal.i0.i(q0Var);
                Handler handler = q0Var.f2142b;
                com.google.android.gms.common.internal.i iVar = q0Var.e;
                b8.a aVar = q0Var.f2145f;
                if (aVar != null) {
                    aVar.disconnect();
                }
                iVar.f2199g = Integer.valueOf(System.identityHashCode(q0Var));
                q0Var.f2145f = (b8.a) q0Var.f2143c.buildClient(q0Var.f2141a, handler.getLooper(), iVar, (Object) iVar.f2198f, (com.google.android.gms.common.api.m) q0Var, (com.google.android.gms.common.api.n) q0Var);
                q0Var.f2146r = h0Var;
                Set set = q0Var.f2144d;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.activity.i(q0Var, 10));
                } else {
                    b8.a aVar2 = q0Var.f2145f;
                    aVar2.getClass();
                    aVar2.connect(new com.google.android.gms.common.internal.t(aVar2));
                }
            }
            try {
                gVar.connect(h0Var);
            } catch (SecurityException e) {
                m(new g7.b(10), e);
            }
        } catch (IllegalStateException e4) {
            m(new g7.b(10), e4);
        }
    }

    public final void l(y0 y0Var) {
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        boolean zIsConnected = this.f2083b.isConnected();
        LinkedList linkedList = this.f2082a;
        if (zIsConnected) {
            if (h(y0Var)) {
                g();
                return;
            } else {
                linkedList.add(y0Var);
                return;
            }
        }
        linkedList.add(y0Var);
        g7.b bVar = this.f2091v;
        if (bVar == null || bVar.f4229b == 0 || bVar.f4230c == null) {
            k();
        } else {
            m(bVar, null);
        }
    }

    public final void m(g7.b bVar, RuntimeException runtimeException) {
        b8.a aVar;
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        q0 q0Var = this.f2088s;
        if (q0Var != null && (aVar = q0Var.f2145f) != null) {
            aVar.disconnect();
        }
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        this.f2091v = null;
        ((SparseIntArray) this.f2093x.f2105r.f263b).clear();
        a(bVar);
        if ((this.f2083b instanceof i7.c) && bVar.f4229b != 24) {
            h hVar = this.f2093x;
            hVar.f2101b = true;
            zau zauVar = hVar.f2112y;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (bVar.f4229b == 4) {
            b(h.B);
            return;
        }
        if (this.f2082a.isEmpty()) {
            this.f2091v = bVar;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f2093x.f2113z) {
            b(h.e(this.f2084c, bVar));
            return;
        }
        c(h.e(this.f2084c, bVar), null, true);
        if (this.f2082a.isEmpty() || i(bVar) || this.f2093x.d(bVar, this.f2087r)) {
            return;
        }
        if (bVar.f4229b == 18) {
            this.f2089t = true;
        }
        if (!this.f2089t) {
            b(h.e(this.f2084c, bVar));
            return;
        }
        h hVar2 = this.f2093x;
        a aVar2 = this.f2084c;
        zau zauVar2 = hVar2.f2112y;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, aVar2), 5000L);
    }

    public final void n(g7.b bVar) {
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        com.google.android.gms.common.api.g gVar = this.f2083b;
        gVar.disconnect("onSignInFailed for " + gVar.getClass().getName() + " with " + String.valueOf(bVar));
        m(bVar, null);
    }

    public final void o() {
        com.google.android.gms.common.internal.i0.c(this.f2093x.f2112y);
        Status status = h.A;
        b(status);
        this.f2085d.a(status, false);
        for (m mVar : (m[]) this.f2086f.keySet().toArray(new m[0])) {
            l(new x0(mVar, new TaskCompletionSource()));
        }
        a(new g7.b(4));
        com.google.android.gms.common.api.g gVar = this.f2083b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new e7.i(this, 11));
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void onConnectionFailed(g7.b bVar) {
        m(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onConnectionSuspended(int i) {
        Looper looperMyLooper = Looper.myLooper();
        zau zauVar = this.f2093x.f2112y;
        if (looperMyLooper == zauVar.getLooper()) {
            f(i);
        } else {
            zauVar.post(new androidx.emoji2.text.j(this, i, 2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void y() {
        Looper looperMyLooper = Looper.myLooper();
        zau zauVar = this.f2093x.f2112y;
        if (looperMyLooper == zauVar.getLooper()) {
            e();
        } else {
            zauVar.post(new androidx.activity.i(this, 8));
        }
    }
}
