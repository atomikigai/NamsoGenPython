package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzot extends BroadcastReceiver {
    final /* synthetic */ zzov zza;

    public /* synthetic */ zzot(zzov zzovVar, zzou zzouVar) {
        this.zza = zzovVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzov zzovVar = this.zza;
        zzovVar.zzj(zzop.zzd(context, intent, zzovVar.zzh, zzovVar.zzg));
    }
}
