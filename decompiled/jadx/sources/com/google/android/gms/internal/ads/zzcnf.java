package com.google.android.gms.internal.ads;

import e6.h2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcnf implements zzcwp {
    private final zzfew zza;
    private final zzfff zzb;
    private final zzfln zzc;
    private final zzflr zzd;

    public zzcnf(zzfff zzfffVar, zzflr zzflrVar, zzfln zzflnVar) {
        this.zzb = zzfffVar;
        this.zzd = zzflrVar;
        this.zzc = zzflnVar;
        this.zza = zzfffVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(h2 h2Var) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}
