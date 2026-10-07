package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbof {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzboc zza = new zzboe();
    public static final zzboa zzb = new zzboa() { // from class: com.google.android.gms.internal.ads.zzbod
        @Override // com.google.android.gms.internal.ads.zzboa
        public final Object zza(JSONObject jSONObject) {
            return zzbof.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
