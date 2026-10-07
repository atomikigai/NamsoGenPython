package com.google.android.gms.internal.ads;

import e6.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcmc implements zzcls {
    private final zzdvk zza;

    public zzcmc(zzdvk zzdvkVar) {
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcls
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziP)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
