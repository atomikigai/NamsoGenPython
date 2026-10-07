package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzabr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return zzf((b10 & 192) >> 6, b10 & 63);
        }
        int i = bArr[2] & 7;
        int i10 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i10 + i10;
    }

    public static zzad zzc(zzed zzedVar, String str, String str2, zzw zzwVar) {
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int i = zzc[zzecVar.zzd(2)];
        zzecVar.zzn(8);
        int i10 = zze[zzecVar.zzd(3)];
        if (zzecVar.zzd(1) != 0) {
            i10++;
        }
        int i11 = zzf[zzecVar.zzd(5)] * zzbbs.zzq.zzf;
        zzecVar.zzf();
        zzedVar.zzL(zzecVar.zzb());
        zzab zzabVar = new zzab();
        zzabVar.zzL(str);
        zzabVar.zzZ("audio/ac3");
        zzabVar.zzz(i10);
        zzabVar.zzaa(i);
        zzabVar.zzF(zzwVar);
        zzabVar.zzP(str2);
        zzabVar.zzy(i11);
        zzabVar.zzU(i11);
        return zzabVar.zzaf();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzad zzd(zzed zzedVar, String str, String str2, zzw zzwVar) {
        String str3;
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int iZzd = zzecVar.zzd(13) * zzbbs.zzq.zzf;
        zzecVar.zzn(3);
        int i = zzc[zzecVar.zzd(2)];
        zzecVar.zzn(10);
        int i10 = zze[zzecVar.zzd(3)];
        if (zzecVar.zzd(1) != 0) {
            i10++;
        }
        zzecVar.zzn(3);
        int iZzd2 = zzecVar.zzd(4);
        zzecVar.zzn(1);
        if (iZzd2 > 0) {
            zzecVar.zzn(6);
            if (zzecVar.zzd(1) != 0) {
                i10 += 2;
            }
            zzecVar.zzn(1);
        }
        if (zzecVar.zza() > 7) {
            zzecVar.zzn(7);
            if (zzecVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzecVar.zzf();
        zzedVar.zzL(zzecVar.zzb());
        zzab zzabVar = new zzab();
        zzabVar.zzL(str);
        zzabVar.zzZ(str3);
        zzabVar.zzz(i10);
        zzabVar.zzaa(i);
        zzabVar.zzF(zzwVar);
        zzabVar.zzP(str2);
        zzabVar.zzU(iZzd);
        return zzabVar.zzaf();
    }

    public static zzabp zze(zzec zzecVar) {
        int iZzf;
        int i;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzc = zzecVar.zzc();
        zzecVar.zzn(40);
        int iZzd = zzecVar.zzd(5);
        zzecVar.zzl(iZzc);
        int i17 = -1;
        if (iZzd > 10) {
            zzecVar.zzn(16);
            int iZzd2 = zzecVar.zzd(2);
            if (iZzd2 == 0) {
                i17 = 0;
            } else if (iZzd2 == 1) {
                i17 = 1;
            } else if (iZzd2 == 2) {
                i17 = 2;
            }
            zzecVar.zzn(3);
            int iZzd3 = zzecVar.zzd(11) + 1;
            int iZzd4 = zzecVar.zzd(2);
            if (iZzd4 == 3) {
                i = zzd[zzecVar.zzd(2)];
                i14 = 6;
                i13 = 3;
            } else {
                int iZzd5 = zzecVar.zzd(2);
                int i18 = zzb[iZzd5];
                i13 = iZzd5;
                i = zzc[iZzd4];
                i14 = i18;
            }
            iZzf = iZzd3 + iZzd3;
            int i19 = (iZzf * i) / (i14 * 32);
            int iZzd6 = zzecVar.zzd(3);
            boolean zZzp = zzecVar.zzp();
            i10 = zze[iZzd6] + (zZzp ? 1 : 0);
            zzecVar.zzn(10);
            if (zzecVar.zzp()) {
                zzecVar.zzn(8);
            }
            if (iZzd6 == 0) {
                zzecVar.zzn(5);
                if (zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                i15 = 0;
                iZzd6 = 0;
            } else {
                i15 = iZzd6;
            }
            if (i17 == 1) {
                if (zzecVar.zzp()) {
                    zzecVar.zzn(16);
                }
                i16 = 1;
            } else {
                i16 = i17;
            }
            if (zzecVar.zzp()) {
                if (i15 > 2) {
                    zzecVar.zzn(2);
                }
                if ((i15 & 1) != 0 && i15 > 2) {
                    zzecVar.zzn(6);
                }
                if ((i15 & 4) != 0) {
                    zzecVar.zzn(6);
                }
                if (zZzp && zzecVar.zzp()) {
                    zzecVar.zzn(5);
                }
                if (i16 == 0) {
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    if (i15 == 0 && zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    int iZzd7 = zzecVar.zzd(2);
                    if (iZzd7 == 1) {
                        zzecVar.zzn(5);
                    } else if (iZzd7 == 2) {
                        zzecVar.zzn(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = zzecVar.zzd(5);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(5);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(4);
                                }
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(4);
                                }
                            }
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(5);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(7);
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(8);
                                }
                            }
                        }
                        zzecVar.zzn((iZzd8 + 2) * 8);
                        zzecVar.zzf();
                    }
                    if (i15 < 2) {
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(14);
                        }
                        if (iZzd6 == 0 && zzecVar.zzp()) {
                            zzecVar.zzn(14);
                        }
                    }
                    if (!zzecVar.zzp()) {
                        i16 = 0;
                    } else if (i13 == 0) {
                        zzecVar.zzn(5);
                        i16 = 0;
                        i13 = 0;
                    } else {
                        for (int i20 = 0; i20 < i14; i20++) {
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(5);
                            }
                        }
                        i16 = 0;
                    }
                }
            }
            if (zzecVar.zzp()) {
                zzecVar.zzn(5);
                if (i15 == 2) {
                    zzecVar.zzn(4);
                    i15 = 2;
                }
                if (i15 >= 6) {
                    zzecVar.zzn(2);
                }
                if (zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                if (i15 == 0 && zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                if (iZzd4 < 3) {
                    zzecVar.zzm();
                }
            }
            if (i16 == 0 && i13 != 3) {
                zzecVar.zzm();
            }
            if (i16 == 2 && (i13 == 3 || zzecVar.zzp())) {
                zzecVar.zzn(6);
            }
            i11 = i14 * 256;
            str = (zzecVar.zzp() && zzecVar.zzd(6) == 1 && zzecVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i12 = i19;
        } else {
            zzecVar.zzn(32);
            int iZzd9 = zzecVar.zzd(2);
            String str2 = iZzd9 == 3 ? null : "audio/ac3";
            int iZzd10 = zzecVar.zzd(6);
            int i21 = zzf[iZzd10 / 2] * zzbbs.zzq.zzf;
            iZzf = zzf(iZzd9, iZzd10);
            zzecVar.zzn(8);
            int iZzd11 = zzecVar.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                zzecVar.zzn(2);
            }
            if ((iZzd11 & 4) != 0) {
                zzecVar.zzn(2);
            }
            if (iZzd11 == 2) {
                zzecVar.zzn(2);
            }
            i = iZzd9 < 3 ? zzc[iZzd9] : -1;
            i10 = zze[iZzd11] + (zzecVar.zzp() ? 1 : 0);
            i11 = 1536;
            str = str2;
            i12 = i21;
        }
        return new zzabp(str, i17, i10, i, iZzf, i11, i12, null);
    }

    private static int zzf(int i, int i10) {
        int i11;
        if (i < 0 || i >= 3 || i10 < 0 || (i11 = i10 >> 1) >= 19) {
            return -1;
        }
        int i12 = zzc[i];
        if (i12 == 44100) {
            int i13 = zzg[i11] + (i10 & 1);
            return i13 + i13;
        }
        int i14 = zzf[i11];
        return i12 == 32000 ? i14 * 6 : i14 * 4;
    }
}
