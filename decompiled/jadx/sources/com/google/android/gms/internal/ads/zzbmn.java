package com.google.android.gms.internal.ads;

import e6.s;
import i6.h;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzbmn {
    public static void zza(zzbmo zzbmoVar, String str, Map map) {
        try {
            zzbmoVar.zze(str, s.f3427f.f3428a.i(map));
        } catch (JSONException unused) {
            h.g("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmo zzbmoVar, String str, JSONObject jSONObject) {
        StringBuilder sbE = b.e("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        h.b("Dispatching AFMA event: ".concat(sbE.toString()));
        zzbmoVar.zza(sbE.toString());
    }

    public static void zzc(zzbmo zzbmoVar, String str, String str2) {
        zzbmoVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmo zzbmoVar, String str, JSONObject jSONObject) {
        zzbmoVar.zzb(str, jSONObject.toString());
    }
}
