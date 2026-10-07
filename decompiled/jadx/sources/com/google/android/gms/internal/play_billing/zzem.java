package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzem extends zzep {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzem(byte[] bArr, int i, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a.i(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzb(byte b10) throws IOException {
        int i = this.zze;
        try {
            int i10 = i + 1;
            try {
                this.zzc[i] = b10;
                this.zze = i10;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i10;
                throw new zzen(i, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    public final void zzc(byte[] bArr, int i, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(this.zze, this.zzd, i10, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzd(int i, boolean z4) throws IOException {
        zzv(i << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zze(int i, zzei zzeiVar) throws IOException {
        zzv((i << 3) | 2);
        zzf(zzeiVar);
    }

    public final void zzf(zzei zzeiVar) throws IOException {
        zzv(zzeiVar.zzd());
        zzeiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzg(int i, int i10) throws IOException {
        zzv((i << 3) | 5);
        zzh(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzh(int i) throws IOException {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) i;
            bArr[i10 + 1] = (byte) (i >> 8);
            bArr[i10 + 2] = (byte) (i >> 16);
            bArr[i10 + 3] = (byte) (i >> 24);
            this.zze = i10 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(i10, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzi(int i, long j4) throws IOException {
        zzv((i << 3) | 1);
        zzj(j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzj(long j4) throws IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j4;
            bArr[i + 1] = (byte) (j4 >> 8);
            bArr[i + 2] = (byte) (j4 >> 16);
            bArr[i + 3] = (byte) (j4 >> 24);
            bArr[i + 4] = (byte) (j4 >> 32);
            bArr[i + 5] = (byte) (j4 >> 40);
            bArr[i + 6] = (byte) (j4 >> 48);
            bArr[i + 7] = (byte) (j4 >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(i, this.zzd, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzk(int i, int i10) throws IOException {
        zzv(i << 3);
        zzl(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzl(int i) throws IOException {
        if (i >= 0) {
            zzv(i);
        } else {
            zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzm(byte[] bArr, int i, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzn(int i, zzgl zzglVar, zzgv zzgvVar) throws IOException {
        zzv((i << 3) | 2);
        zzv(((zzds) zzglVar).zze(zzgvVar));
        zzgvVar.zzi(zzglVar, this.zza);
    }

    public final void zzo(zzgl zzglVar) throws IOException {
        zzv(zzglVar.zzj());
        zzglVar.zzL(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzp(int i, zzgl zzglVar) throws IOException {
        zzv(11);
        zzu(2, i);
        zzv(26);
        zzo(zzglVar);
        zzv(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzq(int i, zzei zzeiVar) throws IOException {
        zzv(11);
        zzu(2, i);
        zze(3, zzeiVar);
        zzv(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzr(int i, String str) throws IOException {
        zzv((i << 3) | 2);
        zzs(str);
    }

    public final void zzs(String str) throws IOException {
        int i = this.zze;
        try {
            int iZzC = zzep.zzC(str.length() * 3);
            int iZzC2 = zzep.zzC(str.length());
            if (iZzC2 != iZzC) {
                zzv(zzhr.zzc(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zzhr.zzb(str, bArr, i10, this.zzd - i10);
                return;
            }
            int i11 = i + iZzC2;
            this.zze = i11;
            int iZzb = zzhr.zzb(str, this.zzc, i11, this.zzd - i11);
            this.zze = i;
            zzv((iZzb - i) - iZzC2);
            this.zze = iZzb;
        } catch (zzhq e) {
            this.zze = i;
            zzF(str, e);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzen(e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzt(int i, int i10) throws IOException {
        zzv((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzu(int i, int i10) throws IOException {
        zzv(i << 3);
        zzv(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzv(int i) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.zzc[i11] = (byte) (i | 128);
                    i >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i11 = i10;
                    throw new zzen(i11, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                throw new zzen(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.zzc[i11] = (byte) i;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzw(int i, long j4) throws IOException {
        zzv(i << 3);
        zzx(j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzx(long j4) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.zze;
        if (!zzep.zzd || this.zzd - i10 < 10) {
            int i11 = i10;
            while ((j4 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zzc[i11] = (byte) (((int) j4) | 128);
                        j4 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i11 = i12;
                        throw new zzen(i11, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e4) {
                    indexOutOfBoundsException = e4;
                }
            }
            i = i11 + 1;
            try {
                this.zzc[i11] = (byte) j4;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i11 = i;
                throw new zzen(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j4 & (-128)) != 0) {
                zzho.zzn(this.zzc, i10, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i10++;
            }
            i = i10 + 1;
            zzho.zzn(this.zzc, i10, (byte) j4);
        }
        this.zze = i;
    }
}
