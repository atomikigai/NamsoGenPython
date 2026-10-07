package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeqo {
    public final m9.a zza;
    private final long zzb;
    private final n7.a zzc;

    public zzeqo(m9.a aVar, long j4, n7.a aVar2) {
        this.zza = aVar;
        this.zzc = aVar2;
        ((b) aVar2).getClass();
        this.zzb = SystemClock.elapsedRealtime() + j4;
    }

    public final boolean zza() {
        n7.a aVar = this.zzc;
        long j4 = this.zzb;
        ((b) aVar).getClass();
        return j4 < SystemClock.elapsedRealtime();
    }
}
