package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.i0;
import androidx.lifecycle.t;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1922a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9.c f1923b;

    public k(z9.c cVar) {
        this.f1923b = cVar;
    }

    public final com.bumptech.glide.l a(Context context, com.bumptech.glide.b bVar, t tVar, i0 i0Var, boolean z4) {
        p4.n.a();
        p4.n.a();
        HashMap map = this.f1922a;
        com.bumptech.glide.l lVar = (com.bumptech.glide.l) map.get(tVar);
        if (lVar != null) {
            return lVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(tVar);
        wa.d dVar = new wa.d();
        this.f1923b.getClass();
        com.bumptech.glide.l lVar2 = new com.bumptech.glide.l(bVar, lifecycleLifecycle, dVar, context);
        map.put(tVar, lVar2);
        lifecycleLifecycle.i(new j(this, tVar));
        if (z4) {
            lVar2.j();
        }
        return lVar2;
    }
}
