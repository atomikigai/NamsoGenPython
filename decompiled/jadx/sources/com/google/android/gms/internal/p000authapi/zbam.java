package com.google.android.gms.internal.p000authapi;

import a7.i;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zbam extends zbae {
    final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbao zbaoVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaf
    public final void zbb(Status status, i iVar) throws RemoteException {
        if (status.g()) {
            this.zba.setResult(iVar);
        } else {
            this.zba.setException(i0.n(status));
        }
    }
}
