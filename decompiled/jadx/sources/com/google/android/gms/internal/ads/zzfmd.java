package com.google.android.gms.internal.ads;

import java.util.Optional;
import java.util.function.Consumer;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfmd {
    private final zzdsm zza;

    public zzfmd(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final void zza(b bVar, long j4, Optional optional) {
        final zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzb("plaac_ts", Long.toString(j4));
        zzdslVarZza.zzb("ad_format", bVar.name());
        zzdslVarZza.zzb("action", "is_ad_available");
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.zzfmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzdslVarZza.zzb("plaay_ts", Long.toString(((Long) obj).longValue()));
            }
        });
        zzdslVarZza.zzf();
    }
}
