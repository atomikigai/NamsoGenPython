package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsu extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzsq zzc;
    public final String zzd;

    public zzsu(zzad zzadVar, Throwable th, boolean z4, int i) {
        this("Decoder init failed: [" + i + "], " + zzadVar.toString(), th, zzadVar.zzo, false, null, v.f(Math.abs(i), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"), null);
    }

    public static /* bridge */ /* synthetic */ zzsu zza(zzsu zzsuVar, zzsu zzsuVar2) {
        return new zzsu(zzsuVar.getMessage(), zzsuVar.getCause(), zzsuVar.zza, false, zzsuVar.zzc, zzsuVar.zzd, zzsuVar2);
    }

    public zzsu(zzad zzadVar, Throwable th, boolean z4, zzsq zzsqVar) {
        this(v.j("Decoder init failed: ", zzsqVar.zza, ", ", zzadVar.toString()), th, zzadVar.zzo, false, zzsqVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzsu(String str, Throwable th, String str2, boolean z4, zzsq zzsqVar, String str3, zzsu zzsuVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsqVar;
        this.zzd = str3;
    }
}
