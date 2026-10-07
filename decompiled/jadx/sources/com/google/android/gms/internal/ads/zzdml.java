package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdml {
    private final Executor zza;
    private final zzdmg zzb;

    public zzdml(Executor executor, zzdmg zzdmgVar) {
        this.zza = executor;
        this.zzb = zzdmgVar;
    }

    public final m9.a zza(JSONObject jSONObject, String str) {
        m9.a aVarZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgei.zzh(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                aVarZzh = zzgei.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    aVarZzh = zzgei.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    aVarZzh = "string".equals(strOptString2) ? zzgei.zzh(new zzdmk(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgei.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdmi
                        @Override // com.google.android.gms.internal.ads.zzfwh
                        public final Object apply(Object obj) {
                            return new zzdmk(strOptString, (zzbfl) obj);
                        }
                    }, this.zza) : zzgei.zzh(null);
                }
            }
            arrayList.add(aVarZzh);
        }
        return zzgei.zzm(zzgei.zzd(arrayList), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdmk zzdmkVar : (List) obj) {
                    if (zzdmkVar != null) {
                        arrayList2.add(zzdmkVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
