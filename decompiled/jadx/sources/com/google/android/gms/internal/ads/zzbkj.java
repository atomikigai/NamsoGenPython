package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbkj implements zzbjr {
    private final zzbki zza;

    public zzbkj(zzbki zzbkiVar) {
        this.zza = zzbkiVar;
    }

    public static void zzb(zzcfk zzcfkVar, zzbki zzbkiVar) {
        zzcfkVar.zzag("/reward", new zzbkj(zzbkiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbwv zzbwvVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbwvVar = new zzbwv(str2, i);
            }
        } catch (NumberFormatException e) {
            h.h("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbwvVar);
    }
}
