package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfzq {
    Object[] zza;
    int zzb;
    zzfzp zzc;

    public zzfzq() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzfzi.zze(length, i10));
        }
    }

    public final zzfzq zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfyl.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i10 = i + i;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzfzq zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfzr zzc() {
        zzfzp zzfzpVar = this.zzc;
        if (zzfzpVar != null) {
            throw zzfzpVar.zza();
        }
        zzgbf zzgbfVarZzj = zzgbf.zzj(this.zzb, this.zza, this);
        zzfzp zzfzpVar2 = this.zzc;
        if (zzfzpVar2 == null) {
            return zzgbfVarZzj;
        }
        throw zzfzpVar2.zza();
    }

    public zzfzq(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
