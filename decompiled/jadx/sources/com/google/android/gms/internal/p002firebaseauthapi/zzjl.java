package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjl extends zzon {
    public zzjl() {
        super(zzup.class, zzus.class, new zzjj(zzbk.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zznf zza() {
        return new zzjk(this, zzuj.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zzwh zzb() {
        return zzwh.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* synthetic */ zzalp zzc(zzajf zzajfVar) throws zzaks {
        return zzup.zzd(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* bridge */ /* synthetic */ void zze(zzalp zzalpVar) throws GeneralSecurityException {
        zzup zzupVar = (zzup) zzalpVar;
        if (zzupVar.zzf().zzp()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzzl.zzc(zzupVar.zza(), 0);
        zzlj.zzb(zzupVar.zze().zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzon
    public final /* synthetic */ zzalp zzg(zzalp zzalpVar) throws GeneralSecurityException {
        return ((zzup) zzalpVar).zze();
    }
}
