package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.s;
import h6.k0;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeyt implements zzevy {
    private final Bundle zza;

    public zzeyt(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                b.N(b.N(jSONObject, "device"), "play_store").put("parental_controls", s.f3427f.f3428a.h(this.zza));
            } catch (JSONException unused) {
                k0.k("Failed putting parental controls bundle.");
            }
        }
    }
}
