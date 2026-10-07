package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdrm implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzdrm(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        Set setSingleton;
        final String str = (String) this.zza.zzb();
        Context contextZza = ((zzchq) this.zzb).zza();
        zzges zzgesVarZzc = zzfin.zzc();
        Map mapZzb = ((zzhgb) this.zzc).zzb();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeV)).booleanValue()) {
            zzbbl zzbblVar = new zzbbl(new zzbbr(contextZza));
            zzbblVar.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdrn
                @Override // com.google.android.gms.internal.ads.zzbbk
                public final void zza(zzbbs.zzt.zza zzaVar) {
                    zzaVar.zzO(str);
                }
            });
            setSingleton = Collections.singleton(new zzded(new zzdrp(zzbblVar, mapZzb), zzgesVarZzc));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        zzhgf.zzb(setSingleton);
        return setSingleton;
    }
}
