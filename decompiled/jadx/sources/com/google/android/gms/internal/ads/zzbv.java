package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbv {
    public static final zzbv zza = new zzbs();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbv)) {
            return false;
        }
        zzbv zzbvVar = (zzbv) obj;
        if (zzbvVar.zzc() == zzc() && zzbvVar.zzb() == zzb()) {
            zzbu zzbuVar = new zzbu();
            zzbt zzbtVar = new zzbt();
            zzbu zzbuVar2 = new zzbu();
            zzbt zzbtVar2 = new zzbt();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzbuVar, 0L).equals(zzbvVar.zze(i, zzbuVar2, 0L))) {
                    return false;
                }
            }
            for (int i10 = 0; i10 < zzb(); i10++) {
                if (!zzd(i10, zzbtVar, true).equals(zzbvVar.zzd(i10, zzbtVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzbvVar.zzg(true) && (iZzh = zzh(true)) == zzbvVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzbvVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzbu zzbuVar = new zzbu();
        zzbt zzbtVar = new zzbt();
        int iZzc = zzc() + 217;
        int i10 = 0;
        while (true) {
            i = iZzc * 31;
            if (i10 >= zzc()) {
                break;
            }
            iZzc = i + zze(i10, zzbuVar, 0L).hashCode();
            i10++;
        }
        int iZzb = zzb() + i;
        for (int i11 = 0; i11 < zzb(); i11++) {
            iZzb = (iZzb * 31) + zzd(i11, zzbtVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbt zzd(int i, zzbt zzbtVar, boolean z4);

    public abstract zzbu zze(int i, zzbu zzbuVar, long j4);

    public abstract Object zzf(int i);

    public int zzg(boolean z4) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z4) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzbt zzbtVar, zzbu zzbuVar, int i10, boolean z4) {
        int i11 = zzd(i, zzbtVar, false).zzc;
        if (zze(i11, zzbuVar, 0L).zzo != i) {
            return i + 1;
        }
        int iZzj = zzj(i11, i10, z4);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzbuVar, 0L).zzn;
    }

    public int zzj(int i, int i10, boolean z4) {
        if (i10 == 0) {
            if (i == zzh(z4)) {
                return -1;
            }
            return i + 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == zzh(z4) ? zzg(z4) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i, int i10, boolean z4) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzbu zzbuVar, zzbt zzbtVar, int i, long j4) {
        Pair pairZzm = zzm(zzbuVar, zzbtVar, i, j4, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(zzbu zzbuVar, zzbt zzbtVar, int i, long j4, long j10) {
        zzdb.zza(i, 0, zzc());
        zze(i, zzbuVar, j10);
        if (j4 == -9223372036854775807L) {
            long j11 = zzbuVar.zzl;
            j4 = 0;
        }
        int i10 = zzbuVar.zzn;
        zzd(i10, zzbtVar, false);
        while (i10 < zzbuVar.zzo) {
            long j12 = zzbtVar.zze;
            if (j4 == 0) {
                break;
            }
            int i11 = i10 + 1;
            long j13 = zzd(i11, zzbtVar, false).zze;
            if (j4 < 0) {
                break;
            }
            i10 = i11;
        }
        zzd(i10, zzbtVar, true);
        long j14 = zzbtVar.zze;
        long j15 = zzbtVar.zzd;
        if (j15 != -9223372036854775807L) {
            j4 = Math.min(j4, j15 - 1);
        }
        long jMax = Math.max(0L, j4);
        Object obj = zzbtVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbt zzn(Object obj, zzbt zzbtVar) {
        return zzd(zza(obj), zzbtVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
