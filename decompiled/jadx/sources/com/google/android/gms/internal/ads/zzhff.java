package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzhff extends zzhfi implements zzarc {
    protected final String zza = "moov";

    public zzhff(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzb(zzhfj zzhfjVar, ByteBuffer byteBuffer, long j4, zzaqz zzaqzVar) throws IOException {
        zzhfjVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhfjVar;
        this.zze = zzhfjVar.zzb();
        zzhfjVar.zze(zzhfjVar.zzb() + j4);
        this.zzf = zzhfjVar.zzb();
        this.zzb = zzaqzVar;
    }
}
