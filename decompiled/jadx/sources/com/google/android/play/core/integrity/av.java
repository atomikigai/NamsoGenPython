package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class av extends at {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k9.v f2647c;

    public av(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f2647c = new k9.v("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, k9.p
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f2647c.b("onWarmUpExpressIntegrityToken", new Object[0]);
        int i = bundle.getInt("error");
        if (i != 0) {
            this.f2644a.trySetException(new StandardIntegrityException(i, null));
        } else {
            this.f2644a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
