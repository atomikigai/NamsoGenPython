package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadm {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b10 = byteBuffer.get(26);
            int i10 = 28;
            int i11 = 28;
            for (int i12 = 0; i12 < b10; i12++) {
                i11 += byteBuffer.get(i12 + 27);
            }
            byte b11 = byteBuffer.get(i11 + 26);
            for (int i13 = 0; i13 < b11; i13++) {
                i10 += byteBuffer.get(i11 + 27 + i13);
            }
            i = i11 + i10;
        }
        int i14 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((zzg(byteBuffer.get(i14), byteBuffer.limit() - i14 > 1 ? byteBuffer.get(i14 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zze(byte[] bArr) {
        long jZza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(jZza)));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j4, long j10) {
        return j4 - j10 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b10, byte b11) {
        int i;
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i = 2;
            if (i12 != 1 && i12 != 2) {
                i = b11 & 63;
            }
        } else {
            i = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = 2500 << i14;
        } else if (i13 >= 12) {
            i10 = 10000 << (i13 & 1);
        } else {
            i10 = i14 == 3 ? 60000 : 10000 << i14;
        }
        return ((long) i) * ((long) i10);
    }

    private static long zzh(long j4) {
        return (j4 * 1000000000) / 48000;
    }

    private static byte[] zzi(long j4) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j4).array();
    }
}
