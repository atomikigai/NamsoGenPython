package com.google.android.gms.internal.ads;

import d6.p;
import da.v;
import e6.h3;
import e6.m0;
import e6.s0;
import e6.t;
import h6.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfmg {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfmp zzc;
    private final zzfmd zzd;
    private final n7.a zze;

    public zzfmg(zzfmp zzfmpVar, zzfmd zzfmdVar, n7.a aVar) {
        this.zzc = zzfmpVar;
        this.zzd = zzfmdVar;
        this.zze = aVar;
    }

    public static String zzd(String str, b bVar) {
        return v.u(str, "#", bVar == null ? "NULL" : bVar.name());
    }

    private final synchronized List zzj(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h3 h3Var = (h3) it.next();
                String strZzd = zzd(h3Var.f3318a, b.a(h3Var.f3319b));
                hashSet.add(strZzd);
                zzfmo zzfmoVar = (zzfmo) this.zza.get(strZzd);
                if (zzfmoVar == null) {
                    arrayList.add(h3Var);
                } else if (!zzfmoVar.zze.equals(h3Var)) {
                    this.zzb.put(strZzd, zzfmoVar);
                    this.zza.remove(strZzd);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfmo) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfmo zzfmoVar2 = (zzfmo) ((Map.Entry) it3.next()).getValue();
                zzfmoVar2.zzk();
                if (!zzfmoVar2.zzl()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized Optional zzk(final Class cls, String str, b bVar) {
        ConcurrentMap concurrentMap = this.zza;
        String strZzd = zzd(str, bVar);
        if (!concurrentMap.containsKey(strZzd) && !this.zzb.containsKey(strZzd)) {
            return Optional.empty();
        }
        zzfmo zzfmoVar = (zzfmo) this.zza.get(strZzd);
        if (zzfmoVar == null && (zzfmoVar = (zzfmo) this.zzb.get(strZzd)) == null) {
            return Optional.empty();
        }
        try {
            Optional optionalOfNullable = Optional.ofNullable(zzfmoVar.zzd());
            Objects.requireNonNull(cls);
            return optionalOfNullable.map(new Function() { // from class: com.google.android.gms.internal.ads.zzfmf
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
        } catch (ClassCastException e) {
            p.C.f2982g.zzw(e, "PreloadAdManager.pollAd");
            k0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return Optional.empty();
        }
    }

    private final synchronized void zzl(String str, zzfmo zzfmoVar) {
        zzfmoVar.zzc();
        this.zza.put(str, zzfmoVar);
    }

    private final synchronized boolean zzm(String str, b bVar) {
        Optional optionalEmpty;
        ((n7.b) this.zze).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentMap concurrentMap = this.zza;
        String strZzd = zzd(str, bVar);
        boolean z4 = false;
        if (!concurrentMap.containsKey(strZzd) && !this.zzb.containsKey(strZzd)) {
            return false;
        }
        zzfmo zzfmoVar = (zzfmo) this.zza.get(strZzd);
        if (zzfmoVar == null) {
            zzfmoVar = (zzfmo) this.zzb.get(strZzd);
        }
        if (zzfmoVar != null && zzfmoVar.zzl()) {
            z4 = true;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzs)).booleanValue()) {
            if (z4) {
                ((n7.b) this.zze).getClass();
                optionalEmpty = Optional.of(Long.valueOf(System.currentTimeMillis()));
            } else {
                optionalEmpty = Optional.empty();
            }
            this.zzd.zza(bVar, jCurrentTimeMillis, optionalEmpty);
        }
        return z4;
    }

    public final synchronized zzbaf zza(String str) {
        return (zzbaf) zzk(zzbaf.class, str, b.APP_OPEN_AD).orElse(null);
    }

    public final synchronized m0 zzb(String str) {
        return (m0) zzk(m0.class, str, b.INTERSTITIAL).orElse(null);
    }

    public final synchronized zzbxc zzc(String str) {
        return (zzbxc) zzk(zzbxc.class, str, b.REWARDED).orElse(null);
    }

    public final void zze(zzbpg zzbpgVar) {
        this.zzc.zzb(zzbpgVar);
    }

    public final synchronized void zzf(List list, s0 s0Var) {
        for (h3 h3Var : zzj(list)) {
            String str = h3Var.f3318a;
            b bVarA = b.a(h3Var.f3319b);
            zzfmo zzfmoVarZza = this.zzc.zza(h3Var, s0Var);
            if (bVarA != null && zzfmoVarZza != null) {
                zzl(zzd(str, bVarA), zzfmoVarZza);
            }
        }
    }

    public final synchronized boolean zzg(String str) {
        return zzm(str, b.APP_OPEN_AD);
    }

    public final synchronized boolean zzh(String str) {
        return zzm(str, b.INTERSTITIAL);
    }

    public final synchronized boolean zzi(String str) {
        return zzm(str, b.REWARDED);
    }
}
