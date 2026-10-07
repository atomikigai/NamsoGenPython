package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbix implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcfk zzcfkVar = (zzcfk) obj;
        zzbfm zzbfmVarZzK = zzcfkVar.zzK();
        if (zzbfmVarZzK == null || (jSONObjectZzb = zzbfmVarZzK.zzb()) == null) {
            zzcfkVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcfkVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
