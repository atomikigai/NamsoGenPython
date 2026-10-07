package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaln implements zzaki {
    private final zzed zza = new zzed();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzaln(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzen.zzC(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z4 = (bArr[0] & 32) != 0;
        this.zzb = z4;
        if (z4) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            int i14 = i13 | 33;
            int i15 = i & 1;
            int i16 = i & 2;
            boolean z4 = true;
            if (i15 != 0) {
                if (i16 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                    z4 = false;
                }
            } else if (i16 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            } else {
                z4 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            } else {
                if (i15 != 0 || z4) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        String strZzB;
        int i11;
        this.zza.zzJ(bArr, i + i10);
        this.zza.zzL(i);
        zzed zzedVar = this.zza;
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        zzdb.zzd(zzedVar.zzb() >= 2);
        int iZzq = zzedVar.zzq();
        if (iZzq == 0) {
            strZzB = "";
        } else {
            int iZzd = zzedVar.zzd();
            Charset charsetZzC = zzedVar.zzC();
            int iZzd2 = zzedVar.zzd() - iZzd;
            if (charsetZzC == null) {
                charsetZzC = StandardCharsets.UTF_8;
            }
            strZzB = zzedVar.zzB(iZzq - iZzd2, charsetZzC);
        }
        if (strZzB.isEmpty()) {
            zzdgVar.zza(new zzaka(zzfzo.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (true) {
            zzed zzedVar2 = this.zza;
            if (zzedVar2.zzb() < 8) {
                zzcr zzcrVar = new zzcr();
                zzcrVar.zzl(spannableStringBuilder);
                zzcrVar.zze(fMax, 0);
                zzcrVar.zzf(0);
                zzdgVar.zza(new zzaka(zzfzo.zzo(zzcrVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iZzd3 = zzedVar2.zzd();
            int iZzg = zzedVar2.zzg();
            int iZzg2 = this.zza.zzg();
            if (iZzg2 == 1937013100) {
                zzdb.zzd(this.zza.zzb() >= i14 ? i12 : i13);
                int iZzq2 = this.zza.zzq();
                int i15 = i13;
                while (i15 < iZzq2) {
                    zzed zzedVar3 = this.zza;
                    zzdb.zzd(zzedVar3.zzb() >= 12 ? i12 : i13);
                    int iZzq3 = zzedVar3.zzq();
                    int iZzq4 = zzedVar3.zzq();
                    zzedVar3.zzM(i14);
                    int iZzm = zzedVar3.zzm();
                    zzedVar3.zzM(i12);
                    int iZzg3 = zzedVar3.zzg();
                    if (iZzq4 > spannableStringBuilder.length()) {
                        zzdt.zzf("Tx3gParser", "Truncating styl end (" + iZzq4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iZzq4 = spannableStringBuilder.length();
                    }
                    if (iZzq3 >= iZzq4) {
                        zzdt.zzf("Tx3gParser", "Ignoring styl with start (" + iZzq3 + ") >= end (" + iZzq4 + ").");
                    } else {
                        int i16 = iZzq4;
                        zzc(spannableStringBuilder, iZzm, this.zzc, iZzq3, i16, 0);
                        zzb(spannableStringBuilder, iZzg3, this.zzd, iZzq3, i16, 0);
                    }
                    i15++;
                    i12 = 1;
                    i13 = 0;
                    i14 = 2;
                }
                i11 = i14;
            } else if (iZzg2 == 1952608120 && this.zzb) {
                i11 = 2;
                zzdb.zzd(this.zza.zzb() >= 2);
                fMax = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
            } else {
                i11 = 2;
            }
            this.zza.zzL(iZzd3 + iZzg);
            i14 = i11;
            i12 = 1;
            i13 = 0;
        }
    }
}
