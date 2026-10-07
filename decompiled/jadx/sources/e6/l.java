package e6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbpc f3339d;
    public final /* synthetic */ q e;

    public l(q qVar, Context context, String str, zzbpc zzbpcVar) {
        this.f3337b = context;
        this.f3338c = str;
        this.f3339d = zzbpcVar;
        this.e = qVar;
    }

    @Override // e6.r
    public final Object a() {
        q.g(this.f3337b, "native_ad");
        return new a3();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.E(new q7.b(this.f3337b), this.f3338c, this.f3339d, 243799000);
    }

    @Override // e6.r
    public final Object c() {
        j0 j0Var;
        Context context = this.f3337b;
        zzbcn.zza(context);
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkp)).booleanValue();
        zzbpc zzbpcVar = this.f3339d;
        String str = this.f3338c;
        q qVar = this.e;
        if (!zBooleanValue) {
            y2 y2Var = (y2) qVar.f3391b;
            try {
                q7.b bVar = new q7.b(context);
                j0 j0Var2 = (j0) y2Var.getRemoteCreatorInstance(context);
                Parcel parcelZza = j0Var2.zza();
                zzaye.zzf(parcelZza, bVar);
                parcelZza.writeString(str);
                zzaye.zzf(parcelZza, zzbpcVar);
                parcelZza.writeInt(243799000);
                Parcel parcelZzdb = j0Var2.zzdb(1, parcelZza);
                IBinder strongBinder = parcelZzdb.readStrongBinder();
                parcelZzdb.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
            } catch (RemoteException e) {
                e = e;
                i6.h.h("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (q7.c e4) {
                e = e4;
                i6.h.h("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            q7.b bVar2 = new q7.b(context);
            try {
                IBinder iBinderB = qd.b.K(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    j0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    j0Var = iInterfaceQueryLocalInterface2 instanceof j0 ? (j0) iInterfaceQueryLocalInterface2 : new j0(iBinderB);
                }
                Parcel parcelZza2 = j0Var.zza();
                zzaye.zzf(parcelZza2, bVar2);
                parcelZza2.writeString(str);
                zzaye.zzf(parcelZza2, zzbpcVar);
                parcelZza2.writeInt(243799000);
                Parcel parcelZzdb2 = j0Var.zzdb(1, parcelZza2);
                IBinder strongBinder2 = parcelZzdb2.readStrongBinder();
                parcelZzdb2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof i0 ? (i0) iInterfaceQueryLocalInterface3 : new g0(strongBinder2);
            } catch (Exception e10) {
                throw new i6.j(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            zzbul zzbulVarZza = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza;
            zzbulVarZza.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (i6.j e12) {
            e = e12;
            zzbul zzbulVarZza2 = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza2;
            zzbulVarZza2.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            zzbul zzbulVarZza3 = zzbuj.zza(context);
            qVar.f3394f = zzbulVarZza3;
            zzbulVarZza3.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
