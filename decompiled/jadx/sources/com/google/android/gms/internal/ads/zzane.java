package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzane {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzane(int i, int i10) {
        this.zzc = i;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza(byte[] bArr, int i, int i10) {
        if (this.zzd) {
            int i11 = i10 - i;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i12 = this.zzb + i11;
            if (length < i12) {
                this.zza = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i, this.zza, this.zzb, i11);
            this.zzb += i11;
        }
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int i) {
        zzdb.zzf(!this.zzd);
        boolean z4 = i == this.zzc;
        this.zzd = z4;
        if (z4) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int i) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i;
        this.zzd = false;
        this.zze = true;
        return true;
    }

    public final boolean zze() {
        return this.zze;
    }
}
