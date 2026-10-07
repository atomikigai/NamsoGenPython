package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f2230g;
    public final /* synthetic */ f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f fVar, int i, IBinder iBinder, Bundle bundle) {
        super(fVar, i, bundle);
        this.h = fVar;
        this.f2230g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.c0
    public final void a(g7.b bVar) {
        f fVar = this.h;
        if (fVar.zzx != null) {
            fVar.zzx.onConnectionFailed(bVar);
        }
        fVar.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.c0
    public final boolean b() {
        IBinder iBinder = this.f2230g;
        try {
            i0.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + fVar.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = fVar.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(f.zzn(fVar, 2, 4, iInterfaceCreateServiceInterface) || f.zzn(fVar, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            fVar.zzB = null;
            Bundle connectionHint = fVar.getConnectionHint();
            if (fVar.zzw == null) {
                return true;
            }
            fVar.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
