package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfxj implements zzfxg {
    private static final zzfxg zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfxi
        @Override // com.google.android.gms.internal.ads.zzfxg
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfxn zzb = new zzfxn();
    private volatile zzfxg zzc;
    private Object zzd;

    public zzfxj(zzfxg zzfxgVar) {
        this.zzc = zzfxgVar;
    }

    public final String toString() {
        Object objI = this.zzc;
        if (objI == zza) {
            objI = v.i("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return v.i("Suppliers.memoize(", String.valueOf(objI), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final Object zza() {
        zzfxg zzfxgVar = this.zzc;
        zzfxg zzfxgVar2 = zza;
        if (zzfxgVar != zzfxgVar2) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc != zzfxgVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzfxgVar2;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzd;
    }
}
