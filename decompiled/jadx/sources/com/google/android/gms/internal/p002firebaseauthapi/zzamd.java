package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzamd {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzamv zzc;
    private static final zzamv zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzamv zzamvVar = null;
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
                zzamvVar = (zzamv) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzamvVar;
        zzd = new zzamx();
    }

    public static void zzA(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzu(i, list, z4);
    }

    public static void zzB(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzx(i, list, z4);
    }

    public static void zzC(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzz(i, list, z4);
    }

    public static void zzD(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzB(i, list, z4);
    }

    public static void zzE(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzD(i, list, z4);
    }

    public static void zzF(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzI(i, list, z4);
    }

    public static void zzG(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzK(i, list, z4);
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakl)) {
            int iZzx = 0;
            while (i < size) {
                iZzx += zzajs.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzx;
        }
        zzakl zzaklVar = (zzakl) list;
        int iZzx2 = 0;
        while (i < size) {
            iZzx2 += zzajs.zzx(zzaklVar.zze(i));
            i++;
        }
        return iZzx2;
    }

    public static int zzb(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajs.zzA(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajs.zzA(i << 3) + 8) * size;
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
        if (!(list instanceof zzakl)) {
            int iZzx = 0;
            while (i < size) {
                iZzx += zzajs.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzx;
        }
        zzakl zzaklVar = (zzakl) list;
        int iZzx2 = 0;
        while (i < size) {
            iZzx2 += zzajs.zzx(zzaklVar.zze(i));
            i++;
        }
        return iZzx2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzale)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzajs.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzale zzaleVar = (zzale) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzajs.zzB(zzaleVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzh(int i, Object obj, zzamb zzambVar) {
        int i10 = i << 3;
        if (!(obj instanceof zzakv)) {
            return zzajs.zzA(i10) + zzajs.zzy((zzalp) obj, zzambVar);
        }
        int i11 = zzajs.zzf;
        int iZza = ((zzakv) obj).zza();
        return zzajs.zzA(i10) + zzajs.zzA(iZza) + iZza;
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakl)) {
            int iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzajs.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzA;
        }
        zzakl zzaklVar = (zzakl) list;
        int iZzA2 = 0;
        while (i < size) {
            int iZze = zzaklVar.zze(i);
            iZzA2 += zzajs.zzA((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzA2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzale)) {
            int iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzajs.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzB;
        }
        zzale zzaleVar = (zzale) list;
        int iZzB2 = 0;
        while (i < size) {
            long jZze = zzaleVar.zze(i);
            iZzB2 += zzajs.zzB((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzB2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakl)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzajs.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzakl zzaklVar = (zzakl) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzajs.zzA(zzaklVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzale)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzajs.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzale zzaleVar = (zzale) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzajs.zzB(zzaleVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static zzamv zzm() {
        return zzc;
    }

    public static zzamv zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i, List list, zzako zzakoVar, Object obj2, zzamv zzamvVar) {
        if (zzakoVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzakoVar.zza()) {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzamvVar);
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
            if (zzakoVar.zza()) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = zzp(obj, i, iIntValue2, obj2, zzamvVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i, int i10, Object obj2, zzamv zzamvVar) {
        if (obj2 == null) {
            obj2 = zzamvVar.zzc(obj);
        }
        zzamvVar.zzl(obj2, i, i10);
        return obj2;
    }

    public static void zzq(zzamv zzamvVar, Object obj, Object obj2) {
        zzamvVar.zzo(obj, zzamvVar.zze(zzamvVar.zzd(obj), zzamvVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzakk.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzs(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzt(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzc(i, list, z4);
    }

    public static void zzu(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzg(i, list, z4);
    }

    public static void zzv(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzj(i, list, z4);
    }

    public static void zzw(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzl(i, list, z4);
    }

    public static void zzx(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzn(i, list, z4);
    }

    public static void zzy(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzp(i, list, z4);
    }

    public static void zzz(int i, List list, zzajt zzajtVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzs(i, list, z4);
    }
}
