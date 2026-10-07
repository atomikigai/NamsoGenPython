package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import d6.p;
import e6.t;
import org.json.JSONException;
import org.json.JSONObject;
import r7.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvt extends zzbvr {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbny zzd;
    private final i6.a zze;

    public zzbvt(Context context, zzbny zzbnyVar, i6.a aVar) {
        this.zzb = context.getApplicationContext();
        this.zze = aVar;
        this.zzd = zzbnyVar;
    }

    public static JSONObject zzc(Context context, i6.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzben.zzb.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f5213a);
            jSONObject.put("mf", zzben.zzc.zze());
            jSONObject.put("cl", "685849915");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", f.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final m9.a zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j4 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        p.C.f2983j.getClass();
        if (System.currentTimeMillis() - j4 < ((Long) zzben.zzd.zze()).longValue()) {
            return zzgei.zzh(null);
        }
        return zzgei.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbvs
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                this.zza.zzb((JSONObject) obj);
                return null;
            }
        }, zzcaj.zzf);
    }

    public final Void zzb(JSONObject jSONObject) {
        zzbce zzbceVar = zzbcn.zza;
        t tVar = t.f3437d;
        zzbcg zzbcgVar = tVar.f3439b;
        SharedPreferences sharedPreferencesZza = zzbcg.zza(this.zzb);
        if (sharedPreferencesZza == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        zzbcf zzbcfVar = tVar.f3438a;
        int i = zzbed.zza;
        zzbcfVar.zze(editorEdit, 1, jSONObject);
        editorEdit.commit();
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        p.C.f2983j.getClass();
        editorEdit2.putLong("js_last_update", System.currentTimeMillis()).apply();
        return null;
    }
}
