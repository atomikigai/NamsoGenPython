package com.google.android.gms.internal.ads;

import android.content.Context;
import b3.b;
import com.google.android.gms.common.api.internal.h0;
import d6.p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbiy implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        h0 h0Var = p.C.f2991r;
        Context context = zzcfkVar.getContext();
        synchronized (h0Var) {
            h0Var.f2117d = zzcfkVar;
            if (!h0Var.g(context)) {
                h0Var.e("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("action", "fetch_completed");
            zzcaj.zze.execute(new b(h0Var, "on_play_store_bind", map2, 4, false));
        }
    }
}
