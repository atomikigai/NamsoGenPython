package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgcb {
    private static final zzgcb zza;

    static {
        new zzgby("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzgby("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzgca("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgca("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new zzgbx("base16()", "0123456789ABCDEF");
    }

    public static zzgcb zzi() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzgbz;

    public abstract void zzc(Appendable appendable, byte[] bArr, int i, int i10) throws IOException;

    public abstract int zzd(int i);

    public abstract int zze(int i);

    public abstract zzgcb zzf();

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i, int i10) {
        zzfwq.zzj(0, i10, bArr.length);
        StringBuilder sb2 = new StringBuilder(zze(i10));
        try {
            zzc(sb2, bArr, 0, i10);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzd = zzd(charSequenceZzg.length());
            byte[] bArr = new byte[iZzd];
            int iZza = zza(bArr, charSequenceZzg);
            if (iZza == iZzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzgbz e) {
            throw new IllegalArgumentException(e);
        }
    }
}
