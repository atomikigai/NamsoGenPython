package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaoj {
    public final int zza;
    public final long zzb;

    private zzaoj(int i, long j4) {
        this.zza = i;
        this.zzb = j4;
    }

    public static zzaoj zza(zzacs zzacsVar, zzed zzedVar) throws IOException {
        zzacsVar.zzh(zzedVar.zzN(), 0, 8);
        zzedVar.zzL(0);
        return new zzaoj(zzedVar.zzg(), zzedVar.zzs());
    }
}
