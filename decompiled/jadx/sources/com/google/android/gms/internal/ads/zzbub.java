package com.google.android.gms.internal.ads;

import i6.h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbub extends zzbtu {
    final /* synthetic */ List zza;

    public zzbub(zzbud zzbudVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(String str) {
        h.d("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(List list) {
        h.f("Recorded click: ".concat(this.zza.toString()));
    }
}
