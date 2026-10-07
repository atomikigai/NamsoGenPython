package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbsz;
import e6.f;
import e6.q;
import e6.s;
import t2.i;
import t2.k;
import t2.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zzbsz f1962r;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        q qVar = s.f3427f.f3429b;
        zzbpc zzbpcVar = new zzbpc();
        qVar.getClass();
        this.f1962r = (zzbsz) new f(context, zzbpcVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final l doWork() {
        try {
            this.f1962r.zzh();
            return new k(t2.f.f8542c);
        } catch (RemoteException unused) {
            return new i();
        }
    }
}
