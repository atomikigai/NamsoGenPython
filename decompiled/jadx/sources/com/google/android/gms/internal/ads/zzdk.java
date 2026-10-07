package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdk {
    public static void zza(boolean z4, String str) throws zzdj {
        if (!z4) {
            throw new zzdj(str);
        }
    }

    public static boolean zzb(Context context) {
        int i = zzen.zza;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(zzen.zzc) || "XT1650".equals(zzen.zzd))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzd("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
