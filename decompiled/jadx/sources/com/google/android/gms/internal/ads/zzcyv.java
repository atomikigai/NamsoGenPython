package com.google.android.gms.internal.ads;

import e6.s3;
import e6.t;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcyv extends zzdcc implements zzcxg, zzcyl {
    private final zzfet zzb;
    private final AtomicBoolean zzc;

    public zzcyv(Set set, zzfet zzfetVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfetVar;
    }

    private final void zzb() {
        s3 s3Var;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhx)).booleanValue() && this.zzc.compareAndSet(false, true) && (s3Var = this.zzb.zzae) != null && s3Var.f3433a == 3) {
            zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcyu
                @Override // com.google.android.gms.internal.ads.zzdcb
                public final void zza(Object obj) throws Exception {
                    this.zza.zza((zzcyx) obj);
                }
            });
        }
    }

    public final /* synthetic */ void zza(zzcyx zzcyxVar) throws Exception {
        zzcyxVar.zzh(this.zzb.zzae);
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
