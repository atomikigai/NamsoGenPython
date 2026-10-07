package com.google.android.gms.internal.ads;

import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbnk implements zzcaq {
    final /* synthetic */ zzbnt zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ zzbnu zzc;

    public zzbnk(zzbnu zzbnuVar, zzbnt zzbntVar, zzfka zzfkaVar) {
        this.zza = zzbntVar;
        this.zzb = zzfkaVar;
        this.zzc = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zza() {
        k0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                k0.k("loadNewJavascriptEngine (failure): Lock acquired");
                this.zzc.zzi = 1;
                k0.k("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzb();
                if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
                    zzbnu zzbnuVar = this.zzc;
                    if (zzbnuVar.zze != null) {
                        zzfko zzfkoVar = zzbnuVar.zze;
                        zzfka zzfkaVar = this.zzb;
                        zzfkaVar.zzc("Failed loading new engine");
                        zzfkaVar.zzg(false);
                        zzfkoVar.zzb(zzfkaVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k0.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
