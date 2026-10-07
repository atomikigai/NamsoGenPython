package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3.b f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f2131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile m f2132c;

    public o(Looper looper, Object obj, String str) {
        this.f2130a = new f3.b(looper);
        com.google.android.gms.common.internal.i0.j(obj, "Listener must not be null");
        this.f2131b = obj;
        com.google.android.gms.common.internal.i0.e(str);
        this.f2132c = new m(obj, str);
    }

    public final void a(n nVar) {
        this.f2130a.execute(new a1(this, nVar));
    }
}
