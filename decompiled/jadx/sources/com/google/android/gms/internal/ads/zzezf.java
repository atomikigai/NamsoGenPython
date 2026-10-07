package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzezf implements zzhfx {
    public static zzevz zza() {
        return new zzevz() { // from class: com.google.android.gms.internal.ads.zzezc
            @Override // com.google.android.gms.internal.ads.zzevz
            public final /* synthetic */ int zza() {
                return 0;
            }

            @Override // com.google.android.gms.internal.ads.zzevz
            public final m9.a zzb() {
                return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzezd
                    @Override // com.google.android.gms.internal.ads.zzevy
                    public final void zzj(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
