package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import g7.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaf {
    public static final zzaf zza = new zzaf();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final f zzc = f.f4241b;

    private zzaf() {
    }

    public static final String zza(Context context) {
        int iC = zzc.c(context);
        return (iC == 1 || iC == 3 || iC == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }
}
