package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajl implements zzajr {
    private final zzajq zza;
    private final long zzb;
    private final long zzc;
    private final zzajw zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajl(zzajw zzajwVar, long j4, long j10, long j11, long j12, boolean z4) {
        zzdb.zzd(j4 >= 0 && j10 > j4);
        this.zzd = zzajwVar;
        this.zzb = j4;
        this.zzc = j10;
        if (j11 == j10 - j4 || z4) {
            this.zzf = j12;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajq();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzd(zzacs zzacsVar) throws IOException {
        long j4;
        long j10;
        long jMax;
        int i = this.zze;
        if (i == 0) {
            long jZzf = zzacsVar.zzf();
            this.zzg = jZzf;
            this.zze = 1;
            long j11 = this.zzc - 65307;
            if (j11 > jZzf) {
                return j11;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j12 = this.zzi;
                long j13 = this.zzj;
                if (j12 == j13) {
                    jMax = -1;
                    j10 = -1;
                } else {
                    long jZzf2 = zzacsVar.zzf();
                    if (this.zza.zzc(zzacsVar, j13)) {
                        this.zza.zzb(zzacsVar, false);
                        zzacsVar.zzj();
                        long j14 = this.zzh;
                        zzajq zzajqVar = this.zza;
                        j4 = 2;
                        long j15 = zzajqVar.zzb;
                        long j16 = j14 - j15;
                        int i10 = zzajqVar.zzd + zzajqVar.zze;
                        if (j16 < 0 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.zzj = jZzf2;
                                this.zzl = j15;
                            } else {
                                this.zzi = zzacsVar.zzf() + ((long) i10);
                                this.zzk = j15;
                            }
                            long j17 = this.zzj;
                            long j18 = this.zzi;
                            long j19 = j17 - j18;
                            if (j19 < 100000) {
                                this.zzj = j18;
                                j10 = -1;
                                jMax = j18;
                            } else {
                                j10 = -1;
                                jMax = Math.max(j18, Math.min(((j16 * j19) / (this.zzl - this.zzk)) + (zzacsVar.zzf() - (((long) i10) * (j16 <= 0 ? 2L : 1L))), j17 - 1));
                            }
                        } else {
                            jMax = -1;
                            j10 = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j10 = -1;
                    }
                    if (jMax != j10) {
                        return jMax;
                    }
                    this.zze = 3;
                }
                j4 = 2;
                if (jMax != j10) {
                    return jMax;
                }
                this.zze = 3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j10 = -1;
                j4 = 2;
            }
            while (true) {
                this.zza.zzc(zzacsVar, j10);
                this.zza.zzb(zzacsVar, false);
                zzajq zzajqVar2 = this.zza;
                if (zzajqVar2.zzb > this.zzh) {
                    zzacsVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + j4);
                }
                zzacsVar.zzk(zzajqVar2.zzd + zzajqVar2.zze);
                this.zzi = zzacsVar.zzf();
                this.zzk = this.zza.zzb;
                j10 = -1;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzacsVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzacsVar, false);
        zzajq zzajqVar3 = this.zza;
        zzacsVar.zzk(zzajqVar3.zzd + zzajqVar3.zze);
        long j20 = this.zza.zzb;
        while (true) {
            zzajq zzajqVar4 = this.zza;
            if ((zzajqVar4.zza & 4) == 4 || !zzajqVar4.zzc(zzacsVar, -1L) || zzacsVar.zzf() >= this.zzc || !this.zza.zzb(zzacsVar, true)) {
                break;
            }
            zzajq zzajqVar5 = this.zza;
            if (!zzacv.zze(zzacsVar, zzajqVar5.zzd + zzajqVar5.zze)) {
                break;
            }
            j20 = this.zza.zzb;
        }
        this.zzf = j20;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final /* bridge */ /* synthetic */ zzadq zze() {
        zzajk zzajkVar = null;
        if (this.zzf != 0) {
            return new zzajj(this, zzajkVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final void zzg(long j4) {
        this.zzh = Math.max(0L, Math.min(j4, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
