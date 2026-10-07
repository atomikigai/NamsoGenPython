package com.google.android.gms.internal.ads;

import android.os.Bundle;
import d6.p;
import e6.h2;
import e6.t;
import e6.t3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzefg {
    private final String zzc;
    private zzfew zzd = null;
    private zzfet zze = null;
    private t3 zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzefg(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfet zzfetVar) {
        return ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdG)).booleanValue() ? zzfetVar.zzap : zzfetVar.zzw;
    }

    private final synchronized void zzk(zzfet zzfetVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String strZzj = zzj(zzfetVar);
        if (map.containsKey(strZzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = zzfetVar.zzv.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, zzfetVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgE)).booleanValue()) {
            str = zzfetVar.zzF;
            str2 = zzfetVar.zzG;
            str3 = zzfetVar.zzH;
            str4 = zzfetVar.zzI;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        t3 t3Var = new t3(zzfetVar.zzE, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i, t3Var);
        } catch (IndexOutOfBoundsException e) {
            p.C.f2982g.zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzj, t3Var);
    }

    private final void zzl(zzfet zzfetVar, long j4, h2 h2Var, boolean z4) {
        Map map = this.zzb;
        String strZzj = zzj(zzfetVar);
        if (map.containsKey(strZzj)) {
            if (this.zze == null) {
                this.zze = zzfetVar;
            }
            t3 t3Var = (t3) this.zzb.get(strZzj);
            t3Var.f3448b = j4;
            t3Var.f3449c = h2Var;
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgF)).booleanValue() && z4) {
                this.zzf = t3Var;
            }
        }
    }

    public final t3 zza() {
        return this.zzf;
    }

    public final zzcwf zzb() {
        return new zzcwf(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfet zzfetVar) {
        zzk(zzfetVar, this.zza.size());
    }

    public final void zze(zzfet zzfetVar) {
        int iIndexOf = this.zza.indexOf(this.zzb.get(zzj(zzfetVar)));
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            iIndexOf = this.zza.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (t3) this.zza.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.zza.size()) {
                return;
            }
            t3 t3Var = (t3) this.zza.get(iIndexOf);
            t3Var.f3448b = 0L;
            t3Var.f3449c = null;
        }
    }

    public final void zzf(zzfet zzfetVar, long j4, h2 h2Var) {
        zzl(zzfetVar, j4, h2Var, false);
    }

    public final void zzg(zzfet zzfetVar, long j4, h2 h2Var) {
        zzl(zzfetVar, j4, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int iIndexOf = this.zza.indexOf((t3) this.zzb.get(str));
            try {
                this.zza.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e) {
                p.C.f2982g.zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfet) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzi(zzfew zzfewVar) {
        this.zzd = zzfewVar;
    }
}
