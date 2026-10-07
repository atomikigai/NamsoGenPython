package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdh extends zzng {
    public zzdh() {
        super(zzsi.class, new zzdf(zzbd.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zznf zza() {
        return new zzdg(this, zzsl.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zzwh zzb() {
        return zzwh.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* synthetic */ zzalp zzc(zzajf zzajfVar) throws zzaks {
        return zzsi.zzd(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* bridge */ /* synthetic */ void zze(zzalp zzalpVar) throws GeneralSecurityException {
        zzsi zzsiVar = (zzsi) zzalpVar;
        zzzl.zzc(zzsiVar.zza(), 0);
        new zzdv();
        zzdv.zzh(zzsiVar.zze());
        new zzqj();
        zzqj.zzm(zzsiVar.zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final int zzf() {
        return 2;
    }
}
