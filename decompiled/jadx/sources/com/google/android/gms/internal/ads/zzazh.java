package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzazh implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzazl zzb;

    public zzazh(zzazl zzazlVar, View view) {
        this.zza = view;
        this.zzb = zzazlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
