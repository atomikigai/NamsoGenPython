package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalx {
    private static final zzalx zza = new zzalx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzamc zzb = new zzalh();

    private zzalx() {
    }

    public static zzalx zza() {
        return zza;
    }

    public final zzamb zzb(Class cls) {
        zzakq.zzc(cls, "messageType");
        zzamb zzambVar = (zzamb) this.zzc.get(cls);
        if (zzambVar != null) {
            return zzambVar;
        }
        zzamb zzambVarZza = this.zzb.zza(cls);
        zzakq.zzc(cls, "messageType");
        zzamb zzambVar2 = (zzamb) this.zzc.putIfAbsent(cls, zzambVarZza);
        return zzambVar2 == null ? zzambVarZza : zzambVar2;
    }
}
