package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzamp {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzamp(int i) {
    }

    public final void zza(byte[] bArr, int i, int i10) {
        if (this.zze) {
            int i11 = i10 - i;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i12 = this.zza + i11;
            if (length < i12) {
                this.zzc = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i, this.zzc, this.zza, i11);
            this.zza += i11;
        }
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzc(int i, int i10) {
        int i11 = this.zzf;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i == 179 || i == 181) {
                            this.zza -= i10;
                            this.zze = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        zzdt.zzf("H263Reader", "Unexpected start code value");
                        zzb();
                    } else {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                } else if (i > 31) {
                    zzdt.zzf("H263Reader", "Unexpected start code value");
                    zzb();
                } else {
                    this.zzf = 3;
                }
            } else if (i != 181) {
                zzdt.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else {
                this.zzf = 2;
            }
        } else if (i == 176) {
            this.zzf = 1;
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
