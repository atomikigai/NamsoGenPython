package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import d6.p;
import e6.t;
import h6.k0;
import h6.m0;
import h6.n0;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdup {
    private final long zzd;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqd zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsw zzl;
    private final i6.a zzm;
    private final zzddk zzo;
    private final zzfko zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcao zze = new zzcao();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;

    public zzdup(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqd zzdqdVar, ScheduledExecutorService scheduledExecutorService, zzdsw zzdswVar, i6.a aVar, zzddk zzddkVar, zzfko zzfkoVar) {
        this.zzh = zzdqdVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdswVar;
        this.zzm = aVar;
        this.zzo = zzddkVar;
        this.zzp = zzfkoVar;
        p.C.f2983j.getClass();
        this.zzd = SystemClock.elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static void zzj(zzdup zzdupVar, String str) {
        final zzdup zzdupVar2 = zzdupVar;
        int i = 5;
        final zzfka zzfkaVarZza = zzfjz.zza(zzdupVar2.zzf, 5);
        zzfkaVarZza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfka zzfkaVarZza2 = zzfjz.zza(zzdupVar2.zzf, i);
                zzfkaVarZza2.zzi();
                zzfkaVarZza2.zzd(next);
                final Object obj = new Object();
                final zzcao zzcaoVar = new zzcao();
                m9.a aVarZzo = zzgei.zzo(zzcaoVar, ((Long) t.f3437d.f3440c.zza(zzbcn.zzbU)).longValue(), TimeUnit.SECONDS, zzdupVar2.zzk);
                zzdupVar2.zzl.zzc(next);
                zzdupVar2.zzo.zzc(next);
                p.C.f2983j.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                aVarZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzq(obj, zzcaoVar, next, jElapsedRealtime, zzfkaVarZza2);
                    }
                }, zzdupVar2.zzi);
                arrayList.add(aVarZzo);
                try {
                    try {
                        final zzduo zzduoVar = new zzduo(zzdupVar, obj, next, jElapsedRealtime, zzfkaVarZza2, zzcaoVar);
                        zzdupVar2 = zzdupVar;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i10 = 0;
                                while (i10 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zzblz(strOptString, bundle));
                                    i10++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzdupVar2.zzv(next, false, "", 0);
                        try {
                            final zzfgm zzfgmVarZzc = zzdupVar2.zzh.zzc(next, new JSONObject());
                            zzdupVar2.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzn(next, zzduoVar, zzfgmVarZzc, arrayList2);
                                }
                            });
                        } catch (zzffv e) {
                            try {
                                String str2 = "Failed to create Adapter.";
                                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmG)).booleanValue()) {
                                    str2 = "Failed to create Adapter. " + e.getMessage();
                                }
                                zzduoVar.zze(str2);
                            } catch (RemoteException e4) {
                                h.e("", e4);
                            }
                        }
                        i = 5;
                    } catch (JSONException e10) {
                        e = e10;
                        zzdupVar2 = zzdupVar;
                        k0.l("Malformed CLD response", e);
                        zzdupVar2.zzo.zza("MalformedJson");
                        zzdupVar2.zzl.zza("MalformedJson");
                        zzdupVar2.zze.zzd(e);
                        p.C.f2982g.zzw(e, "AdapterInitializer.updateAdapterStatus");
                        zzfko zzfkoVar = zzdupVar2.zzp;
                        zzfkaVarZza.zzh(e);
                        zzfkaVarZza.zzg(false);
                        zzfkoVar.zzb(zzfkaVarZza.zzm());
                        return;
                    }
                } catch (JSONException e11) {
                    e = e11;
                    zzdupVar2 = zzdupVar;
                }
            }
            zzgei.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzduh
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzf(zzfkaVarZza);
                    return null;
                }
            }, zzdupVar2.zzi);
        } catch (JSONException e12) {
            e = e12;
        }
    }

    private final synchronized m9.a zzu() {
        p pVar = p.C;
        String strZzc = ((n0) pVar.f2982g.zzi()).n().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzgei.zzh(strZzc);
        }
        final zzcao zzcaoVar = new zzcao();
        m0 m0VarZzi = pVar.f2982g.zzi();
        ((n0) m0VarZzi).f5038c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdui
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(zzcaoVar);
            }
        });
        return zzcaoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z4, String str2, int i) {
        this.zzn.put(str, new zzblp(str, z4, i, str2));
    }

    public final /* synthetic */ Object zzf(zzfka zzfkaVar) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzfkaVar.zzg(true);
        this.zzp.zzb(zzfkaVar.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzblp zzblpVar = (zzblp) this.zzn.get(str);
            arrayList.add(new zzblp(str, zzblpVar.zzb, zzblpVar.zzc, zzblpVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final void zzm() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                p.C.f2983j.getClass();
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (SystemClock.elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzn(String str, zzblt zzbltVar, zzfgm zzfgmVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbltVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfgmVar.zzi(context, zzbltVar, list);
            } catch (RemoteException e) {
                h.e("", e);
            }
        } catch (RemoteException e4) {
            throw new zzfxm(e4);
        } catch (zzffv unused) {
            zzbltVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    public final /* synthetic */ void zzo(final zzcao zzcaoVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // java.lang.Runnable
            public final void run() {
                String strZzc = ((n0) p.C.f2982g.zzi()).n().zzc();
                boolean zIsEmpty = TextUtils.isEmpty(strZzc);
                zzcao zzcaoVar2 = zzcaoVar;
                if (zIsEmpty) {
                    zzcaoVar2.zzd(new Exception());
                } else {
                    zzcaoVar2.zzc(strZzc);
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final void zzq(Object obj, zzcao zzcaoVar, String str, long j4, zzfka zzfkaVar) {
        synchronized (obj) {
            try {
                if (!zzcaoVar.isDone()) {
                    p.C.f2983j.getClass();
                    zzv(str, false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j4));
                    this.zzl.zzb(str, "timeout");
                    this.zzo.zzb(str, "timeout");
                    zzfko zzfkoVar = this.zzp;
                    zzfkaVar.zzc("Timeout");
                    zzfkaVar.zzg(false);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                    zzcaoVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbet.zza.zze()).booleanValue()) {
            int i = this.zzm.f5215c;
            zzbce zzbceVar = zzbcn.zzbT;
            t tVar = t.f3437d;
            if (i >= ((Integer) tVar.f3440c.zza(zzbceVar)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdul
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzp();
                            }
                        }, this.zzi);
                        this.zza = true;
                        m9.a aVarZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzm();
                            }
                        }, ((Long) tVar.f3440c.zza(zzbcn.zzbV)).longValue(), TimeUnit.SECONDS);
                        zzgei.zzr(aVarZzu, new zzdun(this), this.zzi);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzblw zzblwVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduj
            @Override // java.lang.Runnable
            public final void run() {
                zzdup zzdupVar = this.zza;
                try {
                    zzblwVar.zzb(zzdupVar.zzg());
                } catch (RemoteException e) {
                    h.e("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
