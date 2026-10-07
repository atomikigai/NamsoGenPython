package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzsp extends zzhk {
    public final String zza;
    public final int zzb;

    public zzsp(Throwable th, zzsq zzsqVar) {
        super("Decoder failed: ".concat(String.valueOf(zzsqVar == null ? null : zzsqVar.zza)), th);
        boolean z4 = th instanceof MediaCodec.CodecException;
        String diagnosticInfo = z4 ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.zza = diagnosticInfo;
        this.zzb = zzen.zza >= 23 ? z4 ? ((MediaCodec.CodecException) th).getErrorCode() : 0 : zzen.zzm(diagnosticInfo);
    }
}
