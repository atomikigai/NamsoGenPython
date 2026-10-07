package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgco {
    public static char zza(long j4) {
        char c10 = (char) j4;
        zzfwq.zzh(((long) c10) == j4, "Out of range: %s", j4);
        return c10;
    }

    public static char zzb(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
