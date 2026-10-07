package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgdq extends zzgds {
    public zzgdq(zzfzj zzfzjVar, boolean z4) {
        super(zzfzjVar, z4);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList arrayListZza = zzgae.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgdr zzgdrVar = (zzgdr) it.next();
            arrayListZza.add(zzgdrVar != null ? zzgdrVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
