package com.google.android.gms.internal.ads;

import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgpu extends zzgqo {
    private final int zza;
    private final int zzb;
    private final zzgps zzc;

    public /* synthetic */ zzgpu(int i, int i10, zzgps zzgpsVar, zzgpt zzgptVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzgpsVar;
    }

    public static zzgpr zze() {
        return new zzgpr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpu)) {
            return false;
        }
        zzgpu zzgpuVar = (zzgpu) obj;
        return zzgpuVar.zza == this.zza && zzgpuVar.zzd() == zzd() && zzgpuVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgpu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        StringBuilder sbN = q1.a.n("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        sbN.append(this.zzb);
        sbN.append("-byte tags, and ");
        return b.c(sbN, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzc != zzgps.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgps zzgpsVar = this.zzc;
        if (zzgpsVar == zzgps.zzd) {
            return this.zzb;
        }
        if (zzgpsVar == zzgps.zza || zzgpsVar == zzgps.zzb || zzgpsVar == zzgps.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgps zzf() {
        return this.zzc;
    }
}
