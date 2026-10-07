package com.google.android.gms.internal.ads;

import e6.t;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzerg implements zzhfx {
    public static zzerg zza() {
        return zzerf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        Object arrayList = new ArrayList();
        zzbce zzbceVar = zzbcn.zzlu;
        t tVar = t.f3437d;
        if (!((String) tVar.f3440c.zza(zzbceVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) tVar.f3440c.zza(zzbceVar)).split(","));
        }
        zzhgf.zzb(arrayList);
        return arrayList;
    }
}
