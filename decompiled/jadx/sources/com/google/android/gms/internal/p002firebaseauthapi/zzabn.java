package com.google.android.gms.internal.p002firebaseauthapi;

import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzabn implements zzafe {
    final /* synthetic */ zzadx zza;
    final /* synthetic */ zzabz zzb;

    public zzabn(zzabz zzabzVar, zzadx zzadxVar) {
        this.zzb = zzabzVar;
        this.zza = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahb zzahbVar = (zzahb) obj;
        this.zzb.zza.zzg(new zzagq(zzahbVar.zze()), new zzabm(this, this, zzahbVar));
    }
}
