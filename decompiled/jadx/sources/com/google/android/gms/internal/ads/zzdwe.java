package com.google.android.gms.internal.ads;

import w5.c;
import w5.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdwe extends c {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwh zzb;

    public zzdwe(zzdwh zzdwhVar, String str) {
        this.zza = str;
        this.zzb = zzdwhVar;
    }

    @Override // w5.c
    public final void onAdFailedToLoad(l lVar) {
        this.zzb.zzm(zzdwh.zzl(lVar), this.zza);
    }
}
