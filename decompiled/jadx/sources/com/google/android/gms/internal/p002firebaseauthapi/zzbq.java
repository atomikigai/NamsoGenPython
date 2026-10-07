package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbq implements zzbs {
    final /* synthetic */ zzng zza;

    public zzbq(zzng zzngVar) {
        this.zza = zzngVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzbo zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzbp(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzbo zzb() {
        zzng zzngVar = this.zza;
        return new zzbp(zzngVar, zzngVar.zzi());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Set zze() {
        return this.zza.zzl();
    }
}
