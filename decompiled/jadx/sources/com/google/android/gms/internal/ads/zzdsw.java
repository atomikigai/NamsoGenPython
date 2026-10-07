package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import d6.p;
import e6.t;
import h6.m0;
import h6.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdsw {
    private final String zze;
    private final zzdsr zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final m0 zza = p.C.f2982g.zzi();

    public zzdsw(String str, zzdsr zzdsrVar) {
        this.zze = str;
        this.zzf = zzdsrVar;
    }

    private final Map zzg() {
        Map mapZza = this.zzf.zza();
        p.C.f2983j.getClass();
        mapZza.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        mapZza.put("tid", ((n0) this.zza).k() ? "" : this.zze);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcf)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "aaia");
            mapZzg.put("aair", "MalformedJson");
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcf)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            mapZzg.put("rqe", str2);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcf)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_started");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcf)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zze() {
        try {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcf)).booleanValue() && !this.zzd) {
                Map mapZzg = zzg();
                mapZzg.put("action", "init_finished");
                this.zzb.add(mapZzg);
                Iterator it = this.zzb.iterator();
                while (it.hasNext()) {
                    this.zzf.zzf((Map) it.next());
                }
                this.zzd = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcf)).booleanValue() && !this.zzc) {
            Map mapZzg = zzg();
            mapZzg.put("action", "init_started");
            this.zzb.add(mapZzg);
            this.zzc = true;
        }
    }
}
