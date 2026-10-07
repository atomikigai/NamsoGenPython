package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends b1 {
    public final r.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f2062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l lVar, h hVar) {
        super(lVar);
        int i = g7.e.f4238c;
        this.e = new r.f(0);
        this.f2062f = hVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void a(g7.b bVar, int i) {
        this.f2062f.i(bVar, i);
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void b() {
        zau zauVar = this.f2062f.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(3));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.e.isEmpty()) {
            return;
        }
        this.f2062f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.b1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        if (this.e.isEmpty()) {
            return;
        }
        this.f2062f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.b1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f2063a = false;
        h hVar = this.f2062f;
        hVar.getClass();
        synchronized (h.C) {
            try {
                if (hVar.f2109v == this) {
                    hVar.f2109v = null;
                    hVar.f2110w.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
