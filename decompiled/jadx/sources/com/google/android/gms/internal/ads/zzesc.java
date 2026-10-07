package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import h6.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesc implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzesc(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzfzt zzfztVarZzn;
        zzesz zzeszVarZzb = ((zzetb) this.zza).zzb();
        Context contextZza = ((zzchq) this.zzb).zza();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkZ)).booleanValue()) {
            r0 r0Var = p.C.f2979c;
            if (r0.b(contextZza)) {
                zzfztVarZzn = zzfzt.zzo(zzeszVarZzb);
            } else {
                zzfztVarZzn = zzfzt.zzn();
            }
        } else {
            zzfztVarZzn = zzfzt.zzn();
        }
        zzhgf.zzb(zzfztVarZzn);
        return zzfztVarZzn;
    }
}
