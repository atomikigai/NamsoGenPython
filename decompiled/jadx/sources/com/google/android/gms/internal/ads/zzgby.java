package com.google.android.gms.internal.ads;

import da.v;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgby extends zzgca {
    private zzgby(zzgbw zzgbwVar, Character ch) {
        super(zzgbwVar, ch);
        zzfwq.zze(zzgbwVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzgcb
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgbz {
        CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new zzgbz(v.f(charSequenceZzg.length(), "Invalid input length "));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequenceZzg.length()) {
            int i11 = i10 + 1;
            int iZzb = (this.zzb.zzb(charSequenceZzg.charAt(i)) << 18) | (this.zzb.zzb(charSequenceZzg.charAt(i + 1)) << 12);
            bArr[i10] = (byte) (iZzb >>> 16);
            int i12 = i + 2;
            if (i12 < charSequenceZzg.length()) {
                int i13 = i + 3;
                int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZzg.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iZzb2 >>> 8) & 255);
                if (i13 < charSequenceZzg.length()) {
                    i += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iZzb2 | this.zzb.zzb(charSequenceZzg.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i = i13;
                }
            } else {
                i = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public final zzgcb zzb(zzgbw zzgbwVar, Character ch) {
        return new zzgby(zzgbwVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzgcb
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        zzfwq.zzj(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | (i13 << 16) | (bArr[i11 + 2] & 255);
            appendable.append(this.zzb.zza(i14 >>> 18));
            appendable.append(this.zzb.zza((i14 >>> 12) & 63));
            appendable.append(this.zzb.zza((i14 >>> 6) & 63));
            appendable.append(this.zzb.zza(i14 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zzh(appendable, bArr, i11, i10 - i11);
        }
    }

    public zzgby(String str, String str2, Character ch) {
        this(new zzgbw(str, str2.toCharArray()), ch);
    }
}
