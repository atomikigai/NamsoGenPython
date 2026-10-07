package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzco {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzco(int i, int i10, float f10, float f11, int i11) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i / i11;
        this.zzf = i / 400;
        int i12 = i / 65;
        this.zzg = i12;
        int i13 = i12 + i12;
        this.zzh = i13;
        this.zzi = new short[i13];
        int i14 = i13 * i10;
        this.zzj = new short[i14];
        this.zzl = new short[i14];
        this.zzn = new short[i14];
    }

    private final int zzg(short[] sArr, int i, int i10, int i11) {
        int i12 = 1;
        int i13 = 255;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = this.zzb * i;
                iAbs += Math.abs(sArr[i17 + i16] - sArr[(i17 + i10) + i16]);
            }
            int i18 = iAbs * i14;
            int i19 = i12 * i10;
            if (i18 < i19) {
                i12 = iAbs;
            }
            if (i18 < i19) {
                i14 = i10;
            }
            int i20 = iAbs * i13;
            int i21 = i15 * i10;
            if (i20 > i21) {
                i15 = iAbs;
            }
            if (i20 > i21) {
                i13 = i10;
            }
            i10++;
        }
        this.zzu = i12 / i14;
        this.zzv = i15 / i13;
        return i14;
    }

    private final void zzh(short[] sArr, int i, int i10) {
        short[] sArrZzl = zzl(this.zzl, this.zzm, i10);
        this.zzl = sArrZzl;
        int i11 = this.zzm;
        int i12 = this.zzb;
        System.arraycopy(sArr, i * i12, sArrZzl, i11 * i12, i10 * i12);
        this.zzm += i10;
    }

    private final void zzi(short[] sArr, int i, int i10) {
        int i11;
        for (int i12 = 0; i12 < this.zzh / i10; i12++) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.zzb;
                i11 = i15 * i10;
                if (i13 < i11) {
                    i14 += sArr[(i11 * i12) + (i15 * i) + i13];
                    i13++;
                }
            }
            this.zzi[i12] = (short) (i14 / i11);
        }
    }

    private static void zzj(int i, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                sArr[i17] = (short) (((sArr3[i16] * i18) + ((i - i18) * sArr2[i15])) / i);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzk() {
        int iZzg;
        int i;
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11 = this.zzc / this.zzd;
        double d10 = f11;
        int i16 = this.zzm;
        float f12 = 1.0f;
        int i17 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i18 = this.zzk;
            if (i18 >= this.zzh) {
                int i19 = 0;
                while (true) {
                    int i20 = this.zzr;
                    if (i20 > 0) {
                        int iMin = Math.min(this.zzh, i20);
                        zzh(this.zzj, i19, iMin);
                        this.zzr -= iMin;
                        i19 += iMin;
                    } else {
                        short[] sArr = this.zzj;
                        int i21 = this.zza;
                        int i22 = i21 > 4000 ? i21 / 4000 : i17;
                        if (this.zzb == i17 && i22 == i17) {
                            iZzg = zzg(sArr, i19, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i19, i22);
                            int iZzg2 = zzg(this.zzi, 0, this.zzf / i22, this.zzg / i22);
                            if (i22 != i17) {
                                int i23 = iZzg2 * i22;
                                int i24 = i22 * 4;
                                int i25 = this.zzf;
                                int i26 = i23 - i24;
                                if (i26 >= i25) {
                                    i25 = i26;
                                }
                                int i27 = i23 + i24;
                                int i28 = this.zzg;
                                if (i27 > i28) {
                                    i27 = i28;
                                }
                                if (this.zzb == i17) {
                                    iZzg = zzg(sArr, i19, i25, i27);
                                } else {
                                    zzi(sArr, i19, i17);
                                    iZzg = zzg(this.zzi, 0, i25, i27);
                                }
                            } else {
                                iZzg = iZzg2;
                            }
                        }
                        int i29 = this.zzu;
                        int i30 = (i29 == 0 || (i11 = this.zzs) == 0 || this.zzv > i29 * 3 || i29 + i29 <= this.zzt * 3) ? iZzg : i11;
                        int i31 = i19 + i30;
                        this.zzt = i29;
                        this.zzs = iZzg;
                        float f13 = i30;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            float f14 = (-1.0f) + f11;
                            if (f11 >= 2.0f) {
                                i10 = (int) (f13 / f14);
                            } else {
                                this.zzr = (int) (((2.0f - f11) * f13) / f14);
                                i10 = i30;
                            }
                            short[] sArrZzl = zzl(this.zzl, this.zzm, i10);
                            this.zzl = sArrZzl;
                            zzj(i10, this.zzb, sArrZzl, this.zzm, sArr2, i19, sArr2, i31);
                            this.zzm += i10;
                            i19 = i30 + i10 + i19;
                        } else {
                            int i32 = i30;
                            short[] sArr3 = this.zzj;
                            float f15 = f12 - f11;
                            if (f11 < 0.5f) {
                                i = (int) ((f13 * f11) / f15);
                            } else {
                                this.zzr = (int) ((((f11 + f11) - 1.0f) * f13) / f15);
                                i = i32;
                            }
                            int i33 = i32 + i;
                            short[] sArrZzl2 = zzl(this.zzl, this.zzm, i33);
                            this.zzl = sArrZzl2;
                            int i34 = this.zzb;
                            System.arraycopy(sArr3, i19 * i34, sArrZzl2, this.zzm * i34, i34 * i32);
                            int i35 = i19;
                            zzj(i, this.zzb, this.zzl, this.zzm + i32, sArr3, i31, sArr3, i35);
                            this.zzm += i33;
                            i19 = i35 + i;
                        }
                    }
                    if (this.zzh + i19 > i18) {
                        break;
                    }
                    f12 = f12;
                    i17 = i17;
                }
                int i36 = this.zzk - i19;
                short[] sArr4 = this.zzj;
                int i37 = this.zzb;
                System.arraycopy(sArr4, i19 * i37, sArr4, 0, i37 * i36);
                this.zzk = i36;
            }
            f10 = this.zze * this.zzd;
            if (f10 != f12 || this.zzm == i16) {
            }
            int i38 = this.zza;
            int i39 = (int) (i38 / f10);
            while (true) {
                if (i39 <= 16384 && i38 <= 16384) {
                    break;
                }
                i39 /= 2;
                i38 /= 2;
            }
            int i40 = this.zzm - i16;
            short[] sArrZzl3 = zzl(this.zzn, this.zzo, i40);
            this.zzn = sArrZzl3;
            short[] sArr5 = this.zzl;
            int i41 = this.zzb;
            System.arraycopy(sArr5, i16 * i41, sArrZzl3, this.zzo * i41, i41 * i40);
            this.zzm = i16;
            this.zzo += i40;
            int i42 = 0;
            while (true) {
                i12 = this.zzo;
                i13 = i12 - 1;
                if (i42 >= i13) {
                    break;
                }
                while (true) {
                    i14 = this.zzp + 1;
                    int i43 = i14 * i39;
                    i15 = this.zzq;
                    if (i43 <= i15 * i38) {
                        break;
                    }
                    this.zzl = zzl(this.zzl, this.zzm, i17);
                    int i44 = 0;
                    while (true) {
                        int i45 = this.zzb;
                        if (i44 < i45) {
                            short[] sArr6 = this.zzl;
                            int i46 = this.zzm * i45;
                            short[] sArr7 = this.zzn;
                            int i47 = (i42 * i45) + i44;
                            short s10 = sArr7[i47];
                            short s11 = sArr7[i47 + i45];
                            int i48 = this.zzq * i38;
                            int i49 = this.zzp;
                            int i50 = i49 * i39;
                            int i51 = (i49 + 1) * i39;
                            int i52 = i51 - i48;
                            int i53 = i51 - i50;
                            sArr6[i46 + i44] = (short) ((((i53 - i52) * s11) + (s10 * i52)) / i53);
                            i44++;
                        }
                    }
                    i17 = 1;
                    this.zzq++;
                    this.zzm++;
                }
                this.zzp = i14;
                if (i14 == i38) {
                    this.zzp = 0;
                    zzdb.zzf(i15 == i39 ? i17 : 0);
                    this.zzq = 0;
                }
                i42++;
            }
            if (i13 != 0) {
                short[] sArr8 = this.zzn;
                int i54 = this.zzb;
                System.arraycopy(sArr8, i13 * i54, sArr8, 0, (i12 - i13) * i54);
                this.zzo -= i13;
                return;
            }
            return;
        }
        zzh(this.zzj, 0, this.zzk);
        this.zzk = 0;
        f12 = 1.0f;
        i17 = 1;
        f10 = this.zze * this.zzd;
        if (f10 != f12) {
        }
    }

    private final short[] zzl(short[] sArr, int i, int i10) {
        int length = sArr.length;
        int i11 = this.zzb;
        int i12 = length / i11;
        return i + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * iMin);
        int i = this.zzm - iMin;
        this.zzm = i;
        int i10 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, iMin * i10, sArr, 0, i * i10);
    }

    public final void zze() {
        int i;
        int i10 = this.zzk;
        int i11 = this.zzm;
        float f10 = this.zzo;
        float f11 = this.zzc;
        float f12 = this.zze;
        float f13 = this.zzd;
        int i12 = i11 + ((int) ((((i10 / (f11 / f13)) + f10) / (f12 * f13)) + 0.5f));
        int i13 = this.zzh;
        this.zzj = zzl(this.zzj, i10, i13 + i13 + i10);
        int i14 = 0;
        while (true) {
            int i15 = this.zzh;
            int i16 = this.zzb;
            i = i15 + i15;
            if (i14 >= i * i16) {
                break;
            }
            this.zzj[(i16 * i10) + i14] = 0;
            i14++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i12) {
            this.zzm = i12;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i10 = iRemaining / i;
        int i11 = i * i10;
        short[] sArrZzl = zzl(this.zzj, this.zzk, i10);
        this.zzj = sArrZzl;
        shortBuffer.get(sArrZzl, this.zzk * this.zzb, (i11 + i11) / 2);
        this.zzk += i10;
        zzk();
    }
}
