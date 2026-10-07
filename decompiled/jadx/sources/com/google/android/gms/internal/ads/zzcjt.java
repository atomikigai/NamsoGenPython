package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjt implements zzfcy {
    private final zzciy zza;
    private Context zzb;
    private String zzc;
    private q3 zzd;

    public /* synthetic */ zzcjt(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final /* bridge */ /* synthetic */ zzfcy zza(q3 q3Var) {
        q3Var.getClass();
        this.zzd = q3Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final /* bridge */ /* synthetic */ zzfcy zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final /* bridge */ /* synthetic */ zzfcy zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final zzfcz zzd() {
        zzhgf.zzc(this.zzb, Context.class);
        zzhgf.zzc(this.zzc, String.class);
        zzhgf.zzc(this.zzd, q3.class);
        return new zzcju(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
