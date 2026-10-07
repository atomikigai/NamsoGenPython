package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfzv extends zzfxp {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfwr zzb;

    public zzfzv(Iterator it, zzfwr zzfwrVar) {
        this.zza = it;
        this.zzb = zzfwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfwr zzfwrVar = this.zzb;
            Object next = it.next();
            if (zzfwrVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
