package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import d6.h;
import d6.p;
import e6.t;
import i6.d;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdsh {
    private final ConcurrentHashMap zza;
    private final zzcad zzb;
    private final zzffo zzc;
    private final String zzd;
    private final String zze;
    private final h zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdsh(Context context, zzdsr zzdsrVar, zzcad zzcadVar, zzffo zzffoVar, String str, String str2, h hVar) {
        ActivityManager activityManager;
        String str3;
        ConcurrentHashMap concurrentHashMapZzc = zzdsrVar.zzc();
        this.zza = concurrentHashMapZzc;
        this.zzb = zzcadVar;
        this.zzc = zzffoVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = hVar;
        this.zzh = context;
        concurrentHashMapZzc.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzbce zzbceVar = zzbcn.zzje;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        boolean zBooleanValue = ((Boolean) zzbclVar.zza(zzbceVar)).booleanValue();
        ActivityManager.MemoryInfo memoryInfo = null;
        if (zBooleanValue) {
            int i = hVar.f2953z;
            int i10 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i10 != 0) {
                str3 = i10 != 1 ? "na" : "2";
            } else {
                str3 = "1";
            }
            concurrentHashMapZzc.put("asv", str3);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzci)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(p.C.f2982g.zzb()));
            if (((Boolean) zzbclVar2.zza(zzbcn.zzcn)).booleanValue()) {
                zzftd zzftdVar = d.f5219b;
                if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    memoryInfo = new ActivityManager.MemoryInfo();
                    try {
                        activityManager.getMemoryInfo(memoryInfo);
                    } catch (NullPointerException unused) {
                        i6.h.g("Error retrieving the memory information.");
                    }
                }
                if (memoryInfo != null) {
                    zzc("mem_avl", String.valueOf(memoryInfo.availMem));
                    zzc("mem_tt", String.valueOf(memoryInfo.totalMem));
                    zzc("low_m", true != memoryInfo.lowMemory ? "0" : "1");
                }
            }
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzgO)).booleanValue()) {
            int iO = android.support.v4.media.session.a.O(zzffoVar) - 1;
            if (iO == 0) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            if (iO == 1) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("se", "query_g");
            } else if (iO == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (iO != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", "true");
            zzc("ragent", zzffoVar.zzd.A);
            zzc("rtype", android.support.v4.media.session.a.L(android.support.v4.media.session.a.M(zzffoVar.zzd)));
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zzd(zzfff zzfffVar) {
        if (!zzfffVar.zzb.zza.isEmpty()) {
            zzfet zzfetVar = (zzfet) zzfffVar.zzb.zza.get(0);
            zzc("ad_format", zzfet.zza(zzfetVar.zzb));
            if (zzfetVar.zzb == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
            }
        }
        zzc("gqi", zzfffVar.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzc("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
