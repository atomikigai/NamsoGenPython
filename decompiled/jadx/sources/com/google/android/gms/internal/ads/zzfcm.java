package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import h6.n0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfcm implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzfcm(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfck zzb() {
        zzbzt zzbztVarN;
        Context context = (Context) this.zza.zzb();
        zzfgy zzfgyVar = (zzfgy) this.zzb.zzb();
        zzfhq zzfhqVar = (zzfhq) this.zzc.zzb();
        zzbce zzbceVar = zzbcn.zzgh;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            zzbztVarN = ((n0) p.C.f2982g.zzi()).n();
        } else {
            n0 n0Var = (n0) p.C.f2982g.zzi();
            synchronized (n0Var.f5036a) {
                zzbztVarN = n0Var.f5046n;
            }
        }
        boolean z4 = false;
        if (zzbztVarN != null && zzbztVarN.zzh()) {
            z4 = true;
        }
        if (((Integer) tVar.f3440c.zza(zzbcn.zzgx)).intValue() > 0) {
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzgg)).booleanValue() || z4) {
                zzfhp zzfhpVarZza = zzfhqVar.zza(zzfhg.AppOpen, context, zzfgyVar, new zzfbo(new zzfbl()));
                zzfca zzfcaVar = new zzfca(new zzfbz());
                zzfhc zzfhcVar = zzfhpVarZza.zza;
                zzges zzgesVar = zzcaj.zza;
                return new zzfbq(zzfcaVar, new zzfbw(zzfhcVar, zzgesVar), zzfhpVarZza.zzb, zzfhpVarZza.zza.zza().zzf, zzgesVar);
            }
        }
        return new zzfbz();
    }
}
