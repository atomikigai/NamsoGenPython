package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import i6.h;
import n6.j;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsn implements j {
    private final zzbgs zza;

    public zzbsn(zzbgs zzbgsVar) {
        this.zza = zzbgsVar;
        try {
            zzbgsVar.zzm();
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(new b(view));
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            h.e("", e);
            return false;
        }
    }
}
