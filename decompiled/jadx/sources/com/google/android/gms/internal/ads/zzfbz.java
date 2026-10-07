package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfbz implements zzfck {
    private zzcvt zza;

    @Override // com.google.android.gms.internal.ads.zzfck
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvt zzd() {
        return this.zza;
    }

    public final synchronized m9.a zzb(zzfcl zzfclVar, zzfcj zzfcjVar, zzcvt zzcvtVar) {
        zzcsy zzcsyVarZzb;
        try {
            if (zzcvtVar != null) {
                this.zza = zzcvtVar;
            } else {
                this.zza = (zzcvt) zzfcjVar.zza(zzfclVar.zzb).zzh();
            }
            zzcsyVarZzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzcsyVarZzb.zzi(zzcsyVarZzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ m9.a zzc(zzfcl zzfclVar, zzfcj zzfcjVar, Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }
}
