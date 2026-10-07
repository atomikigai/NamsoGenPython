package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.c1;
import e6.f0;
import e6.h0;
import e6.q3;
import e6.z;
import z5.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzelv extends h0 {
    final zzffm zza;
    final zzdjh zzb;
    private final Context zzc;
    private final zzchk zzd;
    private z zze;

    public zzelv(zzchk zzchkVar, Context context, String str) {
        zzffm zzffmVar = new zzffm();
        this.zza = zzffmVar;
        this.zzb = new zzdjh();
        this.zzd = zzchkVar;
        zzffmVar.zzt(str);
        this.zzc = context;
    }

    @Override // e6.i0
    public final f0 zze() {
        zzdjj zzdjjVarZzg = this.zzb.zzg();
        this.zza.zzE(zzdjjVarZzg.zzi());
        this.zza.zzF(zzdjjVarZzg.zzh());
        zzffm zzffmVar = this.zza;
        if (zzffmVar.zzh() == null) {
            zzffmVar.zzs(q3.h());
        }
        return new zzelw(this.zzc, this.zzd, this.zza, zzdjjVarZzg, this.zze);
    }

    @Override // e6.i0
    public final void zzf(zzbgw zzbgwVar) {
        this.zzb.zza(zzbgwVar);
    }

    @Override // e6.i0
    public final void zzg(zzbgz zzbgzVar) {
        this.zzb.zzb(zzbgzVar);
    }

    @Override // e6.i0
    public final void zzh(String str, zzbhf zzbhfVar, zzbhc zzbhcVar) {
        this.zzb.zzc(str, zzbhfVar, zzbhcVar);
    }

    @Override // e6.i0
    public final void zzi(zzbmk zzbmkVar) {
        this.zzb.zzd(zzbmkVar);
    }

    @Override // e6.i0
    public final void zzj(zzbhj zzbhjVar, q3 q3Var) {
        this.zzb.zze(zzbhjVar);
        this.zza.zzs(q3Var);
    }

    @Override // e6.i0
    public final void zzk(zzbhm zzbhmVar) {
        this.zzb.zzf(zzbhmVar);
    }

    @Override // e6.i0
    public final void zzl(z zVar) {
        this.zze = zVar;
    }

    @Override // e6.i0
    public final void zzm(z5.a aVar) {
        this.zza.zzr(aVar);
    }

    @Override // e6.i0
    public final void zzn(zzbmb zzbmbVar) {
        this.zza.zzw(zzbmbVar);
    }

    @Override // e6.i0
    public final void zzo(zzbfn zzbfnVar) {
        this.zza.zzD(zzbfnVar);
    }

    @Override // e6.i0
    public final void zzp(g gVar) {
        this.zza.zzG(gVar);
    }

    @Override // e6.i0
    public final void zzq(c1 c1Var) {
        this.zza.zzV(c1Var);
    }
}
