package com.google.android.gms.internal.ads;

import da.v;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfxh implements Serializable, zzfxg {
    final zzfxg zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfxn zzd = new zzfxn();

    public zzfxh(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
    }

    public final String toString() {
        return v.i("Suppliers.memoize(", (this.zzb ? v.i("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzc;
    }
}
