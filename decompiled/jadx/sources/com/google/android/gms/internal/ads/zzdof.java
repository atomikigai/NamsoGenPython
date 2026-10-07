package com.google.android.gms.internal.ads;

import g6.c;
import g6.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdof extends zzdnp implements zzdel {
    private zzdel zza;

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdG() {
        zzdel zzdelVar = this.zza;
        if (zzdelVar != null) {
            zzdelVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdf() {
        zzdel zzdelVar = this.zza;
        if (zzdelVar != null) {
            zzdelVar.zzdf();
        }
    }

    public final synchronized void zzi(e6.a aVar, zzbih zzbihVar, l lVar, zzbij zzbijVar, c cVar, zzdel zzdelVar) throws Throwable {
        try {
            try {
                zzh(aVar, zzbihVar, lVar, zzbijVar, cVar);
                this.zza = zzdelVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
