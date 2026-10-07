package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import d6.p;
import e6.t;
import h6.r0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbyx {
    public static Uri zza(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String zzb(Uri uri, Context context, Map map) {
        p pVar = p.C;
        if (!pVar.f2998y.zzp(context)) {
            return uri.toString();
        }
        String strZza = pVar.f2998y.zza(context);
        if (strZza == null) {
            return uri.toString();
        }
        zzbce zzbceVar = zzbcn.zzap;
        t tVar = t.f3437d;
        String str = (String) tVar.f3440c.zza(zzbceVar);
        String string = uri.toString();
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzao)).booleanValue() && string.contains(str)) {
            pVar.f2998y.zzj(context, strZza, (Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZza);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzan)).booleanValue()) {
                String string2 = zza(zzd(string, context), "fbs_aeid", strZza).toString();
                pVar.f2998y.zzj(context, strZza, (Map) map.get("_ac"));
                return string2;
            }
        }
        return string;
    }

    public static String zzc(String str, Context context, boolean z4, Map map) {
        String strZza;
        zzbce zzbceVar = zzbcn.zzaw;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue() && !z4) {
            return str;
        }
        p pVar = p.C;
        zzbyv zzbyvVar = pVar.f2998y;
        r0 r0Var = pVar.f2979c;
        zzbyv zzbyvVar2 = pVar.f2998y;
        if (!zzbyvVar.zzp(context) || TextUtils.isEmpty(str) || (strZza = zzbyvVar2.zza(context)) == null) {
            return str;
        }
        String str2 = (String) zzbclVar2.zza(zzbcn.zzap);
        if (((Boolean) zzbclVar2.zza(zzbcn.zzao)).booleanValue() && str.contains(str2)) {
            r0Var.getClass();
            if (r0.u(str, r0Var.f5069a, (String) tVar.f3440c.zza(zzbcn.zzal))) {
                zzbyvVar2.zzj(context, strZza, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZza);
            }
            r0Var.getClass();
            if (!r0.u(str, r0Var.f5070b, (String) tVar.f3440c.zza(zzbcn.zzam))) {
                return str;
            }
            zzbyvVar2.zzk(context, strZza, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid") || ((Boolean) zzbclVar2.zza(zzbcn.zzan)).booleanValue()) {
            return str;
        }
        r0Var.getClass();
        if (r0.u(str, r0Var.f5069a, (String) tVar.f3440c.zza(zzbcn.zzal))) {
            zzbyvVar2.zzj(context, strZza, (Map) map.get("_ac"));
            return zza(zzd(str, context), "fbs_aeid", strZza).toString();
        }
        r0Var.getClass();
        if (!r0.u(str, r0Var.f5070b, (String) tVar.f3440c.zza(zzbcn.zzam))) {
            return str;
        }
        zzbyvVar2.zzk(context, strZza, (Map) map.get("_ai"));
        return zza(zzd(str, context), "fbs_aeid", strZza).toString();
    }

    private static String zzd(String str, Context context) {
        p pVar = p.C;
        String strZzd = pVar.f2998y.zzd(context);
        String strZzb = pVar.f2998y.zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzd)) {
            str = zza(str, "gmp_app_id", strZzd).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzb)) ? str : zza(str, "fbs_aiid", strZzb).toString();
    }
}
