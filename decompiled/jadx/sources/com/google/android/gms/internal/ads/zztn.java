package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zztn implements zzsn {
    private final MediaCodec zza;
    private final zzsj zzb;

    public /* synthetic */ zztn(MediaCodec mediaCodec, zzsj zzsjVar, zztm zztmVar) {
        this.zza = mediaCodec;
        this.zzb = zzsjVar;
        if (zzen.zza < 35 || zzsjVar == null) {
            return;
        }
        zzsjVar.zza(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
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
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzk(int i, int i10, int i11, long j4, int i12) {
        this.zza.queueInputBuffer(i, 0, i11, j4, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzl(int i, int i10, zzhj zzhjVar, long j4, int i11) {
        this.zza.queueSecureInputBuffer(i, 0, zzhjVar.zza(), j4, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzm() {
        zzsj zzsjVar;
        try {
            int i = zzen.zza;
            if (i >= 30 && i < 33) {
                this.zza.stop();
            }
            if (i >= 35 && this.zzb != null) {
            }
        } finally {
            if (zzen.zza >= 35 && (zzsjVar = this.zzb) != null) {
                zzsjVar.zzc(this.zza);
            }
            this.zza.release();
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
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final /* synthetic */ boolean zzs(zzsm zzsmVar) {
        return false;
    }
}
