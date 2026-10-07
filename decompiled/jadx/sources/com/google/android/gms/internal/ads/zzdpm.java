package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import d6.b;
import d6.p;
import da.v;
import e6.t;
import g6.c;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdpm {
    private final zzcwk zza;
    private final zzdej zzb;
    private final zzcxt zzc;
    private final zzcyg zzd;
    private final zzcys zze;
    private final zzdbi zzf;
    private final Executor zzg;
    private final zzdef zzh;
    private final zzcny zzi;
    private final b zzj;
    private final zzbyh zzk;
    private final zzavc zzl;
    private final zzdaz zzm;
    private final zzedp zzn;
    private final zzflr zzo;
    private final zzdsm zzp;
    private final zzcnb zzq;
    private final zzdps zzr;

    public zzdpm(zzcwk zzcwkVar, zzcxt zzcxtVar, zzcyg zzcygVar, zzcys zzcysVar, zzdbi zzdbiVar, Executor executor, zzdef zzdefVar, zzcny zzcnyVar, b bVar, zzbyh zzbyhVar, zzavc zzavcVar, zzdaz zzdazVar, zzedp zzedpVar, zzflr zzflrVar, zzdsm zzdsmVar, zzdej zzdejVar, zzcnb zzcnbVar, zzdps zzdpsVar) {
        this.zza = zzcwkVar;
        this.zzc = zzcxtVar;
        this.zzd = zzcygVar;
        this.zze = zzcysVar;
        this.zzf = zzdbiVar;
        this.zzg = executor;
        this.zzh = zzdefVar;
        this.zzi = zzcnyVar;
        this.zzj = bVar;
        this.zzk = zzbyhVar;
        this.zzl = zzavcVar;
        this.zzm = zzdazVar;
        this.zzn = zzedpVar;
        this.zzo = zzflrVar;
        this.zzp = zzdsmVar;
        this.zzb = zzdejVar;
        this.zzq = zzcnbVar;
        this.zzr = zzdpsVar;
    }

    public static final m9.a zzj(zzcfk zzcfkVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzck)).booleanValue()) {
            v.t(p.C.f2983j, bundle, zzdrv.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzcao zzcaoVar = new zzcao();
        zzcfkVar.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdpd
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z4, int i, String str3, String str4) {
                zzcao zzcaoVar2 = zzcaoVar;
                if (z4) {
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzck)).booleanValue()) {
                        v.t(p.C.f2983j, bundle, zzdrv.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzcaoVar2.zzc(null);
                    return;
                }
                zzcaoVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfkVar.zzae(str, str2, null);
        return zzcaoVar;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final void zzf(View view) {
        this.zzj.f2927b = true;
    }

    public final /* synthetic */ void zzg(zzcfk zzcfkVar, zzcfk zzcfkVar2, Map map) {
        this.zzi.zzh(zzcfkVar);
    }

    public final boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjI)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.f2927b = true;
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(final zzcfk zzcfkVar, boolean z4, zzbju zzbjuVar, Bundle bundle) {
        zzaux zzauxVarZzc;
        zzbce zzbceVar = zzbcn.zzck;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, bundle, zzdrv.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcfkVar.zzN().zzU(new e6.a() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // e6.a
            public final void onAdClicked() {
                this.zza.zzc();
            }
        }, this.zzd, this.zze, new zzbij() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzb(String str, String str2) {
                this.zza.zzd(str, str2);
            }
        }, new c() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // g6.c
            public final void zzg() {
                this.zza.zze();
            }
        }, z4, zzbjuVar, this.zzj, new zzdpl(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcfkVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdph
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzh(view, motionEvent);
                return false;
            }
        });
        zzcfkVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdpi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.zzf(view);
            }
        });
        if (((Boolean) zzbclVar2.zza(zzbcn.zzcJ)).booleanValue() && (zzauxVarZzc = this.zzl.zzc()) != null) {
            zzauxVarZzc.zzo(zzcfkVar.zzF());
        }
        this.zzh.zzo(zzcfkVar, this.zzg);
        this.zzh.zzo(new zzaym() { // from class: com.google.android.gms.internal.ads.zzdpj
            @Override // com.google.android.gms.internal.ads.zzaym
            public final void zzdp(zzayl zzaylVar) {
                zzchc zzchcVarZzN = zzcfkVar.zzN();
                Rect rect = zzaylVar.zzd;
                zzchcVarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza(zzcfkVar.zzF());
        zzcfkVar.zzag("/trackActiveViewUnit", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdpk
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzg(zzcfkVar, (zzcfk) obj, map);
            }
        });
        this.zzi.zzi(zzcfkVar);
        if (((Boolean) zzbclVar2.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, bundle, zzdrv.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
