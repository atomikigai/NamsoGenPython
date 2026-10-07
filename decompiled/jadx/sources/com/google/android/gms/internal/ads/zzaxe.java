package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxe extends zzaxt {
    private final zzavi zzh;
    private final long zzi;
    private final long zzj;

    public zzaxe(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, zzavi zzaviVar, long j4, long j10) {
        super(zzawfVar, "TEuVeGvhlSIXkgQOkIrP3/M5xn08Noea2HjGio+2r03gBpanfVd2G9lK+KoDXH2T", "AA74eMHsp6+YeXgwW1ug4iNz8R55KIvaQAvJIVOChCk=", zzasfVar, i, 11);
        this.zzh = zzaviVar;
        this.zzi = j4;
        this.zzj = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavi zzaviVar = this.zzh;
        if (zzaviVar != null) {
            zzavg zzavgVar = new zzavg((String) this.zze.invoke(null, zzaviVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            synchronized (this.zzd) {
                try {
                    this.zzd.zzz(zzavgVar.zza.longValue());
                    if (zzavgVar.zzb.longValue() >= 0) {
                        this.zzd.zzQ(zzavgVar.zzb.longValue());
                    }
                    if (zzavgVar.zzc.longValue() >= 0) {
                        this.zzd.zzf(zzavgVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
