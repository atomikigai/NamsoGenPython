package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjo implements zzdtv {
    private final zzciy zza;
    private Context zzb;
    private zzbkq zzc;

    public /* synthetic */ zzcjo(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final /* bridge */ /* synthetic */ zzdtv zza(zzbkq zzbkqVar) {
        zzbkqVar.getClass();
        this.zzc = zzbkqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final /* bridge */ /* synthetic */ zzdtv zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final zzdtw zzc() {
        zzhgf.zzc(this.zzb, Context.class);
        zzhgf.zzc(this.zzc, zzbkq.class);
        return new zzcjp(this.zza, this.zzb, this.zzc, null);
    }
}
