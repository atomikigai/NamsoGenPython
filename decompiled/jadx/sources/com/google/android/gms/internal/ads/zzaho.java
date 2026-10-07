package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.webkit.TracingConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaho {
    public byte[] zzN;
    public zzady zzT;
    public boolean zzU;
    public zzadx zzW;
    public int zzX;
    private int zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzadw zzi;
    public byte[] zzj;
    public zzw zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = zzbbs.zzq.zzf;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private String zzZ = "eng";

    private static Pair zzf(zzed zzedVar) throws zzbh {
        try {
            zzedVar.zzM(16);
            long jZzs = zzedVar.zzs();
            if (jZzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzs != 826496599) {
                zzdt.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzd = zzedVar.zzd() + 20;
            byte[] bArrZzN = zzedVar.zzN();
            while (true) {
                int length = bArrZzN.length;
                if (iZzd >= length - 4) {
                    throw zzbh.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iZzd + 1;
                if (bArrZzN[iZzd] == 0 && bArrZzN[i] == 0 && bArrZzN[iZzd + 2] == 1 && bArrZzN[iZzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzN, iZzd, length)));
                }
                iZzd = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbh.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbh {
        int i;
        int i10;
        try {
            if (bArr[0] != 2) {
                throw zzbh.zza("Error parsing vorbis codec private", null);
            }
            int i11 = 0;
            int i12 = 1;
            while (true) {
                int i13 = bArr[i12];
                i12++;
                i = i13 & 255;
                if (i != 255) {
                    break;
                }
                i11 += 255;
            }
            int i14 = i11 + i;
            int i15 = 0;
            while (true) {
                int i16 = bArr[i12];
                i12++;
                i10 = i16 & 255;
                if (i10 != 255) {
                    break;
                }
                i15 += 255;
            }
            int i17 = i15 + i10;
            if (bArr[i12] != 1) {
                throw zzbh.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i12, bArr2, 0, i14);
            int i18 = i12 + i14;
            if (bArr[i18] != 3) {
                throw zzbh.zza("Error parsing vorbis codec private", null);
            }
            int i19 = i18 + i17;
            if (bArr[i19] != 5) {
                throw zzbh.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i19;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i19, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbh.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzed zzedVar) throws zzbh {
        try {
            int iZzk = zzedVar.zzk();
            if (iZzk == 1) {
                return true;
            }
            if (iZzk == 65534) {
                zzedVar.zzL(24);
                if (zzedVar.zzt() == zzahq.zze.getMostSignificantBits() && zzedVar.zzt() == zzahq.zze.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbh.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzbh {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbh.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x018f  */
    /* JADX WARN: Code duplicated, block: B:121:0x01eb A[PHI: r9
      0x01eb: PHI (r9v7 int) = (r9v1 int), (r9v2 int), (r9v3 int), (r9v4 int), (r9v5 int), (r9v6 int), (r9v0 int) binds: [B:140:0x0269, B:135:0x0239, B:132:0x021b, B:130:0x0216, B:128:0x0211, B:126:0x020d, B:120:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:177:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:178:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:182:0x03da  */
    /* JADX WARN: Code duplicated, block: B:184:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:199:0x040b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0410  */
    /* JADX WARN: Code duplicated, block: B:204:0x0416  */
    /* JADX WARN: Code duplicated, block: B:227:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:232:0x0511  */
    /* JADX WARN: Code duplicated, block: B:250:0x055c  */
    /* JADX WARN: Code duplicated, block: B:252:0x057c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0584  */
    /* JADX WARN: Code duplicated, block: B:269:0x05b3  */
    public final void zze(zzacu zzacuVar, int i) throws zzbh {
        byte b10;
        List list;
        String str;
        String str2;
        List listZzo;
        int i10;
        List listZzg;
        int i11;
        List list2;
        List list3;
        String str3;
        int i12;
        zzab zzabVar;
        int i13;
        int iIntValue;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        zzacn zzacnVarZza;
        List listSingletonList;
        String str4 = this.zzb;
        int iZzn = 4;
        int i18 = 0;
        switch (str4) {
            case "V_MPEG4/ISO/AP":
                b10 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b10 = 4;
                break;
            case "A_MS/ACM":
                b10 = 23;
                break;
            case "A_TRUEHD":
                b10 = 18;
                break;
            case "A_VORBIS":
                b10 = 11;
                break;
            case "A_MPEG/L2":
                b10 = 14;
                break;
            case "A_MPEG/L3":
                b10 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b10 = 9;
                break;
            case "S_DVBSUB":
                b10 = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b10 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b10 = 7;
                break;
            case "S_VOBSUB":
                b10 = 30;
                break;
            case "A_DTS/LOSSLESS":
                b10 = 21;
                break;
            case "A_AAC":
                b10 = 13;
                break;
            case "A_AC3":
                b10 = 16;
                break;
            case "A_DTS":
                b10 = 19;
                break;
            case "V_AV1":
                b10 = 2;
                break;
            case "V_VP8":
                b10 = 0;
                break;
            case "V_VP9":
                b10 = 1;
                break;
            case "S_HDMV/PGS":
                b10 = 31;
                break;
            case "V_THEORA":
                b10 = 10;
                break;
            case "A_DTS/EXPRESS":
                b10 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b10 = 26;
                break;
            case "A_PCM/INT/BIG":
                b10 = 25;
                break;
            case "A_PCM/INT/LIT":
                b10 = 24;
                break;
            case "S_TEXT/ASS":
                b10 = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b10 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b10 = 29;
                break;
            case "S_TEXT/UTF8":
                b10 = 27;
                break;
            case "V_MPEG2":
                b10 = 3;
                break;
            case "A_EAC3":
                b10 = 17;
                break;
            case "A_FLAC":
                b10 = 22;
                break;
            case "A_OPUS":
                b10 = 12;
                break;
            default:
                b10 = -1;
                break;
        }
        String str5 = "audio/raw";
        zzm zzmVarZzg = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b10) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null && (zzacnVarZza = zzacn.zza(new zzed(this.zzN))) != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z4 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i19 = (z4 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                } else if (zzbg.zzi(str3)) {
                    if (this.zzq == 0) {
                        i16 = this.zzo;
                        iIntValue = -1;
                        if (i16 == -1) {
                            i16 = this.zzl;
                        }
                        this.zzo = i16;
                        i17 = this.zzp;
                        if (i17 == -1) {
                            i17 = this.zzm;
                        }
                        this.zzp = i17;
                    } else {
                        iIntValue = -1;
                    }
                    i14 = this.zzo;
                    if (i14 != iIntValue || (i15 = this.zzp) == iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = (this.zzm * i14) / (this.zzl * i15);
                    }
                    if (this.zzx) {
                        if (this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f && this.zzM != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) this.zzB);
                            byteBufferOrder.putShort((short) this.zzC);
                        }
                        zzk zzkVar = new zzk();
                        zzkVar.zzc(this.zzy);
                        zzkVar.zzb(this.zzA);
                        zzkVar.zzd(this.zzz);
                        zzkVar.zze(bArr);
                        zzkVar.zzf(this.zzn);
                        zzkVar.zza(this.zzn);
                        zzmVarZzg = zzkVar.zzg();
                    }
                    if (this.zza != null && zzahq.zzf.containsKey(this.zza)) {
                        iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                    }
                    if (this.zzr == 0 || Float.compare(this.zzs, 0.0f) != 0 || Float.compare(this.zzt, 0.0f) != 0) {
                        i18 = iIntValue;
                    } else if (Float.compare(this.zzu, 0.0f) != 0) {
                        if (Float.compare(this.zzu, 90.0f) == 0) {
                            i18 = 90;
                        } else if (Float.compare(this.zzu, -180.0f) == 0 || Float.compare(this.zzu, 180.0f) == 0) {
                            i18 = 180;
                        } else if (Float.compare(this.zzu, -90.0f) == 0) {
                            i18 = 270;
                        } else {
                            i18 = iIntValue;
                        }
                    }
                    zzabVar.zzae(this.zzl);
                    zzabVar.zzJ(this.zzm);
                    zzabVar.zzV(f10);
                    zzabVar.zzY(i18);
                    zzabVar.zzW(this.zzv);
                    zzabVar.zzac(this.zzw);
                    zzabVar.zzB(zzmVarZzg);
                    i13 = 2;
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzbh.zza("Unexpected MIME type.", null);
                    }
                    i13 = 3;
                }
                if (this.zza != null && !zzahq.zzf.containsKey(this.zza)) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i19);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf = zzabVar.zzaf();
                zzadx zzadxVarZzw = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw;
                zzadxVarZzw.zzl(zzadVarZzaf);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z10 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i110 = (z10 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder2.put((byte) 0);
                                byteBufferOrder2.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder2.putShort((short) this.zzB);
                                byteBufferOrder2.putShort((short) this.zzC);
                            }
                            zzk zzkVar2 = new zzk();
                            zzkVar2.zzc(this.zzy);
                            zzkVar2.zzb(this.zzA);
                            zzkVar2.zzd(this.zzz);
                            zzkVar2.zze(bArr);
                            zzkVar2.zzf(this.zzn);
                            zzkVar2.zza(this.zzn);
                            zzmVarZzg = zzkVar2.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i110);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf2 = zzabVar.zzaf();
                zzadx zzadxVarZzw2 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw2;
                zzadxVarZzw2.zzl(zzadVarZzaf2);
                return;
            case 2:
                str5 = "video/av01";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z11 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i111 = (z11 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder3.put((byte) 0);
                                byteBufferOrder3.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder3.putShort((short) this.zzB);
                                byteBufferOrder3.putShort((short) this.zzC);
                            }
                            zzk zzkVar3 = new zzk();
                            zzkVar3.zzc(this.zzy);
                            zzkVar3.zzb(this.zzA);
                            zzkVar3.zzd(this.zzz);
                            zzkVar3.zze(bArr);
                            zzkVar3.zzf(this.zzn);
                            zzkVar3.zza(this.zzn);
                            zzmVarZzg = zzkVar3.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i111);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf3 = zzabVar.zzaf();
                zzadx zzadxVarZzw3 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw3;
                zzadxVarZzw3.zzl(zzadVarZzaf3);
                return;
            case 3:
                str5 = "video/mpeg2";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z12 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i112 = (z12 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder4.put((byte) 0);
                                byteBufferOrder4.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder4.putShort((short) this.zzB);
                                byteBufferOrder4.putShort((short) this.zzC);
                            }
                            zzk zzkVar4 = new zzk();
                            zzkVar4.zzc(this.zzy);
                            zzkVar4.zzb(this.zzA);
                            zzkVar4.zzd(this.zzz);
                            zzkVar4.zze(bArr);
                            zzkVar4.zzf(this.zzn);
                            zzkVar4.zza(this.zzn);
                            zzmVarZzg = zzkVar4.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i112);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf4 = zzabVar.zzaf();
                zzadx zzadxVarZzw4 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw4;
                zzadxVarZzw4.zzl(zzadVarZzaf4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                str5 = "video/mp4v-es";
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str2 = null;
                listZzo = listSingletonList;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z13 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i113 = (z13 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder5.putShort((short) this.zzB);
                                byteBufferOrder5.putShort((short) this.zzC);
                            }
                            zzk zzkVar5 = new zzk();
                            zzkVar5.zzc(this.zzy);
                            zzkVar5.zzb(this.zzA);
                            zzkVar5.zzd(this.zzz);
                            zzkVar5.zze(bArr);
                            zzkVar5.zzf(this.zzn);
                            zzkVar5.zza(this.zzn);
                            zzmVarZzg = zzkVar5.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i113);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf5 = zzabVar.zzaf();
                zzadx zzadxVarZzw5 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw5;
                zzadxVarZzw5.zzl(zzadVarZzaf5);
                return;
            case 7:
                zzabv zzabvVarZza = zzabv.zza(new zzed(zzi(this.zzb)));
                list = zzabvVarZza.zza;
                this.zzX = zzabvVarZza.zzb;
                str = zzabvVarZza.zzl;
                str5 = "video/avc";
                str2 = str;
                listZzo = list;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z14 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i114 = (z14 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder6.put((byte) 0);
                                byteBufferOrder6.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder6.putShort((short) this.zzB);
                                byteBufferOrder6.putShort((short) this.zzC);
                            }
                            zzk zzkVar6 = new zzk();
                            zzkVar6.zzc(this.zzy);
                            zzkVar6.zzb(this.zzA);
                            zzkVar6.zzd(this.zzz);
                            zzkVar6.zze(bArr);
                            zzkVar6.zzf(this.zzn);
                            zzkVar6.zza(this.zzn);
                            zzmVarZzg = zzkVar6.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i114);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf6 = zzabVar.zzaf();
                zzadx zzadxVarZzw6 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw6;
                zzadxVarZzw6.zzl(zzadVarZzaf6);
                return;
            case 8:
                zzadg zzadgVarZza = zzadg.zza(new zzed(zzi(this.zzb)));
                list = zzadgVarZza.zza;
                this.zzX = zzadgVarZza.zzb;
                str = zzadgVarZza.zzk;
                str5 = "video/hevc";
                str2 = str;
                listZzo = list;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z15 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i115 = (z15 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder7.putShort((short) this.zzB);
                                byteBufferOrder7.putShort((short) this.zzC);
                            }
                            zzk zzkVar7 = new zzk();
                            zzkVar7.zzc(this.zzy);
                            zzkVar7.zzb(this.zzA);
                            zzkVar7.zzd(this.zzz);
                            zzkVar7.zze(bArr);
                            zzkVar7.zzf(this.zzn);
                            zzkVar7.zza(this.zzn);
                            zzmVarZzg = zzkVar7.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i115);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf7 = zzabVar.zzaf();
                zzadx zzadxVarZzw7 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw7;
                zzadxVarZzw7.zzl(zzadVarZzaf7);
                return;
            case 9:
                Pair pairZzf = zzf(new zzed(zzi(this.zzb)));
                str5 = (String) pairZzf.first;
                listSingletonList = (List) pairZzf.second;
                str2 = null;
                listZzo = listSingletonList;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z16 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i116 = (z16 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder8.putShort((short) this.zzB);
                                byteBufferOrder8.putShort((short) this.zzC);
                            }
                            zzk zzkVar8 = new zzk();
                            zzkVar8.zzc(this.zzy);
                            zzkVar8.zzb(this.zzA);
                            zzkVar8.zzd(this.zzz);
                            zzkVar8.zze(bArr);
                            zzkVar8.zzf(this.zzn);
                            zzkVar8.zza(this.zzn);
                            zzmVarZzg = zzkVar8.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i116);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf8 = zzabVar.zzaf();
                zzadx zzadxVarZzw8 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw8;
                zzadxVarZzw8.zzl(zzadVarZzaf8);
                return;
            case 10:
                str5 = "video/x-unknown";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z17 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i117 = (z17 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder9.put((byte) 0);
                                byteBufferOrder9.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder9.putShort((short) this.zzB);
                                byteBufferOrder9.putShort((short) this.zzC);
                            }
                            zzk zzkVar9 = new zzk();
                            zzkVar9.zzc(this.zzy);
                            zzkVar9.zzb(this.zzA);
                            zzkVar9.zzd(this.zzz);
                            zzkVar9.zze(bArr);
                            zzkVar9.zzf(this.zzn);
                            zzkVar9.zza(this.zzn);
                            zzmVarZzg = zzkVar9.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i117);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf9 = zzabVar.zzaf();
                zzadx zzadxVarZzw9 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw9;
                zzadxVarZzw9.zzl(zzadVarZzaf9);
                return;
            case 11:
                i10 = 8192;
                str5 = "audio/vorbis";
                listZzg = zzg(zzi(str4));
                str2 = null;
                list2 = listZzg;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z18 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i118 = (z18 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder10.putShort((short) this.zzB);
                                byteBufferOrder10.putShort((short) this.zzC);
                            }
                            zzk zzkVar10 = new zzk();
                            zzkVar10.zzc(this.zzy);
                            zzkVar10.zzb(this.zzA);
                            zzkVar10.zzd(this.zzz);
                            zzkVar10.zze(bArr);
                            zzkVar10.zzf(this.zzn);
                            zzkVar10.zza(this.zzn);
                            zzmVarZzg = zzkVar10.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i118);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf10 = zzabVar.zzaf();
                zzadx zzadxVarZzw10 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw10;
                zzadxVarZzw10.zzl(zzadVarZzaf10);
                return;
            case 12:
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzb));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.zzR).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzS).array());
                i10 = 5760;
                str5 = "audio/opus";
                listZzg = arrayList;
                str2 = null;
                list2 = listZzg;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z19 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i119 = (z19 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder11.putShort((short) this.zzB);
                                byteBufferOrder11.putShort((short) this.zzC);
                            }
                            zzk zzkVar11 = new zzk();
                            zzkVar11.zzc(this.zzy);
                            zzkVar11.zzb(this.zzA);
                            zzkVar11.zzd(this.zzz);
                            zzkVar11.zze(bArr);
                            zzkVar11.zzf(this.zzn);
                            zzkVar11.zza(this.zzn);
                            zzmVarZzg = zzkVar11.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i119);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf11 = zzabVar.zzaf();
                zzadx zzadxVarZzw11 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw11;
                zzadxVarZzw11.zzl(zzadVarZzaf11);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(zzi(str4));
                zzabm zzabmVarZza = zzabo.zza(this.zzj);
                this.zzQ = zzabmVarZza.zza;
                this.zzO = zzabmVarZza.zzb;
                str5 = "audio/mp4a-latm";
                str2 = zzabmVarZza.zzc;
                listZzo = listSingletonList2;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z110 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1110 = (z110 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder12.putShort((short) this.zzB);
                                byteBufferOrder12.putShort((short) this.zzC);
                            }
                            zzk zzkVar12 = new zzk();
                            zzkVar12.zzc(this.zzy);
                            zzkVar12.zzb(this.zzA);
                            zzkVar12.zzd(this.zzz);
                            zzkVar12.zze(bArr);
                            zzkVar12.zzf(this.zzn);
                            zzkVar12.zza(this.zzn);
                            zzmVarZzg = zzkVar12.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1110);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf12 = zzabVar.zzaf();
                zzadx zzadxVarZzw12 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw12;
                zzadxVarZzw12.zzl(zzadVarZzaf12);
                return;
            case 14:
                i11 = 4096;
                str5 = "audio/mpeg-L2";
                i10 = i11;
                list2 = null;
                str2 = null;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z111 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1111 = (z111 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder13.putShort((short) this.zzB);
                                byteBufferOrder13.putShort((short) this.zzC);
                            }
                            zzk zzkVar13 = new zzk();
                            zzkVar13.zzc(this.zzy);
                            zzkVar13.zzb(this.zzA);
                            zzkVar13.zzd(this.zzz);
                            zzkVar13.zze(bArr);
                            zzkVar13.zzf(this.zzn);
                            zzkVar13.zza(this.zzn);
                            zzmVarZzg = zzkVar13.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1111);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf13 = zzabVar.zzaf();
                zzadx zzadxVarZzw13 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw13;
                zzadxVarZzw13.zzl(zzadVarZzaf13);
                return;
            case 15:
                i11 = 4096;
                str5 = "audio/mpeg";
                i10 = i11;
                list2 = null;
                str2 = null;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z112 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1112 = (z112 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder14.putShort((short) this.zzB);
                                byteBufferOrder14.putShort((short) this.zzC);
                            }
                            zzk zzkVar14 = new zzk();
                            zzkVar14.zzc(this.zzy);
                            zzkVar14.zzb(this.zzA);
                            zzkVar14.zzd(this.zzz);
                            zzkVar14.zze(bArr);
                            zzkVar14.zzf(this.zzn);
                            zzkVar14.zza(this.zzn);
                            zzmVarZzg = zzkVar14.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1112);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf14 = zzabVar.zzaf();
                zzadx zzadxVarZzw14 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw14;
                zzadxVarZzw14.zzl(zzadVarZzaf14);
                return;
            case 16:
                str5 = "audio/ac3";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z113 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1113 = (z113 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder15.putShort((short) this.zzB);
                                byteBufferOrder15.putShort((short) this.zzC);
                            }
                            zzk zzkVar15 = new zzk();
                            zzkVar15.zzc(this.zzy);
                            zzkVar15.zzb(this.zzA);
                            zzkVar15.zzd(this.zzz);
                            zzkVar15.zze(bArr);
                            zzkVar15.zzf(this.zzn);
                            zzkVar15.zza(this.zzn);
                            zzmVarZzg = zzkVar15.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1113);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf15 = zzabVar.zzaf();
                zzadx zzadxVarZzw15 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw15;
                zzadxVarZzw15.zzl(zzadVarZzaf15);
                return;
            case 17:
                str5 = "audio/eac3";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z114 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1114 = (z114 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder16.putShort((short) this.zzB);
                                byteBufferOrder16.putShort((short) this.zzC);
                            }
                            zzk zzkVar16 = new zzk();
                            zzkVar16.zzc(this.zzy);
                            zzkVar16.zzb(this.zzA);
                            zzkVar16.zzd(this.zzz);
                            zzkVar16.zze(bArr);
                            zzkVar16.zzf(this.zzn);
                            zzkVar16.zza(this.zzn);
                            zzmVarZzg = zzkVar16.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1114);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf16 = zzabVar.zzaf();
                zzadx zzadxVarZzw16 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw16;
                zzadxVarZzw16.zzl(zzadVarZzaf16);
                return;
            case 18:
                this.zzT = new zzady();
                str5 = "audio/true-hd";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z115 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1115 = (z115 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder17.putShort((short) this.zzB);
                                byteBufferOrder17.putShort((short) this.zzC);
                            }
                            zzk zzkVar17 = new zzk();
                            zzkVar17.zzc(this.zzy);
                            zzkVar17.zzb(this.zzA);
                            zzkVar17.zzd(this.zzz);
                            zzkVar17.zze(bArr);
                            zzkVar17.zzf(this.zzn);
                            zzkVar17.zza(this.zzn);
                            zzmVarZzg = zzkVar17.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1115);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf17 = zzabVar.zzaf();
                zzadx zzadxVarZzw17 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw17;
                zzadxVarZzw17.zzl(zzadVarZzaf17);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z116 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1116 = (z116 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder18.putShort((short) this.zzB);
                                byteBufferOrder18.putShort((short) this.zzC);
                            }
                            zzk zzkVar18 = new zzk();
                            zzkVar18.zzc(this.zzy);
                            zzkVar18.zzb(this.zzA);
                            zzkVar18.zzd(this.zzz);
                            zzkVar18.zze(bArr);
                            zzkVar18.zzf(this.zzn);
                            zzkVar18.zza(this.zzn);
                            zzmVarZzg = zzkVar18.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1116);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf18 = zzabVar.zzaf();
                zzadx zzadxVarZzw18 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw18;
                zzadxVarZzw18.zzl(zzadVarZzaf18);
                return;
            case zzbbs.zzt.zzm /* 21 */:
                str5 = "audio/vnd.dts.hd";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z117 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1117 = (z117 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder19.putShort((short) this.zzB);
                                byteBufferOrder19.putShort((short) this.zzC);
                            }
                            zzk zzkVar19 = new zzk();
                            zzkVar19.zzc(this.zzy);
                            zzkVar19.zzb(this.zzA);
                            zzkVar19.zzd(this.zzz);
                            zzkVar19.zze(bArr);
                            zzkVar19.zzf(this.zzn);
                            zzkVar19.zza(this.zzn);
                            zzmVarZzg = zzkVar19.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1117);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf19 = zzabVar.zzaf();
                zzadx zzadxVarZzw19 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw19;
                zzadxVarZzw19.zzl(zzadVarZzaf19);
                return;
            case 22:
                str5 = "audio/flac";
                listSingletonList = Collections.singletonList(zzi(str4));
                str2 = null;
                listZzo = listSingletonList;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z118 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i1118 = (z118 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder110.putShort((short) this.zzB);
                                byteBufferOrder110.putShort((short) this.zzC);
                            }
                            zzk zzkVar110 = new zzk();
                            zzkVar110.zzc(this.zzy);
                            zzkVar110.zzb(this.zzA);
                            zzkVar110.zzd(this.zzz);
                            zzkVar110.zze(bArr);
                            zzkVar110.zzf(this.zzn);
                            zzkVar110.zza(this.zzn);
                            zzmVarZzg = zzkVar110.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i1118);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf110 = zzabVar.zzaf();
                zzadx zzadxVarZzw110 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw110;
                zzadxVarZzw110.zzl(zzadVarZzaf110);
                return;
            case 23:
                if (zzh(new zzed(zzi(this.zzb)))) {
                    iZzn = zzen.zzn(this.zzP);
                    if (iZzn == 0) {
                        zzdt.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    } else {
                        list3 = null;
                        str2 = null;
                        i10 = -1;
                    }
                    if (this.zzN != null) {
                        str2 = zzacnVarZza.zza;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.zzV;
                    if (true != this.zzU) {
                        i12 = 0;
                    } else {
                        i12 = 2;
                    }
                    int i1119 = (z119 ? 1 : 0) | i12;
                    zzabVar = new zzab();
                    if (!zzbg.zzg(str3)) {
                        if (zzbg.zzi(str3)) {
                            if (this.zzq == 0) {
                                i16 = this.zzo;
                                iIntValue = -1;
                                if (i16 == -1) {
                                    i16 = this.zzl;
                                }
                                this.zzo = i16;
                                i17 = this.zzp;
                                if (i17 == -1) {
                                    i17 = this.zzm;
                                }
                                this.zzp = i17;
                            } else {
                                iIntValue = -1;
                            }
                            i14 = this.zzo;
                            if (i14 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.zzx) {
                                if (this.zzD != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder111.put((byte) 0);
                                    byteBufferOrder111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzL + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzM + 0.5f));
                                    byteBufferOrder111.putShort((short) this.zzB);
                                    byteBufferOrder111.putShort((short) this.zzC);
                                }
                                zzk zzkVar111 = new zzk();
                                zzkVar111.zzc(this.zzy);
                                zzkVar111.zzb(this.zzA);
                                zzkVar111.zzd(this.zzz);
                                zzkVar111.zze(bArr);
                                zzkVar111.zzf(this.zzn);
                                zzkVar111.zza(this.zzn);
                                zzmVarZzg = zzkVar111.zzg();
                            }
                            if (this.zza != null) {
                                iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                            }
                            if (this.zzr == 0) {
                                i18 = iIntValue;
                            } else {
                                i18 = iIntValue;
                            }
                            zzabVar.zzae(this.zzl);
                            zzabVar.zzJ(this.zzm);
                            zzabVar.zzV(f10);
                            zzabVar.zzY(i18);
                            zzabVar.zzW(this.zzv);
                            zzabVar.zzac(this.zzw);
                            zzabVar.zzB(zzmVarZzg);
                            i13 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i13 = 3;
                        }
                        break;
                    } else {
                        zzabVar.zzz(this.zzO);
                        zzabVar.zzaa(this.zzQ);
                        zzabVar.zzT(iZzn);
                        i13 = 1;
                    }
                    if (this.zza != null) {
                        zzabVar.zzN(this.zza);
                    }
                    zzabVar.zzK(i);
                    zzabVar.zzZ(str3);
                    zzabVar.zzQ(i10);
                    zzabVar.zzP(this.zzZ);
                    zzabVar.zzab(i1119);
                    zzabVar.zzM(list3);
                    zzabVar.zzA(str2);
                    zzabVar.zzF(this.zzk);
                    zzad zzadVarZzaf111 = zzabVar.zzaf();
                    zzadx zzadxVarZzw111 = zzacuVar.zzw(this.zzc, i13);
                    this.zzW = zzadxVarZzw111;
                    zzadxVarZzw111.zzl(zzadVarZzaf111);
                    return;
                }
                zzdt.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listZzo = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1110 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11110 = (z1110 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder112.putShort((short) this.zzB);
                                byteBufferOrder112.putShort((short) this.zzC);
                            }
                            zzk zzkVar112 = new zzk();
                            zzkVar112.zzc(this.zzy);
                            zzkVar112.zzb(this.zzA);
                            zzkVar112.zzd(this.zzz);
                            zzkVar112.zze(bArr);
                            zzkVar112.zzf(this.zzn);
                            zzkVar112.zza(this.zzn);
                            zzmVarZzg = zzkVar112.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11110);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf112 = zzabVar.zzaf();
                zzadx zzadxVarZzw112 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw112;
                zzadxVarZzw112.zzl(zzadVarZzaf112);
                return;
            case 24:
                iZzn = zzen.zzn(this.zzP);
                if (iZzn == 0) {
                    zzdt.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    listZzo = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i10 = -1;
                    list2 = listZzo;
                    iZzn = -1;
                    list3 = list2;
                } else {
                    list3 = null;
                    str2 = null;
                    i10 = -1;
                }
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1111 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11111 = (z1111 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder113.putShort((short) this.zzB);
                                byteBufferOrder113.putShort((short) this.zzC);
                            }
                            zzk zzkVar113 = new zzk();
                            zzkVar113.zzc(this.zzy);
                            zzkVar113.zzb(this.zzA);
                            zzkVar113.zzd(this.zzz);
                            zzkVar113.zze(bArr);
                            zzkVar113.zzf(this.zzn);
                            zzkVar113.zza(this.zzn);
                            zzmVarZzg = zzkVar113.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11111);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf113 = zzabVar.zzaf();
                zzadx zzadxVarZzw113 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw113;
                zzadxVarZzw113.zzl(zzadVarZzaf113);
                return;
            case 25:
                int i20 = this.zzP;
                if (i20 == 8) {
                    iZzn = 3;
                } else if (i20 == 16) {
                    iZzn = 268435456;
                } else if (i20 == 24) {
                    iZzn = 1342177280;
                } else {
                    if (i20 != 32) {
                        zzdt.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                        listZzo = null;
                        str2 = null;
                        str5 = "audio/x-unknown";
                        i10 = -1;
                        list2 = listZzo;
                        iZzn = -1;
                        list3 = list2;
                        if (this.zzN != null) {
                            str2 = zzacnVarZza.zza;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z1112 = this.zzV;
                        if (true != this.zzU) {
                            i12 = 0;
                        } else {
                            i12 = 2;
                        }
                        int i11112 = (z1112 ? 1 : 0) | i12;
                        zzabVar = new zzab();
                        if (!zzbg.zzg(str3)) {
                            if (zzbg.zzi(str3)) {
                                if (this.zzq == 0) {
                                    i16 = this.zzo;
                                    iIntValue = -1;
                                    if (i16 == -1) {
                                        i16 = this.zzl;
                                    }
                                    this.zzo = i16;
                                    i17 = this.zzp;
                                    if (i17 == -1) {
                                        i17 = this.zzm;
                                    }
                                    this.zzp = i17;
                                } else {
                                    iIntValue = -1;
                                }
                                i14 = this.zzo;
                                if (i14 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.zzx) {
                                    if (this.zzD != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder114.put((byte) 0);
                                        byteBufferOrder114.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzL + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzM + 0.5f));
                                        byteBufferOrder114.putShort((short) this.zzB);
                                        byteBufferOrder114.putShort((short) this.zzC);
                                    }
                                    zzk zzkVar114 = new zzk();
                                    zzkVar114.zzc(this.zzy);
                                    zzkVar114.zzb(this.zzA);
                                    zzkVar114.zzd(this.zzz);
                                    zzkVar114.zze(bArr);
                                    zzkVar114.zzf(this.zzn);
                                    zzkVar114.zza(this.zzn);
                                    zzmVarZzg = zzkVar114.zzg();
                                }
                                if (this.zza != null) {
                                    iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                                }
                                if (this.zzr == 0) {
                                    i18 = iIntValue;
                                } else {
                                    i18 = iIntValue;
                                }
                                zzabVar.zzae(this.zzl);
                                zzabVar.zzJ(this.zzm);
                                zzabVar.zzV(f10);
                                zzabVar.zzY(i18);
                                zzabVar.zzW(this.zzv);
                                zzabVar.zzac(this.zzw);
                                zzabVar.zzB(zzmVarZzg);
                                i13 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i13 = 3;
                            }
                            break;
                        } else {
                            zzabVar.zzz(this.zzO);
                            zzabVar.zzaa(this.zzQ);
                            zzabVar.zzT(iZzn);
                            i13 = 1;
                        }
                        if (this.zza != null) {
                            zzabVar.zzN(this.zza);
                        }
                        zzabVar.zzK(i);
                        zzabVar.zzZ(str3);
                        zzabVar.zzQ(i10);
                        zzabVar.zzP(this.zzZ);
                        zzabVar.zzab(i11112);
                        zzabVar.zzM(list3);
                        zzabVar.zzA(str2);
                        zzabVar.zzF(this.zzk);
                        zzad zzadVarZzaf114 = zzabVar.zzaf();
                        zzadx zzadxVarZzw114 = zzacuVar.zzw(this.zzc, i13);
                        this.zzW = zzadxVarZzw114;
                        zzadxVarZzw114.zzl(zzadVarZzaf114);
                        return;
                    }
                    iZzn = 1610612736;
                }
                list3 = null;
                str2 = null;
                i10 = -1;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1113 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11113 = (z1113 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder115.putShort((short) this.zzB);
                                byteBufferOrder115.putShort((short) this.zzC);
                            }
                            zzk zzkVar115 = new zzk();
                            zzkVar115.zzc(this.zzy);
                            zzkVar115.zzb(this.zzA);
                            zzkVar115.zzd(this.zzz);
                            zzkVar115.zze(bArr);
                            zzkVar115.zzf(this.zzn);
                            zzkVar115.zza(this.zzn);
                            zzmVarZzg = zzkVar115.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11113);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf115 = zzabVar.zzaf();
                zzadx zzadxVarZzw115 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw115;
                zzadxVarZzw115.zzl(zzadVarZzaf115);
                return;
            case 26:
                int i21 = this.zzP;
                if (i21 == 32) {
                    list3 = null;
                    str2 = null;
                    i10 = -1;
                } else {
                    zzdt.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    listZzo = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i10 = -1;
                    list2 = listZzo;
                    iZzn = -1;
                    list3 = list2;
                }
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1114 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11114 = (z1114 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder116.putShort((short) this.zzB);
                                byteBufferOrder116.putShort((short) this.zzC);
                            }
                            zzk zzkVar116 = new zzk();
                            zzkVar116.zzc(this.zzy);
                            zzkVar116.zzb(this.zzA);
                            zzkVar116.zzd(this.zzz);
                            zzkVar116.zze(bArr);
                            zzkVar116.zzf(this.zzn);
                            zzkVar116.zza(this.zzn);
                            zzmVarZzg = zzkVar116.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11114);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf116 = zzabVar.zzaf();
                zzadx zzadxVarZzw116 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw116;
                zzadxVarZzw116.zzl(zzadVarZzaf116);
                return;
            case 27:
                str5 = "application/x-subrip";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1115 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11115 = (z1115 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder117.putShort((short) this.zzB);
                                byteBufferOrder117.putShort((short) this.zzC);
                            }
                            zzk zzkVar117 = new zzk();
                            zzkVar117.zzc(this.zzy);
                            zzkVar117.zzb(this.zzA);
                            zzkVar117.zzd(this.zzz);
                            zzkVar117.zze(bArr);
                            zzkVar117.zzf(this.zzn);
                            zzkVar117.zza(this.zzn);
                            zzmVarZzg = zzkVar117.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11115);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf117 = zzabVar.zzaf();
                zzadx zzadxVarZzw117 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw117;
                zzadxVarZzw117.zzl(zzadVarZzaf117);
                return;
            case 28:
                str5 = "text/x-ssa";
                listSingletonList = zzfzo.zzp(zzahq.zzb, zzi(this.zzb));
                str2 = null;
                listZzo = listSingletonList;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1116 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11116 = (z1116 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder118.putShort((short) this.zzB);
                                byteBufferOrder118.putShort((short) this.zzC);
                            }
                            zzk zzkVar118 = new zzk();
                            zzkVar118.zzc(this.zzy);
                            zzkVar118.zzb(this.zzA);
                            zzkVar118.zzd(this.zzz);
                            zzkVar118.zze(bArr);
                            zzkVar118.zzf(this.zzn);
                            zzkVar118.zza(this.zzn);
                            zzmVarZzg = zzkVar118.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11116);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf118 = zzabVar.zzaf();
                zzadx zzadxVarZzw118 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw118;
                zzadxVarZzw118.zzl(zzadVarZzaf118);
                return;
            case 29:
                str5 = "text/vtt";
                listZzo = null;
                str2 = null;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1117 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11117 = (z1117 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder119.putShort((short) this.zzB);
                                byteBufferOrder119.putShort((short) this.zzC);
                            }
                            zzk zzkVar119 = new zzk();
                            zzkVar119.zzc(this.zzy);
                            zzkVar119.zzb(this.zzA);
                            zzkVar119.zzd(this.zzz);
                            zzkVar119.zze(bArr);
                            zzkVar119.zzf(this.zzn);
                            zzkVar119.zza(this.zzn);
                            zzmVarZzg = zzkVar119.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11117);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf119 = zzabVar.zzaf();
                zzadx zzadxVarZzw119 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw119;
                zzadxVarZzw119.zzl(zzadVarZzaf119);
                return;
            case 30:
                str2 = null;
                str5 = "application/vobsub";
                listZzo = zzfzo.zzo(zzi(str4));
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1118 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11118 = (z1118 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1110.putShort((short) this.zzB);
                                byteBufferOrder1110.putShort((short) this.zzC);
                            }
                            zzk zzkVar1110 = new zzk();
                            zzkVar1110.zzc(this.zzy);
                            zzkVar1110.zzb(this.zzA);
                            zzkVar1110.zzd(this.zzz);
                            zzkVar1110.zze(bArr);
                            zzkVar1110.zzf(this.zzn);
                            zzkVar1110.zza(this.zzn);
                            zzmVarZzg = zzkVar1110.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11118);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf1110 = zzabVar.zzaf();
                zzadx zzadxVarZzw1110 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw1110;
                zzadxVarZzw1110.zzl(zzadVarZzaf1110);
                return;
            case 31:
                listZzo = null;
                str2 = null;
                str5 = "application/pgs";
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1119 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i11119 = (z1119 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1111.putShort((short) this.zzB);
                                byteBufferOrder1111.putShort((short) this.zzC);
                            }
                            zzk zzkVar1111 = new zzk();
                            zzkVar1111.zzc(this.zzy);
                            zzkVar1111.zzb(this.zzA);
                            zzkVar1111.zzd(this.zzz);
                            zzkVar1111.zze(bArr);
                            zzkVar1111.zzf(this.zzn);
                            zzkVar1111.zza(this.zzn);
                            zzmVarZzg = zzkVar1111.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i11119);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf1111 = zzabVar.zzaf();
                zzadx zzadxVarZzw1111 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw1111;
                zzadxVarZzw1111.zzl(zzadVarZzaf1111);
                return;
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                byte[] bArr3 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr3, 0, 4);
                str5 = "application/dvbsubs";
                listSingletonList = zzfzo.zzo(bArr3);
                str2 = null;
                listZzo = listSingletonList;
                i10 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzN != null) {
                    str2 = zzacnVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z11110 = this.zzV;
                if (true != this.zzU) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                int i111110 = (z11110 ? 1 : 0) | i12;
                zzabVar = new zzab();
                if (!zzbg.zzg(str3)) {
                    if (zzbg.zzi(str3)) {
                        if (this.zzq == 0) {
                            i16 = this.zzo;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.zzl;
                            }
                            this.zzo = i16;
                            i17 = this.zzp;
                            if (i17 == -1) {
                                i17 = this.zzm;
                            }
                            this.zzp = i17;
                        } else {
                            iIntValue = -1;
                        }
                        i14 = this.zzo;
                        if (i14 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1112.putShort((short) this.zzB);
                                byteBufferOrder1112.putShort((short) this.zzC);
                            }
                            zzk zzkVar1112 = new zzk();
                            zzkVar1112.zzc(this.zzy);
                            zzkVar1112.zzb(this.zzA);
                            zzkVar1112.zzd(this.zzz);
                            zzkVar1112.zze(bArr);
                            zzkVar1112.zzf(this.zzn);
                            zzkVar1112.zza(this.zzn);
                            zzmVarZzg = zzkVar1112.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahq.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zzabVar.zzae(this.zzl);
                        zzabVar.zzJ(this.zzm);
                        zzabVar.zzV(f10);
                        zzabVar.zzY(i18);
                        zzabVar.zzW(this.zzv);
                        zzabVar.zzac(this.zzw);
                        zzabVar.zzB(zzmVarZzg);
                        i13 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i13 = 3;
                    }
                    break;
                } else {
                    zzabVar.zzz(this.zzO);
                    zzabVar.zzaa(this.zzQ);
                    zzabVar.zzT(iZzn);
                    i13 = 1;
                }
                if (this.zza != null) {
                    zzabVar.zzN(this.zza);
                }
                zzabVar.zzK(i);
                zzabVar.zzZ(str3);
                zzabVar.zzQ(i10);
                zzabVar.zzP(this.zzZ);
                zzabVar.zzab(i111110);
                zzabVar.zzM(list3);
                zzabVar.zzA(str2);
                zzabVar.zzF(this.zzk);
                zzad zzadVarZzaf1112 = zzabVar.zzaf();
                zzadx zzadxVarZzw1112 = zzacuVar.zzw(this.zzc, i13);
                this.zzW = zzadxVarZzw1112;
                zzadxVarZzw1112.zzl(zzadVarZzaf1112);
                return;
            default:
                throw zzbh.zza("Unrecognized codec identifier.", null);
        }
    }
}
