package com.google.android.gms.internal.ads;

import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgql extends zzgqo {
    private final int zza;
    private final int zzb;
    private final zzgqj zzc;
    private final zzgqi zzd;

    public /* synthetic */ zzgql(int i, int i10, zzgqj zzgqjVar, zzgqi zzgqiVar, zzgqk zzgqkVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzgqjVar;
        this.zzd = zzgqiVar;
    }

    public static zzgqh zze() {
        return new zzgqh(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgql)) {
            return false;
        }
        zzgql zzgqlVar = (zzgql) obj;
        return zzgqlVar.zza == this.zza && zzgqlVar.zzd() == zzd() && zzgqlVar.zzc == this.zzc && zzgqlVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgql.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder sbE = b.e("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        sbE.append(this.zzb);
        sbE.append("-byte tags, and ");
        return b.c(sbE, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzc != zzgqj.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgqj zzgqjVar = this.zzc;
        if (zzgqjVar == zzgqj.zzd) {
            return this.zzb;
        }
        if (zzgqjVar == zzgqj.zza || zzgqjVar == zzgqj.zzb || zzgqjVar == zzgqj.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgqi zzf() {
        return this.zzd;
    }

    public final zzgqj zzg() {
        return this.zzc;
    }
}
