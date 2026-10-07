package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.SystemClock;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzdu implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzef zzk;

    public zzdu(zzef zzefVar, boolean z4) {
        this.zzk = zzefVar;
        ((b) zzefVar.zza).getClass();
        this.zzh = System.currentTimeMillis();
        ((b) zzefVar.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        this.zzj = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e) {
            this.zzk.zzT(e, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza() throws RemoteException;

    public void zzb() {
    }
}
