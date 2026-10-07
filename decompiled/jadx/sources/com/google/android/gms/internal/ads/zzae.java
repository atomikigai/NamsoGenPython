package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzae {
    private final zzm zza;
    private final int zzb;
    private final int zzc;
    private float zzd = 1.0f;

    public zzae(zzm zzmVar, int i, int i10) {
        this.zza = zzmVar;
        this.zzb = i;
        this.zzc = i10;
    }

    public final zzae zza(float f10) {
        this.zzd = f10;
        return this;
    }

    public final zzag zzb() {
        return new zzag(this.zza, this.zzb, this.zzc, this.zzd, 0L, null);
    }
}
