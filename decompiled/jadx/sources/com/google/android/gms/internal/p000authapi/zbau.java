package com.google.android.gms.internal.p000authapi;

import a.a;
import a7.f;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zbau extends zbx {
    final /* synthetic */ TaskCompletionSource zba;

    public zbau(zbay zbayVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zby
    public final void zbb(Status status, f fVar) throws RemoteException {
        a.o(status, fVar, this.zba);
    }
}
