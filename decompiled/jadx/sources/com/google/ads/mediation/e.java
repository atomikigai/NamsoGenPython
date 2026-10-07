package com.google.ads.mediation;

import k6.o;
import z5.j;
import z5.k;
import z5.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends w5.c implements l, k, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f1955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f1956b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, o oVar) {
        this.f1955a = abstractAdViewAdapter;
        this.f1956b = oVar;
    }

    @Override // w5.c, e6.a
    public final void onAdClicked() {
        this.f1956b.onAdClicked(this.f1955a);
    }

    @Override // w5.c
    public final void onAdClosed() {
        this.f1956b.onAdClosed(this.f1955a);
    }

    @Override // w5.c
    public final void onAdFailedToLoad(w5.l lVar) {
        this.f1956b.onAdFailedToLoad(this.f1955a, lVar);
    }

    @Override // w5.c
    public final void onAdImpression() {
        this.f1956b.onAdImpression(this.f1955a);
    }

    @Override // w5.c
    public final void onAdOpened() {
        this.f1956b.onAdOpened(this.f1955a);
    }

    @Override // w5.c
    public final void onAdLoaded() {
    }
}
