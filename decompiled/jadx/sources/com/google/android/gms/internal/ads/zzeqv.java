package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqv implements zzevz {
    private final zzges zza;
    private final zzdqi zzb;
    private final String zzc;
    private final zzffo zzd;

    public zzeqv(zzges zzgesVar, zzdqi zzdqiVar, zzffo zzffoVar, String str) {
        this.zza = zzgesVar;
        this.zzb = zzdqiVar;
        this.zzd = zzffoVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzequ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqw zzc() throws Exception {
        zzdqi zzdqiVar = this.zzb;
        return new zzeqw(zzdqiVar.zzb(this.zzd.zzf, this.zzc), zzdqiVar.zza());
    }
}
