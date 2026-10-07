package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzht implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzhv zza;
    private final Handler zzb;

    public zzht(zzhv zzhvVar, Handler handler) {
        this.zza = zzhvVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhs
            @Override // java.lang.Runnable
            public final void run() {
                zzhv.zzc(this.zza.zza, i);
            }
        });
    }
}
