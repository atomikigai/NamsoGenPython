package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import q7.b;
import r7.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfrr {
    final zzfru zza;
    final boolean zzb;

    private zzfrr(zzfru zzfruVar) {
        this.zza = zzfruVar;
        this.zzb = zzfruVar != null;
    }

    public static zzfrr zzb(Context context, String str, String str2) {
        zzfru zzfrsVar;
        try {
            try {
                try {
                    IBinder iBinderB = f.c(context, f.f8199b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        zzfrsVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfrsVar = iInterfaceQueryLocalInterface instanceof zzfru ? (zzfru) iInterfaceQueryLocalInterface : new zzfrs(iBinderB);
                    }
                    zzfrsVar.zze(new b(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfrr(zzfrsVar);
                } catch (Exception e) {
                    throw new zzfqt(e);
                }
            } catch (Exception e4) {
                throw new zzfqt(e4);
            }
        } catch (RemoteException | zzfqt | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfrr(new zzfrv());
        }
    }

    public static zzfrr zzc() {
        zzfrv zzfrvVar = new zzfrv();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfrr(zzfrvVar);
    }

    public final zzfrp zza(byte[] bArr) {
        return new zzfrp(this, bArr, null);
    }
}
