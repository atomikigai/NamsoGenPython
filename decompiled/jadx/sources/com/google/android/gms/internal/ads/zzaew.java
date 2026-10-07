package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaew implements zzacr {
    private final byte[] zza;
    private final zzed zzb;
    private final zzacx zzc;
    private zzacu zzd;
    private zzadx zze;
    private int zzf;
    private zzbd zzg;
    private zzadc zzh;
    private int zzi;
    private int zzj;
    private zzaev zzk;
    private int zzl;
    private long zzm;

    public zzaew() {
        throw null;
    }

    private final long zza(zzed zzedVar, boolean z4) {
        boolean zZzc;
        this.zzh.getClass();
        int iZzd = zzedVar.zzd();
        while (iZzd <= zzedVar.zze() - 16) {
            zzedVar.zzL(iZzd);
            if (zzacy.zzc(zzedVar, this.zzh, this.zzj, this.zzc)) {
                zzedVar.zzL(iZzd);
                return this.zzc.zza;
            }
            iZzd++;
        }
        if (!z4) {
            zzedVar.zzL(iZzd);
            return -1L;
        }
        while (iZzd <= zzedVar.zze() - this.zzi) {
            zzedVar.zzL(iZzd);
            try {
                zZzc = zzacy.zzc(zzedVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzedVar.zzd() <= zzedVar.zze() && zZzc) {
                zzedVar.zzL(iZzd);
                return this.zzc.zza;
            }
            iZzd++;
        }
        zzedVar.zzL(zzedVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j4 = this.zzm * 1000000;
        zzadc zzadcVar = this.zzh;
        int i = zzen.zza;
        this.zze.zzs(j4 / ((long) zzadcVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        boolean zZzp;
        zzadq zzadpVar;
        boolean z4;
        int i = this.zzf;
        if (i == 0) {
            zzacsVar.zzj();
            long jZze = zzacsVar.zze();
            zzbd zzbdVarZza = zzacz.zza(zzacsVar, true);
            zzacsVar.zzk((int) (zzacsVar.zze() - jZze));
            this.zzg = zzbdVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzacsVar.zzh(this.zza, 0, 42);
            zzacsVar.zzj();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzed zzedVar = new zzed(4);
            zzacsVar.zzi(zzedVar.zzN(), 0, 4);
            if (zzedVar.zzu() != 1716281667) {
                throw zzbh.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzadc zzadcVarZze = this.zzh;
            do {
                zzacsVar.zzj();
                zzec zzecVar = new zzec(new byte[4], 4);
                zzacsVar.zzh(zzecVar.zza, 0, 4);
                zZzp = zzecVar.zzp();
                int iZzd = zzecVar.zzd(7);
                int iZzd2 = zzecVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzacsVar.zzi(bArr, 0, 38);
                    zzadcVarZze = new zzadc(bArr, 4);
                } else {
                    if (zzadcVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzed zzedVar2 = new zzed(iZzd2);
                        zzacsVar.zzi(zzedVar2.zzN(), 0, iZzd2);
                        zzadcVarZze = zzadcVarZze.zzf(zzacz.zzb(zzedVar2));
                    } else if (iZzd == 4) {
                        zzed zzedVar3 = new zzed(iZzd2);
                        zzacsVar.zzi(zzedVar3.zzN(), 0, iZzd2);
                        zzedVar3.zzM(4);
                        zzadcVarZze = zzadcVarZze.zzg(Arrays.asList(zzaed.zzc(zzedVar3, false, false).zza));
                    } else if (iZzd == 6) {
                        zzed zzedVar4 = new zzed(iZzd2);
                        zzacsVar.zzi(zzedVar4.zzN(), 0, iZzd2);
                        zzedVar4.zzM(4);
                        zzadcVarZze = zzadcVarZze.zze(zzfzo.zzo(zzafr.zzb(zzedVar4)));
                    } else {
                        zzacsVar.zzk(iZzd2);
                    }
                }
                int i10 = zzen.zza;
                this.zzh = zzadcVarZze;
            } while (!zZzp);
            zzadcVarZze.getClass();
            this.zzi = Math.max(zzadcVarZze.zzc, 6);
            this.zze.zzl(this.zzh.zzc(this.zza, this.zzg));
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzacsVar.zzj();
            zzed zzedVar5 = new zzed(2);
            zzacsVar.zzh(zzedVar5.zzN(), 0, 2);
            int iZzq = zzedVar5.zzq();
            if ((iZzq >> 2) != 16382) {
                zzacsVar.zzj();
                throw zzbh.zza("First frame does not start with sync code.", null);
            }
            zzacsVar.zzj();
            this.zzj = iZzq;
            zzacu zzacuVar = this.zzd;
            int i11 = zzen.zza;
            long jZzf = zzacsVar.zzf();
            long jZzd = zzacsVar.zzd();
            zzadc zzadcVar = this.zzh;
            zzadcVar.getClass();
            if (zzadcVar.zzk != null) {
                zzadpVar = new zzada(zzadcVar, jZzf);
            } else if (jZzd == -1 || zzadcVar.zzj <= 0) {
                zzadpVar = new zzadp(zzadcVar.zza(), 0L);
            } else {
                zzaev zzaevVar = new zzaev(zzadcVar, this.zzj, jZzf, jZzd);
                this.zzk = zzaevVar;
                zzadpVar = zzaevVar.zzb();
            }
            zzacuVar.zzO(zzadpVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzadc zzadcVar2 = this.zzh;
        zzadcVar2.getClass();
        zzaev zzaevVar2 = this.zzk;
        if (zzaevVar2 != null && zzaevVar2.zze()) {
            return zzaevVar2.zza(zzacsVar, zzadnVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzacy.zzb(zzacsVar, zzadcVar2);
            return 0;
        }
        zzed zzedVar6 = this.zzb;
        int iZze = zzedVar6.zze();
        if (iZze < 32768) {
            int iZza = zzacsVar.zza(zzedVar6.zzN(), iZze, 32768 - iZze);
            z4 = iZza == -1;
            if (!z4) {
                this.zzb.zzK(iZze + iZza);
            } else if (this.zzb.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z4 = false;
        }
        zzed zzedVar7 = this.zzb;
        int iZzd3 = zzedVar7.zzd();
        int i12 = this.zzl;
        int i13 = this.zzi;
        if (i12 < i13) {
            zzedVar7.zzM(Math.min(i13 - i12, zzedVar7.zzb()));
        }
        long jZza = zza(this.zzb, z4);
        zzed zzedVar8 = this.zzb;
        int iZzd4 = zzedVar8.zzd() - iZzd3;
        zzedVar8.zzL(iZzd3);
        this.zze.zzq(this.zzb, iZzd4);
        this.zzl += iZzd4;
        if (jZza != -1) {
            zzg();
            this.zzl = 0;
            this.zzm = jZza;
        }
        zzed zzedVar9 = this.zzb;
        if (zzedVar9.zzb() >= 16) {
            return 0;
        }
        int iZzb = zzedVar9.zzb();
        System.arraycopy(zzedVar9.zzN(), zzedVar9.zzd(), zzedVar9.zzN(), 0, iZzb);
        this.zzb.zzL(0);
        this.zzb.zzK(iZzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzd = zzacuVar;
        this.zze = zzacuVar.zzw(0, 1);
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        if (j4 == 0) {
            this.zzf = 0;
        } else {
            zzaev zzaevVar = this.zzk;
            if (zzaevVar != null) {
                zzaevVar.zzd(j10);
            }
        }
        this.zzm = j10 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzacz.zza(zzacsVar, false);
        zzed zzedVar = new zzed(4);
        ((zzacg) zzacsVar).zzm(zzedVar.zzN(), 0, 4, false);
        return zzedVar.zzu() == 1716281667;
    }

    public zzaew(int i) {
        this.zza = new byte[42];
        this.zzb = new zzed(new byte[32768], 0);
        this.zzc = new zzacx();
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
