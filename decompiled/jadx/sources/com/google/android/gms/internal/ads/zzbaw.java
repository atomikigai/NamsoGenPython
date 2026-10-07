package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import d6.c;
import e6.t;
import g7.d;
import w5.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbaw extends c {
    public zzbaw(Context context, Looper looper, b bVar, com.google.android.gms.common.internal.c cVar) {
        super(zzbwh.zza(context), looper, bVar, cVar, 123);
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zzbaz ? (zzbaz) iInterfaceQueryLocalInterface : new zzbaz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final d[] getApiFeatures() {
        return z.f9679b;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue() && n7.c.e(getAvailableFeatures(), z.f9678a);
    }

    public final zzbaz zzq() throws DeadObjectException {
        return (zzbaz) getService();
    }
}
