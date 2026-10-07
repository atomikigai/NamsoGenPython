package com.google.android.gms.internal.ads;

import n6.k;
import n6.l;
import n6.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbst {
    private final l zza;
    private final k zzb;
    private m zzc;

    public zzbst(l lVar, k kVar) {
    }

    public static /* bridge */ /* synthetic */ k zzc(zzbst zzbstVar) {
        zzbstVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ l zzd(zzbst zzbstVar) {
        zzbstVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized m zzf(zzbgs zzbgsVar) {
        m mVar = this.zzc;
        if (mVar != null) {
            return mVar;
        }
        zzbsu zzbsuVar = new zzbsu(zzbgsVar);
        this.zzc = zzbsuVar;
        return zzbsuVar;
    }

    public final zzbhc zza() {
        return null;
    }

    public final zzbhf zzb() {
        return new zzbsr(this, null);
    }
}
