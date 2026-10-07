package com.google.android.gms.internal.ads;

import w5.l;
import y5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdvz extends y5.a {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdwh zzc;

    public zzdvz(zzdwh zzdwhVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdwhVar;
    }

    @Override // w5.d
    public final void onAdFailedToLoad(l lVar) {
        this.zzc.zzm(zzdwh.zzl(lVar), this.zzb);
    }

    @Override // w5.d
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, (b) obj, str);
    }
}
