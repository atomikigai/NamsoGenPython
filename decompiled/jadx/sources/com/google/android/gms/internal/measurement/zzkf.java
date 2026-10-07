package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkf extends zzki {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzkf(byte[] bArr, int i, int i10) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b10;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i10)), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i, boolean z4) throws IOException {
        zzq(i << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i, zzka zzkaVar) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i, int i10) throws IOException {
        zzq((i << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            int i11 = i10 + 1;
            this.zze = i11;
            bArr[i10] = (byte) (i & 255);
            int i12 = i10 + 2;
            this.zze = i12;
            bArr[i11] = (byte) ((i >> 8) & 255);
            int i13 = i10 + 3;
            this.zze = i13;
            bArr[i12] = (byte) ((i >> 16) & 255);
            this.zze = i10 + 4;
            bArr[i13] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i, long j4) throws IOException {
        zzq((i << 3) | 1);
        zzi(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j4) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            int i10 = i + 1;
            this.zze = i10;
            bArr[i] = (byte) (((int) j4) & 255);
            int i11 = i + 2;
            this.zze = i11;
            bArr[i10] = (byte) (((int) (j4 >> 8)) & 255);
            int i12 = i + 3;
            this.zze = i12;
            bArr[i11] = (byte) (((int) (j4 >> 16)) & 255);
            int i13 = i + 4;
            this.zze = i13;
            bArr[i12] = (byte) (((int) (j4 >> 24)) & 255);
            int i14 = i + 5;
            this.zze = i14;
            bArr[i13] = (byte) (((int) (j4 >> 32)) & 255);
            int i15 = i + 6;
            this.zze = i15;
            bArr[i14] = (byte) (((int) (j4 >> 40)) & 255);
            int i16 = i + 7;
            this.zze = i16;
            bArr[i15] = (byte) (((int) (j4 >> 48)) & 255);
            this.zze = i + 8;
            bArr[i16] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i, int i10) throws IOException {
        zzq(i << 3);
        zzk(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i = this.zze;
        try {
            int iZzx = zzki.zzx(str.length() * 3);
            int iZzx2 = zzki.zzx(str.length());
            if (iZzx2 != iZzx) {
                zzq(zznz.zzc(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zznz.zzb(str, bArr, i10, this.zzd - i10);
                return;
            }
            int i11 = i + iZzx2;
            this.zze = i11;
            int iZzb = zznz.zzb(str, this.zzc, i11, this.zzd - i11);
            this.zze = i;
            zzq((iZzb - i) - iZzx2);
            this.zze = iZzb;
        } catch (zzny e) {
            this.zze = i;
            zzB(str, e);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzkg(e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i, int i10) throws IOException {
        zzq((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i, int i10) throws IOException {
        zzq(i << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr2 = this.zzc;
        int i11 = this.zze;
        this.zze = i11 + 1;
        bArr2[i11] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i, long j4) throws IOException {
        zzq(i << 3);
        zzs(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j4) throws IOException {
        if (zzki.zzd && this.zzd - this.zze >= 10) {
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i = this.zze;
                this.zze = i + 1;
                zznu.zzn(bArr, i, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i10 = this.zze;
            this.zze = i10 + 1;
            zznu.zzn(bArr2, i10, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr3[i11] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr4 = this.zzc;
        int i12 = this.zze;
        this.zze = i12 + 1;
        bArr4[i12] = (byte) j4;
    }
}
