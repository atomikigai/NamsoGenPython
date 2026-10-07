package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzetd implements zzevz {
    private final zzges zza;
    private final zzffo zzb;

    public zzetd(zzges zzgesVar, zzffo zzffoVar) {
        this.zza = zzgesVar;
        this.zzb = zzffoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzete zzc() throws Exception {
        return new zzete("requester_type_2".equals(android.support.v4.media.session.a.M(this.zzb.zzd)));
    }
}
