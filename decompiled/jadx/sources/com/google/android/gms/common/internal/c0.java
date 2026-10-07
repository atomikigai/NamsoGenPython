package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f2182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f2184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2185d;
    public final Bundle e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2186f;

    public c0(f fVar, int i, Bundle bundle) {
        this.f2186f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f2184c = fVar;
        this.f2182a = bool;
        this.f2183b = false;
        this.f2185d = i;
        this.e = bundle;
    }

    public abstract void a(g7.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f2182a = null;
        }
        synchronized (this.f2184c.zzt) {
            this.f2184c.zzt.remove(this);
        }
    }
}
