package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfoa extends BroadcastReceiver {
    final /* synthetic */ zzfob zza;

    public zzfoa(zzfob zzfobVar) {
        this.zza = zzfobVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfob zzfobVar = this.zza;
            zzfobVar.zzd(true, zzfobVar.zzd);
            this.zza.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfob zzfobVar2 = this.zza;
            zzfobVar2.zzd(false, zzfobVar2.zzd);
            this.zza.zzc = false;
        }
    }
}
