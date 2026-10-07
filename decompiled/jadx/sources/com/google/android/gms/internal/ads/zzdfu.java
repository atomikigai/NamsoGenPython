package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import h6.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdfu implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzdfu(zzdfn zzdfnVar, zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final i6.a aVarZza = ((zzcid) this.zzb).zza();
        final zzfet zzfetVarZza = ((zzcsh) this.zzc).zza();
        final zzffo zzffoVarZza = ((zzcwd) this.zzd).zza();
        return new zzded(new zzcya() { // from class: com.google.android.gms.internal.ads.zzdfl
            @Override // com.google.android.gms.internal.ads.zzcya
            public final void zzs() {
                m mVar = p.C.f2987n;
                Context context2 = context;
                zzffo zzffoVar = zzffoVarZza;
                mVar.o(context2, aVarZza.f5213a, zzfetVarZza.zzC.toString(), zzffoVar.zzf);
            }
        }, zzcaj.zzf);
    }
}
