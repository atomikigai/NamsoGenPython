package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfzs extends zzfzh {
    Object[] zzd;
    private int zze;

    public zzfzs() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfzh, com.google.android.gms.internal.ads.zzfzi
    public final /* bridge */ /* synthetic */ zzfzi zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfzs zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzh = zzfzt.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzh <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzfzg.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzfzs zzg(Object... objArr) {
        if (this.zzd == null) {
            zzd(objArr, 2);
            return this;
        }
        for (int i = 0; i < 2; i++) {
            zzf(objArr[i]);
        }
        return this;
    }

    public final zzfzs zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzfzt zzi() {
        zzfzt zzfztVarZzv;
        int i = this.zzb;
        if (i == 0) {
            return zzgbg.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgbr(obj);
        }
        if (this.zzd == null || zzfzt.zzh(i) != this.zzd.length) {
            zzfztVarZzv = zzfzt.zzv(this.zzb, this.zza);
            this.zzb = zzfztVarZzv.size();
        } else {
            int i10 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzfzt.zzw(i10, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            int i11 = this.zze;
            Object[] objArr = this.zzd;
            zzfztVarZzv = new zzgbg(objArrCopyOf, i11, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfztVarZzv;
    }

    public zzfzs(int i, boolean z4) {
        super(i);
        this.zzd = new Object[zzfzt.zzh(i)];
    }
}
