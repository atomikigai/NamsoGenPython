package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbol implements zzbkg {
    final /* synthetic */ zzbom zza;
    private final zzbno zzb;
    private final zzcao zzc;

    public zzbol(zzbom zzbomVar, zzbno zzbnoVar, zzcao zzcaoVar) {
        this.zza = zzbomVar;
        this.zzb = zzbnoVar;
        this.zzc = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbnx());
            } else {
                this.zzc.zzd(new zzbnx(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
