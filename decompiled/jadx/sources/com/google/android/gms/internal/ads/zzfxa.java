package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfxa implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfxd zzb;

    public zzfxa(zzfxd zzfxdVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfxdVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfwi.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
