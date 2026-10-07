package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdtr {
    private final zzbkq zza;

    public zzdtr(zzbkq zzbkqVar) {
        this.zza = zzbkqVar;
    }

    private final void zzs(zzdtp zzdtpVar) throws RemoteException {
        String strZza = zzdtp.zza(zzdtpVar);
        h.f("Dispatching AFMA event on publisher webview: ".concat(strZza));
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdtp("initialize", null));
    }

    public final void zzb(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onAdClicked";
        this.zza.zzb(zzdtp.zza(zzdtpVar));
    }

    public final void zzc(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onAdClosed";
        zzs(zzdtpVar);
    }

    public final void zzd(long j4, int i) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onAdFailedToLoad";
        zzdtpVar.zzd = Integer.valueOf(i);
        zzs(zzdtpVar);
    }

    public final void zze(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onAdLoaded";
        zzs(zzdtpVar);
    }

    public final void zzf(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtpVar);
    }

    public final void zzg(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onAdOpened";
        zzs(zzdtpVar);
    }

    public final void zzh(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("creation", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "nativeObjectCreated";
        zzs(zzdtpVar);
    }

    public final void zzi(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("creation", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtpVar);
    }

    public final void zzj(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onAdClicked";
        zzs(zzdtpVar);
    }

    public final void zzk(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onRewardedAdClosed";
        zzs(zzdtpVar);
    }

    public final void zzl(long j4, zzbwz zzbwzVar) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onUserEarnedReward";
        zzdtpVar.zze = zzbwzVar.zzf();
        zzdtpVar.zzf = Integer.valueOf(zzbwzVar.zze());
        zzs(zzdtpVar);
    }

    public final void zzm(long j4, int i) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onRewardedAdFailedToLoad";
        zzdtpVar.zzd = Integer.valueOf(i);
        zzs(zzdtpVar);
    }

    public final void zzn(long j4, int i) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onRewardedAdFailedToShow";
        zzdtpVar.zzd = Integer.valueOf(i);
        zzs(zzdtpVar);
    }

    public final void zzo(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onAdImpression";
        zzs(zzdtpVar);
    }

    public final void zzp(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtpVar);
    }

    public final void zzq(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtpVar);
    }

    public final void zzr(long j4) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j4);
        zzdtpVar.zzc = "onRewardedAdOpened";
        zzs(zzdtpVar);
    }
}
