package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.p0;
import e6.q0;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfep implements r6.a {
    final /* synthetic */ q0 zza;
    final /* synthetic */ zzfeq zzb;

    public zzfep(zzfeq zzfeqVar, q0 q0Var) {
        this.zza = q0Var;
        this.zzb = zzfeqVar;
    }

    @Override // r6.a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                p0 p0Var = (p0) this.zza;
                p0Var.zzdc(1, p0Var.zza());
            } catch (RemoteException e) {
                h.i("#007 Could not call remote method.", e);
            }
        }
    }
}
