package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadz {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzadz(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final int zza() {
        return (this.zzc * 8) + this.zzd;
    }

    public final int zzb(int i) {
        int i10 = this.zzc;
        int i11 = 8 - this.zzd;
        int i12 = i10 + 1;
        byte[] bArr = this.zza;
        int iMin = Math.min(i, i11);
        int i13 = ((bArr[i10] & 255) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i) {
            i13 |= (this.zza[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i));
        zzc(i);
        return i14;
    }

    public final void zzc(int i) {
        int i10;
        int i11 = i / 8;
        int i12 = this.zzc + i11;
        this.zzc = i12;
        int i13 = (i - (i11 * 8)) + this.zzd;
        this.zzd = i13;
        if (i13 > 7) {
            i12++;
            this.zzc = i12;
            i13 -= 8;
            this.zzd = i13;
        }
        boolean z4 = false;
        if (i12 >= 0 && (i12 < (i10 = this.zzb) || (i12 == i10 && i13 == 0))) {
            z4 = true;
        }
        zzdb.zzf(z4);
    }

    public final boolean zzd() {
        int i = (this.zza[this.zzc] & 255) >> this.zzd;
        zzc(1);
        return 1 == (i & 1);
    }
}
