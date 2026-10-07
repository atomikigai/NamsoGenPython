package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import d6.p;
import h6.k0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbiz implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            k0.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfve zzfveVarZzl = zzfvf.zzl();
        zzfveVarZzl.zzb((String) map.get("appId"));
        zzfveVarZzl.zzh(zzcfkVar.getWidth());
        zzfveVarZzl.zzg(zzcfkVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzfveVarZzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzfveVarZzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzfveVarZzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzfveVarZzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzfveVarZzl.zza((String) map.get("enifd"));
        }
        try {
            p.C.f2991r.f(zzcfkVar, zzfveVarZzl.zzi());
        } catch (NullPointerException e) {
            p.C.f2982g.zzw(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            k0.k("Missing parameters for LMD Overlay show request");
        }
    }
}
