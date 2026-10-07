package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhr extends zzcx {
    private final zzhq zza;

    private zzhr(zzhq zzhqVar) {
        this.zza = zzhqVar;
    }

    public static zzhr zzc() {
        return new zzhr(zzhq.zzc);
    }

    public static zzhr zzd(zzhq zzhqVar) {
        return new zzhr(zzhqVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhr) && ((zzhr) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzhr.class, this.zza});
    }

    public final String toString() {
        return v.i("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza != zzhq.zzc;
    }

    public final zzhq zzb() {
        return this.zza;
    }
}
