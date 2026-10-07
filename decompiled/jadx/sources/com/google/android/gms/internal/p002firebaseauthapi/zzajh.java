package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajh extends zzajl {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzajh(byte[] bArr, int i, int i10, boolean z4, zzajg zzajgVar) {
        super(null);
        this.zzj = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i10;
        this.zzh = 0;
    }

    private final void zzI() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i10 = this.zzj;
        if (i <= i10) {
            this.zzg = 0;
            return;
        }
        int i11 = i - i10;
        this.zzg = i11;
        this.zzf = i - i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final void zzA(int i) {
        this.zzj = i;
        zzI();
    }

    public final void zzB(int i) throws IOException {
        if (i >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i <= i10 - i11) {
                this.zzh = i11 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzaks.zzj();
        }
        throw zzaks.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final boolean zzE(int i) throws IOException {
        int iZzm;
        int i10 = i & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw zzaks.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzaks.zze();
            return true;
        }
        if (i10 == 1) {
            zzB(8);
            return true;
        }
        if (i10 == 2) {
            zzB(zzj());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzaks.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws IOException {
        int i = this.zzh;
        if (i == this.zzf) {
            throw zzaks.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zze(int i) throws zzaks {
        if (i < 0) {
            throw zzaks.zzf();
        }
        int i10 = i + this.zzh;
        if (i10 < 0) {
            throw zzaks.zzg();
        }
        int i11 = this.zzj;
        if (i10 > i11) {
            throw zzaks.zzj();
        }
        this.zzj = i10;
        zzI();
        return i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw zzaks.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 4;
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() throws IOException {
        int i;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzh = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i19;
                            }
                            i = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzh = i13;
                return i;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzl() throws IOException {
        return zzajl.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzaks.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw zzaks.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 8;
        long j4 = bArr[i];
        long j10 = (((long) bArr[i + 1]) & 255) << 8;
        long j11 = bArr[i + 2];
        long j12 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j4 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j4;
        long j10;
        int i = this.zzh;
        int i10 = this.zzf;
        if (i10 != i) {
            byte[] bArr = this.zze;
            int i11 = i + 1;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                this.zzh = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j4 = i13 ^ (-128);
                } else {
                    int i14 = i + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j4 = i15 ^ 16256;
                    } else {
                        int i16 = i + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j4 = j11;
                        } else {
                            i14 = i + 5;
                            long j12 = (((long) bArr[i16]) << 28) ^ ((long) i17);
                            if (j12 >= 0) {
                                j4 = j12 ^ 266354560;
                            } else {
                                i12 = i + 6;
                                long j13 = (((long) bArr[i14]) << 35) ^ j12;
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    int i18 = i + 7;
                                    long j14 = j13 ^ (((long) bArr[i12]) << 42);
                                    if (j14 >= 0) {
                                        j4 = j14 ^ 4363953127296L;
                                    } else {
                                        i12 = i + 8;
                                        j13 = j14 ^ (((long) bArr[i18]) << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i18 = i + 9;
                                            long j15 = (j13 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                i12 = i + 10;
                                                if (bArr[i18] >= 0) {
                                                    j4 = j15;
                                                }
                                            } else {
                                                j4 = j15;
                                            }
                                        }
                                    }
                                    i12 = i18;
                                }
                                j4 = j13 ^ j10;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.zzh = i12;
                return j4;
            }
        }
        return zzs();
    }

    public final long zzs() throws IOException {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZza = zza();
            j4 |= ((long) (bZza & 127)) << i;
            if ((bZza & 128) == 0) {
                return j4;
            }
        }
        throw zzaks.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final long zzu() throws IOException {
        return zzajl.zzG(zzr());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final zzajf zzw() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i - i10) {
                zzajf zzajfVarZzn = zzajf.zzn(this.zze, i10, iZzj);
                this.zzh += iZzj;
                return zzajfVarZzn;
            }
        }
        if (iZzj == 0) {
            return zzajf.zzb;
        }
        if (iZzj > 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (iZzj <= i11 - i12) {
                int i13 = iZzj + i12;
                this.zzh = i13;
                return new zzajc(Arrays.copyOfRange(this.zze, i12, i13));
            }
        }
        if (iZzj <= 0) {
            throw zzaks.zzf();
        }
        throw zzaks.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i - i10) {
                String str = new String(this.zze, i10, iZzj, zzakq.zzb);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzaks.zzf();
        }
        throw zzaks.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i - i10) {
                String strZzd = zzank.zzd(this.zze, i10, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzaks.zzf();
        }
        throw zzaks.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajl
    public final void zzz(int i) throws zzaks {
        if (this.zzi != i) {
            throw zzaks.zzb();
        }
    }
}
