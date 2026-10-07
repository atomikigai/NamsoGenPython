package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class at extends k9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f2644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f2645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(ax axVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f2645b = axVar;
        this.f2644a = taskCompletionSource;
    }

    @Override // k9.p
    public final void b(Bundle bundle) throws RemoteException {
        this.f2645b.f2649a.c(this.f2644a);
    }

    @Override // k9.p
    public void c(Bundle bundle) throws RemoteException {
        this.f2645b.f2649a.c(this.f2644a);
    }

    @Override // k9.p
    public final void d(Bundle bundle) throws RemoteException {
        this.f2645b.f2649a.c(this.f2644a);
    }

    @Override // k9.p
    public void e(Bundle bundle) throws RemoteException {
        this.f2645b.f2649a.c(this.f2644a);
    }
}
