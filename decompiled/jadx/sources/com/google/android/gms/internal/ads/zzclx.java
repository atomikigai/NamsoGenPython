package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzclx implements zzclr {
    private final zzdvk zza;

    public zzclx(zzdvk zzdvkVar) {
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                this.zza.zzm(zzdvg.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.zza.zzm(zzdvg.FLICK);
            return;
        }
        this.zza.zzm(zzdvg.NONE);
    }
}
