package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdxd implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzdxd(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0078  */
    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        m9.a aVarZzb;
        final zzavc zzavcVar = (zzavc) this.zza.zzb();
        final Context contextZza = ((zzchq) this.zzb).zza();
        zzffo zzffoVarZza = ((zzcwd) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzges zzgesVarZzc = zzfin.zzc();
        zzbce zzbceVar = zzbcn.zzcN;
        t tVar = t.f3437d;
        int iIntValue = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(android.support.v4.media.session.a.L(android.support.v4.media.session.a.M(zzffoVarZza.zzd)))) {
                p.C.f2983j.getClass();
                if (System.currentTimeMillis() - jLongValue < ((Integer) tVar.f3440c.zza(zzbcn.zzcP)).intValue()) {
                    aVarZzb = zzgesVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwx
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzavcVar.zzc().zzg(contextZza);
                        }
                    });
                } else {
                    aVarZzb = zzgesVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwy
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzavcVar.zzc().zzf(contextZza);
                        }
                    });
                }
            } else {
                aVarZzb = zzgesVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzavcVar.zzc().zzf(contextZza);
                    }
                });
            }
        } else {
            p.C.f2983j.getClass();
            if (System.currentTimeMillis() - jLongValue < ((Integer) tVar.f3440c.zza(zzbcn.zzcP)).intValue()) {
                aVarZzb = zzgesVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzavcVar.zzc().zzg(contextZza);
                    }
                });
            } else {
                aVarZzb = zzgesVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzavcVar.zzc().zzf(contextZza);
                    }
                });
            }
        }
        zzhgf.zzb(aVarZzb);
        return aVarZzb;
    }
}
