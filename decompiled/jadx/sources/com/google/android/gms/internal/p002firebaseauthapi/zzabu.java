package com.google.android.gms.internal.p002firebaseauthapi;

import qd.b;
import v9.d0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzabu implements zzafe {
    final /* synthetic */ d0 zza;
    final /* synthetic */ zzadx zzb;
    final /* synthetic */ zzabz zzc;

    public zzabu(zzabz zzabzVar, d0 d0Var, zzadx zzadxVar) {
        this.zzc = zzabzVar;
        this.zza = d0Var;
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzb.zzh(b.G(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zzb(Object obj) {
        zzahb zzahbVar = (zzahb) obj;
        zzahn zzahnVar = new zzahn();
        zzahnVar.zze(zzahbVar.zze());
        d0 d0Var = this.zza;
        if (d0Var.f9233c || d0Var.f9231a != null) {
            zzahnVar.zzc(d0Var.f9231a);
        }
        d0 d0Var2 = this.zza;
        if (d0Var2.f9234d || d0Var2.e != null) {
            zzahnVar.zzh(d0Var2.f9232b);
        }
        zzabz.zze(this.zzc, this.zzb, zzahbVar, zzahnVar, this);
    }
}
