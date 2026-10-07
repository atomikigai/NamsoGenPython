package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzhbn {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i10);

    public abstract void zze(Object obj, int i, long j4);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzgxp zzgxpVar);

    public abstract void zzh(Object obj, int i, long j4);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzhav zzhavVar, int i) throws IOException {
        int iZzd = zzhavVar.zzd();
        int i10 = iZzd >>> 3;
        int i11 = iZzd & 7;
        if (i11 == 0) {
            zzh(obj, i10, zzhavVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zze(obj, i10, zzhavVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzg(obj, i10, zzhavVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i10, zzhavVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i12 = i10 << 3;
        int i13 = i + 1;
        if (i13 >= zza) {
            throw new zzgzm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhavVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzhavVar, i13)) {
        }
        if ((i12 | 4) != zzhavVar.zzd()) {
            throw new zzgzm("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i10, zzc(objZzb));
        return true;
    }
}
