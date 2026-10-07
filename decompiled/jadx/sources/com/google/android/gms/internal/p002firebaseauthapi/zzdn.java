package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdn extends zzcx {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzdl zze;
    private final zzdk zzf;

    public /* synthetic */ zzdn(int i, int i10, int i11, int i12, zzdl zzdlVar, zzdk zzdkVar, zzdm zzdmVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzdlVar;
        this.zzf = zzdkVar;
    }

    public static zzdj zzf() {
        return new zzdj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        return zzdnVar.zza == this.zza && zzdnVar.zzb == this.zzb && zzdnVar.zzc == this.zzc && zzdnVar.zzd == this.zzd && zzdnVar.zze == this.zze && zzdnVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzdn.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zze != zzdl.zzc;
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

    public final zzdk zzg() {
        return this.zzf;
    }

    public final zzdl zzh() {
        return this.zze;
    }
}
