package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import d6.p;
import e6.o0;
import e6.t;
import h6.k0;
import i6.h;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Executor;
import o6.b0;
import o6.c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdya {
    private final zzchk zza;
    private final Context zzb;
    private final i6.a zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfkl zzg;
    private final zzdsh zzh;
    private final Object zzi = new Object();

    public zzdya(zzchk zzchkVar, Context context, i6.a aVar, zzffo zzffoVar, Executor executor, String str, zzfkl zzfklVar, zzdsh zzdshVar) {
        this.zza = zzchkVar;
        this.zzb = context;
        this.zzc = aVar;
        this.zzd = zzffoVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfklVar;
        zzchkVar.zzx();
        this.zzh = zzdshVar;
    }

    private final m9.a zzc(final String str, final String str2) {
        zzfka zzfkaVarZza = zzfjz.zza(this.zzb, 11);
        zzfkaVarZza.zzi();
        zzboi zzboiVarZza = p.C.f2990q.zza(this.zzb, this.zzc, this.zza.zzz());
        zzboc zzbocVar = zzbof.zza;
        final zzbny zzbnyVarZza = zzboiVarZza.zza("google.afma.response.normalize", zzbocVar, zzbocVar);
        m9.a aVarZzn = zzgei.zzn(zzgei.zzn(zzgei.zzn(zzgei.zzh(""), new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgei.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxy
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzbnyVarZza.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfkk.zza(aVarZzn, this.zzg, zzfkaVarZza);
        return aVarZzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            h.g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    private static final String zzf(String str, String str2, String str3, zzdsh zzdshVar) {
        Boolean bool;
        if (!TextUtils.isEmpty(str3)) {
            try {
                bool = new JSONObject(str3).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
            } catch (JSONException unused) {
            }
            if (bool.booleanValue()) {
                int iLastIndexOf = str.lastIndexOf("&");
                String string = null;
                String strSubstring = iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : null;
                if (!TextUtils.isEmpty(strSubstring)) {
                    try {
                        byte[] bArrDecode = Base64.decode(strSubstring, 11);
                        byte[] bytes = str2.getBytes("UTF-8");
                        try {
                            string = new JSONObject(str3).getString("arek");
                        } catch (JSONException e) {
                            k0.k("Failed to get key from QueryJSONMap".concat(e.toString()));
                            p.C.f2982g.zzw(e, "CryptoUtils.getKeyFromQueryJsonMap");
                        }
                        return zzfgd.zzb(bArrDecode, bytes, string, zzdshVar);
                    } catch (UnsupportedEncodingException e4) {
                        k0.k("Failed to decode the adResponse. ".concat(e4.toString()));
                        p.C.f2982g.zzw(e4, "PreloadedLoader.decryptAdResponseIfNecessary");
                    }
                }
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x015d A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #1 {, blocks: (B:20:0x0061, B:22:0x007b, B:26:0x0085, B:27:0x008a, B:29:0x0095, B:32:0x009f, B:36:0x00c3, B:38:0x00d8, B:39:0x00eb, B:35:0x00ad, B:40:0x00f8, B:43:0x0115, B:48:0x0128, B:49:0x0129, B:50:0x0136, B:54:0x013a, B:55:0x013b, B:60:0x0153, B:73:0x0164, B:64:0x0157, B:67:0x015a, B:69:0x015c, B:70:0x015d, B:72:0x0163, B:77:0x0168, B:56:0x013c, B:58:0x0146, B:71:0x015e, B:44:0x0116, B:46:0x0120), top: B:112:0x0061, inners: #3, #4, #5, #6 }] */
    public final m9.a zza() {
        String strA;
        String strOptString;
        String str;
        String strZzf = this.zzd.zzd.I;
        if (!TextUtils.isEmpty(strZzf)) {
            String strZze = zze(strZzf);
            zzbce zzbceVar = zzbcn.zzgT;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && strZze.isEmpty()) {
                int iLastIndexOf = strZzf.lastIndexOf("&request_id=");
                strZze = iLastIndexOf != -1 ? strZzf.substring(iLastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(strZze)) {
                return zzgei.zzg(new zzeiz(15, "Invalid ad string."));
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzhj)).booleanValue()) {
                synchronized (this.zzi) {
                    c0 c0VarZzo = this.zza.zzo();
                    strA = c0VarZzo.a(strZze, this.zzh);
                    if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                        strZzf = zzf(strZzf, strZze, strA, this.zzh);
                    }
                    try {
                        strOptString = new JSONObject(strZzf).optString("render_id", "");
                    } catch (JSONException unused) {
                        strOptString = "";
                    }
                    String str2 = null;
                    int i = 0;
                    if (TextUtils.isEmpty(strOptString)) {
                        Pair pair = new Pair(str2, Integer.valueOf(i));
                        str = (String) pair.first;
                        int iIntValue = ((Integer) pair.second).intValue();
                        if (TextUtils.isEmpty(str)) {
                            synchronized (c0VarZzo) {
                                c0VarZzo.e.remove(strZze);
                            }
                        } else {
                            synchronized (c0VarZzo) {
                                c0VarZzo.e.remove(strZze);
                            }
                        }
                    } else {
                        String str3 = "";
                        try {
                            str3 = new String(Base64.decode(strOptString, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e) {
                            k0.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(strOptString)));
                            p.C.f2982g.zzw(e, "PreloadedLoader.decodeRenderId");
                        }
                        List listZze = zzfxd.zzb(zzfwf.zzc(':')).zze(str3);
                        if (listZze.size() == 2) {
                            str2 = (String) listZze.get(0);
                            i = Integer.parseInt((String) listZze.get(1));
                        } else {
                            k0.k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(strOptString)));
                        }
                        Pair pair2 = new Pair(str2, Integer.valueOf(i));
                        str = (String) pair2.first;
                        int iIntValue2 = ((Integer) pair2.second).intValue();
                        if (TextUtils.isEmpty(str) || iIntValue2 <= 0) {
                            synchronized (c0VarZzo) {
                                c0VarZzo.e.remove(strZze);
                            }
                        } else {
                            synchronized (c0VarZzo) {
                                try {
                                    b0 b0Var = (b0) c0VarZzo.e.get(strZze);
                                    if (b0Var != null && b0Var.f7597c.contains(str)) {
                                        return zzgei.zzg(new zzeiz(10, "The ad has already been shown."));
                                    }
                                    synchronized (c0VarZzo) {
                                        try {
                                            b0 b0Var2 = (b0) c0VarZzo.e.get(strZze);
                                            if (b0Var2 != null) {
                                                b0Var2.f7597c.add(str);
                                                if (b0Var2.f7597c.size() < iIntValue2) {
                                                }
                                            }
                                            synchronized (c0VarZzo) {
                                                c0VarZzo.e.remove(strZze);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                }
            } else {
                strA = this.zza.zzo().a(strZze, this.zzh);
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    strZzf = zzf(strZzf, strZze, strA, this.zzh);
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                return zzc(strZzf, zzd(strA));
            }
        }
        o0 o0Var = this.zzd.zzd.D;
        if (o0Var != null) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgL)).booleanValue()) {
                String str4 = o0Var.f3362a;
                String str5 = o0Var.f3363b;
                String strZze2 = zze(str4);
                String strZze3 = zze(str5);
                if (TextUtils.isEmpty(strZze3) || !strZze2.equals(strZze3)) {
                    this.zzh.zzb().put("ridmm", "true");
                } else {
                    c0 c0VarZzo2 = this.zza.zzo();
                    synchronized (c0VarZzo2) {
                        c0VarZzo2.e.remove(strZze2);
                    }
                    this.zzh.zzb().put("request_id", strZze2);
                }
            }
            return zzc(o0Var.f3362a, zzd(o0Var.f3363b));
        }
        return zzgei.zzg(new zzeiz(14, "Mismatch request IDs."));
    }

    public final /* synthetic */ m9.a zzb(JSONObject jSONObject) throws Exception {
        return zzgei.zzh(new zzfff(new zzffc(this.zzd), zzffe.zza(new StringReader(jSONObject.toString()), null)));
    }
}
