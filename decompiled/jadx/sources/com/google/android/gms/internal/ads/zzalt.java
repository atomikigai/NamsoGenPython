package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalt {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzals
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((zzalt) obj).zzb.zzb, ((zzalt) obj2).zzb.zzb);
        }
    };
    private final zzalu zzb;
    private final int zzc;

    public /* synthetic */ zzalt(zzalu zzaluVar, int i, zzalx zzalxVar) {
        this.zzb = zzaluVar;
        this.zzc = i;
    }
}
