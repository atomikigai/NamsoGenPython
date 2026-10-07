package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdhy implements zzhfx {
    private final zzdhw zza;

    public zzdhy(zzdhw zzdhwVar) {
        this.zza = zzdhwVar;
    }

    public static JSONObject zza(zzdhw zzdhwVar) {
        JSONObject jSONObjectZzb = zzdhwVar.zzb();
        zzhgf.zzb(jSONObjectZzb);
        return jSONObjectZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return zza(this.zza);
    }

    public final JSONObject zzc() {
        return zza(this.zza);
    }
}
