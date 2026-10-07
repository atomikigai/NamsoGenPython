package com.google.android.gms.internal.ads;

import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgky {
    public static final /* synthetic */ int zza = 0;
    private static final ThreadLocal zzb = new zzgkx();

    public static Cipher zza() {
        return (Cipher) zzb.get();
    }
}
