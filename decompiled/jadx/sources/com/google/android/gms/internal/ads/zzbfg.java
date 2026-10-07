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
public final class zzbfg {
    private final Context zza;

    public zzbfg(Context context) {
        this.zza = context;
    }

    public final void zza(zzbuq zzbuqVar) {
        try {
            ((zzbfh) b.I(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new i() { // from class: com.google.android.gms.internal.ads.zzbff
                @Override // i6.i
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof zzbfh ? (zzbfh) iInterfaceQueryLocalInterface : new zzbfh(iBinder);
                }
            })).zze(zzbuqVar);
        } catch (RemoteException e) {
            h.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (j e4) {
            h.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e4.getMessage())));
        }
    }
}
