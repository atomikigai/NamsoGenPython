package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrt {
    private final zzbu zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzrt(zzbu zzbuVar, int i, String str, String str2, zzrs zzrsVar) {
        this.zza = zzbuVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrt)) {
            return false;
        }
        zzrt zzrtVar = (zzrt) obj;
        return this.zza == zzrtVar.zza && this.zzb == zzrtVar.zzb && this.zzc.equals(zzrtVar.zzc) && this.zzd.equals(zzrtVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return "(status=" + this.zza + ", keyId=" + this.zzb + ", keyType='" + this.zzc + "', keyPrefix='" + this.zzd + "')";
    }

    public final int zza() {
        return this.zzb;
    }
}
