package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfyx extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzfyx() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzfyx zzfyxVar, int i) {
        return zzfyxVar.zzB()[i];
    }

    public static /* synthetic */ Object zzi(zzfyx zzfyxVar) {
        Object obj = zzfyxVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzfyx zzfyxVar, int i) {
        return zzfyxVar.zzC()[i];
    }

    public static /* synthetic */ void zzn(zzfyx zzfyxVar, int i, Object obj) {
        zzfyxVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZzb = zzfzg.zzb(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzfyy.zzc(obj2, iZzb & iZzv);
        if (iZzc != 0) {
            int i = ~iZzv;
            int i10 = iZzb & i;
            do {
                int i11 = iZzc - 1;
                int i12 = zzA()[i11];
                if ((i12 & i) == i10 && zzfwn.zza(obj, zzB()[i11])) {
                    return i11;
                }
                iZzc = i12 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object objZzd = zzfyy.zzd(i10);
        if (i12 != 0) {
            zzfyy.zze(objZzd, i11 & i13, i12 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i14 = 0; i14 <= i; i14++) {
            int iZzc = zzfyy.zzc(obj, i14);
            while (iZzc != 0) {
                int i15 = iZzc - 1;
                int i16 = iArrZzA[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int iZzc2 = zzfyy.zzc(objZzd, i18);
                zzfyy.zze(objZzd, i18, iZzc);
                iArrZzA[i15] = ((~i13) & i17) | (iZzc2 & i13);
                iZzc = i16 & i;
            }
        }
        this.zze = objZzd;
        zzz(i13);
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzfyy.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzgcr.zzc(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzfwn.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfyr zzfyrVar = new zzfyr(this);
        this.zzi = zzfyrVar;
        return zzfyrVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzfyt zzfytVar = new zzfyt(this);
        this.zzh = zzfytVar;
        return zzfytVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzr()) {
            zzfwq.zzl(zzr(), "Arrays already allocated");
            int i10 = this.zzf;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzfyy.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int iZzb = zzfzg.zzb(obj);
        int iZzv = zzv();
        int i13 = iZzb & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzfyy.zzc(obj3, i13);
        if (iZzc == 0) {
            if (i12 > iZzv) {
                iZzv = zzx(iZzv, zzfyy.zza(iZzv), iZzb, i11);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzfyy.zze(obj4, i13, i12);
            }
            i = 1;
        } else {
            int i14 = ~iZzv;
            int i15 = iZzb & i14;
            int i16 = 0;
            while (true) {
                int i17 = iZzc - 1;
                int i18 = iArrZzA[i17];
                i = 1;
                int i19 = i18 & i14;
                if (i19 == i15 && zzfwn.zza(obj, objArrZzB[i17])) {
                    Object obj5 = objArrZzC[i17];
                    objArrZzC[i17] = obj2;
                    return obj5;
                }
                int i20 = i18 & iZzv;
                i16++;
                if (i20 == 0) {
                    if (i16 < 9) {
                        if (i12 <= iZzv) {
                            iArrZzA[i17] = (i12 & iZzv) | i19;
                            break;
                        }
                        iZzv = zzx(iZzv, zzfyy.zza(iZzv), iZzb, i11);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i20;
            }
        }
        int length = zzA().length;
        if (i12 > length) {
            int i21 = i;
            int iMin = Math.min(1073741823, (Math.max(i21, length >>> 1) + length) | i21);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i11] = (~iZzv) & iZzb;
        zzB()[i11] = obj;
        zzC()[i11] = obj2;
        this.zzg = i12;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzfyv zzfyvVar = new zzfyv(this);
        this.zzj = zzfyvVar;
        return zzfyvVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i10 = i + 1;
        if (i10 < this.zzg) {
            return i10;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i) {
        this.zzf = zzgcr.zzc(i, 1, 1073741823);
    }

    public final void zzq(int i, int i10) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i11 = size - 1;
        if (i >= i11) {
            objArrZzB[i] = null;
            objArrZzC[i] = null;
            iArrZzA[i] = 0;
            return;
        }
        int i12 = i + 1;
        Object obj2 = objArrZzB[i11];
        objArrZzB[i] = obj2;
        objArrZzC[i] = objArrZzC[i11];
        objArrZzB[i11] = null;
        objArrZzC[i11] = null;
        iArrZzA[i] = iArrZzA[i11];
        iArrZzA[i11] = 0;
        int iZzb = zzfzg.zzb(obj2) & i10;
        int iZzc = zzfyy.zzc(obj, iZzb);
        if (iZzc == size) {
            zzfyy.zze(obj, iZzb, i12);
            return;
        }
        while (true) {
            int i13 = iZzc - 1;
            int i14 = iArrZzA[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                iArrZzA[i13] = (i14 & (~i10)) | (i10 & i12);
                return;
            }
            iZzc = i15;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzfyx(int i) {
        zzp(8);
    }
}
