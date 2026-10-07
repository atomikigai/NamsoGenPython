package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzabm implements zzafe {
    final /* synthetic */ zzafe zza;
    final /* synthetic */ zzahb zzb;
    final /* synthetic */ zzabn zzc;

    public zzabm(zzabn zzabnVar, zzafe zzafeVar, zzahb zzahbVar) {
        this.zzc = zzabnVar;
        this.zza = zzafeVar;
        this.zzb = zzahbVar;
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
            return;
        }
        zzabn zzabnVar = this.zzc;
        zzabnVar.zza.zzk(this.zzb, (zzags) listZzb.get(0));
    }
}
