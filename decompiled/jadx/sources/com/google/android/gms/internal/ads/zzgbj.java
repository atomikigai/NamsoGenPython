package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgbj extends zzfxp {
    final Iterator zza;
    final /* synthetic */ zzgbk zzb;

    public zzgbj(zzgbk zzgbkVar) {
        this.zzb = zzgbkVar;
        this.zza = zzgbkVar.zza.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            Set set = this.zzb.zzb;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
