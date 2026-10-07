package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzang implements zzaob {
    private final zzamm zza;
    private final zzec zzb = new zzec(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzek zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzang(zzamm zzammVar) {
        this.zza = zzammVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzed zzedVar, byte[] bArr, int i) {
        int iMin = Math.min(zzedVar.zzb(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzedVar.zzM(iMin);
        } else {
            zzedVar.zzH(bArr, this.zzd, iMin);
        }
        int i10 = this.zzd + iMin;
        this.zzd = i10;
        return i10 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zza(zzed zzedVar, int i) throws zzbh {
        int i10;
        int i11;
        int i12;
        long jZzb;
        zzdb.zzb(this.zze);
        int i13 = -1;
        int i14 = 2;
        if ((i & 1) != 0) {
            int i15 = this.zzc;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        zzdt.zzf("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    this.zza.zzc(zzedVar.zze() == 0);
                } else {
                    zzdt.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i17 = i;
        while (zzedVar.zzb() > 0) {
            int i18 = this.zzc;
            if (i18 == 0) {
                i10 = i14;
                i11 = i13;
                zzedVar.zzM(zzedVar.zzb());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iZzb = zzedVar.zzb();
                    int i19 = this.zzj;
                    int i20 = i19 == i13 ? 0 : iZzb - i19;
                    if (i20 > 0) {
                        iZzb -= i20;
                        zzedVar.zzK(zzedVar.zzd() + iZzb);
                    }
                    this.zza.zza(zzedVar);
                    int i21 = this.zzj;
                    if (i21 != i13) {
                        int i22 = i21 - iZzb;
                        this.zzj = i22;
                        if (i22 == 0) {
                            this.zza.zzc(false);
                            zze(1);
                        }
                    }
                } else {
                    if (zzf(zzedVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzedVar, null, this.zzi)) {
                        this.zzb.zzl(0);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long jZzd = this.zzb.zzd(3);
                            this.zzb.zzn(1);
                            int iZzd = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(1);
                            long jZzd2 = this.zzb.zzd(15);
                            this.zzb.zzn(1);
                            if (!this.zzh && this.zzg) {
                                this.zzb.zzn(4);
                                long jZzd3 = ((long) this.zzb.zzd(3)) << 30;
                                this.zzb.zzn(1);
                                int iZzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(1);
                                long jZzd4 = this.zzb.zzd(15);
                                this.zzb.zzn(1);
                                this.zze.zzb(jZzd3 | ((long) iZzd2) | jZzd4);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb((jZzd << 30) | ((long) iZzd) | jZzd2);
                        } else {
                            jZzb = -9223372036854775807L;
                        }
                        i17 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i17);
                        zze(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i10 = i14;
                i11 = i13;
            } else if (zzf(zzedVar, this.zzb.zza, 9)) {
                this.zzb.zzl(0);
                int iZzd3 = this.zzb.zzd(24);
                if (iZzd3 != 1) {
                    q1.a.o(iZzd3, "Unexpected start code prefix: ", "PesReader");
                    this.zzj = -1;
                    i11 = -1;
                    i12 = 0;
                    i10 = 2;
                } else {
                    this.zzb.zzn(8);
                    zzec zzecVar = this.zzb;
                    int iZzd4 = zzecVar.zzd(16);
                    zzecVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    i10 = 2;
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int iZzd5 = this.zzb.zzd(8);
                    this.zzi = iZzd5;
                    i11 = -1;
                    if (iZzd4 == 0) {
                        this.zzj = -1;
                    } else {
                        int i23 = (iZzd4 - 3) - iZzd5;
                        this.zzj = i23;
                        if (i23 < 0) {
                            q1.a.o(i23, "Found negative packet payload size: ", "PesReader");
                            this.zzj = -1;
                        }
                    }
                    i12 = 2;
                }
                zze(i12);
            } else {
                i11 = -1;
                i10 = 2;
            }
            i13 = i11;
            i14 = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
        this.zze = zzekVar;
        this.zza.zzb(zzacuVar, zzaoaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z4) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
