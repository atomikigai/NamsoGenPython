package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwk extends zzbv {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzaw zzf;
    private final zzaq zzg;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zza("SinglePeriodTimeline");
        zzakVar.zzb(Uri.EMPTY);
        zzakVar.zzc();
    }

    public zzwk(long j4, long j10, long j11, long j12, long j13, long j14, long j15, boolean z4, boolean z10, boolean z11, Object obj, zzaw zzawVar, zzaq zzaqVar) {
        this.zzc = j12;
        this.zzd = j13;
        this.zze = z4;
        zzawVar.getClass();
        this.zzf = zzawVar;
        this.zzg = zzaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i, zzbt zzbtVar, boolean z4) {
        zzdb.zza(i, 0, 1);
        zzbtVar.zzi(null, z4 ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i, zzbu zzbuVar, long j4) {
        zzdb.zza(i, 0, 1);
        Object obj = zzbu.zza;
        zzaw zzawVar = this.zzf;
        long j10 = this.zzd;
        zzbuVar.zza(obj, zzawVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, this.zzg, 0L, j10, 0, 0, 0L);
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i) {
        zzdb.zza(i, 0, 1);
        return zzb;
    }
}
