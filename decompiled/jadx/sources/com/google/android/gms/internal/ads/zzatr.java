package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzatr {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzatr(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zza[i] = (byte) i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            byte b10 = bArr2[i11];
            i10 = (i10 + b10 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b10;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i = this.zzb;
        int i10 = this.zzc;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            i = (i + 1) & 255;
            byte b10 = bArr2[i];
            i10 = (i10 + b10) & 255;
            bArr2[i] = bArr2[i10];
            bArr2[i10] = b10;
            bArr[i11] = (byte) (bArr2[(bArr2[i] + b10) & 255] ^ bArr[i11]);
        }
        this.zzb = i;
        this.zzc = i10;
    }
}
