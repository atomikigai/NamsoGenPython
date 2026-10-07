package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhbn zzb;

    static {
        int i = zzhas.zza;
        zzb = new zzhbp();
    }

    public static void zzA(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzu(i, list, z4);
    }

    public static void zzB(int i, List list, zzhcc zzhccVar, zzhbb zzhbbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzgyd) zzhccVar).zzv(i, list.get(i10), zzhbbVar);
        }
    }

    public static void zzC(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzy(i, list, z4);
    }

    public static void zzD(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzA(i, list, z4);
    }

    public static void zzE(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzC(i, list, z4);
    }

    public static void zzF(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzE(i, list, z4);
    }

    public static void zzG(int i, List list, zzhcc zzhccVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzH(i, list);
    }

    public static void zzH(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzJ(i, list, z4);
    }

    public static void zzI(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzL(i, list, z4);
    }

    public static boolean zzJ(Object obj, Object obj2) {
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
        if (!(list instanceof zzgyy)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgyc.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzE;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgyc.zzE(zzgyyVar.zzd(i));
            i++;
        }
        return iZzE2;
    }

    public static int zzb(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgyc.zzD(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgyc.zzD(i << 3) + 8) * size;
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
        if (!(list instanceof zzgyy)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgyc.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzE;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgyc.zzE(zzgyyVar.zzd(i));
            i++;
        }
        return iZzE2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzx)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgyc.zzE(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzE;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgyc.zzE(zzgzxVar.zza(i));
            i++;
        }
        return iZzE2;
    }

    public static int zzh(int i, Object obj, zzhbb zzhbbVar) {
        int i10 = i << 3;
        if (!(obj instanceof zzgzt)) {
            return zzgyc.zzA((zzhai) obj, zzhbbVar) + zzgyc.zzD(i10);
        }
        int iZzD = zzgyc.zzD(i10);
        int iZza = ((zzgzt) obj).zza();
        return q1.a.t(iZza, iZza, iZzD);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyy)) {
            int iZzD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzD += zzgyc.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzD;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        int iZzD2 = 0;
        while (i < size) {
            int iZzd = zzgyyVar.zzd(i);
            iZzD2 += zzgyc.zzD((iZzd >> 31) ^ (iZzd + iZzd));
            i++;
        }
        return iZzD2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzx)) {
            int iZzE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzE += zzgyc.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzE;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        int iZzE2 = 0;
        while (i < size) {
            long jZza = zzgzxVar.zza(i);
            iZzE2 += zzgyc.zzE((jZza >> 63) ^ (jZza + jZza));
            i++;
        }
        return iZzE2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyy)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzgyc.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzD;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzgyc.zzD(zzgyyVar.zzd(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzx)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgyc.zzE(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzE;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgyc.zzE(zzgzxVar.zza(i));
            i++;
        }
        return iZzE2;
    }

    public static zzhbn zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, List list, zzgzd zzgzdVar, Object obj2, zzhbn zzhbnVar) {
        if (zzgzdVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzgzdVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i, iIntValue, obj2, zzhbnVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (zzgzdVar.zza(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = zzo(obj, i, iIntValue2, obj2, zzhbnVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i, int i10, Object obj2, zzhbn zzhbnVar) {
        if (obj2 == null) {
            obj2 = zzhbnVar.zza(obj);
        }
        zzhbnVar.zzh(obj2, i, i10);
        return obj2;
    }

    public static void zzp(zzgyi zzgyiVar, Object obj, Object obj2) {
        if (((zzgyt) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzgyx zzgyxVar = (zzgyx) obj;
        zzhbo zzhboVarZze = zzgyxVar.zzt;
        zzhbo zzhboVar = ((zzgyx) obj2).zzt;
        if (!zzhbo.zzc().equals(zzhboVar)) {
            if (zzhbo.zzc().equals(zzhboVarZze)) {
                zzhboVarZze = zzhbo.zze(zzhboVarZze, zzhboVar);
            } else {
                zzhboVarZze.zzd(zzhboVar);
            }
        }
        zzgyxVar.zzt = zzhboVarZze;
    }

    public static void zzr(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzc(i, list, z4);
    }

    public static void zzs(int i, List list, zzhcc zzhccVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zze(i, list);
    }

    public static void zzt(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzg(i, list, z4);
    }

    public static void zzu(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzj(i, list, z4);
    }

    public static void zzv(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzl(i, list, z4);
    }

    public static void zzw(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzn(i, list, z4);
    }

    public static void zzx(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzp(i, list, z4);
    }

    public static void zzy(int i, List list, zzhcc zzhccVar, zzhbb zzhbbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzgyd) zzhccVar).zzq(i, list.get(i10), zzhbbVar);
        }
    }

    public static void zzz(int i, List list, zzhcc zzhccVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhccVar.zzs(i, list, z4);
    }
}
