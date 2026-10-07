package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzop implements zzot {
    private final zzzo zza;
    private final zzwn zzb;

    private zzop(zzwn zzwnVar, zzzo zzzoVar) {
        this.zzb = zzwnVar;
        this.zza = zzzoVar;
    }

    public static zzop zza(zzwn zzwnVar) throws GeneralSecurityException {
        String strZzg = zzwnVar.zzg();
        Charset charset = zzpd.zza;
        byte[] bArr = new byte[strZzg.length()];
        for (int i = 0; i < strZzg.length(); i++) {
            char cCharAt = strZzg.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return new zzop(zzwnVar, zzzo.zzb(bArr));
    }

    public static zzop zzb(zzwn zzwnVar) {
        return new zzop(zzwnVar, zzpd.zzb(zzwnVar.zzg()));
    }

    public final zzwn zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
    public final zzzo zzd() {
        return this.zza;
    }
}
