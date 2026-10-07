package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzevk implements zzevz {
    private final zzbyv zza;
    private final zzges zzb;
    private final Context zzc;

    public zzevk(zzbyv zzbyvVar, zzges zzgesVar, Context context) {
        this.zza = zzbyvVar;
        this.zzb = zzgesVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzevl zzc() throws Exception {
        if (!this.zza.zzp(this.zzc)) {
            return new zzevl(null, null, null, null, null);
        }
        String strZzd = this.zza.zzd(this.zzc);
        String str = strZzd == null ? "" : strZzd;
        String strZzb = this.zza.zzb(this.zzc);
        String str2 = strZzb == null ? "" : strZzb;
        String strZza = this.zza.zza(this.zzc);
        String str3 = strZza == null ? "" : strZza;
        Long l2 = null;
        String str4 = true != this.zza.zzp(this.zzc) ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l2 = (Long) t.f3437d.f3440c.zza(zzbcn.zzaq);
        }
        return new zzevl(str, str2, str3, str4 == null ? "" : str4, l2);
    }
}
