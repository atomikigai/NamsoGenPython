package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeuj implements zzevz {
    private static String zza;
    private final zzges zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeuj(zzges zzgesVar, Context context, Set set) {
        this.zzb = zzgesVar;
        this.zzc = context;
        this.zzd = set;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r0.contains("banner") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzeuk zzc() throws java.lang.Exception {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzfb
            e6.t r1 = e6.t.f3437d
            com.google.android.gms.internal.ads.zzbcl r2 = r1.f3440c
            com.google.android.gms.internal.ads.zzbcl r1 = r1.f3440c
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7a
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzfm
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L44
            java.util.Set r0 = r3.zzd
            java.lang.String r2 = "rewarded"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L44
            java.lang.String r2 = "interstitial"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L44
            java.lang.String r2 = "native"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L44
            java.lang.String r2 = "banner"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L7a
        L44:
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzfn
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6a
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeuj.zza
            if (r0 != 0) goto L62
            android.content.Context r0 = r3.zzc
            d6.p r1 = d6.p.C
            com.google.android.gms.internal.ads.zzeeq r1 = r1.f2997x
            java.lang.String r0 = r1.zzf(r0)
            com.google.android.gms.internal.ads.zzeuj.zza = r0
        L62:
            com.google.android.gms.internal.ads.zzeuk r0 = new com.google.android.gms.internal.ads.zzeuk
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeuj.zza
            r0.<init>(r1)
            return r0
        L6a:
            android.content.Context r0 = r3.zzc
            com.google.android.gms.internal.ads.zzeuk r1 = new com.google.android.gms.internal.ads.zzeuk
            d6.p r2 = d6.p.C
            com.google.android.gms.internal.ads.zzeeq r2 = r2.f2997x
            java.lang.String r0 = r2.zzf(r0)
            r1.<init>(r0)
            return r1
        L7a:
            com.google.android.gms.internal.ads.zzeuk r0 = new com.google.android.gms.internal.ads.zzeuk
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuj.zzc():com.google.android.gms.internal.ads.zzeuk");
    }
}
