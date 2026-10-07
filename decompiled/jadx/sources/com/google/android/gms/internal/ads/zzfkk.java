package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e6.t;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfkk {
    public static void zza(m9.a aVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        zzg(aVar, zzfklVar, zzfkaVar, false);
    }

    public static void zzb(m9.a aVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        zzg(aVar, zzfklVar, zzfkaVar, true);
    }

    public static void zzc(m9.a aVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzgei.zzr(zzgdz.zzu(aVar), new zzfkj(zzfklVar, zzfkaVar), zzcaj.zzf);
        }
    }

    public static void zzd(m9.a aVar, zzfka zzfkaVar) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzgei.zzr(zzgdz.zzu(aVar), new zzfkh(zzfkaVar), zzcaj.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) t.f3437d.f3440c.zza(zzbcn.zzit), str);
    }

    public static int zzf(zzffo zzffoVar) {
        int iO = android.support.v4.media.session.a.O(zzffoVar) - 1;
        return (iO == 0 || iO == 1) ? 7 : 23;
    }

    private static void zzg(m9.a aVar, zzfkl zzfklVar, zzfka zzfkaVar, boolean z4) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzgei.zzr(zzgdz.zzu(aVar), new zzfki(zzfklVar, zzfkaVar, z4), zzcaj.zzf);
        }
    }
}
