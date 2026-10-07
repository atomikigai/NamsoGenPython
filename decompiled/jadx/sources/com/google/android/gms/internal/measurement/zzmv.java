package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznk zznkVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznkVar = (zznk) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznkVar;
        zzd = new zznm();
    }

    public static Object zzA(Object obj, int i, int i10, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i, i10);
        return obj2;
    }

    public static void zzB(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzc(i, list, z4);
    }

    public static void zzE(int i, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zze(i, list);
    }

    public static void zzF(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzg(i, list, z4);
    }

    public static void zzG(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzj(i, list, z4);
    }

    public static void zzH(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzl(i, list, z4);
    }

    public static void zzI(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzn(i, list, z4);
    }

    public static void zzJ(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzp(i, list, z4);
    }

    public static void zzK(int i, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzkj) zzocVar).zzq(i, list.get(i10), zzmtVar);
        }
    }

    public static void zzL(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzs(i, list, z4);
    }

    public static void zzM(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzu(i, list, z4);
    }

    public static void zzN(int i, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzkj) zzocVar).zzv(i, list.get(i10), zzmtVar);
        }
    }

    public static void zzO(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzx(i, list, z4);
    }

    public static void zzP(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzz(i, list, z4);
    }

    public static void zzQ(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzB(i, list, z4);
    }

    public static void zzR(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzD(i, list, z4);
    }

    public static void zzS(int i, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzG(i, list);
    }

    public static void zzT(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzI(i, list, z4);
    }

    public static void zzU(int i, List list, zzoc zzocVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzK(i, list, z4);
    }

    public static boolean zzV(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzki.zzx(i << 3) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iZzd = ((zzka) list.get(i10)).zzd();
            iZzx = a.y(iZzd, iZzd, iZzx);
        }
        return iZzx;
    }

    public static int zzc(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int iZzu = 0;
            while (i < size) {
                iZzu += zzki.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzu;
        }
        zzlc zzlcVar = (zzlc) list;
        int iZzu2 = 0;
        while (i < size) {
            iZzu2 += zzki.zzu(zzlcVar.zze(i));
            i++;
        }
        return iZzu2;
    }

    public static int zze(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzt = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZzt += zzki.zzt(i, (zzmi) list.get(i10), zzmtVar);
        }
        return iZzt;
    }

    public static int zzj(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int iZzu = 0;
            while (i < size) {
                iZzu += zzki.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzu;
        }
        zzlc zzlcVar = (zzlc) list;
        int iZzu2 = 0;
        while (i < size) {
            iZzu2 += zzki.zzu(zzlcVar.zze(i));
            i++;
        }
        return iZzu2;
    }

    public static int zzl(int i, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlx)) {
            int iZzy = 0;
            while (i < size) {
                iZzy += zzki.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzy;
        }
        zzlx zzlxVar = (zzlx) list;
        int iZzy2 = 0;
        while (i < size) {
            iZzy2 += zzki.zzy(zzlxVar.zza(i));
            i++;
        }
        return iZzy2;
    }

    public static int zzn(int i, Object obj, zzmt zzmtVar) {
        if (!(obj instanceof zzlo)) {
            return zzki.zzx(i << 3) + zzki.zzv((zzmi) obj, zzmtVar);
        }
        int i10 = zzki.zzb;
        int iZza = ((zzlo) obj).zza();
        return zzki.zzx(i << 3) + zzki.zzx(iZza) + iZza;
    }

    public static int zzo(int i, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzki.zzx(i << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzlo) {
                int iZza = ((zzlo) obj).zza();
                iZzx = a.y(iZza, iZza, iZzx);
            } else {
                iZzx = zzki.zzv((zzmi) obj, zzmtVar) + iZzx;
            }
        }
        return iZzx;
    }

    public static int zzp(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int iZzx = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzx += zzki.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzx;
        }
        zzlc zzlcVar = (zzlc) list;
        int iZzx2 = 0;
        while (i < size) {
            int iZze = zzlcVar.zze(i);
            iZzx2 += zzki.zzx((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzx2;
    }

    public static int zzr(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlx)) {
            int iZzy = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzy += zzki.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzy;
        }
        zzlx zzlxVar = (zzlx) list;
        int iZzy2 = 0;
        while (i < size) {
            long jZza = zzlxVar.zza(i);
            iZzy2 += zzki.zzy((jZza >> 63) ^ (jZza + jZza));
            i++;
        }
        return iZzy2;
    }

    public static int zzt(int i, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z4 = list instanceof zzlq;
        int iZzx = zzki.zzx(i << 3) * size;
        if (!z4) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzka) {
                    int iZzd = ((zzka) obj).zzd();
                    iZzx = a.y(iZzd, iZzd, iZzx);
                } else {
                    iZzx = zzki.zzw((String) obj) + iZzx;
                }
                i10++;
            }
            return iZzx;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i10 < size) {
            Object objZzf = zzlqVar.zzf(i10);
            if (objZzf instanceof zzka) {
                int iZzd2 = ((zzka) objZzf).zzd();
                iZzx = a.y(iZzd2, iZzd2, iZzx);
            } else {
                iZzx = zzki.zzw((String) objZzf) + iZzx;
            }
            i10++;
        }
        return iZzx;
    }

    public static int zzu(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlc)) {
            int iZzx = 0;
            while (i < size) {
                iZzx += zzki.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzx;
        }
        zzlc zzlcVar = (zzlc) list;
        int iZzx2 = 0;
        while (i < size) {
            iZzx2 += zzki.zzx(zzlcVar.zze(i));
            i++;
        }
        return iZzx2;
    }

    public static int zzw(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlx)) {
            int iZzy = 0;
            while (i < size) {
                iZzy += zzki.zzy(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzy;
        }
        zzlx zzlxVar = (zzlx) list;
        int iZzy2 = 0;
        while (i < size) {
            iZzy2 += zzki.zzy(zzlxVar.zza(i));
            i++;
        }
        return iZzy2;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
