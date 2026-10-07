package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjv implements zzfem {
    private final zzciy zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjv(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final /* synthetic */ zzfem zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final /* bridge */ /* synthetic */ zzfem zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final zzfen zzc() {
        zzhgf.zzc(this.zzb, Context.class);
        return new zzcjw(this.zza, this.zzb, this.zzc, null);
    }
}
