package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnh {
    private final zzgfy zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgnh(zzgfy zzgfyVar, int i, String str, String str2, zzgni zzgniVar) {
        this.zza = zzgfyVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnh)) {
            return false;
        }
        zzgnh zzgnhVar = (zzgnh) obj;
        return this.zza == zzgnhVar.zza && this.zzb == zzgnhVar.zzb && this.zzc.equals(zzgnhVar.zzc) && this.zzd.equals(zzgnhVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return "(status=" + this.zza + ", keyId=" + this.zzb + ", keyType='" + this.zzc + "', keyPrefix='" + this.zzd + "')";
    }

    public final int zza() {
        return this.zzb;
    }
}
