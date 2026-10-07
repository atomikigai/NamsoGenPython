package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzawy implements Callable {
    private final zzawf zza;
    private final zzasf zzb;

    public zzawy(zzawf zzawfVar, zzasf zzasfVar) {
        this.zza = zzawfVar;
        this.zzb = zzasfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzata zzataVarZzc = this.zza.zzc();
        if (zzataVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                try {
                    this.zzb.zzaY(zzataVarZzc.zzaV(), zzgyh.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzgzm | NullPointerException unused) {
            return null;
        }
    }
}
