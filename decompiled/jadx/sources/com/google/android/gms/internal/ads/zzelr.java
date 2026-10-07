package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.os.SystemClock;
import d6.p;
import e6.h2;
import e6.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzelr extends zzbrh {
    private final String zza;
    private final zzbrf zzb;
    private final zzcao zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzelr(String str, zzbrf zzbrfVar, zzcao zzcaoVar, long j4) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcaoVar;
        this.zza = str;
        this.zzb = zzbrfVar;
        this.zze = j4;
        try {
            jSONObject.put("adapter_version", zzbrfVar.zzf().toString());
            jSONObject.put("sdk_version", zzbrfVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcao zzcaoVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbG)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcaoVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzh(String str, int i) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                this.zzd.put("signal_error", str);
                zzbce zzbceVar = zzbcn.zzbH;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    JSONObject jSONObject = this.zzd;
                    p.C.f2983j.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
                }
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzbG)).booleanValue()) {
                    this.zzd.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbG)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            zzbce zzbceVar = zzbcn.zzbH;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                JSONObject jSONObject = this.zzd;
                p.C.f2983j.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzbG)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final synchronized void zzg(h2 h2Var) throws RemoteException {
        zzh(h2Var.f3315b, 2);
    }
}
