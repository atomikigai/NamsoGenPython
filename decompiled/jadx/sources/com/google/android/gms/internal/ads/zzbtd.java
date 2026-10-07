package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import i6.h;
import q7.b;
import q7.c;
import q7.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbtd extends d {
    public zzbtd() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbtj ? (zzbtj) iInterfaceQueryLocalInterface : new zzbth(iBinder);
    }

    public final zzbtg zza(Activity activity) {
        try {
            IBinder iBinderZze = ((zzbtj) getRemoteCreatorInstance(activity)).zze(new b(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbtg ? (zzbtg) iInterfaceQueryLocalInterface : new zzbte(iBinderZze);
        } catch (RemoteException e) {
            h.h("Could not create remote AdOverlay.", e);
            return null;
        } catch (c e4) {
            h.h("Could not create remote AdOverlay.", e4);
            return null;
        }
    }
}
