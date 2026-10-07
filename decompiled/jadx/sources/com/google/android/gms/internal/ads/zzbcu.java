package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbcu {
    public static boolean zza(zzbdc zzbdcVar, zzbcz zzbczVar, String... strArr) {
        if (zzbczVar == null) {
            return false;
        }
        p.C.f2983j.getClass();
        zzbdcVar.zze(zzbczVar, SystemClock.elapsedRealtime(), strArr);
        return true;
    }
}
