package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import app.namso_gen.spacehowen.R;
import d6.p;
import da.v;
import e6.t;
import h6.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdlr {
    private final zzges zza;
    private final zzdmg zzb;
    private final zzdml zzc;

    public zzdlr(zzges zzgesVar, zzdmg zzdmgVar, zzdml zzdmlVar) {
        this.zza = zzgesVar;
        this.zzb = zzdmgVar;
        this.zzc = zzdmlVar;
    }

    public final m9.a zza(final zzfff zzfffVar, final zzfet zzfetVar, final JSONObject jSONObject) {
        m9.a aVarZzh;
        JSONObject jSONObjectOptJSONObject;
        m9.a aVarZzh2;
        final m9.a aVarZzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzeiz {
                zzdiy zzdiyVar = new zzdiy();
                JSONObject jSONObject2 = jSONObject;
                zzdiyVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdiyVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                zzfff zzfffVar2 = zzfffVar;
                zzdiyVar.zzV(strOptString);
                zzffo zzffoVar = zzfffVar2.zza.zza;
                if (!zzffoVar.zzg.contains(Integer.toString(zzdiyVar.zzc()))) {
                    throw new zzeiz(1, v.f(zzdiyVar.zzc(), "Invalid template ID: "));
                }
                if (zzdiyVar.zzc() == 3) {
                    if (zzdiyVar.zzA() == null) {
                        throw new zzeiz(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzffoVar.zzh.contains(zzdiyVar.zzA())) {
                        throw new zzeiz(1, "Unexpected custom template id in the response.");
                    }
                }
                zzfet zzfetVar2 = zzfetVar;
                zzdiyVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (zzfetVar2.zzM) {
                    p pVar = p.C;
                    r0 r0Var = pVar.f2979c;
                    Resources resourcesZze = pVar.f2982g.zze();
                    strOptString2 = v.u(resourcesZze != null ? resourcesZze.getString(R.string.s7) : "Test Ad", " : ", strOptString2);
                }
                zzdiyVar.zzZ("headline", strOptString2);
                zzdiyVar.zzZ("body", jSONObject2.optString("body", null));
                zzdiyVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdiyVar.zzZ("store", jSONObject2.optString("store", null));
                zzdiyVar.zzZ("price", jSONObject2.optString("price", null));
                zzdiyVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdiyVar;
            }
        });
        final m9.a aVarZzf = this.zzb.zzf(jSONObject, "images");
        zzfew zzfewVar = zzfffVar.zzb.zzb;
        zzdmg zzdmgVar = this.zzb;
        final m9.a aVarZzg = zzdmgVar.zzg(jSONObject, "images", zzfetVar, zzfewVar);
        final m9.a aVarZze = zzdmgVar.zze(jSONObject, "secondary_image");
        final m9.a aVarZze2 = zzdmgVar.zze(jSONObject, "app_icon");
        final m9.a aVarZzd = zzdmgVar.zzd(jSONObject, "attribution");
        final m9.a aVarZzh3 = this.zzb.zzh(jSONObject, zzfetVar, zzfffVar.zzb.zzb);
        zzbce zzbceVar = zzbcn.zzmF;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && ((Integer) Optional.ofNullable(jSONObject.optJSONObject("video")).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((JSONObject) obj).optJSONArray("flags");
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        return jSONObjectOptJSONObject2.optString("value");
                    }
                }
                return null;
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }).orElse(0)).intValue() == 3) {
            zzdmg zzdmgVar2 = this.zzb;
            zzcao zzcaoVar = new zzcao();
            zzgei.zzr(aVarZzh3, new zzdmf(zzdmgVar2, zzcaoVar), zzcaj.zze);
            aVarZzh = zzcaoVar;
        } else {
            aVarZzh = zzgei.zzh(new Bundle());
        }
        final m9.a aVarZza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdmg zzdmgVar3 = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            aVarZzh2 = TextUtils.isEmpty(strOptString) ? zzgei.zzh(null) : zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlt
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final m9.a zza(Object obj) {
                    return zzdmgVar3.zzc(strOptString, obj);
                }
            }, zzcaj.zze);
        } else {
            aVarZzh2 = zzgei.zzh(null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVarZzb);
        arrayList.add(aVarZzf);
        arrayList.add(aVarZzg);
        arrayList.add(aVarZze);
        arrayList.add(aVarZze2);
        arrayList.add(aVarZzd);
        arrayList.add(aVarZzh3);
        arrayList.add(aVarZzh);
        arrayList.add(aVarZza);
        if (!((Boolean) tVar.f3440c.zza(zzbcn.zzfk)).booleanValue()) {
            arrayList.add(aVarZzh2);
        }
        final m9.a aVar = aVarZzh;
        final m9.a aVar2 = aVarZzh2;
        return zzgei.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdlq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdiy zzdiyVar = (zzdiy) aVarZzb.get();
                zzdiyVar.zzP((List) aVarZzf.get());
                zzdiyVar.zzM((zzbfy) aVarZze2.get());
                zzdiyVar.zzQ((zzbfy) aVarZze.get());
                zzdiyVar.zzJ((zzbfr) aVarZzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdiyVar.zzS(zzdmg.zzj(jSONObject2));
                zzdiyVar.zzL(zzdmg.zzi(jSONObject2));
                zzcfk zzcfkVar = (zzcfk) aVarZzh3.get();
                if (zzcfkVar != null) {
                    zzdiyVar.zzad(zzcfkVar);
                    zzdiyVar.zzac(zzcfkVar.zzF());
                    zzdiyVar.zzab(zzcfkVar.zzq());
                }
                m9.a aVar3 = aVar;
                m9.a aVar4 = aVarZzg;
                zzdiyVar.zzd().putAll((Bundle) aVar3.get());
                zzcfk zzcfkVar2 = (zzcfk) aVar4.get();
                if (zzcfkVar2 != null) {
                    zzdiyVar.zzO(zzcfkVar2);
                    zzdiyVar.zzae(zzcfkVar2.zzF());
                }
                m9.a aVar5 = aVar2;
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfk)).booleanValue()) {
                    zzdiyVar.zzU(aVar5);
                    zzdiyVar.zzX(new zzcao());
                } else {
                    zzcfk zzcfkVar3 = (zzcfk) aVar5.get();
                    if (zzcfkVar3 != null) {
                        zzdiyVar.zzT(zzcfkVar3);
                    }
                }
                for (zzdmk zzdmkVar : (List) aVarZza.get()) {
                    if (zzdmkVar.zza != 1) {
                        zzdiyVar.zzN(zzdmkVar.zzb, zzdmkVar.zzd);
                    } else {
                        zzdiyVar.zzZ(zzdmkVar.zzb, zzdmkVar.zzc);
                    }
                }
                return zzdiyVar;
            }
        }, this.zza);
    }
}
