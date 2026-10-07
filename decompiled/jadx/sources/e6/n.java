package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import app.namso_gen.spacehowen.MainActivity;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3350c;

    public n(q qVar, MainActivity mainActivity) {
        this.f3349b = mainActivity;
        this.f3350c = qVar;
    }

    @Override // e6.r
    public final Object a() {
        q.g(this.f3349b, "mobile_ads_settings");
        return new c3();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.p(new q7.b(this.f3349b), 243799000);
    }

    @Override // e6.r
    public final Object c() {
        l1 l1Var;
        MainActivity mainActivity = this.f3349b;
        zzbcn.zza(mainActivity);
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkp)).booleanValue();
        q qVar = this.f3350c;
        if (!zBooleanValue) {
            y2 y2Var = (y2) qVar.f3392c;
            try {
                q7.b bVar = new q7.b(mainActivity);
                l1 l1Var2 = (l1) y2Var.getRemoteCreatorInstance(mainActivity);
                Parcel parcelZza = l1Var2.zza();
                zzaye.zzf(parcelZza, bVar);
                parcelZza.writeInt(243799000);
                Parcel parcelZzdb = l1Var2.zzdb(1, parcelZza);
                IBinder strongBinder = parcelZzdb.readStrongBinder();
                parcelZzdb.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(strongBinder);
            } catch (RemoteException e) {
                e = e;
                i6.h.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (q7.c e4) {
                e = e4;
                i6.h.h("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            q7.b bVar2 = new q7.b(mainActivity);
            try {
                IBinder iBinderB = qd.b.K(mainActivity).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    l1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    l1Var = iInterfaceQueryLocalInterface2 instanceof l1 ? (l1) iInterfaceQueryLocalInterface2 : new l1(iBinderB);
                }
                Parcel parcelZza2 = l1Var.zza();
                zzaye.zzf(parcelZza2, bVar2);
                parcelZza2.writeInt(243799000);
                Parcel parcelZzdb2 = l1Var.zzdb(1, parcelZza2);
                IBinder strongBinder2 = parcelZzdb2.readStrongBinder();
                parcelZzdb2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof k1 ? (k1) iInterfaceQueryLocalInterface3 : new i1(strongBinder2);
            } catch (Exception e10) {
                throw new i6.j(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            zzbul zzbulVarZza = zzbuj.zza(mainActivity);
            qVar.f3394f = zzbulVarZza;
            zzbulVarZza.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (i6.j e12) {
            e = e12;
            zzbul zzbulVarZza2 = zzbuj.zza(mainActivity);
            qVar.f3394f = zzbulVarZza2;
            zzbulVarZza2.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            zzbul zzbulVarZza3 = zzbuj.zza(mainActivity);
            qVar.f3394f = zzbulVarZza3;
            zzbulVarZza3.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
