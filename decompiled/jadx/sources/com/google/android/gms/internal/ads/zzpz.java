package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzpz extends zzcn {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzj = zzj(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferZzj.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzi(zzck zzckVar) throws zzcl {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzck.zza;
        }
        if (zzckVar.zzd != 2) {
            throw new zzcl("Unhandled input format:", zzckVar);
        }
        boolean z4 = zzckVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z4 ? new zzck(zzckVar.zzb, length, 2) : zzck.zza;
            }
            int i10 = iArr[i];
            if (i10 >= zzckVar.zzc) {
                throw new zzcl("Unhandled input format:", zzckVar);
            }
            z4 |= i10 != i;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
