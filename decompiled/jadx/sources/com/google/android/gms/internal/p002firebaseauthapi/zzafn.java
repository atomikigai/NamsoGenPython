package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import r.e;
import v9.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafn {
    private static final Map zza = new e(0);

    public static v zza(String str, v vVar, zzaez zzaezVar) {
        zze(str, zzaezVar);
        return new zzafl(vVar, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, v vVar, Activity activity, Executor executor) {
        Map map = zza;
        if (!map.containsKey(str)) {
            zze(str, null);
            return false;
        }
        zzafm zzafmVar = (zzafm) map.get(str);
        if (System.currentTimeMillis() - zzafmVar.zzb >= 120000) {
            zze(str, null);
            return false;
        }
        zzaez zzaezVar = zzafmVar.zza;
        if (zzaezVar == null) {
            return true;
        }
        zzaezVar.zzh(vVar, activity, executor, str);
        return true;
    }

    private static void zze(String str, zzaez zzaezVar) {
        zza.put(str, new zzafm(zzaezVar, System.currentTimeMillis()));
    }
}
