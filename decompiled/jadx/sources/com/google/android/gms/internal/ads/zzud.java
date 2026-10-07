package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzud {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzgc zzc;

    public zzud(zzacw zzacwVar, zzakg zzakgVar) {
    }

    public final void zza(zzgc zzgcVar) {
        if (zzgcVar != this.zzc) {
            this.zzc = zzgcVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
