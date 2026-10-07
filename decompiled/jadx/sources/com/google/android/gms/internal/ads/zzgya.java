package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgya extends zzgxx {
    private final OutputStream zzg;

    public zzgya(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzJ(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzK() throws IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzL(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzM(int i, boolean z4) throws IOException {
        zzJ(11);
        zzf(i << 3);
        zzc(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzN(int i, zzgxp zzgxpVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzgxpVar.zzd());
        zzgxpVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc, com.google.android.gms.internal.ads.zzgxg
    public final void zza(byte[] bArr, int i, int i10) throws IOException {
        zzr(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzh(int i, int i10) throws IOException {
        zzJ(14);
        zzf((i << 3) | 5);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzi(int i) throws IOException {
        zzJ(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzj(int i, long j4) throws IOException {
        zzJ(18);
        zzf((i << 3) | 1);
        zze(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzk(long j4) throws IOException {
        zzJ(8);
        zze(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzl(int i, int i10) throws IOException {
        zzJ(20);
        zzf(i << 3);
        if (i10 >= 0) {
            zzf(i10);
        } else {
            zzg(i10);
        }
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
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            System.arraycopy(bArr, i, this.zza, i12, i10);
            this.zzc += i10;
            this.zzd += i10;
            return;
        }
        System.arraycopy(bArr, i, this.zza, i12, i13);
        int i14 = i + i13;
        this.zzc = this.zzb;
        this.zzd += i13;
        zzI();
        int i15 = i10 - i13;
        if (i15 <= this.zzb) {
            System.arraycopy(bArr, i14, this.zza, 0, i15);
            this.zzc = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzd += i15;
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzs(int i, int i10) throws IOException {
        zzu((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzt(int i, int i10) throws IOException {
        zzJ(20);
        zzf(i << 3);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzu(int i) throws IOException {
        zzJ(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzv(int i, long j4) throws IOException {
        zzJ(20);
        zzf(i << 3);
        zzg(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzw(long j4) throws IOException {
        zzJ(10);
        zzg(j4);
    }

    public final void zzx(String str) throws IOException {
        int iZze;
        try {
            int length = str.length() * 3;
            int iZzD = zzgyc.zzD(length);
            int i = iZzD + length;
            int i10 = this.zzb;
            if (i > i10) {
                byte[] bArr = new byte[length];
                int iZzd = zzhbz.zzd(str, bArr, 0, length);
                zzu(iZzd);
                zzr(bArr, 0, iZzd);
                return;
            }
            if (i > i10 - this.zzc) {
                zzI();
            }
            int iZzD2 = zzgyc.zzD(str.length());
            int i11 = this.zzc;
            try {
                if (iZzD2 == iZzD) {
                    int i12 = i11 + iZzD2;
                    this.zzc = i12;
                    int iZzd2 = zzhbz.zzd(str, this.zza, i12, this.zzb - i12);
                    this.zzc = i11;
                    iZze = (iZzd2 - i11) - iZzD2;
                    zzf(iZze);
                    this.zzc = iZzd2;
                } else {
                    iZze = zzhbz.zze(str);
                    zzf(iZze);
                    this.zzc = zzhbz.zzd(str, this.zza, this.zzc, iZze);
                }
                this.zzd += iZze;
            } catch (zzhby e) {
                this.zzd -= this.zzc - i11;
                this.zzc = i11;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new zzgxz(e4);
            }
        } catch (zzhby e10) {
            zzG(str, e10);
        }
    }
}
