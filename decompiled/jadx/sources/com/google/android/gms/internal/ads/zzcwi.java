package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcwi implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzcwi(zzcwh zzcwhVar, zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        i6.a aVarZza = ((zzcid) this.zzb).zza();
        zzfet zzfetVarZza = ((zzcsh) this.zzc).zza();
        zzbyd zzbydVar = new zzbyd();
        zzbye zzbyeVar = zzfetVarZza.zzA;
        if (zzbyeVar == null) {
            return null;
        }
        zzfey zzfeyVar = zzfetVarZza.zzs;
        return new zzbyc(context, aVarZza, zzbyeVar, zzfeyVar != null ? zzfeyVar.zzb : null, zzbydVar);
    }
}
