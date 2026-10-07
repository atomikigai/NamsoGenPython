package com.google.ads.mediation;

import k6.m;
import w5.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f1951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1952b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f1951a = abstractAdViewAdapter;
        this.f1952b = mVar;
    }

    @Override // w5.d
    public final void onAdFailedToLoad(l lVar) {
        this.f1952b.onAdFailedToLoad(this.f1951a, lVar);
    }

    @Override // w5.d
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        j6.a aVar = (j6.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f1951a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        m mVar = this.f1952b;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, mVar));
        mVar.onAdLoaded(abstractAdViewAdapter);
    }
}
