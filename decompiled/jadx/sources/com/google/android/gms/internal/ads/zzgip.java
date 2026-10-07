package com.google.android.gms.internal.ads;

import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgip extends zzggt {
    private final int zza;
    private final zzgin zzb;

    public /* synthetic */ zzgip(int i, zzgin zzginVar, zzgio zzgioVar) {
        this.zza = i;
        this.zzb = zzginVar;
    }

    public static zzgim zzc() {
        return new zzgim(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgip)) {
            return false;
        }
        zzgip zzgipVar = (zzgip) obj;
        return zzgipVar.zza == this.zza && zzgipVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgip.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return b.c(q1.a.n("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzb != zzgin.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgin zzd() {
        return this.zzb;
    }
}
