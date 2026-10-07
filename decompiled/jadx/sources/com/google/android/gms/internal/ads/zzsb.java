package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzsb implements zzso {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdf zzg;
    private boolean zzh;

    public zzsb(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdf zzdfVar = new zzdf(zzdc.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdfVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* bridge */ /* synthetic */ void zza(zzsb zzsbVar, Message message) {
        zzsa zzsaVar;
        ArrayDeque arrayDeque;
        int i = message.what;
        zzsa zzsaVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzsaVar = (zzsa) message.obj;
                int i10 = zzsaVar.zza;
                MediaCodec.CryptoInfo cryptoInfo = zzsaVar.zzd;
                long j4 = zzsaVar.zze;
                int i11 = zzsaVar.zzf;
                try {
                    synchronized (zzb) {
                        zzsbVar.zzc.queueSecureInputBuffer(i10, 0, cryptoInfo, j4, i11);
                    }
                } catch (RuntimeException e) {
                    zzry.zza(zzsbVar.zzf, null, e);
                }
            } else if (i == 3) {
                zzsbVar.zzg.zze();
            } else if (i != 4) {
                zzry.zza(zzsbVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    zzsbVar.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e4) {
                    zzry.zza(zzsbVar.zzf, null, e4);
                }
            }
            if (zzsaVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzsaVar2);
                }
            }
        }
        zzsaVar = (zzsa) message.obj;
        try {
            zzsbVar.zzc.queueInputBuffer(zzsaVar.zza, 0, zzsaVar.zzc, zzsaVar.zze, zzsaVar.zzf);
        } catch (RuntimeException e10) {
            zzry.zza(zzsbVar.zzf, null, e10);
        }
        zzsaVar2 = zzsaVar;
        if (zzsaVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzsaVar2);
            }
        }
    }

    private static zzsa zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzsa();
                }
                return (zzsa) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzd(int i, int i10, int i11, long j4, int i12) {
        zzc();
        zzsa zzsaVarZzi = zzi();
        zzsaVarZzi.zza(i, 0, i11, j4, i12);
        Handler handler = this.zze;
        int i13 = zzen.zza;
        handler.obtainMessage(1, zzsaVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zze(int i, int i10, zzhj zzhjVar, long j4, int i11) {
        zzc();
        zzsa zzsaVarZzi = zzi();
        zzsaVarZzi.zza(i, 0, 0, j4, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzsaVarZzi.zzd;
        cryptoInfo.numSubSamples = zzhjVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzhjVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzhjVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzj = zzj(zzhjVar.zzb, cryptoInfo.key);
        bArrZzj.getClass();
        cryptoInfo.key = bArrZzj;
        byte[] bArrZzj2 = zzj(zzhjVar.zza, cryptoInfo.iv);
        bArrZzj2.getClass();
        cryptoInfo.iv = bArrZzj2;
        cryptoInfo.mode = zzhjVar.zzc;
        if (zzen.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhjVar.zzg, zzhjVar.zzh));
        }
        this.zze.obtainMessage(2, zzsaVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i = zzen.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzrz(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
