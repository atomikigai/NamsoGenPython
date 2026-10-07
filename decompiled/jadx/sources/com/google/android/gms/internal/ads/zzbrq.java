package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import m6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbrq implements b {
    final /* synthetic */ zzbri zza;

    public zzbrq(zzbrs zzbrsVar, zzbri zzbriVar) {
        this.zza = zzbriVar;
    }

    public final void onFailure(w5.a aVar) {
        try {
            this.zza.zzg(aVar.a());
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e) {
            h.e("", e);
        }
    }
}
