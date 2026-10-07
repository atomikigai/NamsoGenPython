package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzhn extends zzbv {
    private final int zzb;
    private final zzwj zzc;

    public zzhn(boolean z4, zzwj zzwjVar) {
        this.zzc = zzwjVar;
        this.zzb = zzwjVar.zzc();
    }

    private final int zzw(int i, boolean z4) {
        if (z4) {
            return this.zzc.zzd(i);
        }
        if (i >= this.zzb - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z4) {
        if (z4) {
            return this.zzc.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zza(Object obj) {
        int iZza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzp = zzp(obj2);
            if (iZzp != -1 && (iZza = zzu(iZzp).zza(obj3)) != -1) {
                return zzs(iZzp) + iZza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i, zzbt zzbtVar, boolean z4) {
        int iZzq = zzq(i);
        int iZzt = zzt(iZzq);
        zzu(iZzq).zzd(i - zzs(iZzq), zzbtVar, z4);
        zzbtVar.zzc += iZzt;
        if (z4) {
            Object objZzv = zzv(iZzq);
            Object obj = zzbtVar.zzb;
            obj.getClass();
            zzbtVar.zzb = Pair.create(objZzv, obj);
        }
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i, zzbu zzbuVar, long j4) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzs = zzs(iZzr);
        zzu(iZzr).zze(i - iZzt, zzbuVar, j4);
        Object objZzv = zzv(iZzr);
        if (!zzbu.zza.equals(zzbuVar.zzb)) {
            objZzv = Pair.create(objZzv, zzbuVar.zzb);
        }
        zzbuVar.zzb = objZzv;
        zzbuVar.zzn += iZzs;
        zzbuVar.zzo += iZzs;
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i) {
        int iZzq = zzq(i);
        return Pair.create(zzv(iZzq), zzu(iZzq).zzf(i - zzs(iZzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzg(boolean z4) {
        if (this.zzb != 0) {
            int iZza = z4 ? this.zzc.zza() : 0;
            while (zzu(iZza).zzo()) {
                iZza = zzw(iZza, z4);
                if (iZza == -1) {
                }
            }
            return zzu(iZza).zzg(z4) + zzt(iZza);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzh(boolean z4) {
        int i = this.zzb;
        if (i != 0) {
            int iZzb = z4 ? this.zzc.zzb() : i - 1;
            while (zzu(iZzb).zzo()) {
                iZzb = zzx(iZzb, z4);
                if (iZzb == -1) {
                }
            }
            return zzu(iZzb).zzh(z4) + zzt(iZzb);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzj(int i, int i10, boolean z4) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzj = zzu(iZzr).zzj(i - iZzt, i10 == 2 ? 0 : i10, z4);
        if (iZzj != -1) {
            return iZzt + iZzj;
        }
        int iZzw = zzw(iZzr, z4);
        while (iZzw != -1 && zzu(iZzw).zzo()) {
            iZzw = zzw(iZzw, z4);
        }
        if (iZzw != -1) {
            return zzu(iZzw).zzg(z4) + zzt(iZzw);
        }
        if (i10 == 2) {
            return zzg(z4);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzk(int i, int i10, boolean z4) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzk = zzu(iZzr).zzk(i - iZzt, 0, false);
        if (iZzk != -1) {
            return iZzt + iZzk;
        }
        int iZzx = zzx(iZzr, false);
        while (iZzx != -1 && zzu(iZzx).zzo()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx == -1) {
            return -1;
        }
        return zzu(iZzx).zzh(false) + zzt(iZzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzn(Object obj, zzbt zzbtVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        int iZzt = zzt(iZzp);
        zzu(iZzp).zzn(obj3, zzbtVar);
        zzbtVar.zzc += iZzt;
        zzbtVar.zzb = obj;
        return zzbtVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i);

    public abstract int zzr(int i);

    public abstract int zzs(int i);

    public abstract int zzt(int i);

    public abstract zzbv zzu(int i);

    public abstract Object zzv(int i);
}
