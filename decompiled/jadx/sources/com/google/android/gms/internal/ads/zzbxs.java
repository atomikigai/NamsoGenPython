package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import i6.h;
import r6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxs {
    private final zzbpm zza;

    public zzbxs(zzbpm zzbpmVar) {
        this.zza = zzbpmVar;
    }

    public final void onAdClosed() {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(w5.a aVar) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToShow.");
        h.g("Mediation ad failed to show: Error Code = " + aVar.f9632a + ". Error Message = " + aVar.f9633b + " Error Domain = " + aVar.f9634c);
        try {
            this.zza.zzk(aVar.a());
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened() {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onUserEarnedReward(b bVar) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzt(new zzbxt(bVar));
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoComplete() {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStart() {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onVideoStart.");
        try {
            this.zza.zzy();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdClicked() {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdImpression() {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(String str) {
        i0.d("#008 Must be called on the main UI thread.");
        h.b("Adapter called onAdFailedToShow.");
        h.g("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }
}
