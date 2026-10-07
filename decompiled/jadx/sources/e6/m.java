package e6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpg f3344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f3345d;

    public m(q qVar, Context context, zzbpg zzbpgVar) {
        this.f3343b = context;
        this.f3344c = zzbpgVar;
        this.f3345d = qVar;
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object a() {
        q.g(this.f3343b, "ads_preloader");
        return null;
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        q7.b bVar = new q7.b(this.f3343b);
        zzbpg zzbpgVar = this.f3344c;
        v0 v0VarN = b1Var.n(bVar, zzbpgVar, 243799000);
        v0VarN.zzh(zzbpgVar);
        return v0VarN;
    }

    @Override // e6.r
    public final Object c() {
        v0 t0Var;
        w0 w0Var;
        v0 t0Var2;
        Context context = this.f3343b;
        q7.b bVar = new q7.b(context);
        zzbcn.zza(context);
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkp)).booleanValue();
        q qVar = this.f3345d;
        zzbpg zzbpgVar = this.f3344c;
        if (!zBooleanValue) {
            y2 y2Var = (y2) qVar.f3395g;
            try {
                q7.b bVar2 = new q7.b(context);
                w0 w0Var2 = (w0) y2Var.getRemoteCreatorInstance(context);
                Parcel parcelZza = w0Var2.zza();
                zzaye.zzf(parcelZza, bVar2);
                zzaye.zzf(parcelZza, zzbpgVar);
                parcelZza.writeInt(243799000);
                Parcel parcelZzdb = w0Var2.zzdb(1, parcelZza);
                IBinder strongBinder = parcelZzdb.readStrongBinder();
                parcelZzdb.recycle();
                if (strongBinder == null) {
                    t0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    t0Var = iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new t0(strongBinder);
                }
                t0Var.zzh(zzbpgVar);
                return t0Var;
            } catch (RemoteException e) {
                e = e;
                i6.h.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (q7.c e4) {
                e = e4;
                i6.h.h("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = qd.b.K(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    w0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    w0Var = iInterfaceQueryLocalInterface2 instanceof w0 ? (w0) iInterfaceQueryLocalInterface2 : new w0(iBinderB);
                }
                Parcel parcelZza2 = w0Var.zza();
                zzaye.zzf(parcelZza2, bVar);
                zzaye.zzf(parcelZza2, zzbpgVar);
                parcelZza2.writeInt(243799000);
                Parcel parcelZzdb2 = w0Var.zzdb(1, parcelZza2);
                IBinder strongBinder2 = parcelZzdb2.readStrongBinder();
                parcelZzdb2.recycle();
                if (strongBinder2 == null) {
                    t0Var2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    t0Var2 = iInterfaceQueryLocalInterface3 instanceof v0 ? (v0) iInterfaceQueryLocalInterface3 : new t0(strongBinder2);
                }
                t0Var2.zzh(zzbpgVar);
                return t0Var2;
            } catch (Exception e10) {
                throw new i6.j(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            zzbul zzbulVarZza = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza;
            zzbulVarZza.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (i6.j e12) {
            e = e12;
            zzbul zzbulVarZza2 = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza2;
            zzbulVarZza2.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            zzbul zzbulVarZza3 = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza3;
            zzbulVarZza3.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }
}
