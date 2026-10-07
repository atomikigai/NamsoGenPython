package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzra implements zzpr {
    final /* synthetic */ zzrc zza;

    public /* synthetic */ zzra(zzrc zzrcVar, zzrb zzrbVar) {
        this.zza = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zza(Exception exc) {
        zzdt.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }
}
