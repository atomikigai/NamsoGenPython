package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzand {
    public static zzanb zza(zzec zzecVar) throws zzbh {
        int iZzd;
        int i;
        char c10;
        int i10;
        int i11;
        int iZzd2;
        char c11;
        int iZzd3 = zzecVar.zzd(8);
        int i12 = 5;
        int iZzd4 = zzecVar.zzd(5);
        if (iZzd4 != 31) {
            switch (iZzd4) {
                case 0:
                    iZzd = 96000;
                    break;
                case 1:
                    iZzd = 88200;
                    break;
                case 2:
                    iZzd = 64000;
                    break;
                case 3:
                    iZzd = 48000;
                    break;
                case 4:
                    iZzd = 44100;
                    break;
                case 5:
                    iZzd = 32000;
                    break;
                case 6:
                    iZzd = 24000;
                    break;
                case 7:
                    iZzd = 22050;
                    break;
                case 8:
                    iZzd = 16000;
                    break;
                case 9:
                    iZzd = 12000;
                    break;
                case 10:
                    iZzd = 11025;
                    break;
                case 11:
                    iZzd = 8000;
                    break;
                case 12:
                    iZzd = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzbh.zzc("Unsupported sampling rate index " + iZzd4);
                case 15:
                    iZzd = 57600;
                    break;
                case 16:
                    iZzd = 51200;
                    break;
                case 17:
                    iZzd = 40000;
                    break;
                case 18:
                    iZzd = 38400;
                    break;
                case 19:
                    iZzd = 34150;
                    break;
                case 20:
                    iZzd = 28800;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    iZzd = 25600;
                    break;
                case 22:
                    iZzd = 20000;
                    break;
                case 23:
                    iZzd = 19200;
                    break;
                case 24:
                    iZzd = 17075;
                    break;
                case 25:
                    iZzd = 14400;
                    break;
                case 26:
                    iZzd = 12800;
                    break;
                case 27:
                    iZzd = 9600;
                    break;
            }
        } else {
            iZzd = zzecVar.zzd(24);
        }
        int iZzd5 = zzecVar.zzd(3);
        int i13 = 1;
        if (iZzd5 == 0) {
            i = 768;
        } else if (iZzd5 == 1) {
            i = 1024;
        } else if (iZzd5 == 2 || iZzd5 == 3) {
            i = 2048;
        } else {
            if (iZzd5 != 4) {
                throw zzbh.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            i = 4096;
        }
        if (iZzd5 == 0 || iZzd5 == 1) {
            c10 = 0;
        } else if (iZzd5 == 2) {
            c10 = 2;
        } else if (iZzd5 == 3) {
            c10 = 3;
        } else {
            if (iZzd5 != 4) {
                throw zzbh.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            c10 = 1;
        }
        zzecVar.zzn(2);
        zze(zzecVar);
        int iZzd6 = zzecVar.zzd(5);
        int i14 = 0;
        int iZzc = 0;
        while (true) {
            int i15 = 16;
            if (i14 < iZzd6 + 1) {
                int iZzd7 = zzecVar.zzd(3);
                iZzc += zzc(zzecVar, 5, 8, 16) + 1;
                if ((iZzd7 == 0 || iZzd7 == 2) && zzecVar.zzp()) {
                    zze(zzecVar);
                }
                i14++;
            } else {
                int iZzc2 = zzc(zzecVar, 4, 8, 16) + 1;
                zzecVar.zzm();
                int i16 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i16 >= iZzc2) {
                        int i17 = iZzd3;
                        byte[] bArr = null;
                        if (zzecVar.zzp()) {
                            int iZzc3 = zzc(zzecVar, 2, 4, 8) + 1;
                            for (int i18 = 0; i18 < iZzc3; i18++) {
                                int iZzc4 = zzc(zzecVar, 4, 8, 16);
                                int iZzc5 = zzc(zzecVar, 4, 8, 16);
                                if (iZzc4 == 7) {
                                    int iZzd8 = zzecVar.zzd(4) + 1;
                                    zzecVar.zzn(4);
                                    byte[] bArr2 = new byte[iZzd8];
                                    for (int i19 = 0; i19 < iZzd8; i19++) {
                                        bArr2[i19] = (byte) zzecVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzecVar.zzn(iZzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzd) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                throw zzbh.zzc("Unsupported sampling rate " + iZzd);
                        }
                        return new zzanb(i17, (int) (((double) iZzd) * d10), (int) (((double) i) * d10), bArr3, null);
                    }
                    int iZzd9 = zzecVar.zzd(2);
                    if (iZzd9 == 0) {
                        i10 = iZzd3;
                        i11 = i13;
                        zzf(zzecVar);
                        if (c10 > 0) {
                            zzd(zzecVar);
                        }
                    } else if (iZzd9 == i13) {
                        i11 = i13;
                        if (zzf(zzecVar)) {
                            zzecVar.zzm();
                        }
                        if (c10 > 0) {
                            zzd(zzecVar);
                            iZzd2 = zzecVar.zzd(2);
                            c11 = c10;
                        } else {
                            iZzd2 = 0;
                            c11 = 0;
                        }
                        if (iZzd2 > 0) {
                            zzecVar.zzn(6);
                            int iZzd10 = zzecVar.zzd(2);
                            zzecVar.zzn(4);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(i12);
                            }
                            if (iZzd2 == 2 || iZzd2 == 3) {
                                zzecVar.zzn(6);
                            }
                            if (iZzd10 == 2) {
                                zzecVar.zzm();
                            }
                        }
                        i10 = iZzd3;
                        int iFloor = ((int) Math.floor(Math.log(iZzc - 1) / Math.log(2.0d))) + 1;
                        int iZzd11 = zzecVar.zzd(2);
                        if (iZzd11 > 0 && zzecVar.zzp()) {
                            zzecVar.zzn(iFloor);
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(iFloor);
                        }
                        if (c11 == 0 && iZzd11 == 0) {
                            zzecVar.zzm();
                        }
                    } else if (iZzd9 != 3) {
                        i10 = iZzd3;
                        i11 = i13;
                    } else {
                        zzc(zzecVar, 4, 8, i15);
                        int iZzc6 = zzc(zzecVar, 4, 8, i15);
                        i11 = i13;
                        if (zzecVar.zzp()) {
                            zzc(zzecVar, 8, i15, 0);
                        }
                        zzecVar.zzm();
                        if (iZzc6 > 0) {
                            zzecVar.zzn(iZzc6 * 8);
                        }
                        i10 = iZzd3;
                    }
                    i16++;
                    iZzd3 = i10;
                    i13 = i11;
                    i12 = 5;
                    i15 = 16;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    public static boolean zzb(zzec zzecVar, zzana zzanaVar) throws zzbh {
        long jZze;
        zzecVar.zzb();
        int iZzc = zzc(zzecVar, 3, 8, 8);
        zzanaVar.zza = iZzc;
        if (iZzc == -1) {
            return false;
        }
        zzdb.zzd(Math.max(Math.max(2, 8), 32) <= 63);
        zzgcm.zza(zzgcm.zza(3L, 255L), 4294967296L);
        if (zzecVar.zza() < 2) {
            jZze = -1;
        } else {
            jZze = zzecVar.zze(2);
            if (jZze == 3) {
                if (zzecVar.zza() < 8) {
                    jZze = -1;
                } else {
                    long jZze2 = zzecVar.zze(8);
                    long j4 = jZze2 + 3;
                    if (jZze2 != 255) {
                        jZze = j4;
                    } else if (zzecVar.zza() < 32) {
                        jZze = -1;
                    } else {
                        jZze = zzecVar.zze(32) + j4;
                    }
                }
            }
        }
        zzanaVar.zzb = jZze;
        if (jZze == -1) {
            return false;
        }
        if (jZze > 16) {
            throw zzbh.zzc("Contains sub-stream with an invalid packet label " + jZze);
        }
        if (jZze == 0) {
            int i = zzanaVar.zza;
            if (i == 1) {
                throw zzbh.zza("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw zzbh.zza("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw zzbh.zza("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iZzc2 = zzc(zzecVar, 11, 24, 24);
        zzanaVar.zzc = iZzc2;
        return iZzc2 != -1;
    }

    private static int zzc(zzec zzecVar, int i, int i10, int i11) {
        zzdb.zzd(Math.max(Math.max(i, i10), i11) <= 31);
        int i12 = (1 << i) - 1;
        int i13 = (1 << i10) - 1;
        zzgck.zza(zzgck.zza(i12, i13), 1 << i11);
        if (zzecVar.zza() < i) {
            return -1;
        }
        int iZzd = zzecVar.zzd(i);
        if (iZzd == i12) {
            if (zzecVar.zza() < i10) {
                return -1;
            }
            int iZzd2 = zzecVar.zzd(i10);
            iZzd += iZzd2;
            if (iZzd2 == i13) {
                if (zzecVar.zza() < i11) {
                    return -1;
                }
                return zzecVar.zzd(i11) + iZzd;
            }
        }
        return iZzd;
    }

    private static void zzd(zzec zzecVar) {
        zzecVar.zzn(3);
        zzecVar.zzn(8);
        boolean zZzp = zzecVar.zzp();
        boolean zZzp2 = zzecVar.zzp();
        if (zZzp) {
            zzecVar.zzn(5);
        }
        if (zZzp2) {
            zzecVar.zzn(6);
        }
    }

    private static void zze(zzec zzecVar) {
        int iZzd;
        int iZzd2 = zzecVar.zzd(2);
        if (iZzd2 == 0) {
            zzecVar.zzn(6);
            return;
        }
        int iZzc = zzc(zzecVar, 5, 8, 16) + 1;
        if (iZzd2 == 1) {
            zzecVar.zzn(iZzc * 7);
            return;
        }
        if (iZzd2 == 2) {
            boolean zZzp = zzecVar.zzp();
            int i = true != zZzp ? 5 : 1;
            int i10 = true == zZzp ? 7 : 5;
            int i11 = true == zZzp ? 8 : 6;
            int i12 = 0;
            while (i12 < iZzc) {
                if (zzecVar.zzp()) {
                    zzecVar.zzn(7);
                    iZzd = 0;
                } else {
                    if (zzecVar.zzd(2) == 3 && zzecVar.zzd(i10) * i != 0) {
                        zzecVar.zzm();
                    }
                    iZzd = zzecVar.zzd(i11) * i;
                    if (iZzd != 0 && iZzd != 180) {
                        zzecVar.zzm();
                    }
                    zzecVar.zzm();
                }
                if (iZzd != 0 && iZzd != 180 && zzecVar.zzp()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    private static boolean zzf(zzec zzecVar) {
        zzecVar.zzn(3);
        boolean zZzp = zzecVar.zzp();
        if (zZzp) {
            zzecVar.zzn(13);
        }
        return zZzp;
    }
}
