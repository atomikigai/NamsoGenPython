package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import i6.h;
import java.util.HashMap;
import q7.b;
import q7.c;
import q7.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbhy extends d {
    public zzbhy() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbgl ? (zzbgl) iInterfaceQueryLocalInterface : new zzbgj(iBinder);
    }

    public final zzbgi zza(View view, HashMap map, HashMap map2) {
        try {
            IBinder iBinderZze = ((zzbgl) getRemoteCreatorInstance(view.getContext())).zze(new b(view), new b(map), new b(map2));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbgi ? (zzbgi) iInterfaceQueryLocalInterface : new zzbgg(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            h.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (c e4) {
            e = e4;
            h.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
