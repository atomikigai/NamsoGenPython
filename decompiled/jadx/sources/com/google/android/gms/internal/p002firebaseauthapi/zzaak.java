package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaak implements zzafe {
    final /* synthetic */ zzafd zza;
    final /* synthetic */ zzadx zzb;
    final /* synthetic */ zzahb zzc;
    final /* synthetic */ zzahn zzd;
    final /* synthetic */ zzabz zze;

    public zzaak(zzabz zzabzVar, zzafd zzafdVar, zzadx zzadxVar, zzahb zzahbVar, zzahn zzahnVar) {
        this.zze = zzabzVar;
        this.zza = zzafdVar;
        this.zzb = zzadxVar;
        this.zzc = zzahbVar;
        this.zzd = zzahnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listZzb = ((zzagr) obj).zzb();
        if (listZzb == null || listZzb.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzabz.zzf(this.zze, this.zzb, this.zzc, (zzags) listZzb.get(0), this.zzd, this.zza);
        }
    }
}
