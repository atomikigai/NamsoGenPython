package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpt extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zzpt(int i, zzad zzadVar, boolean z4) {
        super(v.f(i, "AudioTrack write failed: "));
        this.zzb = z4;
        this.zza = i;
        this.zzc = zzadVar;
    }
}
