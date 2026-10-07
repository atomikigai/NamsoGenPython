package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import l9.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam {
    static final zzdb zza = zzdb.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    public zzam(Application application) {
        this.zzb = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final f zzb() {
        return f.valueOf(this.zzc.getString("privacy_options_requirement_status", "UNKNOWN"));
    }

    public final Map zzc() {
        String string;
        Set<String> stringSet = this.zzc.getStringSet("stored_info", zzdb.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.zzb;
            zzcj zzcjVarZza = zzcl.zza(application, str);
            if (zzcjVarZza == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences(zzcjVarZza.zza, 0).getAll().get(zzcjVarZza.zzb);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        zzcl.zzb(this.zzb, this.zzd);
        this.zzd.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").apply();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).apply();
    }

    public final void zzg(int i) {
        this.zzc.edit().putInt("consent_status", i).apply();
    }

    public final void zzh(boolean z4) {
        this.zzc.edit().putBoolean("is_pub_misconfigured", z4).apply();
    }

    public final void zzi(f fVar) {
        this.zzc.edit().putString("privacy_options_requirement_status", fVar.name()).apply();
    }

    public final void zzj(Set set) {
        this.zzc.edit().putStringSet("stored_info", set).apply();
    }

    public final boolean zzk() {
        return this.zzc.getBoolean("is_pub_misconfigured", false);
    }
}
