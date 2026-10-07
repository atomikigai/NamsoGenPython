package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfzt<E> extends zzfzj<E> implements Set<E> {
    private transient zzfzo zza;

    public static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzfwq.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfzs zzj(int i) {
        return new zzfzs(i, true);
    }

    public static zzfzt zzl(Collection collection) {
        if ((collection instanceof zzfzt) && !(collection instanceof SortedSet)) {
            zzfzt zzfztVar = (zzfzt) collection;
            if (!zzfztVar.zzf()) {
                return zzfztVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzfzt zzm(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgbr(objArr[0]);
        }
        return zzgbg.zza;
    }

    public static zzfzt zzn() {
        return zzgbg.zza;
    }

    public static zzfzt zzo(Object obj) {
        return new zzgbr(obj);
    }

    public static zzfzt zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzfzt zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzfzt zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfzt zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 4);
        return zzv(10, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfzt zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzgbg.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgbr(obj);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i10 = iZzh - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            Object obj2 = objArr[i13];
            zzgay.zza(obj2, i13);
            int iHashCode = obj2.hashCode();
            int iZza = zzfzg.zza(iHashCode);
            while (true) {
                int i14 = iZza & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i12, i, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgbr(obj4);
        }
        if (zzh(i12) < iZzh / 2) {
            return zzv(i12, objArr);
        }
        if (zzw(i12, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzgbg(objArr, i11, objArr2, i10, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i10) {
        return i < (i10 >> 1) + (i10 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfzt) && zzu() && ((zzfzt) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgbq.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgbq.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public zzfzo zzd() {
        zzfzo zzfzoVar = this.zza;
        if (zzfzoVar != null) {
            return zzfzoVar;
        }
        zzfzo zzfzoVarZzi = zzi();
        this.zza = zzfzoVarZzi;
        return zzfzoVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzgbu iterator();

    public zzfzo zzi() {
        Object[] array = toArray();
        int i = zzfzo.zzd;
        return zzfzo.zzj(array, array.length);
    }

    public boolean zzu() {
        return false;
    }
}
