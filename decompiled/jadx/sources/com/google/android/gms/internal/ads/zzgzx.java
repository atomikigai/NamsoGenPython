package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgzx extends zzgxb implements RandomAccess, zzgzi, zzhar {
    private static final zzgzx zza = new zzgzx(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzgzx() {
        this(new long[10], 0, true);
    }

    public static zzgzx zzh() {
        return zza;
    }

    private final String zzi(int i) {
        return q1.a.i(i, this.zzc, "Index:", ", Size:");
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        zzdJ();
        if (i < 0 || i > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i11 = i + 1;
        long[] jArr = this.zzb;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i11, i10 - i);
        } else {
            long[] jArr2 = new long[q1.a.u(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i11, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = jLongValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzgzk.zzb;
        collection.getClass();
        if (!(collection instanceof zzgzx)) {
            return super.addAll(collection);
        }
        zzgzx zzgzxVar = (zzgzx) collection;
        int i = zzgzxVar.zzc;
        if (i == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        long[] jArr = this.zzb;
        if (i11 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zzgzxVar.zzb, 0, this.zzb, this.zzc, zzgzxVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgzx)) {
            return super.equals(obj);
        }
        zzgzx zzgzxVar = (zzgzx) obj;
        if (this.zzc != zzgzxVar.zzc) {
            return false;
        }
        long[] jArr = zzgzxVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long j4 = this.zzb[i10];
            byte[] bArr = zzgzk.zzb;
            i = (i * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.zzc;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zzb[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdJ();
        zzj(i);
        long[] jArr = this.zzb;
        long j4 = jArr[i];
        int i10 = this.zzc;
        if (i < i10 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i10 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zzdJ();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i10, jArr, i, this.zzc - i10);
        this.zzc -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Long.valueOf(zzd(i, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final long zza(int i) {
        zzj(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final long zzd(int i, long j4) {
        zzdJ();
        zzj(i);
        long[] jArr = this.zzb;
        long j10 = jArr[i];
        jArr[i] = j4;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgzi zzf(int i) {
        if (i >= this.zzc) {
            return new zzgzx(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final void zzg(long j4) {
        zzdJ();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[q1.a.u(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        jArr3[i10] = j4;
    }

    private zzgzx(long[] jArr, int i, boolean z4) {
        super(z4);
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
