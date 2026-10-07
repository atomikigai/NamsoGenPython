package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import d6.p;
import e6.t;
import java.util.Iterator;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcrd implements zzcya, zzcxg {
    private final Context zza;
    private final zzcfk zzb;
    private final zzfet zzc;
    private final i6.a zzd;
    private zzeew zze;
    private boolean zzf;
    private final zzeeu zzg;

    public zzcrd(Context context, zzcfk zzcfkVar, zzfet zzfetVar, i6.a aVar, zzeeu zzeeuVar) {
        this.zza = context;
        this.zzb = zzcfkVar;
        this.zzc = zzfetVar;
        this.zzd = aVar;
        this.zzg = zzeeuVar;
    }

    private final synchronized void zza() {
        zzeet zzeetVar;
        zzees zzeesVar;
        try {
            if (this.zzc.zzT && this.zzb != null) {
                Context context = this.zza;
                p pVar = p.C;
                if (pVar.f2997x.zzl(context)) {
                    i6.a aVar = this.zzd;
                    String str = aVar.f5214b + "." + aVar.f5215c;
                    zzffr zzffrVar = this.zzc.zzV;
                    String strZza = zzffrVar.zza();
                    if (zzffrVar.zzc() == 1) {
                        zzeesVar = zzees.VIDEO;
                        zzeetVar = zzeet.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzfet zzfetVar = this.zzc;
                        zzees zzeesVar2 = zzees.HTML_DISPLAY;
                        zzeetVar = zzfetVar.zze == 1 ? zzeet.ONE_PIXEL : zzeet.BEGIN_TO_RENDER;
                        zzeesVar = zzeesVar2;
                    }
                    this.zze = pVar.f2997x.zza(str, this.zzb.zzG(), "", "javascript", strZza, zzeetVar, zzeesVar, this.zzc.zzal);
                    View viewZzF = this.zzb.zzF();
                    zzeew zzeewVar = this.zze;
                    if (zzeewVar != null) {
                        zzfmw zzfmwVarZza = zzeewVar.zza();
                        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfd)).booleanValue()) {
                            pVar.f2997x.zzj(zzfmwVarZza, this.zzb.zzG());
                            Iterator it = this.zzb.zzV().iterator();
                            while (it.hasNext()) {
                                p.C.f2997x.zzg(zzfmwVarZza, (View) it.next());
                            }
                        } else {
                            pVar.f2997x.zzj(zzfmwVarZza, viewZzF);
                        }
                        this.zzb.zzat(this.zze);
                        p.C.f2997x.zzk(zzfmwVarZza);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new e(0));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzb() {
        return ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfe)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzr() {
        zzcfk zzcfkVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcfkVar = this.zzb) == null) {
            return;
        }
        zzcfkVar.zzd("onSdkImpression", new e(0));
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
