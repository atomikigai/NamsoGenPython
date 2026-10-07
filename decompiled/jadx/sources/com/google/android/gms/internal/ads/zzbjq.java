package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import d6.p;
import e6.t;
import h6.a0;
import h6.k0;
import i6.h;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbjq {
    public static final zzbjr zza = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbio
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzcgr zzcgrVar = (zzcgr) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                h.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcgrVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z4 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z4 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z4);
                map2.put(str2, boolValueOf);
                k0.k("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbmm) zzcgrVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbjr zzb = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbiq
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzcgr zzcgrVar = (zzcgr) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhS)).booleanValue()) {
                h.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                h.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcgrVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            k0.k("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbmm) zzcgrVar).zzd("openableApp", map2);
        }
    };
    public static final zzbjr zzc = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbit
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzbjq.zzb((zzcgr) obj, map);
        }
    };
    public static final zzbjr zzd = new zzbji();
    public static final zzbjr zze = new zzbjj();
    public static final zzbjr zzf = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbiu
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzcgr zzcgrVar = (zzcgr) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            String str = (String) map.get("u");
            if (str == null) {
                h.g("URL missing from httpTrack GMSG.");
            } else {
                new a0(zzcgrVar.getContext(), ((zzcgy) zzcgrVar).zzn().f5213a, str).zzb();
            }
        }
    };
    public static final zzbjr zzg = new zzbjk();
    public static final zzbjr zzh = new zzbjl();
    public static final zzbjr zzi = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzbis
        @Override // com.google.android.gms.internal.ads.zzbjr
        public final void zza(Object obj, Map map) {
            zzcgx zzcgxVar = (zzcgx) obj;
            zzbjr zzbjrVar = zzbjq.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i10 = Integer.parseInt(str2);
                int i11 = Integer.parseInt(str3);
                zzavc zzavcVarZzI = zzcgxVar.zzI();
                if (zzavcVarZzI != null) {
                    zzavcVarZzI.zzc().zzl(i, i10, i11);
                }
            } catch (NumberFormatException unused) {
                h.g("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbjr zzj = new zzbjm();
    public static final zzbjr zzk = new zzbjn();
    public static final zzbjr zzl = new zzcdf();
    public static final zzbjr zzm = new zzcdg();
    public static final zzbjr zzn = new zzbik();
    public static final zzbkh zzo = new zzbkh();
    public static final zzbjr zzp = new zzbjo();
    public static final zzbjr zzq = new zzbjp();
    public static final zzbjr zzr = new zzbiv();
    public static final zzbjr zzs = new zzbiw();
    public static final zzbjr zzt = new zzbix();
    public static final zzbjr zzu = new zzbiy();
    public static final zzbjr zzv = new zzbiz();
    public static final zzbjr zzw = new zzbja();
    public static final zzbjr zzx = new zzbjb();
    public static final zzbjr zzy = new zzbjc();
    public static final zzbjr zzz = new zzbjd();
    public static final zzbjr zzA = new zzbje();
    public static final zzbjr zzB = new zzbjg();
    public static final zzbjr zzC = new zzbjh();

    public static m9.a zza(zzcfk zzcfkVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzavc zzavcVarZzI = zzcfkVar.zzI();
            zzffs zzffsVarZzS = zzcfkVar.zzS();
            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlI)).booleanValue() || zzffsVarZzS == null) {
                if (zzavcVarZzI != null && zzavcVarZzI.zzf(uriZza)) {
                    uriZza = zzavcVarZzI.zza(uriZza, zzcfkVar.getContext(), zzcfkVar.zzF(), zzcfkVar.zzi());
                }
            } else if (zzavcVarZzI != null && zzavcVarZzI.zzf(uriZza)) {
                uriZza = zzffsVarZzS.zza(uriZza, zzcfkVar.getContext(), zzcfkVar.zzF(), zzcfkVar.zzi());
            }
        } catch (zzavd unused) {
            h.g("Unable to append parameter to URL: ".concat(str));
        }
        Map map = new HashMap();
        if (zzcfkVar.zzD() != null) {
            map = zzcfkVar.zzD().zzaw;
        }
        final String strZzb = zzbyx.zzb(uriZza, zzcfkVar.getContext(), map);
        long jLongValue = ((Long) zzbem.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 243799202) {
            return zzgei.zzh(strZzb);
        }
        zzgdz zzgdzVarZzu = zzgdz.zzu(zzcfkVar.zzT());
        zzfwh zzfwhVar = new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbil
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjr zzbjrVar = zzbjq.zza;
                if (!((Boolean) zzbem.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                p.C.f2982g.zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzges zzgesVar = zzcaj.zzf;
        return (zzgdz) zzgei.zze((zzgdz) zzgei.zzm((zzgdz) zzgei.zze(zzgdzVarZzu, Throwable.class, zzfwhVar, zzgesVar), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbim
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                zzbjr zzbjrVar = zzbjq.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbem.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                str2 = (String) zzbem.zza.zze();
                                str3 = (String) zzbem.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbem.zza.zze();
                        str3 = (String) zzbem.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzgesVar), Throwable.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbin
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjr zzbjrVar = zzbjq.zza;
                if (((Boolean) zzbem.zzi.zze()).booleanValue()) {
                    p.C.f2982g.zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgesVar);
    }

    public static void zzb(zzcgr zzcgrVar, Map map) {
        Intent uri;
        PackageManager packageManager = zzcgrVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                h.e("Error parsing the url: ".concat(String.valueOf(strOptString7)), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e4) {
                            p.C.f2982g.zzw(e4, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e10) {
                            h.e("Error constructing openable urls response.", e10);
                        }
                    } catch (JSONException e11) {
                        h.e("Error parsing the intent data.", e11);
                    }
                }
                ((zzbmm) zzcgrVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbmm) zzcgrVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbmm) zzcgrVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzdel zzdelVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzks)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdelVar != null) {
            zzdelVar.zzdG();
        }
    }
}
