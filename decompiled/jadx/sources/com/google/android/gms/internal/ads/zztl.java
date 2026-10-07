package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zztl {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzsq zza() throws zztf {
        List listZzd = zzd("audio/raw", false, false);
        if (listZzd.isEmpty()) {
            return null;
        }
        return (zzsq) listZzd.get(0);
    }

    public static String zzb(zzad zzadVar) {
        Pair pairZza;
        if ("audio/eac3-joc".equals(zzadVar.zzo)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzadVar.zzo) && (pairZza = zzdd.zza(zzadVar)) != null) {
            int iIntValue = ((Integer) pairZza.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(zzadVar.zzo)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zzc(zzta zztaVar, zzad zzadVar, boolean z4, boolean z10) throws zztf {
        String strZzb = zzb(zzadVar);
        return strZzb == null ? zzfzo.zzn() : zztaVar.zza(strZzb, z4, z10);
    }

    public static synchronized List zzd(String str, boolean z4, boolean z10) throws zztf {
        try {
            zzte zzteVar = new zzte(str, z4, z10);
            HashMap map = zzb;
            List list = (List) map.get(zzteVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzg = zzg(zzteVar, new zzti(z4, z10));
            if (z4 && arrayListZzg.isEmpty() && zzen.zza <= 23) {
                arrayListZzg = zzg(zzteVar, new zzth(null));
                if (!arrayListZzg.isEmpty()) {
                    zzdt.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsq) arrayListZzg.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzen.zza < 26 && zzen.zzb.equals("R9") && arrayListZzg.size() == 1 && ((zzsq) arrayListZzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzg.add(zzsq.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzh(arrayListZzg, new zztj() { // from class: com.google.android.gms.internal.ads.zztc
                    @Override // com.google.android.gms.internal.ads.zztj
                    public final int zza(Object obj) {
                        int i = zztl.zza;
                        String str2 = ((zzsq) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzen.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzen.zza < 32 && arrayListZzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsq) arrayListZzg.get(0)).zza)) {
                arrayListZzg.add((zzsq) arrayListZzg.remove(0));
            }
            zzfzo zzfzoVarZzl = zzfzo.zzl(arrayListZzg);
            map.put(zzteVar, zzfzoVarZzl);
            return zzfzoVarZzl;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zze(zzta zztaVar, zzad zzadVar, boolean z4, boolean z10) throws zztf {
        List listZza = zztaVar.zza(zzadVar.zzo, z4, z10);
        List listZzc = zzc(zztaVar, zzadVar, z4, z10);
        zzfzl zzfzlVar = new zzfzl();
        zzfzlVar.zzh(listZza);
        zzfzlVar.zzh(listZzc);
        return zzfzlVar.zzi();
    }

    public static List zzf(List list, final zzad zzadVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zztj() { // from class: com.google.android.gms.internal.ads.zztd
            @Override // com.google.android.gms.internal.ads.zztj
            public final int zza(Object obj) {
                int i = zztl.zza;
                return ((zzsq) obj).zzd(zzadVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0183 A[Catch: Exception -> 0x018a, TryCatch #2 {Exception -> 0x018a, blocks: (B:90:0x0151, B:96:0x0168, B:102:0x017d, B:104:0x0183, B:108:0x0196), top: B:162:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0196 A[Catch: Exception -> 0x018a, TRY_LEAVE, TryCatch #2 {Exception -> 0x018a, blocks: (B:90:0x0151, B:96:0x0168, B:102:0x017d, B:104:0x0183, B:108:0x0196), top: B:162:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x019e  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ad A[Catch: Exception -> 0x01b2, TryCatch #5 {Exception -> 0x01b2, blocks: (B:113:0x01a3, B:115:0x01ad, B:127:0x01de, B:118:0x01b9, B:120:0x01c9, B:122:0x01d1), top: B:168:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01b9 A[Catch: Exception -> 0x01b2, TryCatch #5 {Exception -> 0x01b2, blocks: (B:113:0x01a3, B:115:0x01ad, B:127:0x01de, B:118:0x01b9, B:120:0x01c9, B:122:0x01d1), top: B:168:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9 A[Catch: Exception -> 0x01b2, TryCatch #5 {Exception -> 0x01b2, blocks: (B:113:0x01a3, B:115:0x01ad, B:127:0x01de, B:118:0x01b9, B:120:0x01c9, B:122:0x01d1), top: B:168:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01da  */
    /* JADX WARN: Code duplicated, block: B:127:0x01de A[Catch: Exception -> 0x01b2, TRY_LEAVE, TryCatch #5 {Exception -> 0x01b2, blocks: (B:113:0x01a3, B:115:0x01ad, B:127:0x01de, B:118:0x01b9, B:120:0x01c9, B:122:0x01d1), top: B:168:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0239 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x025b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x027f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5 A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[Catch: Exception -> 0x0034, LOOP:1: B:52:0x00cc->B:56:0x00d8, LOOP_END, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3 A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb A[EDGE_INSN: B:61:0x00eb->B:89:0x014f BREAK  A[LOOP:1: B:52:0x00cc->B:56:0x00d8]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff A[EDGE_INSN: B:67:0x00ff->B:89:0x014f BREAK  A[LOOP:1: B:52:0x00cc->B:56:0x00d8]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0104 A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x010c A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0114 A[EDGE_INSN: B:73:0x0114->B:89:0x014f BREAK  A[LOOP:1: B:52:0x00cc->B:56:0x00d8]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0117 A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011f A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012a A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0132 A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x013d A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0145 A[Catch: Exception -> 0x0034, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0233, B:149:0x0239, B:151:0x023f, B:152:0x025b, B:153:0x027e, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ee, B:64:0x00f6, B:69:0x0104, B:71:0x010c, B:74:0x0117, B:76:0x011f, B:79:0x012a, B:81:0x0132, B:84:0x013d, B:86:0x0145), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0163  */
    /* JADX WARN: Code duplicated, block: B:94:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0168 A[Catch: Exception -> 0x018a, TryCatch #2 {Exception -> 0x018a, blocks: (B:90:0x0151, B:96:0x0168, B:102:0x017d, B:104:0x0183, B:108:0x0196), top: B:162:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0178  */
    private static ArrayList zzg(zzte zzteVar, zztg zztgVar) throws zztf {
        int i;
        int i10;
        String[] supportedTypes;
        int length;
        int i11;
        String str;
        int i12;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zZzd;
        boolean zZzc;
        boolean zZzd2;
        boolean zZzc2;
        boolean zIsVendor;
        int i13;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        String strZza;
        zzte zzteVar2 = zzteVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = zzteVar2.zza;
            boolean zZze = zztgVar.zze();
            int i14 = 0;
            for (int iZza = zztgVar.zza(); i14 < iZza; iZza = i10) {
                MediaCodecInfo mediaCodecInfoZzb = zztgVar.zzb(i14);
                int i15 = zzen.zza;
                if (i15 < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i16 = iZza;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZze && name.endsWith(".secure"))) {
                        i = i14;
                        i10 = i16;
                    } else if (i15 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzen.zzc))) {
                        String str3 = zzen.zzb;
                        if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                            i = i14;
                            i10 = i16;
                        } else if (i15 > 23) {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    if (!str2.equals("video/dolby-vision")) {
                                        if (!str2.equals("video/mv-hevc")) {
                                            if (!str2.equals("audio/alac")) {
                                                if (!str2.equals("audio/flac")) {
                                                    if (!str2.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str2.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str2.equals("audio/flac")) {
                                                if (!str2.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str2.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                            str = null;
                                            break;
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i11];
                                if (str.equalsIgnoreCase(str2)) {
                                    break;
                                    break;
                                }
                                i11++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zztgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zztgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzteVar2.zzc) {
                                    if (zZzd) {
                                        zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                        zIsVendor = true;
                                        if (zzteVar2.zzb) {
                                            if (zZzd2) {
                                                zZzd2 = true;
                                                i13 = zzen.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                    i10 = i16;
                                                } else {
                                                    i10 = i16;
                                                    if (zzi(mediaCodecInfoZzb, str2)) {
                                                        zIsHardwareAccelerated = false;
                                                    } else {
                                                        zIsHardwareAccelerated = true;
                                                    }
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str2);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            int i17 = i14;
                                                            str = str;
                                                            i = i17;
                                                            i12 = 23;
                                                            arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i18 = i14;
                                                    str = str;
                                                    i = i18;
                                                    boolean z4 = zIsVendor;
                                                    i12 = 23;
                                                    boolean z10 = zZzd2;
                                                    boolean z11 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            int i19 = i14;
                                                            str = str;
                                                            i = i19;
                                                            i12 = 23;
                                                            arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i110 = i14;
                                                    str = str;
                                                    i = i110;
                                                    boolean z12 = zIsVendor;
                                                    i12 = 23;
                                                    boolean z13 = zZzd2;
                                                    boolean z14 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zZzc2) {
                                            i13 = zzen.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                i10 = i16;
                                            } else {
                                                i10 = i16;
                                                if (zzi(mediaCodecInfoZzb, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str2);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i111 = i14;
                                                        str = str;
                                                        i = i111;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i112 = i14;
                                                str = str;
                                                i = i112;
                                                boolean z15 = zIsVendor;
                                                i12 = 23;
                                                boolean z16 = zZzd2;
                                                boolean z17 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i113 = i14;
                                                        str = str;
                                                        i = i113;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i114 = i14;
                                                str = str;
                                                i = i114;
                                                boolean z18 = zIsVendor;
                                                i12 = 23;
                                                boolean z19 = zZzd2;
                                                boolean z110 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zZzc) {
                                    zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                    zIsVendor = true;
                                    if (zzteVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzen.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                i10 = i16;
                                            } else {
                                                i10 = i16;
                                                if (zzi(mediaCodecInfoZzb, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str2);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i115 = i14;
                                                        str = str;
                                                        i = i115;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i116 = i14;
                                                str = str;
                                                i = i116;
                                                boolean z111 = zIsVendor;
                                                i12 = 23;
                                                boolean z112 = zZzd2;
                                                boolean z113 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i117 = i14;
                                                        str = str;
                                                        i = i117;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i118 = i14;
                                                str = str;
                                                i = i118;
                                                boolean z114 = zIsVendor;
                                                i12 = 23;
                                                boolean z115 = zZzd2;
                                                boolean z116 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzen.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            i10 = i16;
                                        } else {
                                            i10 = i16;
                                            if (zzi(mediaCodecInfoZzb, str2)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str2);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    int i119 = i14;
                                                    str = str;
                                                    i = i119;
                                                    i12 = 23;
                                                    arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            int i1110 = i14;
                                            str = str;
                                            i = i1110;
                                            boolean z117 = zIsVendor;
                                            i12 = 23;
                                            boolean z118 = zZzd2;
                                            boolean z119 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    int i1111 = i14;
                                                    str = str;
                                                    i = i1111;
                                                    i12 = 23;
                                                    arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            int i1112 = i14;
                                            str = str;
                                            i = i1112;
                                            boolean z1110 = zIsVendor;
                                            i12 = 23;
                                            boolean z1111 = zZzd2;
                                            boolean z1112 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i14;
                                i10 = i16;
                            } else {
                                i = i14;
                                i10 = i16;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    if (!str2.equals("video/dolby-vision")) {
                                        if (!str2.equals("video/mv-hevc")) {
                                            if (!str2.equals("audio/alac")) {
                                                if (!str2.equals("audio/flac")) {
                                                    if (!str2.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str2.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str2.equals("audio/flac")) {
                                                if (!str2.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str2.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                            str = null;
                                            break;
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i11];
                                if (str.equalsIgnoreCase(str2)) {
                                    break;
                                    break;
                                }
                                i11++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zztgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zztgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzteVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                        zIsVendor = true;
                                        if (zzteVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzen.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                    i10 = i16;
                                                } else {
                                                    i10 = i16;
                                                    if (zzi(mediaCodecInfoZzb, str2)) {
                                                        zIsHardwareAccelerated = true;
                                                    } else {
                                                        zIsHardwareAccelerated = false;
                                                    }
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str2);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            int i1113 = i14;
                                                            str = str;
                                                            i = i1113;
                                                            i12 = 23;
                                                            arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i1114 = i14;
                                                    str = str;
                                                    i = i1114;
                                                    boolean z1113 = zIsVendor;
                                                    i12 = 23;
                                                    boolean z1114 = zZzd2;
                                                    boolean z1115 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            int i1115 = i14;
                                                            str = str;
                                                            i = i1115;
                                                            i12 = 23;
                                                            arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i1116 = i14;
                                                    str = str;
                                                    i = i1116;
                                                    boolean z1116 = zIsVendor;
                                                    i12 = 23;
                                                    boolean z1117 = zZzd2;
                                                    boolean z1118 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzen.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                i10 = i16;
                                            } else {
                                                i10 = i16;
                                                if (zzi(mediaCodecInfoZzb, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str2);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i1117 = i14;
                                                        str = str;
                                                        i = i1117;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i1118 = i14;
                                                str = str;
                                                i = i1118;
                                                boolean z1119 = zIsVendor;
                                                i12 = 23;
                                                boolean z11110 = zZzd2;
                                                boolean z11111 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i1119 = i14;
                                                        str = str;
                                                        i = i1119;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i11110 = i14;
                                                str = str;
                                                i = i11110;
                                                boolean z11112 = zIsVendor;
                                                i12 = 23;
                                                boolean z11113 = zZzd2;
                                                boolean z11114 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                    zIsVendor = true;
                                    if (zzteVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzen.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                i10 = i16;
                                            } else {
                                                i10 = i16;
                                                if (zzi(mediaCodecInfoZzb, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str2);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i11111 = i14;
                                                        str = str;
                                                        i = i11111;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i11112 = i14;
                                                str = str;
                                                i = i11112;
                                                boolean z11115 = zIsVendor;
                                                i12 = 23;
                                                boolean z11116 = zZzd2;
                                                boolean z11117 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i11113 = i14;
                                                        str = str;
                                                        i = i11113;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i11114 = i14;
                                                str = str;
                                                i = i11114;
                                                boolean z11118 = zIsVendor;
                                                i12 = 23;
                                                boolean z11119 = zZzd2;
                                                boolean z111110 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzen.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            i10 = i16;
                                        } else {
                                            i10 = i16;
                                            if (zzi(mediaCodecInfoZzb, str2)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str2);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    int i11115 = i14;
                                                    str = str;
                                                    i = i11115;
                                                    i12 = 23;
                                                    arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            int i11116 = i14;
                                            str = str;
                                            i = i11116;
                                            boolean z111111 = zIsVendor;
                                            i12 = 23;
                                            boolean z111112 = zZzd2;
                                            boolean z111113 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    int i11117 = i14;
                                                    str = str;
                                                    i = i11117;
                                                    i12 = 23;
                                                    arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            int i11118 = i14;
                                            str = str;
                                            i = i11118;
                                            boolean z111114 = zIsVendor;
                                            i12 = 23;
                                            boolean z111115 = zZzd2;
                                            boolean z111116 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i14;
                                i10 = i16;
                            } else {
                                i = i14;
                                i10 = i16;
                            }
                        }
                    } else if (i15 > 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        i = i14;
                        i10 = i16;
                    } else {
                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        length = supportedTypes.length;
                        i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                if (!str2.equals("video/dolby-vision")) {
                                    if (!str2.equals("video/mv-hevc")) {
                                        if (!str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                            str = "audio/x-lg-alac";
                                            break;
                                        }
                                        if (!str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        if (!str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                            str = "audio/lg-ac3";
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if ("OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i11];
                            if (str.equalsIgnoreCase(str2)) {
                                break;
                            }
                            i11++;
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zztgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zztgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzteVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                        zIsVendor = true;
                                        if (zzteVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzen.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                    i10 = i16;
                                                } else {
                                                    i10 = i16;
                                                    if (zzi(mediaCodecInfoZzb, str2)) {
                                                        zIsHardwareAccelerated = true;
                                                    } else {
                                                        zIsHardwareAccelerated = false;
                                                    }
                                                }
                                                try {
                                                    zZzi = zzi(mediaCodecInfoZzb, str2);
                                                    if (i13 >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (zZze || zzteVar2.zzb != zZzd2) {
                                                        if (!zZze) {
                                                            try {
                                                                if (!zzteVar2.zzb) {
                                                                    int i11119 = i14;
                                                                    str = str;
                                                                    i = i11119;
                                                                    i12 = 23;
                                                                    try {
                                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        name = name;
                                                                        if (zzen.zza <= i12 || arrayList.isEmpty()) {
                                                                            zzdt.zzc("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                                            throw e;
                                                                        }
                                                                        zzdt.zzc("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                                                    }
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                int i20 = i14;
                                                                str = str;
                                                                i = i20;
                                                                i12 = 23;
                                                                name = name;
                                                                if (zzen.zza <= i12) {
                                                                }
                                                                zzdt.zzc("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                                throw e;
                                                            }
                                                        }
                                                        int i111110 = i14;
                                                        str = str;
                                                        i = i111110;
                                                        boolean z111117 = zIsVendor;
                                                        i12 = 23;
                                                        boolean z111118 = zZzd2;
                                                        boolean z111119 = zIsHardwareAccelerated;
                                                        if (zZze && z111118) {
                                                            name = name;
                                                            try {
                                                                arrayList.add(zzsq.zzc(name + ".secure", str2, str, capabilitiesForType, z111119, zZzi, z111117, false, true));
                                                                break;
                                                            } catch (Exception e10) {
                                                                e = e10;
                                                                if (zzen.zza <= i12) {
                                                                }
                                                                zzdt.zzc("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                                throw e;
                                                            }
                                                        }
                                                    } else {
                                                        int i111111 = i14;
                                                        str = str;
                                                        i = i111111;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    i = i14;
                                                    i12 = 23;
                                                    if (zzen.zza <= i12) {
                                                    }
                                                    zzdt.zzc("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzen.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                i10 = i16;
                                            } else {
                                                i10 = i16;
                                                if (zzi(mediaCodecInfoZzb, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str2);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i111112 = i14;
                                                        str = str;
                                                        i = i111112;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i111113 = i14;
                                                str = str;
                                                i = i111113;
                                                boolean z1111110 = zIsVendor;
                                                i12 = 23;
                                                boolean z1111111 = zZzd2;
                                                boolean z1111112 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i111114 = i14;
                                                        str = str;
                                                        i = i111114;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i111115 = i14;
                                                str = str;
                                                i = i111115;
                                                boolean z1111113 = zIsVendor;
                                                i12 = 23;
                                                boolean z1111114 = zZzd2;
                                                boolean z1111115 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                    zIsVendor = true;
                                    if (zzteVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzen.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                i10 = i16;
                                            } else {
                                                i10 = i16;
                                                if (zzi(mediaCodecInfoZzb, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str2);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i111116 = i14;
                                                        str = str;
                                                        i = i111116;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i111117 = i14;
                                                str = str;
                                                i = i111117;
                                                boolean z1111116 = zIsVendor;
                                                i12 = 23;
                                                boolean z1111117 = zZzd2;
                                                boolean z1111118 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        int i111118 = i14;
                                                        str = str;
                                                        i = i111118;
                                                        i12 = 23;
                                                        arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                int i111119 = i14;
                                                str = str;
                                                i = i111119;
                                                boolean z1111119 = zIsVendor;
                                                i12 = 23;
                                                boolean z11111110 = zZzd2;
                                                boolean z11111111 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzen.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            i10 = i16;
                                        } else {
                                            i10 = i16;
                                            if (zzi(mediaCodecInfoZzb, str2)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str2);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfwa.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    int i1111110 = i14;
                                                    str = str;
                                                    i = i1111110;
                                                    i12 = 23;
                                                    arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            int i1111111 = i14;
                                            str = str;
                                            i = i1111111;
                                            boolean z11111112 = zIsVendor;
                                            i12 = 23;
                                            boolean z11111113 = zZzd2;
                                            boolean z11111114 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    int i1111112 = i14;
                                                    str = str;
                                                    i = i1111112;
                                                    i12 = 23;
                                                    arrayList.add(zzsq.zzc(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            int i1111113 = i14;
                                            str = str;
                                            i = i1111113;
                                            boolean z11111115 = zIsVendor;
                                            i12 = 23;
                                            boolean z11111116 = zZzd2;
                                            boolean z11111117 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i14;
                                i10 = i16;
                            } catch (Exception e12) {
                                e = e12;
                                i = i14;
                                i10 = i16;
                            }
                        } else {
                            i = i14;
                            i10 = i16;
                        }
                    }
                } else {
                    i10 = iZza;
                    i = i14;
                }
                i14 = i + 1;
                zzteVar2 = zzteVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new zztf(e13, null);
        }
    }

    private static void zzh(List list, final zztj zztjVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zztl.zza;
                zztj zztjVar2 = zztjVar;
                return zztjVar2.zza(obj2) - zztjVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzen.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbg.zzg(str)) {
            return true;
        }
        String strZza = zzfwa.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google."))) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
