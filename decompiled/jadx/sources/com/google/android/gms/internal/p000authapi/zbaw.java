package com.google.android.gms.internal.p000authapi;

import a.a;
import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zbaw extends zbac {
    final /* synthetic */ TaskCompletionSource zba;

    public zbaw(zbay zbayVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbad
    public final void zbb(Status status, PendingIntent pendingIntent) throws RemoteException {
        a.o(status, pendingIntent, this.zba);
    }
}
