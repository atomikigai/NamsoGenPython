package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzao {
    Object[] zza;
    int zzb;
    zzan zzc;

    public zzao() {
        this(4);
    }

    private final void zzb(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzah.zza(length, i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzao zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzb(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzb(this.zzb + 1);
            zzae.zza(key, value);
            Object[] objArr = this.zza;
            int i = this.zzb;
            int i10 = i + i;
            objArr[i10] = key;
            objArr[i10 + 1] = value;
            this.zzb = i + 1;
        }
        return this;
    }

    public zzao(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
