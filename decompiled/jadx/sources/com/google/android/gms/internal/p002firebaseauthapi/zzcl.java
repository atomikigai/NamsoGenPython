package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcl {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzch zzc;
    private final Class zzd;
    private final zzro zze;

    public /* synthetic */ zzcl(ConcurrentMap concurrentMap, List list, zzch zzchVar, zzro zzroVar, Class cls, zzck zzckVar) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzchVar;
        this.zzd = cls;
        this.zze = zzroVar;
    }

    public final zzch zza() {
        return this.zzc;
    }

    public final zzro zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzcj(bArr, null));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
