package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzui {
    private static final AtomicLong zza = new AtomicLong();

    public zzui(long j4, zzgi zzgiVar, Uri uri, Map map, long j10, long j11, long j12) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzui(long j4, zzgi zzgiVar, long j10) {
        Uri uri = zzgiVar.zza;
    }
}
