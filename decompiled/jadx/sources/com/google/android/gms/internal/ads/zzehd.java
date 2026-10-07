package com.google.android.gms.internal.ads;

import android.content.Context;
import b9.e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.i;
import d6.p;
import h6.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzehd implements zzdgv {
    private final Context zza;
    private final i6.a zzb;
    private final m9.a zzc;
    private final zzfet zzd;
    private final zzcfk zze;
    private final zzffo zzf;
    private final zzbju zzg;
    private final boolean zzh;
    private final zzeea zzi;

    public zzehd(Context context, i6.a aVar, m9.a aVar2, zzfet zzfetVar, zzcfk zzcfkVar, zzffo zzffoVar, boolean z4, zzbju zzbjuVar, zzeea zzeeaVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = aVar2;
        this.zzd = zzfetVar;
        this.zze = zzcfkVar;
        this.zzf = zzffoVar;
        this.zzg = zzbjuVar;
        this.zzh = z4;
        this.zzi = zzeeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zza(boolean z4, Context context, zzcwz zzcwzVar) {
        zzdfk zzdfkVar = (zzdfk) zzgei.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zZze = this.zzh ? this.zzg.zze(false) : false;
        r0 r0Var = p.C.f2979c;
        i iVar = new i(zZze, r0.g(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, z4, this.zzd.zzO, false);
        if (zzcwzVar != null) {
            zzcwzVar.zzf();
        }
        zzdgk zzdgkVarZzh = zzdfkVar.zzh();
        zzcfk zzcfkVar = this.zze;
        zzfet zzfetVar = this.zzd;
        i6.a aVar = this.zzb;
        int i = zzfetVar.zzQ;
        String str = zzfetVar.zzB;
        zzfey zzfeyVar = zzfetVar.zzs;
        e.y(context, new AdOverlayInfoParcel(zzdgkVarZzh, zzcfkVar, i, aVar, str, iVar, zzfeyVar.zzb, zzfeyVar.zza, this.zzf.zzf, zzcwzVar, zzfetVar.zzai ? this.zzi : null), true);
    }
}
