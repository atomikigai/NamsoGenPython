package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbkf implements zzbkg {
    final /* synthetic */ zzcao zza;

    public zzbkf(zzbkh zzbkhVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza(String str) {
        this.zza.zzd(new zzbnx(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
