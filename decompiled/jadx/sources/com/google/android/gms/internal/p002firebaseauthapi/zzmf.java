package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzmf implements zzlu {
    private final zzzo zza;
    private final zzzo zzb;

    private zzmf(byte[] bArr, byte[] bArr2) {
        this.zza = zzzo.zzb(bArr);
        this.zzb = zzzo.zzb(bArr2);
    }

    public static zzmf zzc(byte[] bArr) throws GeneralSecurityException {
        return new zzmf(bArr, zzzm.zzb(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final zzzo zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final zzzo zzb() {
        return this.zzb;
    }
}
