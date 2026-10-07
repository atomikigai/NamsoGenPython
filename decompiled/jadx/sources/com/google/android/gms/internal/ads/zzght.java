package com.google.android.gms.internal.ads;

import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzght extends zzggt {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzghr zzd;

    public /* synthetic */ zzght(int i, int i10, int i11, zzghr zzghrVar, zzghs zzghsVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzd = zzghrVar;
    }

    public static zzghq zzd() {
        return new zzghq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzght)) {
            return false;
        }
        zzght zzghtVar = (zzght) obj;
        return zzghtVar.zza == this.zza && zzghtVar.zzb == this.zzb && zzghtVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzght.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder sbN = q1.a.n("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        sbN.append(this.zzb);
        sbN.append("-byte IV, 16-byte tag, and ");
        return b.c(sbN, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzd != zzghr.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzghr zze() {
        return this.zzd;
    }
}
