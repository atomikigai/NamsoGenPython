package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.s;
import h6.k0;
import i6.d;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfgl {
    public static void zza(Context context, boolean z4) {
        if (z4) {
            h.f("This request is sent from a test device.");
            return;
        }
        d dVar = s.f3427f.f3428a;
        h.f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + d.p(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        h.f("Ad failed to load : " + i);
        k0.l(str, th);
        if (i == 3) {
            return;
        }
        p.C.f2982g.zzv(th, str);
    }
}
