package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcry implements zzeiw {
    public final List zza;

    public zzcry(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzr() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgei.zzr((m9.a) it.next(), new zzcrx(this), zzgey.zzb());
        }
    }

    public zzcry(zzcrq zzcrqVar) {
        this.zza = Collections.singletonList(zzgei.zzh(zzcrqVar));
    }
}
