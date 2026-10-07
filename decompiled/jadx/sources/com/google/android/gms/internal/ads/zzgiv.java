package com.google.android.gms.internal.ads;

import da.v;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgiv extends zzggt {
    private final zzgiu zza;

    private zzgiv(zzgiu zzgiuVar) {
        this.zza = zzgiuVar;
    }

    public static zzgiv zzc(zzgiu zzgiuVar) {
        return new zzgiv(zzgiuVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgiv) && ((zzgiv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgiv.class, this.zza);
    }

    public final String toString() {
        return v.i("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgiu.zzc;
    }

    public final zzgiu zzb() {
        return this.zza;
    }
}
