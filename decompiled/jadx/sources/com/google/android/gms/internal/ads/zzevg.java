package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import d6.p;
import e6.t;
import h6.k0;
import i6.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzevg implements zzevz {
    final String zza;
    private final zzges zzb;
    private final ScheduledExecutorService zzc;
    private final zzelo zzd;
    private final Context zze;
    private final zzffo zzf;
    private final zzelk zzg;
    private final zzdqd zzh;
    private final zzdur zzi;

    public zzevg(zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, String str, zzelo zzeloVar, Context context, zzffo zzffoVar, zzelk zzelkVar, zzdqd zzdqdVar, zzdur zzdurVar) {
        this.zzb = zzgesVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzeloVar;
        this.zze = context;
        this.zzf = zzffoVar;
        this.zzg = zzelkVar;
        this.zzh = zzdqdVar;
        this.zzi = zzdurVar;
    }

    public static m9.a zzc(zzevg zzevgVar) {
        zzevg zzevgVar2;
        zzbce zzbceVar = zzbcn.zzkB;
        t tVar = t.f3437d;
        String lowerCase = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() ? zzevgVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzevgVar.zzf.zzf;
        final Bundle bundleZzg = ((Boolean) tVar.f3440c.zza(zzbcn.zzbJ)).booleanValue() ? zzevgVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzbS)).booleanValue()) {
            zzevgVar2 = zzevgVar;
            zzevgVar2.zzi(arrayList, zzevgVar2.zzd.zza(zzevgVar2.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzfzr) zzevgVar.zzd.zzb(zzevgVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                zzevg zzevgVar3 = zzevgVar;
                arrayList.add(zzevgVar3.zzg(str, (List) entry.getValue(), zzevgVar.zzf(str), true, true));
                zzevgVar = zzevgVar3;
            }
            zzevgVar2 = zzevgVar;
            zzevgVar2.zzi(arrayList, zzevgVar2.zzd.zzc());
        }
        return zzgei.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (m9.a aVar : arrayList) {
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzevh(jSONArray.toString(), bundleZzg);
            }
        }, zzevgVar2.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.f3382x;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgdz zzg(final String str, final List list, final Bundle bundle, final boolean z4, final boolean z10) {
        zzgdz zzgdzVarZzu = zzgdz.zzu(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzevd
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final m9.a zza() {
                return this.zza.zzd(str, list, bundle, z4, z10);
            }
        }, this.zzb));
        zzbce zzbceVar = zzbcn.zzbF;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            zzgdzVarZzu = (zzgdz) zzgei.zzo(zzgdzVarZzu, ((Long) tVar.f3440c.zza(zzbcn.zzby)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgdz) zzgei.zze(zzgdzVarZzu, Throwable.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                String str2 = str;
                Throwable th = (Throwable) obj;
                h.d("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmI)).booleanValue()) {
                    p.C.f2982g.zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                p.C.f2982g.zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbrf zzbrfVar, Bundle bundle, List list, zzelr zzelrVar) throws RemoteException {
        zzbrfVar.zzh(new b(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelrVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzels zzelsVar = (zzels) ((Map.Entry) it.next()).getValue();
            String str = zzelsVar.zza;
            list.add(zzg(str, Collections.singletonList(zzelsVar.zze), zzf(str), zzelsVar.zzb, zzelsVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        zzffo zzffoVar = this.zzf;
        if (zzffoVar.zzr) {
            if (!Arrays.asList(((String) t.f3437d.f3440c.zza(zzbcn.zzbL)).split(",")).contains(android.support.v4.media.session.a.L(android.support.v4.media.session.a.M(zzffoVar.zzd)))) {
                return zzgei.zzh(new zzevh(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final m9.a zza() {
                return zzevg.zzc(this.zza);
            }
        }, this.zzb);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final m9.a zzd(String str, final List list, final Bundle bundle, boolean z4, boolean z10) throws Exception {
        final zzbrf zzbrfVar;
        zzbrf zzbrfVarZzb;
        final zzcao zzcaoVar = new zzcao();
        if (z10) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbK)).booleanValue()) {
                try {
                    zzbrfVarZzb = this.zzh.zzb(str);
                } catch (RemoteException e) {
                    k0.l("Couldn't create RTB adapter : ", e);
                    zzbrfVar = null;
                }
            } else {
                this.zzg.zzb(str);
                zzbrfVarZzb = this.zzg.zza(str);
            }
            zzbrfVar = zzbrfVarZzb;
        } else {
            zzbrfVarZzb = this.zzh.zzb(str);
            zzbrfVar = zzbrfVarZzb;
        }
        if (zzbrfVar == null) {
            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbA)).booleanValue()) {
                throw null;
            }
            zzelr.zzb(str, zzcaoVar);
            return zzcaoVar;
        }
        p.C.f2983j.getClass();
        final zzelr zzelrVar = new zzelr(str, zzbrfVar, zzcaoVar, SystemClock.elapsedRealtime());
        zzbce zzbceVar = zzbcn.zzbF;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevf
                @Override // java.lang.Runnable
                public final void run() {
                    zzelrVar.zzc();
                }
            }, ((Long) zzbclVar2.zza(zzbcn.zzby)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (!z4) {
            zzelrVar.zzd();
            return zzcaoVar;
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzbM)).booleanValue()) {
            this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(zzbrfVar, bundle, list, zzelrVar, zzcaoVar);
                }
            });
            return zzcaoVar;
        }
        zzh(zzbrfVar, bundle, list, zzelrVar);
        return zzcaoVar;
    }

    public final /* synthetic */ void zze(zzbrf zzbrfVar, Bundle bundle, List list, zzelr zzelrVar, zzcao zzcaoVar) {
        try {
            zzh(zzbrfVar, bundle, list, zzelrVar);
        } catch (RemoteException e) {
            zzcaoVar.zzd(e);
        }
    }
}
