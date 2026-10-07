package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaly {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x01b8, please report this as an issue */
    public static SpannedString zza(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            int length = i + 1;
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    spannableStringBuilder.append(' ');
                                } else {
                                    zzdt.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append('&');
                            } else {
                                zzdt.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        } else {
                            zzdt.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append('>');
                    } else {
                        zzdt.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i10 = length - 2;
                boolean z4 = str2.charAt(i10) == '/';
                int i11 = i + (cCharAt2 == '/' ? 2 : 1);
                if (!z4) {
                    i10 = length - 1;
                }
                String strSubstring2 = str2.substring(i11, i10);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzdb.zzd(true ^ strTrim.isEmpty());
                    int i12 = zzen.zza;
                    String str3 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str3.hashCode();
                    if (iHashCode2 == 98 ? str3.equals("b") : !(iHashCode2 == 99 ? !str3.equals("c") : iHashCode2 == 105 ? !str3.equals("i") : iHashCode2 == 3650 ? !str3.equals("rt") : iHashCode2 == 3314158 ? !str3.equals("lang") : iHashCode2 == 3511770 ? !str3.equals("ruby") : iHashCode2 == 117 ? !str3.equals("u") : iHashCode2 != 118 || !str3.equals("v"))) {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                zzalu zzaluVar = (zzalu) arrayDeque.pop();
                                zzg(str, zzaluVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new zzalt(zzaluVar, spannableStringBuilder.length(), null));
                                }
                                if (zzaluVar.zza.equals(str3)) {
                                    break;
                                }
                            }
                        } else if (!z4) {
                            arrayDeque.push(zzalu.zza(strSubstring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i = length;
        }
        while (!arrayDeque.isEmpty()) {
            zzg(str, (zzalu) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzg(str, zzalu.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static zzcr zzb(String str) {
        zzalw zzalwVar = new zzalw();
        zzh(str, zzalwVar);
        return zzalwVar.zza();
    }

    public static zzalr zzc(zzed zzedVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzz = zzedVar.zzz(charset);
        if (strZzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzedVar, list);
            }
            String strZzz2 = zzedVar.zzz(charset);
            if (strZzz2 != null) {
                Matcher matcher2 = pattern.matcher(strZzz2);
                if (matcher2.matches()) {
                    return zze(strZzz.trim(), matcher2, zzedVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzalu zzaluVar) {
        List listZzf = zzf(list, str, zzaluVar);
        for (int i = 0; i < listZzf.size(); i++) {
            zzalq zzalqVar = ((zzalv) listZzf.get(i)).zzb;
            if (zzalqVar.zze() != -1) {
                return zzalqVar.zze();
            }
        }
        return -1;
    }

    private static zzalr zze(String str, Matcher matcher, zzed zzedVar, List list) {
        zzalw zzalwVar = new zzalw();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzalwVar.zza = zzama.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzalwVar.zzb = zzama.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zzh(strGroup3, zzalwVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzz = zzedVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzz)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strZzz.trim());
                strZzz = zzedVar.zzz(StandardCharsets.UTF_8);
            }
            zzalwVar.zzc = zza(str, sb2.toString(), list);
            return new zzalr(zzalwVar.zza().zzp(), zzalwVar.zza, zzalwVar.zzb);
        } catch (NumberFormatException unused) {
            zzdt.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzalu zzaluVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzalq zzalqVar = (zzalq) list.get(i);
            int iZzf = zzalqVar.zzf(str, zzaluVar.zza, zzaluVar.zzd, zzaluVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new zzalv(iZzf, zzalqVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzalu zzaluVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = zzaluVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaluVar.zza;
        int iHashCode = str2.hashCode();
        int i10 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iZzd = zzd(list2, str, zzaluVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, zzalt.zza);
                        int i11 = zzaluVar.zzb;
                        int i12 = 0;
                        int length2 = 0;
                        while (i12 < arrayList.size()) {
                            if ("rt".equals(((zzalt) arrayList.get(i12)).zzb.zza)) {
                                zzalt zzaltVar = (zzalt) arrayList.get(i12);
                                int iZzd2 = zzd(list2, str, zzaltVar.zzb);
                                if (iZzd2 == i10) {
                                    iZzd2 = iZzd != i10 ? iZzd : 1;
                                }
                                int i13 = zzaltVar.zzb.zzb - length2;
                                int i14 = zzaltVar.zzc - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                                spannableStringBuilder.delete(i13, i14);
                                spannableStringBuilder.setSpan(new zzcx(charSequenceSubSequence.toString(), iZzd2), i11, i13, 33);
                                length2 += charSequenceSubSequence.length();
                                i11 = i13;
                            }
                            i12++;
                            i10 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzaluVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzda(zzaluVar.zzc), i, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listZzf = zzf(list2, str, zzaluVar);
        for (int i15 = 0; i15 < listZzf.size(); i15++) {
            zzalq zzalqVar = ((zzalv) listZzf.get(i15)).zzb;
            if (zzalqVar != null) {
                if (zzalqVar.zzg() != -1) {
                    zzcy.zzb(spannableStringBuilder, new StyleSpan(zzalqVar.zzg()), i, length, 33);
                }
                if (zzalqVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzalqVar.zzy()) {
                    zzcy.zzb(spannableStringBuilder, new ForegroundColorSpan(zzalqVar.zzc()), i, length, 33);
                }
                if (zzalqVar.zzx()) {
                    zzcy.zzb(spannableStringBuilder, new BackgroundColorSpan(zzalqVar.zzb()), i, length, 33);
                }
                if (zzalqVar.zzr() != null) {
                    zzcy.zzb(spannableStringBuilder, new TypefaceSpan(zzalqVar.zzr()), i, length, 33);
                }
                int iZzd3 = zzalqVar.zzd();
                if (iZzd3 == 1) {
                    zzcy.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalqVar.zza(), true), i, length, 33);
                } else if (iZzd3 == 2) {
                    zzcy.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalqVar.zza()), i, length, 33);
                } else if (iZzd3 == 3) {
                    zzcy.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalqVar.zza() / 100.0f), i, length, 33);
                }
                if (zzalqVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcw(), i, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0140 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0181 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0112, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzh(java.lang.String r16, com.google.android.gms.internal.ads.zzalw r17) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zzh(java.lang.String, com.google.android.gms.internal.ads.zzalw):void");
    }
}
