package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfzo<E> extends zzfzj<E> implements List<E>, RandomAccess {
    private static final zzgbv zza = new zzfzm(zzgba.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfzl zzi(int i) {
        zzfyl.zza(i, "expectedSize");
        return new zzfzl(i);
    }

    public static zzfzo zzj(Object[] objArr, int i) {
        return i == 0 ? zzgba.zza : new zzgba(objArr, i);
    }

    public static zzfzo zzk(Iterable iterable) {
        iterable.getClass();
        return zzl((Collection) iterable);
    }

    public static zzfzo zzl(Collection collection) {
        if (!(collection instanceof zzfzj)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgay.zzb(array, length);
            return zzj(array, length);
        }
        zzfzo zzfzoVarZzd = ((zzfzj) collection).zzd();
        if (!zzfzoVarZzd.zzf()) {
            return zzfzoVarZzd;
        }
        Object[] array2 = zzfzoVarZzd.toArray();
        return zzj(array2, array2.length);
    }

    public static zzfzo zzm(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgba.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgay.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfzo zzn() {
        return zzgba.zza;
    }

    public static zzfzo zzo(Object obj) {
        Object[] objArr = {obj};
        zzgay.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfzo zzp(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgay.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfzo zzq(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgay.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfzo zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgay.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfzo zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgay.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    @SafeVarargs
    public static zzfzo zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgay.zzb(objArr2, i);
        return zzj(objArr2, i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!zzfwn.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<E> it = iterator();
        Iterator<E> it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzfwn.zza(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    /* JADX INFO: renamed from: zze */
    public final zzgbu iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfzo subList(int i, int i10) {
        zzfwq.zzj(i, i10, size());
        int i11 = i10 - i;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? zzgba.zza : new zzfzn(this, i, i11);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgbv listIterator(int i) {
        zzfwq.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzfzm(this, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    @Deprecated
    public final zzfzo zzd() {
        return this;
    }
}
