package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdqm implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzdqm(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzchq) this.zza).zza();
        final String strZzb = ((zzdxj) this.zzb).zzb();
        i6.a aVarZza = ((zzcid) this.zzc).zza();
        final zzbbs.zza.EnumC0000zza enumC0000zza = (zzbbs.zza.EnumC0000zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbbl zzbblVar = new zzbbl(new zzbbr(contextZza));
        zzbbs.zzar.zza zzaVarZzd = zzbbs.zzar.zzd();
        zzaVarZzd.zzg(aVarZza.f5214b);
        zzaVarZzd.zzi(aVarZza.f5215c);
        zzaVarZzd.zzh(true != aVarZza.f5216d ? 2 : 0);
        final zzbbs.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbblVar.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdql
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzbbs.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbVarZzbM.zzH(enumC0000zza);
                zzaVar.zzG(zzbVarZzbM);
                zzbbs.zzm.zza zzaVarZzbM = zzaVar.zzg().zzbM();
                zzaVarZzbM.zzm(strZzb);
                zzaVarZzbM.zzw(zzarVarZzbr);
                zzaVar.zzK(zzaVarZzbM);
                zzaVar.zzO(str);
            }
        });
        return zzbblVar;
    }
}
