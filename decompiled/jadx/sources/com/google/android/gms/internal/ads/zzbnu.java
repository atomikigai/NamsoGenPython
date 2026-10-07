package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import h6.c0;
import h6.k0;
import h6.r;
import h6.r0;
import i6.h;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbnu {
    private final Context zzb;
    private final String zzc;
    private final i6.a zzd;
    private final zzfko zze;
    private final r zzf;
    private final r zzg;
    private zzbnt zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbnu(Context context, i6.a aVar, String str, r rVar, r rVar2, zzfko zzfkoVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = aVar;
        this.zze = zzfkoVar;
        this.zzf = rVar;
        this.zzg = rVar2;
    }

    public final zzbno zzb(zzavc zzavcVar) {
        k0.k("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                k0.k("getEngine: Lock acquired");
                k0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.zza) {
                    try {
                        k0.k("refreshIfDestroyed: Lock acquired");
                        zzbnt zzbntVar = this.zzh;
                        if (zzbntVar != null && this.zzi == 0) {
                            zzbntVar.zzj(new zzcas() { // from class: com.google.android.gms.internal.ads.zzbna
                                @Override // com.google.android.gms.internal.ads.zzcas
                                public final void zza(Object obj) {
                                    this.zza.zzk((zzbmp) obj);
                                }
                            }, new zzcaq() { // from class: com.google.android.gms.internal.ads.zzbnb
                                @Override // com.google.android.gms.internal.ads.zzcaq
                                public final void zza() {
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                k0.k("refreshIfDestroyed: Lock released");
                zzbnt zzbntVar2 = this.zzh;
                if (zzbntVar2 != null && zzbntVar2.zze() != -1) {
                    int i = this.zzi;
                    if (i == 0) {
                        k0.k("getEngine (NO_UPDATE): Lock released");
                        return this.zzh.zza();
                    }
                    if (i != 1) {
                        k0.k("getEngine (UPDATING): Lock released");
                        return this.zzh.zza();
                    }
                    this.zzi = 2;
                    zzd(null);
                    k0.k("getEngine (PENDING_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                this.zzi = 2;
                this.zzh = zzd(null);
                k0.k("getEngine (NULL or REJECTED): Lock released");
                return this.zzh.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzbnt zzd(zzavc zzavcVar) {
        zzfka zzfkaVarZza = zzfjz.zza(this.zzb, 6);
        zzfkaVarZza.zzi();
        final zzbnt zzbntVar = new zzbnt(this.zzg);
        k0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzavc zzavcVar2 = null;
        zzcaj.zze.execute(new Runnable(zzavcVar2, zzbntVar) { // from class: com.google.android.gms.internal.ads.zzbne
            public final /* synthetic */ zzbnt zzb;

            {
                this.zzb = zzbntVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(null, this.zzb);
            }
        });
        k0.k("loadNewJavascriptEngine: Promise created");
        zzbntVar.zzj(new zzbnj(this, zzbntVar, zzfkaVarZza), new zzbnk(this, zzbntVar, zzfkaVarZza));
        return zzbntVar;
    }

    public final void zzi(zzbnt zzbntVar, final zzbmp zzbmpVar, ArrayList arrayList, long j4) {
        k0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                k0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbntVar.zze() != -1 && zzbntVar.zze() != 1) {
                    zzbce zzbceVar = zzbcn.zzhq;
                    t tVar = t.f3437d;
                    if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                        zzbntVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbntVar.zzg();
                    }
                    zzges zzgesVar = zzcaj.zze;
                    Objects.requireNonNull(zzbmpVar);
                    zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbmpVar.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(tVar.f3440c.zza(zzbcn.zzb));
                    int iZze = zzbntVar.zze();
                    int i = this.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    p.C.f2983j.getClass();
                    k0.k("Could not receive /jsLoaded in " + strValueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + iZze + ". Update status(onEngLoadedTimeout) is " + i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + strValueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + (System.currentTimeMillis() - j4) + " ms. Rejecting.");
                    k0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                k0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj(zzavc zzavcVar, zzbnt zzbntVar) {
        p.C.f2983j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            k0.k("loadJavascriptEngine > Before createJavascriptEngine");
            zzbmx zzbmxVar = new zzbmx(this.zzb, this.zzd, null, null);
            k0.k("loadJavascriptEngine > After createJavascriptEngine");
            k0.k("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmxVar.zzk(new zzbnd(this, arrayList, jCurrentTimeMillis, zzbntVar, zzbmxVar));
            k0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmxVar.zzq("/jsLoaded", new zzbnf(this, jCurrentTimeMillis, zzbntVar, zzbmxVar));
            c0 c0Var = new c0();
            zzbng zzbngVar = new zzbng(this, null, zzbmxVar, c0Var);
            c0Var.f4978a = zzbngVar;
            k0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmxVar.zzq("/requestReload", zzbngVar);
            k0.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                k0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmxVar.zzh(this.zzc);
                k0.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                k0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmxVar.zzf(this.zzc);
                k0.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                k0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmxVar.zzg(this.zzc);
                k0.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            k0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            r0.f5068l.postDelayed(new zzbni(this, zzbntVar, zzbmxVar, arrayList, jCurrentTimeMillis), ((Integer) t.f3437d.f3440c.zza(zzbcn.zzc)).intValue());
        } catch (Throwable th) {
            h.e("Error creating webview.", th);
            zzbce zzbceVar = zzbcn.zzhq;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                zzbntVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzhs)).booleanValue()) {
                p.C.f2982g.zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbntVar.zzg();
            } else {
                p.C.f2982g.zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbntVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zzk(zzbmp zzbmpVar) {
        if (zzbmpVar.zzi()) {
            this.zzi = 1;
        }
    }
}
