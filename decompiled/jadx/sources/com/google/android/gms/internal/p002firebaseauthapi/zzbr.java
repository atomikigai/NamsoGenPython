package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbr implements zzbs {
    final /* synthetic */ zzon zza;
    final /* synthetic */ zzng zzb;

    public zzbr(zzon zzonVar, zzng zzngVar) {
        this.zza = zzonVar;
        this.zzb = zzngVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzbo zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzco(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzbo zzb() {
        zzon zzonVar = this.zza;
        return new zzco(zzonVar, this.zzb, zzonVar.zzi());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Set zze() {
        return this.zza.zzl();
    }
}
