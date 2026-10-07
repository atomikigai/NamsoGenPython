package com.google.android.gms.internal.ads;

import da.v;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgkm extends zzggt {
    private final zzgkl zza;

    private zzgkm(zzgkl zzgklVar) {
        this.zza = zzgklVar;
    }

    public static zzgkm zzc(zzgkl zzgklVar) {
        return new zzgkm(zzgklVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgkm) && ((zzgkm) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgkm.class, this.zza);
    }

    public final String toString() {
        return v.i("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgkl.zzc;
    }

    public final zzgkl zzb() {
        return this.zza;
    }
}
