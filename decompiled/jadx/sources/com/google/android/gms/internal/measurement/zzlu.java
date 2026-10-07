package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlu extends zzlw {
    public /* synthetic */ zzlu(zzlt zzltVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zza(Object obj, long j4) {
        ((zzli) zznu.zzf(obj, j4)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzb(Object obj, Object obj2, long j4) {
        zzli zzliVarZzd = (zzli) zznu.zzf(obj, j4);
        zzli zzliVar = (zzli) zznu.zzf(obj2, j4);
        int size = zzliVarZzd.size();
        int size2 = zzliVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzliVarZzd.zzc()) {
                zzliVarZzd = zzliVarZzd.zzd(size2 + size);
            }
            zzliVarZzd.addAll(zzliVar);
        }
        if (size > 0) {
            zzliVar = zzliVarZzd;
        }
        zznu.zzs(obj, j4, zzliVar);
    }

    private zzlu() {
        super(null);
    }
}
