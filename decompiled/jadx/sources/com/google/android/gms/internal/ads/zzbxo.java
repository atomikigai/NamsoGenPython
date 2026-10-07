package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import i6.h;
import i6.i;
import i6.j;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxo {
    public static final zzbxc zza(Context context, String str, zzbpg zzbpgVar) {
        try {
            IBinder iBinderZze = ((zzbxg) b.I(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new i() { // from class: com.google.android.gms.internal.ads.zzbxn
                @Override // i6.i
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbxg ? (zzbxg) iInterfaceQueryLocalInterface : new zzbxg(iBinder);
                }
            })).zze(new q7.b(context), str, zzbpgVar, 243799000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface : new zzbxa(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            h.i("#007 Could not call remote method.", e);
            return null;
        } catch (j e4) {
            e = e4;
            h.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
