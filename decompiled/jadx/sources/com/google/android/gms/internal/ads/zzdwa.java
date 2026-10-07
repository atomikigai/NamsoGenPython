package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdView;
import w5.c;
import w5.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdwa extends c {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdwh zzd;

    public zzdwa(zzdwh zzdwhVar, String str, AdView adView, String str2) {
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
        this.zzd = zzdwhVar;
    }

    @Override // w5.c
    public final void onAdFailedToLoad(l lVar) {
        this.zzd.zzm(zzdwh.zzl(lVar), this.zzc);
    }

    @Override // w5.c
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
