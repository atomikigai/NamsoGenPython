package e6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends q7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbul f3358a;

    public final m0 a(Context context, q3 q3Var, String str, zzbpg zzbpgVar, int i) {
        n0 n0Var;
        zzbcn.zza(context);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkp)).booleanValue()) {
            try {
                q7.b bVar = new q7.b(context);
                try {
                    IBinder iBinderB = qd.b.K(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        n0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        n0Var = iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new n0(iBinderB);
                    }
                    IBinder iBinderY = n0Var.y(bVar, q3Var, str, zzbpgVar, i);
                    if (iBinderY != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderY.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof m0 ? (m0) iInterfaceQueryLocalInterface2 : new k0(iBinderY);
                    }
                } catch (Exception e) {
                    throw new i6.j(e);
                }
            } catch (RemoteException e4) {
                e = e4;
                Exception exc = e;
                zzbul zzbulVarZza = zzbuj.zza(context);
                this.f3358a = zzbulVarZza;
                zzbulVarZza.zzh(exc, "AdManagerCreator.newAdManagerByDynamiteLoader");
                i6.h.i("#007 Could not call remote method.", exc);
                return null;
            } catch (i6.j e10) {
                e = e10;
                Exception exc2 = e;
                zzbul zzbulVarZza2 = zzbuj.zza(context);
                this.f3358a = zzbulVarZza2;
                zzbulVarZza2.zzh(exc2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                i6.h.i("#007 Could not call remote method.", exc2);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                Exception exc3 = e;
                zzbul zzbulVarZza3 = zzbuj.zza(context);
                this.f3358a = zzbulVarZza3;
                zzbulVarZza3.zzh(exc3, "AdManagerCreator.newAdManagerByDynamiteLoader");
                i6.h.i("#007 Could not call remote method.", exc3);
                return null;
            }
        } else {
            try {
                IBinder iBinderY2 = ((n0) getRemoteCreatorInstance(context)).y(new q7.b(context), q3Var, str, zzbpgVar, i);
                if (iBinderY2 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderY2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof m0 ? (m0) iInterfaceQueryLocalInterface3 : new k0(iBinderY2);
                }
            } catch (RemoteException e12) {
                e = e12;
                i6.h.c("Could not create remote AdManager.", e);
                return null;
            } catch (q7.c e13) {
                e = e13;
                i6.h.c("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new n0(iBinder);
    }
}
