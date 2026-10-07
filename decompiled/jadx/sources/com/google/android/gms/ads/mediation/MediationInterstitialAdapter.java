package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import k6.d;
import k6.e;
import k6.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, m mVar, Bundle bundle, d dVar, Bundle bundle2);

    void showInterstitial();
}
