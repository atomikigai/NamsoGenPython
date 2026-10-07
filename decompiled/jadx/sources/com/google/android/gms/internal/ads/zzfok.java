package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfok implements Runnable {
    final /* synthetic */ zzfol zza;
    private final WebView zzb;

    public zzfok(zzfol zzfolVar) {
        this.zza = zzfolVar;
        this.zzb = zzfolVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
