package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfxs extends zzgah {
    final /* synthetic */ zzfxu zza;

    public zzfxs(zzfxu zzfxuVar) {
        this.zza = zzfxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgah, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfyn.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfxt(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgah, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfxu zzfxuVar = this.zza;
        zzfyh.zzo(zzfxuVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final Map zza() {
        return this.zza;
    }
}
