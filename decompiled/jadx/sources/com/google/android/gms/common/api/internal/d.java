package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BasePendingResult implements e {
    private final com.google.android.gms.common.api.i api;
    private final com.google.android.gms.common.api.c clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.o oVar) {
        super(oVar);
        com.google.android.gms.common.internal.i0.j(oVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.i0.j(iVar, "Api must not be null");
        this.clientKey = iVar.f2051b;
        this.api = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar) throws RemoteException;

    public final com.google.android.gms.common.api.i getApi() {
        return this.api;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.clientKey;
    }

    public final void run(com.google.android.gms.common.api.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e) {
            setFailedResult(new Status(8, e.getLocalizedMessage(), null, null));
            throw e;
        } catch (RemoteException e4) {
            setFailedResult(new Status(8, e4.getLocalizedMessage(), null, null));
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.i0.a("Failed result must not be success", !status.g());
        com.google.android.gms.common.api.s sVarCreateFailedResult = createFailedResult(status);
        setResult(sVarCreateFailedResult);
        onSetFailedResult(sVarCreateFailedResult);
    }

    public void onSetFailedResult(com.google.android.gms.common.api.s sVar) {
    }
}
