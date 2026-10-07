package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxk extends zzaxt {
    private final boolean zzh;

    public zzaxk(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        super(zzawfVar, "XUlbwsRmHSawbobvdBjnb2xctdVbPfXMEVEnXNMe2hHlLaCP55dgLdHMQ+hYM/7L", "7XeVq1bS2Nfqusn9ZkJuz3JHMvM2X4C8Onql6XjPnDI=", zzasfVar, i, 61);
        this.zzh = zzawfVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        synchronized (this.zzd) {
            this.zzd.zzE(jLongValue);
        }
    }
}
