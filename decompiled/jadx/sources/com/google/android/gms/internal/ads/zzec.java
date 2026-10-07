package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzec {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzec(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    private final void zzq() {
        int i;
        int i10 = this.zzb;
        boolean z4 = false;
        if (i10 >= 0 && (i10 < (i = this.zzd) || (i10 == i && this.zzc == 0))) {
            z4 = true;
        }
        zzdb.zzf(z4);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        zzdb.zzf(this.zzc == 0);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i) {
        int i10;
        if (i == 0) {
            return 0;
        }
        this.zzc += i;
        int i11 = 0;
        while (true) {
            i10 = this.zzc;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.zzc = i12;
            byte[] bArr = this.zza;
            int i13 = this.zzb;
            this.zzb = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.zza;
        int i14 = this.zzb;
        int i15 = i11 | ((bArr2[i14] & 255) >> (8 - i10));
        int i16 = 32 - i;
        if (i10 == 8) {
            this.zzc = 0;
            this.zzb = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        zzq();
        return i17;
    }

    public final long zze(int i) {
        if (i <= 32) {
            int iZzd = zzd(i);
            int i10 = zzen.zza;
            return 4294967295L & ((long) iZzd);
        }
        int iZzd2 = zzd(i - 32);
        int iZzd3 = zzd(32);
        int i11 = zzen.zza;
        return (4294967295L & ((long) iZzd3)) | ((((long) iZzd2) & 4294967295L) << 32);
    }

    public final void zzf() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzg(int i, int i10) {
        int iMin = Math.min(8 - this.zzc, 14);
        int i11 = this.zzc;
        int i12 = (8 - i11) - iMin;
        byte[] bArr = this.zza;
        int i13 = this.zzb;
        byte b10 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr[i13]);
        bArr[i13] = b10;
        int i14 = 14 - iMin;
        int i15 = i & 16383;
        bArr[i13] = (byte) (b10 | ((i15 >>> i14) << i12));
        int i16 = i13 + 1;
        while (i14 > 8) {
            i14 -= 8;
            this.zza[i16] = (byte) (i15 >>> i14);
            i16++;
        }
        int i17 = 8 - i14;
        byte[] bArr2 = this.zza;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i15 & ((1 << i14) - 1)) << i17) | b11);
        zzn(14);
        zzq();
    }

    public final void zzh(byte[] bArr, int i, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i13 = this.zzb;
            int i14 = i13 + 1;
            this.zzb = i14;
            byte b10 = bArr2[i13];
            int i15 = this.zzc;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((bArr2[i14] & 255) >> (8 - i15)) | b11);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.zzc;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.zza;
            int i18 = this.zzb;
            this.zzb = i18 + 1;
            b12 = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b12;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.zzc = i19;
        byte[] bArr4 = this.zza;
        int i20 = this.zzb;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b12);
        if (i19 == 8) {
            this.zzc = 0;
            this.zzb = i20 + 1;
        }
        zzq();
    }

    public final void zzi(byte[] bArr, int i, int i10) {
        zzdb.zzf(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i10);
        this.zzb += i10;
        zzq();
    }

    public final void zzj(zzed zzedVar) {
        zzk(zzedVar.zzN(), zzedVar.zze());
        zzl(zzedVar.zzd() * 8);
    }

    public final void zzk(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i;
    }

    public final void zzl(int i) {
        int i10 = i / 8;
        this.zzb = i10;
        this.zzc = i - (i10 * 8);
        zzq();
    }

    public final void zzm() {
        int i = this.zzc + 1;
        this.zzc = i;
        if (i == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzn(int i) {
        int i10 = i / 8;
        int i11 = this.zzb + i10;
        this.zzb = i11;
        int i12 = (i - (i10 * 8)) + this.zzc;
        this.zzc = i12;
        if (i12 > 7) {
            this.zzb = i11 + 1;
            this.zzc = i12 - 8;
        }
        zzq();
    }

    public final void zzo(int i) {
        zzdb.zzf(this.zzc == 0);
        this.zzb += i;
        zzq();
    }

    public final boolean zzp() {
        int i = this.zza[this.zzb] & (128 >> this.zzc);
        zzm();
        return i != 0;
    }

    public zzec() {
        this.zza = zzen.zzf;
    }
}
