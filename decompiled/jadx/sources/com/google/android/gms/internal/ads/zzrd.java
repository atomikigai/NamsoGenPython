package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrd {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcm.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j4, int i, int i10, boolean z4) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z4 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j4);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgcu.zza(i10));
    }

    public final void zza(zzhm zzhmVar, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i;
        ByteBuffer byteBuffer2 = zzhmVar.zzc;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzhmVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzhmVar.zzc;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i10 = iLimit - iPosition;
        int i11 = (i10 + 255) / 255;
        int i12 = i11 + 27 + i10;
        if (this.zzd == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i12 += length + 44;
        } else {
            length = 0;
        }
        if (this.zzc.capacity() < i12) {
            this.zzc = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer4 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i = 22;
                zzc(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(zzgcu.zza(length2));
                byteBuffer.put(bArr);
                int i13 = length2 + 28;
                byteBuffer.putInt(22, zzen.zzf(byteBuffer.array(), byteBuffer.arrayOffset(), i13, 0));
                byteBuffer.position(i13);
            } else {
                byteBuffer = byteBuffer4;
                i = 22;
                byteBuffer.put(zza);
            }
            byteBuffer.put(zzb);
        } else {
            byteBuffer = byteBuffer4;
            i = 22;
        }
        int iZzc = this.zze + zzadm.zzc(byteBuffer3);
        this.zze = iZzc;
        int i14 = i;
        ByteBuffer byteBuffer5 = byteBuffer;
        zzc(byteBuffer5, iZzc, this.zzd, i11, false);
        for (int i15 = 0; i15 < i11; i15++) {
            if (i10 >= 255) {
                byteBuffer5.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer5.put((byte) i10);
                i10 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.zzd == 2) {
            byteBuffer5.putInt(length + 66, zzen.zzf(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i14, zzen.zzf(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer5;
        zzhmVar.zzb();
        zzhmVar.zzj(this.zzc.remaining());
        zzhmVar.zzc.put(this.zzc);
        zzhmVar.zzk();
    }

    public final void zzb() {
        this.zzc = zzcm.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
