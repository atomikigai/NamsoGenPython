package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcil implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcil(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbvr zzb() {
        Context contextZza = ((zzchq) this.zza).zza();
        zzfko zzfkoVar = (zzfko) this.zzb.zzb();
        p pVar = p.C;
        zzboi zzboiVarZzb = pVar.f2990q.zzb(contextZza, i6.a.g(), zzfkoVar);
        zzboc zzbocVar = zzbof.zza;
        zzboiVarZzb.zza("google.afma.request.getAdDictionary", zzbocVar, zzbocVar);
        return new zzbvt(contextZza, pVar.f2990q.zzb(contextZza, i6.a.g(), zzfkoVar).zza("google.afma.sdkConstants.getSdkConstants", zzbocVar, zzbocVar), i6.a.g());
    }
}
