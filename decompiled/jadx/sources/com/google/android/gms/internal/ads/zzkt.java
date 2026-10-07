package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkt {
    private final zzlw zzc;
    private final zzdm zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzkq zzh;
    private zzkq zzi;
    private zzkq zzj;
    private int zzk;
    private Object zzl;
    private long zzm;
    private zziq zzn;
    private final zzjz zzp;
    private final zzbt zza = new zzbt();
    private final zzbu zzb = new zzbu();
    private List zzo = new ArrayList();

    public zzkt(zzlw zzlwVar, zzdm zzdmVar, zzjz zzjzVar, zziq zziqVar) {
        this.zzc = zzlwVar;
        this.zzd = zzdmVar;
        this.zzp = zzjzVar;
        this.zzn = zziqVar;
    }

    private final zzkr zzA(zzbv zzbvVar, Object obj, long j4, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long jMax = j4;
        zzbvVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc != -1) {
            this.zza.zzj(iZzc);
        }
        if (iZzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(iZzc);
        }
        zzur zzurVar = new zzur(obj, j11, iZzc);
        boolean zZzG = zzG(zzurVar);
        boolean zZzE = zzE(zzbvVar, zzurVar);
        boolean zZzD = zzD(zzbvVar, zzurVar, zZzG);
        if (iZzc != -1) {
            this.zza.zzk(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzg(iZzc);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        if (j12 != -9223372036854775807L) {
            j13 = 0;
            j14 = 0;
        } else {
            j13 = j12;
            j14 = this.zza.zzd;
        }
        if (j14 != -9223372036854775807L && jMax >= j14) {
            jMax = Math.max(0L, j14 - 1);
        }
        return new zzkr(zzurVar, jMax, j10, j13, j14, false, zZzG, zZzE, zZzD);
    }

    private static zzur zzB(zzbv zzbvVar, Object obj, long j4, long j10, zzbu zzbuVar, zzbt zzbtVar) {
        zzbvVar.zzn(obj, zzbtVar);
        zzbvVar.zze(zzbtVar.zzc, zzbuVar, 0L);
        zzbvVar.zza(obj);
        zzbtVar.zzb();
        zzbvVar.zzn(obj, zzbtVar);
        int iZzd = zzbtVar.zzd(j4);
        return iZzd == -1 ? new zzur(obj, j10, zzbtVar.zzc(j4)) : new zzur(obj, iZzd, zzbtVar.zze(iZzd), j10);
    }

    private final void zzC() {
        final zzfzl zzfzlVar = new zzfzl();
        for (zzkq zzkqVarZzg = this.zzh; zzkqVarZzg != null; zzkqVarZzg = zzkqVarZzg.zzg()) {
            zzfzlVar.zzf(zzkqVarZzg.zzf.zza);
        }
        zzkq zzkqVar = this.zzi;
        final zzur zzurVar = zzkqVar == null ? null : zzkqVar.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(zzfzlVar, zzurVar);
            }
        });
    }

    private final boolean zzD(zzbv zzbvVar, zzur zzurVar, boolean z4) {
        int iZza = zzbvVar.zza(zzurVar.zza);
        return !zzbvVar.zze(zzbvVar.zzd(iZza, this.zza, false).zzc, this.zzb, 0L).zzi && zzbvVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z4;
    }

    private final boolean zzE(zzbv zzbvVar, zzur zzurVar) {
        if (zzG(zzurVar)) {
            return zzbvVar.zze(zzbvVar.zzn(zzurVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzbvVar.zza(zzurVar.zza);
        }
        return false;
    }

    private final boolean zzF(zzbv zzbvVar) {
        zzbv zzbvVar2;
        zzkq zzkqVarZzg = this.zzh;
        if (zzkqVarZzg == null) {
            return true;
        }
        int iZza = zzbvVar.zza(zzkqVarZzg.zzb);
        while (true) {
            zzbvVar2 = zzbvVar;
            iZza = zzbvVar2.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkqVarZzg.getClass();
                if (zzkqVarZzg.zzg() == null || zzkqVarZzg.zzf.zzg) {
                    break;
                }
                zzkqVarZzg = zzkqVarZzg.zzg();
            }
            zzkq zzkqVarZzg2 = zzkqVarZzg.zzg();
            if (iZza == -1 || zzkqVarZzg2 == null || zzbvVar2.zza(zzkqVarZzg2.zzb) != iZza) {
                break;
            }
            zzkqVarZzg = zzkqVarZzg2;
            zzbvVar = zzbvVar2;
        }
        boolean zZzq = zzq(zzkqVarZzg);
        zzkqVarZzg.zzf = zzh(zzbvVar2, zzkqVarZzg.zzf);
        return !zZzq;
    }

    private static final boolean zzG(zzur zzurVar) {
        return !zzurVar.zzb() && zzurVar.zze == -1;
    }

    public static boolean zzo(long j4, long j10) {
        return j4 == -9223372036854775807L || j4 == j10;
    }

    private final long zzv(zzbv zzbvVar, Object obj, int i) {
        zzbvVar.zzn(obj, this.zza);
        this.zza.zzg(i);
        long j4 = this.zza.zzg.zza(i).zzg;
        return 0L;
    }

    private final long zzw(Object obj) {
        for (int i = 0; i < this.zzo.size(); i++) {
            zzkq zzkqVar = (zzkq) this.zzo.get(i);
            if (zzkqVar.zzb.equals(obj)) {
                return zzkqVar.zzf.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzkr zzx(zzbv zzbvVar, zzkq zzkqVar, long j4) {
        zzbv zzbvVar2;
        Object obj;
        long j10;
        zzkr zzkrVar = zzkqVar.zzf;
        long jZze = (zzkqVar.zze() + zzkrVar.zze) - j4;
        if (!zzkrVar.zzg) {
            zzur zzurVar = zzkrVar.zza;
            zzbvVar.zzn(zzurVar.zza, this.zza);
            if (!zzurVar.zzb()) {
                int i = zzurVar.zze;
                if (i != -1) {
                    this.zza.zzj(i);
                }
                zzbt zzbtVar = this.zza;
                int i10 = zzurVar.zze;
                int iZze = zzbtVar.zze(i10);
                zzbtVar.zzk(i10);
                if (iZze != this.zza.zza(zzurVar.zze)) {
                    return zzz(zzbvVar, zzurVar.zza, zzurVar.zze, iZze, zzkrVar.zze, zzurVar.zzd);
                }
                zzv(zzbvVar, zzurVar.zza, zzurVar.zze);
                return zzA(zzbvVar, zzurVar.zza, 0L, zzkrVar.zze, zzurVar.zzd);
            }
            int i11 = zzurVar.zzb;
            if (this.zza.zza(i11) == -1) {
                return null;
            }
            int iZza = this.zza.zzg.zza(i11).zza(zzurVar.zzc);
            if (iZza < 0) {
                return zzz(zzbvVar, zzurVar.zza, i11, iZza, zzkrVar.zzc, zzurVar.zzd);
            }
            long jLongValue = zzkrVar.zzc;
            if (jLongValue == -9223372036854775807L) {
                zzbu zzbuVar = this.zzb;
                zzbt zzbtVar2 = this.zza;
                Pair pairZzm = zzbvVar.zzm(zzbuVar, zzbtVar2, zzbtVar2.zzc, -9223372036854775807L, Math.max(0L, jZze));
                zzbvVar2 = zzbvVar;
                if (pairZzm == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzm.second).longValue();
            } else {
                zzbvVar2 = zzbvVar;
            }
            zzv(zzbvVar2, zzurVar.zza, zzurVar.zzb);
            return zzA(zzbvVar, zzurVar.zza, Math.max(0L, jLongValue), zzkrVar.zzc, zzurVar.zzd);
        }
        long j11 = 0;
        int iZzi = zzbvVar.zzi(zzbvVar.zza(zzkrVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
        if (iZzi == -1) {
            return null;
        }
        int i12 = zzbvVar.zzd(iZzi, this.zza, true).zzc;
        Object obj2 = this.zza.zzb;
        obj2.getClass();
        long j12 = zzkrVar.zza.zzd;
        if (zzbvVar.zze(i12, this.zzb, 0L).zzn == iZzi) {
            Pair pairZzm2 = zzbvVar.zzm(this.zzb, this.zza, i12, -9223372036854775807L, Math.max(0L, jZze));
            if (pairZzm2 == null) {
                return null;
            }
            Object obj3 = pairZzm2.first;
            long jLongValue2 = ((Long) pairZzm2.second).longValue();
            zzkq zzkqVarZzg = zzkqVar.zzg();
            if (zzkqVarZzg == null || !zzkqVarZzg.zzb.equals(obj3)) {
                long jZzw = zzw(obj3);
                if (jZzw == -1) {
                    jZzw = this.zze;
                    this.zze = 1 + jZzw;
                }
                j12 = jZzw;
            } else {
                j12 = zzkqVarZzg.zzf.zza.zzd;
            }
            obj = obj3;
            j10 = jLongValue2;
            j11 = -9223372036854775807L;
        } else {
            obj = obj2;
            j10 = 0;
        }
        zzur zzurVarZzB = zzB(zzbvVar, obj, j10, j12, this.zzb, this.zza);
        if (j11 != -9223372036854775807L && zzkrVar.zzc != -9223372036854775807L) {
            zzbvVar.zzn(zzkrVar.zza.zza, this.zza).zzb();
            int i13 = this.zza.zzg.zzd;
        }
        return zzy(zzbvVar, zzurVarZzB, j11, j10);
    }

    private final zzkr zzy(zzbv zzbvVar, zzur zzurVar, long j4, long j10) {
        zzbvVar.zzn(zzurVar.zza, this.zza);
        return zzurVar.zzb() ? zzz(zzbvVar, zzurVar.zza, zzurVar.zzb, zzurVar.zzc, j4, zzurVar.zzd) : zzA(zzbvVar, zzurVar.zza, j10, j4, zzurVar.zzd);
    }

    private final zzkr zzz(zzbv zzbvVar, Object obj, int i, int i10, long j4, long j10) {
        zzur zzurVar = new zzur(obj, i, i10, j10);
        Object obj2 = zzurVar.zza;
        long jZzf = zzbvVar.zzn(obj2, this.zza).zzf(zzurVar.zzb, zzurVar.zzc);
        if (i10 == this.zza.zze(i)) {
            this.zza.zzh();
        }
        this.zza.zzk(zzurVar.zzb);
        long jMax = 0;
        if (jZzf != -9223372036854775807L && jZzf <= 0) {
            jMax = Math.max(0L, (-1) + jZzf);
        }
        return new zzkr(zzurVar, jMax, j4, -9223372036854775807L, jZzf, false, false, false, false);
    }

    public final zzkq zza() {
        zzkq zzkqVar = this.zzh;
        if (zzkqVar == null) {
            return null;
        }
        if (zzkqVar == this.zzi) {
            this.zzi = zzkqVar.zzg();
        }
        zzkqVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzkq zzkqVar2 = this.zzh;
            this.zzl = zzkqVar2.zzb;
            this.zzm = zzkqVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzC();
        return this.zzh;
    }

    public final zzkq zzb() {
        zzkq zzkqVar = this.zzi;
        zzdb.zzb(zzkqVar);
        this.zzi = zzkqVar.zzg();
        zzC();
        zzkq zzkqVar2 = this.zzi;
        zzdb.zzb(zzkqVar2);
        return zzkqVar2;
    }

    public final zzkq zzc(zzkr zzkrVar) {
        zzkq zzkqVarZzd;
        zzkq zzkqVar = this.zzj;
        long jZze = zzkqVar == null ? 1000000000000L : (zzkqVar.zze() + zzkqVar.zzf.zze) - zzkrVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzo.size()) {
                zzkqVarZzd = null;
                break;
            }
            zzkr zzkrVar2 = ((zzkq) this.zzo.get(i)).zzf;
            if (zzo(zzkrVar2.zze, zzkrVar.zze) && zzkrVar2.zzb == zzkrVar.zzb && zzkrVar2.zza.equals(zzkrVar.zza)) {
                zzkqVarZzd = (zzkq) this.zzo.remove(i);
                break;
            }
            i++;
        }
        if (zzkqVarZzd == null) {
            zzkqVarZzd = zzkh.zzd(this.zzp.zza, zzkrVar, jZze);
        } else {
            zzkqVarZzd.zzf = zzkrVar;
            zzkqVarZzd.zzp(jZze);
        }
        zzkq zzkqVar2 = this.zzj;
        if (zzkqVar2 != null) {
            zzkqVar2.zzo(zzkqVarZzd);
        } else {
            this.zzh = zzkqVarZzd;
            this.zzi = zzkqVarZzd;
        }
        this.zzl = null;
        this.zzj = zzkqVarZzd;
        this.zzk++;
        zzC();
        return zzkqVarZzd;
    }

    public final zzkq zzd() {
        return this.zzj;
    }

    public final zzkq zze() {
        return this.zzh;
    }

    public final zzkq zzf() {
        return this.zzi;
    }

    public final zzkr zzg(long j4, zzlg zzlgVar) {
        zzkq zzkqVar = this.zzj;
        return zzkqVar == null ? zzy(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzs) : zzx(zzlgVar.zza, zzkqVar, j4);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    public final zzkr zzh(zzbv zzbvVar, zzkr zzkrVar) {
        long j4;
        long jZzf;
        long j10;
        long j11;
        int i;
        int i10;
        zzur zzurVar = zzkrVar.zza;
        boolean zZzG = zzG(zzurVar);
        boolean zZzE = zzE(zzbvVar, zzurVar);
        boolean zZzD = zzD(zzbvVar, zzurVar, zZzG);
        zzbvVar.zzn(zzkrVar.zza.zza, this.zza);
        if (zzurVar.zzb() || (i10 = zzurVar.zze) == -1) {
            j4 = -9223372036854775807L;
        } else {
            this.zza.zzg(i10);
            j4 = 0;
        }
        if (!zzurVar.zzb()) {
            if (j4 != -9223372036854775807L) {
                j10 = 0;
                j11 = 0;
            } else {
                jZzf = this.zza.zzd;
            }
            if (zzurVar.zzb()) {
                this.zza.zzk(zzurVar.zzb);
            } else {
                i = zzurVar.zze;
                if (i != -1) {
                    this.zza.zzk(i);
                }
            }
            return new zzkr(zzurVar, zzkrVar.zzb, zzkrVar.zzc, j10, j11, false, zZzG, zZzE, zZzD);
        }
        jZzf = this.zza.zzf(zzurVar.zzb, zzurVar.zzc);
        j10 = j4;
        j11 = jZzf;
        if (zzurVar.zzb()) {
            this.zza.zzk(zzurVar.zzb);
        } else {
            i = zzurVar.zze;
            if (i != -1) {
                this.zza.zzk(i);
            }
        }
        return new zzkr(zzurVar, zzkrVar.zzb, zzkrVar.zzc, j10, j11, false, zZzG, zZzE, zZzD);
    }

    public final zzur zzi(zzbv zzbvVar, Object obj, long j4) {
        long jZzw;
        int iZza;
        int i = zzbvVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 == null || (iZza = zzbvVar.zza(obj2)) == -1 || zzbvVar.zzd(iZza, this.zza, false).zzc != i) {
            zzkq zzkqVarZzg = this.zzh;
            while (true) {
                if (zzkqVarZzg == null) {
                    zzkq zzkqVarZzg2 = this.zzh;
                    while (true) {
                        if (zzkqVarZzg2 != null) {
                            int iZza2 = zzbvVar.zza(zzkqVarZzg2.zzb);
                            if (iZza2 != -1 && zzbvVar.zzd(iZza2, this.zza, false).zzc == i) {
                                jZzw = zzkqVarZzg2.zzf.zza.zzd;
                                break;
                            }
                            zzkqVarZzg2 = zzkqVarZzg2.zzg();
                        } else {
                            jZzw = zzw(obj);
                            if (jZzw != -1) {
                                break;
                            }
                            jZzw = this.zze;
                            this.zze = 1 + jZzw;
                            if (this.zzh != null) {
                                break;
                            }
                            this.zzl = obj;
                            this.zzm = jZzw;
                            break;
                        }
                    }
                } else {
                    if (zzkqVarZzg.zzb.equals(obj)) {
                        jZzw = zzkqVarZzg.zzf.zza.zzd;
                        break;
                    }
                    zzkqVarZzg = zzkqVarZzg.zzg();
                }
            }
        } else {
            jZzw = this.zzm;
        }
        zzbvVar.zzn(obj, this.zza);
        zzbvVar.zze(this.zza.zzc, this.zzb, 0L);
        int iZza3 = zzbvVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzbu zzbuVar = this.zzb;
            if (iZza3 < zzbuVar.zzn) {
                return zzB(zzbvVar, obj3, j4, jZzw, zzbuVar, this.zza);
            }
            zzbvVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            zzbt zzbtVar = this.zza;
            if (zzbtVar.zzd(zzbtVar.zzd) != -1) {
                obj3 = this.zza.zzb;
                obj3.getClass();
            }
            iZza3--;
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzkq zzkqVarZzg = this.zzh;
        zzdb.zzb(zzkqVarZzg);
        this.zzl = zzkqVarZzg.zzb;
        this.zzm = zzkqVarZzg.zzf.zza.zzd;
        while (zzkqVarZzg != null) {
            zzkqVarZzg.zzn();
            zzkqVarZzg = zzkqVarZzg.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzC();
    }

    public final /* synthetic */ void zzk(zzfzl zzfzlVar, zzur zzurVar) {
        this.zzc.zzT(zzfzlVar.zzi(), zzurVar);
    }

    public final void zzl(long j4) {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar != null) {
            zzkqVar.zzm(j4);
        }
    }

    public final void zzm() {
        if (this.zzo.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzo.size(); i++) {
            ((zzkq) this.zzo.get(i)).zzn();
        }
        this.zzo = arrayList;
    }

    public final void zzn(zzbv zzbvVar, zziq zziqVar) {
        this.zzn = zziqVar;
        long j4 = zziqVar.zzb;
        zzm();
    }

    public final boolean zzp(zzup zzupVar) {
        zzkq zzkqVar = this.zzj;
        return zzkqVar != null && zzkqVar.zza == zzupVar;
    }

    public final boolean zzq(zzkq zzkqVar) {
        zzdb.zzb(zzkqVar);
        boolean z4 = false;
        if (zzkqVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkqVar;
        while (zzkqVar.zzg() != null) {
            zzkqVar = zzkqVar.zzg();
            zzkqVar.getClass();
            if (zzkqVar == this.zzi) {
                this.zzi = this.zzh;
                z4 = true;
            }
            zzkqVar.zzn();
            this.zzk--;
        }
        zzkq zzkqVar2 = this.zzj;
        zzkqVar2.getClass();
        zzkqVar2.zzo(null);
        zzC();
        return z4;
    }

    public final boolean zzr() {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar != null) {
            return !zzkqVar.zzf.zzi && zzkqVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    public final boolean zzs(zzbv zzbvVar, long j4, long j10) {
        zzkr zzkrVarZzh;
        boolean z4;
        zzkq zzkqVar = null;
        for (zzkq zzkqVarZzg = this.zzh; zzkqVarZzg != null; zzkqVarZzg = zzkqVarZzg.zzg()) {
            zzkr zzkrVar = zzkqVarZzg.zzf;
            if (zzkqVar == null) {
                zzkrVarZzh = zzh(zzbvVar, zzkrVar);
            } else {
                zzkr zzkrVarZzx = zzx(zzbvVar, zzkqVar, j4);
                if (zzkrVarZzx == null) {
                    return !zzq(zzkqVar);
                }
                if (zzkrVar.zzb != zzkrVarZzx.zzb || !zzkrVar.zza.equals(zzkrVarZzx.zza)) {
                    return !zzq(zzkqVar);
                }
                zzkrVarZzh = zzkrVarZzx;
            }
            zzkqVarZzg.zzf = zzkrVarZzh.zza(zzkrVar.zzc);
            if (!zzo(zzkrVar.zze, zzkrVarZzh.zze)) {
                zzkqVarZzg.zzq();
                long j11 = zzkrVarZzh.zze;
                long jZze = j11 == -9223372036854775807L ? Long.MAX_VALUE : j11 + zzkqVarZzg.zze();
                if (zzkqVarZzg == this.zzi) {
                    boolean z10 = zzkqVarZzg.zzf.zzf;
                    if (j10 == Long.MIN_VALUE || j10 >= jZze) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                return (zzq(zzkqVarZzg) || z4) ? false : true;
            }
            zzkqVar = zzkqVarZzg;
        }
        return true;
    }

    public final boolean zzt(zzbv zzbvVar, int i) {
        this.zzf = i;
        return zzF(zzbvVar);
    }

    public final boolean zzu(zzbv zzbvVar, boolean z4) {
        this.zzg = z4;
        return zzF(zzbvVar);
    }
}
