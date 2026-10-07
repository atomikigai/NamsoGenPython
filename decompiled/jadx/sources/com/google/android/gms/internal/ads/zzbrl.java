package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import k6.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbrl implements c {
    final /* synthetic */ zzbqt zza;
    final /* synthetic */ zzbpm zzb;

    public zzbrl(zzbrs zzbrsVar, zzbqt zzbqtVar, zzbpm zzbpmVar) {
        this.zza = zzbqtVar;
        this.zzb = zzbpmVar;
    }

    @Override // k6.c
    public final void onFailure(w5.a aVar) {
        try {
            this.zza.zzf(aVar.a());
        } catch (RemoteException e) {
            h.e("", e);
        }
    }

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        h.g("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e) {
            h.e("", e);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new w5.a(0, str, "undefined", null));
    }
}
