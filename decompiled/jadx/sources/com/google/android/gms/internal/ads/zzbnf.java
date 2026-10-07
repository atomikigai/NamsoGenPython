package com.google.android.gms.internal.ads;

import d6.p;
import h6.k0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbnf implements zzbjr {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbnt zzb;
    final /* synthetic */ zzbmp zzc;
    final /* synthetic */ zzbnu zzd;

    public zzbnf(zzbnu zzbnuVar, long j4, zzbnt zzbntVar, zzbmp zzbmpVar) {
        this.zza = j4;
        this.zzb = zzbntVar;
        this.zzc = zzbmpVar;
        this.zzd = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        p.C.f2983j.getClass();
        k0.k("onGmsg /jsLoaded. JsLoaded latency is " + (System.currentTimeMillis() - this.zza) + " ms.");
        k0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.zzd.zza) {
            k0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzbmp zzbmpVar = this.zzc;
                zzbmpVar.zzq("/log", zzbjq.zzg);
                zzbmpVar.zzq("/result", zzbjq.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                k0.k("Successfully loaded JS Engine.");
                k0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            k0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
