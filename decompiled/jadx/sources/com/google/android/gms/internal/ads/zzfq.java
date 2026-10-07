package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfq {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfq(byte[] bArr, int i, int i10) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i10;
        zzj();
    }

    private final int zzi() {
        int i = 0;
        while (!zzh()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zza(i) : 0);
    }

    private final void zzj() {
        int i;
        int i10 = this.zzc;
        boolean z4 = false;
        if (i10 >= 0 && (i10 < (i = this.zzb) || (i10 == i && this.zzd == 0))) {
            z4 = true;
        }
        zzdb.zzf(z4);
    }

    private final boolean zzk(int i) {
        if (i < 2 || i >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public final int zza(int i) {
        int i10;
        this.zzd += i;
        int i11 = 0;
        while (true) {
            i10 = this.zzd;
            int i12 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.zzd = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzc;
            i11 |= (bArr[i14] & 255) << i13;
            if (true != zzk(i14 + 1)) {
                i12 = 1;
            }
            this.zzc = i14 + i12;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzc;
        int i16 = i11 | ((bArr2[i15] & 255) >> (8 - i10));
        int i17 = 32 - i;
        if (i10 == 8) {
            this.zzd = 0;
            this.zzc = i15 + (true != zzk(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        zzj();
        return i18;
    }

    public final int zzb() {
        int iZzi = zzi();
        int i = iZzi % 2;
        return ((iZzi + 1) / 2) * (i == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i = this.zzd;
        if (i > 0) {
            zzf(8 - i);
        }
    }

    public final void zze() {
        int i = this.zzd + 1;
        this.zzd = i;
        if (i == 8) {
            this.zzd = 0;
            int i10 = this.zzc;
            this.zzc = i10 + (true == zzk(i10 + 1) ? 2 : 1);
        }
        zzj();
    }

    public final void zzf(int i) {
        int i10 = this.zzc;
        int i11 = i / 8;
        int i12 = i10 + i11;
        this.zzc = i12;
        int i13 = (i - (i11 * 8)) + this.zzd;
        this.zzd = i13;
        if (i13 > 7) {
            this.zzc = i12 + 1;
            this.zzd = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.zzc) {
                zzj();
                return;
            } else if (zzk(i10)) {
                this.zzc++;
                i10 += 2;
            }
        }
    }

    public final boolean zzg(int i) {
        int i10 = this.zzc;
        int i11 = i / 8;
        int i12 = i10 + i11;
        int i13 = (this.zzd + i) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.zzb) {
                break;
            }
            if (zzk(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.zzb;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public final boolean zzh() {
        int i = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        return i != 0;
    }
}
