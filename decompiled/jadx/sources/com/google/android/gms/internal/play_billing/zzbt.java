package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbt extends zzbq implements List, RandomAccess {
    private static final zzci zza = new zzbr(zzca.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzbt zzi(Object[] objArr, int i) {
        return i == 0 ? zzca.zza : new zzca(objArr, i);
    }

    public static zzbt zzj(Collection collection) {
        if (!(collection instanceof zzbq)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzbz.zza(array, length);
            return zzi(array, length);
        }
        zzbt zzbtVarZzd = ((zzbq) collection).zzd();
        if (!zzbtVarZzd.zzf()) {
            return zzbtVarZzd;
        }
        Object[] array2 = zzbtVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzbt zzk() {
        return zzca.zza;
    }

    public static zzbt zzl(Object obj) {
        Object[] objArr = {"inapp"};
        zzbz.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzbt zzm(Object obj, Object obj2) {
        Object[] objArr = {"subs", "inapp"};
        zzbz.zza(objArr, 2);
        return zzi(objArr, 2);
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

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
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
                if (!zzbf.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzbf.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: zze */
    public final zzch iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh */
    public zzbt subList(int i, int i10) {
        zzbg.zzd(i, i10, size());
        int i11 = i10 - i;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? zzca.zza : new zzbs(this, i, i11);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzci listIterator(int i) {
        zzbg.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzbr(this, i);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    @Deprecated
    public final zzbt zzd() {
        return this;
    }
}
