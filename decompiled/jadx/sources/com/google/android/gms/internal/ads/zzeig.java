package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeig {
    private final zzgfa zzc;
    private zzeiw zzf;
    private final String zzh;
    private final int zzi;
    private final zzeiv zzj;
    private zzfet zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = f.API_PRIORITY_OTHER;
    private boolean zzl = false;

    public zzeig(zzfff zzfffVar, zzeiv zzeivVar, zzgfa zzgfaVar) {
        this.zzi = zzfffVar.zzb.zzb.zzr;
        this.zzj = zzeivVar;
        this.zzc = zzgfaVar;
        this.zzh = zzejc.zzc(zzfffVar);
        List list = zzfffVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfet) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzeiw zzeiwVar = this.zzf;
        if (zzeiwVar != null) {
            this.zzc.zzc(zzeiwVar);
        } else {
            this.zzc.zzd(new zzeiz(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z4) {
        try {
            for (zzfet zzfetVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfetVar);
                int iIntValue = num != null ? num.intValue() : f.API_PRIORITY_OTHER;
                if (z4 || !this.zze.contains(zzfetVar.zzat)) {
                    int i = this.zzg;
                    if (iIntValue < i) {
                        return true;
                    }
                    if (iIntValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzg() {
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfet) it.next());
                if ((num != null ? num.intValue() : f.API_PRIORITY_OTHER) < this.zzg) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized boolean zzi() {
        if (this.zzl) {
            return false;
        }
        if (!this.zzb.isEmpty() && ((zzfet) this.zzb.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized zzfet zza() {
        try {
            if (zzi()) {
                for (int i = 0; i < this.zzb.size(); i++) {
                    zzfet zzfetVar = (zzfet) this.zzb.get(i);
                    String str = zzfetVar.zzat;
                    if (!this.zze.contains(str)) {
                        if (zzfetVar.zzav) {
                            this.zzl = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.zze.add(str);
                        }
                        this.zzd.add(zzfetVar);
                        return (zzfet) this.zzb.remove(i);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Throwable th, zzfet zzfetVar) {
        this.zzl = false;
        this.zzd.remove(zzfetVar);
        this.zze.remove(zzfetVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zze();
    }

    public final synchronized void zzc(zzeiw zzeiwVar, zzfet zzfetVar) {
        this.zzl = false;
        this.zzd.remove(zzfetVar);
        if (zzd()) {
            zzeiwVar.zzr();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfetVar);
        int iIntValue = num != null ? num.intValue() : f.API_PRIORITY_OTHER;
        if (iIntValue > this.zzg) {
            this.zzj.zzm(zzfetVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = iIntValue;
        this.zzf = zzeiwVar;
        this.zzk = zzfetVar;
        if (zzh()) {
            return;
        }
        zze();
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
