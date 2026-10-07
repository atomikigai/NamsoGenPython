package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import r6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxt extends zzbwy {
    private final String zza;
    private final int zzb;

    public zzbxt(b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwz
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwz
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbxt(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
