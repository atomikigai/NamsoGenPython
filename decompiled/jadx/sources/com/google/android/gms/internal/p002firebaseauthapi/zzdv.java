package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdv extends zzng {
    public zzdv() {
        super(zzso.class, new zzdt(zzzf.class));
    }

    public static final void zzh(zzso zzsoVar) throws GeneralSecurityException {
        zzzl.zzc(zzsoVar.zza(), 0);
        zzzl.zzb(zzsoVar.zzg().zzd());
        zzm(zzsoVar.zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzsu zzsuVar) throws GeneralSecurityException {
        if (zzsuVar.zza() < 12 || zzsuVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zznf zza() {
        return new zzdu(this, zzsr.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zzwh zzb() {
        return zzwh.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* synthetic */ zzalp zzc(zzajf zzajfVar) throws zzaks {
        return zzso.zze(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* bridge */ /* synthetic */ void zze(zzalp zzalpVar) throws GeneralSecurityException {
        zzh((zzso) zzalpVar);
    }
}
