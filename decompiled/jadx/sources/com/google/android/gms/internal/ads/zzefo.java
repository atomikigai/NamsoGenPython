package com.google.android.gms.internal.ads;

import android.content.Context;
import b9.e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.i;
import d6.p;
import e6.u3;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzefo implements zzdgv {
    private final i6.a zza;
    private final m9.a zzb;
    private final zzfet zzc;
    private final zzcfk zzd;
    private final zzffo zze;
    private final zzbju zzf;
    private final boolean zzg;
    private final zzeea zzh;

    public zzefo(i6.a aVar, m9.a aVar2, zzfet zzfetVar, zzcfk zzcfkVar, zzffo zzffoVar, boolean z4, zzbju zzbjuVar, zzeea zzeeaVar) {
        this.zza = aVar;
        this.zzb = aVar2;
        this.zzc = zzfetVar;
        this.zzd = zzcfkVar;
        this.zze = zzffoVar;
        this.zzg = z4;
        this.zzf = zzbjuVar;
        this.zzh = zzeeaVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zza(boolean z4, Context context, zzcwz zzcwzVar) {
        zzcoo zzcooVar = (zzcoo) zzgei.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zZze = this.zzg ? this.zzf.zze(true) : true;
        boolean z10 = this.zzg;
        i iVar = new i(zZze, true, z10 ? this.zzf.zzd() : false, z10 ? this.zzf.zza() : 0.0f, z4, this.zzc.zzO, false);
        if (zzcwzVar != null) {
            zzcwzVar.zzf();
        }
        e eVar = p.C.f2978b;
        zzdgk zzdgkVarZzg = zzcooVar.zzg();
        zzcfk zzcfkVar = this.zzd;
        int i = this.zzc.zzQ;
        if (i == -1) {
            u3 u3Var = this.zze.zzj;
            if (u3Var == null) {
                h.b("Error setting app open orientation; no targeting orientation available.");
                i = this.zzc.zzQ;
            } else {
                int i10 = u3Var.f3455a;
                if (i10 == 1) {
                    i = 7;
                } else if (i10 == 2) {
                    i = 6;
                } else {
                    h.b("Error setting app open orientation; no targeting orientation available.");
                    i = this.zzc.zzQ;
                }
            }
        }
        int i11 = i;
        i6.a aVar = this.zza;
        zzfet zzfetVar = this.zzc;
        String str = zzfetVar.zzB;
        zzfey zzfeyVar = zzfetVar.zzs;
        e.y(context, new AdOverlayInfoParcel(zzdgkVarZzg, zzcfkVar, i11, aVar, str, iVar, zzfeyVar.zzb, zzfeyVar.zza, this.zze.zzf, zzcwzVar, zzfetVar.zzai ? this.zzh : null), true);
    }
}
