package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzga extends zzcx {
    private final zzfz zza;

    private zzga(zzfz zzfzVar) {
        this.zza = zzfzVar;
    }

    public static zzga zzc(zzfz zzfzVar) {
        return new zzga(zzfzVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzga) && ((zzga) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzga.class, this.zza});
    }

    public final String toString() {
        return v.i("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza != zzfz.zzc;
    }

    public final zzfz zzb() {
        return this.zza;
    }
}
