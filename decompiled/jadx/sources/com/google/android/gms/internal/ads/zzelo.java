package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import d6.p;
import e6.t;
import h6.k0;
import h6.m0;
import h6.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzelo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzelo(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzfzr zzh(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(((n0) p.C.f2982g.zzi()).n().zzc())) {
                zzbce zzbceVar = zzbcn.zzdm;
                t tVar = t.f3437d;
                boolean zMatches = Pattern.matches((String) tVar.f3440c.zza(zzbceVar), str);
                boolean zMatches2 = Pattern.matches((String) tVar.f3440c.zza(zzbcn.zzdn), str);
                if (zMatches) {
                    map = new HashMap(this.zze);
                } else if (zMatches2) {
                    map = new HashMap(this.zzd);
                }
                return zzfzr.zzc(map);
            }
            return zzfzr.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str2 = (String) arrayList2.get(i10);
                        zzg(str2);
                        if (((zzelq) this.zza.get(str2)) != null) {
                            arrayList.add(new zzelq(str2, str, bundleZzo));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        JSONObject jSONObjectZzf;
        try {
            if (!((Boolean) zzbet.zzb.zze()).booleanValue()) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbS)).booleanValue() && (jSONObjectZzf = ((n0) p.C.f2982g.zzi()).n().zzf()) != null) {
                    try {
                        JSONArray jSONArray = jSONObjectZzf.getJSONArray("adapter_settings");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String strOptString = jSONObject.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString)) {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                                    boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject2.optString("platform");
                                    zzels zzelsVar = new zzels(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.zzd.put(strOptString, zzelsVar);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.zze.put(strOptString, zzelsVar);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        k0.l("Malformed config loading JSON.", e);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.zzc.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.zzc.put(str, map);
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzm() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzf = ((n0) p.C.f2982g.zzi()).n().zzf();
            if (jSONObjectZzf != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkB)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    arrayList.addAll(zzi(jSONArrayOptJSONArray.getJSONObject(i10), strOptString));
                                }
                            }
                            zzl(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    k0.l("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzn() {
        JSONObject jSONObjectZzf;
        if (!((Boolean) zzbet.zzf.zze()).booleanValue()) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbR)).booleanValue() && (jSONObjectZzf = ((n0) p.C.f2982g.zzi()).n().zzf()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzels(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzo));
                        }
                    }
                } catch (JSONException e) {
                    k0.l("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final Bundle zzo(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap map;
        try {
            Map mapZzb = zzb(str, str2);
            zzfzr zzfzrVarZzh = zzh(str2);
            map = new HashMap();
            for (Map.Entry entry : ((zzfzr) mapZzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzfzrVarZzh.containsKey(str3)) {
                    zzels zzelsVar = (zzels) zzfzrVarZzh.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzels(str3, zzelsVar.zzb, zzelsVar.zzc, zzelsVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgbu zzgbuVarZze = zzfzrVarZzh.entrySet().iterator();
            while (zzgbuVarZze.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzgbuVarZze.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzels) entry2.getValue()).zzd) {
                    map.put(str4, (zzels) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(((n0) p.C.f2982g.zzi()).n().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzelq> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = zzdqk.zza(this.zzg, str2, str);
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkB)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzelq zzelqVar : list) {
                        String str3 = zzelqVar.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzelqVar.zzb);
                    }
                    return zzfzr.zzc(map2);
                }
            }
            return zzfzr.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(((n0) p.C.f2982g.zzi()).n().zzc())) {
            return zzfzr.zzd();
        }
        return zzfzr.zzc(this.zzb);
    }

    public final void zze() {
        m0 m0VarZzi = p.C.f2982g.zzi();
        ((n0) m0VarZzi).f5038c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
        this.zzf.execute(new zzelm(this));
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzelm(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzelq(str, "", new Bundle()));
        }
    }
}
