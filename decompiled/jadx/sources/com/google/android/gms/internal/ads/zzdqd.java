package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import e6.t;
import i6.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdqd {
    private final zzfgk zza;
    private final zzdqa zzb;

    public zzdqd(zzfgk zzfgkVar, zzdqa zzdqaVar) {
        this.zza = zzfgkVar;
        this.zzb = zzdqaVar;
    }

    public final zzbpg zza() throws RemoteException {
        zzbpg zzbpgVarZzb = this.zza.zzb();
        if (zzbpgVarZzb != null) {
            return zzbpgVarZzb;
        }
        h.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrf zzb(String str) throws RemoteException {
        zzbrf zzbrfVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbrfVarZzc);
        return zzbrfVarZzc;
    }

    public final zzfgm zzc(String str, JSONObject jSONObject) throws zzffv {
        zzbpj zzbpjVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbpjVarZzb = new zzbqh(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbpjVarZzb = new zzbqh(new zzbry());
            } else {
                zzbpg zzbpgVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbpgVarZza.zze(string)) {
                            zzbpjVarZzb = zzbpgVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbpjVarZzb = zzbpgVarZza.zzd(string) ? zzbpgVarZza.zzb(string) : zzbpgVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        h.e("Invalid custom event.", e);
                        zzbpjVarZzb = zzbpgVarZza.zzb(str);
                    }
                } else {
                    zzbpjVarZzb = zzbpgVarZza.zzb(str);
                }
            }
            zzfgm zzfgmVar = new zzfgm(zzbpjVarZzb);
            this.zzb.zzc(str, zzfgmVar);
            return zzfgmVar;
        } catch (Throwable th) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziW)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzffv(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
