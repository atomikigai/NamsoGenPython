package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.b;
import d6.p;
import e6.q3;
import e6.t;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdmy {
    private final zzffo zza;
    private final Executor zzb;
    private final zzdpn zzc;
    private final zzdoi zzd;
    private final Context zze;
    private final zzdsm zzf;
    private final zzflr zzg;
    private final zzedp zzh;

    public zzdmy(zzffo zzffoVar, Executor executor, zzdpn zzdpnVar, Context context, zzdsm zzdsmVar, zzflr zzflrVar, zzedp zzedpVar, zzdoi zzdoiVar) {
        this.zza = zzffoVar;
        this.zzb = executor;
        this.zzc = zzdpnVar;
        this.zze = context;
        this.zzf = zzdsmVar;
        this.zzg = zzflrVar;
        this.zzh = zzedpVar;
        this.zzd = zzdoiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(zzcfk zzcfkVar) {
        zzj(zzcfkVar);
        zzcfkVar.zzag("/video", zzbjq.zzl);
        zzcfkVar.zzag("/videoMeta", zzbjq.zzm);
        zzcfkVar.zzag("/precache", new zzcds());
        zzcfkVar.zzag("/delayPageLoaded", zzbjq.zzp);
        zzcfkVar.zzag("/instrument", zzbjq.zzn);
        zzcfkVar.zzag("/log", zzbjq.zzg);
        zzcfkVar.zzag("/click", new zzbip(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcfkVar.zzN().zzF(true);
            zzcfkVar.zzag("/open", new zzbkd(null, null, null, null, null));
        } else {
            zzcfkVar.zzN().zzF(false);
        }
        if (p.C.f2998y.zzp(zzcfkVar.getContext())) {
            Map map = new HashMap();
            if (zzcfkVar.zzD() != null) {
                map = zzcfkVar.zzD().zzaw;
            }
            zzcfkVar.zzag("/logScionEvent", new zzbjx(zzcfkVar.getContext(), map));
        }
    }

    private final void zzi(zzcfk zzcfkVar, zzcan zzcanVar) {
        if (this.zza.zza != null && zzcfkVar.zzq() != null) {
            zzcfkVar.zzq().zzs(this.zza.zza);
        }
        zzcanVar.zzb();
    }

    private static final void zzj(zzcfk zzcfkVar) {
        zzcfkVar.zzag("/videoClicked", zzbjq.zzh);
        zzcfkVar.zzN().zzH(true);
        zzcfkVar.zzag("/getNativeAdViewSignals", zzbjq.zzs);
        zzcfkVar.zzag("/getNativeClickMeta", zzbjq.zzt);
    }

    public final m9.a zza(final JSONObject jSONObject) {
        return zzgei.zzn(zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcfk) obj);
            }
        }, this.zzb);
    }

    public final m9.a zzb(final String str, final String str2, final zzfet zzfetVar, final zzfew zzfewVar, final q3 q3Var) {
        return zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzd(q3Var, zzfetVar, zzfewVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ m9.a zzc(JSONObject jSONObject, final zzcfk zzcfkVar) throws Exception {
        zzbmb zzbmbVar = this.zza.zzb;
        final zzcan zzcanVarZza = zzcan.zza((Object) zzcfkVar);
        if (zzbmbVar != null) {
            zzcfkVar.zzaj(zzche.zzd());
        } else {
            zzcfkVar.zzaj(zzche.zze());
        }
        zzcfkVar.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z4, int i, String str, String str2) {
                this.zza.zzf(zzcfkVar, zzcanVarZza, z4, i, str, str2);
            }
        });
        zzcfkVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcanVarZza;
    }

    public final /* synthetic */ m9.a zzd(q3 q3Var, zzfet zzfetVar, zzfew zzfewVar, String str, String str2, Object obj) throws Exception {
        final zzcfk zzcfkVarZza = this.zzc.zza(q3Var, zzfetVar, zzfewVar);
        final zzcan zzcanVarZza = zzcan.zza((Object) zzcfkVarZza);
        if (this.zza.zzb != null) {
            zzh(zzcfkVarZza);
            zzcfkVarZza.zzaj(zzche.zzd());
        } else {
            zzdof zzdofVarZzb = this.zzd.zzb();
            zzcfkVarZza.zzN().zzU(zzdofVarZzb, zzdofVarZzb, zzdofVarZzb, zzdofVarZzb, zzdofVarZzb, false, null, new b(this.zze, null), null, null, this.zzh, this.zzg, this.zzf, null, zzdofVarZzb, null, null, null, null);
            zzj(zzcfkVarZza);
        }
        zzcfkVarZza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z4, int i, String str3, String str4) {
                this.zza.zzg(zzcfkVarZza, zzcanVarZza, z4, i, str3, str4);
            }
        });
        zzcfkVarZza.zzae(str, str2, null);
        return zzcanVarZza;
    }

    public final m9.a zze(Object obj) throws Exception {
        zzcfk zzcfkVarZza = this.zzc.zza(q3.h(), null, null);
        final zzcan zzcanVarZza = zzcan.zza((Object) zzcfkVarZza);
        zzh(zzcfkVarZza);
        zzcfkVarZza.zzN().zzI(new zzchb() { // from class: com.google.android.gms.internal.ads.zzdms
            @Override // com.google.android.gms.internal.ads.zzchb
            public final void zza() {
                zzcanVarZza.zzb();
            }
        });
        zzcfkVarZza.loadUrl((String) t.f3437d.f3440c.zza(zzbcn.zzdQ));
        return zzcanVarZza;
    }

    public final void zzf(zzcfk zzcfkVar, zzcan zzcanVar, boolean z4, int i, String str, String str2) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdY)).booleanValue()) {
            zzi(zzcfkVar, zzcanVar);
            return;
        }
        if (z4) {
            zzi(zzcfkVar, zzcanVar);
            return;
        }
        zzcanVar.zzd(new zzeiz(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    public final /* synthetic */ void zzg(zzcfk zzcfkVar, zzcan zzcanVar, boolean z4, int i, String str, String str2) {
        if (z4) {
            if (this.zza.zza != null && zzcfkVar.zzq() != null) {
                zzcfkVar.zzq().zzs(this.zza.zza);
            }
            zzcanVar.zzb();
            return;
        }
        zzcanVar.zzd(new zzeiz(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
