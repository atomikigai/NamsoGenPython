package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzuk extends zzuf {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzuk(zzbv zzbvVar, Object obj, Object obj2) {
        super(zzbvVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzuk zzq(zzaw zzawVar) {
        return new zzuk(new zzul(zzawVar), zzbu.zza, zzc);
    }

    public static zzuk zzr(zzbv zzbvVar, Object obj, Object obj2) {
        return new zzuk(zzbvVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i, zzbt zzbtVar, boolean z4) {
        this.zzb.zzd(i, zzbtVar, z4);
        if (Objects.equals(zzbtVar.zzb, this.zze) && z4) {
            zzbtVar.zzb = zzc;
        }
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i, zzbu zzbuVar, long j4) {
        this.zzb.zze(i, zzbuVar, j4);
        if (Objects.equals(zzbuVar.zzb, this.zzd)) {
            zzbuVar.zzb = zzbu.zza;
        }
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i) {
        Object objZzf = this.zzb.zzf(i);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzuk zzp(zzbv zzbvVar) {
        return new zzuk(zzbvVar, this.zzd, this.zze);
    }
}
