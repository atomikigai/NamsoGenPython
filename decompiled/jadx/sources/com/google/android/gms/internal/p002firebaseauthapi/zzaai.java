package com.google.android.gms.internal.p002firebaseauthapi;

import qd.b;
import v9.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaai implements zzafe {
    final /* synthetic */ e zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzadx zzc;
    final /* synthetic */ zzabz zzd;

    public zzaai(zzabz zzabzVar, e eVar, String str, zzadx zzadxVar) {
        this.zzd = zzabzVar;
        this.zza = eVar;
        this.zzb = str;
        this.zzc = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzc.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzQ(new zzage(this.zza, ((zzahb) obj).zze(), this.zzb), this.zzc);
    }
}
