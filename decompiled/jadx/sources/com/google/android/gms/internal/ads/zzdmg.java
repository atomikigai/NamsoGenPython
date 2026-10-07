package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import d6.b;
import d6.p;
import e6.q3;
import e6.t;
import e6.v2;
import h6.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdmg {
    private final Context zza;
    private final zzdlk zzb;
    private final zzavc zzc;
    private final i6.a zzd;
    private final d6.a zze;
    private final zzbbl zzf;
    private final Executor zzg;
    private final zzbfn zzh;
    private final zzdmy zzi;
    private final zzdpn zzj;
    private final ScheduledExecutorService zzk;
    private final zzdoi zzl;
    private final zzdsm zzm;
    private final zzflr zzn;
    private final zzedp zzo;
    private final zzeea zzp;
    private final zzffs zzq;

    public zzdmg(Context context, zzdlk zzdlkVar, zzavc zzavcVar, i6.a aVar, d6.a aVar2, zzbbl zzbblVar, Executor executor, zzffo zzffoVar, zzdmy zzdmyVar, zzdpn zzdpnVar, ScheduledExecutorService scheduledExecutorService, zzdsm zzdsmVar, zzflr zzflrVar, zzedp zzedpVar, zzdoi zzdoiVar, zzeea zzeeaVar, zzffs zzffsVar) {
        this.zza = context;
        this.zzb = zzdlkVar;
        this.zzc = zzavcVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbblVar;
        this.zzg = executor;
        this.zzh = zzffoVar.zzi;
        this.zzi = zzdmyVar;
        this.zzj = zzdpnVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsmVar;
        this.zzn = zzflrVar;
        this.zzo = zzedpVar;
        this.zzl = zzdoiVar;
        this.zzp = zzeeaVar;
        this.zzq = zzffsVar;
    }

    public static final v2 zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzfzo.zzn();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfzo.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            v2 v2VarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i));
            if (v2VarZzr != null) {
                arrayList.add(v2VarZzr);
            }
        }
        return zzfzo.zzl(arrayList);
    }

    private final q3 zzk(int i, int i10) {
        if (i == 0) {
            if (i10 == 0) {
                return q3.h();
            }
            i = 0;
        }
        return new q3(this.zza, new h(i, i10));
    }

    private static m9.a zzl(m9.a aVar, Object obj) {
        final Object obj2 = null;
        return zzgei.zzf(aVar, Exception.class, new zzgdp(obj2) { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj3) {
                k0.l("Error during loading assets.", (Exception) obj3);
                return zzgei.zzh(null);
            }
        }, zzcaj.zzf);
    }

    private static m9.a zzm(boolean z4, final m9.a aVar, Object obj) {
        return z4 ? zzgei.zzn(aVar, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj2) {
                return obj2 != null ? aVar : zzgei.zzg(new zzeiz(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcaj.zzf) : zzl(aVar, null);
    }

    private final m9.a zzn(JSONObject jSONObject, boolean z4) {
        if (jSONObject == null) {
            return zzgei.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgei.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z4) {
            return zzgei.zzh(new zzbfl(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgei.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzbfl(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final m9.a zzo(JSONArray jSONArray, boolean z4, boolean z10) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgei.zzh(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z10 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z4));
        }
        return zzgei.zzm(zzgei.zzd(arrayList), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbfl zzbflVar : (List) obj) {
                    if (zzbflVar != null) {
                        arrayList2.add(zzbflVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final m9.a zzp(JSONObject jSONObject, zzfet zzfetVar, zzfew zzfewVar) {
        final m9.a aVarZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfetVar, zzfewVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgei.zzn(aVarZzb, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) throws zzeiz {
                zzcfk zzcfkVar = (zzcfk) obj;
                if (zzcfkVar == null || zzcfkVar.zzq() == null) {
                    throw new zzeiz(1, "Retrieve video view in html5 ad response failed.");
                }
                return aVarZzb;
            }
        }, zzcaj.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final v2 zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new v2(strOptString, strOptString2);
    }

    public final /* synthetic */ zzbfi zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", zzbbs.zzq.zzf);
        return new zzbfi(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final /* synthetic */ m9.a zzb(q3 q3Var, zzfet zzfetVar, zzfew zzfewVar, String str, String str2, Object obj) throws Exception {
        zzcfk zzcfkVarZza = this.zzj.zza(q3Var, zzfetVar, zzfewVar);
        final zzcan zzcanVarZza = zzcan.zza((Object) zzcfkVarZza);
        zzdof zzdofVarZzb = this.zzl.zzb();
        zzcfkVarZza.zzN().zzU(zzdofVarZzb, zzdofVarZzb, zzdofVarZzb, zzdofVarZzb, zzdofVarZzb, false, null, new b(this.zza, null), null, null, this.zzo, this.zzn, this.zzm, null, zzdofVarZzb, null, null, null, null);
        zzcfkVarZza.zzag("/getNativeAdViewSignals", zzbjq.zzs);
        zzcfkVarZza.zzag("/getNativeClickMeta", zzbjq.zzt);
        zzcfkVarZza.zzN().zzE(true);
        zzcfkVarZza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z4, int i, String str3, String str4) {
                zzcan zzcanVar = zzcanVarZza;
                if (z4) {
                    zzcanVar.zzb();
                    return;
                }
                zzcanVar.zzd(new zzeiz(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfkVarZza.zzae(str, str2, null);
        return zzcanVarZza;
    }

    public final m9.a zzc(String str, Object obj) throws Exception {
        zzcfx zzcfxVar = p.C.f2980d;
        zzcfk zzcfkVarZza = zzcfx.zza(this.zza, zzche.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzcan zzcanVarZza = zzcan.zza((Object) zzcfkVarZza);
        zzcfkVarZza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z4, int i, String str2, String str3) {
                zzcanVarZza.zzb();
            }
        });
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfh)).booleanValue()) {
            zzcfkVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
            return zzcanVarZza;
        }
        zzcfkVarZza.loadData(str, "text/html", "UTF-8");
        return zzcanVarZza;
    }

    public final m9.a zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgei.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzgei.zzm(zzo(jSONArrayOptJSONArray, false, true), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final m9.a zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final m9.a zzf(JSONObject jSONObject, String str) {
        zzbfn zzbfnVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbfnVar.zzb, zzbfnVar.zzd);
    }

    public final m9.a zzg(JSONObject jSONObject, String str, final zzfet zzfetVar, final zzfew zzfewVar) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjH)).booleanValue()) {
            return zzgei.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgei.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgei.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final q3 q3VarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgei.zzh(null);
        }
        final m9.a aVarZzn = zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzb(q3VarZzk, zzfetVar, zzfewVar, strOptString, strOptString2, obj);
            }
        }, zzcaj.zze);
        return zzgei.zzn(aVarZzn, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) throws zzeiz {
                if (((zzcfk) obj) != null) {
                    return aVarZzn;
                }
                throw new zzeiz(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcaj.zzf);
    }

    public final m9.a zzh(JSONObject jSONObject, zzfet zzfetVar, zzfew zzfewVar) {
        m9.a aVarZza;
        String[] strArr = {"html_containers", "instream"};
        JSONObject jSONObjectS = qd.b.S(jSONObject, strArr);
        JSONObject jSONObjectOptJSONObject = jSONObjectS == null ? null : jSONObjectS.optJSONObject(strArr[1]);
        if (jSONObjectOptJSONObject != null) {
            return zzp(jSONObjectOptJSONObject, zzfetVar, zzfewVar);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject2 == null) {
            return zzgei.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject2.optString("vast_xml");
        zzbce zzbceVar = zzbcn.zzjG;
        t tVar = t.f3437d;
        boolean z4 = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && jSONObjectOptJSONObject2.has("html");
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z4) {
                aVarZza = this.zzi.zza(jSONObjectOptJSONObject2);
            }
            return zzl(zzgei.zzo(aVarZza, ((Integer) tVar.f3440c.zza(zzbcn.zzdR)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z4) {
            i6.h.g("Required field 'vast_xml' or 'html' is missing");
            return zzgei.zzh(null);
        }
        aVarZza = zzp(jSONObjectOptJSONObject2, zzfetVar, zzfewVar);
        return zzl(zzgei.zzo(aVarZza, ((Integer) tVar.f3440c.zza(zzbcn.zzdR)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }
}
