package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdpn {
    private final Context zza;
    private final zzavc zzb;
    private final zzbdu zzc;
    private final i6.a zzd;
    private final d6.a zze;
    private final zzbbl zzf;
    private final zzcze zzg;
    private final zzeea zzh;
    private final zzffs zzi;

    public zzdpn(zzcfx zzcfxVar, Context context, zzavc zzavcVar, zzbdu zzbduVar, i6.a aVar, d6.a aVar2, zzbbl zzbblVar, zzcze zzczeVar, zzeea zzeeaVar, zzffs zzffsVar) {
        this.zza = context;
        this.zzb = zzavcVar;
        this.zzc = zzbduVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbblVar;
        this.zzg = zzczeVar;
        this.zzh = zzeeaVar;
        this.zzi = zzffsVar;
    }

    public final zzcfk zza(q3 q3Var, zzfet zzfetVar, zzfew zzfewVar) throws zzcfw {
        zzche zzcheVarZzc = zzche.zzc(q3Var);
        String str = q3Var.f3406a;
        zzdpc zzdpcVar = new zzdpc(this);
        zzeea zzeeaVar = this.zzh;
        zzffs zzffsVar = this.zzi;
        d6.a aVar = this.zze;
        zzbbl zzbblVar = this.zzf;
        return zzcfx.zza(this.zza, zzcheVarZzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdpcVar, aVar, zzbblVar, zzfetVar, zzfewVar, zzeeaVar, zzffsVar);
    }
}
