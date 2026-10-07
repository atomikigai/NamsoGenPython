package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import d6.p;
import e6.e2;
import e6.t;
import e6.t3;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcwf extends e2 {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzefg zzh;
    private final Bundle zzi;

    public zzcwf(zzfet zzfetVar, String str, zzefg zzefgVar, zzfew zzfewVar, String str2) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String string = null;
        this.zzb = zzfetVar == null ? null : zzfetVar.zzab;
        this.zzc = str2;
        this.zzd = zzfewVar == null ? null : zzfewVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = zzfetVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzefgVar.zzc();
        this.zzh = zzefgVar;
        p.C.f2983j.getClass();
        this.zzf = System.currentTimeMillis() / 1000;
        zzbce zzbceVar = zzbcn.zzgG;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() || zzfewVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfewVar.zzk;
        }
        this.zzg = (!((Boolean) tVar.f3440c.zza(zzbcn.zziQ)).booleanValue() || zzfewVar == null || TextUtils.isEmpty(zzfewVar.zzi)) ? "" : zzfewVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // e6.f2
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // e6.f2
    public final t3 zzf() {
        zzefg zzefgVar = this.zzh;
        if (zzefgVar != null) {
            return zzefgVar.zza();
        }
        return null;
    }

    @Override // e6.f2
    public final String zzg() {
        return this.zza;
    }

    @Override // e6.f2
    public final String zzh() {
        return this.zzc;
    }

    @Override // e6.f2
    public final String zzi() {
        return this.zzb;
    }

    @Override // e6.f2
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
