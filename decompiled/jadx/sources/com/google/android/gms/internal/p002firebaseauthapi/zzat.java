package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzat extends zzam {
    final /* synthetic */ zzau zza;

    public zzat(zzau zzauVar) {
        this.zza = zzauVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzu.zza(i, this.zza.zzc, "index");
        zzau zzauVar = this.zza;
        int i10 = i + i;
        Object obj = zzauVar.zzb[i10];
        obj.getClass();
        Object obj2 = zzauVar.zzb[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
