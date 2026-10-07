package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgdl extends zzgdj {
    private zzgdl() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final int zza(zzgdn zzgdnVar) {
        int i;
        synchronized (zzgdnVar) {
            i = zzgdnVar.remaining - 1;
            zzgdnVar.remaining = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzb(zzgdn zzgdnVar, Set set, Set set2) {
        synchronized (zzgdnVar) {
            try {
                if (zzgdnVar.seenExceptions == null) {
                    zzgdnVar.seenExceptions = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzgdl(zzgdm zzgdmVar) {
        super(null);
    }
}
