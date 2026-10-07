package com.google.android.gms.internal.ads;

import b9.e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbrx implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbry zzb;

    public zzbrx(zzbry zzbryVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = p.C.f2978b;
        e.y(this.zzb.zza, this.zza, true);
    }
}
