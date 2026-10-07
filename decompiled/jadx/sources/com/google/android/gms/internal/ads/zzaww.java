package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaww extends zzaxt {
    private final long zzh;

    public zzaww(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, long j4, int i, int i10) {
        super(zzawfVar, "TJ62ujRRBjJb9/NqrT2Pn0c6KFZY0SF6EjGcQMXtIVccZGktu9G9qu0AxWBd9HPE", "SO84xWj1xZpVST0NHeOw+QMypPAPo6e/MVLMJbQH2M4=", zzasfVar, i, 25);
        this.zzh = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        synchronized (this.zzd) {
            try {
                this.zzd.zzt(jLongValue);
                long j4 = this.zzh;
                if (j4 != 0) {
                    this.zzd.zzT(jLongValue - j4);
                    this.zzd.zzU(this.zzh);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
