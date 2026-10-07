package z7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements ServiceConnection, com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f11217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile f0 f11218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f11219c;

    public j2(k2 k2Var) {
        this.f11219c = k2Var;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        com.google.android.gms.common.internal.i0.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.i0.i(this.f11218b);
                b0 b0Var = (b0) this.f11218b.getService();
                z0 z0Var = ((a1) this.f11219c.f159a).f11008u;
                a1.f(z0Var);
                z0Var.l(new h2(this, b0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f11218b = null;
                this.f11217a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(g7.b bVar) {
        com.google.android.gms.common.internal.i0.d("MeasurementServiceConnection.onConnectionFailed");
        i0 i0Var = ((a1) this.f11219c.f159a).f11007t;
        if (i0Var == null || !i0Var.f11115b) {
            i0Var = null;
        }
        if (i0Var != null) {
            i0Var.f11193t.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f11217a = false;
            this.f11218b = null;
        }
        z0 z0Var = ((a1) this.f11219c.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new i2(this, 1));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.common.internal.i0.d("MeasurementServiceConnection.onConnectionSuspended");
        a1 a1Var = (a1) this.f11219c.f159a;
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11197x.b("Service connection suspended");
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.l(new i2(this, 0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.i0.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f11217a = false;
                i0 i0Var = ((a1) this.f11219c.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11190f.b("Service connected with null binder");
                return;
            }
            b0 a0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    a0Var = iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new a0(iBinder);
                    i0 i0Var2 = ((a1) this.f11219c.f159a).f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11198y.b("Bound to IMeasurementService interface");
                } else {
                    i0 i0Var3 = ((a1) this.f11219c.f159a).f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11190f.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                i0 i0Var4 = ((a1) this.f11219c.f159a).f11007t;
                a1.f(i0Var4);
                i0Var4.f11190f.b("Service connect failed to get IMeasurementService");
            }
            if (a0Var == null) {
                this.f11217a = false;
                try {
                    m7.a aVarB = m7.a.b();
                    k2 k2Var = this.f11219c;
                    aVarB.c(((a1) k2Var.f159a).f11000a, k2Var.f11237c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                z0 z0Var = ((a1) this.f11219c.f159a).f11008u;
                a1.f(z0Var);
                z0Var.l(new h2(this, a0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.i0.d("MeasurementServiceConnection.onServiceDisconnected");
        a1 a1Var = (a1) this.f11219c.f159a;
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11197x.b("Service disconnected");
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.l(new y9.j(10, this, componentName));
    }
}
