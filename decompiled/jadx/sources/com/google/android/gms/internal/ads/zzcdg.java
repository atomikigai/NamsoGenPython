package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import d6.p;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdg implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzccf zzccfVar = (zzccf) obj;
        zzcgm zzcgmVarZzq = zzccfVar.zzq();
        if (zzcgmVarZzq == null) {
            try {
                zzcgm zzcgmVar = new zzcgm(zzccfVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzccfVar.zzC(zzcgmVar);
                zzcgmVarZzq = zzcgmVar;
            } catch (NullPointerException e) {
                e = e;
                Throwable th = e;
                h.e("Unable to parse videoMeta message.", th);
                p.C.f2982g.zzw(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e4) {
                e = e4;
                Throwable th2 = e;
                h.e("Unable to parse videoMeta message.", th2);
                p.C.f2982g.zzw(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        if (i < 0 || i > 3) {
            i = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (h.j(3)) {
            h.b("Video Meta GMSG: currentTime : " + f11 + " , duration : " + f10 + " , isMuted : " + zEquals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzcgmVarZzq.zzc(f11, f10, i, zEquals, f12);
    }
}
