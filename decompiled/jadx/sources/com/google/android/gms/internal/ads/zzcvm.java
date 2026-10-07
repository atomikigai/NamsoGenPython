package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcvm implements zzcya, zzcxh {
    private final zzfet zza;

    public zzcvm(Context context, zzfet zzfetVar, zzbtl zzbtlVar) {
        this.zza = zzfetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzbtm zzbtmVar = this.zza.zzad;
        if (zzbtmVar == null || !zzbtmVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zza.zzad.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zza.zzad.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(Context context) {
    }
}
