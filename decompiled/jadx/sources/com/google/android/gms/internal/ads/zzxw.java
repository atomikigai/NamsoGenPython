package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzxw {
    public final int zza;
    public final zzbw zzb;
    public final int zzc;
    public final zzad zzd;

    public zzxw(int i, zzbw zzbwVar, int i10) {
        this.zza = i;
        this.zzb = zzbwVar;
        this.zzc = i10;
        this.zzd = zzbwVar.zzb(i10);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzxw zzxwVar);
}
