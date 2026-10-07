package com.google.android.gms.internal.ads;

import d6.p;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbje implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfwa.zzc("true", str) && !zzfwa.zzc("false", str)) {
                return;
            }
            zzfti.zza(zzcfkVar.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e) {
            p.C.f2982g.zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
