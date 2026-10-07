package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import h6.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcps implements zzhfx {
    private final zzcpk zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzcps(zzcpk zzcpkVar, zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzcpkVar;
        this.zzb = zzhgpVar;
        this.zzc = zzhgpVar2;
        this.zzd = zzhgpVar3;
        this.zze = zzhgpVar4;
    }

    public static zzded zza(zzcpk zzcpkVar, final Context context, final i6.a aVar, final zzfet zzfetVar, final zzffo zzffoVar) {
        return new zzded(new zzcya() { // from class: com.google.android.gms.internal.ads.zzcpi
            @Override // com.google.android.gms.internal.ads.zzcya
            public final void zzs() {
                m mVar = p.C.f2987n;
                Context context2 = context;
                zzffo zzffoVar2 = zzffoVar;
                mVar.o(context2, aVar.f5213a, zzfetVar.zzC.toString(), zzffoVar2.zzf);
            }
        }, zzcaj.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (Context) this.zzb.zzb(), ((zzcid) this.zzc).zza(), ((zzcsh) this.zzd).zza(), ((zzcwd) this.zze).zza());
    }
}
