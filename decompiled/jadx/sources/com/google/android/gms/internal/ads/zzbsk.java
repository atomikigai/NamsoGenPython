package com.google.android.gms.internal.ads;

import i6.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzbsk {
    private final zzcfk zza;
    private final String zzb;

    public zzbsk(zzcfk zzcfkVar, String str) {
        this.zza = zzcfkVar;
        this.zzb = str;
    }

    public final void zzg(int i, int i10, int i11, int i12) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e) {
            h.e("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.zzb);
            zzcfk zzcfkVar = this.zza;
            if (zzcfkVar != null) {
                zzcfkVar.zze("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            h.e("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            h.e("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzj(int i, int i10, int i11, int i12, float f10, int i13) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i10).put("maxSizeWidth", i11).put("maxSizeHeight", i12).put("density", f10).put("rotation", i13));
        } catch (JSONException e) {
            h.e("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzk(int i, int i10, int i11, int i12) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e) {
            h.e("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            h.e("Error occurred while dispatching state change.", e);
        }
    }
}
