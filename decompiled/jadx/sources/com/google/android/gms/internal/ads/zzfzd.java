package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfzd {
    private static final zzfzd zza = new zzfza();
    private static final zzfzd zzb = new zzfzb(-1);
    private static final zzfzd zzc = new zzfzb(1);

    public /* synthetic */ zzfzd(zzfzc zzfzcVar) {
    }

    public static zzfzd zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfzd zzb(int i, int i10);

    public abstract zzfzd zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfzd zzd(boolean z4, boolean z10);

    public abstract zzfzd zze(boolean z4, boolean z10);
}
