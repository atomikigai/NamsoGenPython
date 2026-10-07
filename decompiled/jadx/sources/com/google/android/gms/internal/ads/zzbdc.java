package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import d6.p;
import e6.t;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbdc {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbdc(boolean z4, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcz zzf() {
        p.C.f2983j.getClass();
        return new zzbcz(SystemClock.elapsedRealtime(), null, null);
    }

    public final zzbdb zza() {
        zzbdb zzbdbVar;
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                for (zzbcz zzbczVar : this.zza) {
                    long jZza = zzbczVar.zza();
                    String strZzc = zzbczVar.zzc();
                    zzbcz zzbczVarZzb = zzbczVar.zzb();
                    if (zzbczVarZzb != null && jZza > 0) {
                        long jZza2 = jZza - zzbczVarZzb.zza();
                        sb2.append(strZzc);
                        sb2.append('.');
                        sb2.append(jZza2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbczVarZzb.zza()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbczVarZzb.zza()));
                                sb3.append('+');
                                sb3.append(strZzc);
                            } else {
                                map.put(Long.valueOf(zzbczVarZzb.zza()), new StringBuilder(strZzc));
                            }
                        }
                    }
                }
                this.zza.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        p pVar = p.C;
                        pVar.f2983j.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        pVar.f2983j.getClass();
                        sb4.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                zzbdbVar = new zzbdb(sb2.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbdbVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            p.C.f2982g.zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbdc zzbdcVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcs zzbcsVarZzg;
        if (TextUtils.isEmpty(str2) || (zzbcsVarZzg = p.C.f2982g.zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbcy zzbcyVarZza = zzbcsVarZzg.zza(str);
            Map map = this.zzb;
            map.put(str, zzbcyVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbcz zzbczVar, long j4, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbcz(j4, strArr[0], zzbczVar));
        }
        return true;
    }
}
