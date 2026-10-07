package com.google.android.gms.internal.ads;

import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgie extends zzggt {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgic zzd;

    public /* synthetic */ zzgie(int i, int i10, int i11, zzgic zzgicVar, zzgid zzgidVar) {
        this.zza = i;
        this.zzd = zzgicVar;
    }

    public static zzgib zzc() {
        return new zzgib(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgie)) {
            return false;
        }
        zzgie zzgieVar = (zzgie) obj;
        return zzgieVar.zza == this.zza && zzgieVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgie.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return b.c(q1.a.n("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzd != zzgic.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgic zzd() {
        return this.zzd;
    }
}
