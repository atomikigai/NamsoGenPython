package com.google.android.gms.internal.ads;

import h6.c0;
import h6.k0;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbng implements zzbjr {
    final /* synthetic */ zzbmp zza;
    final /* synthetic */ c0 zzb;
    final /* synthetic */ zzbnu zzc;

    public zzbng(zzbnu zzbnuVar, zzavc zzavcVar, zzbmp zzbmpVar, c0 c0Var) {
        this.zza = zzbmpVar;
        this.zzb = c0Var;
        this.zzc = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        k0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                k0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                h.f("JS Engine is requesting an update");
                if (this.zzc.zzi == 0) {
                    h.f("Starting reload.");
                    this.zzc.zzi = 2;
                    this.zzc.zzd(null);
                }
                this.zza.zzr("/requestReload", (zzbjr) this.zzb.f4978a);
            } catch (Throwable th) {
                throw th;
            }
        }
        k0.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
