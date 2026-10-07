package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.k f1913b;

    public c(Context context, com.bumptech.glide.k kVar) {
        this.f1912a = context.getApplicationContext();
        this.f1913b = kVar;
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
        r rVarB = r.b(this.f1912a);
        com.bumptech.glide.k kVar = this.f1913b;
        synchronized (rVarB) {
            ((HashSet) rVarB.f1939d).remove(kVar);
            if (rVarB.f1937b && ((HashSet) rVarB.f1939d).isEmpty()) {
                q qVar = (q) rVarB.f1938c;
                ((ConnectivityManager) ((g7.i) qVar.f1934c).get()).unregisterNetworkCallback((a3.g) qVar.f1935d);
                rVarB.f1937b = false;
            }
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void j() {
        r rVarB = r.b(this.f1912a);
        com.bumptech.glide.k kVar = this.f1913b;
        synchronized (rVarB) {
            ((HashSet) rVarB.f1939d).add(kVar);
            rVarB.c();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
    }
}
