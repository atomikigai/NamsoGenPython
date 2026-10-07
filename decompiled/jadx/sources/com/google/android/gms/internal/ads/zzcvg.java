package com.google.android.gms.internal.ads;

import android.content.Context;
import h6.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcvg implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzcvg(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final i6.a aVarZza = ((zzcid) this.zzb).zza();
        final zzffo zzffoVarZza = ((zzcwd) this.zzc).zza();
        return new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcvf
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzfet zzfetVar = (zzfet) obj;
                j jVar = new j(context);
                jVar.f5012c = zzfetVar.zzB;
                jVar.f5014f = zzfetVar.zzC.toString();
                jVar.e = aVarZza.f5213a;
                jVar.f5013d = zzffoVarZza.zzf;
                return jVar;
            }
        };
    }
}
