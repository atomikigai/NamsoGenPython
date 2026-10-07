package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaky implements zzaki {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzakx zzc;
    private final zzed zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaky() {
        this(null);
    }

    private static float zzb(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j4, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j4) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j4) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j4));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = zzen.zza;
        long j4 = Long.parseLong(strGroup) * 3600000000L;
        long j10 = Long.parseLong(matcher.group(2)) * 60000000;
        return j4 + j10 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zze(zzed zzedVar, Charset charset) {
        while (true) {
            String strZzz = zzedVar.zzz(charset);
            if (strZzz == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzz)) {
                while (true) {
                    String strZzz2 = zzedVar.zzz(charset);
                    if (strZzz2 == null || (zzedVar.zzb() != 0 && zzedVar.zza(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strZzz2.split(":");
                    if (strArrSplit.length == 2) {
                        String strZza = zzfwa.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (strZza.equals("playresx")) {
                                    this.zzf = Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strZza.equals("playresy")) {
                                    try {
                                        this.zzg = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzz)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzakz zzakzVarZza = null;
                while (true) {
                    String strZzz3 = zzedVar.zzz(charset);
                    if (strZzz3 != null && (zzedVar.zzb() == 0 || zzedVar.zza(charset) != '[')) {
                        if (strZzz3.startsWith("Format:")) {
                            zzakzVarZza = zzakz.zza(strZzz3);
                        } else if (strZzz3.startsWith("Style:")) {
                            if (zzakzVarZza == null) {
                                zzdt.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzz3));
                            } else {
                                zzalb zzalbVarZzb = zzalb.zzb(strZzz3, zzakzVarZza);
                                if (zzalbVarZzb != null) {
                                    linkedHashMap.put(zzalbVarZzb.zza, zzalbVarZzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzz)) {
                zzdt.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzz)) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0285  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        Layout.Alignment alignment;
        int i11;
        int i12;
        int i13;
        Integer num;
        int i14;
        zzaky zzakyVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzakyVar.zzd.zzJ(bArr, i + i10);
        zzakyVar.zzd.zzL(i);
        Charset charsetZzC = zzakyVar.zzd.zzC();
        if (charsetZzC == null) {
            charsetZzC = StandardCharsets.UTF_8;
        }
        if (!zzakyVar.zzb) {
            zzakyVar.zze(zzakyVar.zzd, charsetZzC);
        }
        zzed zzedVar = zzakyVar.zzd;
        zzakx zzakxVarZza = zzakyVar.zzb ? zzakyVar.zzc : null;
        while (true) {
            String strZzz = zzedVar.zzz(charsetZzC);
            if (strZzz == null) {
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty()) {
                        if (i15 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        zzdgVar.zza(new zzaka(list, ((Long) arrayList2.get(i15)).longValue(), ((Long) arrayList2.get(i15 + 1)).longValue() - ((Long) arrayList2.get(i15)).longValue()));
                    } else if (i15 == 0) {
                        i15 = 0;
                        if (i15 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        zzdgVar.zza(new zzaka(list, ((Long) arrayList2.get(i15)).longValue(), ((Long) arrayList2.get(i15 + 1)).longValue() - ((Long) arrayList2.get(i15)).longValue()));
                    }
                    i15++;
                }
                return;
            }
            if (strZzz.startsWith("Format:")) {
                zzakxVarZza = zzakx.zza(strZzz);
            } else {
                if (strZzz.startsWith("Dialogue:")) {
                    if (zzakxVarZza == null) {
                        zzdt.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzz));
                    } else {
                        zzdb.zzd(strZzz.startsWith("Dialogue:"));
                        String[] strArrSplit = strZzz.substring(9).split(",", zzakxVarZza.zze);
                        if (strArrSplit.length != zzakxVarZza.zze) {
                            zzdt.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzz));
                        } else {
                            if (zzd(strArrSplit[zzakxVarZza.zza]) == -9223372036854775807L) {
                                zzdt.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                            } else {
                                long jZzd = zzd(strArrSplit[zzakxVarZza.zzb]);
                                if (jZzd == -9223372036854775807L) {
                                    zzdt.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                                } else {
                                    Map map = zzakyVar.zze;
                                    zzalb zzalbVar = (map == null || (i14 = zzakxVarZza.zzc) == -1) ? null : (zzalb) map.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[zzakxVarZza.zzd];
                                    zzala zzalaVarZza = zzala.zza(str);
                                    String strReplace = zzala.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f10 = zzakyVar.zzf;
                                    float f11 = zzakyVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcr zzcrVar = new zzcr();
                                    zzcrVar.zzl(spannableString);
                                    if (zzalbVar != null) {
                                        Integer num2 = zzalbVar.zzc;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzalbVar.zzj == 3 && (num = zzalbVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f12 = zzalbVar.zze;
                                        if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                                            zzcrVar.zzn(f12 / f11, 1);
                                        }
                                        if (!zzalbVar.zzf) {
                                            i12 = 33;
                                            i13 = 0;
                                            if (zzalbVar.zzg) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (zzalbVar.zzg) {
                                            i12 = 33;
                                            i13 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = 33;
                                            i13 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (zzalbVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i12);
                                        }
                                        if (zzalbVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i12);
                                        }
                                    } else {
                                        zzedVar = zzedVar;
                                        zzakxVarZza = zzakxVarZza;
                                        f10 = f10;
                                    }
                                    int i16 = zzalaVarZza.zza;
                                    int i17 = i16 != -1 ? i16 : zzalbVar != null ? zzalbVar.zzb : -1;
                                    switch (i17) {
                                        case 0:
                                        default:
                                            q1.a.o(i17, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcrVar.zzm(alignment);
                                    int i18 = Integer.MIN_VALUE;
                                    switch (i17) {
                                        case 0:
                                        default:
                                            q1.a.o(i17, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i11 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i11 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i11 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i11 = 2;
                                            break;
                                    }
                                    zzcrVar.zzi(i11);
                                    switch (i17) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            q1.a.o(i17, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i18 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i18 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i18 = 0;
                                            break;
                                    }
                                    zzcrVar.zzf(i18);
                                    PointF pointF = zzalaVarZza.zzb;
                                    if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                        zzcrVar.zzh(zzb(zzcrVar.zzb()));
                                        zzcrVar.zze(zzb(zzcrVar.zza()), 0);
                                    } else {
                                        zzcrVar.zzh(pointF.x / f10);
                                        zzcrVar.zze(zzalaVarZza.zzb.y / f11, 0);
                                    }
                                    zzct zzctVarZzp = zzcrVar.zzp();
                                    int iZzc = zzc(jZzd, arrayList2, arrayList);
                                    for (int iZzc2 = zzc(r13, arrayList2, arrayList); iZzc2 < iZzc; iZzc2++) {
                                        ((List) arrayList.get(iZzc2)).add(zzctVarZzp);
                                    }
                                }
                            }
                        }
                    }
                    zzedVar = zzedVar;
                    zzakxVarZza = zzakxVarZza;
                } else {
                    zzedVar = zzedVar;
                    zzakxVarZza = zzakxVarZza;
                }
                zzakyVar = this;
                charsetZzC = charsetZzC;
                zzakxVarZza = zzakxVarZza;
                zzedVar = zzedVar;
            }
        }
    }

    public zzaky(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzed();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzB = zzen.zzB((byte[]) list.get(0));
        zzdb.zzd(strZzB.startsWith("Format:"));
        zzakx zzakxVarZza = zzakx.zza(strZzB);
        zzakxVarZza.getClass();
        this.zzc = zzakxVarZza;
        zze(new zzed((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
