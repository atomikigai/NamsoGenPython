package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbbj {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbbj(InputStream inputStream, boolean z4, boolean z10, long j4, boolean z11) {
        this.zza = inputStream;
        this.zzb = z4;
        this.zzc = z10;
        this.zzd = j4;
        this.zze = z11;
    }

    public static zzbbj zzb(InputStream inputStream, boolean z4, boolean z10, long j4, boolean z11) {
        return new zzbbj(inputStream, z4, z10, j4, z11);
    }

    public final long zza() {
        return this.zzd;
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
