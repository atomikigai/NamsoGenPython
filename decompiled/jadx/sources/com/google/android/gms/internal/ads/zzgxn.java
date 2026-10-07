package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgxn extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    public zzgxn(int i) {
    }

    private final void zzc(int i) {
        this.zzc.add(new zzgxm(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.zzf == this.zze.length) {
                zzc(1);
            }
            byte[] bArr = this.zze;
            int i10 = this.zzf;
            this.zzf = i10 + 1;
            bArr[i10] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int zza() {
        return this.zzd + this.zzf;
    }

    public final synchronized zzgxp zzb() {
        try {
            int i = this.zzf;
            byte[] bArr = this.zze;
            if (i >= bArr.length) {
                this.zzc.add(new zzgxm(this.zze));
                this.zze = zza;
            } else if (i > 0) {
                this.zzc.add(new zzgxm(Arrays.copyOf(bArr, i)));
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzgxp.zzu(this.zzc);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i11 = this.zzf;
        int i12 = length - i11;
        if (i10 <= i12) {
            System.arraycopy(bArr, i, bArr2, i11, i10);
            this.zzf += i10;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i11, i12);
        int i13 = i10 - i12;
        zzc(i13);
        System.arraycopy(bArr, i + i12, this.zze, 0, i13);
        this.zzf = i13;
    }
}
