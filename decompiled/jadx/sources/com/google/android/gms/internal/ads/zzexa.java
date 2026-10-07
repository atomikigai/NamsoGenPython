package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import h6.k0;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzexa implements zzevy {
    private final b6.a zza;
    private final String zzb;
    private final zzfth zzc;

    public zzexa(b6.a aVar, String str, zzfth zzfthVar) {
        this.zza = aVar;
        this.zzb = str;
        this.zzc = zzfthVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        try {
            JSONObject jSONObjectN = b.N((JSONObject) obj, "pii");
            b6.a aVar = this.zza;
            if (aVar == null || TextUtils.isEmpty(aVar.f1406a)) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectN.put("pdid", str);
                    jSONObjectN.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectN.put("rdid", this.zza.f1406a);
            jSONObjectN.put("is_lat", this.zza.f1407b);
            jSONObjectN.put("idtype", "adid");
            if (this.zzc.zzc()) {
                jSONObjectN.put("paidv1_id_android_3p", this.zzc.zza());
                jSONObjectN.put("paidv1_creation_time_android_3p", this.zzc.zzb().toEpochMilli());
            }
        } catch (JSONException e) {
            k0.l("Failed putting Ad ID.", e);
        }
    }
}
