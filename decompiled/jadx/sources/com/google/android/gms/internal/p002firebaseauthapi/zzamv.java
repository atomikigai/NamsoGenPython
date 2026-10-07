package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzamv {
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

    public abstract void zzk(Object obj, int i, zzajf zzajfVar);

    public abstract void zzl(Object obj, int i, long j4);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzama zzamaVar) throws IOException {
        int iZzd = zzamaVar.zzd();
        int i = iZzd >>> 3;
        int i10 = iZzd & 7;
        if (i10 == 0) {
            zzl(obj, i, zzamaVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zzi(obj, i, zzamaVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zzk(obj, i, zzamaVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzaks.zza();
            }
            zzh(obj, i, zzamaVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i11 = i << 3;
        while (zzamaVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzamaVar)) {
        }
        if ((4 | i11) != zzamaVar.zzd()) {
            throw zzaks.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }

    public abstract boolean zzq(zzama zzamaVar);

    public abstract void zzr(Object obj, zzajt zzajtVar) throws IOException;
}
