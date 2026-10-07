package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzain {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        int i = zzen.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    public static zzbd zzb(zzes zzesVar) {
        zzer zzerVar;
        zzet zzetVarZzb = zzesVar.zzb(1751411826);
        zzet zzetVarZzb2 = zzesVar.zzb(1801812339);
        zzet zzetVarZzb3 = zzesVar.zzb(1768715124);
        if (zzetVarZzb != null && zzetVarZzb2 != null && zzetVarZzb3 != null && zzi(zzetVarZzb.zza) == 1835299937) {
            zzed zzedVar = zzetVarZzb2.zza;
            zzedVar.zzL(12);
            int iZzg = zzedVar.zzg();
            String[] strArr = new String[iZzg];
            for (int i = 0; i < iZzg; i++) {
                int iZzg2 = zzedVar.zzg();
                zzedVar.zzM(4);
                strArr[i] = zzedVar.zzB(iZzg2 - 8, StandardCharsets.UTF_8);
            }
            zzed zzedVar2 = zzetVarZzb3.zza;
            zzedVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzedVar2.zzb() > 8) {
                int iZzg3 = zzedVar2.zzg() + zzedVar2.zzd();
                int iZzg4 = zzedVar2.zzg() - 1;
                if (iZzg4 < 0 || iZzg4 >= iZzg) {
                    q1.a.o(iZzg4, "Skipped metadata with unknown key index: ", "BoxParsers");
                } else {
                    String str = strArr[iZzg4];
                    while (true) {
                        int iZzd = zzedVar2.zzd();
                        if (iZzd >= iZzg3) {
                            zzerVar = null;
                            break;
                        }
                        int iZzg5 = zzedVar2.zzg();
                        if (zzedVar2.zzg() == 1684108385) {
                            int iZzg6 = zzedVar2.zzg();
                            int iZzg7 = zzedVar2.zzg();
                            int i10 = iZzg5 - 16;
                            byte[] bArr = new byte[i10];
                            zzedVar2.zzH(bArr, 0, i10);
                            zzerVar = new zzer(str, bArr, iZzg7, iZzg6);
                            break;
                        }
                        zzedVar2.zzL(iZzd + iZzg5);
                    }
                    if (zzerVar != null) {
                        arrayList.add(zzerVar);
                    }
                }
                zzedVar2.zzL(iZzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzbd(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static zzbd zzc(zzet zzetVar) {
        int iZzn;
        zzed zzedVar = zzetVar.zza;
        zzedVar.zzL(8);
        zzbd zzbdVar = new zzbd(-9223372036854775807L, new zzbc[0]);
        while (zzedVar.zzb() >= 8) {
            int iZzd = zzedVar.zzd();
            int iZzg = zzedVar.zzg() + iZzd;
            int iZzg2 = zzedVar.zzg();
            zzbd zzbdVar2 = null;
            if (iZzg2 == 1835365473) {
                zzedVar.zzL(iZzd);
                zzedVar.zzM(8);
                zzg(zzedVar);
                while (zzedVar.zzd() < iZzg) {
                    int iZzd2 = zzedVar.zzd();
                    int iZzg3 = zzedVar.zzg() + iZzd2;
                    if (zzedVar.zzg() == 1768715124) {
                        zzedVar.zzL(iZzd2);
                        zzedVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzedVar.zzd() < iZzg3) {
                            zzbc zzbcVarZza = zzaiv.zza(zzedVar);
                            if (zzbcVarZza != null) {
                                arrayList.add(zzbcVarZza);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbdVar2 = new zzbd(arrayList);
                            break;
                        }
                        break;
                    }
                    zzedVar.zzL(iZzg3);
                }
                zzbdVar = zzbdVar.zzd(zzbdVar2);
            } else if (iZzg2 == 1936553057) {
                zzedVar.zzL(iZzd);
                zzedVar.zzM(12);
                while (zzedVar.zzd() < iZzg) {
                    int iZzd3 = zzedVar.zzd();
                    int iZzg4 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1935766900) {
                        if (iZzg4 < 16) {
                            break;
                        }
                        zzedVar.zzM(4);
                        int i = -1;
                        int i10 = 0;
                        for (int i11 = 0; i11 < 2; i11++) {
                            int iZzm = zzedVar.zzm();
                            int iZzm2 = zzedVar.zzm();
                            if (iZzm == 0) {
                                i = iZzm2;
                            } else if (iZzm == 1) {
                                i10 = iZzm2;
                            }
                        }
                        if (i == 12) {
                            iZzn = 240;
                        } else if (i == 13) {
                            iZzn = 120;
                        } else if (i == 21 && zzedVar.zzb() >= 8 && zzedVar.zzd() + 8 <= iZzg) {
                            int iZzg5 = zzedVar.zzg();
                            int iZzg6 = zzedVar.zzg();
                            if (iZzg5 < 12 || iZzg6 != 1936877170) {
                                iZzn = -2147483647;
                            } else {
                                iZzn = zzedVar.zzn();
                            }
                        } else {
                            iZzn = -2147483647;
                        }
                        if (iZzn == -2147483647) {
                            break;
                        }
                        zzbdVar2 = new zzbd(-9223372036854775807L, new zzahg(iZzn, i10));
                        break;
                    }
                    zzedVar.zzL(iZzd3 + iZzg4);
                }
                zzbdVar = zzbdVar.zzd(zzbdVar2);
            } else if (iZzg2 == -1451722374) {
                zzbdVar = zzbdVar.zzd(zzk(zzedVar));
            }
            zzedVar.zzL(iZzg);
        }
        return zzbdVar;
    }

    public static zzfb zzd(zzed zzedVar) {
        long jZzt;
        long jZzt2;
        zzedVar.zzL(8);
        if (zza(zzedVar.zzg()) == 0) {
            jZzt = zzedVar.zzu();
            jZzt2 = zzedVar.zzu();
        } else {
            jZzt = zzedVar.zzt();
            jZzt2 = zzedVar.zzt();
        }
        return new zzfb(jZzt, jZzt2, zzedVar.zzu());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0246  */
    /* JADX WARN: Code duplicated, block: B:105:0x0263 A[DONT_INVERT, LOOP:12: B:105:0x0263->B:109:0x026e, LOOP_START, PHI: r16
      0x0263: PHI (r16v7 int) = (r16v2 int), (r16v8 int) binds: [B:104:0x0261, B:109:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0265  */
    /* JADX WARN: Code duplicated, block: B:109:0x026e A[LOOP:12: B:105:0x0263->B:109:0x026e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0274 A[EDGE_INSN: B:110:0x0274->B:111:0x0276 BREAK  A[LOOP:12: B:105:0x0263->B:109:0x026e]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0278 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x028c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0294  */
    /* JADX WARN: Code duplicated, block: B:121:0x029f  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:135:0x031e  */
    /* JADX WARN: Code duplicated, block: B:137:0x032e  */
    /* JADX WARN: Code duplicated, block: B:139:0x033a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0375  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b9 A[PHI: r11
      0x03b9: PHI (r11v25 long) = (r11v24 long), (r11v26 long) binds: [B:152:0x03ac, B:155:0x03b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:171:0x0408 A[LOOP:4: B:169:0x0405->B:171:0x0408, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0430  */
    /* JADX WARN: Code duplicated, block: B:177:0x0436  */
    /* JADX WARN: Code duplicated, block: B:178:0x0438  */
    /* JADX WARN: Code duplicated, block: B:182:0x044d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0458  */
    /* JADX WARN: Code duplicated, block: B:187:0x0481  */
    /* JADX WARN: Code duplicated, block: B:192:0x0491  */
    /* JADX WARN: Code duplicated, block: B:193:0x0493  */
    /* JADX WARN: Code duplicated, block: B:195:0x0499  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:200:0x04af  */
    /* JADX WARN: Code duplicated, block: B:203:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:204:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:208:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:218:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:224:0x051b  */
    /* JADX WARN: Code duplicated, block: B:225:0x0523  */
    /* JADX WARN: Code duplicated, block: B:228:0x052c  */
    /* JADX WARN: Code duplicated, block: B:242:0x04a8 A[EDGE_INSN: B:242:0x04a8->B:197:0x04a8 BREAK  A[LOOP:5: B:180:0x0446->B:196:0x049e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x048c A[ADDED_TO_REGION, EDGE_INSN: B:245:0x048c->B:190:0x048c BREAK  A[LOOP:6: B:185:0x047b->B:189:0x0486], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0532 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba A[LOOP:10: B:68:0x01b2->B:71:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0 A[ADDED_TO_REGION, LOOP:11: B:79:0x01f0->B:81:0x01f4, LOOP_START, PHI: r0 r16 r26
      0x01f0: PHI (r0v25 int) = (r0v7 int), (r0v26 int) binds: [B:77:0x01ed, B:81:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r16v10 int) = (r16v2 int), (r16v11 int) binds: [B:77:0x01ed, B:81:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r26v3 int) = (r26v1 int), (r26v7 int) binds: [B:77:0x01ed, B:81:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01f4 A[LOOP:11: B:79:0x01f0->B:81:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x020d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x021a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x0226  */
    /* JADX WARN: Code duplicated, block: B:98:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0239  */
    public static zzajh zze(zzaje zzajeVar, zzes zzesVar, zzadf zzadfVar) throws zzbh {
        zzaig zzaikVar;
        boolean z4;
        int iZzp;
        int iZzp2;
        int i;
        int iZzp3;
        int iZza;
        zzaig zzaigVar;
        long j4;
        long[] jArr;
        int[] iArrCopyOf;
        long[] jArr2;
        int[] iArr;
        int i10;
        zzed zzedVar;
        int i11;
        int iZzg;
        int i12;
        int i13;
        int i14;
        int iZzp4;
        long j10;
        long j11;
        long[] jArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr2;
        long j12;
        int i20;
        String str;
        long j13;
        boolean zZza;
        int i21;
        int i22;
        int iZzc;
        int i23;
        long[] jArr3;
        RoundingMode roundingMode;
        long jZzu;
        long[] jArr4;
        int i24;
        long j14;
        int[] iArr3;
        int[] iArr4;
        long[] jArr5;
        int i25;
        long[] jArr6;
        int length;
        boolean z10;
        long[] jArr7;
        int[] iArr5;
        int[] iArr6;
        int i26;
        boolean z11;
        int i27;
        int i28;
        long[] jArr8;
        int i29;
        int[] iArr7;
        int i30;
        boolean z12;
        boolean z13;
        long[] jArr9;
        int[] iArr8;
        int i31;
        int[] iArr9;
        long[] jArr10;
        int i32;
        long j15;
        long j16;
        int i33;
        int i34;
        boolean z14;
        long jZzu2;
        long j17;
        int[] iArr10;
        long j18;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z15;
        long j19;
        int i39;
        int length2;
        long j20;
        long jZzu3;
        long j21;
        long jZzu4;
        long jZzu5;
        zzet zzetVarZzb = zzesVar.zzb(1937011578);
        if (zzetVarZzb != null) {
            zzaikVar = new zzaij(zzetVarZzb, zzajeVar.zzf);
        } else {
            zzet zzetVarZzb2 = zzesVar.zzb(1937013298);
            if (zzetVarZzb2 == null) {
                throw zzbh.zza("Track has no sample table size information", null);
            }
            zzaikVar = new zzaik(zzetVarZzb2);
        }
        int iZzb = zzaikVar.zzb();
        if (iZzb == 0) {
            return new zzajh(zzajeVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        zzet zzetVarZzb3 = zzesVar.zzb(1937007471);
        if (zzetVarZzb3 == null) {
            zzetVarZzb3 = zzesVar.zzb(1668232756);
            zzetVarZzb3.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        zzet zzetVarZzb4 = zzesVar.zzb(1937011555);
        zzetVarZzb4.getClass();
        zzed zzedVar2 = zzetVarZzb4.zza;
        zzet zzetVarZzb5 = zzesVar.zzb(1937011827);
        zzetVarZzb5.getClass();
        zzed zzedVar3 = zzetVarZzb5.zza;
        zzet zzetVarZzb6 = zzesVar.zzb(1937011571);
        zzed zzedVar4 = zzetVarZzb6 != null ? zzetVarZzb6.zza : null;
        zzet zzetVarZzb7 = zzesVar.zzb(1668576371);
        zzed zzedVar5 = zzetVarZzb7 != null ? zzetVarZzb7.zza : null;
        zzaid zzaidVar = new zzaid(zzedVar2, zzetVarZzb3.zza, z4);
        zzedVar3.zzL(12);
        int iZzp5 = zzedVar3.zzp() - 1;
        int iZzp6 = zzedVar3.zzp();
        int iZzp7 = zzedVar3.zzp();
        if (zzedVar5 != null) {
            zzedVar5.zzL(12);
            iZzp = zzedVar5.zzp();
        } else {
            iZzp = 0;
        }
        if (zzedVar4 != null) {
            zzedVar4.zzL(12);
            iZzp2 = zzedVar4.zzp();
            if (iZzp2 > 0) {
                iZzp3 = zzedVar4.zzp() - 1;
                i = 0;
            } else {
                zzedVar4 = null;
                i = 0;
            }
            iZza = zzaikVar.zza();
            String str2 = zzajeVar.zzf.zzo;
            zzaigVar = zzaikVar;
            int i40 = iZzp2;
            if (iZza == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iZzp5 == 0)) {
                if (iZzp == 0 && i40 == 0) {
                    int i41 = zzaidVar.zza;
                    long[] jArr11 = new long[i41];
                    int[] iArr11 = new int[i41];
                    while (zzaidVar.zza()) {
                        int i42 = zzaidVar.zzb;
                        jArr11[i42] = zzaidVar.zzd;
                        iArr11[i42] = zzaidVar.zzc;
                    }
                    long j22 = iZzp7;
                    int i43 = 8192 / iZza;
                    int i44 = i;
                    int i45 = i44;
                    while (i44 < i41) {
                        int i46 = iArr11[i44];
                        int i47 = zzen.zza;
                        i45 += ((i46 + i43) - 1) / i43;
                        i44++;
                    }
                    jArrCopyOf = new long[i45];
                    iArr2 = new int[i45];
                    jArrCopyOf2 = new long[i45];
                    iArrCopyOf2 = new int[i45];
                    int i48 = i;
                    int i49 = i48;
                    i20 = i49;
                    int i50 = i20;
                    j4 = 0;
                    while (i48 < i41) {
                        int i51 = iArr11[i48];
                        int i52 = i50;
                        int i53 = i41;
                        int iMax = i20;
                        int i54 = i52;
                        long j23 = jArr11[i48];
                        long[] jArr12 = jArr11;
                        int i55 = i51;
                        while (i55 > 0) {
                            int iMin = Math.min(i43, i55);
                            jArrCopyOf[i54] = j23;
                            int i56 = i55;
                            int i57 = iZza * iMin;
                            iArr2[i54] = i57;
                            iMax = Math.max(iMax, i57);
                            jArrCopyOf2[i54] = ((long) i49) * j22;
                            iArrCopyOf2[i54] = 1;
                            j23 += (long) iArr2[i54];
                            i49 += iMin;
                            i55 = i56 - iMin;
                            i54++;
                            iZza = iZza;
                        }
                        i48++;
                        int i58 = i54;
                        i20 = iMax;
                        i41 = i53;
                        i50 = i58;
                        jArr11 = jArr12;
                    }
                    j12 = j22 * ((long) i49);
                } else {
                    j4 = 0;
                    iZzp5 = i;
                }
                jArr3 = jArrCopyOf;
                long j24 = zzajeVar.zzc;
                roundingMode = RoundingMode.FLOOR;
                jZzu = zzen.zzu(j12, 1000000L, j24, roundingMode);
                jArr4 = zzajeVar.zzh;
                if (jArr4 == null) {
                    zzen.zzF(jArrCopyOf2, 1000000L, zzajeVar.zzc);
                    return new zzajh(zzajeVar, jArr3, iArr2, i20, jArrCopyOf2, iArrCopyOf2, jZzu);
                }
                i24 = iZzb;
                j14 = j12;
                iArr3 = iArrCopyOf2;
                iArr4 = iArr2;
                jArr5 = jArrCopyOf2;
                i25 = i20;
                if (jArr4.length == 1 && zzajeVar.zzb == 1 && (length2 = jArr5.length) >= 2) {
                    long[] jArr13 = zzajeVar.zzi;
                    jArr13.getClass();
                    j20 = jArr13[i];
                    jZzu3 = zzen.zzu(jArr4[i], zzajeVar.zzc, zzajeVar.zzd, roundingMode) + j20;
                    int i59 = length2 - 1;
                    int i60 = i;
                    int iMax2 = Math.max(i60, Math.min(4, i59));
                    int iMax3 = Math.max(i60, Math.min(length2 - 4, i59));
                    j21 = jArr5[i60];
                    if (j21 <= j20 && j20 < jArr5[iMax2] && jArr5[iMax3] < jZzu3 && jZzu3 <= j14) {
                        jZzu4 = zzen.zzu(j20 - j21, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                        jZzu5 = zzen.zzu(j14 - jZzu3, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                        if (jZzu4 != j4) {
                            if (jZzu4 <= 2147483647L && jZzu5 <= 2147483647L) {
                                zzadfVar.zza = (int) jZzu4;
                                zzadfVar.zzb = (int) jZzu5;
                                zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                                return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                            }
                        } else if (jZzu5 != j4) {
                            jZzu4 = j4;
                            if (jZzu4 <= 2147483647L) {
                                zzadfVar.zza = (int) jZzu4;
                                zzadfVar.zzb = (int) jZzu5;
                                zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                                return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                            }
                        }
                        jArr3 = jArr3;
                        iArr4 = iArr4;
                    }
                }
                jArr6 = zzajeVar.zzh;
                length = jArr6.length;
                if (length == 1) {
                    if (jArr6[0] == j4) {
                        long[] jArr14 = zzajeVar.zzi;
                        jArr14.getClass();
                        j19 = jArr14[0];
                        for (i39 = 0; i39 < jArr5.length; i39++) {
                            jArr5[i39] = zzen.zzu(jArr5[i39] - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR);
                        }
                        return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(j14 - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR));
                    }
                    length = 1;
                }
                if (zzajeVar.zzb == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jArr7 = zzajeVar.zzi;
                iArr5 = new int[length];
                iArr6 = new int[length];
                jArr7.getClass();
                i26 = 0;
                z11 = false;
                i27 = 0;
                i28 = 0;
                while (true) {
                    jArr8 = zzajeVar.zzh;
                    i29 = i25;
                    if (i28 < jArr8.length) {
                        break;
                    }
                    iArr10 = iArr6;
                    long[] jArr15 = jArr7;
                    j18 = jArr15[i28];
                    if (j18 != -1) {
                        i35 = i28;
                        long jZzu6 = zzen.zzu(jArr8[i28], zzajeVar.zzc, zzajeVar.zzd, RoundingMode.FLOOR);
                        i36 = 1;
                        iArr5[i35] = zzen.zzd(jArr5, j18, true, true);
                        iArr10[i35] = zzen.zza(jArr5, j18 + jZzu6, z10, false);
                        while (true) {
                            i37 = iArr5[i35];
                            i38 = iArr10[i35];
                            if (i37 >= i38 || (iArr3[i37] & i36) != 0) {
                                break;
                            }
                            iArr5[i35] = i37 + 1;
                            i36 = 1;
                        }
                        int i61 = (i38 - i37) + i26;
                        if (i27 != i37) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i26 = i61;
                        z11 = z15 | z11;
                        i27 = i38;
                    } else {
                        i35 = i28;
                    }
                    jArr7 = jArr15;
                    i28 = i35 + 1;
                    iArr6 = iArr10;
                    i25 = i29;
                }
                iArr7 = iArr6;
                i30 = 0;
                if (i26 != i24) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12 | z11;
                if (z13) {
                    jArr9 = new long[i26];
                } else {
                    jArr9 = jArr3;
                }
                if (z13) {
                    iArr8 = new int[i26];
                } else {
                    iArr8 = iArr4;
                }
                if (true == z13) {
                    i31 = 0;
                } else {
                    i31 = i29;
                }
                if (z13) {
                    iArr9 = new int[i26];
                } else {
                    iArr9 = iArr3;
                }
                jArr10 = new long[i26];
                int i62 = i31;
                i32 = 0;
                j15 = j4;
                while (i30 < zzajeVar.zzh.length) {
                    j16 = zzajeVar.zzi[i30];
                    i33 = iArr5[i30];
                    i34 = iArr7[i30];
                    z14 = z13;
                    if (z13) {
                        int i63 = i34 - i33;
                        System.arraycopy(jArr3, i33, jArr9, i32, i63);
                        System.arraycopy(iArr4, i33, iArr8, i32, i63);
                        System.arraycopy(iArr3, i33, iArr9, i32, i63);
                    }
                    while (i33 < i34) {
                        long[] jArr16 = jArr3;
                        int[] iArr12 = iArr4;
                        long j25 = zzajeVar.zzd;
                        RoundingMode roundingMode2 = RoundingMode.FLOOR;
                        long jZzu7 = zzen.zzu(j15, 1000000L, j25, roundingMode2);
                        jZzu2 = zzen.zzu(jArr5[i33] - j16, 1000000L, zzajeVar.zzc, roundingMode2);
                        long[] jArr17 = jArr9;
                        if (zzajeVar.zzb != 1) {
                            j17 = j4;
                            jZzu2 = Math.max(j17, jZzu2);
                        } else {
                            j17 = j4;
                        }
                        jArr10[i32] = jZzu7 + jZzu2;
                        if (!z14 && iArr8[i32] > i62) {
                            i62 = iArr12[i33];
                        }
                        i32++;
                        i33++;
                        jArr3 = jArr16;
                        j4 = j17;
                        iArr4 = iArr12;
                        jArr9 = jArr17;
                        jArr5 = jArr5;
                    }
                    j15 += zzajeVar.zzh[i30];
                    i30++;
                    jArr3 = jArr3;
                    jArr9 = jArr9;
                    jArr5 = jArr5;
                    z13 = z14;
                }
                return new zzajh(zzajeVar, jArr9, iArr8, i62, jArr10, iArr9, zzen.zzu(j15, 1000000L, zzajeVar.zzd, RoundingMode.FLOOR));
            }
            j4 = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i10 = i40;
            zzedVar = zzedVar5;
            i11 = iZzp5;
            iZzg = i;
            i12 = iZzg;
            i13 = i12;
            i14 = i13;
            iZzp4 = i14;
            j10 = j4;
            j11 = j10;
            while (true) {
                if (i13 >= iZzb) {
                    jArrCopyOf = jArr;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf2 = iArr;
                    break;
                }
                j13 = j10;
                zZza = true;
                while (true) {
                    if (i14 != 0) {
                        i21 = i14;
                        break;
                    }
                    zZza = zzaidVar.zza();
                    if (!zZza) {
                        i21 = i;
                        break;
                    }
                    j13 = zzaidVar.zzd;
                    i14 = zzaidVar.zzc;
                    iZzb = iZzb;
                }
                i22 = iZzb;
                if (!zZza) {
                    zzdt.zzf("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i13);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i13);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i13);
                    iZzb = i13;
                    break;
                }
                if (zzedVar != null) {
                    while (iZzp4 == 0) {
                        if (iZzp <= 0) {
                            iZzp4 = i;
                            break;
                        }
                        iZzp--;
                        iZzp4 = zzedVar.zzp();
                        iZzg = zzedVar.zzg();
                    }
                    iZzp4--;
                }
                jArr[i13] = j13;
                iZzc = zzaigVar.zzc();
                iArrCopyOf[i13] = iZzc;
                if (iZzc > i12) {
                    i12 = iZzc;
                }
                int i64 = i21;
                jArr2[i13] = j11 + ((long) iZzg);
                if (zzedVar4 == null) {
                    i23 = 1;
                } else {
                    i23 = i;
                }
                iArr[i13] = i23;
                if (i13 == iZzp3) {
                    iArr[i13] = 1;
                    i10--;
                    if (i10 > 0) {
                        zzedVar4.getClass();
                        iZzp3 = zzedVar4.zzp() - 1;
                    }
                }
                j11 += (long) iZzp7;
                iZzp6--;
                if (iZzp6 == 0) {
                    if (i11 > 0) {
                        i11--;
                        iZzp6 = zzedVar3.zzp();
                        iZzp7 = zzedVar3.zzg();
                    } else {
                        iZzp6 = i;
                    }
                }
                long j26 = j13 + ((long) iArrCopyOf[i13]);
                i14 = i64 - 1;
                i13++;
                iZzb = i22;
                j10 = j26;
            }
            long j27 = j11 + ((long) iZzg);
            if (zzedVar == null) {
                i15 = 1;
                break;
            }
            while (true) {
                if (iZzp <= 0) {
                    i15 = 1;
                    break;
                }
                if (zzedVar.zzp() != 0) {
                    i15 = i;
                    break;
                }
                zzedVar.zzg();
                iZzp--;
            }
            if (i10 == 0) {
                if (iZzp6 == 0) {
                    if (i14 != 0) {
                        i18 = i;
                        iZzp6 = i18;
                    } else if (i11 != 0) {
                        i15 = i15;
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        iZzp6 = i16;
                        i17 = i11;
                    } else if (iZzp4 != 0) {
                        i15 = i15;
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        i17 = i16;
                        iZzp6 = i17;
                    } else if (i15 == 0) {
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        i17 = i16;
                        i19 = i17;
                        i15 = i19;
                        iZzp6 = i15;
                        StringBuilder sbD = b.d(zzajeVar.zza, i18, "Inconsistent stbl box for track ", ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ");
                        sbD.append(iZzp6);
                        sbD.append(", remainingSamplesInChunk ");
                        sbD.append(i16);
                        sbD.append(", remainingTimestampDeltaChanges ");
                        sbD.append(i17);
                        sbD.append(", remainingSamplesAtTimestampOffset ");
                        sbD.append(i19);
                        if (1 != i15) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sbD.append(str);
                        zzdt.zzf("BoxParsers", sbD.toString());
                    } else {
                        iZzb = iZzb;
                    }
                    iZzb = iZzb;
                    iArr2 = iArrCopyOf;
                    j12 = j27;
                    i20 = i12;
                    jArr3 = jArrCopyOf;
                    long j28 = zzajeVar.zzc;
                    roundingMode = RoundingMode.FLOOR;
                    jZzu = zzen.zzu(j12, 1000000L, j28, roundingMode);
                    jArr4 = zzajeVar.zzh;
                    if (jArr4 == null) {
                        zzen.zzF(jArrCopyOf2, 1000000L, zzajeVar.zzc);
                        return new zzajh(zzajeVar, jArr3, iArr2, i20, jArrCopyOf2, iArrCopyOf2, jZzu);
                    }
                    i24 = iZzb;
                    j14 = j12;
                    iArr3 = iArrCopyOf2;
                    iArr4 = iArr2;
                    jArr5 = jArrCopyOf2;
                    i25 = i20;
                    if (jArr4.length == 1) {
                        long[] jArr18 = zzajeVar.zzi;
                        jArr18.getClass();
                        j20 = jArr18[i];
                        jZzu3 = zzen.zzu(jArr4[i], zzajeVar.zzc, zzajeVar.zzd, roundingMode) + j20;
                        int i510 = length2 - 1;
                        int i65 = i;
                        int iMax4 = Math.max(i65, Math.min(4, i510));
                        int iMax5 = Math.max(i65, Math.min(length2 - 4, i510));
                        j21 = jArr5[i65];
                        if (j21 <= j20) {
                            jZzu4 = zzen.zzu(j20 - j21, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                            jZzu5 = zzen.zzu(j14 - jZzu3, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                            if (jZzu4 != j4) {
                                if (jZzu4 <= 2147483647L) {
                                    zzadfVar.zza = (int) jZzu4;
                                    zzadfVar.zzb = (int) jZzu5;
                                    zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                                    return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                                }
                            } else if (jZzu5 != j4) {
                                jZzu4 = j4;
                                if (jZzu4 <= 2147483647L) {
                                    zzadfVar.zza = (int) jZzu4;
                                    zzadfVar.zzb = (int) jZzu5;
                                    zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                                    return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                                }
                            }
                            jArr3 = jArr3;
                            iArr4 = iArr4;
                        }
                    }
                    jArr6 = zzajeVar.zzh;
                    length = jArr6.length;
                    if (length == 1) {
                        if (jArr6[0] == j4) {
                            long[] jArr19 = zzajeVar.zzi;
                            jArr19.getClass();
                            j19 = jArr19[0];
                            while (i39 < jArr5.length) {
                                jArr5[i39] = zzen.zzu(jArr5[i39] - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR);
                            }
                            return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(j14 - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR));
                        }
                        length = 1;
                    }
                    if (zzajeVar.zzb == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jArr7 = zzajeVar.zzi;
                    iArr5 = new int[length];
                    iArr6 = new int[length];
                    jArr7.getClass();
                    i26 = 0;
                    z11 = false;
                    i27 = 0;
                    i28 = 0;
                    while (true) {
                        jArr8 = zzajeVar.zzh;
                        i29 = i25;
                        if (i28 < jArr8.length) {
                            break;
                            break;
                        }
                        iArr10 = iArr6;
                        long[] jArr110 = jArr7;
                        j18 = jArr110[i28];
                        if (j18 != -1) {
                            i35 = i28;
                            long jZzu8 = zzen.zzu(jArr8[i28], zzajeVar.zzc, zzajeVar.zzd, RoundingMode.FLOOR);
                            i36 = 1;
                            iArr5[i35] = zzen.zzd(jArr5, j18, true, true);
                            iArr10[i35] = zzen.zza(jArr5, j18 + jZzu8, z10, false);
                            while (true) {
                                i37 = iArr5[i35];
                                i38 = iArr10[i35];
                                if (i37 >= i38) {
                                    break;
                                }
                                break;
                                break;
                                iArr5[i35] = i37 + 1;
                                i36 = 1;
                            }
                            int i66 = (i38 - i37) + i26;
                            if (i27 != i37) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            i26 = i66;
                            z11 = z15 | z11;
                            i27 = i38;
                        } else {
                            i35 = i28;
                        }
                        jArr7 = jArr110;
                        i28 = i35 + 1;
                        iArr6 = iArr10;
                        i25 = i29;
                    }
                    iArr7 = iArr6;
                    i30 = 0;
                    if (i26 != i24) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z12 | z11;
                    if (z13) {
                        jArr9 = new long[i26];
                    } else {
                        jArr9 = jArr3;
                    }
                    if (z13) {
                        iArr8 = new int[i26];
                    } else {
                        iArr8 = iArr4;
                    }
                    if (true == z13) {
                        i31 = 0;
                    } else {
                        i31 = i29;
                    }
                    if (z13) {
                        iArr9 = new int[i26];
                    } else {
                        iArr9 = iArr3;
                    }
                    jArr10 = new long[i26];
                    int i67 = i31;
                    i32 = 0;
                    j15 = j4;
                    while (i30 < zzajeVar.zzh.length) {
                        j16 = zzajeVar.zzi[i30];
                        i33 = iArr5[i30];
                        i34 = iArr7[i30];
                        z14 = z13;
                        if (z13) {
                            int i68 = i34 - i33;
                            System.arraycopy(jArr3, i33, jArr9, i32, i68);
                            System.arraycopy(iArr4, i33, iArr8, i32, i68);
                            System.arraycopy(iArr3, i33, iArr9, i32, i68);
                        }
                        while (i33 < i34) {
                            long[] jArr111 = jArr3;
                            int[] iArr13 = iArr4;
                            long j29 = zzajeVar.zzd;
                            RoundingMode roundingMode3 = RoundingMode.FLOOR;
                            long jZzu9 = zzen.zzu(j15, 1000000L, j29, roundingMode3);
                            jZzu2 = zzen.zzu(jArr5[i33] - j16, 1000000L, zzajeVar.zzc, roundingMode3);
                            long[] jArr112 = jArr9;
                            if (zzajeVar.zzb != 1) {
                                j17 = j4;
                                jZzu2 = Math.max(j17, jZzu2);
                            } else {
                                j17 = j4;
                            }
                            jArr10[i32] = jZzu9 + jZzu2;
                            if (!z14) {
                            }
                            i32++;
                            i33++;
                            jArr3 = jArr111;
                            j4 = j17;
                            iArr4 = iArr13;
                            jArr9 = jArr112;
                            jArr5 = jArr5;
                        }
                        j15 += zzajeVar.zzh[i30];
                        i30++;
                        jArr3 = jArr3;
                        jArr9 = jArr9;
                        jArr5 = jArr5;
                        z13 = z14;
                    }
                    return new zzajh(zzajeVar, jArr9, iArr8, i67, jArr10, iArr9, zzen.zzu(j15, 1000000L, zzajeVar.zzd, RoundingMode.FLOOR));
                }
                i18 = i;
                i16 = i14;
                i17 = i11;
            } else {
                i15 = i15;
                iZzb = iZzb;
                i16 = i14;
                i17 = i11;
                i18 = i10;
            }
            i19 = iZzp4;
            StringBuilder sbD2 = b.d(zzajeVar.zza, i18, "Inconsistent stbl box for track ", ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ");
            sbD2.append(iZzp6);
            sbD2.append(", remainingSamplesInChunk ");
            sbD2.append(i16);
            sbD2.append(", remainingTimestampDeltaChanges ");
            sbD2.append(i17);
            sbD2.append(", remainingSamplesAtTimestampOffset ");
            sbD2.append(i19);
            if (1 != i15) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sbD2.append(str);
            zzdt.zzf("BoxParsers", sbD2.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            j12 = j27;
            i20 = i12;
            jArr3 = jArrCopyOf;
            long j210 = zzajeVar.zzc;
            roundingMode = RoundingMode.FLOOR;
            jZzu = zzen.zzu(j12, 1000000L, j210, roundingMode);
            jArr4 = zzajeVar.zzh;
            if (jArr4 == null) {
                zzen.zzF(jArrCopyOf2, 1000000L, zzajeVar.zzc);
                return new zzajh(zzajeVar, jArr3, iArr2, i20, jArrCopyOf2, iArrCopyOf2, jZzu);
            }
            i24 = iZzb;
            j14 = j12;
            iArr3 = iArrCopyOf2;
            iArr4 = iArr2;
            jArr5 = jArrCopyOf2;
            i25 = i20;
            if (jArr4.length == 1) {
                long[] jArr113 = zzajeVar.zzi;
                jArr113.getClass();
                j20 = jArr113[i];
                jZzu3 = zzen.zzu(jArr4[i], zzajeVar.zzc, zzajeVar.zzd, roundingMode) + j20;
                int i511 = length2 - 1;
                int i69 = i;
                int iMax6 = Math.max(i69, Math.min(4, i511));
                int iMax7 = Math.max(i69, Math.min(length2 - 4, i511));
                j21 = jArr5[i69];
                if (j21 <= j20) {
                    jZzu4 = zzen.zzu(j20 - j21, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                    jZzu5 = zzen.zzu(j14 - jZzu3, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                    if (jZzu4 != j4) {
                        if (jZzu4 <= 2147483647L) {
                            zzadfVar.zza = (int) jZzu4;
                            zzadfVar.zzb = (int) jZzu5;
                            zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                            return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                        }
                    } else if (jZzu5 != j4) {
                        jZzu4 = j4;
                        if (jZzu4 <= 2147483647L) {
                            zzadfVar.zza = (int) jZzu4;
                            zzadfVar.zzb = (int) jZzu5;
                            zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                            return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                        }
                    }
                    jArr3 = jArr3;
                    iArr4 = iArr4;
                }
            }
            jArr6 = zzajeVar.zzh;
            length = jArr6.length;
            if (length == 1) {
                if (jArr6[0] == j4) {
                    long[] jArr114 = zzajeVar.zzi;
                    jArr114.getClass();
                    j19 = jArr114[0];
                    while (i39 < jArr5.length) {
                        jArr5[i39] = zzen.zzu(jArr5[i39] - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR);
                    }
                    return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(j14 - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR));
                }
                length = 1;
            }
            if (zzajeVar.zzb == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            jArr7 = zzajeVar.zzi;
            iArr5 = new int[length];
            iArr6 = new int[length];
            jArr7.getClass();
            i26 = 0;
            z11 = false;
            i27 = 0;
            i28 = 0;
            while (true) {
                jArr8 = zzajeVar.zzh;
                i29 = i25;
                if (i28 < jArr8.length) {
                    break;
                    break;
                }
                iArr10 = iArr6;
                long[] jArr115 = jArr7;
                j18 = jArr115[i28];
                if (j18 != -1) {
                    i35 = i28;
                    long jZzu10 = zzen.zzu(jArr8[i28], zzajeVar.zzc, zzajeVar.zzd, RoundingMode.FLOOR);
                    i36 = 1;
                    iArr5[i35] = zzen.zzd(jArr5, j18, true, true);
                    iArr10[i35] = zzen.zza(jArr5, j18 + jZzu10, z10, false);
                    while (true) {
                        i37 = iArr5[i35];
                        i38 = iArr10[i35];
                        if (i37 >= i38) {
                            break;
                            break;
                        }
                        break;
                        break;
                        iArr5[i35] = i37 + 1;
                        i36 = 1;
                    }
                    int i610 = (i38 - i37) + i26;
                    if (i27 != i37) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i26 = i610;
                    z11 = z15 | z11;
                    i27 = i38;
                } else {
                    i35 = i28;
                }
                jArr7 = jArr115;
                i28 = i35 + 1;
                iArr6 = iArr10;
                i25 = i29;
            }
            iArr7 = iArr6;
            i30 = 0;
            if (i26 != i24) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z12 | z11;
            if (z13) {
                jArr9 = new long[i26];
            } else {
                jArr9 = jArr3;
            }
            if (z13) {
                iArr8 = new int[i26];
            } else {
                iArr8 = iArr4;
            }
            if (true == z13) {
                i31 = 0;
            } else {
                i31 = i29;
            }
            if (z13) {
                iArr9 = new int[i26];
            } else {
                iArr9 = iArr3;
            }
            jArr10 = new long[i26];
            int i611 = i31;
            i32 = 0;
            j15 = j4;
            while (i30 < zzajeVar.zzh.length) {
                j16 = zzajeVar.zzi[i30];
                i33 = iArr5[i30];
                i34 = iArr7[i30];
                z14 = z13;
                if (z13) {
                    int i612 = i34 - i33;
                    System.arraycopy(jArr3, i33, jArr9, i32, i612);
                    System.arraycopy(iArr4, i33, iArr8, i32, i612);
                    System.arraycopy(iArr3, i33, iArr9, i32, i612);
                }
                while (i33 < i34) {
                    long[] jArr116 = jArr3;
                    int[] iArr14 = iArr4;
                    long j211 = zzajeVar.zzd;
                    RoundingMode roundingMode4 = RoundingMode.FLOOR;
                    long jZzu11 = zzen.zzu(j15, 1000000L, j211, roundingMode4);
                    jZzu2 = zzen.zzu(jArr5[i33] - j16, 1000000L, zzajeVar.zzc, roundingMode4);
                    long[] jArr117 = jArr9;
                    if (zzajeVar.zzb != 1) {
                        j17 = j4;
                        jZzu2 = Math.max(j17, jZzu2);
                    } else {
                        j17 = j4;
                    }
                    jArr10[i32] = jZzu11 + jZzu2;
                    if (!z14) {
                    }
                    i32++;
                    i33++;
                    jArr3 = jArr116;
                    j4 = j17;
                    iArr4 = iArr14;
                    jArr9 = jArr117;
                    jArr5 = jArr5;
                }
                j15 += zzajeVar.zzh[i30];
                i30++;
                jArr3 = jArr3;
                jArr9 = jArr9;
                jArr5 = jArr5;
                z13 = z14;
            }
            return new zzajh(zzajeVar, jArr9, iArr8, i611, jArr10, iArr9, zzen.zzu(j15, 1000000L, zzajeVar.zzd, RoundingMode.FLOOR));
        }
        iZzp2 = 0;
        i = 0;
        iZzp3 = -1;
        iZza = zzaikVar.zza();
        String str3 = zzajeVar.zzf.zzo;
        zzaigVar = zzaikVar;
        int i410 = iZzp2;
        if (iZza == -1) {
            j4 = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i10 = i410;
            zzedVar = zzedVar5;
            i11 = iZzp5;
            iZzg = i;
            i12 = iZzg;
            i13 = i12;
            i14 = i13;
            iZzp4 = i14;
            j10 = j4;
            j11 = j10;
            while (true) {
                if (i13 >= iZzb) {
                    jArrCopyOf = jArr;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf2 = iArr;
                    break;
                }
                j13 = j10;
                zZza = true;
                while (true) {
                    if (i14 != 0) {
                        i21 = i14;
                        break;
                    }
                    zZza = zzaidVar.zza();
                    if (!zZza) {
                        i21 = i;
                        break;
                    }
                    j13 = zzaidVar.zzd;
                    i14 = zzaidVar.zzc;
                    iZzb = iZzb;
                }
                i22 = iZzb;
                if (!zZza) {
                    zzdt.zzf("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i13);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i13);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i13);
                    iZzb = i13;
                    break;
                }
                if (zzedVar != null) {
                    while (iZzp4 == 0) {
                        if (iZzp <= 0) {
                            iZzp4 = i;
                            break;
                        }
                        iZzp--;
                        iZzp4 = zzedVar.zzp();
                        iZzg = zzedVar.zzg();
                    }
                    iZzp4--;
                }
                jArr[i13] = j13;
                iZzc = zzaigVar.zzc();
                iArrCopyOf[i13] = iZzc;
                if (iZzc > i12) {
                    i12 = iZzc;
                }
                int i613 = i21;
                jArr2[i13] = j11 + ((long) iZzg);
                if (zzedVar4 == null) {
                    i23 = 1;
                } else {
                    i23 = i;
                }
                iArr[i13] = i23;
                if (i13 == iZzp3) {
                    iArr[i13] = 1;
                    i10--;
                    if (i10 > 0) {
                        zzedVar4.getClass();
                        iZzp3 = zzedVar4.zzp() - 1;
                    }
                }
                j11 += (long) iZzp7;
                iZzp6--;
                if (iZzp6 == 0) {
                    if (i11 > 0) {
                        i11--;
                        iZzp6 = zzedVar3.zzp();
                        iZzp7 = zzedVar3.zzg();
                    } else {
                        iZzp6 = i;
                    }
                }
                long j212 = j13 + ((long) iArrCopyOf[i13]);
                i14 = i613 - 1;
                i13++;
                iZzb = i22;
                j10 = j212;
            }
            long j213 = j11 + ((long) iZzg);
            if (zzedVar == null) {
                i15 = 1;
                break;
            }
            while (true) {
                if (iZzp <= 0) {
                    i15 = 1;
                    break;
                }
                if (zzedVar.zzp() != 0) {
                    i15 = i;
                    break;
                }
                zzedVar.zzg();
                iZzp--;
            }
            if (i10 == 0) {
                if (iZzp6 == 0) {
                    if (i14 != 0) {
                        i18 = i;
                        iZzp6 = i18;
                    } else if (i11 != 0) {
                        i15 = i15;
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        iZzp6 = i16;
                        i17 = i11;
                    } else if (iZzp4 != 0) {
                        i15 = i15;
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        i17 = i16;
                        iZzp6 = i17;
                    } else if (i15 == 0) {
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        i17 = i16;
                        i19 = i17;
                        i15 = i19;
                        iZzp6 = i15;
                        StringBuilder sbD3 = b.d(zzajeVar.zza, i18, "Inconsistent stbl box for track ", ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ");
                        sbD3.append(iZzp6);
                        sbD3.append(", remainingSamplesInChunk ");
                        sbD3.append(i16);
                        sbD3.append(", remainingTimestampDeltaChanges ");
                        sbD3.append(i17);
                        sbD3.append(", remainingSamplesAtTimestampOffset ");
                        sbD3.append(i19);
                        if (1 != i15) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sbD3.append(str);
                        zzdt.zzf("BoxParsers", sbD3.toString());
                    } else {
                        iZzb = iZzb;
                    }
                    iZzb = iZzb;
                    iArr2 = iArrCopyOf;
                    j12 = j213;
                    i20 = i12;
                } else {
                    i18 = i;
                }
                i16 = i14;
                i17 = i11;
            } else {
                i15 = i15;
                iZzb = iZzb;
                i16 = i14;
                i17 = i11;
                i18 = i10;
            }
            i19 = iZzp4;
            StringBuilder sbD4 = b.d(zzajeVar.zza, i18, "Inconsistent stbl box for track ", ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ");
            sbD4.append(iZzp6);
            sbD4.append(", remainingSamplesInChunk ");
            sbD4.append(i16);
            sbD4.append(", remainingTimestampDeltaChanges ");
            sbD4.append(i17);
            sbD4.append(", remainingSamplesAtTimestampOffset ");
            sbD4.append(i19);
            if (1 != i15) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sbD4.append(str);
            zzdt.zzf("BoxParsers", sbD4.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            j12 = j213;
            i20 = i12;
        } else {
            j4 = 0;
            jArr = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArr2 = new long[iZzb];
            iArr = new int[iZzb];
            i10 = i410;
            zzedVar = zzedVar5;
            i11 = iZzp5;
            iZzg = i;
            i12 = iZzg;
            i13 = i12;
            i14 = i13;
            iZzp4 = i14;
            j10 = j4;
            j11 = j10;
            while (true) {
                if (i13 >= iZzb) {
                    jArrCopyOf = jArr;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf2 = iArr;
                    break;
                }
                j13 = j10;
                zZza = true;
                while (true) {
                    if (i14 != 0) {
                        i21 = i14;
                        break;
                    }
                    zZza = zzaidVar.zza();
                    if (!zZza) {
                        i21 = i;
                        break;
                    }
                    j13 = zzaidVar.zzd;
                    i14 = zzaidVar.zzc;
                    iZzb = iZzb;
                }
                i22 = iZzb;
                if (!zZza) {
                    zzdt.zzf("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i13);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i13);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i13);
                    iZzb = i13;
                    break;
                }
                if (zzedVar != null) {
                    while (iZzp4 == 0) {
                        if (iZzp <= 0) {
                            iZzp4 = i;
                            break;
                        }
                        iZzp--;
                        iZzp4 = zzedVar.zzp();
                        iZzg = zzedVar.zzg();
                    }
                    iZzp4--;
                }
                jArr[i13] = j13;
                iZzc = zzaigVar.zzc();
                iArrCopyOf[i13] = iZzc;
                if (iZzc > i12) {
                    i12 = iZzc;
                }
                int i614 = i21;
                jArr2[i13] = j11 + ((long) iZzg);
                if (zzedVar4 == null) {
                    i23 = 1;
                } else {
                    i23 = i;
                }
                iArr[i13] = i23;
                if (i13 == iZzp3) {
                    iArr[i13] = 1;
                    i10--;
                    if (i10 > 0) {
                        zzedVar4.getClass();
                        iZzp3 = zzedVar4.zzp() - 1;
                    }
                }
                j11 += (long) iZzp7;
                iZzp6--;
                if (iZzp6 == 0) {
                    if (i11 > 0) {
                        i11--;
                        iZzp6 = zzedVar3.zzp();
                        iZzp7 = zzedVar3.zzg();
                    } else {
                        iZzp6 = i;
                    }
                }
                long j214 = j13 + ((long) iArrCopyOf[i13]);
                i14 = i614 - 1;
                i13++;
                iZzb = i22;
                j10 = j214;
            }
            long j215 = j11 + ((long) iZzg);
            if (zzedVar == null) {
                i15 = 1;
                break;
            }
            while (true) {
                if (iZzp <= 0) {
                    i15 = 1;
                    break;
                }
                if (zzedVar.zzp() != 0) {
                    i15 = i;
                    break;
                }
                zzedVar.zzg();
                iZzp--;
            }
            if (i10 == 0) {
                if (iZzp6 == 0) {
                    if (i14 != 0) {
                        i18 = i;
                        iZzp6 = i18;
                    } else if (i11 != 0) {
                        i15 = i15;
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        iZzp6 = i16;
                        i17 = i11;
                    } else if (iZzp4 != 0) {
                        i15 = i15;
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        i17 = i16;
                        iZzp6 = i17;
                    } else if (i15 == 0) {
                        iZzb = iZzb;
                        i18 = i;
                        i16 = i18;
                        i17 = i16;
                        i19 = i17;
                        i15 = i19;
                        iZzp6 = i15;
                        StringBuilder sbD5 = b.d(zzajeVar.zza, i18, "Inconsistent stbl box for track ", ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ");
                        sbD5.append(iZzp6);
                        sbD5.append(", remainingSamplesInChunk ");
                        sbD5.append(i16);
                        sbD5.append(", remainingTimestampDeltaChanges ");
                        sbD5.append(i17);
                        sbD5.append(", remainingSamplesAtTimestampOffset ");
                        sbD5.append(i19);
                        if (1 != i15) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sbD5.append(str);
                        zzdt.zzf("BoxParsers", sbD5.toString());
                    } else {
                        iZzb = iZzb;
                    }
                    iZzb = iZzb;
                    iArr2 = iArrCopyOf;
                    j12 = j215;
                    i20 = i12;
                } else {
                    i18 = i;
                }
                i16 = i14;
                i17 = i11;
            } else {
                i15 = i15;
                iZzb = iZzb;
                i16 = i14;
                i17 = i11;
                i18 = i10;
            }
            i19 = iZzp4;
            StringBuilder sbD6 = b.d(zzajeVar.zza, i18, "Inconsistent stbl box for track ", ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ");
            sbD6.append(iZzp6);
            sbD6.append(", remainingSamplesInChunk ");
            sbD6.append(i16);
            sbD6.append(", remainingTimestampDeltaChanges ");
            sbD6.append(i17);
            sbD6.append(", remainingSamplesAtTimestampOffset ");
            sbD6.append(i19);
            if (1 != i15) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sbD6.append(str);
            zzdt.zzf("BoxParsers", sbD6.toString());
            iZzb = iZzb;
            iArr2 = iArrCopyOf;
            j12 = j215;
            i20 = i12;
        }
        jArr3 = jArrCopyOf;
        long j216 = zzajeVar.zzc;
        roundingMode = RoundingMode.FLOOR;
        jZzu = zzen.zzu(j12, 1000000L, j216, roundingMode);
        jArr4 = zzajeVar.zzh;
        if (jArr4 == null) {
            zzen.zzF(jArrCopyOf2, 1000000L, zzajeVar.zzc);
            return new zzajh(zzajeVar, jArr3, iArr2, i20, jArrCopyOf2, iArrCopyOf2, jZzu);
        }
        i24 = iZzb;
        j14 = j12;
        iArr3 = iArrCopyOf2;
        iArr4 = iArr2;
        jArr5 = jArrCopyOf2;
        i25 = i20;
        if (jArr4.length == 1) {
            long[] jArr118 = zzajeVar.zzi;
            jArr118.getClass();
            j20 = jArr118[i];
            jZzu3 = zzen.zzu(jArr4[i], zzajeVar.zzc, zzajeVar.zzd, roundingMode) + j20;
            int i512 = length2 - 1;
            int i615 = i;
            int iMax8 = Math.max(i615, Math.min(4, i512));
            int iMax9 = Math.max(i615, Math.min(length2 - 4, i512));
            j21 = jArr5[i615];
            if (j21 <= j20) {
                jZzu4 = zzen.zzu(j20 - j21, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                jZzu5 = zzen.zzu(j14 - jZzu3, zzajeVar.zzf.zzD, zzajeVar.zzc, roundingMode);
                if (jZzu4 != j4) {
                    if (jZzu4 <= 2147483647L) {
                        zzadfVar.zza = (int) jZzu4;
                        zzadfVar.zzb = (int) jZzu5;
                        zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                        return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                    }
                } else if (jZzu5 != j4) {
                    jZzu4 = j4;
                    if (jZzu4 <= 2147483647L) {
                        zzadfVar.zza = (int) jZzu4;
                        zzadfVar.zzb = (int) jZzu5;
                        zzen.zzF(jArr5, 1000000L, zzajeVar.zzc);
                        return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(zzajeVar.zzh[0], 1000000L, zzajeVar.zzd, roundingMode));
                    }
                }
                jArr3 = jArr3;
                iArr4 = iArr4;
            }
        }
        jArr6 = zzajeVar.zzh;
        length = jArr6.length;
        if (length == 1) {
            if (jArr6[0] == j4) {
                long[] jArr119 = zzajeVar.zzi;
                jArr119.getClass();
                j19 = jArr119[0];
                while (i39 < jArr5.length) {
                    jArr5[i39] = zzen.zzu(jArr5[i39] - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR);
                }
                return new zzajh(zzajeVar, jArr3, iArr4, i25, jArr5, iArr3, zzen.zzu(j14 - j19, 1000000L, zzajeVar.zzc, RoundingMode.FLOOR));
            }
            length = 1;
        }
        if (zzajeVar.zzb == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        jArr7 = zzajeVar.zzi;
        iArr5 = new int[length];
        iArr6 = new int[length];
        jArr7.getClass();
        i26 = 0;
        z11 = false;
        i27 = 0;
        i28 = 0;
        while (true) {
            jArr8 = zzajeVar.zzh;
            i29 = i25;
            if (i28 < jArr8.length) {
                break;
                break;
            }
            iArr10 = iArr6;
            long[] jArr1110 = jArr7;
            j18 = jArr1110[i28];
            if (j18 != -1) {
                i35 = i28;
                long jZzu12 = zzen.zzu(jArr8[i28], zzajeVar.zzc, zzajeVar.zzd, RoundingMode.FLOOR);
                i36 = 1;
                iArr5[i35] = zzen.zzd(jArr5, j18, true, true);
                iArr10[i35] = zzen.zza(jArr5, j18 + jZzu12, z10, false);
                while (true) {
                    i37 = iArr5[i35];
                    i38 = iArr10[i35];
                    if (i37 >= i38) {
                        break;
                        break;
                    }
                    break;
                    break;
                    iArr5[i35] = i37 + 1;
                    i36 = 1;
                }
                int i616 = (i38 - i37) + i26;
                if (i27 != i37) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i26 = i616;
                z11 = z15 | z11;
                i27 = i38;
            } else {
                i35 = i28;
            }
            jArr7 = jArr1110;
            i28 = i35 + 1;
            iArr6 = iArr10;
            i25 = i29;
        }
        iArr7 = iArr6;
        i30 = 0;
        if (i26 != i24) {
            z12 = true;
        } else {
            z12 = false;
        }
        z13 = z12 | z11;
        if (z13) {
            jArr9 = new long[i26];
        } else {
            jArr9 = jArr3;
        }
        if (z13) {
            iArr8 = new int[i26];
        } else {
            iArr8 = iArr4;
        }
        if (true == z13) {
            i31 = 0;
        } else {
            i31 = i29;
        }
        if (z13) {
            iArr9 = new int[i26];
        } else {
            iArr9 = iArr3;
        }
        jArr10 = new long[i26];
        int i617 = i31;
        i32 = 0;
        j15 = j4;
        while (i30 < zzajeVar.zzh.length) {
            j16 = zzajeVar.zzi[i30];
            i33 = iArr5[i30];
            i34 = iArr7[i30];
            z14 = z13;
            if (z13) {
                int i618 = i34 - i33;
                System.arraycopy(jArr3, i33, jArr9, i32, i618);
                System.arraycopy(iArr4, i33, iArr8, i32, i618);
                System.arraycopy(iArr3, i33, iArr9, i32, i618);
            }
            while (i33 < i34) {
                long[] jArr1111 = jArr3;
                int[] iArr15 = iArr4;
                long j217 = zzajeVar.zzd;
                RoundingMode roundingMode5 = RoundingMode.FLOOR;
                long jZzu13 = zzen.zzu(j15, 1000000L, j217, roundingMode5);
                jZzu2 = zzen.zzu(jArr5[i33] - j16, 1000000L, zzajeVar.zzc, roundingMode5);
                long[] jArr1112 = jArr9;
                if (zzajeVar.zzb != 1) {
                    j17 = j4;
                    jZzu2 = Math.max(j17, jZzu2);
                } else {
                    j17 = j4;
                }
                jArr10[i32] = jZzu13 + jZzu2;
                if (!z14) {
                }
                i32++;
                i33++;
                jArr3 = jArr1111;
                j4 = j17;
                iArr4 = iArr15;
                jArr9 = jArr1112;
                jArr5 = jArr5;
            }
            j15 += zzajeVar.zzh[i30];
            i30++;
            jArr3 = jArr3;
            jArr9 = jArr9;
            jArr5 = jArr5;
            z13 = z14;
        }
        return new zzajh(zzajeVar, jArr9, iArr8, i617, jArr10, iArr9, zzen.zzu(j15, 1000000L, zzajeVar.zzd, RoundingMode.FLOOR));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36011. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzes r70, com.google.android.gms.internal.ads.zzadf r71, long r72, com.google.android.gms.internal.ads.zzw r74, boolean r75, boolean r76, com.google.android.gms.internal.ads.zzfwh r77) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instruction units count: 3601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzain.zzf(com.google.android.gms.internal.ads.zzes, com.google.android.gms.internal.ads.zzadf, long, com.google.android.gms.internal.ads.zzw, boolean, boolean, com.google.android.gms.internal.ads.zzfwh):java.util.List");
    }

    public static void zzg(zzed zzedVar) {
        int iZzd = zzedVar.zzd();
        zzedVar.zzM(4);
        if (zzedVar.zzg() != 1751411826) {
            iZzd += 4;
        }
        zzedVar.zzL(iZzd);
    }

    private static int zzh(zzed zzedVar) {
        int iZzm = zzedVar.zzm();
        int i = iZzm & 127;
        while ((iZzm & 128) == 128) {
            iZzm = zzedVar.zzm();
            i = (i << 7) | (iZzm & 127);
        }
        return i;
    }

    private static int zzi(zzed zzedVar) {
        zzedVar.zzL(16);
        return zzedVar.zzg();
    }

    private static Pair zzj(zzed zzedVar, int i, int i10) throws zzbh {
        zzajf zzajfVar;
        Pair pairCreate;
        int i11;
        int i12;
        int iZzd = zzedVar.zzd();
        while (iZzd - i < i10) {
            zzedVar.zzL(iZzd);
            int iZzg = zzedVar.zzg();
            zzacv.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzedVar.zzg() == 1936289382) {
                int i13 = iZzd + 8;
                int i14 = 0;
                int i15 = -1;
                Integer numValueOf = null;
                String strZzB = null;
                while (i13 - iZzd < iZzg) {
                    zzedVar.zzL(i13);
                    int iZzg2 = zzedVar.zzg();
                    int iZzg3 = zzedVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzedVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzedVar.zzM(4);
                        strZzB = zzedVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (iZzg3 == 1935894633) {
                        i15 = i13;
                        i14 = iZzg2;
                    }
                    i13 += iZzg2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzB) || "cbc1".equals(strZzB) || "cens".equals(strZzB) || "cbcs".equals(strZzB)) {
                    zzacv.zzb(numValueOf != null, "frma atom is mandatory");
                    zzacv.zzb(i15 != -1, "schi atom is mandatory");
                    int i16 = i15 + 8;
                    while (true) {
                        if (i16 - i15 >= i14) {
                            zzajfVar = null;
                            break;
                        }
                        zzedVar.zzL(i16);
                        int iZzg4 = zzedVar.zzg();
                        if (zzedVar.zzg() == 1952804451) {
                            int iZza = zza(zzedVar.zzg());
                            zzedVar.zzM(1);
                            if (iZza == 0) {
                                zzedVar.zzM(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int iZzm = zzedVar.zzm();
                                i11 = iZzm & 15;
                                i12 = (iZzm & 240) >> 4;
                            }
                            boolean z4 = zzedVar.zzm() == 1;
                            int iZzm2 = zzedVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzedVar.zzH(bArr2, 0, 16);
                            if (z4 && iZzm2 == 0) {
                                int iZzm3 = zzedVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzedVar.zzH(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            }
                            zzajfVar = new zzajf(z4, strZzB, iZzm2, bArr2, i12, i11, bArr);
                            break;
                        }
                        i16 += iZzg4;
                    }
                    zzacv.zzb(zzajfVar != null, "tenc atom is mandatory");
                    int i17 = zzen.zza;
                    pairCreate = Pair.create(numValueOf, zzajfVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzd += iZzg;
        }
        return null;
    }

    private static zzbd zzk(zzed zzedVar) {
        short sZzE = zzedVar.zzE();
        zzedVar.zzM(2);
        String strZzB = zzedVar.zzB(sZzE, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzB.lastIndexOf(43), strZzB.lastIndexOf(45));
        try {
            return new zzbd(-9223372036854775807L, new zzey(Float.parseFloat(strZzB.substring(0, iMax)), Float.parseFloat(strZzB.substring(iMax, strZzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaie zzl(zzed zzedVar, int i) {
        zzedVar.zzL(i + 12);
        zzedVar.zzM(1);
        zzh(zzedVar);
        zzedVar.zzM(2);
        int iZzm = zzedVar.zzm();
        if ((iZzm & 128) != 0) {
            zzedVar.zzM(2);
        }
        if ((iZzm & 64) != 0) {
            zzedVar.zzM(zzedVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzedVar.zzM(2);
        }
        zzedVar.zzM(1);
        zzh(zzedVar);
        String strZzd = zzbg.zzd(zzedVar.zzm());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzaie(strZzd, null, -1L, -1L);
        }
        zzedVar.zzM(4);
        long jZzu = zzedVar.zzu();
        long jZzu2 = zzedVar.zzu();
        zzedVar.zzM(1);
        int iZzh = zzh(zzedVar);
        long j4 = jZzu2;
        byte[] bArr = new byte[iZzh];
        zzedVar.zzH(bArr, 0, iZzh);
        if (j4 <= 0) {
            j4 = -1;
        }
        return new zzaie(strZzd, bArr, j4, jZzu > 0 ? jZzu : -1L);
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    private static void zzn(zzed zzedVar, int i, int i10, int i11, int i12, String str, boolean z4, zzw zzwVar, zzaii zzaiiVar, int i13) throws zzbh {
        int iZzq;
        int i14;
        int iZzn;
        int iZzg;
        int iZzp;
        int i15;
        zzw zzwVarZzb;
        String str2;
        int i16;
        boolean z10;
        zzed zzedVar2 = zzedVar;
        int i17 = i11;
        zzedVar2.zzL(i10 + 16);
        if (z4) {
            iZzq = zzedVar2.zzq();
            zzedVar2.zzM(6);
        } else {
            zzedVar2.zzM(8);
            iZzq = 0;
        }
        if (iZzq == 0 || iZzq == 1) {
            i14 = 2;
            int iZzq2 = zzedVar2.zzq();
            zzedVar2.zzM(6);
            iZzn = zzedVar2.zzn();
            zzedVar2.zzL(zzedVar2.zzd() - 4);
            iZzg = zzedVar2.zzg();
            if (iZzq == 1) {
                zzedVar2.zzM(16);
            }
            iZzp = iZzq2;
            i15 = -1;
        } else {
            if (iZzq != 2) {
                return;
            }
            zzedVar2.zzM(16);
            i14 = 2;
            iZzn = (int) Math.round(Double.longBitsToDouble(zzedVar2.zzt()));
            iZzp = zzedVar2.zzp();
            zzedVar2.zzM(4);
            int iZzp2 = zzedVar2.zzp();
            int iZzp3 = zzedVar2.zzp();
            int i18 = iZzp3 & 1;
            int i19 = iZzp3 & 2;
            if (i18 == 0) {
                if (iZzp2 == 8) {
                    i15 = 3;
                } else if (iZzp2 == 16) {
                    i15 = i19 != 0 ? 268435456 : 2;
                } else if (iZzp2 == 24) {
                    i15 = i19 != 0 ? 1342177280 : 21;
                } else if (iZzp2 == 32) {
                    i15 = i19 != 0 ? 1610612736 : 22;
                } else {
                    i15 = -1;
                }
            } else if (iZzp2 == 32) {
                i15 = 4;
            } else {
                i15 = -1;
            }
            zzedVar2.zzM(8);
            iZzg = 0;
        }
        int iZzd = zzedVar2.zzd();
        int iIntValue = 1701733217;
        if (i == 1701733217) {
            Pair pairZzj = zzj(zzedVar2, i10, i17);
            if (pairZzj != null) {
                iIntValue = ((Integer) pairZzj.first).intValue();
                zzwVarZzb = zzwVar == null ? null : zzwVar.zzb(((zzajf) pairZzj.second).zzb);
                zzaiiVar.zza[i13] = (zzajf) pairZzj.second;
            } else {
                zzwVarZzb = zzwVar;
            }
            zzedVar2.zzL(iZzd);
        } else {
            zzwVarZzb = zzwVar;
            iIntValue = i;
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            i15 = i14;
            str2 = "audio/raw";
        } else if (iIntValue == 1953984371) {
            str2 = "audio/raw";
            i15 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i15 == -1) {
                i15 = i14;
            }
            str2 = "audio/raw";
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str2 = "audio/flac";
        } else if (iIntValue == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
        }
        int i20 = i15;
        List listZzo = null;
        String str3 = null;
        zzaie zzaieVarZzl = null;
        while (iZzd - i10 < i17) {
            zzedVar2.zzL(iZzd);
            int iZzg2 = zzedVar2.zzg();
            str3 = str3;
            zzacv.zzb(iZzg2 > 0, "childAtomSize must be positive");
            int iZzg3 = zzedVar2.zzg();
            iZzn = iZzn;
            if (iZzg3 == 1835557187) {
                zzedVar2.zzL(iZzd + 8);
                zzedVar2.zzM(1);
                int iZzm = zzedVar2.zzm();
                zzedVar2.zzM(1);
                String str4 = Objects.equals(str2, "audio/mhm1") ? String.format("mhm1.%02X", Integer.valueOf(iZzm)) : String.format("mha1.%02X", Integer.valueOf(iZzm));
                int iZzq3 = zzedVar2.zzq();
                byte[] bArr = new byte[iZzq3];
                str3 = str4;
                z10 = false;
                zzedVar2.zzH(bArr, 0, iZzq3);
                if (listZzo == null) {
                    listZzo = zzfzo.zzo(bArr);
                    iZzn = iZzn;
                    str3 = str3;
                } else {
                    listZzo = zzfzo.zzp(bArr, (byte[]) listZzo.get(0));
                    str3 = str3;
                    iZzn = iZzn;
                    iZzd = iZzd;
                    iZzg2 = iZzg2;
                }
            } else if (iZzg3 == 1835557200) {
                zzedVar2.zzL(iZzd + 8);
                int iZzm2 = zzedVar2.zzm();
                if (iZzm2 > 0) {
                    byte[] bArr2 = new byte[iZzm2];
                    z10 = false;
                    zzedVar2.zzH(bArr2, 0, iZzm2);
                    if (listZzo == null) {
                        listZzo = zzfzo.zzo(bArr2);
                        iZzn = iZzn;
                        str3 = str3;
                    } else {
                        listZzo = zzfzo.zzp((byte[]) listZzo.get(0), bArr2);
                        str3 = str3;
                        iZzn = iZzn;
                        iZzd = iZzd;
                        iZzg2 = iZzg2;
                    }
                }
                iZzn = iZzn;
                str3 = str3;
            } else {
                if (iZzg3 == 1702061171) {
                    i16 = iZzd;
                } else if (z4 && iZzg3 == 2002876005) {
                    int iZzd2 = zzedVar2.zzd();
                    zzacv.zzb(iZzd2 >= iZzd, null);
                    int i21 = iZzd2;
                    while (true) {
                        if (i21 - iZzd >= iZzg2) {
                            i16 = -1;
                            break;
                        }
                        zzedVar2.zzL(i21);
                        int iZzg4 = zzedVar2.zzg();
                        zzacv.zzb(iZzg4 > 0, "childAtomSize must be positive");
                        if (zzedVar2.zzg() == 1702061171) {
                            i16 = i21;
                            break;
                        }
                        i21 += iZzg4;
                    }
                } else {
                    if (iZzg3 == 1684103987) {
                        zzedVar2.zzL(iZzd + 8);
                        zzaiiVar.zzb = zzabr.zzc(zzedVar2, Integer.toString(i12), str, zzwVarZzb);
                    } else if (iZzg3 == 1684366131) {
                        zzedVar2.zzL(iZzd + 8);
                        zzaiiVar.zzb = zzabr.zzd(zzedVar2, Integer.toString(i12), str, zzwVarZzb);
                    } else if (iZzg3 == 1684103988) {
                        zzedVar2.zzL(iZzd + 8);
                        String string = Integer.toString(i12);
                        zzedVar2.zzM(1);
                        int iZzm3 = zzedVar2.zzm() & 32;
                        zzab zzabVar = new zzab();
                        zzabVar.zzL(string);
                        zzabVar.zzZ("audio/ac4");
                        zzabVar.zzz(i14);
                        zzabVar.zzaa(1 != (iZzm3 >> 5) ? 44100 : 48000);
                        zzabVar.zzF(zzwVarZzb);
                        zzabVar.zzP(str);
                        zzaiiVar.zzb = zzabVar.zzaf();
                        iZzn = iZzn;
                        i14 = 2;
                        str3 = str3;
                    } else {
                        if (iZzg3 == 1684892784) {
                            if (iZzg <= 0) {
                                throw zzbh.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzg, null);
                            }
                            iZzn = iZzg;
                            iZzp = 2;
                        } else if (iZzg3 == 1684305011 || iZzg3 == 1969517683) {
                            i14 = 2;
                            zzab zzabVar2 = new zzab();
                            zzabVar2.zzK(i12);
                            zzabVar2.zzZ(str2);
                            zzabVar2.zzz(iZzp);
                            iZzn = iZzn;
                            zzabVar2.zzaa(iZzn);
                            zzabVar2.zzF(zzwVarZzb);
                            zzabVar2.zzP(str);
                            zzaiiVar.zzb = zzabVar2.zzaf();
                            str3 = str3;
                        } else if (iZzg3 == 1682927731) {
                            int i22 = iZzg2 - 8;
                            byte[] bArr3 = zzb;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i22);
                            zzedVar2.zzL(iZzd + 8);
                            zzedVar2.zzH(bArrCopyOf, bArr3.length, i22);
                            listZzo = zzadm.zze(bArrCopyOf);
                            iZzn = iZzn;
                        } else {
                            if (iZzg3 == 1684425825) {
                                byte[] bArr4 = new byte[iZzg2 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                i14 = 2;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                zzedVar2.zzL(iZzd + 12);
                                zzedVar2.zzH(bArr4, 4, iZzg2 - 12);
                                listZzo = zzfzo.zzo(bArr4);
                            } else {
                                i14 = 2;
                                if (iZzg3 == 1634492771) {
                                    int i23 = iZzg2 - 12;
                                    byte[] bArr5 = new byte[i23];
                                    zzedVar2.zzL(iZzd + 12);
                                    zzedVar2.zzH(bArr5, 0, i23);
                                    int i24 = zzdd.zza;
                                    zzed zzedVar3 = new zzed(bArr5);
                                    zzedVar3.zzL(9);
                                    int iZzm4 = zzedVar3.zzm();
                                    zzedVar3.zzL(20);
                                    Pair pairCreate = Pair.create(Integer.valueOf(zzedVar3.zzp()), Integer.valueOf(iZzm4));
                                    int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                    int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                    zzfzo zzfzoVarZzo = zzfzo.zzo(bArr5);
                                    str3 = str3;
                                    iZzp = iIntValue3;
                                    listZzo = zzfzoVarZzo;
                                    iZzd = iZzd;
                                    iZzg2 = iZzg2;
                                    iZzn = iIntValue2;
                                } else if (iZzg3 == 1767990114) {
                                    zzedVar2.zzL(iZzd + 9);
                                    int iZzb = zzgcr.zzb(zzedVar2.zzv());
                                    byte[] bArr6 = new byte[iZzb];
                                    zzedVar2.zzH(bArr6, 0, iZzb);
                                    listZzo = zzfzo.zzo(bArr6);
                                }
                            }
                            str3 = str3;
                            iZzn = iZzn;
                            iZzd = iZzd;
                            iZzg2 = iZzg2;
                        }
                        i14 = 2;
                    }
                    iZzn = iZzn;
                    str3 = str3;
                }
                if (i16 != -1) {
                    zzaieVarZzl = zzl(zzedVar2, i16);
                    String str5 = zzaieVarZzl.zza;
                    byte[] bArr7 = zzaieVarZzl.zzb;
                    if (bArr7 != null) {
                        if ("audio/vorbis".equals(str5)) {
                            zzed zzedVar4 = new zzed(bArr7);
                            zzedVar4.zzM(1);
                            int i25 = 0;
                            while (zzedVar4.zzb() > 0 && zzedVar4.zzf() == 255) {
                                zzedVar4.zzM(1);
                                i25 += 255;
                            }
                            int iZzm5 = zzedVar4.zzm() + i25;
                            int i26 = 0;
                            while (true) {
                                iZzd = iZzd;
                                if (zzedVar4.zzb() <= 0 || zzedVar4.zzf() != 255) {
                                    break;
                                }
                                zzedVar4.zzM(1);
                                i26 += 255;
                                iZzd = iZzd;
                            }
                            int iZzm6 = zzedVar4.zzm() + i26;
                            byte[] bArr8 = new byte[iZzm5];
                            int iZzd3 = zzedVar4.zzd();
                            System.arraycopy(bArr7, iZzd3, bArr8, 0, iZzm5);
                            int i27 = iZzd3 + iZzm5 + iZzm6;
                            int length = bArr7.length - i27;
                            byte[] bArr9 = new byte[length];
                            System.arraycopy(bArr7, i27, bArr9, 0, length);
                            listZzo = zzfzo.zzp(bArr8, bArr9);
                        } else {
                            iZzd = iZzd;
                            iZzg2 = iZzg2;
                            if ("audio/mp4a-latm".equals(str5)) {
                                zzabm zzabmVarZza = zzabo.zza(bArr7);
                                iZzn = zzabmVarZza.zza;
                                iZzp = zzabmVarZza.zzb;
                                str3 = zzabmVarZza.zzc;
                            } else {
                                str3 = str3;
                            }
                            listZzo = zzfzo.zzo(bArr7);
                        }
                        str2 = str5;
                    } else {
                        iZzd = iZzd;
                    }
                    str3 = str3;
                    str2 = str5;
                } else {
                    str3 = str3;
                }
            }
            iZzd += iZzg2;
            zzedVar2 = zzedVar;
            i17 = i11;
        }
        String str6 = str3;
        if (zzaiiVar.zzb != null || str2 == null) {
            return;
        }
        zzab zzabVar3 = new zzab();
        zzabVar3.zzK(i12);
        zzabVar3.zzZ(str2);
        zzabVar3.zzA(str6);
        zzabVar3.zzz(iZzp);
        zzabVar3.zzaa(iZzn);
        zzabVar3.zzT(i20);
        zzabVar3.zzM(listZzo);
        zzabVar3.zzF(zzwVarZzb);
        zzabVar3.zzP(str);
        if (zzaieVarZzl != null) {
            zzabVar3.zzy(zzgcr.zze(zzaieVarZzl.zzc));
            zzabVar3.zzU(zzgcr.zze(zzaieVarZzl.zzd));
        }
        zzaiiVar.zzb = zzabVar3.zzaf();
    }
}
