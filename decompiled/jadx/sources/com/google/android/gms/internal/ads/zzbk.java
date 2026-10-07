package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbk {
    private final zzx zza = new zzx();

    public final zzbk zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzbk zzb(zzbl zzblVar) {
        zzz zzzVar = zzblVar.zza;
        for (int i = 0; i < zzzVar.zzb(); i++) {
            this.zza.zza(zzzVar.zza(i));
        }
        return this;
    }

    public final zzbk zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzbk zzd(int i, boolean z4) {
        if (z4) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzbl zze() {
        return new zzbl(this.zza.zzb(), null);
    }
}
