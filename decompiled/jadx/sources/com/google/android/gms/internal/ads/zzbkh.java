package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import d6.p;
import h6.k0;
import h6.r0;
import i6.h;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbkh implements zzbjr {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbkg zzbkgVar = (zzbkg) this.zzb.remove(str);
                if (zzbkgVar == null) {
                    h.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    zzbkgVar.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    zzbkgVar.zzb(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (k0.m()) {
                        k0.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbkgVar.zzb(jSONObject);
                } catch (JSONException e) {
                    zzbkgVar.zza(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m9.a zzb(zzbmy zzbmyVar, String str, JSONObject jSONObject) {
        zzcao zzcaoVar = new zzcao();
        r0 r0Var = p.C.f2979c;
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbkf(this, zzcaoVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbmyVar.zzl(str, jSONObject2);
            return zzcaoVar;
        } catch (Exception e) {
            zzcaoVar.zzd(e);
            return zzcaoVar;
        }
    }

    public final void zzc(String str, zzbkg zzbkgVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkgVar);
        }
    }
}
