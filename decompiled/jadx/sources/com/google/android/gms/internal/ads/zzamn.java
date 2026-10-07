package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzamn {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzamn(int i) {
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
        this.zzb = 0;
    }

    public final boolean zzc(int i, int i10) {
        if (this.zze) {
            int i11 = this.zza - i10;
            this.zza = i11;
            if (this.zzb != 0 || i != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i11;
        } else if (i == 179) {
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
