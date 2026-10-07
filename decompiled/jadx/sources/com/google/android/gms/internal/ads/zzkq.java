package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkq {
    public final zzup zza;
    public final Object zzb;
    public final zzwg[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkr zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlq[] zzi;
    private final zzyj zzj;
    private final zzlf zzk;
    private zzkq zzl;
    private zzwr zzm;
    private zzyk zzn;
    private long zzo;

    public zzkq(zzlq[] zzlqVarArr, long j4, zzyj zzyjVar, zzys zzysVar, zzlf zzlfVar, zzkr zzkrVar, zzyk zzykVar) {
        this.zzi = zzlqVarArr;
        this.zzo = j4;
        this.zzj = zzyjVar;
        this.zzk = zzlfVar;
        zzur zzurVar = zzkrVar.zza;
        this.zzb = zzurVar.zza;
        this.zzf = zzkrVar;
        this.zzm = zzwr.zza;
        this.zzn = zzykVar;
        this.zzc = new zzwg[2];
        this.zzh = new boolean[2];
        long j10 = zzkrVar.zzb;
        long j11 = zzkrVar.zzd;
        zzup zzupVarZzp = zzlfVar.zzp(zzurVar, zzysVar, j10);
        this.zza = j11 != -9223372036854775807L ? new zztv(zzupVarZzp, true, 0L, j11) : zzupVarZzp;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyk zzykVar = this.zzn;
            if (i >= zzykVar.zza) {
                return;
            }
            zzykVar.zzb(i);
            zzyd zzydVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyk zzykVar = this.zzn;
            if (i >= zzykVar.zza) {
                return;
            }
            zzykVar.zzb(i);
            zzyd zzydVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzyk zzykVar, long j4, boolean z4) {
        return zzb(zzykVar, j4, false, new boolean[2]);
    }

    public final long zzb(zzyk zzykVar, long j4, boolean z4, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z10 = true;
            if (i >= zzykVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z4 || !zzykVar.zza(this.zzn, i)) {
                z10 = false;
            }
            zArr2[i] = z10;
            i++;
        }
        int i10 = 0;
        while (true) {
            zzlq[] zzlqVarArr = this.zzi;
            if (i10 >= 2) {
                break;
            }
            zzlqVarArr[i10].zzb();
            i10++;
        }
        zzs();
        this.zzn = zzykVar;
        zzt();
        long jZzf = this.zza.zzf(zzykVar.zzc, this.zzh, this.zzc, zArr, j4);
        int i11 = 0;
        while (true) {
            zzlq[] zzlqVarArr2 = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzlqVarArr2[i11].zzb();
            i11++;
        }
        this.zze = false;
        int i12 = 0;
        while (true) {
            zzwg[] zzwgVarArr = this.zzc;
            if (i12 >= 2) {
                return jZzf;
            }
            if (zzwgVarArr[i12] != null) {
                zzdb.zzf(zzykVar.zzb(i12));
                this.zzi[i12].zzb();
                this.zze = true;
            } else {
                zzdb.zzf(zzykVar.zzc[i12] == null);
            }
            i12++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long jZzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzf.zze : jZzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzkq zzg() {
        return this.zzl;
    }

    public final zzwr zzh() {
        return this.zzm;
    }

    public final zzyk zzi() {
        return this.zzn;
    }

    public final zzyk zzj(float f10, zzbv zzbvVar) throws zzig {
        zzyk zzykVarZzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzbvVar);
        for (int i = 0; i < zzykVarZzo.zza; i++) {
            boolean z4 = true;
            if (zzykVarZzo.zzb(i)) {
                if (zzykVarZzo.zzc[i] == null) {
                    this.zzi[i].zzb();
                    z4 = false;
                }
                zzdb.zzf(z4);
            } else {
                zzdb.zzf(zzykVarZzo.zzc[i] == null);
            }
        }
        for (zzyd zzydVar : zzykVarZzo.zzc) {
        }
        return zzykVarZzo;
    }

    public final void zzk(long j4, float f10, long j10) {
        zzdb.zzf(zzu());
        long j11 = j4 - this.zzo;
        zzkm zzkmVar = new zzkm();
        zzkmVar.zze(j11);
        zzkmVar.zzf(f10);
        zzkmVar.zzd(j10);
        this.zza.zzo(new zzko(zzkmVar, null));
    }

    public final void zzl(float f10, zzbv zzbvVar) throws zzig {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzyk zzykVarZzj = zzj(f10, zzbvVar);
        zzkr zzkrVar = this.zzf;
        long jMax = zzkrVar.zzb;
        long j4 = zzkrVar.zze;
        if (j4 != -9223372036854775807L && jMax >= j4) {
            jMax = Math.max(0L, j4 - 1);
        }
        long jZza = zza(zzykVarZzj, jMax, false);
        long j10 = this.zzo;
        zzkr zzkrVar2 = this.zzf;
        this.zzo = (zzkrVar2.zzb - jZza) + j10;
        this.zzf = zzkrVar2.zzb(jZza);
    }

    public final void zzm(long j4) {
        zzdb.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j4 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzup zzupVar = this.zza;
        try {
            boolean z4 = zzupVar instanceof zztv;
            zzlf zzlfVar = this.zzk;
            if (z4) {
                zzlfVar.zzi(((zztv) zzupVar).zza);
            } else {
                zzlfVar.zzi(zzupVar);
            }
        } catch (RuntimeException e) {
            zzdt.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzkq zzkqVar) {
        if (zzkqVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkqVar;
        zzt();
    }

    public final void zzp(long j4) {
        this.zzo = j4;
    }

    public final void zzq() {
        zzup zzupVar = this.zza;
        if (zzupVar instanceof zztv) {
            long j4 = this.zzf.zzd;
            if (j4 == -9223372036854775807L) {
                j4 = Long.MIN_VALUE;
            }
            ((zztv) zzupVar).zzn(0L, j4);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
