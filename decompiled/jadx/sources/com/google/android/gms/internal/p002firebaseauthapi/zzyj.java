package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyj implements zzbl {
    private final zzyl zza;
    private final String zzb;
    private final byte[] zzc;
    private final zzyh zzd;

    public zzyj(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzyh zzyhVar) throws GeneralSecurityException {
        zzmq.zzf(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zza = new zzyl(eCPublicKey);
        this.zzc = bArr;
        this.zzb = str;
        this.zzd = zzyhVar;
    }
}
