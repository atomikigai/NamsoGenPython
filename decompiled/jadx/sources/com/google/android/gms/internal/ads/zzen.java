package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.api.f;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzen {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static HashMap zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final int[] zzk;
    private static final int[] zzl;
    private static final int[] zzm;

    static {
        int i = Build.VERSION.SDK_INT;
        zza = i;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i;
        zzf = new byte[0];
        zzg = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzi = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzj = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzk = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzl = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzm = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static zzad zzA(int i, int i10, int i11) {
        zzab zzabVar = new zzab();
        zzabVar.zzZ("audio/raw");
        zzabVar.zzz(i10);
        zzabVar.zzaa(i11);
        zzabVar.zzT(i);
        return zzabVar.zzaf();
    }

    public static String zzB(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzC(byte[] bArr, int i, int i10) {
        return new String(bArr, i, i10, StandardCharsets.UTF_8);
    }

    public static String zzD(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzE(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzfwa.zza(str);
        int i = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzh == null) {
            zzh = zzS();
        }
        String str3 = (String) zzh.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzj;
                int length = strArr.length;
                if (i >= 18) {
                    break;
                }
                if (strZza.startsWith(strArr[i])) {
                    return String.valueOf(strArr[i + 1]).concat(String.valueOf(strZza.substring(strArr[i].length())));
                }
                i += 2;
            }
        }
        return strZza;
    }

    public static void zzF(long[] jArr, long j4, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jZzb = zzgcm.zzb(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgcm.zzb(jArr[i], jZzb, roundingMode);
                i++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jZzb2 = zzgcm.zzb(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgcm.zzd(jArr[i], jZzb2);
                i++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j12 = jArr[i10];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i10] = zzgcm.zzb(1000000L, zzgcm.zzb(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i10] = zzQ(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i10] = zzgcm.zzd(1000000L, zzgcm.zzb(j12, j10, RoundingMode.UNNECESSARY));
                }
                j11 = j10;
            } else {
                j11 = j10;
            }
            i10++;
            j10 = j11;
        }
    }

    public static boolean zzG(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static boolean zzH(zzed zzedVar, zzed zzedVar2, Inflater inflater) {
        boolean z4 = false;
        if (zzedVar.zzb() <= 0) {
            return false;
        }
        if (zzedVar2.zzc() < zzedVar.zzb()) {
            int iZzb = zzedVar.zzb();
            zzedVar2.zzF(iZzb + iZzb);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzedVar.zzN(), zzedVar.zzd(), zzedVar.zzb());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(zzedVar2.zzN(), iInflate, zzedVar2.zzc() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == zzedVar2.zzc()) {
                        int iZzc = zzedVar2.zzc();
                        zzedVar2.zzF(iZzc + iZzc);
                    }
                } else {
                    zzedVar2.zzK(iInflate);
                    z4 = true;
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z4;
    }

    public static boolean zzI(Context context) {
        return zza >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzJ(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean zzK(Context context) {
        int i = zza;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i == 30) {
            String str = zzd;
            if (zzfwa.zzc(str, "moto g(20)") || zzfwa.zzc(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && zzfwa.zzc(zzd, "sm-x200");
    }

    public static boolean zzL(int i) {
        return i == 10 || i == 13;
    }

    public static boolean zzM(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzN(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Object[] zzO(Object[] objArr, int i) {
        zzdb.zzd(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    private static int zzP(int i, int i10) {
        return (char) (zzl[i ^ (i10 >> 12)] ^ ((char) (i10 << 4)));
    }

    private static long zzQ(long j4, long j10, long j11, RoundingMode roundingMode) {
        long jZzd = zzgcm.zzd(j4, j10);
        if (jZzd != Long.MAX_VALUE && jZzd != Long.MIN_VALUE) {
            return zzgcm.zzb(jZzd, j11, roundingMode);
        }
        long jZzc = zzgcm.zzc(Math.abs(j10), Math.abs(j11));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZzb = zzgcm.zzb(j10, jZzc, roundingMode2);
        long jZzb2 = zzgcm.zzb(j11, jZzc, roundingMode2);
        long jZzc2 = zzgcm.zzc(Math.abs(j4), Math.abs(jZzb2));
        long jZzb3 = zzgcm.zzb(j4, jZzc2, roundingMode2);
        long jZzb4 = zzgcm.zzb(jZzb2, jZzc2, roundingMode2);
        long jZzd2 = zzgcm.zzd(jZzb3, jZzb);
        if (jZzd2 != Long.MAX_VALUE && jZzd2 != Long.MIN_VALUE) {
            return zzgcm.zzb(jZzd2, jZzb4, roundingMode);
        }
        double d10 = (jZzb / jZzb4) * jZzb3;
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgch.zzb(d10, roundingMode);
    }

    private static String zzR(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            zzdt.zzd("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static HashMap zzS() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzi.length;
        HashMap map = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzi;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static int zza(long[] jArr, long j4, boolean z4, boolean z10) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j4);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j4) {
                break;
            }
            iBinarySearch = i;
        }
        return !z4 ? i : iBinarySearch;
    }

    public static int zzb(zzdu zzduVar, long j4, boolean z4, boolean z10) {
        int iZza = zzduVar.zza() - 1;
        int i = 0;
        while (i <= iZza) {
            int i10 = (i + iZza) >>> 1;
            if (zzduVar.zzb(i10) < j4) {
                i = i10 + 1;
            } else {
                iZza = i10 - 1;
            }
        }
        int i11 = iZza + 1;
        if (i11 < zzduVar.zza() && zzduVar.zzb(i11) == j4) {
            return i11;
        }
        if (iZza == -1) {
            return 0;
        }
        return iZza;
    }

    public static int zzc(int[] iArr, int i, boolean z4, boolean z10) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || iArr[i10] != i) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z4 ? iBinarySearch : i10;
        }
        return z10 ? Math.max(0, i11) : i11;
    }

    public static int zzd(long[] jArr, long j4, boolean z4, boolean z10) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j4);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j4) {
                    break;
                }
                iBinarySearch = i10;
            }
            i = iBinarySearch;
        }
        return z10 ? Math.max(0, i) : i;
    }

    public static int zze(byte[] bArr, int i, int i10, int i11) {
        int iZzP = 65535;
        for (int i12 = 0; i12 < i10; i12++) {
            byte b10 = bArr[i12];
            iZzP = zzP(b10 & 15, zzP((b10 & 255) >> 4, iZzP));
        }
        return iZzP;
    }

    public static int zzf(byte[] bArr, int i, int i10, int i11) {
        while (i < i10) {
            i11 = zzk[(i11 >>> 24) ^ (bArr[i] & 255)] ^ (i11 << 8);
            i++;
        }
        return i11;
    }

    public static int zzg(byte[] bArr, int i, int i10, int i11) {
        int i12 = 0;
        while (i < i10) {
            i12 = zzm[i12 ^ (bArr[i] & 255)];
            i++;
        }
        return i12;
    }

    public static int zzh(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return f.API_PRIORITY_OTHER;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int zzi(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (zza >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static int zzj(ByteBuffer byteBuffer, int i) {
        int i10 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    public static int zzk(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzl(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case zzbbs.zzt.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzm(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z4 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i = Integer.parseInt(str2);
            return z4 ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int zzn(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    public static int zzo(Uri uri) {
        int i;
        String scheme = uri.getScheme();
        if (scheme != null && zzfwa.zzc("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (zzfwa.zza(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    i = 1;
                    break;
                case "mpd":
                    i = 0;
                    break;
                case "isml":
                    i = 1;
                    break;
                case "m3u8":
                    i = 2;
                    break;
                default:
                    i = 4;
                    break;
            }
            if (i != 4) {
                return i;
            }
        }
        Pattern pattern = zzg;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long zzp(long j4, int i) {
        return zzu(j4, i, 1000000L, RoundingMode.CEILING);
    }

    public static long zzq(long j4, float f10) {
        return f10 == 1.0f ? j4 : Math.round(j4 * ((double) f10));
    }

    public static long zzr(long j4, float f10) {
        return f10 == 1.0f ? j4 : Math.round(j4 / ((double) f10));
    }

    public static long zzs(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    public static long zzt(long j4, int i) {
        return zzu(j4, 1000000L, i, RoundingMode.FLOOR);
    }

    public static long zzu(long j4, long j10, long j11, RoundingMode roundingMode) {
        if (j4 == 0 || j10 == 0) {
            return 0L;
        }
        if (j11 >= j10 && j11 % j10 == 0) {
            return zzgcm.zzb(j4, zzgcm.zzb(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j11 < j10 && j10 % j11 == 0) {
            return zzgcm.zzd(j4, zzgcm.zzb(j10, j11, RoundingMode.UNNECESSARY));
        }
        if (j11 < j4 || j11 % j4 != 0) {
            return (j11 >= j4 || j4 % j11 != 0) ? zzQ(j4, j10, j11, roundingMode) : zzgcm.zzd(j10, zzgcm.zzb(j4, j11, RoundingMode.UNNECESSARY));
        }
        return zzgcm.zzb(j10, zzgcm.zzb(j11, j4, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzv(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 / 1000;
    }

    public static Point zzw(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzM(context)) {
            String strZzR = zza < 28 ? zzR("sys.display-size") : zzR("vendor.display-size");
            if (!TextUtils.isEmpty(strZzR)) {
                try {
                    String[] strArrSplit = strZzR.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i10 > 0) {
                            return new Point(i, i10);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzdt.zzc("Util", "Invalid display size: ".concat(String.valueOf(strZzR)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzx(int i, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i10).setEncoding(i11).build();
    }

    public static Handler zzy(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        zzdb.zzb(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Looper zzz() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }
}
