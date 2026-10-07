package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhfn implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhfo zzb;

    public zzhfn(zzhfo zzhfoVar) {
        this.zzb = zzhfoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhfo zzhfoVar = this.zzb;
            zzhfoVar.zza.add(zzhfoVar.zzb.next());
            return next();
        }
        zzhfo zzhfoVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzhfoVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
