package com.google.android.gms.internal.p002firebaseauthapi;

import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaah implements zzafe {
    final /* synthetic */ zzadx zza;
    final /* synthetic */ zzabz zzb;

    public zzaah(zzabz zzabzVar, zzadx zzadxVar) {
        this.zzb = zzabzVar;
        this.zza = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaii zzaiiVar = (zzaii) obj;
        if (zzaiiVar.zzg()) {
            this.zza.zzf(new zzaaf(zzaiiVar.zzd(), zzaiiVar.zzf(), null));
            return;
        }
        zzahb zzahbVar = new zzahb(zzaiiVar.zze(), zzaiiVar.zzc(), Long.valueOf(zzaiiVar.zzb()), "Bearer");
        this.zzb.zzR(zzahbVar, null, null, Boolean.FALSE, null, this.zza, this);
    }
}
