package e6;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends w5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3386a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5.c f3387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f3388c;

    public p2(q2 q2Var) {
        this.f3388c = q2Var;
    }

    @Override // w5.c, e6.a
    public final void onAdClicked() {
        synchronized (this.f3386a) {
            try {
                w5.c cVar = this.f3387b;
                if (cVar != null) {
                    cVar.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w5.c
    public final void onAdClosed() {
        synchronized (this.f3386a) {
            try {
                w5.c cVar = this.f3387b;
                if (cVar != null) {
                    cVar.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w5.c
    public final void onAdFailedToLoad(w5.l lVar) {
        q2 q2Var = this.f3388c;
        w5.w wVar = q2Var.f3398c;
        m0 m0Var = q2Var.i;
        j2 j2VarZzl = null;
        if (m0Var != null) {
            try {
                j2VarZzl = m0Var.zzl();
            } catch (RemoteException e) {
                i6.h.i("#007 Could not call remote method.", e);
            }
        }
        wVar.a(j2VarZzl);
        synchronized (this.f3386a) {
            try {
                w5.c cVar = this.f3387b;
                if (cVar != null) {
                    cVar.onAdFailedToLoad(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w5.c
    public final void onAdImpression() {
        synchronized (this.f3386a) {
            try {
                w5.c cVar = this.f3387b;
                if (cVar != null) {
                    cVar.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w5.c
    public final void onAdLoaded() {
        q2 q2Var = this.f3388c;
        w5.w wVar = q2Var.f3398c;
        m0 m0Var = q2Var.i;
        j2 j2VarZzl = null;
        if (m0Var != null) {
            try {
                j2VarZzl = m0Var.zzl();
            } catch (RemoteException e) {
                i6.h.i("#007 Could not call remote method.", e);
            }
        }
        wVar.a(j2VarZzl);
        synchronized (this.f3386a) {
            try {
                w5.c cVar = this.f3387b;
                if (cVar != null) {
                    cVar.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w5.c
    public final void onAdOpened() {
        synchronized (this.f3386a) {
            try {
                w5.c cVar = this.f3387b;
                if (cVar != null) {
                    cVar.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
