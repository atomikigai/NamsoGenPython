package com.bumptech.glide.manager;

import androidx.lifecycle.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f1921b;

    public j(k kVar, t tVar) {
        this.f1921b = kVar;
        this.f1920a = tVar;
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
        this.f1921b.f1922a.remove(this.f1920a);
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void j() {
    }
}
