package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgkf extends zzggt {
    private final zzgke zza;

    private zzgkf(zzgke zzgkeVar, int i) {
        this.zza = zzgkeVar;
    }

    public static zzgkf zzb(zzgke zzgkeVar, int i) throws GeneralSecurityException {
        return new zzgkf(zzgkeVar, 8);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgkf) && ((zzgkf) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgkf.class, this.zza, 8);
    }

    public final String toString() {
        return v.i("X-AES-GCM Parameters (variant: ", this.zza.toString(), "salt_size_bytes: 8)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgke.zza;
    }
}
