package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzami implements zzamm {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzec zzc = new zzec(new byte[7], 7);
    private final zzed zzd = new zzed(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzadx zzh;
    private zzadx zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzadx zzv;
    private long zzw;

    public zzami(boolean z4, String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z4;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzadx zzadxVar, long j4, int i, int i10) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzadxVar;
        this.zzw = j4;
        this.zzt = i10;
    }

    private final boolean zzk(zzed zzedVar, byte[] bArr, int i) {
        int iMin = Math.min(zzedVar.zzb(), i - this.zzk);
        zzedVar.zzH(bArr, this.zzk, iMin);
        int i10 = this.zzk + iMin;
        this.zzk = i10;
        return i10 == i;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzed zzedVar, byte[] bArr, int i) {
        if (zzedVar.zzb() < i) {
            return false;
        }
        zzedVar.zzH(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0286  */
    /* JADX WARN: Code duplicated, block: B:109:0x028a  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0292  */
    /* JADX WARN: Code duplicated, block: B:144:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x0212  */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:77:0x022d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0231  */
    /* JADX WARN: Code duplicated, block: B:81:0x0235  */
    /* JADX WARN: Code duplicated, block: B:86:0x0244  */
    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) throws zzbh {
        int i;
        int i10;
        int i11;
        boolean z4;
        int i12;
        int iZzd;
        byte[] bArrZzN;
        int iZze;
        int i13;
        byte b10;
        int i14;
        int i15;
        int i16;
        byte b11;
        this.zzh.getClass();
        int i17 = zzen.zza;
        while (zzedVar.zzb() > 0) {
            int i18 = this.zzj;
            int i19 = 13;
            char c10 = 7;
            int i20 = 3;
            int i21 = 2;
            if (i18 == 0) {
                byte[] bArrZzN2 = zzedVar.zzN();
                int iZzd2 = zzedVar.zzd();
                int iZze2 = zzedVar.zze();
                while (true) {
                    if (iZzd2 < iZze2) {
                        int i22 = iZzd2 + 1;
                        byte b12 = bArrZzN2[iZzd2];
                        int i23 = b12 & 255;
                        int i24 = i20;
                        if (this.zzl == 512 && zzl((byte) -1, (byte) i23)) {
                            if (!this.zzn) {
                                int i25 = iZzd2 - 1;
                                zzedVar.zzL(iZzd2);
                                if (zzm(zzedVar, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int iZzd3 = this.zzc.zzd(1);
                                    int i26 = this.zzo;
                                    if (i26 != -1 && iZzd3 != i26) {
                                        c10 = 7;
                                    } else if (this.zzp == -1) {
                                        if (zzm(zzedVar, this.zzc.zza, 4)) {
                                            this.zzc.zzl(14);
                                            iZzd = this.zzc.zzd(i19);
                                            c10 = 7;
                                            if (iZzd >= 7) {
                                                bArrZzN = zzedVar.zzN();
                                                iZze = zzedVar.zze();
                                                i13 = i25 + iZzd;
                                                if (i13 >= iZze) {
                                                    b10 = bArrZzN[i13];
                                                    if (b10 == -1) {
                                                        i16 = i13 + 1;
                                                        if (i16 != iZze) {
                                                            b11 = bArrZzN[i16];
                                                            if (zzl((byte) -1, b11) || ((b11 & 8) >> 3) != iZzd3) {
                                                            }
                                                        }
                                                    } else if (b10 == 73 || ((i14 = i13 + 1) != iZze && (bArrZzN[i14] != 68 || ((i15 = i13 + 2) != iZze && bArrZzN[i15] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (zzm(zzedVar, this.zzc.zza, 1)) {
                                        this.zzc.zzl(i21);
                                        if (this.zzc.zzd(4) == this.zzp) {
                                            zzedVar.zzL(iZzd2 + 1);
                                            if (zzm(zzedVar, this.zzc.zza, 4)) {
                                                this.zzc.zzl(14);
                                                iZzd = this.zzc.zzd(i19);
                                                c10 = 7;
                                                if (iZzd >= 7) {
                                                    bArrZzN = zzedVar.zzN();
                                                    iZze = zzedVar.zze();
                                                    i13 = i25 + iZzd;
                                                    if (i13 >= iZze) {
                                                        b10 = bArrZzN[i13];
                                                        if (b10 == -1) {
                                                            i16 = i13 + 1;
                                                            if (i16 != iZze) {
                                                                b11 = bArrZzN[i16];
                                                                if (zzl((byte) -1, b11)) {
                                                                }
                                                            }
                                                        } else if (b10 == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c10 = 7;
                                        }
                                    }
                                } else {
                                    c10 = c10;
                                }
                                i = this.zzl;
                                i10 = i | i23;
                                if (i10 != 329) {
                                    i11 = 2;
                                    z4 = false;
                                    i12 = 768;
                                } else if (i10 != 511) {
                                    i11 = 2;
                                    z4 = false;
                                    i12 = 512;
                                } else if (i10 != 836) {
                                    i11 = 2;
                                    z4 = false;
                                    i12 = 1024;
                                } else if (i10 != 1075) {
                                    this.zzj = 2;
                                    this.zzk = i24;
                                    this.zzt = 0;
                                    this.zzd.zzL(0);
                                    zzedVar.zzL(i22);
                                } else if (i != 256) {
                                    this.zzl = 256;
                                    i20 = i24;
                                    i19 = 13;
                                    i21 = 2;
                                } else {
                                    i24 = i24;
                                    i11 = 2;
                                    z4 = false;
                                    iZzd2 = i22;
                                    i20 = i24;
                                    i21 = i11;
                                    i19 = 13;
                                }
                                this.zzl = i12;
                                iZzd2 = i22;
                                i20 = i24;
                                i21 = i11;
                                i19 = 13;
                            }
                            this.zzq = (b12 & 8) >> 3;
                            this.zzm = 1 == ((b12 & 1) ^ 1);
                            if (this.zzn) {
                                zzi();
                            } else {
                                this.zzj = 1;
                                this.zzk = 0;
                            }
                            zzedVar.zzL(i22);
                        } else {
                            c10 = c10;
                            i = this.zzl;
                            i10 = i | i23;
                            if (i10 != 329) {
                                i11 = 2;
                                z4 = false;
                                i12 = 768;
                            } else if (i10 != 511) {
                                i11 = 2;
                                z4 = false;
                                i12 = 512;
                            } else if (i10 != 836) {
                                i11 = 2;
                                z4 = false;
                                i12 = 1024;
                            } else if (i10 != 1075) {
                                this.zzj = 2;
                                this.zzk = i24;
                                this.zzt = 0;
                                this.zzd.zzL(0);
                                zzedVar.zzL(i22);
                            } else if (i != 256) {
                                this.zzl = 256;
                                i20 = i24;
                                i19 = 13;
                                i21 = 2;
                            } else {
                                i24 = i24;
                                i11 = 2;
                                z4 = false;
                                iZzd2 = i22;
                                i20 = i24;
                                i21 = i11;
                                i19 = 13;
                            }
                            this.zzl = i12;
                            iZzd2 = i22;
                            i20 = i24;
                            i21 = i11;
                            i19 = 13;
                        }
                    } else {
                        zzedVar.zzL(iZzd2);
                    }
                }
            } else if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        int iMin = Math.min(zzedVar.zzb(), this.zzt - this.zzk);
                        this.zzv.zzq(zzedVar, iMin);
                        int i27 = this.zzk + iMin;
                        this.zzk = i27;
                        if (i27 == this.zzt) {
                            zzdb.zzf(this.zzu != -9223372036854775807L);
                            this.zzv.zzs(this.zzu, 1, this.zzt, 0, null);
                            this.zzu += this.zzw;
                            zzh();
                        }
                    } else {
                        if (zzk(zzedVar, this.zzc.zza, true != this.zzm ? 5 : 7)) {
                            this.zzc.zzl(0);
                            if (this.zzr) {
                                this.zzc.zzn(10);
                            } else {
                                int iZzd4 = this.zzc.zzd(2) + 1;
                                if (iZzd4 != 2) {
                                    zzdt.zzf("AdtsReader", "Detected audio object type: " + iZzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzn(5);
                                int iZzd5 = this.zzc.zzd(3);
                                int i28 = this.zzp;
                                byte[] bArr = {(byte) (((i28 >> 1) & 7) | 16), (byte) (((iZzd5 << 3) & 120) | ((i28 << 7) & 128))};
                                zzabm zzabmVarZza = zzabo.zza(bArr);
                                zzab zzabVar = new zzab();
                                zzabVar.zzL(this.zzg);
                                zzabVar.zzZ("audio/mp4a-latm");
                                zzabVar.zzA(zzabmVarZza.zzc);
                                zzabVar.zzz(zzabmVarZza.zzb);
                                zzabVar.zzaa(zzabmVarZza.zza);
                                zzabVar.zzM(Collections.singletonList(bArr));
                                zzabVar.zzP(this.zze);
                                zzabVar.zzX(this.zzf);
                                zzad zzadVarZzaf = zzabVar.zzaf();
                                this.zzs = 1024000000 / ((long) zzadVarZzaf.zzD);
                                this.zzh.zzl(zzadVarZzaf);
                                this.zzr = true;
                            }
                            this.zzc.zzn(4);
                            int iZzd6 = this.zzc.zzd(13);
                            int i29 = iZzd6 - 7;
                            if (this.zzm) {
                                i29 = iZzd6 - 9;
                            }
                            zzj(this.zzh, this.zzs, 0, i29);
                        }
                    }
                } else if (zzk(zzedVar, this.zzd.zzN(), 10)) {
                    this.zzi.zzq(this.zzd, 10);
                    this.zzd.zzL(6);
                    zzj(this.zzi, 0L, 10, this.zzd.zzl() + 10);
                }
            } else if (zzedVar.zzb() != 0) {
                zzec zzecVar = this.zzc;
                zzecVar.zza[0] = zzedVar.zzN()[zzedVar.zzd()];
                zzecVar.zzl(2);
                int iZzd7 = this.zzc.zzd(4);
                int i30 = this.zzp;
                if (i30 == -1 || iZzd7 == i30) {
                    if (!this.zzn) {
                        this.zzn = true;
                        this.zzo = this.zzq;
                        this.zzp = iZzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzg = zzaoaVar.zzb();
        zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 1);
        this.zzh = zzadxVarZzw;
        this.zzv = zzadxVarZzw;
        if (!this.zzb) {
            this.zzi = new zzacm();
            return;
        }
        zzaoaVar.zzc();
        zzadx zzadxVarZzw2 = zzacuVar.zzw(zzaoaVar.zza(), 5);
        this.zzi = zzadxVarZzw2;
        zzab zzabVar = new zzab();
        zzabVar.zzL(zzaoaVar.zzb());
        zzabVar.zzZ("application/id3");
        zzadxVarZzw2.zzl(zzabVar.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzu = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
    }
}
