package com.google.android.gms.internal.ads;

import da.v;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class zzgca extends zzgcb {
    private volatile zzgcb zza;
    final zzgbw zzb;
    final Character zzc;

    public zzgca(zzgbw zzgbwVar, Character ch) {
        this.zzb = zzgbwVar;
        if (ch != null && zzgbwVar.zze('=')) {
            throw new IllegalArgumentException(zzfxf.zzb("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgca) {
            zzgca zzgcaVar = (zzgca) obj;
            if (this.zzb.equals(zzgcaVar.zzb) && Objects.equals(this.zzc, zzgcaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public int zza(byte[] bArr, CharSequence charSequence) throws zzgbz {
        zzgbw zzgbwVar;
        CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new zzgbz(v.f(charSequenceZzg.length(), "Invalid input length "));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequenceZzg.length()) {
            long jZzb = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zzgbwVar = this.zzb;
                if (i11 >= zzgbwVar.zzc) {
                    break;
                }
                jZzb <<= zzgbwVar.zzb;
                if (i + i11 < charSequenceZzg.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZzg.charAt(i12 + i));
                    i12++;
                }
                i11++;
            }
            int i13 = zzgbwVar.zzd;
            int i14 = i12 * zzgbwVar.zzb;
            int i15 = (i13 - 1) * 8;
            while (i15 >= (i13 * 8) - i14) {
                bArr[i10] = (byte) ((jZzb >>> i15) & 255);
                i15 -= 8;
                i10++;
            }
            i += this.zzb.zzc;
        }
        return i10;
    }

    public zzgcb zzb(zzgbw zzgbwVar, Character ch) {
        return new zzgca(zzgbwVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public void zzc(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        zzfwq.zzj(0, i10, bArr.length);
        while (i11 < i10) {
            zzh(appendable, bArr, i11, Math.min(this.zzb.zzd, i10 - i11));
            i11 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final int zzd(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final int zze(int i) {
        zzgbw zzgbwVar = this.zzb;
        return zzgbwVar.zzc * zzgck.zzb(i, zzgbwVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final zzgcb zzf() {
        zzgcb zzgcbVarZzb = this.zza;
        if (zzgcbVarZzb == null) {
            zzgbw zzgbwVar = this.zzb;
            zzgbw zzgbwVarZzc = zzgbwVar.zzc();
            zzgcbVarZzb = zzgbwVarZzc == zzgbwVar ? this : zzb(zzgbwVarZzc, this.zzc);
            this.zza = zzgcbVarZzb;
        }
        return zzgcbVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzh(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        zzfwq.zzj(i, i + i10, bArr.length);
        int i11 = 0;
        zzfwq.zze(i10 <= this.zzb.zzd);
        long j4 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j4 = (j4 | ((long) (bArr[i + i12] & 255))) << 8;
        }
        int i13 = (i10 + 1) * 8;
        zzgbw zzgbwVar = this.zzb;
        while (i11 < i10 * 8) {
            long j10 = j4 >>> ((i13 - zzgbwVar.zzb) - i11);
            zzgbw zzgbwVar2 = this.zzb;
            appendable.append(zzgbwVar2.zza(((int) j10) & zzgbwVar2.zza));
            i11 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i11 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i11 += this.zzb.zzb;
            }
        }
    }

    public zzgca(String str, String str2, Character ch) {
        this(new zzgbw(str, str2.toCharArray()), ch);
    }
}
