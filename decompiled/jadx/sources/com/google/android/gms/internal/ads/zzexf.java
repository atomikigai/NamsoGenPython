package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzexf implements zzevz {
    private final Executor zza;
    private final String zzb;

    public zzexf(zzbzq zzbzqVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return zzgei.zzf(zzgei.zzm(zzgei.zzh(this.zzb), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzexg((String) obj);
            }
        }, this.zza), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ m9.a zzc(Throwable th) throws Exception {
        return zzgei.zzh(new zzexg(this.zzb));
    }
}
