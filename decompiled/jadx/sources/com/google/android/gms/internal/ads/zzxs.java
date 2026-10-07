package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzxs implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzyb zza;

    public zzxs(zzxt zzxtVar, zzyb zzybVar) {
        this.zza = zzybVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        this.zza.zzu();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        this.zza.zzu();
    }
}
