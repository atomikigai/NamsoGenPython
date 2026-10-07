package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2226b;

    public l0(f fVar, int i) {
        this.f2226b = fVar;
        this.f2225a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f2226b;
        if (iBinder == null) {
            f.zzk(fVar, 16);
            return;
        }
        synchronized (fVar.zzq) {
            try {
                f fVar2 = this.f2226b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new e0(iBinder) : (p) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2226b.zzl(0, null, this.f2225a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2226b.zzq) {
            this.f2226b.zzr = null;
        }
        f fVar = this.f2226b;
        int i = this.f2225a;
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
