package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbjx implements zzbjr {
    private final Context zza;
    private final Map zzb;

    public zzbjx(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        p pVar = p.C;
        if (pVar.f2998y.zzp(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        pVar.f2998y.zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
                        return;
                    }
                } else if (str.equals("_ac")) {
                    pVar.f2998y.zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
                    return;
                }
            } else if (str.equals("_aa")) {
                pVar.f2998y.zzh(this.zza, str2);
                return;
            }
            h.d("logScionEvent gmsg contained unsupported eventName");
        }
    }
}
