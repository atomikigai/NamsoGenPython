package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import e6.h2;
import e6.s;
import e6.t;
import e6.t3;
import i6.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzduy implements zzcwp, zzczj, zzcye {
    private final zzdvk zza;
    private final String zzb;
    private final String zzc;
    private zzcwf zzf;
    private h2 zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdux zze = zzdux.AD_REQUESTED;

    public zzduy(zzdvk zzdvkVar, zzffo zzffoVar, String str) {
        this.zza = zzdvkVar;
        this.zzc = str;
        this.zzb = zzffoVar.zzf;
    }

    private static JSONObject zzh(h2 h2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", h2Var.f3316c);
        jSONObject.put("errorCode", h2Var.f3314a);
        jSONObject.put("errorDescription", h2Var.f3315b);
        h2 h2Var2 = h2Var.f3317d;
        jSONObject.put("underlyingError", h2Var2 == null ? null : zzh(h2Var2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcwf zzcwfVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcwfVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcwfVar.zzc());
        jSONObject.put("responseId", zzcwfVar.zzi());
        zzbce zzbceVar = zzbcn.zziQ;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            String strZzd = zzcwfVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                h.b("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zziT)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (t3 t3Var : zzcwfVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", t3Var.f3447a);
            jSONObject2.put("latencyMillis", t3Var.f3448b);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziR)).booleanValue()) {
                jSONObject2.put("credentials", s.f3427f.f3428a.h(t3Var.f3450d));
            }
            h2 h2Var = t3Var.f3449c;
            jSONObject2.put("error", h2Var == null ? null : zzh(h2Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zza(zzcrq zzcrqVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcrqVar.zzm();
            this.zze = zzdux.AD_LOADED;
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziX)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObjectZzi;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfet.zza(this.zzd));
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziX)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcwf zzcwfVar = this.zzf;
        if (zzcwfVar != null) {
            jSONObjectZzi = zzi(zzcwfVar);
        } else {
            h2 h2Var = this.zzg;
            JSONObject jSONObjectZzi2 = null;
            if (h2Var != null && (iBinder = h2Var.e) != null) {
                zzcwf zzcwfVar2 = (zzcwf) iBinder;
                jSONObjectZzi2 = zzi(zzcwfVar2);
                if (zzcwfVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObjectZzi2.put("errors", jSONArray);
                }
            }
            jSONObjectZzi = jSONObjectZzi2;
        }
        jSONObject.put("responseInfo", jSONObjectZzi);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(h2 h2Var) {
        if (this.zza.zzq()) {
            this.zze = zzdux.AD_LOAD_FAILED;
            this.zzg = h2Var;
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziX)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziX)).booleanValue() || !this.zza.zzq()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        if (this.zza.zzq()) {
            if (!zzfffVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfet) zzfffVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfffVar.zzb.zzb.zzl)) {
                this.zzh = zzfffVar.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfffVar.zzb.zzb.zzm)) {
                this.zzi = zzfffVar.zzb.zzb.zzm;
            }
            if (zzfffVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfffVar.zzb.zzb.zzp;
            }
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziT)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfffVar.zzb.zzb.zzn)) {
                    this.zzj = zzfffVar.zzb.zzb.zzn;
                }
                if (zzfffVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfffVar.zzb.zzb.zzo;
                }
                zzdvk zzdvkVar = this.zza;
                JSONObject jSONObject = this.zzk;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdvkVar.zzk(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdux.AD_REQUESTED;
    }
}
