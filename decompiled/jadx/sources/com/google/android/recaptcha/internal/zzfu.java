package com.google.android.recaptcha.internal;

import da.v;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfu extends zzfx {
    final char[] zza;

    public zzfu(String str, String str2) {
        zzft zzftVar = new zzft("base16()", "0123456789ABCDEF".toCharArray());
        super(zzftVar, null);
        this.zza = new char[512];
        zzff.zza(zzftVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzftVar.zza(i >>> 4);
            this.zza[i | 256] = zzftVar.zza(i & 15);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzfw {
        if (charSequence.length() % 2 == 1) {
            throw new zzfw(v.f(charSequence.length(), "Invalid input length "));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequence.length()) {
            bArr[i10] = (byte) ((this.zzb.zzb(charSequence.charAt(i)) << 4) | this.zzb.zzb(charSequence.charAt(i + 1)));
            i += 2;
            i10++;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        zzff.zzd(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            appendable.append(this.zza[i12]);
            appendable.append(this.zza[i12 | 256]);
        }
    }
}
