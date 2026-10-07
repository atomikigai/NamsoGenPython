package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajq extends zzajn {
    private final OutputStream zzg;

    public zzajq(OutputStream outputStream, int i) {
        super(i);
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzJ(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzK(int i, boolean z4) throws IOException {
        zzH(11);
        zzf(i << 3);
        zzc(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzL(int i, zzajf zzajfVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzajfVar.zzd());
        zzajfVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs, com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final void zza(byte[] bArr, int i, int i10) throws IOException {
        zzp(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzh(int i, int i10) throws IOException {
        zzH(14);
        zzf((i << 3) | 5);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzi(int i) throws IOException {
        zzH(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzj(int i, long j4) throws IOException {
        zzH(18);
        zzf((i << 3) | 1);
        zze(j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzk(long j4) throws IOException {
        zzH(8);
        zze(j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzl(int i, int i10) throws IOException {
        zzH(20);
        zzf(i << 3);
        if (i10 >= 0) {
            zzf(i10);
        } else {
            zzg(i10);
        }
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
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            System.arraycopy(bArr, 0, this.zza, i12, i10);
            this.zzc += i10;
            this.zzd += i10;
            return;
        }
        System.arraycopy(bArr, 0, this.zza, i12, i13);
        this.zzc = this.zzb;
        this.zzd += i13;
        zzG();
        int i14 = i10 - i13;
        if (i14 <= this.zzb) {
            System.arraycopy(bArr, i13, this.zza, 0, i14);
            this.zzc = i14;
        } else {
            this.zzg.write(bArr, i13, i14);
        }
        this.zzd += i14;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzq(int i, int i10) throws IOException {
        zzs((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzr(int i, int i10) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzs(int i) throws IOException {
        zzH(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzt(int i, long j4) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzg(j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajs
    public final void zzu(long j4) throws IOException {
        zzH(10);
        zzg(j4);
    }

    public final void zzv(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzA = zzajs.zzA(length);
            int i = iZzA + length;
            int i10 = this.zzb;
            if (i > i10) {
                byte[] bArr = new byte[length];
                int iZzb = zzank.zzb(str, bArr, 0, length);
                zzs(iZzb);
                zzp(bArr, 0, iZzb);
                return;
            }
            if (i > i10 - this.zzc) {
                zzG();
            }
            int iZzA2 = zzajs.zzA(str.length());
            int i11 = this.zzc;
            try {
                if (iZzA2 == iZzA) {
                    int i12 = i11 + iZzA2;
                    this.zzc = i12;
                    int iZzb2 = zzank.zzb(str, this.zza, i12, this.zzb - i12);
                    this.zzc = i11;
                    iZzc = (iZzb2 - i11) - iZzA2;
                    zzf(iZzc);
                    this.zzc = iZzb2;
                } else {
                    iZzc = zzank.zzc(str);
                    zzf(iZzc);
                    this.zzc = zzank.zzb(str, this.zza, this.zzc, iZzc);
                }
                this.zzd += iZzc;
            } catch (zzanj e) {
                this.zzd -= this.zzc - i11;
                this.zzc = i11;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new zzajp(e4);
            }
        } catch (zzanj e10) {
            zzE(str, e10);
        }
    }
}
