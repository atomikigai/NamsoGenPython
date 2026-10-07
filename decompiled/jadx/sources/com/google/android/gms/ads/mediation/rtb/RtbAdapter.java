package com.google.android.gms.ads.mediation.rtb;

import android.os.RemoteException;
import k6.a;
import k6.c;
import k6.g;
import k6.h;
import k6.l;
import k6.n;
import k6.q;
import m6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(m6.a aVar, b bVar);

    public void loadRtbAppOpenAd(g gVar, c cVar) {
        loadAppOpenAd(gVar, cVar);
    }

    public void loadRtbBannerAd(h hVar, c cVar) {
        loadBannerAd(hVar, cVar);
    }

    public void loadRtbInterscrollerAd(h hVar, c cVar) {
        cVar.onFailure(new w5.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
    }

    public void loadRtbInterstitialAd(l lVar, c cVar) {
        loadInterstitialAd(lVar, cVar);
    }

    @Deprecated
    public void loadRtbNativeAd(n nVar, c cVar) {
        loadNativeAd(nVar, cVar);
    }

    public void loadRtbNativeAdMapper(n nVar, c cVar) throws RemoteException {
        loadNativeAdMapper(nVar, cVar);
    }

    public void loadRtbRewardedAd(q qVar, c cVar) {
        loadRewardedAd(qVar, cVar);
    }

    public void loadRtbRewardedInterstitialAd(q qVar, c cVar) {
        loadRewardedInterstitialAd(qVar, cVar);
    }
}
