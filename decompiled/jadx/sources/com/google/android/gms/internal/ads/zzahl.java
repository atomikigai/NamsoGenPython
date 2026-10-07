package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzahl {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahs zzc = new zzahs();
    private zzahm zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzacs zzacsVar, int i) throws IOException {
        zzacsVar.zzi(this.zza, 0, i);
        long j4 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            j4 = (j4 << 8) | ((long) (this.zza[i10] & 255));
        }
        return j4;
    }

    public final void zza(zzahm zzahmVar) {
        this.zzd = zzahmVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00af A[LOOP:0: B:3:0x0005->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b A[LOOP:2: B:61:0x0133->B:64:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x013d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x014a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0171, please report this as an issue */
    public final boolean zzc(zzacs zzacsVar) throws IOException {
        int i;
        zzahn zzahnVar;
        zzahq zzahqVar;
        long j4;
        long j10;
        int i10;
        byte[] bArr;
        String str;
        int i11;
        long j11;
        int i12;
        long jZzd;
        double dLongBitsToDouble;
        int iZzb;
        int iZzc;
        zzdb.zzb(this.zzd);
        while (true) {
            zzahj zzahjVar = (zzahj) this.zzb.peek();
            if (zzahjVar != null && zzacsVar.zzf() >= zzahjVar.zzb) {
                ((zzahn) this.zzd).zza.zzj(((zzahj) this.zzb.pop()).zza);
                return true;
            }
            int i13 = this.zze;
            if (i13 != 0) {
                if (i13 == 1) {
                }
                zzahm zzahmVar = this.zzd;
                i = this.zzf;
                zzahnVar = (zzahn) zzahmVar;
                zzahqVar = zzahnVar.zza;
                switch (i) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j4 = this.zzg;
                        if (j4 <= 8) {
                            throw zzbh.zza("Invalid integer size: " + j4, null);
                        }
                        zzahnVar.zza.zzl(i, zzd(zzacsVar, (int) j4));
                        this.zze = 0;
                        return true;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        j10 = this.zzg;
                        if (j10 <= 2147483647L) {
                            throw zzbh.zza("String element size: " + j10, null);
                        }
                        i10 = (int) j10;
                        if (i10 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i10];
                            zzacsVar.zzi(bArr, 0, i10);
                            while (i10 > 0) {
                                i11 = i10 - 1;
                                if (bArr[i11] == 0) {
                                    i10 = i11;
                                } else {
                                    str = new String(bArr, 0, i10);
                                }
                            }
                            str = new String(bArr, 0, i10);
                        }
                        zzahnVar.zza.zzn(i, str);
                        this.zze = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzf = zzacsVar.zzf();
                        this.zzb.push(new zzahj(i, this.zzg + jZzf, null));
                        ((zzahn) this.zzd).zza.zzm(this.zzf, jZzf, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzahqVar.zzh(i, (int) this.zzg, zzacsVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j11 = this.zzg;
                        if (j11 == 4 && j11 != 8) {
                            throw zzbh.zza("Invalid float size: " + j11, null);
                        }
                        i12 = (int) j11;
                        jZzd = zzd(zzacsVar, i12);
                        if (i12 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                        }
                        zzahnVar.zza.zzk(i, dLongBitsToDouble);
                        this.zze = 0;
                        return true;
                    default:
                        zzacsVar.zzk((int) this.zzg);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzd2 = this.zzc.zzd(zzacsVar, true, false, 4);
                if (jZzd2 == -2) {
                    zzacsVar.zzj();
                    while (true) {
                        zzacsVar.zzh(this.zza, 0, 4);
                        iZzb = zzahs.zzb(this.zza[0]);
                        if (iZzb != -1 && iZzb <= 4) {
                            iZzc = (int) zzahs.zzc(this.zza, iZzb, false);
                            zzahq zzahqVar2 = ((zzahn) this.zzd).zza;
                            if (iZzc != 357149030 && iZzc != 524531317 && iZzc != 475249515) {
                                if (iZzc == 374648427) {
                                    iZzc = 374648427;
                                }
                            }
                        }
                        zzacsVar.zzk(1);
                    }
                    zzacsVar.zzk(iZzb);
                    jZzd2 = iZzc;
                }
                if (jZzd2 == -1) {
                    return false;
                }
                this.zzf = (int) jZzd2;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzacsVar, false, true, 8);
            this.zze = 2;
            zzahm zzahmVar2 = this.zzd;
            i = this.zzf;
            zzahnVar = (zzahn) zzahmVar2;
            zzahqVar = zzahnVar.zza;
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j4 = this.zzg;
                    if (j4 <= 8) {
                        throw zzbh.zza("Invalid integer size: " + j4, null);
                    }
                    zzahnVar.zza.zzl(i, zzd(zzacsVar, (int) j4));
                    this.zze = 0;
                    return true;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    j10 = this.zzg;
                    if (j10 <= 2147483647L) {
                        throw zzbh.zza("String element size: " + j10, null);
                    }
                    i10 = (int) j10;
                    if (i10 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i10];
                        zzacsVar.zzi(bArr, 0, i10);
                        while (i10 > 0) {
                            i11 = i10 - 1;
                            if (bArr[i11] == 0) {
                                i10 = i11;
                            } else {
                                str = new String(bArr, 0, i10);
                            }
                        }
                        str = new String(bArr, 0, i10);
                    }
                    zzahnVar.zza.zzn(i, str);
                    this.zze = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzf2 = zzacsVar.zzf();
                    this.zzb.push(new zzahj(i, this.zzg + jZzf2, null));
                    ((zzahn) this.zzd).zza.zzm(this.zzf, jZzf2, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzahqVar.zzh(i, (int) this.zzg, zzacsVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j11 = this.zzg;
                    if (j11 == 4) {
                        break;
                    }
                    i12 = (int) j11;
                    jZzd = zzd(zzacsVar, i12);
                    if (i12 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzahnVar.zza.zzk(i, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                default:
                    zzacsVar.zzk((int) this.zzg);
                    this.zze = 0;
                    break;
            }
        }
    }
}
