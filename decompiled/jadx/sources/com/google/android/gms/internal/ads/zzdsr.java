package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import d6.p;
import e6.t;
import h6.n0;
import h6.r0;
import i6.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p6.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdsr extends zzdsu {
    private final p6.a zzf;

    public zzdsr(Executor executor, k kVar, p6.a aVar, c cVar, Context context) {
        super(executor, kVar, cVar, context);
        this.zzf = aVar;
        Map map = this.zza;
        aVar.getClass();
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        zzbzz zzbzzVar = pVar.f2982g;
        map.put("device", r0.G());
        map.put("app", aVar.f7815b);
        Context context2 = aVar.f7814a;
        map.put("is_lite_sdk", true != r0.d(context2) ? "0" : "1");
        zzbce zzbceVar = zzbcn.zza;
        t tVar = t.f3437d;
        zzbcf zzbcfVar = tVar.f3438a;
        zzbcl zzbclVar = tVar.f3440c;
        List listZzb = zzbcfVar.zzb();
        if (((Boolean) zzbclVar.zza(zzbcn.zzgK)).booleanValue()) {
            listZzb.addAll(((n0) zzbzzVar.zzi()).n().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", aVar.f7816c);
        if (((Boolean) zzbclVar.zza(zzbcn.zzkX)).booleanValue()) {
            map.put("is_bstar", true != r0.b(context2) ? "0" : "1");
        }
        if (((Boolean) zzbclVar.zza(zzbcn.zziZ)).booleanValue() && ((Boolean) zzbclVar.zza(zzbcn.zzcs)).booleanValue()) {
            map.put("plugin", zzfxf.zzc(zzbzzVar.zzn()));
        }
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
