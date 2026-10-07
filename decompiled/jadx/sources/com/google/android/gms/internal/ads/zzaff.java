package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaff implements zzacr {
    private zzacu zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzagz zzg;
    private zzacs zzh;
    private zzafi zzi;
    private zzaiy zzj;
    private final zzed zza = new zzed(6);
    private long zzf = -1;

    private final int zza(zzacs zzacsVar) throws IOException {
        this.zza.zzI(2);
        ((zzacg) zzacsVar).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzD();
        this.zzb.zzO(new zzadp(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        String strZzy;
        zzafh zzafhVarZza;
        zzagz zzagzVar;
        long j4;
        int i = this.zzc;
        long j10 = -1;
        if (i == 0) {
            this.zza.zzI(2);
            zzacsVar.zzi(this.zza.zzN(), 0, 2);
            int iZzq = this.zza.zzq();
            this.zzd = iZzq;
            if (iZzq == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzg();
                }
            } else if ((iZzq < 65488 || iZzq > 65497) && iZzq != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.zza.zzI(2);
            zzacsVar.zzi(this.zza.zzN(), 0, 2);
            this.zze = this.zza.zzq() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzacsVar != this.zzh) {
                    this.zzh = zzacsVar;
                    this.zzi = new zzafi(zzacsVar, this.zzf);
                }
                zzaiy zzaiyVar = this.zzj;
                zzaiyVar.getClass();
                int iZzb = zzaiyVar.zzb(this.zzi, zzadnVar);
                if (iZzb == 1) {
                    zzadnVar.zza += this.zzf;
                }
                return iZzb;
            }
            long jZzf = zzacsVar.zzf();
            long j11 = this.zzf;
            if (jZzf != j11) {
                zzadnVar.zza = j11;
                return 1;
            }
            if (zzacsVar.zzm(this.zza.zzN(), 0, 1, true)) {
                zzacsVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzaiy(zzakg.zza, 8);
                }
                zzafi zzafiVar = new zzafi(zzacsVar, this.zzf);
                this.zzi = zzafiVar;
                if (this.zzj.zzi(zzafiVar)) {
                    zzaiy zzaiyVar2 = this.zzj;
                    long j12 = this.zzf;
                    zzacu zzacuVar = this.zzb;
                    zzacuVar.getClass();
                    zzaiyVar2.zze(new zzafk(j12, zzacuVar));
                    zzagz zzagzVar2 = this.zzg;
                    zzagzVar2.getClass();
                    zzacu zzacuVar2 = this.zzb;
                    zzacuVar2.getClass();
                    zzadx zzadxVarZzw = zzacuVar2.zzw(1024, 4);
                    zzab zzabVar = new zzab();
                    zzabVar.zzC("image/jpeg");
                    zzabVar.zzS(new zzbd(-9223372036854775807L, zzagzVar2));
                    zzadxVarZzw.zzl(zzabVar.zzaf());
                    this.zzc = 5;
                } else {
                    zzg();
                }
            } else {
                zzg();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzed zzedVar = new zzed(this.zze);
            zzacsVar.zzi(zzedVar.zzN(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzedVar.zzy((char) 0)) && (strZzy = zzedVar.zzy((char) 0)) != null) {
                long jZzd = zzacsVar.zzd();
                if (jZzd == -1 || (zzafhVarZza = zzafl.zza(strZzy)) == null || zzafhVarZza.zzb.size() < 2) {
                    zzagzVar = null;
                } else {
                    int size = zzafhVarZza.zzb.size() - 1;
                    long j13 = -1;
                    long j14 = -1;
                    long j15 = -1;
                    long j16 = -1;
                    boolean z4 = false;
                    while (size >= 0) {
                        zzafg zzafgVar = (zzafg) zzafhVarZza.zzb.get(size);
                        boolean zEquals = "video/mp4".equals(zzafgVar.zza) | z4;
                        if (size == 0) {
                            jZzd -= zzafgVar.zzc;
                            j4 = 0;
                        } else {
                            j4 = jZzd - zzafgVar.zzb;
                        }
                        long j17 = j4;
                        long j18 = jZzd;
                        jZzd = j17;
                        if (!zEquals || jZzd == j18) {
                            z4 = zEquals;
                        } else {
                            j16 = j18 - jZzd;
                            j15 = jZzd;
                            z4 = false;
                        }
                        if (size == 0) {
                            j14 = j18;
                        }
                        if (size == 0) {
                            j13 = jZzd;
                        }
                        size--;
                        j10 = j10;
                    }
                    long j19 = j10;
                    if (j15 == j19 || j16 == j19 || j13 == j19 || j14 == j19) {
                        zzagzVar = null;
                    } else {
                        zzagzVar = new zzagz(j13, j14, zzafhVarZza.zza, j15, j16);
                    }
                }
                this.zzg = zzagzVar;
                if (zzagzVar != null) {
                    this.zzf = zzagzVar.zzd;
                }
            }
        } else {
            zzacsVar.zzk(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzb = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        if (j4 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaiy zzaiyVar = this.zzj;
            zzaiyVar.getClass();
            zzaiyVar.zzf(j4, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        if (zza(zzacsVar) != 65496) {
            return false;
        }
        int iZza = zza(zzacsVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            this.zza.zzI(2);
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(this.zza.zzN(), 0, 2, false);
            zzacgVar.zzl(this.zza.zzq() - 2, false);
            iZza = zza(zzacsVar);
            this.zzd = iZza;
        }
        if (iZza == 65505) {
            zzacg zzacgVar2 = (zzacg) zzacsVar;
            zzacgVar2.zzl(2, false);
            this.zza.zzI(6);
            zzacgVar2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
