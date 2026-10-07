package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamz implements zzamm {
    private String zze;
    private zzadx zzf;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzn;
    private int zzo;
    private int zzs;
    private boolean zzu;
    private int zzd = 0;
    private final zzed zza = new zzed(new byte[15], 2);
    private final zzec zzb = new zzec();
    private final zzed zzc = new zzed();
    private final zzana zzp = new zzana();
    private int zzq = -2147483647;
    private int zzr = -1;
    private long zzt = -1;
    private boolean zzj = true;
    private boolean zzm = true;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;

    private static final void zzf(zzed zzedVar, zzed zzedVar2, boolean z4) {
        int iZzd = zzedVar.zzd();
        int iMin = Math.min(zzedVar.zzb(), zzedVar2.zzb());
        zzedVar.zzH(zzedVar2.zzN(), zzedVar2.zzd(), iMin);
        zzedVar2.zzM(iMin);
        if (z4) {
            zzedVar.zzL(iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) throws zzbh {
        int i;
        zzdb.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i10 = this.zzd;
            int iZzd = 0;
            if (i10 == 0) {
                int i11 = this.zzk;
                if ((i11 & 2) != 0) {
                    if ((i11 & 4) == 0) {
                        while (zzedVar.zzb() > 0) {
                            int i12 = this.zzl << 8;
                            this.zzl = i12;
                            int iZzm = i12 | zzedVar.zzm();
                            this.zzl = iZzm;
                            if ((iZzm & 16777215) == 12583333) {
                                zzedVar.zzL(zzedVar.zzd() - 3);
                                this.zzl = 0;
                            }
                        }
                    }
                    this.zzd = 1;
                    break;
                }
                zzedVar.zzL(zzedVar.zze());
            } else if (i10 != 1) {
                int i13 = this.zzp.zza;
                if (i13 == 1 || i13 == 17) {
                    zzf(zzedVar, this.zzc, true);
                }
                int iMin = Math.min(zzedVar.zzb(), this.zzp.zzc - this.zzn);
                this.zzf.zzq(zzedVar, iMin);
                int i14 = this.zzn + iMin;
                this.zzn = i14;
                zzana zzanaVar = this.zzp;
                if (i14 == zzanaVar.zzc) {
                    int i15 = zzanaVar.zza;
                    if (i15 == 1) {
                        byte[] bArrZzN = this.zzc.zzN();
                        zzanb zzanbVarZza = zzand.zza(new zzec(bArrZzN, bArrZzN.length));
                        this.zzq = zzanbVarZza.zzb;
                        this.zzr = zzanbVarZza.zzc;
                        long j4 = this.zzt;
                        long j10 = this.zzp.zzb;
                        if (j4 != j10) {
                            this.zzt = j10;
                            int i16 = zzanbVarZza.zza;
                            String strConcat = i16 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i16))) : "mhm1";
                            byte[] bArr = zzanbVarZza.zzd;
                            zzfzo zzfzoVarZzp = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfzoVarZzp = zzfzo.zzp(zzen.zzf, bArr);
                            }
                            zzab zzabVar = new zzab();
                            zzabVar.zzL(this.zze);
                            zzabVar.zzZ("audio/mhm1");
                            zzabVar.zzaa(this.zzq);
                            zzabVar.zzA(strConcat);
                            zzabVar.zzM(zzfzoVarZzp);
                            this.zzf.zzl(zzabVar.zzaf());
                        }
                        this.zzu = true;
                    } else if (i15 == 17) {
                        byte[] bArrZzN2 = this.zzc.zzN();
                        zzec zzecVar = new zzec(bArrZzN2, bArrZzN2.length);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(2);
                            iZzd = zzecVar.zzd(13);
                        }
                        this.zzs = iZzd;
                    } else if (i15 == 2) {
                        if (this.zzu) {
                            this.zzj = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i17 = this.zzr - this.zzs;
                        double d10 = this.zzq;
                        long jRound = Math.round(this.zzg);
                        if (this.zzi) {
                            this.zzi = false;
                            this.zzg = this.zzh;
                        } else {
                            this.zzg += (((double) i17) * 1000000.0d) / d10;
                        }
                        this.zzf.zzs(jRound, i, this.zzo, 0, null);
                        this.zzu = false;
                        this.zzs = 0;
                        this.zzo = 0;
                    }
                    this.zzd = 1;
                }
            } else {
                zzf(zzedVar, this.zza, false);
                zzed zzedVar2 = this.zza;
                if (zzedVar2.zzb() == 0) {
                    zzec zzecVar2 = this.zzb;
                    int iZze = zzedVar2.zze();
                    zzecVar2.zzk(zzedVar2.zzN(), iZze);
                    if (zzand.zzb(this.zzb, this.zzp)) {
                        this.zzn = 0;
                        this.zzo = this.zzp.zzc + iZze + this.zzo;
                        this.zza.zzL(0);
                        zzadx zzadxVar = this.zzf;
                        zzed zzedVar3 = this.zza;
                        zzadxVar.zzq(zzedVar3, zzedVar3.zze());
                        this.zza.zzI(2);
                        this.zzc.zzI(this.zzp.zzc);
                        this.zzm = true;
                        this.zzd = 2;
                    } else {
                        zzed zzedVar4 = this.zza;
                        if (zzedVar4.zze() < 15) {
                            zzedVar4.zzK(zzedVar4.zze() + 1);
                        }
                    }
                }
                this.zzm = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zze = zzaoaVar.zzb();
        this.zzf = zzacuVar.zzw(zzaoaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzk = i;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j4 != -9223372036854775807L) {
            double d10 = j4;
            if (this.zzi) {
                this.zzh = d10;
            } else {
                this.zzg = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzI(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = -2147483647;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1L;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9.223372036854776E18d;
        this.zzh = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
    }
}
