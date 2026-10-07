package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamk implements zzamm {
    private final zzed zza;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadx zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzad zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzamk(String str, int i, int i10) {
        this.zza = new zzed(new byte[i10]);
        this.zzc = str;
        this.zzd = i;
    }

    private final void zzf(zzaco zzacoVar) {
        int i;
        int i10 = zzacoVar.zzb;
        if (i10 == -2147483647 || (i = zzacoVar.zzc) == -1) {
            return;
        }
        zzad zzadVar = this.zzk;
        if (zzadVar != null && i == zzadVar.zzC && i10 == zzadVar.zzD && Objects.equals(zzacoVar.zza, zzadVar.zzo)) {
            return;
        }
        zzad zzadVar2 = this.zzk;
        zzab zzabVar = zzadVar2 == null ? new zzab() : zzadVar2.zzb();
        zzabVar.zzL(this.zze);
        zzabVar.zzZ(zzacoVar.zza);
        zzabVar.zzz(zzacoVar.zzc);
        zzabVar.zzaa(zzacoVar.zzb);
        zzabVar.zzP(this.zzc);
        zzabVar.zzX(this.zzd);
        zzad zzadVarZzaf = zzabVar.zzaf();
        this.zzk = zzadVarZzaf;
        this.zzf.zzl(zzadVarZzaf);
    }

    private final boolean zzg(zzed zzedVar, byte[] bArr, int i) {
        int iMin = Math.min(zzedVar.zzb(), i - this.zzh);
        zzedVar.zzH(bArr, this.zzh, iMin);
        int i10 = this.zzh + iMin;
        this.zzh = i10;
        return i10 == i;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ef  */
    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) throws zzbh {
        char c10;
        char c11;
        int i;
        int i10;
        byte b10;
        boolean z4;
        int i11;
        int i12;
        byte b11;
        int i13;
        byte b12;
        int i14;
        int i15;
        byte b13;
        int i16;
        zzdb.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i17 = this.zzg;
            if (i17 == 0) {
                while (zzedVar.zzb() > 0) {
                    int i18 = this.zzi << 8;
                    this.zzi = i18;
                    int iZzm = i18 | zzedVar.zzm();
                    this.zzi = iZzm;
                    if (iZzm == 2147385345 || iZzm == -25230976 || iZzm == 536864768 || iZzm == -14745368) {
                        i16 = 1;
                    } else if (iZzm == 1683496997 || iZzm == 622876772) {
                        i16 = 2;
                    } else if (iZzm == 1078008818 || iZzm == -233094848) {
                        i16 = 3;
                    } else {
                        i16 = (iZzm == 1908687592 || iZzm == -398277519) ? 4 : 0;
                    }
                    this.zzm = i16;
                    if (i16 != 0) {
                        byte[] bArrZzN = this.zza.zzN();
                        int i19 = this.zzi;
                        bArrZzN[0] = (byte) ((i19 >> 24) & 255);
                        bArrZzN[1] = (byte) ((i19 >> 16) & 255);
                        bArrZzN[2] = (byte) ((i19 >> 8) & 255);
                        bArrZzN[3] = (byte) (i19 & 255);
                        this.zzh = 4;
                        this.zzi = 0;
                        if (i16 != 3 && i16 != 4) {
                            if (i16 != 1) {
                                this.zzg = 2;
                                break;
                            } else {
                                this.zzg = 1;
                                break;
                            }
                        }
                        this.zzg = 4;
                        break;
                    }
                }
            } else if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 != 4) {
                            if (i17 != 5) {
                                int iMin = Math.min(zzedVar.zzb(), this.zzl - this.zzh);
                                this.zzf.zzq(zzedVar, iMin);
                                int i20 = this.zzh + iMin;
                                this.zzh = i20;
                                if (i20 == this.zzl) {
                                    zzdb.zzf(this.zzp != -9223372036854775807L);
                                    this.zzf.zzs(this.zzp, this.zzm == 4 ? 0 : 1, this.zzl, 0, null);
                                    this.zzp += this.zzj;
                                    this.zzg = 0;
                                }
                            } else if (zzg(zzedVar, this.zza.zzN(), this.zzo)) {
                                zzaco zzacoVarZze = zzacq.zze(this.zza.zzN(), this.zzb);
                                if (this.zzm == 3) {
                                    zzf(zzacoVarZze);
                                }
                                this.zzl = zzacoVarZze.zzd;
                                long j4 = zzacoVarZze.zze;
                                this.zzj = j4 != -9223372036854775807L ? j4 : 0L;
                                this.zza.zzL(0);
                                this.zzf.zzq(this.zza, this.zzo);
                                this.zzg = 6;
                            }
                        } else if (zzg(zzedVar, this.zza.zzN(), 6)) {
                            int iZzb = zzacq.zzb(this.zza.zzN());
                            this.zzo = iZzb;
                            int i21 = this.zzh;
                            if (i21 > iZzb) {
                                int i22 = i21 - iZzb;
                                this.zzh = i21 - i22;
                                zzedVar.zzL(zzedVar.zzd() - i22);
                            }
                            this.zzg = 5;
                        }
                    } else if (zzg(zzedVar, this.zza.zzN(), this.zzn)) {
                        zzaco zzacoVarZzd = zzacq.zzd(this.zza.zzN());
                        zzf(zzacoVarZzd);
                        this.zzl = zzacoVarZzd.zzd;
                        long j10 = zzacoVarZzd.zze;
                        this.zzj = j10 != -9223372036854775807L ? j10 : 0L;
                        this.zza.zzL(0);
                        this.zzf.zzq(this.zza, this.zzn);
                        this.zzg = 6;
                    }
                } else if (zzg(zzedVar, this.zza.zzN(), 7)) {
                    this.zzn = zzacq.zza(this.zza.zzN());
                    this.zzg = 3;
                }
            } else if (zzg(zzedVar, this.zza.zzN(), 18)) {
                byte[] bArrZzN2 = this.zza.zzN();
                if (this.zzk == null) {
                    c10 = '\b';
                    zzad zzadVarZzc = zzacq.zzc(bArrZzN2, this.zze, this.zzc, this.zzd, null);
                    this.zzk = zzadVarZzc;
                    this.zzf.zzl(zzadVarZzc);
                } else {
                    c10 = '\b';
                }
                byte b14 = bArrZzN2[0];
                if (b14 != -2) {
                    if (b14 == -1) {
                        c11 = 7;
                        i14 = (3 & bArrZzN2[7]) << 12;
                        i15 = (bArrZzN2[6] & 255) << 4;
                        b13 = bArrZzN2[9];
                    } else if (b14 != 31) {
                        i = (bArrZzN2[5] & 3) << 12;
                        i10 = (bArrZzN2[6] & 255) << 4;
                        c11 = 7;
                        b10 = bArrZzN2[7];
                    } else {
                        c11 = 7;
                        i14 = (3 & bArrZzN2[6]) << 12;
                        i15 = (bArrZzN2[7] & 255) << 4;
                        b13 = bArrZzN2[c10];
                    }
                    i11 = (i14 | i15 | ((b13 & 60) >> 2)) + 1;
                    z4 = true;
                    if (z4) {
                        i11 = (i11 * 16) / 14;
                    }
                    this.zzl = i11;
                    if (b14 != -2) {
                        if (b14 != -1) {
                            i12 = (bArrZzN2[4] & 7) << 4;
                            b12 = bArrZzN2[c11];
                        } else if (b14 != 31) {
                            i12 = (bArrZzN2[4] & 1) << 6;
                            b11 = bArrZzN2[r9];
                        } else {
                            i12 = (bArrZzN2[r9] & 7) << 4;
                            b12 = bArrZzN2[6];
                        }
                        i13 = b12 & 60;
                        this.zzj = zzgcr.zzb(zzen.zzt((((i13 >> 2) | i12) + 1) * 32, this.zzk.zzD));
                        this.zza.zzL(0);
                        this.zzf.zzq(this.zza, 18);
                        this.zzg = 6;
                    } else {
                        i12 = (bArrZzN2[r9] & 1) << 6;
                        b11 = bArrZzN2[4];
                    }
                    i13 = b11 & 252;
                    this.zzj = zzgcr.zzb(zzen.zzt((((i13 >> 2) | i12) + 1) * 32, this.zzk.zzD));
                    this.zza.zzL(0);
                    this.zzf.zzq(this.zza, 18);
                    this.zzg = 6;
                } else {
                    c11 = 7;
                    i = (3 & bArrZzN2[4]) << 12;
                    i10 = (bArrZzN2[7] & 255) << 4;
                    b10 = bArrZzN2[6];
                }
                i11 = (i | i10 | ((b10 & 240) >> 4)) + 1;
                z4 = false;
                if (z4) {
                    i11 = (i11 * 16) / 14;
                }
                this.zzl = i11;
                if (b14 != -2) {
                    if (b14 != -1) {
                        i12 = (bArrZzN2[4] & 7) << 4;
                        b12 = bArrZzN2[c11];
                    } else if (b14 != 31) {
                        i12 = (bArrZzN2[4] & 1) << 6;
                        b11 = bArrZzN2[r9];
                    } else {
                        i12 = (bArrZzN2[r9] & 7) << 4;
                        b12 = bArrZzN2[6];
                    }
                    i13 = b12 & 60;
                    this.zzj = zzgcr.zzb(zzen.zzt((((i13 >> 2) | i12) + 1) * 32, this.zzk.zzD));
                    this.zza.zzL(0);
                    this.zzf.zzq(this.zza, 18);
                    this.zzg = 6;
                } else {
                    i12 = (bArrZzN2[r9] & 1) << 6;
                    b11 = bArrZzN2[4];
                }
                i13 = b11 & 252;
                this.zzj = zzgcr.zzb(zzen.zzt((((i13 >> 2) | i12) + 1) * 32, this.zzk.zzD));
                this.zza.zzL(0);
                this.zzf.zzq(this.zza, 18);
                this.zzg = 6;
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
        this.zzp = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
    }
}
