package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import g6.i;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzedz extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ i zzc;

    public zzedz(zzeea zzeeaVar, AlertDialog alertDialog, Timer timer, i iVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        i iVar = this.zzc;
        if (iVar != null) {
            iVar.zzb();
        }
    }
}
