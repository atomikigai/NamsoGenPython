package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import r.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzsd extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzsm zzo;
    private final Object zza = new Object();
    private final g zzd = new g();
    private final g zze = new g();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzsd(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzsd zzsdVar) {
        synchronized (zzsdVar.zza) {
            try {
                if (zzsdVar.zzm) {
                    return;
                }
                long j4 = zzsdVar.zzl - 1;
                zzsdVar.zzl = j4;
                if (j4 > 0) {
                    return;
                }
                if (j4 >= 0) {
                    zzsdVar.zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzsdVar.zza) {
                    zzsdVar.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzi(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        g gVar = this.zzd;
        gVar.f8090c = gVar.f8089b;
        g gVar2 = this.zze;
        gVar2.f8090c = gVar2.f8089b;
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    private final boolean zzl() {
        return this.zzl > 0 || this.zzm;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            try {
                this.zzd.a(i);
                zzsm zzsmVar = this.zzo;
                if (zzsmVar != null) {
                    zzsy zzsyVar = ((zzsv) zzsmVar).zza;
                    if (zzsyVar.zzo != null) {
                        zzsyVar.zzo.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzi(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i);
                this.zzf.add(bufferInfo);
                zzsm zzsmVar = this.zzo;
                if (zzsmVar != null) {
                    zzsy zzsyVar = ((zzsv) zzsmVar).zza;
                    if (zzsyVar.zzo != null) {
                        zzsyVar.zzo.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            try {
                zzk();
                int i = -1;
                if (zzl()) {
                    return -1;
                }
                g gVar = this.zzd;
                int i10 = gVar.f8089b;
                int i11 = gVar.f8090c;
                if (!(i10 == i11)) {
                    if (i10 == i11) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = gVar.f8088a[i10];
                    gVar.f8089b = (i10 + 1) & gVar.f8091d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzk();
                if (zzl()) {
                    return -1;
                }
                g gVar = this.zze;
                int i = gVar.f8089b;
                int i10 = gVar.f8090c;
                if (i == i10) {
                    return -1;
                }
                if (i == i10) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i11 = gVar.f8088a[i];
                gVar.f8089b = (i + 1) & gVar.f8091d;
                if (i11 >= 0) {
                    zzdb.zzb(this.zzh);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i11 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i11 = -2;
                }
                return i11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            int i = zzen.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsc
                @Override // java.lang.Runnable
                public final void run() {
                    zzsd.zzd(this.zza);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzdb.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzsm zzsmVar) {
        synchronized (this.zza) {
            this.zzo = zzsmVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}
