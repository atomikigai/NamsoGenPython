package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import e6.s;
import e6.t;
import h6.i0;
import h6.k0;
import i6.d;
import i6.h;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdf implements zzbjr {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                d dVar = s.f3427f.f3428a;
                i = d.o(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                h.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (k0.m()) {
            StringBuilder sbE = b.e("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbE.append(i);
            sbE.append(".");
            k0.k(sbE.toString());
        }
        return i;
    }

    private static void zzc(zzcbt zzcbtVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbtVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                h.g("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            zzcbtVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbtVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbtVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbtVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i;
        zzccf zzccfVar = (zzccf) obj;
        String str = (String) map.get("action");
        if (str == null) {
            h.g("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZzb = zzccfVar.zzo() != null ? zzccfVar.zzo().zzb() : null;
        if (numValueOf2 != null && numZzb != null && !numValueOf2.equals(numZzb) && !str.equals("load")) {
            Locale locale = Locale.US;
            h.f("Event intended for player " + numValueOf2 + ", but sent to player " + numZzb + " - event ignored");
            return;
        }
        if (h.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            h.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                h.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzccfVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                h.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                h.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzccfVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                h.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                h.g("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzccfVar.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, i0.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzccfVar.zzd("onVideoEvent", map4);
            return;
        }
        zzcbu zzcbuVarZzo = zzccfVar.zzo();
        if (zzcbuVarZzo == null) {
            h.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzccfVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbce zzbceVar = zzbcn.zzdV;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzccfVar.zzh() : Math.min(iZzb3, zzccfVar.zzh());
            } else {
                if (k0.m()) {
                    StringBuilder sbD = b.d(iZzb3, zzccfVar.zzh(), "Calculate width with original width ", ", videoHost.getVideoBoundingWidth() ", ", x ");
                    sbD.append(iZzb);
                    sbD.append(".");
                    k0.k(sbD.toString());
                }
                iMin = Math.min(iZzb3, zzccfVar.zzh() - iZzb);
            }
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzccfVar.zzg() : Math.min(iZzb4, zzccfVar.zzg());
            } else {
                if (k0.m()) {
                    StringBuilder sbD2 = b.d(iZzb4, zzccfVar.zzg(), "Calculate height with original height ", ", videoHost.getVideoBoundingHeight() ", ", y ");
                    sbD2.append(iZzb2);
                    sbD2.append(".");
                    k0.k(sbD2.toString());
                }
                iMin2 = Math.min(iZzb4, zzccfVar.zzg() - iZzb2);
            }
            int i10 = iMin2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z4 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcbuVarZzo.zza() != null) {
                zzcbuVarZzo.zzc(iZzb, iZzb2, iMin, i10);
                return;
            }
            zzcbuVarZzo.zzd(iZzb, iZzb2, iMin, i10, i, z4, new zzcce((String) map.get("flags")));
            zzcbt zzcbtVarZza = zzcbuVarZzo.zza();
            if (zzcbtVarZza != null) {
                zzc(zzcbtVarZza, map);
                return;
            }
            return;
        }
        zzcgm zzcgmVarZzq = zzccfVar.zzq();
        if (zzcgmVarZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    h.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcgmVarZzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    h.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcgmVarZzq.zzu();
                return;
            }
        }
        zzcbt zzcbtVarZza2 = zzcbuVarZzo.zza();
        if (zzcbtVarZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzccfVar.zzd("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzccfVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcbtVarZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                h.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcbtVarZza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                h.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcbtVarZza2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcbtVarZza2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcbtVarZza2.zzr(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcbtVarZza2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcbtVarZza2.zzs();
                return;
            } else {
                zzcbtVarZza2.zzI();
                return;
            }
        }
        if (str.equals("pause")) {
            zzcbtVarZza2.zzu();
            return;
        }
        if (str.equals("play")) {
            zzcbtVarZza2.zzv();
            return;
        }
        if (str.equals("show")) {
            zzcbtVarZza2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    h.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        strArr2[i11] = jSONArray.getString(i11);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    h.g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzccfVar.zzA(numValueOf.intValue());
            }
            zzcbtVarZza2.zzE(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = zzccfVar.getContext();
            zzcbtVarZza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzccfVar.zzu();
            this.zza = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                zzcbtVarZza2.zzn();
                return;
            } else {
                h.g("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            h.g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcbtVarZza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            h.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
