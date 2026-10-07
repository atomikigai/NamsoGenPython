package com.google.android.gms.internal.ads;

import android.util.Pair;
import da.v;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaow {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairZzf = zzf(randomAccessFile, 0);
        return pairZzf != null ? pairZzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j4) {
        zzg(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j4 < 0 || j4 > 4294967295L) {
            throw new IllegalArgumentException(v.g("uint32 value of out range: ", j4));
        }
        byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j4);
    }

    private static long zze(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i10;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzg(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i11 = iCapacity - 22;
            int iMin = Math.min(i11, 65535);
            int i12 = 0;
            while (true) {
                if (i12 >= iMin) {
                    i10 = -1;
                    break;
                }
                i10 = i11 - i12;
                if (byteBufferAllocate.getInt(i10) == 101010256 && ((char) byteBufferAllocate.getShort(i10 + 20)) == i12) {
                    break;
                }
                i12++;
            }
        } else {
            i10 = -1;
            break;
        }
        if (i10 == -1) {
            return null;
        }
        byteBufferAllocate.position(i10);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i10)));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
