package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdhs implements zzbjr {
    private final WeakReference zza;

    public /* synthetic */ zzdhs(zzdhu zzdhuVar, zzdht zzdhtVar) {
        this.zza = new WeakReference(zzdhuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzdhu zzdhuVar = (zzdhu) this.zza.get();
        if (zzdhuVar == null) {
            return;
        }
        zzdhuVar.zzg.zza();
    }
}
