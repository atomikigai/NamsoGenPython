package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcfp implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbyh zza;
    final /* synthetic */ zzcfs zzb;

    public zzcfp(zzcfs zzcfsVar, zzbyh zzbyhVar) {
        this.zza = zzbyhVar;
        this.zzb = zzcfsVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
