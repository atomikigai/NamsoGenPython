package com.google.android.gms.internal.ads;

import d6.p;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeto implements zzevz {
    private final zzges zza;
    private final zzdvk zzb;

    public zzeto(zzges zzgesVar, zzdvk zzdvkVar) {
        this.zza = zzgesVar;
        this.zzb = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzetp zzc() throws Exception {
        zzdvk zzdvkVar = this.zzb;
        String strZzc = zzdvkVar.zzc();
        boolean zZzr = zzdvkVar.zzr();
        boolean zM = p.C.f2987n.m();
        zzdvk zzdvkVar2 = this.zzb;
        return new zzetp(strZzc, zZzr, zM, zzdvkVar2.zzp(), zzdvkVar2.zzs());
    }
}
