package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgxy extends zzgyc {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgxy(byte[] bArr, int i, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzL(byte b10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b10;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzM(int i, boolean z4) throws IOException {
        zzu(i << 3);
        zzL(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzN(int i, zzgxp zzgxpVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzgxpVar.zzd());
        zzgxpVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc, com.google.android.gms.internal.ads.zzgxg
    public final void zza(byte[] bArr, int i, int i10) throws IOException {
        zze(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i10) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i10);
            this.zzc += i10;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i10)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzh(int i, int i10) throws IOException {
        zzu((i << 3) | 5);
        zzi(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzi(int i) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            bArr[i10] = (byte) (i & 255);
            int i12 = i10 + 2;
            this.zzc = i12;
            bArr[i11] = (byte) ((i >> 8) & 255);
            int i13 = i10 + 3;
            this.zzc = i13;
            bArr[i12] = (byte) ((i >> 16) & 255);
            this.zzc = i10 + 4;
            bArr[i13] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzj(int i, long j4) throws IOException {
        zzu((i << 3) | 1);
        zzk(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzk(long j4) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            int i10 = i + 1;
            this.zzc = i10;
            bArr[i] = (byte) (((int) j4) & 255);
            int i11 = i + 2;
            this.zzc = i11;
            bArr[i10] = (byte) (((int) (j4 >> 8)) & 255);
            int i12 = i + 3;
            this.zzc = i12;
            bArr[i11] = (byte) (((int) (j4 >> 16)) & 255);
            int i13 = i + 4;
            this.zzc = i13;
            bArr[i12] = (byte) (((int) (j4 >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzl(int i, int i10) throws IOException {
        zzu(i << 3);
        zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzn(int i, zzhai zzhaiVar, zzhbb zzhbbVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(((zzgwy) zzhaiVar).zzaM(zzhbbVar));
        zzhbbVar.zzj(zzhaiVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzo(int i, zzhai zzhaiVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzhaiVar.zzaY());
        zzhaiVar.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzp(int i, zzgxp zzgxpVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzN(3, zzgxpVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzD = zzgyc.zzD(str.length() * 3);
            int iZzD2 = zzgyc.zzD(str.length());
            if (iZzD2 != iZzD) {
                zzu(zzhbz.zze(str));
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = zzhbz.zzd(str, bArr, i10, this.zzb - i10);
                return;
            }
            int i11 = i + iZzD2;
            this.zzc = i11;
            int iZzd = zzhbz.zzd(str, this.zza, i11, this.zzb - i11);
            this.zzc = i;
            zzu((iZzd - i) - iZzD2);
            this.zzc = iZzd;
        } catch (zzhby e) {
            this.zzc = i;
            zzG(str, e);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgxz(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzs(int i, int i10) throws IOException {
        zzu((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzt(int i, int i10) throws IOException {
        zzu(i << 3);
        zzu(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzu(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr[i10] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
            }
        }
        byte[] bArr2 = this.zza;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        bArr2[i11] = (byte) i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzv(int i, long j4) throws IOException {
        zzu(i << 3);
        zzw(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzw(long j4) throws IOException {
        if (!zzgyc.zzb || this.zzb - this.zzc < 10) {
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i = this.zzc;
                    this.zzc = i + 1;
                    bArr[i] = (byte) ((((int) j4) | 128) & 255);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
                }
            }
            byte[] bArr2 = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr2[i10] = (byte) j4;
            return;
        }
        while (true) {
            int i11 = (int) j4;
            if ((j4 & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzhbu.zzq(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzhbu.zzq(bArr4, i13, (byte) ((i11 | 128) & 255));
            j4 >>>= 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzK() {
    }
}
