package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzctx {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    public final int zza(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzb(String str) {
        Long l2 = (Long) this.zzd.get(str);
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final void zzc(String str) {
        synchronized (this.zza) {
            try {
                Integer num = (Integer) this.zzb.get(str);
                this.zzb.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(String str, String str2, long j4) {
        Long l2 = (Long) this.zzc.get(str2);
        if (l2 == null) {
            return;
        }
        this.zzc.remove(str2);
        this.zzd.put(str, Long.valueOf(j4 - l2.longValue()));
    }

    public final void zze(String str, long j4) {
        this.zzc.put(str, Long.valueOf(j4));
    }
}
