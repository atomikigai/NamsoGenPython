package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import d6.p;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbik implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        String str = (String) map.get("action");
        if (!"tick".equals(str)) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    h.g("No value given for CSI experiment.");
                    return;
                } else {
                    zzcfkVar.zzm().zza().zzd("e", str2);
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    h.g("No value given for CSI extra.");
                    return;
                } else if (TextUtils.isEmpty(str3)) {
                    h.g("No name given for CSI extra.");
                    return;
                } else {
                    zzcfkVar.zzm().zza().zzd(str3, str4);
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            h.g("No label given for CSI tick.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            h.g("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j4 = Long.parseLong(str7);
            p pVar = p.C;
            pVar.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            pVar.f2983j.getClass();
            long jElapsedRealtime = (j4 - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            zzcfkVar.zzm().zzc(str5, str6, jElapsedRealtime);
        } catch (NumberFormatException e) {
            h.h("Malformed timestamp for CSI tick.", e);
        }
    }
}
