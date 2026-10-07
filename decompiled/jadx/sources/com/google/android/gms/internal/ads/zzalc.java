package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzalc implements zzaki {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzed zze = new zzed();

    public static float zzb(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j4 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j10 = (Long.parseLong(strGroup2) * 60000) + j4;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j11 = (Long.parseLong(strGroup3) * 1000) + j10;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j11 += Long.parseLong(strGroup4);
        }
        return j11 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:82:0x0180  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        String str;
        zzct zzctVarZzp;
        this.zze.zzJ(bArr, i + i10);
        this.zze.zzL(i);
        Charset charsetZzC = this.zze.zzC();
        if (charsetZzC == null) {
            charsetZzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzz = this.zze.zzz(charsetZzC);
            if (strZzz == null) {
                return;
            }
            if (strZzz.length() != 0) {
                try {
                    Integer.parseInt(strZzz);
                    String strZzz2 = this.zze.zzz(charsetZzC);
                    if (strZzz2 == null) {
                        zzdt.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzz2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        int i11 = 0;
                        this.zzc.setLength(0);
                        this.zzd.clear();
                        String strZzz3 = this.zze.zzz(charsetZzC);
                        while (!TextUtils.isEmpty(strZzz3)) {
                            if (this.zzc.length() > 0) {
                                this.zzc.append("<br>");
                            }
                            StringBuilder sb2 = this.zzc;
                            ArrayList arrayList = this.zzd;
                            String strTrim = strZzz3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i12 = i11;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i12;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, "");
                                i12 += length;
                            }
                            sb2.append(sb3.toString());
                            strZzz3 = this.zze.zzz(charsetZzC);
                            i11 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.zzc.toString());
                        int i13 = 0;
                        while (true) {
                            if (i13 < this.zzd.size()) {
                                str = (String) this.zzd.get(i13);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i13++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcr zzcrVar = new zzcr();
                        zzcrVar.zzl(spannedFromHtml);
                        if (str == null) {
                            zzctVarZzp = zzcrVar.zzp();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        zzcrVar.zzi(1);
                                    } else {
                                        zzcrVar.zzi(0);
                                    }
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        zzcrVar.zzi(1);
                                    } else {
                                        zzcrVar.zzi(2);
                                    }
                                    break;
                                case -685620617:
                                    if (!str.equals("{\\an4}")) {
                                        zzcrVar.zzi(1);
                                    } else {
                                        zzcrVar.zzi(0);
                                    }
                                    break;
                                case -685620555:
                                    if (!str.equals("{\\an6}")) {
                                        zzcrVar.zzi(1);
                                    } else {
                                        zzcrVar.zzi(2);
                                    }
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        zzcrVar.zzi(1);
                                    } else {
                                        zzcrVar.zzi(0);
                                    }
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        zzcrVar.zzi(1);
                                    } else {
                                        zzcrVar.zzi(2);
                                    }
                                    break;
                                default:
                                    zzcrVar.zzi(1);
                                    break;
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        zzcrVar.zzf(1);
                                    } else {
                                        zzcrVar.zzf(2);
                                    }
                                    break;
                                case -685620679:
                                    if (!str.equals("{\\an2}")) {
                                        zzcrVar.zzf(1);
                                    } else {
                                        zzcrVar.zzf(2);
                                    }
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        zzcrVar.zzf(1);
                                    } else {
                                        zzcrVar.zzf(2);
                                    }
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        zzcrVar.zzf(1);
                                    } else {
                                        zzcrVar.zzf(0);
                                    }
                                    break;
                                case -685620493:
                                    if (!str.equals("{\\an8}")) {
                                        zzcrVar.zzf(1);
                                    } else {
                                        zzcrVar.zzf(0);
                                    }
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        zzcrVar.zzf(1);
                                    } else {
                                        zzcrVar.zzf(0);
                                    }
                                    break;
                                default:
                                    zzcrVar.zzf(1);
                                    break;
                            }
                            zzcrVar.zzh(zzb(zzcrVar.zzb()));
                            zzcrVar.zze(zzb(zzcrVar.zza()), 0);
                            zzctVarZzp = zzcrVar.zzp();
                        }
                        zzdgVar.zza(new zzaka(zzfzo.zzo(zzctVarZzp), jZzc, jZzc2 - jZzc));
                    } else {
                        zzdt.zzf("SubripParser", "Skipping invalid timing: ".concat(strZzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzdt.zzf("SubripParser", "Skipping invalid index: ".concat(strZzz));
                }
            }
        }
    }
}
