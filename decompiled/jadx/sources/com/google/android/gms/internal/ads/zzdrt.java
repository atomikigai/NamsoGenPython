package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
import d6.p;
import da.v;
import e6.h2;
import e6.t;
import i6.h;
import java.util.Map;
import o6.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdrt implements zzczj, zzcya, zzcwp, zzdex {
    private final zzdsh zza;
    private final zzdsr zzb;

    public zzdrt(zzdsh zzdshVar, zzdsr zzdsrVar) {
        this.zza = zzdshVar;
        this.zzb = zzdsrVar;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j4 = bundle.getLong(str);
            if (j4 >= 0) {
                this.zza.zzc(str, String.valueOf(j4));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzd(Bundle bundle, zzfzo zzfzoVar) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() || bundle == null) {
            return;
        }
        v.t(p.C.f2983j, bundle, zzdrv.PUBLIC_API_CALLBACK.zza());
        this.zza.zzc("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        int size = zzfzoVar.size();
        for (int i = 0; i < size; i++) {
            zzdrw zzdrwVar = (zzdrw) zzfzoVar.get(i);
            long j4 = bundle.getLong(zzdrwVar.zza().zza(), -1L);
            long j10 = bundle.getLong(zzdrwVar.zzb().zza(), -1L);
            if (j4 > 0 && j10 > 0) {
                this.zza.zzc(zzdrwVar.zzc(), String.valueOf(j10 - j4));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(h2 h2Var) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(h2Var.f3314a));
        this.zza.zzc("ed", h2Var.f3316c);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        this.zza.zze(zzbvxVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        this.zza.zzd(zzfffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(r rVar) {
        String str;
        zzbce zzbceVar = zzbcn.zzgO;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (rVar == null) {
                this.zza.zzb().put("action", "sgs");
                this.zza.zzb().put("request_id", "-1");
                this.zzb.zzf(this.zza.zzb());
                return;
            }
            zzbvx zzbvxVar = rVar.f7664c;
            if (zzbvxVar != null) {
                zzd(zzbvxVar.zzm, zzdrw.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(rVar.f7663b);
                this.zza.zzb().put("action", "sgs");
                Map mapZzb = this.zza.zzb();
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzjl)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        h.e("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                if (zzbvxVar != null) {
                    this.zza.zze(zzbvxVar.zza);
                }
                this.zzb.zzf(this.zza.zzb());
            } catch (JSONException unused) {
                this.zza.zzb().put("action", "sgf");
                this.zza.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzf(this.zza.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgO)).booleanValue()) {
            this.zza.zzb().put("action", "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzf(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        this.zza.zzb().put("action", "loaded");
        zzd(this.zza.zza(), zzdrw.zzb);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmn)).booleanValue()) {
            this.zza.zzb().put("mafe", true != WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO) ? "0" : "1");
        }
        this.zzb.zzf(this.zza.zzb());
    }
}
