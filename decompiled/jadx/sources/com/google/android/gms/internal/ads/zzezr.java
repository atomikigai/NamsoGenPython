package com.google.android.gms.internal.ads;

import e6.s;
import h6.k0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzezr implements zzevy {
    private final Map zza;

    public zzezr(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", s.f3427f.f3428a.i(this.zza));
        } catch (JSONException e) {
            k0.k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
