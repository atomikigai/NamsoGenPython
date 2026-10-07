package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzgds extends zzgdi {
    private List zza;

    public zzgds(zzfzj zzfzjVar, boolean z4) {
        super(zzfzjVar, z4, true);
        List listZza = zzfzjVar.isEmpty() ? Collections.EMPTY_LIST : zzgae.zza(zzfzjVar.size());
        for (int i = 0; i < zzfzjVar.size(); i++) {
            listZza.add(null);
        }
        this.zza = listZza;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgdr(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
