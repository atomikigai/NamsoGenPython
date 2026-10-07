package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaep implements zzaef {
    public final String zza;

    private zzaep(String str) {
        this.zza = str;
    }

    public static zzaep zzb(zzed zzedVar) {
        return new zzaep(zzedVar.zzB(zzedVar.zzb(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return 1852994675;
    }
}
