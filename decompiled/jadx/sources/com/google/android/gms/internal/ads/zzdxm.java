package com.google.android.gms.internal.ads;

import d6.p;
import h6.r0;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdxm implements zzhfx {
    public static zzdxm zza() {
        return zzdxl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        r0 r0Var = p.C.f2979c;
        String string = UUID.randomUUID().toString();
        zzhgf.zzb(string);
        return string;
    }
}
