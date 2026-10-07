package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import i6.h;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcds implements zzbjr {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            h.g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcdr zzcduVar;
        int i;
        zzccf zzccfVar = (zzccf) obj;
        if (h.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            h.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcdk<zzcdj> zzcdkVar = p.C.A;
        if (map.containsKey("abort")) {
            if (zzcdkVar.zzd(zzccfVar)) {
                return;
            }
            h.g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcce zzcceVar = new zzcce((String) map.get("flags"));
        boolean z4 = zzcceVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcdj zzcdjVarZza = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            strArr2[i10] = jSONArray.getString(i10);
                        } catch (JSONException unused) {
                            h.g("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i] = str;
            }
            if (z4) {
                for (zzcdj zzcdjVar : zzcdkVar) {
                    if (zzcdjVar.zza == zzccfVar && str.equals(zzcdjVar.zze())) {
                        zzcdjVarZza = zzcdjVar;
                        break;
                    }
                }
            } else {
                zzcdjVarZza = zzcdkVar.zza(zzccfVar);
            }
            if (zzcdjVarZza != null) {
                h.g("Precache task is already running.");
                return;
            }
            if (zzccfVar.zzj() == null) {
                h.g("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = Integer.valueOf(i);
            }
            if (numZzb != null) {
                zzccfVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzccfVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzccfVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcdc zzcdcVar = zzccfVar.zzj().f2925b;
            if (iIntValue > 0) {
                int i11 = zzcceVar.zzg;
                int iZzu = zzcbw.zzu();
                if (iZzu < i11) {
                    zzcduVar = new zzcea(zzccfVar, zzcceVar);
                } else {
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzn)).booleanValue()) {
                        iZzu = zzcdx.zzi();
                    }
                    zzcduVar = iZzu < zzcceVar.zzb ? new zzcdx(zzccfVar, zzcceVar) : new zzcdv(zzccfVar);
                }
            } else {
                zzcduVar = new zzcdu(zzccfVar);
            }
            new zzcdj(zzccfVar, zzcduVar, str, strArr).zzb();
        } else {
            zzcdj zzcdjVarZza2 = zzcdkVar.zza(zzccfVar);
            if (zzcdjVarZza2 == null) {
                h.g("Precache must specify a source.");
                return;
            }
            zzcduVar = zzcdjVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcduVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcduVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcduVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcduVar.zzq(numZzb8.intValue());
        }
    }
}
