package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import h6.k0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbni implements Runnable {
    final /* synthetic */ zzbnt zza;
    final /* synthetic */ zzbmp zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbnu zze;

    public zzbni(zzbnu zzbnuVar, zzbnt zzbntVar, zzbmp zzbmpVar, ArrayList arrayList, long j4) {
        this.zza = zzbntVar;
        this.zzb = zzbmpVar;
        this.zzc = arrayList;
        this.zzd = j4;
        this.zze = zzbnuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.zze.zza) {
            try {
                k0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                    zzbce zzbceVar = zzbcn.zzhq;
                    t tVar = t.f3437d;
                    if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                        this.zza.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.zza.zzg();
                    }
                    zzges zzgesVar = zzcaj.zze;
                    final zzbmp zzbmpVar = this.zzb;
                    Objects.requireNonNull(zzbmpVar);
                    zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbmpVar.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(tVar.f3440c.zza(zzbcn.zzc));
                    int iZze = this.zza.zze();
                    int i = this.zze.zzi;
                    String strConcat = this.zzc.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.zzc.get(0)));
                    p.C.f2983j.getClass();
                    k0.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iZze + ". Update status(fullLoadTimeout) is " + i + strConcat + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                    k0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                k0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
