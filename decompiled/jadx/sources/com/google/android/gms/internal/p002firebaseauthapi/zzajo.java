package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajo extends zzajs {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzajo(byte[] bArr, int i, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzJ(byte b10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b10;
        } catch (IndexOutOfBoundsException e) {
            throw new zzajp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzK(int i, boolean z4) throws IOException {
        zzs(i << 3);
        zzJ(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzL(int i, zzajf zzajfVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzajfVar.zzd());
        zzajfVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs, com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final void zza(byte[] bArr, int i, int i10) throws IOException {
        zze(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i10);
            this.zzc += i10;
        } catch (IndexOutOfBoundsException e) {
            throw new zzajp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i10)), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzh(int i, int i10) throws IOException {
        zzs((i << 3) | 5);
        zzi(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
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
            throw new zzajp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzj(int i, long j4) throws IOException {
        zzs((i << 3) | 1);
        zzk(j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
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
            throw new zzajp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzl(int i, int i10) throws IOException {
        zzs(i << 3);
        zzm(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzn(int i, zzalp zzalpVar, zzamb zzambVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(((zzaip) zzalpVar).zzn(zzambVar));
        zzambVar.zzm(zzalpVar, this.zze);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzA = zzajs.zzA(str.length() * 3);
            int iZzA2 = zzajs.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzank.zzc(str));
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = zzank.zzb(str, bArr, i10, this.zzb - i10);
                return;
            }
            int i11 = i + iZzA2;
            this.zzc = i11;
            int iZzb = zzank.zzb(str, this.zza, i11, this.zzb - i11);
            this.zzc = i;
            zzs((iZzb - i) - iZzA2);
            this.zzc = iZzb;
        } catch (zzanj e) {
            this.zzc = i;
            zzE(str, e);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzajp(e4);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzq(int i, int i10) throws IOException {
        zzs((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzr(int i, int i10) throws IOException {
        zzs(i << 3);
        zzs(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzs(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr[i10] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzajp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
            }
        }
        byte[] bArr2 = this.zza;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        bArr2[i11] = (byte) i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzt(int i, long j4) throws IOException {
        zzs(i << 3);
        zzu(j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzu(long j4) throws IOException {
        if (!zzajs.zzb || this.zzb - this.zzc < 10) {
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i = this.zzc;
                    this.zzc = i + 1;
                    bArr[i] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzajp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
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
                zzanf.zzn(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzanf.zzn(bArr4, i13, (byte) ((i11 & 127) | 128));
            j4 >>>= 7;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzI() {
    }
}
