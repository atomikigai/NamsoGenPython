package com.google.android.gms.internal.ads;

import android.content.Context;
import i6.k;
import p6.b;
import p6.c;
import p6.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdsv implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzdsv(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
        this.zzd = zzhgpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzges zzgesVarZzc = zzfin.zzc();
        k kVar = (k) this.zza.zzb();
        b bVar = (b) this.zzb;
        p6.a aVar = new p6.a((Context) bVar.f7817a.zzb(), (i6.a) bVar.f7818b.zzb());
        ((d) this.zzc).getClass();
        return new zzdsr(zzgesVarZzc, kVar, aVar, new c(), ((zzchq) this.zzd).zza());
    }
}
