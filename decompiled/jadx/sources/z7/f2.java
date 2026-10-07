package z7;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3 f11117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f11118c;

    public /* synthetic */ f2(k2 k2Var, f3 f3Var, int i) {
        this.f11116a = i;
        this.f11118c = k2Var;
        this.f11117b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f11116a) {
            case 0:
                f3 f3Var = this.f11117b;
                k2 k2Var = this.f11118c;
                a1 a1Var = (a1) k2Var.f159a;
                b0 b0Var = k2Var.f11238d;
                if (b0Var != null) {
                    try {
                        b0Var.k(f3Var);
                    } catch (RemoteException e) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.c(e, "Failed to reset data on the service: remote exception");
                    }
                    k2Var.o();
                } else {
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.b("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                f3 f3Var2 = this.f11117b;
                k2 k2Var2 = this.f11118c;
                a1 a1Var2 = (a1) k2Var2.f159a;
                b0 b0Var2 = k2Var2.f11238d;
                if (b0Var2 == null) {
                    i0 i0Var3 = a1Var2.f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11190f.b("Discarding data. Failed to send app launch");
                } else {
                    try {
                        b0Var2.f(f3Var2);
                        a1Var2.k().j();
                        k2Var2.g(b0Var2, null, f3Var2);
                        k2Var2.o();
                    } catch (RemoteException e4) {
                        i0 i0Var4 = a1Var2.f11007t;
                        a1.f(i0Var4);
                        i0Var4.f11190f.c(e4, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                f3 f3Var3 = this.f11117b;
                k2 k2Var3 = this.f11118c;
                a1 a1Var3 = (a1) k2Var3.f159a;
                b0 b0Var3 = k2Var3.f11238d;
                if (b0Var3 == null) {
                    i0 i0Var5 = a1Var3.f11007t;
                    a1.f(i0Var5);
                    i0Var5.f11190f.b("Failed to send measurementEnabled to service");
                } else {
                    try {
                        b0Var3.e(f3Var3);
                        k2Var3.o();
                    } catch (RemoteException e10) {
                        i0 i0Var6 = a1Var3.f11007t;
                        a1.f(i0Var6);
                        i0Var6.f11190f.c(e10, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                f3 f3Var4 = this.f11117b;
                k2 k2Var4 = this.f11118c;
                a1 a1Var4 = (a1) k2Var4.f159a;
                b0 b0Var4 = k2Var4.f11238d;
                if (b0Var4 == null) {
                    i0 i0Var7 = a1Var4.f11007t;
                    a1.f(i0Var7);
                    i0Var7.f11190f.b("Failed to send consent settings to service");
                } else {
                    try {
                        b0Var4.H(f3Var4);
                        k2Var4.o();
                    } catch (RemoteException e11) {
                        i0 i0Var8 = a1Var4.f11007t;
                        a1.f(i0Var8);
                        i0Var8.f11190f.c(e11, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
