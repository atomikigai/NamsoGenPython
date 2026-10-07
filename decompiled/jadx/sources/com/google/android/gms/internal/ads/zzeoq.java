package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeoq implements zzevz {
    private final Set zza;

    public zzeoq(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeop
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
