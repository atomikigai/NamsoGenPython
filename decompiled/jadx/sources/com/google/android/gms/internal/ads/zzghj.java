package com.google.android.gms.internal.ads;

import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzghj extends zzggt {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzghh zze;
    private final zzghg zzf;

    public /* synthetic */ zzghj(int i, int i10, int i11, int i12, zzghh zzghhVar, zzghg zzghgVar, zzghi zzghiVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzghhVar;
        this.zzf = zzghgVar;
    }

    public static zzghf zzf() {
        return new zzghf(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghj)) {
            return false;
        }
        zzghj zzghjVar = (zzghj) obj;
        return zzghjVar.zza == this.zza && zzghjVar.zzb == this.zzb && zzghjVar.zzc == this.zzc && zzghjVar.zzd == this.zzd && zzghjVar.zze == this.zze && zzghjVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzghj.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder sbE = b.e("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        sbE.append(this.zzc);
        sbE.append("-byte IV, and ");
        sbE.append(this.zzd);
        sbE.append("-byte tags, and ");
        sbE.append(this.zza);
        sbE.append("-byte AES key, and ");
        return b.c(sbE, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zze != zzghh.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzghg zzg() {
        return this.zzf;
    }

    public final zzghh zzh() {
        return this.zze;
    }
}
