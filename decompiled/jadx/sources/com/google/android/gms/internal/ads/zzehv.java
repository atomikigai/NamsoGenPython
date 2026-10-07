package com.google.android.gms.internal.ads;

import d6.p;
import da.v;
import e6.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import n7.c;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzehv implements zzehp {
    private final zzdhj zza;
    private final zzges zzb;
    private final zzdlr zzc;
    private final zzfgn zzd;
    private final zzdoi zze;
    private final zzdsh zzf;

    public zzehv(zzdhj zzdhjVar, zzges zzgesVar, zzdlr zzdlrVar, zzfgn zzfgnVar, zzdoi zzdoiVar, zzdsh zzdshVar) {
        this.zza = zzdhjVar;
        this.zzb = zzgesVar;
        this.zzc = zzdlrVar;
        this.zzd = zzfgnVar;
        this.zze = zzdoiVar;
        this.zzf = zzdshVar;
    }

    private final m9.a zzg(final zzfff zzfffVar, final zzfet zzfetVar, final JSONObject jSONObject) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzck)).booleanValue()) {
            v.t(p.C.f2983j, this.zzf.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzfgn zzfgnVar = this.zzd;
        zzdlr zzdlrVar = this.zzc;
        final m9.a aVarZza = zzfgnVar.zza();
        final m9.a aVarZza2 = zzdlrVar.zza(zzfffVar, zzfetVar, jSONObject);
        return zzgei.zzc(aVarZza, aVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(aVarZza2, aVarZza, zzfffVar, zzfetVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        return zzgei.zzn(zzgei.zzn(this.zzd.zza(), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zze(zzfetVar, (zzdoc) obj);
            }
        }, this.zzb), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeht
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzf(zzfffVar, zzfetVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar = zzfetVar.zzs;
        return (zzfeyVar == null || zzfeyVar.zzc == null) ? false : true;
    }

    public final zzdit zzc(m9.a aVar, m9.a aVar2, zzfff zzfffVar, zzfet zzfetVar, JSONObject jSONObject) throws Exception {
        zzdiy zzdiyVar = (zzdiy) aVar.get();
        zzdoc zzdocVar = (zzdoc) aVar2.get();
        zzbce zzbceVar = zzbcn.zzck;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzf.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdiz zzdizVarZzd = this.zza.zzd(new zzcsg(zzfffVar, zzfetVar, null), new zzdjk(zzdiyVar), new zzdhw(jSONObject, zzdocVar));
        if (((Boolean) zzbclVar2.zza(zzbceVar)).booleanValue()) {
            p.C.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.zzf.zza().putLong(zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            this.zzf.zza().putLong(zzdrv.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdizVarZzd.zzh().zzb();
        zzdizVarZzd.zzi().zza(zzdocVar);
        zzdizVarZzd.zzg().zza(zzdiyVar.zzs());
        zzdizVarZzd.zzl().zza(this.zze, zzdiyVar.zzq());
        if (((Boolean) zzbclVar2.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzf.zza(), zzdrv.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzdizVarZzd.zza();
    }

    public final /* synthetic */ m9.a zzd(zzdoc zzdocVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgei.zzh(zzdocVar));
        if (jSONObject.optBoolean("success")) {
            return zzgei.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnx("process json failed");
    }

    public final m9.a zze(zzfet zzfetVar, final zzdoc zzdocVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzim)).booleanValue() && c.i()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfetVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgei.zzn(zzdocVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzd(zzdocVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final m9.a zzf(zzfff zzfffVar, zzfet zzfetVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgei.zzg(new zzdwn(3));
        }
        if (zzfffVar.zza.zza.zzk <= 1) {
            return zzgei.zzm(zzg(zzfffVar, zzfetVar, jSONArray.getJSONObject(0)), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzehu
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgei.zzh((zzdit) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcl)).booleanValue()) {
            this.zzf.zzc("nsl", String.valueOf(length));
        }
        this.zzd.zzc(Math.min(length, zzfffVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfffVar.zza.zza.zzk);
        for (int i = 0; i < zzfffVar.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfffVar, zzfetVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzgei.zzg(new zzdwn(3)));
            }
        }
        return zzgei.zzh(arrayList);
    }
}
