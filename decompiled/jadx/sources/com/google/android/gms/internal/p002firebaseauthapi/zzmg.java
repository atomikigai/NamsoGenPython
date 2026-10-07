package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmg {
    private final zzbd zza;
    private final zzbj zzb;

    public zzmg(zzbd zzbdVar) {
        this.zza = zzbdVar;
        this.zzb = null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbd zzbdVar = this.zza;
        return zzbdVar != null ? zzbdVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }

    public zzmg(zzbj zzbjVar) {
        this.zza = null;
        this.zzb = zzbjVar;
    }
}
