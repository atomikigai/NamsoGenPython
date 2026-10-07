package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import v9.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaav implements zzafe {
    final /* synthetic */ zzafe zza;
    final /* synthetic */ zzaaw zzb;

    public zzaav(zzaaw zzaawVar, zzafe zzafeVar) {
        this.zzb = zzaawVar;
        this.zza = zzafeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zzb(Object obj) {
        zzaik zzaikVar = (zzaik) obj;
        if (!TextUtils.isEmpty(zzaikVar.zzf())) {
            Status status = new Status(17025, null, null, null);
            zzaaw zzaawVar = this.zzb;
            zzaawVar.zzb.zzg(status, new t(null, null, zzaikVar.zzd(), zzaikVar.zzf(), true));
            return;
        }
        zzahb zzahbVar = new zzahb(zzaikVar.zze(), zzaikVar.zzc(), Long.valueOf(zzaikVar.zzb()), "Bearer");
        zzaaw zzaawVar2 = this.zzb;
        Boolean boolValueOf = Boolean.valueOf(zzaikVar.zzg());
        zzaaw zzaawVar3 = this.zzb;
        zzafe zzafeVar = this.zza;
        zzaawVar2.zzc.zzR(zzahbVar, null, "phone", boolValueOf, null, zzaawVar3.zzb, zzafeVar);
    }
}
