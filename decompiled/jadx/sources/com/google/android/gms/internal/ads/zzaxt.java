package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaxt implements Callable {
    protected final zzawf zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasf zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxt(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        this.zza = zzawfVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzasfVar;
        this.zzf = i;
        this.zzg = i10;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            zza();
            zzauw zzauwVarZzd = this.zza.zzd();
            if (zzauwVarZzd == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzauwVarZzd.zzc(this.zzg, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
