package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdir implements zzgee {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdit zzb;

    public zzdir(zzdit zzditVar, String str, boolean z4) {
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
        this.zzb.zze.zzT((zzcfk) obj);
        zzdit zzditVar = this.zzb;
        zzcao zzcaoVarZzp = zzditVar.zze.zzp();
        zzeew zzeewVarZzf = zzditVar.zzf(this.zza, true);
        if (zzeewVarZzf != null && zzcaoVarZzp != null) {
            zzcaoVarZzp.zzc(zzeewVarZzf);
        } else if (zzcaoVarZzp != null) {
            zzcaoVarZzp.cancel(false);
        }
    }
}
