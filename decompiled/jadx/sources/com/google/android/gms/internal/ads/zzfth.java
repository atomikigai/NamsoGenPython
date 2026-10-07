package com.google.android.gms.internal.ads;

import j$.time.Instant;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfth {
    private final String zza;
    private final Instant zzb;

    public zzfth(String str, Instant instant) {
        this.zza = str;
        this.zzb = instant;
    }

    public final String zza() {
        return this.zza;
    }

    public final Instant zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb.isAfter(Instant.EPOCH);
    }

    public zzfth() {
        this.zza = null;
        this.zzb = Instant.ofEpochMilli(-1L);
    }
}
