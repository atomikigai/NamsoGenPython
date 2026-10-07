package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzgxx extends zzgyc {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzgxx(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b10) {
        int i = this.zzc;
        this.zzc = i + 1;
        this.zza[i] = b10;
        this.zzd++;
    }

    public final void zzd(int i) {
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        byte[] bArr = this.zza;
        bArr[i10] = (byte) (i & 255);
        int i12 = i10 + 2;
        this.zzc = i12;
        bArr[i11] = (byte) ((i >> 8) & 255);
        int i13 = i10 + 3;
        this.zzc = i13;
        bArr[i12] = (byte) ((i >> 16) & 255);
        this.zzc = i10 + 4;
        bArr[i13] = (byte) ((i >> 24) & 255);
        this.zzd += 4;
    }

    public final void zze(long j4) {
        int i = this.zzc;
        int i10 = i + 1;
        this.zzc = i10;
        byte[] bArr = this.zza;
        bArr[i] = (byte) (j4 & 255);
        int i11 = i + 2;
        this.zzc = i11;
        bArr[i10] = (byte) ((j4 >> 8) & 255);
        int i12 = i + 3;
        this.zzc = i12;
        bArr[i11] = (byte) ((j4 >> 16) & 255);
        int i13 = i + 4;
        this.zzc = i13;
        bArr[i12] = (byte) (255 & (j4 >> 24));
        int i14 = i + 5;
        this.zzc = i14;
        bArr[i13] = (byte) (((int) (j4 >> 32)) & 255);
        int i15 = i + 6;
        this.zzc = i15;
        bArr[i14] = (byte) (((int) (j4 >> 40)) & 255);
        int i16 = i + 7;
        this.zzc = i16;
        bArr[i15] = (byte) (((int) (j4 >> 48)) & 255);
        this.zzc = i + 8;
        bArr[i16] = (byte) (((int) (j4 >> 56)) & 255);
        this.zzd += 8;
    }

    public final void zzf(int i) {
        if (!zzgyc.zzb) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr[i10] = (byte) ((i | 128) & 255);
                this.zzd++;
                i >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            bArr2[i11] = (byte) i;
            this.zzd++;
            return;
        }
        long j4 = this.zzc;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzhbu.zzq(bArr3, i12, (byte) ((i | 128) & 255));
            i >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        zzhbu.zzq(bArr4, i13, (byte) i);
        this.zzd += (int) (((long) this.zzc) - j4);
    }

    public final void zzg(long j4) {
        if (zzgyc.zzb) {
            long j10 = this.zzc;
            while (true) {
                int i = (int) j4;
                if ((j4 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzhbu.zzq(bArr, i10, (byte) i);
                    this.zzd += (int) (((long) this.zzc) - j10);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzhbu.zzq(bArr2, i11, (byte) ((i | 128) & 255));
                j4 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j4;
                if ((j4 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i13 = this.zzc;
                    this.zzc = i13 + 1;
                    bArr3[i13] = (byte) i12;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i14 = this.zzc;
                this.zzc = i14 + 1;
                bArr4[i14] = (byte) ((i12 | 128) & 255);
                this.zzd++;
                j4 >>>= 7;
            }
        }
    }
}
