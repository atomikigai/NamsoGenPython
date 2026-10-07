package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgox implements zzgpb {
    private final zzgwu zza;
    private final zzgue zzb;

    private zzgox(zzgue zzgueVar, zzgwu zzgwuVar) {
        this.zzb = zzgueVar;
        this.zza = zzgwuVar;
    }

    public static zzgox zza(zzgue zzgueVar) throws GeneralSecurityException {
        return new zzgox(zzgueVar, zzgpj.zza(zzgueVar.zzi()));
    }

    public static zzgox zzb(zzgue zzgueVar) {
        return new zzgox(zzgueVar, zzgpj.zzb(zzgueVar.zzi()));
    }

    public final zzgue zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpb
    public final zzgwu zzd() {
        return this.zza;
    }
}
