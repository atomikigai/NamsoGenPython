package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;
import h6.k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeyf implements zzevz {
    private final JSONObject zza;

    public zzeyf(Context context) {
        this.zza = zzbvt.zzc(context, i6.a.g());
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlF)).booleanValue() ? zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
            }
        }) : zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            k0.k("Failed putting version constants.");
        }
    }
}
