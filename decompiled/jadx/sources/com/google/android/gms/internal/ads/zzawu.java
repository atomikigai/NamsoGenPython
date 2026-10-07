package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzawu extends zzaxt {
    public zzawu(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        super(zzawfVar, "GvR+eAwGnG9v3CGqMDhazUVumHdJLt60TSBx5Df5j9bg+ZMppmesgixP833S80RN", "cPmD560wQtvtgfdpMZNJUfXZwJNhRKcjeHNf5LBrqDo=", zzasfVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzm(-1L);
        this.zzd.zzl(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (this.zzd) {
            try {
                this.zzd.zzm(iArr[0]);
                this.zzd.zzl(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    this.zzd.zzk(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
