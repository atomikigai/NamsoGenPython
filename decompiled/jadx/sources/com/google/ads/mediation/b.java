package com.google.ads.mediation;

import k6.i;
import w5.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w5.c implements x5.e, e6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f1949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f1950b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f1949a = abstractAdViewAdapter;
        this.f1950b = iVar;
    }

    @Override // w5.c, e6.a
    public final void onAdClicked() {
        this.f1950b.onAdClicked(this.f1949a);
    }

    @Override // w5.c
    public final void onAdClosed() {
        this.f1950b.onAdClosed(this.f1949a);
    }

    @Override // w5.c
    public final void onAdFailedToLoad(l lVar) {
        this.f1950b.onAdFailedToLoad(this.f1949a, lVar);
    }

    @Override // w5.c
    public final void onAdLoaded() {
        this.f1950b.onAdLoaded(this.f1949a);
    }

    @Override // w5.c
    public final void onAdOpened() {
        this.f1950b.onAdOpened(this.f1949a);
    }

    @Override // x5.e
    public final void onAppEvent(String str, String str2) {
        this.f1950b.zzb(this.f1949a, str, str2);
    }
}
