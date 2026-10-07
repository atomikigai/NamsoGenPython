package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgwv {
    private final zzgwu zza;

    private zzgwv(zzgwu zzgwuVar) {
        this.zza = zzgwuVar;
    }

    public static zzgwv zzb(byte[] bArr, zzggn zzggnVar) {
        return new zzgwv(zzgwu.zzb(bArr));
    }

    public static zzgwv zzc(int i) {
        return new zzgwv(zzgwu.zzb(zzgoz.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzggn zzggnVar) {
        return this.zza.zzc();
    }
}
