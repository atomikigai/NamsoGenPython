package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdb {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzarf zzarfVar;
        zzare zzareVar;
        long j4 = this.zza;
        if (j4 > 0) {
            return j4;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzara(new zzcda(byteBufferDuplicate), zzcde.zzb).zzd().iterator();
            while (true) {
                zzarfVar = null;
                if (!it.hasNext()) {
                    zzareVar = null;
                    break;
                }
                zzarc zzarcVar = (zzarc) it.next();
                if (zzarcVar instanceof zzare) {
                    zzareVar = (zzare) zzarcVar;
                    break;
                }
            }
            for (zzarc zzarcVar2 : zzareVar.zzd()) {
                if (zzarcVar2 instanceof zzarf) {
                    zzarfVar = (zzarf) zzarcVar2;
                    break;
                }
            }
            long jZzc = (zzarfVar.zzc() * 1000) / zzarfVar.zzd();
            this.zza = jZzc;
            return jZzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
