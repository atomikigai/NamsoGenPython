package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsf implements zzsl {
    private final Context zza;

    @Deprecated
    public zzsf() {
        this.zza = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzsl
    public final zzsn zzd(zzsk zzskVar) throws Throwable {
        Context context;
        int i = zzen.zza;
        if (i >= 23 && (i >= 31 || ((context = this.zza) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iZzb = zzbg.zzb(zzskVar.zzc.zzo);
            zzdt.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzen.zzD(iZzb)));
            zzrv zzrvVar = new zzrv(iZzb);
            zzrvVar.zze(true);
            return zzrvVar.zzc(zzskVar);
        }
        MediaCodec mediaCodec = null;
        try {
            String str = zzskVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzskVar.zzd;
                int i10 = 0;
                if (surface == null && zzskVar.zza.zzh && i >= 35) {
                    i10 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzskVar.zzb, surface, (MediaCrypto) null, i10);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zztn(mediaCodecCreateByCodecName, zzskVar.zzf, null);
            } catch (IOException e) {
                e = e;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (RuntimeException e11) {
            e = e11;
        }
    }

    public zzsf(Context context) {
        this.zza = context;
    }
}
