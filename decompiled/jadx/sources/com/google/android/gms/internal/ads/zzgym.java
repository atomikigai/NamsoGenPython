package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgym {
    private static final zzgym zzb = new zzgym(true);
    final zzhbj zza = new zzhbe();
    private boolean zzc;
    private boolean zzd;

    private zzgym() {
    }

    public static int zza(zzhca zzhcaVar, int i, Object obj) {
        int iZzD = zzgyc.zzD(i << 3);
        if (zzhcaVar == zzhca.zzj) {
            byte[] bArr = zzgzk.zzb;
            if (((zzhai) obj) instanceof zzgwz) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + zzb(zzhcaVar, obj);
    }

    public static int zzb(zzhca zzhcaVar, Object obj) {
        int iZzd;
        int iZzD;
        zzhca zzhcaVar2 = zzhca.zza;
        zzhcb zzhcbVar = zzhcb.INT;
        switch (zzhcaVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i = zzgyc.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i10 = zzgyc.zzf;
                return 4;
            case 2:
                return zzgyc.zzE(((Long) obj).longValue());
            case 3:
                return zzgyc.zzE(((Long) obj).longValue());
            case 4:
                return zzgyc.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i11 = zzgyc.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i12 = zzgyc.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i13 = zzgyc.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzgxp)) {
                    return zzgyc.zzC((String) obj);
                }
                int i14 = zzgyc.zzf;
                iZzd = ((zzgxp) obj).zzd();
                iZzD = zzgyc.zzD(iZzd);
                break;
                break;
            case 9:
                int i15 = zzgyc.zzf;
                return ((zzhai) obj).zzaY();
            case 10:
                if (!(obj instanceof zzgzs)) {
                    return zzgyc.zzz((zzhai) obj);
                }
                int i16 = zzgyc.zzf;
                iZzd = ((zzgzs) obj).zza();
                iZzD = zzgyc.zzD(iZzd);
                break;
                break;
            case 11:
                if (!(obj instanceof zzgxp)) {
                    int i17 = zzgyc.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = zzgyc.zzD(iZzd);
                } else {
                    int i18 = zzgyc.zzf;
                    iZzd = ((zzgxp) obj).zzd();
                    iZzD = zzgyc.zzD(iZzd);
                }
                break;
            case 12:
                return zzgyc.zzD(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzgzb ? zzgyc.zzE(((zzgzb) obj).zza()) : zzgyc.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i19 = zzgyc.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i20 = zzgyc.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzgyc.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzgyc.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    public static int zzc(zzgyl zzgylVar, Object obj) {
        zzhca zzhcaVarZzb = zzgylVar.zzb();
        int iZza = zzgylVar.zza();
        if (!zzgylVar.zze()) {
            return zza(zzhcaVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzgylVar.zzd()) {
            int iZza2 = 0;
            while (i < size) {
                iZza2 += zza(zzhcaVarZzb, iZza, list.get(i));
                i++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i < size) {
            iZzb += zzb(zzhcaVarZzb, list.get(i));
            i++;
        }
        return zzgyc.zzD(iZzb) + zzgyc.zzD(iZza << 3) + iZzb;
    }

    public static zzgym zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgyl zzgylVar = (zzgyl) entry.getKey();
        if (zzgylVar.zzc() != zzhcb.MESSAGE) {
            return true;
        }
        if (!zzgylVar.zze()) {
            return zzk(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzk(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzhaj) {
            return ((zzhaj) obj).zzbw();
        }
        if (obj instanceof zzgzs) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i;
        int iZzD;
        int iZzz;
        zzgyl zzgylVar = (zzgyl) entry.getKey();
        Object value = entry.getValue();
        if (zzgylVar.zzc() != zzhcb.MESSAGE || zzgylVar.zze() || zzgylVar.zzd()) {
            return zzc(zzgylVar, value);
        }
        if (value instanceof zzgzs) {
            int iZza = ((zzgyl) entry.getKey()).zza();
            int iZzD2 = zzgyc.zzD(8);
            i = iZzD2 + iZzD2;
            iZzD = zzgyc.zzD(iZza) + zzgyc.zzD(16);
            int iZzD3 = zzgyc.zzD(24);
            int iZza2 = ((zzgzs) value).zza();
            iZzz = q1.a.t(iZza2, iZza2, iZzD3);
        } else {
            int iZza3 = ((zzgyl) entry.getKey()).zza();
            int iZzD4 = zzgyc.zzD(8);
            i = iZzD4 + iZzD4;
            iZzD = zzgyc.zzD(iZza3) + zzgyc.zzD(16);
            iZzz = zzgyc.zzz((zzhai) value) + zzgyc.zzD(24);
        }
        return i + iZzD + iZzz;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    private static final void zzm(zzgyl zzgylVar, Object obj) {
        boolean z4;
        zzgylVar.zzb();
        byte[] bArr = zzgzk.zzb;
        obj.getClass();
        zzhca zzhcaVar = zzhca.zza;
        zzhcb zzhcbVar = zzhcb.INT;
        switch (r0.zza()) {
            case INT:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z4 = obj instanceof Long;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z4 = obj instanceof Float;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z4 = obj instanceof Double;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z4 = obj instanceof String;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzgxp) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzgzb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzhai) || (obj instanceof zzgzs)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgylVar.zza()), zzgylVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgym zzgymVar = new zzgym();
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzgymVar.zzh((zzgyl) ((zzhbf) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzgymVar.zzh((zzgyl) entry.getKey(), entry.getValue());
        }
        zzgymVar.zzd = this.zzd;
        return zzgymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgym) {
            return this.zza.equals(((zzgym) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int iZzc = this.zza.zzc();
        int iZzl = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzl += zzl(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzl += zzl((Map.Entry) it.next());
        }
        return iZzl;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzgzq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = this.zza.zzg(i).getValue();
            if (value instanceof zzgyx) {
                ((zzgyx) value).zzbW();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzgyx) {
                ((zzgyx) value2).zzbW();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzgyl zzgylVar, Object obj) {
        if (!zzgylVar.zze()) {
            zzm(zzgylVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzm(zzgylVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgzs) {
            this.zzd = true;
        }
        this.zza.put(zzgylVar, obj);
    }

    public final boolean zzi() {
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzj(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzj((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgym(boolean z4) {
        zzg();
        zzg();
    }
}
