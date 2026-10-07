package com.google.android.gms.internal.ads;

import da.v;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzed {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfzt zzc = zzfzt.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzed(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
    }

    private final char zzO(Charset charset, char[] cArr) {
        int iZzP = zzP(charset);
        if (iZzP != 0) {
            int i = iZzP >> 16;
            for (char c10 : cArr) {
                char c11 = (char) i;
                if (c10 == c11) {
                    this.zze += (char) iZzP;
                    return c11;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private final int zzP(Charset charset) {
        byte bZza;
        int i;
        int i10;
        char cZzb;
        int i11;
        int i12;
        int i13 = 1;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            int i14 = this.zzf;
            int i15 = this.zze;
            if (i14 - i15 > 0) {
                bZza = (byte) zzgco.zza(this.zzd[i15] & 255);
            } else {
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    i = this.zzf;
                    i10 = this.zze;
                    if (i - i10 >= 2) {
                        byte[] bArr = this.zzd;
                        cZzb = zzgco.zzb(bArr[i10], bArr[i10 + 1]);
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            return 0;
                        }
                        i11 = this.zzf;
                        i12 = this.zze;
                        if (i11 - i12 >= 2) {
                            return 0;
                        }
                        byte[] bArr2 = this.zzd;
                        cZzb = zzgco.zzb(bArr2[i12 + 1], bArr2[i12]);
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i11 = this.zzf;
                    i12 = this.zze;
                    if (i11 - i12 >= 2) {
                        return 0;
                    }
                    byte[] bArr3 = this.zzd;
                    cZzb = zzgco.zzb(bArr3[i12 + 1], bArr3[i12]);
                }
                bZza = (byte) cZzb;
                i13 = 2;
            }
        } else {
            if (charset.equals(StandardCharsets.UTF_16)) {
                i = this.zzf;
                i10 = this.zze;
                if (i - i10 >= 2) {
                    byte[] bArr4 = this.zzd;
                    cZzb = zzgco.zzb(bArr4[i10], bArr4[i10 + 1]);
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i11 = this.zzf;
                    i12 = this.zze;
                    if (i11 - i12 >= 2) {
                        return 0;
                    }
                    byte[] bArr5 = this.zzd;
                    cZzb = zzgco.zzb(bArr5[i12 + 1], bArr5[i12]);
                }
            } else {
                i = this.zzf;
                i10 = this.zze;
                if (i - i10 >= 2) {
                    byte[] bArr6 = this.zzd;
                    cZzb = zzgco.zzb(bArr6[i10], bArr6[i10 + 1]);
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i11 = this.zzf;
                    i12 = this.zze;
                    if (i11 - i12 >= 2) {
                        return 0;
                    }
                    byte[] bArr7 = this.zzd;
                    cZzb = zzgco.zzb(bArr7[i12 + 1], bArr7[i12]);
                }
            }
            bZza = (byte) cZzb;
            i13 = 2;
        }
        return (zzgco.zza(bZza) << 16) + i13;
    }

    public final String zzA(int i) {
        if (i == 0) {
            return "";
        }
        int i10 = this.zze;
        int i11 = (i10 + i) - 1;
        String strZzC = zzen.zzC(this.zzd, i10, (i11 >= this.zzf || this.zzd[i11] != 0) ? i : i - 1);
        this.zze += i;
        return strZzC;
    }

    public final String zzB(int i, Charset charset) {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        String str = new String(bArr, i10, i, charset);
        this.zze = i10 + i;
        return str;
    }

    public final Charset zzC() {
        int i = this.zzf;
        int i10 = this.zze;
        int i11 = i - i10;
        if (i11 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.zze = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i11 < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        byte b10 = bArr2[i10];
        if (b10 == -2) {
            if (bArr2[i10 + 1] != -1) {
                return null;
            }
            this.zze = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.zze = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return (short) ((bArr[i10] & 255) | (i11 << 8));
    }

    public final void zzF(int i) {
        byte[] bArr = this.zzd;
        if (i > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i);
        }
    }

    public final void zzG(zzec zzecVar, int i) {
        zzH(zzecVar.zza, 0, i);
        zzecVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i, int i10) {
        System.arraycopy(this.zzd, this.zze, bArr, i, i10);
        this.zze += i10;
    }

    public final void zzI(int i) {
        byte[] bArr = this.zzd;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzJ(bArr, i);
    }

    public final void zzJ(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
        this.zze = 0;
    }

    public final void zzK(int i) {
        boolean z4 = false;
        if (i >= 0 && i <= this.zzd.length) {
            z4 = true;
        }
        zzdb.zzd(z4);
        this.zzf = i;
    }

    public final void zzL(int i) {
        boolean z4 = false;
        if (i >= 0 && i <= this.zzf) {
            z4 = true;
        }
        zzdb.zzd(z4);
        this.zze = i;
    }

    public final void zzM(int i) {
        zzL(this.zze + i);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzdb.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzP(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.zze = i14;
        int i15 = bArr[i12] & 255;
        this.zze = i + 4;
        return (bArr[i14] & 255) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i + 3;
        return (bArr[i12] & 255) | ((i11 << 24) >> 8) | (i13 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.zze = i14;
        int i15 = bArr[i12] & 255;
        this.zze = i + 4;
        return ((bArr[i14] & 255) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final int zzj() {
        int iZzi = zzi();
        if (iZzi >= 0) {
            return iZzi;
        }
        throw new IllegalStateException(v.f(iZzi, "Top bit not zero: "));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        this.zze = i + 1;
        return bArr[i] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        int i12 = bArr[i10] & 255;
        this.zze = i + 4;
        return i12 | (i11 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final int zzp() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException(v.f(iZzg, "Top bit not zero: "));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return (bArr[i10] & 255) | (i11 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i + 3;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i + 4;
        this.zze = i13;
        long j12 = bArr[i12];
        int i14 = i + 5;
        this.zze = i14;
        long j13 = bArr[i13];
        int i15 = i + 6;
        this.zze = i15;
        long j14 = bArr[i14];
        int i16 = i + 7;
        this.zze = i16;
        long j15 = bArr[i15];
        this.zze = i + 8;
        return ((((long) bArr[i16]) & 255) << 56) | (255 & j4) | ((j10 & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((j13 & 255) << 32) | ((j14 & 255) << 40) | ((j15 & 255) << 48);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i + 3;
        this.zze = i12;
        long j11 = bArr[i11];
        this.zze = i + 4;
        return ((((long) bArr[i12]) & 255) << 24) | (j4 & 255) | ((j10 & 255) << 8) | ((j11 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i + 3;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i + 4;
        this.zze = i13;
        long j12 = bArr[i12];
        int i14 = i + 5;
        this.zze = i14;
        long j13 = bArr[i13];
        int i15 = i + 6;
        this.zze = i15;
        long j14 = bArr[i14];
        int i16 = i + 7;
        this.zze = i16;
        long j15 = bArr[i15];
        this.zze = i + 8;
        return (((long) bArr[i16]) & 255) | ((j4 & 255) << 56) | ((j10 & 255) << 48) | ((j11 & 255) << 40) | ((j12 & 255) << 32) | ((j13 & 255) << 24) | ((j14 & 255) << 16) | ((j15 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i + 3;
        this.zze = i12;
        long j11 = bArr[i11];
        this.zze = i + 4;
        return (((long) bArr[i12]) & 255) | ((j4 & 255) << 24) | ((j10 & 255) << 16) | ((j11 & 255) << 8);
    }

    public final long zzv() {
        long j4 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zze == this.zzf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzm = zzm();
            j4 |= (127 & jZzm) << (i * 7);
            if ((jZzm & 128) == 0) {
                return j4;
            }
        }
        return j4;
    }

    public final long zzw() {
        long jZzt = zzt();
        if (jZzt >= 0) {
            return jZzt;
        }
        throw new IllegalStateException(v.g("Top bit not zero: ", jZzt));
    }

    public final long zzx() {
        int i;
        int i10;
        long j4 = this.zzd[this.zze];
        int i11 = 7;
        while (true) {
            i = 0;
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j4) == 0) {
                if (i11 >= 6) {
                    if (i11 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j4 &= (long) (i12 - 1);
                i = 7 - i11;
                break;
            }
            i11--;
        }
        if (i == 0) {
            throw new NumberFormatException(v.g("Invalid UTF-8 sequence first byte: ", j4));
        }
        for (i10 = 1; i10 < i; i10++) {
            byte b10 = this.zzd[this.zze + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(v.g("Invalid UTF-8 sequence continuation byte: ", j4));
            }
            j4 = (j4 << 6) | ((long) (b10 & 63));
        }
        this.zze += i;
        return j4;
    }

    public final String zzy(char c10) {
        int i = this.zzf;
        int i10 = this.zze;
        if (i - i10 == 0) {
            return null;
        }
        while (i10 < this.zzf && this.zzd[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        String strZzC = zzen.zzC(bArr, i11, i10 - i11);
        this.zze = i10;
        if (i10 < this.zzf) {
            this.zze = i10 + 1;
        }
        return strZzC;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    public final String zzz(Charset charset) {
        byte[] bArr;
        zzdb.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzC();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i10 = this.zze;
        while (true) {
            int i11 = this.zzf;
            if (i10 >= i11 - (i - 1)) {
                i10 = i11;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzen.zzL(this.zzd[i10])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.zzd;
                if (bArr2[i10] == 0 && zzen.zzL(bArr2[i10 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zzd;
                    if (bArr[i10 + 1] == 0 && zzen.zzL(bArr[i10])) {
                        break;
                    }
                }
                i10 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zzd;
                    if (bArr[i10 + 1] == 0) {
                        continue;
                    }
                }
                i10 += i;
            }
        }
        String strZzB = zzB(i10 - this.zze, charset);
        if (this.zze != this.zzf && zzO(charset, zza) == '\r') {
            zzO(charset, zzb);
        }
        return strZzB;
    }

    public zzed() {
        this.zzd = zzen.zzf;
    }

    public zzed(int i) {
        this.zzd = new byte[i];
        this.zzf = i;
    }

    public zzed(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
