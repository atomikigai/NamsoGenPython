package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdpv implements zzcxh {
    private final zzcfk zza;

    public zzdpv(zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(Context context) {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(Context context) {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(Context context) {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.onResume();
        }
    }
}
