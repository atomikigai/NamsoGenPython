package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzec {
    public static final zzeb zza = new zzeb(null);
    private static final zzea zzb = new zzea(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzea zzc;
    private long zzd;

    public zzec(long j4, long j10, zzea zzeaVar) {
        this.zzc = zzeaVar;
        this.zzd = Math.abs(j4);
    }

    public final long zza() {
        zzea zzeaVar = this.zzc;
        long jLongValue = (BigInteger.valueOf(zzeaVar.zzb()).multiply(BigInteger.valueOf(this.zzd)).mod(BigInteger.valueOf(zzeaVar.zza())).longValue() + 11) % this.zzc.zza();
        this.zzd = jLongValue;
        return jLongValue % 255;
    }
}
