package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import d6.p;
import e6.t;
import h6.r0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbcq {
    private final String zza = (String) zzbeh.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbcq(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        linkedHashMap.put("device", r0.G());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        r0 r0Var2 = pVar.f2979c;
        linkedHashMap.put("is_lite_sdk", true != r0.d(context) ? "0" : "1");
        Future futureZzb = pVar.f2988o.zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbwb) futureZzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbwb) futureZzb.get()).zzk));
        } catch (Exception e) {
            p.C.f2982g.zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        zzbce zzbceVar = zzbcn.zzkX;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            Map map = this.zzb;
            r0 r0Var3 = p.C.f2979c;
            map.put("is_bstar", true != r0.b(context) ? "0" : "1");
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zziZ)).booleanValue()) {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzcs)).booleanValue()) {
                p pVar2 = p.C;
                if (zzfxf.zzd(pVar2.f2982g.zzn())) {
                    return;
                }
                this.zzb.put("plugin", pVar2.f2982g.zzn());
            }
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
