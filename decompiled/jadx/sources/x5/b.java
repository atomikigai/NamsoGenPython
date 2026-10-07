package x5;

import android.os.RemoteException;
import e6.l3;
import e6.m0;
import e6.q2;
import w5.h;
import w5.j;
import w5.w;
import w5.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j {
    public h[] getAdSizes() {
        return this.f9664a.f3401g;
    }

    public e getAppEventListener() {
        return this.f9664a.h;
    }

    public w getVideoController() {
        return this.f9664a.f3398c;
    }

    public x getVideoOptions() {
        return this.f9664a.f3402j;
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f9664a.d(hVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f9664a.e(eVar);
    }

    public void setManualImpressionsEnabled(boolean z4) {
        q2 q2Var = this.f9664a;
        q2Var.f3405m = z4;
        try {
            m0 m0Var = q2Var.i;
            if (m0Var != null) {
                m0Var.zzN(z4);
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
    }

    public void setVideoOptions(x xVar) {
        q2 q2Var = this.f9664a;
        q2Var.f3402j = xVar;
        try {
            m0 m0Var = q2Var.i;
            if (m0Var != null) {
                m0Var.zzU(xVar == null ? null : new l3(xVar));
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
    }
}
