package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalp {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzed zzc = new zzed();
    private final StringBuilder zzd = new StringBuilder();

    public static String zza(zzed zzedVar, StringBuilder sb2) {
        zzc(zzedVar);
        if (zzedVar.zzb() == 0) {
            return null;
        }
        String strZzd = zzd(zzedVar, sb2);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzedVar.zzm();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(cZzm);
        return sb3.toString();
    }

    public static void zzc(zzed zzedVar) {
        while (true) {
            for (boolean z4 = true; zzedVar.zzb() > 0 && z4; z4 = false) {
                char c10 = (char) zzedVar.zzN()[zzedVar.zzd()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzedVar.zzM(1);
                } else {
                    int iZzd = zzedVar.zzd();
                    int iZze = zzedVar.zze();
                    byte[] bArrZzN = zzedVar.zzN();
                    if (iZzd + 2 <= iZze) {
                        int i = iZzd + 1;
                        if (bArrZzN[iZzd] == 47) {
                            int i10 = iZzd + 2;
                            if (bArrZzN[i] == 42) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (i11 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzN[i10]) == '*' && ((char) bArrZzN[i11]) == '/') {
                                        iZze = i10 + 2;
                                        i10 = iZze;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                zzedVar.zzM(iZze - zzedVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzed zzedVar, StringBuilder sb2) {
        char c10;
        sb2.setLength(0);
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                if (iZzd < iZze && !z4) {
                    c10 = (char) zzedVar.zzN()[iZzd];
                    if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                        break;
                    }
                    z4 = true;
                } else {
                    break loop0;
                }
            }
            sb2.append(c10);
            iZzd++;
        }
        zzedVar.zzM(iZzd - zzedVar.zzd());
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:106:0x0206  */
    /* JADX WARN: Code duplicated, block: B:107:0x020b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0213  */
    /* JADX WARN: Code duplicated, block: B:113:0x0223  */
    /* JADX WARN: Code duplicated, block: B:116:0x022b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0233  */
    /* JADX WARN: Code duplicated, block: B:120:0x023b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0240  */
    /* JADX WARN: Code duplicated, block: B:123:0x0248  */
    /* JADX WARN: Code duplicated, block: B:124:0x024d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0255  */
    /* JADX WARN: Code duplicated, block: B:128:0x025d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0262  */
    /* JADX WARN: Code duplicated, block: B:131:0x026a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0272  */
    /* JADX WARN: Code duplicated, block: B:134:0x0277  */
    /* JADX WARN: Code duplicated, block: B:136:0x027f  */
    /* JADX WARN: Code duplicated, block: B:138:0x028f  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x02df  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01df  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e8  */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x028f, please report this as an issue */
    public final List zzb(zzed zzedVar) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        boolean z4;
        int i = 0;
        this.zzd.setLength(0);
        int iZzd = zzedVar.zzd();
        while (!TextUtils.isEmpty(zzedVar.zzz(StandardCharsets.UTF_8))) {
        }
        this.zzc.zzJ(zzedVar.zzN(), zzedVar.zzd());
        this.zzc.zzL(iZzd);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar2 = this.zzc;
            StringBuilder sb2 = this.zzd;
            zzc(zzedVar2);
            if (zzedVar2.zzb() >= 5 && "::cue".equals(zzedVar2.zzB(5, StandardCharsets.UTF_8))) {
                int iZzd2 = zzedVar2.zzd();
                String strZza = zza(zzedVar2, sb2);
                if (strZza == null) {
                    strTrim = null;
                } else if ("{".equals(strZza)) {
                    zzedVar2.zzL(iZzd2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZza)) {
                        int iZzd3 = zzedVar2.zzd();
                        int iZze = zzedVar2.zze();
                        int i10 = i;
                        while (iZzd3 < iZze && i10 == 0) {
                            int i11 = iZzd3 + 1;
                            i10 = ((char) zzedVar2.zzN()[iZzd3]) == ')' ? 1 : i;
                            iZzd3 = i11;
                        }
                        strTrim = zzedVar2.zzB((iZzd3 - 1) - zzedVar2.zzd(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zza(zzedVar2, sb2))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(zza(this.zzc, this.zzd))) {
                break;
            }
            zzalq zzalqVar = new zzalq();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzalqVar.zzv(strGroup2);
                    }
                    strTrim = strTrim.substring(i, iIndexOf);
                }
                int i12 = zzen.zza;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str = strArrSplit[i];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    zzalqVar.zzu(str.substring(i, iIndexOf2));
                    zzalqVar.zzt(str.substring(iIndexOf2 + 1));
                } else {
                    zzalqVar.zzu(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzalqVar.zzs((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i13 = i;
            String strZza2 = null;
            while (i13 == 0) {
                zzed zzedVar3 = this.zzc;
                StringBuilder sb3 = this.zzd;
                int iZzd4 = zzedVar3.zzd();
                strZza2 = zza(zzedVar3, sb3);
                i13 = (strZza2 == null || "}".equals(strZza2)) ? 1 : i;
                if (i13 == 0) {
                    this.zzc.zzL(iZzd4);
                    zzed zzedVar4 = this.zzc;
                    StringBuilder sb4 = this.zzd;
                    zzc(zzedVar4);
                    String strZzd = zzd(zzedVar4, sb4);
                    if (!"".equals(strZzd) && ":".equals(zza(zzedVar4, sb4))) {
                        zzc(zzedVar4);
                        StringBuilder sb5 = new StringBuilder();
                        int i14 = i;
                        while (true) {
                            if (i14 != 0) {
                                string = sb5.toString();
                                break;
                            }
                            int iZzd5 = zzedVar4.zzd();
                            String strZza3 = zza(zzedVar4, sb4);
                            if (strZza3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZza3) || ";".equals(strZza3)) {
                                zzedVar4.zzL(iZzd5);
                                i14 = 1;
                            } else {
                                sb5.append(strZza3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iZzd6 = zzedVar4.zzd();
                            String strZza4 = zza(zzedVar4, sb4);
                            if (";".equals(strZza4)) {
                                if ("color".equals(strZzd)) {
                                    zzalqVar.zzk(zzde.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalqVar.zzh(zzde.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalqVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalqVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string)) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    zzalqVar.zzj(z4);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzalqVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalqVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzalqVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzalqVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzfwa.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592) {
                                                }
                                                throw new IllegalStateException();
                                            }
                                            if (strGroup.equals("em")) {
                                                throw new IllegalStateException();
                                            }
                                            zzalqVar.zzn(2);
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            zzalqVar.zzm(Float.parseFloat(strGroup3));
                                        } else {
                                            if (strGroup.equals("%")) {
                                                throw new IllegalStateException();
                                            }
                                            zzalqVar.zzn(3);
                                            String strGroup4 = matcher.group(1);
                                            strGroup4.getClass();
                                            zzalqVar.zzm(Float.parseFloat(strGroup4));
                                        }
                                    } else {
                                        zzdt.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strZza4)) {
                                zzedVar4.zzL(iZzd6);
                                if ("color".equals(strZzd)) {
                                    zzalqVar.zzk(zzde.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalqVar.zzh(zzde.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalqVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalqVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    zzalqVar.zzj(z4);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzalqVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalqVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzalqVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzalqVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzfwa.zza(string));
                                    if (matcher.matches()) {
                                        zzdt.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode == 3592 || !strGroup.equals("px")) {
                                                    throw new IllegalStateException();
                                                }
                                                zzalqVar.zzn(1);
                                                String strGroup5 = matcher.group(1);
                                                strGroup5.getClass();
                                                zzalqVar.zzm(Float.parseFloat(strGroup5));
                                            } else {
                                                if (strGroup.equals("em")) {
                                                    throw new IllegalStateException();
                                                }
                                                zzalqVar.zzn(2);
                                                String strGroup6 = matcher.group(1);
                                                strGroup6.getClass();
                                                zzalqVar.zzm(Float.parseFloat(strGroup6));
                                            }
                                        } else {
                                            if (strGroup.equals("%")) {
                                                throw new IllegalStateException();
                                            }
                                            zzalqVar.zzn(3);
                                            String strGroup7 = matcher.group(1);
                                            strGroup7.getClass();
                                            zzalqVar.zzm(Float.parseFloat(strGroup7));
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i = 0;
            }
            if ("}".equals(strZza2)) {
                arrayList.add(zzalqVar);
            }
            i = 0;
        }
        return arrayList;
    }
}
