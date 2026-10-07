package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcyd implements zzhfx {
    private final zzhgp zza;

    public zzcyd(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    public static zzcyc zzc(Set set) {
        return new zzcyc(set);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcyc zzb() {
        return new zzcyc(((zzhgl) this.zza).zzb());
    }
}
