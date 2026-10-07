package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgxs extends zzgxv {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgxs(InputStream inputStream, int i, zzgxu zzgxuVar) {
        super(null);
        this.zzl = f.API_PRIORITY_OTHER;
        byte[] bArr = zzgzk.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.zze.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i11;
                i10 += i11;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i10 = this.zzk + i;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i - i12;
    }

    private final void zzK(int i) throws IOException {
        if (zzL(i)) {
            return;
        }
        if (i <= (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzL(int i) throws IOException {
        int i10 = this.zzi;
        int i11 = i10 + i;
        int i12 = this.zzg;
        if (i11 <= i12) {
            throw new IllegalStateException(q1.a.j(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.zzk;
        if (i > (f.API_PRIORITY_OTHER - i13) - i10 || i13 + i10 + i > this.zzl) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.zzk + i10;
            this.zzk = i13;
            i12 = this.zzg - i10;
            this.zzg = i12;
            this.zzi = 0;
        }
        try {
            int i14 = this.zze.read(this.zzf, i12, Math.min(4096 - i12, (f.API_PRIORITY_OTHER - i13) - i12));
            if (i14 == 0 || i14 < -1 || i14 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i14 + "\nThe InputStream implementation is buggy.");
            }
            if (i14 <= 0) {
                return false;
            }
            this.zzg += i14;
            zzJ();
            if (this.zzg >= i) {
                return true;
            }
            return zzL(i);
        } catch (zzgzm e) {
            e.zza();
            throw e;
        }
    }

    private final byte[] zzM(int i, boolean z4) throws IOException {
        byte[] bArrZzN = zzN(i);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(i - i12);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i) throws IOException {
        if (i == 0) {
            return zzgzk.zzb;
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i;
        if ((-2147483647) + i12 > 0) {
            throw new zzgzm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            zzC((i13 - i10) - i11);
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.zzg - i11;
        int i15 = i - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.zze.available()) {
                    return null;
                }
            } catch (zzgzm e) {
                e.zza();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i14 < i) {
            try {
                int i16 = this.zze.read(bArr, i14, i - i14);
                if (i16 == -1) {
                    throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i16;
                i14 += i16;
            } catch (zzgzm e4) {
                e4.zza();
                throw e4;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    public final void zzC(int i) throws IOException {
        int i10 = this.zzg;
        int i11 = this.zzi;
        int i12 = i10 - i11;
        if (i <= i12 && i >= 0) {
            this.zzi = i11 + i;
            return;
        }
        if (i < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.zzk;
        int i14 = i13 + i11;
        int i15 = this.zzl;
        if (i14 + i > i15) {
            zzC((i15 - i13) - i11);
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i14;
        this.zzg = 0;
        this.zzi = 0;
        while (i12 < i) {
            try {
                long j4 = i - i12;
                try {
                    long jSkip = this.zze.skip(j4);
                    if (jSkip < 0 || jSkip > j4) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (zzgzm e) {
                    e.zza();
                    throw e;
                }
            } catch (Throwable th) {
                this.zzk += i12;
                zzJ();
                throw th;
            }
        }
        this.zzk += i12;
        zzJ();
        if (i12 >= i) {
            return;
        }
        int i16 = this.zzg;
        int i17 = i16 - this.zzi;
        this.zzi = i16;
        zzK(1);
        while (true) {
            int i18 = i - i17;
            int i19 = this.zzg;
            if (i18 <= i19) {
                this.zzi = i18;
                return;
            } else {
                i17 += i19;
                this.zzi = i19;
                zzK(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzd(int i) throws zzgzm {
        if (i < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.zzk + this.zzi + i;
        if (i10 < 0) {
            throw new zzgzm("Failed to parse the message.");
        }
        int i11 = this.zzl;
        if (i10 > i11) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i10;
        zzJ();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zze() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzf() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzK(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzi() throws IOException {
        int i;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
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
                this.zzi = i13;
                return i;
            }
        }
        return (int) zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzj() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzk() throws IOException {
        return zzgxv.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int iZzi = zzi();
        this.zzj = iZzi;
        if ((iZzi >>> 3) != 0) {
            return iZzi;
        }
        throw new zzgzm("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzm() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzn() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzK(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        long j4 = bArr[i];
        long j10 = (((long) bArr[i + 1]) & 255) << 8;
        long j11 = bArr[i + 2];
        long j12 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j4 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long zzq() throws IOException {
        long j4;
        long j10;
        int i = this.zzi;
        int i10 = this.zzg;
        if (i10 != i) {
            byte[] bArr = this.zzf;
            int i11 = i + 1;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                this.zzi = i11;
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
                this.zzi = i12;
                return j4;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.zzi == this.zzg) {
                zzK(1);
            }
            byte[] bArr = this.zzf;
            int i10 = this.zzi;
            this.zzi = i10 + 1;
            byte b10 = bArr[i10];
            j4 |= ((long) (b10 & 127)) << i;
            if ((b10 & 128) == 0) {
                return j4;
            }
        }
        throw new zzgzm("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzs() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzt() throws IOException {
        return zzgxv.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzu() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final zzgxp zzv() throws IOException {
        int iZzi = zzi();
        int i = this.zzg;
        int i10 = this.zzi;
        if (iZzi <= i - i10 && iZzi > 0) {
            zzgxp zzgxpVarZzv = zzgxp.zzv(this.zzf, i10, iZzi);
            this.zzi += iZzi;
            return zzgxpVarZzv;
        }
        if (iZzi == 0) {
            return zzgxp.zzb;
        }
        if (iZzi < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzN = zzN(iZzi);
        if (bArrZzN != null) {
            return zzgxp.zzv(bArrZzN, 0, bArrZzN.length);
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(iZzi - i13);
        byte[] bArr = new byte[iZzi];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return new zzgxm(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzw() throws IOException {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i = this.zzg;
            int i10 = this.zzi;
            if (iZzi <= i - i10) {
                String str = new String(this.zzf, i10, iZzi, zzgzk.zza);
                this.zzi += iZzi;
                return str;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzi > this.zzg) {
            return new String(zzM(iZzi, false), zzgzk.zza);
        }
        zzK(iZzi);
        String str2 = new String(this.zzf, this.zzi, iZzi, zzgzk.zza);
        this.zzi += iZzi;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzx() throws IOException {
        byte[] bArrZzM;
        int iZzi = zzi();
        int i = this.zzi;
        int i10 = this.zzg;
        if (iZzi <= i10 - i && iZzi > 0) {
            bArrZzM = this.zzf;
            this.zzi = i + iZzi;
        } else {
            if (iZzi == 0) {
                return "";
            }
            if (iZzi < 0) {
                throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iZzi <= i10) {
                zzK(iZzi);
                bArrZzM = this.zzf;
                this.zzi = iZzi;
            } else {
                bArrZzM = zzM(iZzi, false);
            }
        }
        return zzhbz.zzh(bArrZzM, i, iZzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final void zzy(int i) throws zzgzm {
        if (this.zzj != i) {
            throw new zzgzm("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final void zzz(int i) {
        this.zzl = i;
        zzJ();
    }
}
