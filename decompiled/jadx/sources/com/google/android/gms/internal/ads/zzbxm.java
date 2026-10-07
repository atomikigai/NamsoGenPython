package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import r6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxm implements b {
    private final zzbwz zza;

    public zzbxm(zzbwz zzbwzVar) {
        this.zza = zzbwzVar;
    }

    @Override // r6.b
    public final int getAmount() {
        zzbwz zzbwzVar = this.zza;
        if (zzbwzVar != null) {
            try {
                return zzbwzVar.zze();
            } catch (RemoteException e) {
                h.h("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // r6.b
    public final String getType() {
        zzbwz zzbwzVar = this.zza;
        if (zzbwzVar != null) {
            try {
                return zzbwzVar.zzf();
            } catch (RemoteException e) {
                h.h("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
