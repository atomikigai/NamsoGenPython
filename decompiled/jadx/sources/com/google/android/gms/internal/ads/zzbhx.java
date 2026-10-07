package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import i6.h;
import q7.b;
import q7.c;
import q7.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbhx extends d {
    public zzbhx() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbgf ? (zzbgf) iInterfaceQueryLocalInterface : new zzbgd(iBinder);
    }

    public final zzbgc zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderZze = ((zzbgf) getRemoteCreatorInstance(context)).zze(new b(context), new b(frameLayout), new b(frameLayout2), 243799000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbgc ? (zzbgc) iInterfaceQueryLocalInterface : new zzbga(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            h.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (c e4) {
            e = e4;
            h.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
