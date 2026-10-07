package com.google.ads.mediation;

import k6.m;
import w5.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f1953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1954b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f1953a = abstractAdViewAdapter;
        this.f1954b = mVar;
    }

    @Override // w5.k
    public final void a() {
        this.f1954b.onAdClosed(this.f1953a);
    }

    @Override // w5.k
    public final void c() {
        this.f1954b.onAdOpened(this.f1953a);
    }
}
