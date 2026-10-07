package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import i6.h;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbgt {
    private final zzbgs zza;

    public zzbgt(zzbgs zzbgsVar) {
        Context context;
        this.zza = zzbgsVar;
        try {
            context = (Context) b.I(zzbgsVar.zzh());
        } catch (RemoteException | NullPointerException e) {
            h.e("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(new b(new z5.b(context)));
            } catch (RemoteException e4) {
                h.e("", e4);
            }
        }
    }

    public final zzbgs zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }
}
