package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.i0;
import i6.h;
import k6.i;
import k6.m;
import k6.o;
import k6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbqj implements i, m, o {
    private final zzbpm zza;
    private t zzb;
    private zzbgt zzc;

    public zzbqj(zzbpm zzbpmVar) {
        this.zza = zzbpmVar;
    }

    @Override // k6.i
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.i
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.zza.zzg(i);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.o
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                h.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f6058m) {
                h.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        h.b("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.i
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.i
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onVideoEnd.");
        try {
            this.zza.zzv();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final t zza() {
        return this.zzb;
    }

    @Override // k6.i
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAppEvent.");
        try {
            this.zza.zzq(str, str2);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final zzbgt zzc() {
        return this.zzc;
    }

    @Override // k6.o
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbgt zzbgtVar) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbgtVar.zzb())));
        this.zzc = zzbgtVar;
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.o
    public final void zze(MediationNativeAdapter mediationNativeAdapter, zzbgt zzbgtVar, String str) {
        try {
            this.zza.zzr(zzbgtVar.zza(), str);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.m
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.i
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, w5.a aVar) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f9632a + ". ErrorMessage: " + aVar.f9633b + ". ErrorDomain: " + aVar.f9634c);
        try {
            this.zza.zzh(aVar.a());
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.m
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.m
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.o
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                h.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f6059n) {
                h.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        h.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.o
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.o
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, t tVar) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdLoaded.");
        this.zzb = tVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            Object obj = new Object();
            new zzbpw();
            synchronized (obj) {
            }
        }
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.o
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.zza.zzg(i);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, w5.a aVar) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f9632a + ". ErrorMessage: " + aVar.f9633b + ". ErrorDomain: " + aVar.f9634c);
        try {
            this.zza.zzh(aVar.a());
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.zza.zzg(i);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // k6.o
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, w5.a aVar) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.f9632a + ". ErrorMessage: " + aVar.f9633b + ". ErrorDomain: " + aVar.f9634c);
        try {
            this.zza.zzh(aVar.a());
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }
}
