package com.google.android.gms.internal.ads;

import android.content.Context;
import h6.m0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbyo {
    private Context zza;
    private n7.a zzb;
    private m0 zzc;
    private zzbyv zzd;

    private zzbyo() {
        throw null;
    }

    public final zzbyo zza(m0 m0Var) {
        this.zzc = m0Var;
        return this;
    }

    public final zzbyo zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbyo zzc(n7.a aVar) {
        aVar.getClass();
        this.zzb = aVar;
        return this;
    }

    public final zzbyo zzd(zzbyv zzbyvVar) {
        this.zzd = zzbyvVar;
        return this;
    }

    public final zzbyw zze() {
        zzhgf.zzc(this.zza, Context.class);
        zzhgf.zzc(this.zzb, n7.a.class);
        zzhgf.zzc(this.zzc, m0.class);
        zzhgf.zzc(this.zzd, zzbyv.class);
        return new zzbyp(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public /* synthetic */ zzbyo(zzbyq zzbyqVar) {
    }
}
