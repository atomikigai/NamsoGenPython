package com.google.android.gms.internal.p002firebaseauthapi;

import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaaw implements zzafe {
    final /* synthetic */ zzaij zza;
    final /* synthetic */ zzadx zzb;
    final /* synthetic */ zzabz zzc;

    public zzaaw(zzabz zzabzVar, zzaij zzaijVar, zzadx zzadxVar) {
        this.zzc = zzabzVar;
        this.zza = zzaijVar;
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzb.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzd(((zzahb) obj).zze());
        this.zzc.zza.zzv(this.zza, new zzaav(this, this));
    }
}
