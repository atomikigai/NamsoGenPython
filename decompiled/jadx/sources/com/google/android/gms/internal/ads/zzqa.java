package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzqa {
    public static zzoz zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z4) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return zzoz.zza;
        }
        zzox zzoxVar = new zzox();
        zzoxVar.zza(true);
        zzoxVar.zzc(z4);
        return zzoxVar.zzd();
    }
}
