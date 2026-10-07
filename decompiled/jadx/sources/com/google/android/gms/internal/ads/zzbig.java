package com.google.android.gms.internal.ads;

import android.os.Bundle;
import i6.h;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbig implements zzbjr {
    private final zzbih zza;

    public zzbig(zzbih zzbihVar) {
        this.zza = zzbihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            h.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleF = null;
        if (map.containsKey("info")) {
            try {
                bundleF = b.F(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                h.e("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleF == null) {
            h.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundleF);
        }
    }
}
