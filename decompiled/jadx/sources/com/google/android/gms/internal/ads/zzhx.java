package com.google.android.gms.internal.ads;

import java.util.Locale;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhx {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i = this.zza;
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        int i13 = this.zze;
        int i14 = this.zzf;
        int i15 = this.zzg;
        int i16 = this.zzh;
        int i17 = this.zzi;
        int i18 = this.zzj;
        long j4 = this.zzk;
        int i19 = this.zzl;
        Locale locale = Locale.US;
        StringBuilder sbD = b.d(i, i10, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        sbD.append(i11);
        sbD.append("\n skippedInputBuffers=");
        sbD.append(i12);
        sbD.append("\n renderedOutputBuffers=");
        sbD.append(i13);
        sbD.append("\n skippedOutputBuffers=");
        sbD.append(i14);
        sbD.append("\n droppedBuffers=");
        sbD.append(i15);
        sbD.append("\n droppedInputBuffers=");
        sbD.append(i16);
        sbD.append("\n maxConsecutiveDroppedBuffers=");
        sbD.append(i17);
        sbD.append("\n droppedToKeyframeEvents=");
        sbD.append(i18);
        sbD.append("\n totalVideoFrameProcessingOffsetUs=");
        sbD.append(j4);
        sbD.append("\n videoFrameProcessingOffsetCount=");
        sbD.append(i19);
        sbD.append("\n}");
        return sbD.toString();
    }

    public final synchronized void zza() {
    }
}
