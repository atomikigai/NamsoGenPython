package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbjo implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (map.keySet().contains("start")) {
            zzcfkVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzcfkVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzcfkVar.zzN().zzk();
        }
    }
}
