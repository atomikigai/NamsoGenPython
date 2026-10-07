package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeho implements zzefd {
    private final zzdqd zza;

    public zzeho(zzdqd zzdqdVar) {
        this.zza = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzefe zza(String str, JSONObject jSONObject) throws zzffv {
        return new zzefe(this.zza.zzc(str, jSONObject), new zzegx(), str);
    }
}
