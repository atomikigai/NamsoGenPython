package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdu extends zznf {
    final /* synthetic */ zzdv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzdv zzdvVar, Class cls) {
        super(cls);
        this.zza = zzdvVar;
    }

    public static final zzso zzf(zzsr zzsrVar) throws GeneralSecurityException {
        zzsn zzsnVarZzb = zzso.zzb();
        zzsnVarZzb.zzb(zzsrVar.zzf());
        byte[] bArrZzb = zzor.zzb(zzsrVar.zza());
        zzsnVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        zzsnVarZzb.zzc(0);
        return (zzso) zzsnVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        return zzf((zzsr) zzalpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzsr.zze(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzd(zzsr zzsrVar) throws GeneralSecurityException {
        zzzl.zzb(zzsrVar.zza());
        zzdv zzdvVar = this.zza;
        zzdv.zzm(zzsrVar.zzf());
    }
}
