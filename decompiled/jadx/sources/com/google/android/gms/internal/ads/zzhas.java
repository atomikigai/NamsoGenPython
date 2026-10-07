package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhas {
    public static final /* synthetic */ int zza = 0;
    private static final zzhas zzb = new zzhas();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzhbc zzc = new zzhaa();

    private zzhas() {
    }

    public static zzhas zza() {
        return zzb;
    }

    public final zzhbb zzb(Class cls) {
        zzgzk.zzc(cls, "messageType");
        zzhbb zzhbbVar = (zzhbb) this.zzd.get(cls);
        if (zzhbbVar != null) {
            return zzhbbVar;
        }
        zzhbb zzhbbVarZza = this.zzc.zza(cls);
        zzgzk.zzc(cls, "messageType");
        zzhbb zzhbbVar2 = (zzhbb) this.zzd.putIfAbsent(cls, zzhbbVarZza);
        return zzhbbVar2 == null ? zzhbbVarZza : zzhbbVar2;
    }
}
