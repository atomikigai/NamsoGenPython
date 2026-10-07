package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzll {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i10);

    public abstract void zzi(Object obj, int i, long j4);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzgw zzgwVar);

    public abstract void zzl(Object obj, int i, long j4);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzmd zzmdVar) throws IOException;

    public abstract void zzq(Object obj, zzmd zzmdVar) throws IOException;

    public final boolean zzr(Object obj, zzkq zzkqVar) throws IOException {
        int iZzd = zzkqVar.zzd();
        int i = iZzd >>> 3;
        int i10 = iZzd & 7;
        if (i10 == 0) {
            zzl(obj, i, zzkqVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zzi(obj, i, zzkqVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zzk(obj, i, zzkqVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzje.zza();
            }
            zzh(obj, i, zzkqVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i11 = i << 3;
        while (zzkqVar.zzc() != Integer.MAX_VALUE && zzr(objZzf, zzkqVar)) {
        }
        if ((4 | i11) != zzkqVar.zzd()) {
            throw zzje.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }

    public abstract boolean zzs(zzkq zzkqVar);
}
