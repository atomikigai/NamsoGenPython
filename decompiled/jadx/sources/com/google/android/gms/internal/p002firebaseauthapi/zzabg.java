package com.google.android.gms.internal.p002firebaseauthapi;

import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzabg implements zzafe {
    final /* synthetic */ zzabh zza;

    public zzabg(zzabh zzabhVar) {
        this.zza = zzabhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zzb.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzagh zzaghVar = (zzagh) obj;
        zzahb zzahbVar = new zzahb(zzaghVar.zzc(), zzaghVar.zzb(), Long.valueOf(zzahd.zza(zzaghVar.zzb())), "Bearer");
        Boolean bool = Boolean.FALSE;
        zzabh zzabhVar = this.zza;
        zzabhVar.zzc.zzR(zzahbVar, null, null, bool, null, zzabhVar.zzb, this);
    }
}
