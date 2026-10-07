package com.bumptech.glide.manager;

import android.view.View;
import d4.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1915b;

    public d(e eVar, e eVar2) {
        this.f1915b = eVar;
        this.f1914a = eVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVarA = u.a();
        uVarA.getClass();
        p4.n.a();
        uVarA.f2905d.set(true);
        this.f1915b.f1917b.f1919b = true;
        View view = this.f1915b.f1916a;
        view.getViewTreeObserver().removeOnDrawListener(this.f1914a);
        this.f1915b.f1917b.f1918a.clear();
    }
}
