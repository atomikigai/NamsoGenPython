package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlg {
    private static final zzur zzu = new zzur(new Object(), -1);
    public final zzbv zza;
    public final zzur zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzig zzf;
    public final boolean zzg;
    public final zzwr zzh;
    public final zzyk zzi;
    public final List zzj;
    public final zzur zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbj zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzlg(zzbv zzbvVar, zzur zzurVar, long j4, long j10, int i, zzig zzigVar, boolean z4, zzwr zzwrVar, zzyk zzykVar, List list, zzur zzurVar2, boolean z10, int i10, int i11, zzbj zzbjVar, long j11, long j12, long j13, long j14, boolean z11) {
        this.zza = zzbvVar;
        this.zzb = zzurVar;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = i;
        this.zzf = zzigVar;
        this.zzg = z4;
        this.zzh = zzwrVar;
        this.zzi = zzykVar;
        this.zzj = list;
        this.zzk = zzurVar2;
        this.zzl = z10;
        this.zzm = i10;
        this.zzn = i11;
        this.zzo = zzbjVar;
        this.zzq = j11;
        this.zzr = j12;
        this.zzs = j13;
        this.zzt = j14;
    }

    public static zzlg zzg(zzyk zzykVar) {
        zzbv zzbvVar = zzbv.zza;
        zzur zzurVar = zzu;
        return new zzlg(zzbvVar, zzurVar, -9223372036854775807L, 0L, 1, null, false, zzwr.zza, zzykVar, zzfzo.zzn(), zzurVar, false, 1, 0, zzbj.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzur zzh() {
        return zzu;
    }

    public final zzlg zza(zzur zzurVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzurVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlg zzb(zzur zzurVar, long j4, long j10, long j11, long j12, zzwr zzwrVar, zzyk zzykVar, List list) {
        zzur zzurVar2 = this.zzk;
        boolean z4 = this.zzl;
        int i = this.zzm;
        int i10 = this.zzn;
        zzbj zzbjVar = this.zzo;
        long j13 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzlg(this.zza, zzurVar, j10, j11, this.zze, this.zzf, this.zzg, zzwrVar, zzykVar, list, zzurVar2, z4, i, i10, zzbjVar, j13, j12, j4, jElapsedRealtime, false);
    }

    public final zzlg zzc(boolean z4, int i, int i10) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z4, i, i10, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlg zzd(zzig zzigVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzigVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlg zze(int i) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzlg zzf(zzbv zzbvVar) {
        return new zzlg(zzbvVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
