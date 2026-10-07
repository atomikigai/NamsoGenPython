package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class as extends aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f2641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f2642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2643d;
    final /* synthetic */ ax e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(ax axVar, TaskCompletionSource taskCompletionSource, String str, long j4, long j10, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.e = axVar;
        this.f2640a = str;
        this.f2641b = j4;
        this.f2642c = j10;
        this.f2643d = taskCompletionSource2;
    }

    @Override // k9.w
    public final void b() {
        if (ax.g(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.e;
            k9.n nVar = (k9.n) axVar.f2649a.f6108n;
            Bundle bundleA = ax.a(axVar, this.f2640a, this.f2641b, this.f2642c);
            au auVar = new au(this.e, this.f2643d);
            k9.l lVar = (k9.l) nVar;
            lVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(lVar.f6092b);
            int i = k9.j.f6113a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(auVar);
            lVar.y(3, parcelObtain);
        } catch (RemoteException e) {
            this.e.f2650b.a(e, "requestExpressIntegrityToken(%s, %s)", this.f2640a, Long.valueOf(this.f2641b));
            this.f2643d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
