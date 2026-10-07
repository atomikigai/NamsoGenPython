package com.google.android.gms.internal.ads;

import android.util.Pair;
import da.v;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaoh implements zzacr {
    private zzacu zza;
    private zzadx zzb;
    private zzaof zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int i;
        zzdb.zzb(this.zzb);
        int i10 = zzen.zza;
        int i11 = this.zzc;
        int iZzn = 4;
        if (i11 == 0) {
            zzdb.zzf(zzacsVar.zzf() == 0);
            int i12 = this.zzf;
            if (i12 != -1) {
                zzacsVar.zzk(i12);
                this.zzc = 4;
                return 0;
            }
            if (!zzaok.zzc(zzacsVar)) {
                throw zzbh.zza("Unsupported or unrecognized wav file type.", null);
            }
            zzacsVar.zzk((int) (zzacsVar.zze() - zzacsVar.zzf()));
            this.zzc = 1;
            return 0;
        }
        long jZzr = -1;
        if (i11 == 1) {
            zzed zzedVar = new zzed(8);
            zzaoj zzaojVarZza = zzaoj.zza(zzacsVar, zzedVar);
            if (zzaojVarZza.zza != 1685272116) {
                zzacsVar.zzj();
            } else {
                zzacsVar.zzg(8);
                zzedVar.zzL(0);
                zzacsVar.zzh(zzedVar.zzN(), 0, 8);
                jZzr = zzedVar.zzr();
                zzacsVar.zzk(((int) zzaojVarZza.zzb) + 8);
            }
            this.zzd = jZzr;
            this.zzc = 2;
            return 0;
        }
        if (i11 == 2) {
            zzaoi zzaoiVarZzb = zzaok.zzb(zzacsVar);
            int i13 = zzaoiVarZzb.zza;
            if (i13 == 17) {
                this.zze = new zzaoe(this.zza, this.zzb, zzaoiVarZzb);
            } else if (i13 == 6) {
                this.zze = new zzaog(this.zza, this.zzb, zzaoiVarZzb, "audio/g711-alaw", -1);
            } else if (i13 == 7) {
                this.zze = new zzaog(this.zza, this.zzb, zzaoiVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i14 = zzaoiVarZzb.zze;
                if (i13 == 1) {
                    iZzn = zzen.zzn(i14);
                    i = iZzn;
                } else {
                    if (i13 != 3) {
                        if (i13 == 65534) {
                            iZzn = zzen.zzn(i14);
                            i = iZzn;
                        }
                    } else if (i14 == 32) {
                        i = iZzn;
                    }
                    i = 0;
                }
                if (i == 0) {
                    throw zzbh.zzc("Unsupported WAV format type: " + i13);
                }
                this.zze = new zzaog(this.zza, this.zzb, zzaoiVarZzb, "audio/raw", i);
            }
            this.zzc = 3;
            return 0;
        }
        if (i11 != 3) {
            zzdb.zzf(this.zzg != -1);
            long jZzf = this.zzg - zzacsVar.zzf();
            zzaof zzaofVar = this.zze;
            zzaofVar.getClass();
            return zzaofVar.zzc(zzacsVar, jZzf) ? -1 : 0;
        }
        Pair pairZza = zzaok.zza(zzacsVar);
        this.zzf = ((Long) pairZza.first).intValue();
        long jLongValue = ((Long) pairZza.second).longValue();
        long j4 = this.zzd;
        if (j4 != -1 && jLongValue == 4294967295L) {
            jLongValue = j4;
        }
        long j10 = ((long) this.zzf) + jLongValue;
        this.zzg = j10;
        long jZzd = zzacsVar.zzd();
        if (jZzd != -1 && j10 > jZzd) {
            StringBuilder sbL = v.l("Data exceeds input length: ", ", ", j10);
            sbL.append(jZzd);
            zzdt.zzf("WavExtractor", sbL.toString());
            this.zzg = jZzd;
            j10 = jZzd;
        }
        zzaof zzaofVar2 = this.zze;
        zzaofVar2.getClass();
        zzaofVar2.zza(this.zzf, j10);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zza = zzacuVar;
        this.zzb = zzacuVar.zzw(0, 1);
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzc = j4 == 0 ? 0 : 4;
        zzaof zzaofVar = this.zze;
        if (zzaofVar != null) {
            zzaofVar.zzb(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return zzaok.zzc(zzacsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
