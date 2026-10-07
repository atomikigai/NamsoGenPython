package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import d6.p;
import e6.t;
import h6.n0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcme implements zzclr {
    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkb)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((n0) p.C.f2982g.zzi()).d(Boolean.parseBoolean(str));
    }
}
