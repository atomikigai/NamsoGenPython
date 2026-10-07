package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxo extends zzaxt {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxo(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        super(zzawfVar, "Gni4qgp+h6AcoKfZop5I8lc+tIkw2ZH05xPrrmCfcSRn195BLh5fanbj8t/tK60H", "w5p59RLEy51WEx7/xjLAr1+9bhgJEvrJ/0voomQz2z8=", zzasfVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzV(zzh.longValue());
        }
    }
}
