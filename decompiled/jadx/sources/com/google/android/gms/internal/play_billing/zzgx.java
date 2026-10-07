package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhh zzb;

    static {
        int i = zzgs.zza;
        zzb = new zzhj();
    }

    public static void zzA(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzC(i, list, z4);
    }

    public static void zzB(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzE(i, list, z4);
    }

    public static void zzC(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzJ(i, list, z4);
    }

    public static void zzD(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzL(i, list, z4);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzep.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzD;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzb(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzep.zzC(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzep.zzC(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzep.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzD;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzep.zzD(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzD;
        }
        zzga zzgaVar = (zzga) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzh(int i, Object obj, zzgv zzgvVar) {
        int i10 = i << 3;
        if (!(obj instanceof zzfw)) {
            return zzep.zzA((zzgl) obj, zzgvVar) + zzep.zzC(i10);
        }
        int iZzC = zzep.zzC(i10);
        int iZza = ((zzfw) obj).zza();
        return a.z(iZza, iZza, iZzC);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iZzC = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzC += zzep.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzC;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzC2 = 0;
        while (i < size) {
            int iZze = zzfjVar.zze(i);
            iZzC2 += zzep.zzC((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzC2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iZzD = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzD += zzep.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzD;
        }
        zzga zzgaVar = (zzga) list;
        int iZzD2 = 0;
        while (i < size) {
            long jZze = zzgaVar.zze(i);
            iZzD2 += zzep.zzD((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzD2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iZzC = 0;
            while (i < size) {
                iZzC += zzep.zzC(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzC;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzC2 = 0;
        while (i < size) {
            iZzC2 += zzep.zzC(zzfjVar.zze(i));
            i++;
        }
        return iZzC2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzep.zzD(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzD;
        }
        zzga zzgaVar = (zzga) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i));
            i++;
        }
        return iZzD2;
    }

    public static zzhh zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, int i10, Object obj2, zzhh zzhhVar) {
        if (obj2 == null) {
            obj2 = zzhhVar.zza(obj);
        }
        ((zzhi) obj2).zzj(i << 3, Long.valueOf(i10));
        return obj2;
    }

    public static void zzo(zzev zzevVar, Object obj, Object obj2) {
        if (((zzff) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzhh zzhhVar, Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVarZze = zzfiVar.zzc;
        zzhi zzhiVar = ((zzfi) obj2).zzc;
        if (!zzhi.zzc().equals(zzhiVar)) {
            if (zzhi.zzc().equals(zzhiVarZze)) {
                zzhiVarZze = zzhi.zze(zzhiVarZze, zzhiVar);
            } else {
                zzhiVarZze.zzd(zzhiVar);
            }
        }
        zzfiVar.zzc = zzhiVarZze;
    }

    public static void zzq(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzc(i, list, z4);
    }

    public static void zzr(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzg(i, list, z4);
    }

    public static void zzs(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzj(i, list, z4);
    }

    public static void zzt(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzl(i, list, z4);
    }

    public static void zzu(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzn(i, list, z4);
    }

    public static void zzv(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzp(i, list, z4);
    }

    public static void zzw(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzs(i, list, z4);
    }

    public static void zzx(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzu(i, list, z4);
    }

    public static void zzy(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzy(i, list, z4);
    }

    public static void zzz(int i, List list, zzhu zzhuVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzA(i, list, z4);
    }
}
