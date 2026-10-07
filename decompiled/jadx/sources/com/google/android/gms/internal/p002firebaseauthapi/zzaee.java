package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import g7.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaee {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iD = f.f4241b.d(context, 12451000);
            boolean z4 = true;
            if (iD != 0 && iD != 2) {
                z4 = false;
            }
            zza = Boolean.valueOf(z4);
        }
        return zza.booleanValue();
    }
}
