package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzjn {
    public static zzoj zza(Context context, zzjv zzjvVar, boolean z4, String str) {
        zzof zzofVarZzb = zzof.zzb(context);
        if (zzofVarZzb == null) {
            zzdt.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzoj(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z4) {
            zzjvVar.zzy(zzofVarZzb);
        }
        return new zzoj(zzofVarZzb.zza(), str);
    }
}
