package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import d6.p;
import e6.t;
import h6.b;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepz implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzepz(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzeqa zzc() throws Exception {
        int iE;
        int streamMaxVolume;
        boolean z4;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkF)).booleanValue()) {
            iE = p.C.e.e(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iE = -1;
            streamMaxVolume = -1;
        }
        int ringerMode = audioManager.getRingerMode();
        int streamVolume2 = audioManager.getStreamVolume(2);
        p pVar = p.C;
        float fA = pVar.h.a();
        b bVar = pVar.h;
        synchronized (bVar) {
            z4 = bVar.f4971a;
        }
        return new zzeqa(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iE, streamMaxVolume, ringerMode, streamVolume2, fA, z4);
    }
}
