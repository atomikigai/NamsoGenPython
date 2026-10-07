package com.google.android.gms.internal.ads;

import e6.t;
import h6.p;
import h6.r0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdj extends p {
    final zzccf zza;
    final zzcdr zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcdj(zzccf zzccfVar, zzcdr zzcdrVar, String str, String[] strArr) {
        this.zza = zzccfVar;
        this.zzb = zzcdrVar;
        this.zzc = str;
        this.zzd = strArr;
        d6.p.C.A.zzb(this);
    }

    @Override // h6.p
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            r0.f5068l.post(new zzcdi(this));
        }
    }

    @Override // h6.p
    public final m9.a zzb() {
        return (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcc)).booleanValue() && (this.zzb instanceof zzcea)) ? zzcaj.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        }) : super.zzb();
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
