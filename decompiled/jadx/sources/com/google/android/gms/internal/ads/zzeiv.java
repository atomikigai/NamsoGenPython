package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import e6.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeiv {
    private final n7.a zza;
    private final zzeix zzb;
    private final zzflr zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgI)).booleanValue();
    private final zzefg zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzeiv(n7.a aVar, zzeix zzeixVar, zzefg zzefgVar, zzflr zzflrVar) {
        this.zza = aVar;
        this.zzb = zzeixVar;
        this.zzf = zzefgVar;
        this.zzc = zzflrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfet zzfetVar) {
        zzeiu zzeiuVar = (zzeiu) this.zzd.get(zzfetVar);
        if (zzeiuVar == null) {
            return false;
        }
        return zzeiuVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized m9.a zzf(zzfff zzfffVar, zzfet zzfetVar, m9.a aVar, zzfln zzflnVar) {
        zzfew zzfewVar = zzfffVar.zzb.zzb;
        ((b) this.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = zzfetVar.zzw;
        if (str != null) {
            this.zzd.put(zzfetVar, new zzeiu(str, zzfetVar.zzaf, 9, 0L, null));
            zzgei.zzr(aVar, new zzeit(this, jElapsedRealtime, zzfewVar, zzfetVar, str, zzflnVar, zzfffVar), zzcaj.zzf);
        }
        return aVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzeiu zzeiuVar = (zzeiu) ((Map.Entry) it.next()).getValue();
                if (zzeiuVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzeiuVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfet zzfetVar) {
        try {
            ((b) this.zza).getClass();
            this.zzh = SystemClock.elapsedRealtime() - this.zzi;
            if (zzfetVar != null) {
                this.zzf.zze(zzfetVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzj() {
        ((b) this.zza).getClass();
        this.zzh = SystemClock.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        ((b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfet zzfetVar = (zzfet) it.next();
            if (!TextUtils.isEmpty(zzfetVar.zzw)) {
                this.zzd.put(zzfetVar, new zzeiu(zzfetVar.zzw, zzfetVar.zzaf, f.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        ((b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
    }

    public final synchronized void zzm(zzfet zzfetVar) {
        zzeiu zzeiuVar = (zzeiu) this.zzd.get(zzfetVar);
        if (zzeiuVar == null || this.zzg) {
            return;
        }
        zzeiuVar.zzc = 8;
    }
}
