package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzsn {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i);

    ByteBuffer zzg(int i);

    void zzi();

    void zzj();

    void zzk(int i, int i10, int i11, long j4, int i12);

    void zzl(int i, int i10, zzhj zzhjVar, long j4, int i11);

    void zzm();

    void zzn(int i, long j4);

    void zzo(int i, boolean z4);

    void zzp(Surface surface);

    void zzq(Bundle bundle);

    void zzr(int i);

    boolean zzs(zzsm zzsmVar);
}
