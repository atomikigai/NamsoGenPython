package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgbb extends zzfzo {
    final /* synthetic */ zzgbc zza;

    public zzgbb(zzgbc zzgbcVar) {
        this.zza = zzgbcVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfwq.zza(i, this.zza.zzc, "index");
        int i10 = i + i;
        Object obj = this.zza.zzb[i10];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return true;
    }
}
