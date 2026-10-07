package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsk {
    public final zzsq zza;
    public final MediaFormat zzb;
    public final zzad zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzsj zzf;

    private zzsk(zzsq zzsqVar, MediaFormat mediaFormat, zzad zzadVar, Surface surface, MediaCrypto mediaCrypto, zzsj zzsjVar) {
        this.zza = zzsqVar;
        this.zzb = mediaFormat;
        this.zzc = zzadVar;
        this.zzd = surface;
        this.zzf = zzsjVar;
    }

    public static zzsk zza(zzsq zzsqVar, MediaFormat mediaFormat, zzad zzadVar, MediaCrypto mediaCrypto, zzsj zzsjVar) {
        return new zzsk(zzsqVar, mediaFormat, zzadVar, null, null, zzsjVar);
    }

    public static zzsk zzb(zzsq zzsqVar, MediaFormat mediaFormat, zzad zzadVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzsk(zzsqVar, mediaFormat, zzadVar, surface, null, null);
    }
}
