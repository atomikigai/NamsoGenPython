package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdiq implements zzaym {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdit zzb;

    public zzdiq(zzdit zzditVar, String str) {
        this.zza = str;
        this.zzb = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbP)).booleanValue()) {
            if (zzaylVar.zzj) {
                zzdit zzditVar = this.zzb;
                zzditVar.zzy.put(this.zza, Boolean.TRUE);
                zzdit zzditVar2 = this.zzb;
                zzditVar2.zzB(zzditVar2.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzaylVar.zzj) {
                    zzdit zzditVar3 = this.zzb;
                    if (zzditVar3.zzo == null) {
                        return;
                    }
                    zzditVar3.zzy.put(this.zza, Boolean.TRUE);
                    zzdit zzditVar4 = this.zzb;
                    zzditVar4.zzB(zzditVar4.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
