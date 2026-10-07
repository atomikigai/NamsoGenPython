package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagk {
    public static final zzagi zza = new Object() { // from class: com.google.android.gms.internal.ads.zzagi
    };

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00df A[SYNTHETIC] */
    public static final zzbd zza(byte[] bArr, int i, zzagi zzagiVar, zzafm zzafmVar) {
        boolean z4;
        zzagj zzagjVar;
        int i10;
        int iZze;
        zzagl zzaglVarZzl;
        ArrayList arrayList = new ArrayList();
        zzed zzedVar = new zzed(bArr, i);
        boolean z10 = false;
        if (zzedVar.zzb() < 10) {
            zzdt.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzo = zzedVar.zzo();
            if (iZzo == 4801587) {
                int iZzm = zzedVar.zzm();
                zzedVar.zzM(1);
                int iZzm2 = zzedVar.zzm();
                int iZzl = zzedVar.zzl();
                if (iZzm != 2) {
                    if (iZzm == 3) {
                        if ((iZzm2 & 64) != 0) {
                            int iZzg = zzedVar.zzg();
                            zzedVar.zzM(iZzg);
                            iZzl -= iZzg + 4;
                        }
                    } else if (iZzm == 4) {
                        if ((iZzm2 & 64) != 0) {
                            int iZzl2 = zzedVar.zzl();
                            zzedVar.zzM(iZzl2 - 4);
                            iZzl -= iZzl2;
                        }
                        if ((iZzm2 & 16) != 0) {
                            iZzl -= 10;
                        }
                    } else {
                        q1.a.o(iZzm, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iZzm < 4) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    zzagjVar = new zzagj(iZzm, z4, iZzl);
                } else if ((iZzm2 & 64) != 0) {
                    zzdt.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzm < 4 || (iZzm2 & 128) == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    zzagjVar = new zzagj(iZzm, z4, iZzl);
                }
                if (zzagjVar == null) {
                    return null;
                }
                int iZzd = zzedVar.zzd();
                i10 = zzagjVar.zza == 2 ? 6 : 10;
                iZze = zzagjVar.zzc;
                if (zzagjVar.zzb) {
                    iZze = zze(zzedVar, zzagjVar.zzc);
                }
                zzedVar.zzK(iZzd + iZze);
                if (!zzj(zzedVar, zzagjVar.zza, i10, false)) {
                    if (zzagjVar.zza == 4 || !zzj(zzedVar, 4, i10, true)) {
                        q1.a.o(zzagjVar.zza, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z10 = true;
                }
                while (zzedVar.zzb() >= i10) {
                    zzaglVarZzl = zzl(zzagjVar.zza, zzedVar, z10, i10, zzagiVar);
                    if (zzaglVarZzl != null) {
                        arrayList.add(zzaglVarZzl);
                    }
                }
                return new zzbd(arrayList);
            }
            zzdt.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZzo))));
        }
        zzagjVar = null;
        if (zzagjVar == null) {
            return null;
        }
        int iZzd2 = zzedVar.zzd();
        if (zzagjVar.zza == 2) {
        }
        iZze = zzagjVar.zzc;
        if (zzagjVar.zzb) {
            iZze = zze(zzedVar, zzagjVar.zzc);
        }
        zzedVar.zzK(iZzd2 + iZze);
        if (!zzj(zzedVar, zzagjVar.zza, i10, false)) {
            if (zzagjVar.zza == 4) {
            }
            q1.a.o(zzagjVar.zza, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (zzedVar.zzb() >= i10) {
            zzaglVarZzl = zzl(zzagjVar.zza, zzedVar, z10, i10, zzagiVar);
            if (zzaglVarZzl != null) {
                arrayList.add(zzaglVarZzl);
            }
        }
        return new zzbd(arrayList);
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i10) {
        int iZzd = zzd(bArr, i);
        if (i10 == 0 || i10 == 3) {
            return iZzd;
        }
        while (true) {
            int length = bArr.length;
            if (iZzd >= length - 1) {
                return length;
            }
            int i11 = iZzd + 1;
            if ((iZzd - i) % 2 == 0 && bArr[i11] == 0) {
                return iZzd;
            }
            iZzd = zzd(bArr, i11);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzed zzedVar, int i) {
        byte[] bArrZzN = zzedVar.zzN();
        int iZzd = zzedVar.zzd();
        int i10 = iZzd;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iZzd + i) {
                return i;
            }
            if ((bArrZzN[i10] & 255) == 255 && bArrZzN[i11] == 0) {
                System.arraycopy(bArrZzN, i10 + 2, bArrZzN, i11, (i - (i10 - iZzd)) - 2);
                i--;
            }
            i10 = i11;
        }
    }

    private static zzfzo zzf(byte[] bArr, int i, int i10) {
        if (i10 >= bArr.length) {
            return zzfzo.zzo("");
        }
        zzfzl zzfzlVar = new zzfzl();
        int iZzc = zzc(bArr, i10, i);
        while (i10 < iZzc) {
            zzfzlVar.zzf(new String(bArr, i10, iZzc - i10, zzi(i)));
            i10 = zzb(i) + iZzc;
            iZzc = zzc(bArr, i10, i);
        }
        zzfzo zzfzoVarZzi = zzfzlVar.zzi();
        return zzfzoVarZzi.isEmpty() ? zzfzo.zzo("") : zzfzoVarZzi;
    }

    private static String zzg(byte[] bArr, int i, int i10, Charset charset) {
        return (i10 <= i || i10 > bArr.length) ? "" : new String(bArr, i, i10 - i, charset);
    }

    private static String zzh(int i, int i10, int i11, int i12, int i13) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    private static Charset zzi(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    private static boolean zzj(zzed zzedVar, int i, int i10, boolean z4) {
        boolean z10;
        int iZzo;
        long jZzo;
        int iZzq;
        int i11;
        int iZzd = zzedVar.zzd();
        while (true) {
            try {
                z10 = true;
                z10 = true;
                int i12 = 1;
                int i13 = 1;
                if (zzedVar.zzb() >= i10) {
                    if (i >= 3) {
                        iZzo = zzedVar.zzg();
                        jZzo = zzedVar.zzu();
                        iZzq = zzedVar.zzq();
                    } else {
                        iZzo = zzedVar.zzo();
                        jZzo = zzedVar.zzo();
                        iZzq = 0;
                    }
                    if (iZzo != 0 || jZzo != 0 || iZzq != 0) {
                        if (i != 4 || z4) {
                            if (i == 4) {
                                if ((iZzq & 64) != 0) {
                                    i12 = 0;
                                }
                                int i14 = i12;
                                i13 = iZzq & 1;
                                i11 = i14;
                            } else if (i == 3) {
                                if ((iZzq & 32) != 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if ((iZzq & 128) != 0) {
                                    i13 = 0;
                                }
                            } else {
                                i11 = 0;
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                i11 += 4;
                            }
                            if (jZzo >= i11 && zzedVar.zzb() >= jZzo) {
                                zzedVar.zzM((int) jZzo);
                            }
                        } else if ((8421504 & jZzo) == 0) {
                            long j4 = ((jZzo >> 16) & 255) << 14;
                            jZzo = ((jZzo >> 24) << 21) | j4 | (jZzo & 255) | (((jZzo >> 8) & 255) << 7);
                            if (i == 4) {
                                if ((iZzq & 64) != 0) {
                                    i12 = 0;
                                }
                                int i15 = i12;
                                i13 = iZzq & 1;
                                i11 = i15;
                            } else if (i == 3) {
                                if ((iZzq & 32) != 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if ((iZzq & 128) != 0) {
                                    i13 = 0;
                                }
                            } else {
                                i11 = 0;
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                i11 += 4;
                            }
                            if (jZzo >= i11) {
                                zzedVar.zzM((int) jZzo);
                            }
                        }
                        z10 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                zzedVar.zzL(iZzd);
                throw th;
            }
        }
        zzedVar.zzL(iZzd);
        return z10;
    }

    private static byte[] zzk(byte[] bArr, int i, int i10) {
        return i10 <= i ? zzen.zzf : Arrays.copyOfRange(bArr, i, i10);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0278  */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02a5 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a5, B:167:0x02e5, B:169:0x02fb, B:164:0x02c7, B:166:0x02df, B:185:0x0329, B:192:0x036c, B:195:0x03a1, B:198:0x03b2, B:199:0x03ba, B:201:0x03c0, B:203:0x03c7, B:204:0x03cb, B:212:0x03ec, B:216:0x0417, B:218:0x0422, B:219:0x0458, B:220:0x0465, B:222:0x046b, B:224:0x0472, B:225:0x0476, B:229:0x048c, B:237:0x049f, B:239:0x04c9, B:240:0x04d8, B:241:0x04e3), top: B:254:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:162:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a5, B:167:0x02e5, B:169:0x02fb, B:164:0x02c7, B:166:0x02df, B:185:0x0329, B:192:0x036c, B:195:0x03a1, B:198:0x03b2, B:199:0x03ba, B:201:0x03c0, B:203:0x03c7, B:204:0x03cb, B:212:0x03ec, B:216:0x0417, B:218:0x0422, B:219:0x0458, B:220:0x0465, B:222:0x046b, B:224:0x0472, B:225:0x0476, B:229:0x048c, B:237:0x049f, B:239:0x04c9, B:240:0x04d8, B:241:0x04e3), top: B:254:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:166:0x02df A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a5, B:167:0x02e5, B:169:0x02fb, B:164:0x02c7, B:166:0x02df, B:185:0x0329, B:192:0x036c, B:195:0x03a1, B:198:0x03b2, B:199:0x03ba, B:201:0x03c0, B:203:0x03c7, B:204:0x03cb, B:212:0x03ec, B:216:0x0417, B:218:0x0422, B:219:0x0458, B:220:0x0465, B:222:0x046b, B:224:0x0472, B:225:0x0476, B:229:0x048c, B:237:0x049f, B:239:0x04c9, B:240:0x04d8, B:241:0x04e3), top: B:254:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0319  */
    /* JADX WARN: Code duplicated, block: B:186:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0362  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:230:0x0491 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x0493  */
    /* JADX WARN: Code duplicated, block: B:248:0x0503  */
    /* JADX WARN: Instruction removed from duplicated block: B:248:0x0503, please report this as an issue */
    private static zzagl zzl(int i, zzed zzedVar, boolean z4, int i10, zzagi zzagiVar) {
        int iZzp;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        zzagl zzaglVar;
        int i13;
        zzagl zzafzVar;
        zzagl zzagqVar;
        byte[] bArr;
        int iZzd;
        String strZza;
        int iZzm = zzedVar.zzm();
        int iZzm2 = zzedVar.zzm();
        int iZzm3 = zzedVar.zzm();
        int iZzm4 = i >= 3 ? zzedVar.zzm() : 0;
        if (i == 4) {
            iZzp = zzedVar.zzp();
            if (!z4) {
                iZzp = ((iZzp >> 24) << 21) | (iZzp & 255) | (((iZzp >> 8) & 255) << 7) | (((iZzp >> 16) & 255) << 14);
            }
        } else {
            iZzp = i == 3 ? zzedVar.zzp() : zzedVar.zzo();
        }
        int iZzq = i >= 3 ? zzedVar.zzq() : 0;
        if (iZzm == 0 && iZzm2 == 0 && iZzm3 == 0 && iZzm4 == 0 && iZzp == 0 && iZzq == 0) {
            zzedVar.zzL(zzedVar.zze());
            return null;
        }
        int iZzd2 = zzedVar.zzd() + iZzp;
        String str = "Id3Decoder";
        if (iZzd2 > zzedVar.zze()) {
            zzdt.zzf("Id3Decoder", "Frame size exceeds remaining tag data");
            zzedVar.zzL(zzedVar.zze());
            return null;
        }
        if (zzagiVar != null) {
            zzedVar.zzL(iZzd2);
            return null;
        }
        if (i == 3) {
            int i14 = iZzq & 64;
            i11 = (iZzq & 128) != 0 ? 1 : 0;
            iZzm = 0;
            z11 = i14 != 0;
            z10 = (iZzq & 32) != 0;
            i12 = i11;
        } else if (i == 4) {
            boolean z12 = (iZzq & 64) != 0;
            int i15 = (iZzq & 8) != 0 ? 1 : 0;
            z11 = (iZzq & 4) != 0;
            iZzm = (iZzq & 2) != 0 ? 1 : 0;
            i12 = iZzq & 1;
            int i16 = i15;
            z10 = z12;
            i11 = i16;
        } else {
            i11 = 0;
            i12 = 0;
            z10 = false;
            z11 = false;
            iZzm = 0;
        }
        if (i11 != 0 || z11) {
            zzdt.zzf("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzedVar.zzL(iZzd2);
            return null;
        }
        if (z10) {
            zzedVar.zzM(1);
            iZzp--;
        }
        if (i12 != 0) {
            zzedVar.zzM(4);
            iZzp -= 4;
        }
        if (iZzm != 0) {
            iZzp = zze(zzedVar, iZzp);
        }
        try {
            try {
                if (iZzm == 84 && iZzm2 == 88 && iZzm3 == 88 && (i == 2 || iZzm4 == 88)) {
                    if (iZzp <= 0) {
                        iZzm = iZzm;
                        str = "Id3Decoder";
                        zzafzVar = null;
                    } else {
                        int iZzm5 = zzedVar.zzm();
                        int i17 = iZzp - 1;
                        byte[] bArr2 = new byte[i17];
                        zzedVar.zzH(bArr2, 0, i17);
                        int iZzc = zzc(bArr2, 0, iZzm5);
                        zzafzVar = new zzagu("TXXX", new String(bArr2, 0, iZzc, zzi(iZzm5)), zzf(bArr2, iZzm5, iZzc + zzb(iZzm5)));
                        str = "Id3Decoder";
                    }
                } else if (iZzm == 84) {
                    String strZzh = zzh(i, 84, iZzm2, iZzm3, iZzm4);
                    if (iZzp <= 0) {
                        iZzm = iZzm;
                        str = "Id3Decoder";
                        zzafzVar = null;
                    } else {
                        int iZzm6 = zzedVar.zzm();
                        int i18 = iZzp - 1;
                        byte[] bArr3 = new byte[i18];
                        zzedVar.zzH(bArr3, 0, i18);
                        zzafzVar = new zzagu(strZzh, null, zzf(bArr3, iZzm6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iZzm == 87) {
                        if (iZzm2 != 88 || iZzm3 != 88 || (i != 2 && iZzm4 != 88)) {
                            i13 = 87;
                        }
                        if (iZzp <= 0) {
                            iZzm = iZzm;
                            str = "Id3Decoder";
                            zzafzVar = null;
                        } else {
                            int iZzm7 = zzedVar.zzm();
                            int i19 = iZzp - 1;
                            byte[] bArr4 = new byte[i19];
                            zzedVar.zzH(bArr4, 0, i19);
                            int iZzc2 = zzc(bArr4, 0, iZzm7);
                            String str2 = new String(bArr4, 0, iZzc2, zzi(iZzm7));
                            int iZzb = iZzc2 + zzb(iZzm7);
                            zzafzVar = new zzagw("WXXX", str2, zzg(bArr4, iZzb, zzd(bArr4, iZzb), StandardCharsets.ISO_8859_1));
                            str = "Id3Decoder";
                        }
                    } else {
                        i13 = iZzm;
                    }
                    if (i13 == 87) {
                        String strZzh2 = zzh(i, 87, iZzm2, iZzm3, iZzm4);
                        byte[] bArr5 = new byte[iZzp];
                        zzedVar.zzH(bArr5, 0, iZzp);
                        zzafzVar = new zzagw(strZzh2, null, new String(bArr5, 0, zzd(bArr5, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i13 == 80) {
                            if (iZzm2 == 82 && iZzm3 == 73 && iZzm4 == 86) {
                                byte[] bArr6 = new byte[iZzp];
                                zzedVar.zzH(bArr6, 0, iZzp);
                                int iZzd3 = zzd(bArr6, 0);
                                zzafzVar = new zzags(new String(bArr6, 0, iZzd3, StandardCharsets.ISO_8859_1), zzk(bArr6, iZzd3 + 1, iZzp));
                            } else {
                                i13 = 80;
                            }
                        }
                        try {
                            if (i13 != 71) {
                                try {
                                    if (i == 2) {
                                        if (i13 != 80 && iZzm2 == 73 && iZzm3 == 67) {
                                            int iZzm8 = zzedVar.zzm();
                                            Charset charsetZzi = zzi(iZzm8);
                                            int i20 = iZzp - 1;
                                            bArr = new byte[i20];
                                            zzedVar.zzH(bArr, 0, i20);
                                            if (i == 2) {
                                                strZza = "image/".concat(String.valueOf(zzfwa.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strZza)) {
                                                    strZza = "image/jpeg";
                                                }
                                                iZzd = 2;
                                            } else {
                                                iZzd = zzd(bArr, 0);
                                                strZza = zzfwa.zza(new String(bArr, 0, iZzd, StandardCharsets.ISO_8859_1));
                                                if (strZza.indexOf(47) == -1) {
                                                    strZza = "image/".concat(strZza);
                                                }
                                            }
                                            int i21 = bArr[iZzd + 1] & 255;
                                            int i22 = iZzd + 2;
                                            int iZzc3 = zzc(bArr, i22, iZzm8);
                                            iZzm = iZzm;
                                            zzafzVar = new zzafx(strZza, new String(bArr, i22, iZzc3 - i22, charsetZzi), i21, zzk(bArr, iZzc3 + zzb(iZzm8), i20));
                                        } else {
                                            iZzm = iZzm;
                                            if (i13 == 67 || iZzm2 != 79 || iZzm3 != 77 || (iZzm4 != 77 && i != 2)) {
                                                if (i13 != 67 && iZzm2 == 72 && iZzm3 == 65 && iZzm4 == 80) {
                                                    int iZzd4 = zzedVar.zzd();
                                                    int iZzd5 = zzd(zzedVar.zzN(), iZzd4);
                                                    String str3 = new String(zzedVar.zzN(), iZzd4, iZzd5 - iZzd4, StandardCharsets.ISO_8859_1);
                                                    zzedVar.zzL(iZzd5 + 1);
                                                    int iZzg = zzedVar.zzg();
                                                    int iZzg2 = zzedVar.zzg();
                                                    long jZzu = zzedVar.zzu();
                                                    if (jZzu == 4294967295L) {
                                                        jZzu = -1;
                                                    }
                                                    long j4 = jZzu;
                                                    long jZzu2 = zzedVar.zzu();
                                                    if (jZzu2 == 4294967295L) {
                                                        jZzu2 = -1;
                                                    }
                                                    long j10 = jZzu2;
                                                    ArrayList arrayList = new ArrayList();
                                                    int i23 = iZzd4 + iZzp;
                                                    while (zzedVar.zzd() < i23) {
                                                        zzagl zzaglVarZzl = zzl(i, zzedVar, z4, i10, null);
                                                        if (zzaglVarZzl != null) {
                                                            arrayList.add(zzaglVarZzl);
                                                        }
                                                    }
                                                    zzagqVar = new zzagb(str3, iZzg, iZzg2, j4, j10, (zzagl[]) arrayList.toArray(new zzagl[0]));
                                                } else if (i13 != 67 && iZzm2 == 84 && iZzm3 == 79 && iZzm4 == 67) {
                                                    int iZzd6 = zzedVar.zzd();
                                                    int iZzd7 = zzd(zzedVar.zzN(), iZzd6);
                                                    String str4 = new String(zzedVar.zzN(), iZzd6, iZzd7 - iZzd6, StandardCharsets.ISO_8859_1);
                                                    zzedVar.zzL(iZzd7 + 1);
                                                    int iZzm9 = zzedVar.zzm();
                                                    boolean z13 = (iZzm9 & 2) != 0;
                                                    int i24 = iZzm9 & 1;
                                                    int iZzm10 = zzedVar.zzm();
                                                    String[] strArr = new String[iZzm10];
                                                    int i25 = 0;
                                                    while (i25 < iZzm10) {
                                                        int iZzd8 = zzedVar.zzd();
                                                        int i26 = iZzd6;
                                                        int iZzd9 = zzd(zzedVar.zzN(), iZzd8);
                                                        String[] strArr2 = strArr;
                                                        strArr2[i25] = new String(zzedVar.zzN(), iZzd8, iZzd9 - iZzd8, StandardCharsets.ISO_8859_1);
                                                        zzedVar.zzL(iZzd9 + 1);
                                                        i25++;
                                                        iZzd6 = i26;
                                                        iZzm10 = iZzm10;
                                                        str4 = str4;
                                                        strArr = strArr2;
                                                    }
                                                    int i27 = iZzd6;
                                                    String str5 = str4;
                                                    String[] strArr3 = strArr;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int i28 = i27 + iZzp;
                                                    while (zzedVar.zzd() < i28) {
                                                        zzagl zzaglVarZzl2 = zzl(i, zzedVar, z4, i10, null);
                                                        if (zzaglVarZzl2 != null) {
                                                            arrayList2.add(zzaglVarZzl2);
                                                        }
                                                    }
                                                    zzagqVar = new zzagd(str5, z13, 1 == i24, strArr3, (zzagl[]) arrayList2.toArray(new zzagl[0]));
                                                } else if (i13 != 77 && iZzm2 == 76 && iZzm3 == 76 && iZzm4 == 84) {
                                                    int iZzq2 = zzedVar.zzq();
                                                    int iZzo = zzedVar.zzo();
                                                    int iZzo2 = zzedVar.zzo();
                                                    int iZzm11 = zzedVar.zzm();
                                                    int iZzm12 = zzedVar.zzm();
                                                    zzec zzecVar = new zzec();
                                                    zzecVar.zzj(zzedVar);
                                                    int i29 = ((iZzp - 10) * 8) / (iZzm11 + iZzm12);
                                                    int[] iArr = new int[i29];
                                                    int[] iArr2 = new int[i29];
                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                        int iZzd10 = zzecVar.zzd(iZzm11);
                                                        int iZzd11 = zzecVar.zzd(iZzm12);
                                                        iArr[i30] = iZzd10;
                                                        iArr2[i30] = iZzd11;
                                                    }
                                                    zzagqVar = new zzagq(iZzq2, iZzo, iZzo2, iArr, iArr2);
                                                } else {
                                                    String strZzh3 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                    byte[] bArr7 = new byte[iZzp];
                                                    zzedVar.zzH(bArr7, 0, iZzp);
                                                    zzafzVar = new zzafz(strZzh3, bArr7);
                                                }
                                                zzafzVar = zzagqVar;
                                            } else if (iZzp < 4) {
                                                zzafzVar = null;
                                            } else {
                                                int iZzm13 = zzedVar.zzm();
                                                Charset charsetZzi2 = zzi(iZzm13);
                                                byte[] bArr8 = new byte[3];
                                                zzedVar.zzH(bArr8, 0, 3);
                                                String str6 = new String(bArr8, 0, 3);
                                                int i31 = iZzp - 4;
                                                byte[] bArr9 = new byte[i31];
                                                zzedVar.zzH(bArr9, 0, i31);
                                                int iZzc4 = zzc(bArr9, 0, iZzm13);
                                                String str7 = new String(bArr9, 0, iZzc4, charsetZzi2);
                                                int iZzb2 = iZzc4 + zzb(iZzm13);
                                                zzafzVar = new zzagf(str6, str7, zzg(bArr9, iZzb2, zzc(bArr9, iZzb2, iZzm13), charsetZzi2));
                                            }
                                        }
                                    } else if (i13 != 65 && iZzm2 == 80 && iZzm3 == 73 && iZzm4 == 67) {
                                        int iZzm14 = zzedVar.zzm();
                                        Charset charsetZzi3 = zzi(iZzm14);
                                        int i210 = iZzp - 1;
                                        bArr = new byte[i210];
                                        zzedVar.zzH(bArr, 0, i210);
                                        if (i == 2) {
                                            strZza = "image/".concat(String.valueOf(zzfwa.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                            if ("image/jpg".equals(strZza)) {
                                                strZza = "image/jpeg";
                                            }
                                            iZzd = 2;
                                        } else {
                                            iZzd = zzd(bArr, 0);
                                            strZza = zzfwa.zza(new String(bArr, 0, iZzd, StandardCharsets.ISO_8859_1));
                                            if (strZza.indexOf(47) == -1) {
                                                strZza = "image/".concat(strZza);
                                            }
                                        }
                                        int i211 = bArr[iZzd + 1] & 255;
                                        int i212 = iZzd + 2;
                                        int iZzc5 = zzc(bArr, i212, iZzm14);
                                        iZzm = iZzm;
                                        zzafzVar = new zzafx(strZza, new String(bArr, i212, iZzc5 - i212, charsetZzi3), i211, zzk(bArr, iZzc5 + zzb(iZzm14), i210));
                                    } else {
                                        iZzm = iZzm;
                                        if (i13 == 67) {
                                            if (i13 != 67) {
                                                if (i13 != 67) {
                                                    if (i13 != 77) {
                                                    }
                                                    String strZzh4 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                    byte[] bArr10 = new byte[iZzp];
                                                    zzedVar.zzH(bArr10, 0, iZzp);
                                                    zzafzVar = new zzafz(strZzh4, bArr10);
                                                } else {
                                                    if (i13 != 77) {
                                                    }
                                                    String strZzh5 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                    byte[] bArr11 = new byte[iZzp];
                                                    zzedVar.zzH(bArr11, 0, iZzp);
                                                    zzafzVar = new zzafz(strZzh5, bArr11);
                                                }
                                            } else if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strZzh6 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr12 = new byte[iZzp];
                                                zzedVar.zzH(bArr12, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh6, bArr12);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strZzh7 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr13 = new byte[iZzp];
                                                zzedVar.zzH(bArr13, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh7, bArr13);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strZzh8 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr14 = new byte[iZzp];
                                                zzedVar.zzH(bArr14, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh8, bArr14);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strZzh9 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr15 = new byte[iZzp];
                                                zzedVar.zzH(bArr15, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh9, bArr15);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh10 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr16 = new byte[iZzp];
                                            zzedVar.zzH(bArr16, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh10, bArr16);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh11 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr17 = new byte[iZzp];
                                            zzedVar.zzH(bArr17, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh11, bArr17);
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    zzedVar.zzL(iZzd2);
                                    zzaglVar = null;
                                } catch (OutOfMemoryError e4) {
                                    e = e4;
                                    zzedVar.zzL(iZzd2);
                                    zzaglVar = null;
                                }
                                if (zzaglVar == null) {
                                    zzdt.zzg(str, "Failed to decode frame: id=" + zzh(i, iZzm, iZzm2, iZzm3, iZzm4) + ", frameSize=" + iZzp, e);
                                }
                                return zzaglVar;
                            }
                            if (iZzm2 != 69 || iZzm3 != 79) {
                                i13 = 71;
                                if (i == 2) {
                                    if (i13 != 80) {
                                    }
                                    iZzm = iZzm;
                                    if (i13 == 67) {
                                        if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strZzh12 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr18 = new byte[iZzp];
                                                zzedVar.zzH(bArr18, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh12, bArr18);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strZzh13 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr19 = new byte[iZzp];
                                                zzedVar.zzH(bArr19, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh13, bArr19);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh14 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr110 = new byte[iZzp];
                                            zzedVar.zzH(bArr110, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh14, bArr110);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh15 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr111 = new byte[iZzp];
                                            zzedVar.zzH(bArr111, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh15, bArr111);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh16 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr112 = new byte[iZzp];
                                            zzedVar.zzH(bArr112, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh16, bArr112);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh17 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr113 = new byte[iZzp];
                                            zzedVar.zzH(bArr113, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh17, bArr113);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 77) {
                                        }
                                        String strZzh18 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr114 = new byte[iZzp];
                                        zzedVar.zzH(bArr114, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh18, bArr114);
                                    } else {
                                        if (i13 != 77) {
                                        }
                                        String strZzh19 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr115 = new byte[iZzp];
                                        zzedVar.zzH(bArr115, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh19, bArr115);
                                    }
                                } else {
                                    if (i13 != 65) {
                                    }
                                    iZzm = iZzm;
                                    if (i13 == 67) {
                                        if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strZzh110 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr116 = new byte[iZzp];
                                                zzedVar.zzH(bArr116, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh110, bArr116);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strZzh111 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr117 = new byte[iZzp];
                                                zzedVar.zzH(bArr117, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh111, bArr117);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh112 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr118 = new byte[iZzp];
                                            zzedVar.zzH(bArr118, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh112, bArr118);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh113 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr119 = new byte[iZzp];
                                            zzedVar.zzH(bArr119, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh113, bArr119);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh114 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr1110 = new byte[iZzp];
                                            zzedVar.zzH(bArr1110, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh114, bArr1110);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh115 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr1111 = new byte[iZzp];
                                            zzedVar.zzH(bArr1111, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh115, bArr1111);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 77) {
                                        }
                                        String strZzh116 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr1112 = new byte[iZzp];
                                        zzedVar.zzH(bArr1112, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh116, bArr1112);
                                    } else {
                                        if (i13 != 77) {
                                        }
                                        String strZzh117 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr1113 = new byte[iZzp];
                                        zzedVar.zzH(bArr1113, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh117, bArr1113);
                                    }
                                }
                                if (zzaglVar == null) {
                                    zzdt.zzg(str, "Failed to decode frame: id=" + zzh(i, iZzm, iZzm2, iZzm3, iZzm4) + ", frameSize=" + iZzp, e);
                                }
                                return zzaglVar;
                            }
                            if (iZzm4 != 66 && i != 2) {
                                i13 = 71;
                                if (i == 2) {
                                    if (i13 != 80) {
                                    }
                                    iZzm = iZzm;
                                    if (i13 == 67) {
                                        if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strZzh118 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr1114 = new byte[iZzp];
                                                zzedVar.zzH(bArr1114, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh118, bArr1114);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strZzh119 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr1115 = new byte[iZzp];
                                                zzedVar.zzH(bArr1115, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh119, bArr1115);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh1110 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr1116 = new byte[iZzp];
                                            zzedVar.zzH(bArr1116, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh1110, bArr1116);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh1111 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr1117 = new byte[iZzp];
                                            zzedVar.zzH(bArr1117, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh1111, bArr1117);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh1112 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr1118 = new byte[iZzp];
                                            zzedVar.zzH(bArr1118, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh1112, bArr1118);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh1113 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr1119 = new byte[iZzp];
                                            zzedVar.zzH(bArr1119, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh1113, bArr1119);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 77) {
                                        }
                                        String strZzh1114 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr11110 = new byte[iZzp];
                                        zzedVar.zzH(bArr11110, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh1114, bArr11110);
                                    } else {
                                        if (i13 != 77) {
                                        }
                                        String strZzh1115 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr11111 = new byte[iZzp];
                                        zzedVar.zzH(bArr11111, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh1115, bArr11111);
                                    }
                                } else {
                                    if (i13 != 65) {
                                    }
                                    iZzm = iZzm;
                                    if (i13 == 67) {
                                        if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strZzh1116 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr11112 = new byte[iZzp];
                                                zzedVar.zzH(bArr11112, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh1116, bArr11112);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strZzh1117 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                                byte[] bArr11113 = new byte[iZzp];
                                                zzedVar.zzH(bArr11113, 0, iZzp);
                                                zzafzVar = new zzafz(strZzh1117, bArr11113);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh1118 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr11114 = new byte[iZzp];
                                            zzedVar.zzH(bArr11114, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh1118, bArr11114);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh1119 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr11115 = new byte[iZzp];
                                            zzedVar.zzH(bArr11115, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh1119, bArr11115);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strZzh11110 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr11116 = new byte[iZzp];
                                            zzedVar.zzH(bArr11116, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh11110, bArr11116);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strZzh11111 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                            byte[] bArr11117 = new byte[iZzp];
                                            zzedVar.zzH(bArr11117, 0, iZzp);
                                            zzafzVar = new zzafz(strZzh11111, bArr11117);
                                        }
                                    } else if (i13 != 67) {
                                        if (i13 != 77) {
                                        }
                                        String strZzh11112 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr11118 = new byte[iZzp];
                                        zzedVar.zzH(bArr11118, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh11112, bArr11118);
                                    } else {
                                        if (i13 != 77) {
                                        }
                                        String strZzh11113 = zzh(i, i13, iZzm2, iZzm3, iZzm4);
                                        byte[] bArr11119 = new byte[iZzp];
                                        zzedVar.zzH(bArr11119, 0, iZzp);
                                        zzafzVar = new zzafz(strZzh11113, bArr11119);
                                    }
                                }
                                if (zzaglVar == null) {
                                    zzdt.zzg(str, "Failed to decode frame: id=" + zzh(i, iZzm, iZzm2, iZzm3, iZzm4) + ", frameSize=" + iZzp, e);
                                }
                                return zzaglVar;
                            }
                            try {
                                int iZzm15 = zzedVar.zzm();
                                Charset charsetZzi4 = zzi(iZzm15);
                                int i32 = iZzp - 1;
                                byte[] bArr20 = new byte[i32];
                                zzedVar.zzH(bArr20, 0, i32);
                                int iZzd12 = zzd(bArr20, 0);
                                str = "Id3Decoder";
                                String strZze = zzbg.zze(new String(bArr20, 0, iZzd12, StandardCharsets.ISO_8859_1));
                                int i33 = iZzd12 + 1;
                                int iZzc6 = zzc(bArr20, i33, iZzm15);
                                String strZzg = zzg(bArr20, i33, iZzc6, charsetZzi4);
                                int iZzb3 = iZzc6 + zzb(iZzm15);
                                int iZzc7 = zzc(bArr20, iZzb3, iZzm15);
                                iZzm = iZzm;
                                zzafzVar = new zzagh(strZze, strZzg, zzg(bArr20, iZzb3, iZzc7, charsetZzi4), zzk(bArr20, iZzc7 + zzb(iZzm15), i32));
                            } catch (Exception e10) {
                                e = e10;
                                str = "Id3Decoder";
                                iZzm = iZzm;
                                zzedVar.zzL(iZzd2);
                                zzaglVar = null;
                            } catch (OutOfMemoryError e11) {
                                e = e11;
                                str = "Id3Decoder";
                                iZzm = iZzm;
                                zzedVar.zzL(iZzd2);
                                zzaglVar = null;
                            }
                        } catch (Exception e12) {
                            e = e12;
                        } catch (OutOfMemoryError e13) {
                            e = e13;
                        }
                    }
                    str = "Id3Decoder";
                }
                zzedVar.zzL(iZzd2);
                zzaglVar = zzafzVar;
                e = null;
            } catch (Throwable th) {
                zzedVar.zzL(iZzd2);
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            iZzm = iZzm;
            str = "Id3Decoder";
            zzedVar.zzL(iZzd2);
            zzaglVar = null;
            if (zzaglVar == null) {
                zzdt.zzg(str, "Failed to decode frame: id=" + zzh(i, iZzm, iZzm2, iZzm3, iZzm4) + ", frameSize=" + iZzp, e);
            }
            return zzaglVar;
        } catch (OutOfMemoryError e15) {
            e = e15;
            iZzm = iZzm;
            str = "Id3Decoder";
            zzedVar.zzL(iZzd2);
            zzaglVar = null;
            if (zzaglVar == null) {
                zzdt.zzg(str, "Failed to decode frame: id=" + zzh(i, iZzm, iZzm2, iZzm3, iZzm4) + ", frameSize=" + iZzp, e);
            }
            return zzaglVar;
        }
        if (zzaglVar == null) {
            zzdt.zzg(str, "Failed to decode frame: id=" + zzh(i, iZzm, iZzm2, iZzm3, iZzm4) + ", frameSize=" + iZzp, e);
        }
        return zzaglVar;
    }
}
