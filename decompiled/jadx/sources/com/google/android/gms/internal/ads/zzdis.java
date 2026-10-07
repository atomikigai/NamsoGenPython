package com.google.android.gms.internal.ads;

import android.view.View;
import d6.p;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdis implements zzgee {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdit zzb;

    public zzdis(zzdit zzditVar, View view) {
        this.zza = view;
        this.zzb = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfl)).booleanValue()) {
            p.C.f2982g.zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzad(this.zza, (zzeew) obj);
    }
}
