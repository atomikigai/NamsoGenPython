package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrv implements zzsl {
    private final zzfxg zza;
    private final zzfxg zzb;
    private boolean zzc;

    public zzrv(int i) {
        zzrt zzrtVar = new zzrt(i);
        zzru zzruVar = new zzru(i);
        this.zza = zzrtVar;
        this.zzb = zzruVar;
        this.zzc = true;
    }

    public static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzrx.zzt(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    public static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzrx.zzt(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:4:0x001a, B:6:0x0020, B:10:0x002b, B:15:0x0037, B:18:0x0051, B:17:0x0040), top: B:40:0x001a }] */
    public final zzrx zzc(zzsk zzskVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzso zzsbVar;
        int i;
        String str = zzskVar.zza.zza;
        zzrx zzrxVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.zzc) {
                    zzad zzadVar = zzskVar.zzc;
                    int i10 = zzen.zza;
                    if (i10 >= 34 && (i10 >= 35 || zzbg.zzi(zzadVar.zzo))) {
                        zzsbVar = new zzto(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        zzsbVar = new zzsb(mediaCodecCreateByCodecName, zzb(((zzru) this.zzb).zza));
                        i = 0;
                    }
                } else {
                    zzsbVar = new zzsb(mediaCodecCreateByCodecName, zzb(((zzru) this.zzb).zza));
                    i = 0;
                }
                zzso zzsoVar = zzsbVar;
                int i11 = i;
                zzrx zzrxVar2 = new zzrx(mediaCodecCreateByCodecName, zza(((zzrt) this.zza).zza), zzsoVar, zzskVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzskVar.zzd;
                    if (surface == null && zzskVar.zza.zzh && zzen.zza >= 35) {
                        i11 |= 8;
                    }
                    zzrx.zzh(zzrxVar2, zzskVar.zzb, surface, null, i11);
                    return zzrxVar2;
                } catch (Exception e) {
                    exc = e;
                    zzrxVar = zzrxVar2;
                    if (zzrxVar != null) {
                        zzrxVar.zzm();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e4) {
                exc = e4;
            }
        } catch (Exception e10) {
            exc = e10;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final /* bridge */ /* synthetic */ zzsn zzd(zzsk zzskVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z4) {
        this.zzc = true;
    }
}
