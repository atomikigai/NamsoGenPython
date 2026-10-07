package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaba implements zzafe {
    final /* synthetic */ zzafe zza;
    final /* synthetic */ zzahb zzb;
    final /* synthetic */ zzabb zzc;

    public zzaba(zzabb zzabbVar, zzafe zzafeVar, zzahb zzahbVar) {
        this.zzc = zzabbVar;
        this.zza = zzafeVar;
        this.zzb = zzahbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzc.zzb.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listZzb = ((zzagr) obj).zzb();
        if (listZzb == null || listZzb.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzags zzagsVar = (zzags) listZzb.get(0);
        zzahn zzahnVar = new zzahn();
        zzahnVar.zze(this.zzb.zze());
        zzahnVar.zzb(this.zzc.zza);
        zzabb zzabbVar = this.zzc;
        zzabz.zzf(zzabbVar.zzc, zzabbVar.zzb, this.zzb, zzagsVar, zzahnVar, this.zza);
    }
}
