package com.google.android.gms.internal.ads;

import d6.b;
import i6.h;
import java.util.Collections;
import java.util.Map;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbjy implements zzbjr {
    static final Map zza;
    private final b zzb;
    private final zzbse zzc;
    private final zzbsl zzd;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        e eVar = new e(7);
        for (int i = 0; i < 7; i++) {
            eVar.put(strArr[i], numArr[i]);
        }
        zza = Collections.unmodifiableMap(eVar);
    }

    public zzbjy(b bVar, zzbse zzbseVar, zzbsl zzbslVar) {
        this.zzb = bVar;
        this.zzc = zzbseVar;
        this.zzd = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                b bVar = this.zzb;
                if (!bVar.b()) {
                    bVar.a(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zzb(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbsh(zzcfkVar, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbsb(zzcfkVar, map).zzc();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (iIntValue != 7) {
                        h.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z4 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcfkVar == null) {
            h.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z4 ? -1 : 14;
        }
        zzcfkVar.zzau(i);
    }
}
