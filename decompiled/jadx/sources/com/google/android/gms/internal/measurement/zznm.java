package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zznm extends zznk {
    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ int zza(Object obj) {
        return ((zznl) obj).zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ int zzb(Object obj) {
        return ((zznl) obj).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zznlVarZzf = zznl.zzf();
        zzlbVar.zzc = zznlVarZzf;
        return zznlVarZzf;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzlb) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zznl.zzc().equals(obj2)) {
            if (zznl.zzc().equals(obj)) {
                return zznl.zze((zznl) obj, (zznl) obj2);
            }
            ((zznl) obj).zzd((zznl) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, long j4) {
        ((zznl) obj).zzj(i << 3, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final void zzg(Object obj) {
        ((zzlb) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzlb) obj).zzc = (zznl) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ void zzi(Object obj, zzoc zzocVar) throws IOException {
        ((zznl) obj).zzk(zzocVar);
    }
}
