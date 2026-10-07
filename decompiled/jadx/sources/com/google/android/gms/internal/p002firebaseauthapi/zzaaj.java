package com.google.android.gms.internal.p002firebaseauthapi;

import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaaj implements zzafe {
    final /* synthetic */ zzadx zza;
    final /* synthetic */ zzabz zzb;

    public zzaaj(zzabz zzabzVar, zzadx zzadxVar) {
        this.zzb = zzabzVar;
        this.zza = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzagf zzagfVar = (zzagf) obj;
        if (zzagfVar.zzg()) {
            this.zza.zzf(new zzaaf(zzagfVar.zzd(), zzagfVar.zzf(), null));
        } else {
            this.zzb.zzR(new zzahb(zzagfVar.zze(), zzagfVar.zzc(), Long.valueOf(zzagfVar.zzb()), "Bearer"), null, null, Boolean.valueOf(zzagfVar.zzh()), null, this.zza, this);
        }
    }
}
