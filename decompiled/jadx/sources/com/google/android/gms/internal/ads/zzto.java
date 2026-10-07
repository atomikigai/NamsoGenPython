package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzto implements zzso {
    private final MediaCodec zza;

    public zzto(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzd(int i, int i10, int i11, long j4, int i12) {
        this.zza.queueInputBuffer(i, 0, i11, j4, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zze(int i, int i10, zzhj zzhjVar, long j4, int i11) {
        this.zza.queueSecureInputBuffer(i, 0, zzhjVar.zza(), j4, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzh() {
    }
}
