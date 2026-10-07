package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzrx implements zzsn {
    private final MediaCodec zza;
    private final zzsd zzb;
    private final zzso zzc;
    private final zzsj zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzrx(MediaCodec mediaCodec, HandlerThread handlerThread, zzso zzsoVar, zzsj zzsjVar, zzrw zzrwVar) {
        this.zza = mediaCodec;
        this.zzb = new zzsd(handlerThread);
        this.zzc = zzsoVar;
        this.zzd = zzsjVar;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzrx zzrxVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzsj zzsjVar;
        zzrxVar.zzb.zzf(zzrxVar.zza);
        Trace.beginSection("configureCodec");
        zzrxVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        zzrxVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zzrxVar.zza.start();
        Trace.endSection();
        if (zzen.zza >= 35 && (zzsjVar = zzrxVar.zzd) != null) {
            zzsjVar.zza(zzrxVar.zza);
        }
        zzrxVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzj() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzk(int i, int i10, int i11, long j4, int i12) {
        this.zzc.zzd(i, 0, i11, j4, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzl(int i, int i10, zzhj zzhjVar, long j4, int i11) {
        this.zzc.zze(i, 0, zzhjVar, j4, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzm() {
        zzsj zzsjVar;
        zzsj zzsjVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzg();
                    this.zzb.zzh();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    int i = zzen.zza;
                    if (i >= 30 && i < 33) {
                        this.zza.stop();
                    }
                    if (i >= 35 && (zzsjVar2 = this.zzd) != null) {
                        zzsjVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (Throwable th) {
            if (zzen.zza >= 35 && (zzsjVar = this.zzd) != null) {
                zzsjVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzn(int i, long j4) {
        this.zza.releaseOutputBuffer(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzo(int i, boolean z4) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzq(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final boolean zzs(zzsm zzsmVar) {
        this.zzb.zzg(zzsmVar);
        return true;
    }
}
