package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class ab extends k9.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f2611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f2612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f2614d;
    final /* synthetic */ ad e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ad adVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l2, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.e = adVar;
        this.f2611a = bArr;
        this.f2612b = l2;
        this.f2613c = taskCompletionSource2;
        this.f2614d = integrityTokenRequest;
    }

    @Override // k9.w
    public final void a(Exception exc) {
        if (exc instanceof k9.d) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // k9.w
    public final void b() {
        try {
            ad adVar = this.e;
            k9.s sVar = (k9.s) adVar.f2618a.f6108n;
            Bundle bundleA = ad.a(adVar, this.f2611a, this.f2612b, null);
            ac acVar = new ac(this.e, this.f2613c);
            k9.q qVar = (k9.q) sVar;
            qVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(qVar.f6092b);
            int i = k9.j.f6113a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(acVar);
            qVar.y(2, parcelObtain);
        } catch (RemoteException e) {
            this.e.f2619b.a(e, "requestIntegrityToken(%s)", this.f2614d);
            this.f2613c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
