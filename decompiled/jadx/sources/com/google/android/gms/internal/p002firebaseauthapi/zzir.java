package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzir extends zzng {
    public zzir() {
        super(zzts.class, new zzip(zzbj.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zznf zza() {
        return new zziq(this, zztv.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zzwh zzb() {
        return zzwh.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* synthetic */ zzalp zzc(zzajf zzajfVar) throws zzaks {
        return zzts.zzd(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* bridge */ /* synthetic */ void zze(zzalp zzalpVar) throws GeneralSecurityException {
        zzts zztsVar = (zzts) zzalpVar;
        zzzl.zzc(zztsVar.zza(), 0);
        if (zztsVar.zze().zzd() != 64) {
            throw new InvalidKeyException(a.j(zztsVar.zze().zzd(), "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}
