package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgoa {
    public static final zzgwu zza = zzgwu.zzb(new byte[0]);

    public static final zzgwu zza(int i) {
        return zzgwu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzgwu zzb(int i) {
        return zzgwu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
