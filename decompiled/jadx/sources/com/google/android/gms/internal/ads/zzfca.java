package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfca implements zzfck {
    private final zzfck zza;
    private zzcvt zzb;

    public zzfca(zzfck zzfckVar) {
        this.zza = zzfckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvt zzd() {
        return this.zzb;
    }

    public final synchronized m9.a zzb(zzfcl zzfclVar, zzfcj zzfcjVar, zzcvt zzcvtVar) {
        this.zzb = zzcvtVar;
        if (zzfclVar.zza == null) {
            return ((zzfbz) this.zza).zzb(zzfclVar, zzfcjVar, zzcvtVar);
        }
        zzcsy zzcsyVarZzb = zzcvtVar.zzb();
        return zzcsyVarZzb.zzi(zzcsyVarZzb.zzk(zzgei.zzh(zzfclVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ m9.a zzc(zzfcl zzfclVar, zzfcj zzfcjVar, Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }
}
