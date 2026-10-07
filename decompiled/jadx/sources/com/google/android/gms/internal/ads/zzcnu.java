package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import d6.p;
import e6.t;
import h6.b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcnu implements zzbob {
    private final Context zza;
    private final zzayi zzb;
    private final PowerManager zzc;

    public zzcnu(Context context, zzayi zzayiVar) {
        this.zza = context;
        this.zzb = zzayiVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00cc  */
    @Override // com.google.android.gms.internal.ads.zzbob
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcnx zzcnxVar) throws JSONException {
        boolean z4;
        float f10;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayl zzaylVar = zzcnxVar.zzf;
        if (zzaylVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = zzaylVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcnxVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcnxVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive());
            p pVar = p.C;
            b bVar = pVar.h;
            synchronized (bVar) {
                z4 = bVar.f4971a;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appMuted", z4).put("appVolume", pVar.h.a());
            AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
            if (audioManager == null) {
                f10 = 0.0f;
            } else {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                if (streamMaxVolume != 0) {
                    f10 = streamVolume / streamMaxVolume;
                } else {
                    f10 = 0.0f;
                }
            }
            jSONObjectPut2.put("deviceVolume", f10);
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzaylVar.zzb).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", zzaylVar.zzc.top).put("bottom", zzaylVar.zzc.bottom).put("left", zzaylVar.zzc.left).put("right", zzaylVar.zzc.right)).put("adBox", new JSONObject().put("top", zzaylVar.zzd.top).put("bottom", zzaylVar.zzd.bottom).put("left", zzaylVar.zzd.left).put("right", zzaylVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzaylVar.zze.top).put("bottom", zzaylVar.zze.bottom).put("left", zzaylVar.zze.left).put("right", zzaylVar.zze.right)).put("globalVisibleBoxVisible", zzaylVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzaylVar.zzg.top).put("bottom", zzaylVar.zzg.bottom).put("left", zzaylVar.zzg.left).put("right", zzaylVar.zzg.right)).put("localVisibleBoxVisible", zzaylVar.zzh).put("hitBox", new JSONObject().put("top", zzaylVar.zzi.top).put("bottom", zzaylVar.zzi.bottom).put("left", zzaylVar.zzi.left).put("right", zzaylVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcnxVar.zza);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbw)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzaylVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcnxVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
