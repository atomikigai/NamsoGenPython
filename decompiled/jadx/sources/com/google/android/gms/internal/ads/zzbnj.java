package com.google.android.gms.internal.ads;

import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbnj implements zzcas {
    final /* synthetic */ zzbnt zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ zzbnu zzc;

    public zzbnj(zzbnu zzbnuVar, zzbnt zzbntVar, zzfka zzfkaVar) {
        this.zza = zzbntVar;
        this.zzb = zzfkaVar;
        this.zzc = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        k0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                k0.k("loadNewJavascriptEngine (success): Lock acquired");
                this.zzc.zzi = 0;
                zzbnu zzbnuVar = this.zzc;
                if (zzbnuVar.zzh != null && this.zza != zzbnuVar.zzh) {
                    k0.k("New JS engine is loaded, marking previous one as destroyable.");
                    this.zzc.zzh.zzb();
                }
                this.zzc.zzh = this.zza;
                if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
                    zzbnu zzbnuVar2 = this.zzc;
                    if (zzbnuVar2.zze != null) {
                        zzfko zzfkoVar = zzbnuVar2.zze;
                        zzfka zzfkaVar = this.zzb;
                        zzfkaVar.zzg(true);
                        zzfkoVar.zzb(zzfkaVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k0.k("loadNewJavascriptEngine (success): Lock released");
    }
}
