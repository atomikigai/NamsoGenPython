package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaed {
    public static int zza(int i) {
        int i10 = 0;
        while (i > 0) {
            i >>>= 1;
            i10++;
        }
        return i10;
    }

    public static zzbd zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i10 = zzen.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzdt.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafr.zzb(new zzed(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    zzdt.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzahi(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbd(arrayList);
    }

    public static zzaea zzc(zzed zzedVar, boolean z4, boolean z10) throws zzbh {
        if (z4) {
            zzd(3, zzedVar, false);
        }
        String strZzB = zzedVar.zzB((int) zzedVar.zzs(), StandardCharsets.UTF_8);
        int length = strZzB.length();
        long jZzs = zzedVar.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i = 0; i < jZzs; i++) {
            String strZzB2 = zzedVar.zzB((int) zzedVar.zzs(), StandardCharsets.UTF_8);
            strArr[i] = strZzB2;
            length2 = length2 + 4 + strZzB2.length();
        }
        if (z10 && (zzedVar.zzm() & 1) == 0) {
            throw zzbh.zza("framing bit expected to be set", null);
        }
        return new zzaea(strZzB, strArr, length2 + 1);
    }

    public static boolean zzd(int i, zzed zzedVar, boolean z4) throws zzbh {
        if (zzedVar.zzb() < 7) {
            if (z4) {
                return false;
            }
            throw zzbh.zza("too short header: " + zzedVar.zzb(), null);
        }
        if (zzedVar.zzm() != i) {
            if (z4) {
                return false;
            }
            throw zzbh.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzedVar.zzm() == 118 && zzedVar.zzm() == 111 && zzedVar.zzm() == 114 && zzedVar.zzm() == 98 && zzedVar.zzm() == 105 && zzedVar.zzm() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw zzbh.zza("expected characters 'vorbis'", null);
    }
}
