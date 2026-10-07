package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.w1;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfei implements r6.a {
    final /* synthetic */ w1 zza;
    final /* synthetic */ zzfek zzb;

    public zzfei(zzfek zzfekVar, w1 w1Var) {
        this.zza = w1Var;
        this.zzb = zzfekVar;
    }

    @Override // r6.a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
    }
}
