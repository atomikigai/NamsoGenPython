package w5;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbuj;
import e6.m0;
import e6.q2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f9677b;

    public /* synthetic */ y(j jVar, int i) {
        this.f9676a = i;
        this.f9677b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9676a) {
            case 0:
                j jVar = this.f9677b;
                try {
                    q2 q2Var = jVar.f9664a;
                    q2Var.getClass();
                    try {
                        m0 m0Var = q2Var.i;
                        if (m0Var != null) {
                            m0Var.zzB();
                        }
                    } catch (RemoteException e) {
                        i6.h.i("#007 Could not call remote method.", e);
                        return;
                    }
                } catch (IllegalStateException e4) {
                    zzbuj.zza(jVar.getContext()).zzh(e4, "BaseAdView.resume");
                    return;
                }
                zzbuj.zza(jVar.getContext()).zzh(e4, "BaseAdView.resume");
                break;
            case 1:
                j jVar2 = this.f9677b;
                try {
                    q2 q2Var2 = jVar2.f9664a;
                    q2Var2.getClass();
                    try {
                        m0 m0Var2 = q2Var2.i;
                        if (m0Var2 != null) {
                            m0Var2.zzx();
                        }
                    } catch (RemoteException e10) {
                        i6.h.i("#007 Could not call remote method.", e10);
                    }
                } catch (IllegalStateException e11) {
                    zzbuj.zza(jVar2.getContext()).zzh(e11, "BaseAdView.destroy");
                    return;
                }
                break;
            default:
                j jVar3 = this.f9677b;
                try {
                    q2 q2Var3 = jVar3.f9664a;
                    q2Var3.getClass();
                    try {
                        m0 m0Var3 = q2Var3.i;
                        if (m0Var3 != null) {
                            m0Var3.zzz();
                        }
                    } catch (RemoteException e12) {
                        i6.h.i("#007 Could not call remote method.", e12);
                        return;
                    }
                } catch (IllegalStateException e13) {
                    zzbuj.zza(jVar3.getContext()).zzh(e13, "BaseAdView.pause");
                }
                zzbuj.zza(jVar3.getContext()).zzh(e13, "BaseAdView.pause");
                break;
        }
    }
}
