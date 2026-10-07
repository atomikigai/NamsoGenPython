package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzch {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zzxo zzd;
    private final int zze;
    private final String zzf;
    private final zzbn zzg;
    private final int zzh;

    public zzch(Object obj, Object obj2, byte[] bArr, int i, zzxo zzxoVar, int i10, String str, zzbn zzbnVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i;
        this.zzd = zzxoVar;
        this.zze = i10;
        this.zzf = str;
        this.zzg = zzbnVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzbn zzb() {
        return this.zzg;
    }

    public final zzxo zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
