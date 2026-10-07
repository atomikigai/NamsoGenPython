package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfza extends zzfzd {
    public zzfza() {
        super(null);
    }

    public static final zzfzd zzf(int i) {
        if (i < 0) {
            return zzfzd.zzb;
        }
        return i > 0 ? zzfzd.zzc : zzfzd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zzb(int i, int i10) {
        return zzf(Integer.compare(i, i10));
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zzd(boolean z4, boolean z10) {
        return zzf(Boolean.compare(z4, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zze(boolean z4, boolean z10) {
        return zzf(Boolean.compare(z10, z4));
    }
}
