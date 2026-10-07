package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcrs implements zzcrt {
    private final Map zza;

    public zzcrs(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final zzefb zza(int i, String str) {
        return (zzefb) this.zza.get(str);
    }
}
