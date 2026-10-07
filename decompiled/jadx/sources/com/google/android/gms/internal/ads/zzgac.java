package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgac extends zzgbt {
    final /* synthetic */ zzgad zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgac(zzgad zzgadVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
