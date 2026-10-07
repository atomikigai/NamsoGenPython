package com.google.android.gms.internal.ads;

import android.view.View;
import d6.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzelh implements f {
    final /* synthetic */ zzdfk zza;

    public zzelh(zzeli zzeliVar, zzdfk zzdfkVar) {
        this.zza = zzdfkVar;
    }

    @Override // d6.f
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // d6.f
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }

    @Override // d6.f
    public final void zza(View view) {
    }
}
