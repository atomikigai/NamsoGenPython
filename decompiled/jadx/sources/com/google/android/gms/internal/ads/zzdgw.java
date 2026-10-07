package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import d6.p;
import e6.t;
import g6.l;
import java.util.Iterator;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdgw implements zzcya, l, zzcxg {
    zzeew zza;
    private final Context zzb;
    private final zzcfk zzc;
    private final zzfet zzd;
    private final i6.a zze;
    private final zzbbs.zza.EnumC0000zza zzf;
    private final zzeeu zzg;

    public zzdgw(Context context, zzcfk zzcfkVar, zzfet zzfetVar, i6.a aVar, zzbbs.zza.EnumC0000zza enumC0000zza, zzeeu zzeeuVar) {
        this.zzb = context;
        this.zzc = zzcfkVar;
        this.zzd = zzfetVar;
        this.zze = aVar;
        this.zzf = enumC0000zza;
        this.zzg = zzeeuVar;
    }

    private final boolean zzg() {
        return ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfe)).booleanValue() && this.zzg.zzd();
    }

    @Override // g6.l
    public final void zzdr() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfj)).booleanValue() || this.zzc == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new e(0));
            } else {
                this.zzg.zzb();
            }
        }
    }

    @Override // g6.l
    public final void zzdu(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
            return;
        }
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfj)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new e(0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzeet zzeetVar;
        zzees zzeesVar;
        zzbbs.zza.EnumC0000zza enumC0000zza;
        zzbce zzbceVar = zzbcn.zzfm;
        t tVar = t.f3437d;
        if ((((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() || (enumC0000zza = this.zzf) == zzbbs.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD || enumC0000zza == zzbbs.zza.EnumC0000zza.INTERSTITIAL || enumC0000zza == zzbbs.zza.EnumC0000zza.APP_OPEN) && this.zzd.zzT && this.zzc != null) {
            Context context = this.zzb;
            p pVar = p.C;
            zzeeq zzeeqVar = pVar.f2997x;
            zzeeq zzeeqVar2 = pVar.f2997x;
            if (zzeeqVar.zzl(context)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                i6.a aVar = this.zze;
                String str = aVar.f5214b + "." + aVar.f5215c;
                zzffr zzffrVar = this.zzd.zzV;
                String strZza = zzffrVar.zza();
                if (zzffrVar.zzc() == 1) {
                    zzeesVar = zzees.VIDEO;
                    zzeetVar = zzeet.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzeetVar = this.zzd.zzY == 2 ? zzeet.UNSPECIFIED : zzeet.BEGIN_TO_RENDER;
                    zzeesVar = zzees.HTML_DISPLAY;
                }
                this.zza = pVar.f2997x.zza(str, this.zzc.zzG(), "", "javascript", strZza, zzeetVar, zzeesVar, this.zzd.zzal);
                View viewZzF = this.zzc.zzF();
                zzeew zzeewVar = this.zza;
                if (zzeewVar != null) {
                    zzfmw zzfmwVarZza = zzeewVar.zza();
                    if (((Boolean) tVar.f3440c.zza(zzbcn.zzfd)).booleanValue()) {
                        zzeeqVar2.zzj(zzfmwVarZza, this.zzc.zzG());
                        Iterator it = this.zzc.zzV().iterator();
                        while (it.hasNext()) {
                            p.C.f2997x.zzg(zzfmwVarZza, (View) it.next());
                        }
                    } else {
                        zzeeqVar2.zzj(zzfmwVarZza, viewZzF);
                    }
                    this.zzc.zzat(this.zza);
                    p.C.f2997x.zzk(zzfmwVarZza);
                    this.zzc.zzd("onSdkLoaded", new e(0));
                }
            }
        }
    }

    @Override // g6.l
    public final void zzdH() {
    }

    @Override // g6.l
    public final void zzdk() {
    }

    @Override // g6.l
    public final void zzdq() {
    }

    @Override // g6.l
    public final void zzdt() {
    }
}
