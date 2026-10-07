package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import h6.k0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzelk {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdqd zzb;

    public zzelk(zzdqd zzdqdVar) {
        this.zzb = zzdqdVar;
    }

    public final zzbrf zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbrf) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            k0.l("Couldn't create RTB adapter : ", e);
        }
    }
}
