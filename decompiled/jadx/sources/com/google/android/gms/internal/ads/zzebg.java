package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import d6.p;
import da.v;
import e6.s;
import e6.t;
import h6.k0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzebg extends zzbve {
    private final Context zza;
    private final zzges zzb;
    private final zzeby zzc;
    private final zzclo zzd;
    private final ArrayDeque zze;
    private final zzfko zzf;
    private final zzbwf zzg;

    public zzebg(Context context, zzges zzgesVar, zzbwf zzbwfVar, zzclo zzcloVar, zzeby zzebyVar, ArrayDeque arrayDeque, zzebv zzebvVar, zzfko zzfkoVar) {
        zzbcn.zza(context);
        this.zza = context;
        this.zzb = zzgesVar;
        this.zzg = zzbwfVar;
        this.zzc = zzebyVar;
        this.zzd = zzcloVar;
        this.zze = arrayDeque;
        this.zzf = zzfkoVar;
    }

    private final synchronized zzebd zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzebd zzebdVar = (zzebd) it.next();
            if (zzebdVar.zzc.equals(str)) {
                it.remove();
                return zzebdVar;
            }
        }
        return null;
    }

    private static m9.a zzm(m9.a aVar, zzfjr zzfjrVar, zzboi zzboiVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        zzbny zzbnyVarZza = zzboiVar.zza("AFMA_getAdDictionary", zzbof.zza, new zzboa() { // from class: com.google.android.gms.internal.ads.zzeax
            @Override // com.google.android.gms.internal.ads.zzboa
            public final Object zza(JSONObject jSONObject) {
                return new zzbvz(jSONObject);
            }
        });
        zzfkk.zzd(aVar, zzfkaVar);
        zzfix zzfixVarZza = zzfjrVar.zzb(zzfjl.BUILD_URL, aVar).zzf(zzbnyVarZza).zza();
        zzfkk.zzc(zzfixVarZza, zzfklVar, zzfkaVar);
        return zzfixVarZza;
    }

    private static m9.a zzn(final zzbvx zzbvxVar, zzfjr zzfjrVar, final zzexc zzexcVar) {
        zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzexcVar.zzb().zza(s.f3427f.f3428a.h((Bundle) obj), zzbvxVar.zzm);
            }
        };
        return zzfjrVar.zzb(zzfjl.GMS_SIGNALS, zzgei.zzh(zzbvxVar.zza)).zzf(zzgdpVar).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                k0.k("Ad request signals:");
                k0.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzo(zzebd zzebdVar) {
        zzp();
        this.zze.addLast(zzebdVar);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbeu.zzc.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(m9.a aVar, zzbvp zzbvpVar, zzbvx zzbvxVar) {
        zzgei.zzr(zzgei.zzn(aVar, new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzeay
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(zzfgp.zza((InputStream) obj));
            }
        }, zzcaj.zza), new zzebc(this, zzbvxVar, zzbvpVar), zzcaj.zzf);
    }

    public final m9.a zzb(final zzbvx zzbvxVar, int i) {
        if (!((Boolean) zzbeu.zza.zze()).booleanValue()) {
            return zzgei.zzg(new Exception("Split request is disabled."));
        }
        zzfhj zzfhjVar = zzbvxVar.zzi;
        if (zzfhjVar == null) {
            return zzgei.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfhjVar.zzc == 0 || zzfhjVar.zzd == 0) {
            return zzgei.zzg(new Exception("Caching is disabled."));
        }
        zzboi zzboiVarZzb = p.C.f2990q.zzb(this.zza, i6.a.g(), this.zzf);
        zzexc zzexcVarZzr = this.zzd.zzr(zzbvxVar, i);
        zzfjr zzfjrVarZzc = zzexcVarZzr.zzc();
        final m9.a aVarZzn = zzn(zzbvxVar, zzfjrVarZzc, zzexcVarZzr);
        zzfkl zzfklVarZzd = zzexcVarZzr.zzd();
        final zzfka zzfkaVarZza = zzfjz.zza(this.zza, 9);
        final m9.a aVarZzm = zzm(aVarZzn, zzfjrVarZzc, zzboiVarZzb, zzfklVarZzd, zzfkaVarZza);
        return zzfjrVarZzc.zza(zzfjl.GET_URL_AND_CACHE_KEY, aVarZzn, aVarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzk(aVarZzm, aVarZzn, zzbvxVar, zzfkaVarZza);
            }
        }).zza();
    }

    public final m9.a zzc(final zzbvx zzbvxVar, int i) {
        zzebd zzebdVarZzl;
        zzfix zzfixVarZza;
        zzboi zzboiVarZzb = p.C.f2990q.zzb(this.zza, i6.a.g(), this.zzf);
        zzexc zzexcVarZzr = this.zzd.zzr(zzbvxVar, i);
        zzbny zzbnyVarZza = zzboiVarZzb.zza("google.afma.response.normalize", zzebf.zza, zzbof.zzb);
        if (((Boolean) zzbeu.zza.zze()).booleanValue()) {
            zzebdVarZzl = zzl(zzbvxVar.zzh);
            if (zzebdVarZzl == null) {
                k0.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbvxVar.zzj;
            zzebdVarZzl = null;
            if (str != null && !str.isEmpty()) {
                k0.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfka zzfkaVarZza = zzebdVarZzl == null ? zzfjz.zza(this.zza, 9) : zzebdVarZzl.zzd;
        zzfkl zzfklVarZzd = zzexcVarZzr.zzd();
        zzfklVarZzd.zzd(zzbvxVar.zza.getStringArrayList("ad_types"));
        zzebx zzebxVar = new zzebx(zzbvxVar.zzg, zzfklVarZzd, zzfkaVarZza);
        zzebu zzebuVar = new zzebu(this.zza, zzbvxVar.zzb.f5213a, this.zzg, i);
        zzfjr zzfjrVarZzc = zzexcVarZzr.zzc();
        zzfka zzfkaVarZza2 = zzfjz.zza(this.zza, 11);
        if (zzebdVarZzl == null) {
            final m9.a aVarZzn = zzn(zzbvxVar, zzfjrVarZzc, zzexcVarZzr);
            final m9.a aVarZzm = zzm(aVarZzn, zzfjrVarZzc, zzboiVarZzb, zzfklVarZzd, zzfkaVarZza);
            zzfka zzfkaVarZza3 = zzfjz.zza(this.zza, 10);
            final zzfix zzfixVarZza2 = zzfjrVarZzc.zza(zzfjl.HTTP, aVarZzm, aVarZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeat
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbvx zzbvxVar2;
                    Bundle bundle;
                    zzbvz zzbvzVar = (zzbvz) aVarZzm.get();
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() && (bundle = (zzbvxVar2 = zzbvxVar).zzm) != null) {
                        bundle.putLong(zzdrv.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvzVar.zzc());
                        zzbvxVar2.zzm.putLong(zzdrv.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvzVar.zzb());
                    }
                    return new zzebw((JSONObject) aVarZzn.get(), zzbvzVar);
                }
            }).zze(zzebxVar).zze(new zzfkg(zzfkaVarZza3)).zze(zzebuVar).zza();
            zzfkk.zza(zzfixVarZza2, zzfklVarZzd, zzfkaVarZza3);
            zzfkk.zzd(zzfixVarZza2, zzfkaVarZza2);
            zzfixVarZza = zzfjrVarZzc.zza(zzfjl.PRE_PROCESS, aVarZzn, aVarZzm, zzfixVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() && (bundle = zzbvxVar.zzm) != null) {
                        v.t(p.C.f2983j, bundle, zzdrv.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzebf((zzebt) zzfixVarZza2.get(), (JSONObject) aVarZzn.get(), (zzbvz) aVarZzm.get());
                }
            }).zzf(zzbnyVarZza).zza();
        } else {
            zzebw zzebwVar = new zzebw(zzebdVarZzl.zzb, zzebdVarZzl.zza);
            zzfka zzfkaVarZza4 = zzfjz.zza(this.zza, 10);
            final zzfix zzfixVarZza3 = zzfjrVarZzc.zzb(zzfjl.HTTP, zzgei.zzh(zzebwVar)).zze(zzebxVar).zze(new zzfkg(zzfkaVarZza4)).zze(zzebuVar).zza();
            zzfkk.zza(zzfixVarZza3, zzfklVarZzd, zzfkaVarZza4);
            final m9.a aVarZzh = zzgei.zzh(zzebdVarZzl);
            zzfkk.zzd(zzfixVarZza3, zzfkaVarZza2);
            zzfixVarZza = zzfjrVarZzc.zza(zzfjl.PRE_PROCESS, zzfixVarZza3, aVarZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzebt zzebtVar = (zzebt) zzfixVarZza3.get();
                    m9.a aVar = aVarZzh;
                    return new zzebf(zzebtVar, ((zzebd) aVar.get()).zzb, ((zzebd) aVar.get()).zza);
                }
            }).zzf(zzbnyVarZza).zza();
        }
        zzfkk.zza(zzfixVarZza, zzfklVarZzd, zzfkaVarZza2);
        return zzfixVarZza;
    }

    public final m9.a zzd(final zzbvx zzbvxVar, int i) {
        zzboi zzboiVarZzb = p.C.f2990q.zzb(this.zza, i6.a.g(), this.zzf);
        if (!((Boolean) zzbez.zza.zze()).booleanValue()) {
            return zzgei.zzg(new Exception("Signal collection disabled."));
        }
        zzexc zzexcVarZzr = this.zzd.zzr(zzbvxVar, i);
        final zzewc zzewcVarZza = zzexcVarZzr.zza();
        zzbny zzbnyVarZza = zzboiVarZzb.zza("google.afma.request.getSignals", zzbof.zza, zzbof.zzb);
        zzfka zzfkaVarZza = zzfjz.zza(this.zza, 22);
        zzfix zzfixVarZza = zzexcVarZzr.zzc().zzb(zzfjl.GET_SIGNALS, zzgei.zzh(zzbvxVar.zza)).zze(new zzfkg(zzfkaVarZza)).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeaz
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzewcVarZza.zza(s.f3427f.f3428a.h((Bundle) obj), zzbvxVar.zzm);
            }
        }).zzb(zzfjl.JS_SIGNALS).zzf(zzbnyVarZza).zza();
        zzfkl zzfklVarZzd = zzexcVarZzr.zzd();
        zzfklVarZzd.zzd(zzbvxVar.zza.getStringArrayList("ad_types"));
        zzfklVarZzd.zzf(zzbvxVar.zza.getBundle("extras"));
        zzfkk.zzb(zzfixVarZza, zzfklVarZzd, zzfkaVarZza);
        if (((Boolean) zzben.zzg.zze()).booleanValue()) {
            zzeby zzebyVar = this.zzc;
            Objects.requireNonNull(zzebyVar);
            zzfixVarZza.addListener(new zzeaw(zzebyVar), this.zzb);
        }
        return zzfixVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zze(zzbvx zzbvxVar, zzbvp zzbvpVar) {
        zzq(zzb(zzbvxVar, Binder.getCallingUid()), zzbvpVar, zzbvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzf(zzbvx zzbvxVar, zzbvp zzbvpVar) {
        Bundle bundle;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() && (bundle = zzbvxVar.zzm) != null) {
            v.t(p.C.f2983j, bundle, zzdrv.SERVICE_CONNECTED.zza());
        }
        zzq(zzd(zzbvxVar, Binder.getCallingUid()), zzbvpVar, zzbvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzg(zzbvx zzbvxVar, zzbvp zzbvpVar) {
        Bundle bundle;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() && (bundle = zzbvxVar.zzm) != null) {
            v.t(p.C.f2983j, bundle, zzdrv.SERVICE_CONNECTED.zza());
        }
        m9.a aVarZzc = zzc(zzbvxVar, Binder.getCallingUid());
        zzq(aVarZzc, zzbvpVar, zzbvxVar);
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            zzeby zzebyVar = this.zzc;
            Objects.requireNonNull(zzebyVar);
            aVarZzc.addListener(new zzeaw(zzebyVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzh(String str, zzbvp zzbvpVar) {
        zzq(zzj(str), zzbvpVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzi(zzbuz zzbuzVar, zzbvq zzbvqVar) {
        if (((Boolean) zzbfb.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbuzVar.zza;
            zzgei.zzr(zzgei.zzh(null), new zzeba(this, zzbvqVar, zzbuzVar), zzcaj.zzf);
        } else {
            try {
                zzbvqVar.zzf("", zzbuzVar);
            } catch (RemoteException e) {
                k0.l("Service can't call client", e);
            }
        }
    }

    public final m9.a zzj(String str) {
        if (((Boolean) zzbeu.zza.zze()).booleanValue()) {
            return zzl(str) == null ? zzgei.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgei.zzh(new zzebb(this));
        }
        return zzgei.zzg(new Exception("Split request is disabled."));
    }

    public final /* synthetic */ InputStream zzk(m9.a aVar, m9.a aVar2, zzbvx zzbvxVar, zzfka zzfkaVar) throws Exception {
        String strZze = ((zzbvz) aVar.get()).zze();
        zzo(new zzebd((zzbvz) aVar.get(), (JSONObject) aVar2.get(), zzbvxVar.zzh, strZze, zzfkaVar));
        return new ByteArrayInputStream(strZze.getBytes(StandardCharsets.UTF_8));
    }
}
