package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhat extends zzgxb implements RandomAccess {
    private static final zzhat zza = new zzhat(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzhat() {
        this(new Object[10], 0, true);
    }

    public static zzhat zzd() {
        return zza;
    }

    private static int zzg(int i) {
        return q1.a.u(i, 3, 2, 1);
    }

    private final String zzh(int i) {
        return q1.a.i(i, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        zzdJ();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        int i11 = i + 1;
        Object[] objArr = this.zzb;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i11, i10 - i);
        } else {
            Object[] objArr2 = new Object[zzg(i10)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.zzb, i, objArr2, i11, this.zzc - i);
            this.zzb = objArr2;
        }
        this.zzb[i] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzi(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zzdJ();
        zzi(i);
        Object[] objArr = this.zzb;
        Object obj = objArr[i];
        int i10 = this.zzc;
        if (i < i10 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i10 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzdJ();
        zzi(i);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final void zze(int i) {
        int length = this.zzb.length;
        if (i > length) {
            while (length < i) {
                length = zzg(length);
            }
            this.zzb = Arrays.copyOf(this.zzb, length);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final /* bridge */ /* synthetic */ zzgzj zzf(int i) {
        if (i >= this.zzc) {
            return new zzhat(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzhat(Object[] objArr, int i, boolean z4) {
        super(z4);
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdJ();
        int i = this.zzc;
        Object[] objArr = this.zzb;
        if (i == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzg(i));
        }
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
