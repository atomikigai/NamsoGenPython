package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhgl implements zzhfx {
    private final List zza;
    private final List zzb;

    static {
        zzhfy.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzhgl(List list, List list2, zzhgj zzhgjVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzhgk zza(int i, int i10) {
        return new zzhgk(i, i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zza.size();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int size2 = this.zzb.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzhgg) this.zzb.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZza = zzhfu.zza(size);
        int size3 = this.zza.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object objZzb = ((zzhgg) this.zza.get(i10)).zzb();
            objZzb.getClass();
            hashSetZza.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            for (Object obj : (Collection) arrayList.get(i11)) {
                obj.getClass();
                hashSetZza.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZza);
    }
}
