package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import k6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbqa implements b {
    final /* synthetic */ zzblt zza;

    public zzbqa(zzbqh zzbqhVar, zzblt zzbltVar) {
        this.zza = zzbltVar;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            h.e("", e);
        }
    }
}
