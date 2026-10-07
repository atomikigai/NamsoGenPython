package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzhfs {
    final LinkedHashMap zza;

    public zzhfs(int i) {
        this.zza = zzhfu.zzb(i);
    }

    public final zzhfs zza(Object obj, zzhgg zzhggVar) {
        zzhgf.zza(obj, "key");
        zzhgf.zza(zzhggVar, "provider");
        this.zza.put(obj, zzhggVar);
        return this;
    }
}
