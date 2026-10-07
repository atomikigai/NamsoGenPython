package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgcq extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgcq(int[] iArr, int i, int i10) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgcr.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgcq)) {
            return super.equals(obj);
        }
        zzgcq zzgcqVar = (zzgcq) obj;
        int i = this.zzc - this.zzb;
        if (zzgcqVar.zzc - zzgcqVar.zzb != i) {
            return false;
        }
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zza[this.zzb + i10] != zzgcqVar.zza[zzgcqVar.zzb + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfwq.zza(i, this.zzc - this.zzb, "index");
        return Integer.valueOf(this.zza[this.zzb + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = this.zzb; i10 < this.zzc; i10++) {
            i = (i * 31) + this.zza[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iZza;
        if (!(obj instanceof Integer) || (iZza = zzgcr.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return iZza - this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int i10 = this.zzc - 1;
            while (i10 >= i) {
                if (iArr[i10] != iIntValue) {
                    i10--;
                } else if (i10 >= 0) {
                    return i10 - this.zzb;
                }
            }
            i10 = -1;
            if (i10 >= 0) {
                return i10 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        zzfwq.zza(i, this.zzc - this.zzb, "index");
        int[] iArr = this.zza;
        int i10 = this.zzb + i;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        zzfwq.zzj(i, i10, this.zzc - this.zzb);
        if (i == i10) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.zza;
        int i11 = this.zzb;
        return new zzgcq(iArr, i11 + i, i10 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.zzc - this.zzb) * 5);
        sb2.append('[');
        sb2.append(this.zza[this.zzb]);
        int i = this.zzb;
        while (true) {
            i++;
            if (i >= this.zzc) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.zza[i]);
        }
    }
}
