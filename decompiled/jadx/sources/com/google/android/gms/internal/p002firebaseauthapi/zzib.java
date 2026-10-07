package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzib {
    int[] zza;
    private final int zzb;

    public zzib(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhx.zzd(bArr);
        this.zzb = i;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i);

    public final ByteBuffer zzc(byte[] bArr, int i) {
        int[] iArrZzb = zzb(zzhx.zzd(bArr), i);
        int[] iArr = (int[]) iArrZzb.clone();
        zzhx.zzc(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            iArrZzb[i10] = iArrZzb[i10] + iArr[i10];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(v.f(zza(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining / 64;
        for (int i10 = 0; i10 < i + 1; i10++) {
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i10);
            if (i10 == i) {
                zzyf.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                zzyf.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
