package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbif;
import e6.a3;
import e6.i0;
import e6.j2;
import e6.k3;
import e6.l3;
import e6.m0;
import e6.n2;
import e6.q2;
import e6.s;
import e6.t;
import e6.z2;
import i6.h;
import java.util.Iterator;
import java.util.Set;
import k6.i;
import k6.m;
import k6.o;
import w5.f;
import w5.g;
import w5.w;
import w5.x;
import w5.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private f adLoader;
    protected AdView mAdView;
    protected j6.a mInterstitialAd;

    public g buildAdRequest(Context context, k6.d dVar, Bundle bundle, Bundle bundle2) {
        ta.c cVar = new ta.c();
        n2 n2Var = (n2) cVar.f8662a;
        Set keywords = dVar.getKeywords();
        if (keywords != null) {
            Iterator it = keywords.iterator();
            while (it.hasNext()) {
                n2Var.f3351a.add((String) it.next());
            }
        }
        if (dVar.isTesting()) {
            i6.d dVar2 = s.f3427f.f3428a;
            n2Var.f3354d.add(i6.d.p(context));
        }
        if (dVar.taggedForChildDirectedTreatment() != -1) {
            n2Var.h = dVar.taggedForChildDirectedTreatment() != 1 ? 0 : 1;
        }
        n2Var.i = dVar.isDesignedForFamilies();
        cVar.e(buildExtrasBundle(bundle, bundle2));
        return new g(cVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public j6.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public j2 getVideoController() {
        j2 j2Var;
        AdView adView = this.mAdView;
        if (adView == null) {
            return null;
        }
        w wVar = adView.f9664a.f3398c;
        synchronized (wVar.f9671a) {
            j2Var = wVar.f9672b;
        }
        return j2Var;
    }

    public w5.e newAdLoader(Context context, String str) {
        return new w5.e(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, k6.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z4) {
        j6.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, k6.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            zzbcn.zza(adView.getContext());
            if (((Boolean) zzbel.zzg.zze()).booleanValue()) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkN)).booleanValue()) {
                    i6.b.f5218b.execute(new y(adView, 2));
                    return;
                }
            }
            q2 q2Var = adView.f9664a;
            q2Var.getClass();
            try {
                m0 m0Var = q2Var.i;
                if (m0Var != null) {
                    m0Var.zzz();
                }
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, k6.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            zzbcn.zza(adView.getContext());
            if (((Boolean) zzbel.zzh.zze()).booleanValue()) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkL)).booleanValue()) {
                    i6.b.f5218b.execute(new y(adView, 0));
                    return;
                }
            }
            q2 q2Var = adView.f9664a;
            q2Var.getClass();
            try {
                m0 m0Var = q2Var.i;
                if (m0Var != null) {
                    m0Var.zzB();
                }
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, i iVar, Bundle bundle, w5.h hVar, k6.d dVar, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new w5.h(hVar.f9656a, hVar.f9657b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, iVar));
        this.mAdView.b(buildAdRequest(context, dVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, m mVar, Bundle bundle, k6.d dVar, Bundle bundle2) {
        j6.a.load(context, getAdUnitId(bundle), buildAdRequest(context, dVar, bundle2, bundle), new c(this, mVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, o oVar, Bundle bundle, k6.s sVar, Bundle bundle2) {
        f fVar;
        e eVar = new e(this, oVar);
        w5.e eVarNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        eVarNewAdLoader.getClass();
        i0 i0Var = eVarNewAdLoader.f9644b;
        try {
            i0Var.zzl(new k3(eVar));
        } catch (RemoteException e) {
            h.h("Failed to set AdListener.", e);
        }
        try {
            i0Var.zzo(new zzbfn(sVar.getNativeAdOptions()));
        } catch (RemoteException e4) {
            h.h("Failed to specify native ad options", e4);
        }
        n6.h nativeAdRequestOptions = sVar.getNativeAdRequestOptions();
        try {
            boolean z4 = nativeAdRequestOptions.f7294a;
            boolean z10 = nativeAdRequestOptions.f7296c;
            int i = nativeAdRequestOptions.f7297d;
            x xVar = nativeAdRequestOptions.e;
            i0Var.zzo(new zzbfn(4, z4, -1, z10, i, xVar != null ? new l3(xVar) : null, nativeAdRequestOptions.f7298f, nativeAdRequestOptions.f7295b, nativeAdRequestOptions.h, nativeAdRequestOptions.f7299g, nativeAdRequestOptions.i - 1));
        } catch (RemoteException e10) {
            h.h("Failed to specify native ad options", e10);
        }
        if (sVar.isUnifiedNativeAdRequested()) {
            try {
                i0Var.zzk(new zzbif(eVar));
            } catch (RemoteException e11) {
                h.h("Failed to add google native ad listener", e11);
            }
        }
        if (sVar.zzb()) {
            for (String str : sVar.zza().keySet()) {
                zzbic zzbicVar = new zzbic(eVar, true != ((Boolean) sVar.zza().get(str)).booleanValue() ? null : eVar);
                try {
                    i0Var.zzh(str, zzbicVar.zzd(), zzbicVar.zzc());
                } catch (RemoteException e12) {
                    h.h("Failed to add custom template ad listener", e12);
                }
            }
        }
        Context context2 = eVarNewAdLoader.f9643a;
        try {
            fVar = new f(context2, i0Var.zze());
        } catch (RemoteException e13) {
            h.e("Failed to build AdLoader.", e13);
            fVar = new f(context2, new z2(new a3()));
        }
        this.adLoader = fVar;
        fVar.a(buildAdRequest(context, sVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        j6.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show(null);
        }
    }
}
