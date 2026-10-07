package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzchq implements zzhfx {
    private final zzchn zza;

    public zzchq(zzchn zzchnVar) {
        this.zza = zzchnVar;
    }

    public static Context zzc(zzchn zzchnVar) {
        Context contextZzb = zzchnVar.zzb();
        zzhgf.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
