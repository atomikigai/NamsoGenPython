package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaop implements zzaoo {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaop(FileChannel fileChannel, long j4, long j10) {
        this.zza = fileChannel;
        this.zzb = j4;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(MessageDigest[] messageDigestArr, long j4, int i) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j4, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
