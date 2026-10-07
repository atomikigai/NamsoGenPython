package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements d, b, c, s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static t f2261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f2262c = new u(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2263a;

    public /* synthetic */ t(Object obj) {
        this.f2263a = obj;
    }

    public static synchronized t c() {
        try {
            if (f2261b == null) {
                f2261b = new t();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2261b;
    }

    @Override // com.google.android.gms.common.internal.s
    public Object a(com.google.android.gms.common.api.s sVar) {
        z6.b bVar = (z6.b) this.f2263a;
        bVar.f10994a = sVar;
        return bVar;
    }

    @Override // com.google.android.gms.common.internal.d
    public void b(g7.b bVar) {
        f fVar = (f) this.f2263a;
        if (bVar.f4229b == 0) {
            fVar.getRemoteService(null, fVar.getScopes());
        } else if (fVar.zzx != null) {
            fVar.zzx.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnected(Bundle bundle) {
        ((com.google.android.gms.common.api.internal.g) this.f2263a).y();
    }

    @Override // com.google.android.gms.common.internal.c
    public void onConnectionFailed(g7.b bVar) {
        ((com.google.android.gms.common.api.internal.q) this.f2263a).onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnectionSuspended(int i) {
        ((com.google.android.gms.common.api.internal.g) this.f2263a).onConnectionSuspended(i);
    }
}
