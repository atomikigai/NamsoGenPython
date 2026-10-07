package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import d6.p;
import e6.s;
import e6.t;
import h6.k0;
import h6.l0;
import h6.r0;
import i6.d;
import i6.h;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import n7.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbmx implements zzbmp, zzbmo {
    private final zzcfk zza;

    public zzbmx(Context context, i6.a aVar, zzavc zzavcVar, d6.a aVar2) throws zzcfw {
        zzcfx zzcfxVar = p.C.f2980d;
        zzcfk zzcfkVarZza = zzcfx.zza(context, zzche.zza(), "", false, false, null, null, aVar, null, null, null, zzbbl.zza(), null, null, null, null);
        this.zza = zzcfkVarZza;
        zzcfkVarZza.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        d dVar = s.f3427f.f3428a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            k0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            k0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (r0.f5068l.post(runnable)) {
                return;
            }
            h.g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zza(final String str) {
        k0.k("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmn.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmn.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmn.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzf(final String str) {
        k0.k("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzg(final String str) {
        k0.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzh(String str) {
        k0.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final zzbnw zzj() {
        return new zzbnw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzk(final zzbnd zzbndVar) {
        zzchc zzchcVarZzN = this.zza.zzN();
        Objects.requireNonNull(zzbndVar);
        zzchcVarZzN.zzI(new zzchb() { // from class: com.google.android.gms.internal.ads.zzbms
            @Override // com.google.android.gms.internal.ads.zzchb
            public final void zza() {
                p.C.f2983j.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                zzbnd zzbndVar2 = zzbndVar;
                final long j4 = zzbndVar2.zzc;
                final ArrayList arrayList = zzbndVar2.zzb;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j4));
                k0.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                l0 l0Var = r0.f5068l;
                final zzbnu zzbnuVar = zzbndVar2.zza;
                final zzbnt zzbntVar = zzbndVar2.zzd;
                final zzbmp zzbmpVar = zzbndVar2.zze;
                l0Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnuVar.zzi(zzbntVar, zzbmpVar, arrayList, j4);
                    }
                }, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzb)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbmn.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzq(String str, zzbjr zzbjrVar) {
        this.zza.zzag(str, new zzbmw(this, zzbjrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzr(String str, final zzbjr zzbjrVar) {
        this.zza.zzaA(str, new e() { // from class: com.google.android.gms.internal.ads.zzbmq
            @Override // n7.e
            public final boolean apply(Object obj) {
                zzbjr zzbjrVar2 = (zzbjr) obj;
                if (zzbjrVar2 instanceof zzbmw) {
                    return ((zzbmw) zzbjrVar2).zzb.equals(zzbjrVar);
                }
                return false;
            }
        });
    }
}
