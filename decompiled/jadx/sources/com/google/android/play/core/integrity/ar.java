package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class ar extends aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f2637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f2639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ax axVar, TaskCompletionSource taskCompletionSource, long j4, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f2639c = axVar;
        this.f2637a = j4;
        this.f2638b = taskCompletionSource2;
    }

    @Override // k9.w
    public final void b() {
        if (ax.g(this.f2639c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.f2639c;
            k9.n nVar = (k9.n) axVar.f2649a.f6108n;
            Bundle bundleB = ax.b(axVar, this.f2637a);
            av avVar = new av(this.f2639c, this.f2638b);
            k9.l lVar = (k9.l) nVar;
            lVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(lVar.f6092b);
            int i = k9.j.f6113a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(avVar);
            lVar.y(2, parcelObtain);
        } catch (RemoteException e) {
            this.f2639c.f2650b.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.f2637a));
            this.f2638b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
