package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import d6.p;
import e6.t;
import i6.h;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeeu {
    private final Context zza;
    private final i6.a zzb;
    private final zzfet zzc;
    private final zzcfk zzd;
    private final zzdsm zze;
    private zzfnh zzf;

    public zzeeu(Context context, i6.a aVar, zzfet zzfetVar, zzcfk zzcfkVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzfetVar;
        this.zzd = zzcfkVar;
        this.zze = zzdsmVar;
    }

    public final synchronized void zza(View view) {
        zzfnh zzfnhVar = this.zzf;
        if (zzfnhVar != null) {
            p.C.f2997x.zzh(zzfnhVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcfk zzcfkVar;
        if (this.zzf == null || (zzcfkVar = this.zzd) == null) {
            return;
        }
        zzcfkVar.zzd("onSdkImpression", zzfzr.zzd());
    }

    public final synchronized void zzc() {
        zzcfk zzcfkVar;
        try {
            zzfnh zzfnhVar = this.zzf;
            if (zzfnhVar == null || (zzcfkVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcfkVar.zzV().iterator();
            while (it.hasNext()) {
                p.C.f2997x.zzh(zzfnhVar, (View) it.next());
            }
            this.zzd.zzd("onSdkLoaded", zzfzr.zzd());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z4) {
        if (this.zzc.zzT) {
            zzbce zzbceVar = zzbcn.zzfb;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzfe)).booleanValue() && this.zzd != null) {
                    if (this.zzf != null) {
                        h.g("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.zza;
                    p pVar = p.C;
                    if (!pVar.f2997x.zzl(context)) {
                        h.g("Unable to initialize omid.");
                        return false;
                    }
                    if (this.zzc.zzV.zzb()) {
                        zzfnh zzfnhVarZze = pVar.f2997x.zze(this.zzb, this.zzd.zzG(), true);
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zzff)).booleanValue()) {
                            zzdsm zzdsmVar = this.zze;
                            String str = zzfnhVarZze != null ? "1" : "0";
                            zzdsl zzdslVarZza = zzdsmVar.zza();
                            zzdslVarZza.zzb("omid_js_session_success", str);
                            zzdslVarZza.zzf();
                        }
                        if (zzfnhVarZze == null) {
                            h.g("Unable to create javascript session service.");
                            return false;
                        }
                        h.f("Created omid javascript session service.");
                        this.zzf = zzfnhVarZze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzcfz zzcfzVar) {
        zzfnh zzfnhVar = this.zzf;
        if (zzfnhVar == null || this.zzd == null) {
            return;
        }
        p.C.f2997x.zzm(zzfnhVar, zzcfzVar);
        this.zzf = null;
        this.zzd.zzas(null);
    }
}
