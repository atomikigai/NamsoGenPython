package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfoq {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfop(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfom.zza() != zzfnc.CTV) {
            return 2;
        }
        return zza;
    }
}
