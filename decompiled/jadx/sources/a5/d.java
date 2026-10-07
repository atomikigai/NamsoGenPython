package a5;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import da.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f192a = String.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale f193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s4.a f194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseArray f195d;
    public static Map e;

    static {
        Locale locale = Locale.US;
        f193b = locale;
        f194c = new s4.a(1, locale);
        SparseArray sparseArray = new SparseArray(215);
        sparseArray.put(1, Arrays.asList("US", "AG", "AI", "AS", "BB", "BM", "BS", "CA", "DM", "DO", "GD", "GU", "JM", "KN", "KY", "LC", "MP", "MS", "PR", "SX", "TC", "TT", "VC", "VG", "VI"));
        sparseArray.put(7, Arrays.asList("RU", "KZ"));
        sparseArray.put(20, Collections.singletonList("EG"));
        q1.a.r("ZA", sparseArray, 27, "GR", 30);
        q1.a.r("NL", sparseArray, 31, "BE", 32);
        q1.a.r("FR", sparseArray, 33, "ES", 34);
        q1.a.r("HU", sparseArray, 36, "IT", 39);
        q1.a.r("RO", sparseArray, 40, "CH", 41);
        sparseArray.put(43, Collections.singletonList("AT"));
        sparseArray.put(44, Arrays.asList("GB", "GG", "IM", "JE"));
        sparseArray.put(45, Collections.singletonList("DK"));
        sparseArray.put(46, Collections.singletonList("SE"));
        sparseArray.put(47, Arrays.asList("NO", "SJ"));
        sparseArray.put(48, Collections.singletonList("PL"));
        q1.a.r("DE", sparseArray, 49, "PE", 51);
        q1.a.r("MX", sparseArray, 52, "CU", 53);
        q1.a.r("AR", sparseArray, 54, "BR", 55);
        q1.a.r("CL", sparseArray, 56, "CO", 57);
        q1.a.r("VE", sparseArray, 58, "MY", 60);
        sparseArray.put(61, Arrays.asList("AU", "CC", "CX"));
        sparseArray.put(62, Collections.singletonList("ID"));
        q1.a.r("PH", sparseArray, 63, "NZ", 64);
        q1.a.r("SG", sparseArray, 65, "TH", 66);
        q1.a.r("JP", sparseArray, 81, "KR", 82);
        q1.a.r("VN", sparseArray, 84, "CN", 86);
        q1.a.r("TR", sparseArray, 90, "IN", 91);
        q1.a.r("PK", sparseArray, 92, "AF", 93);
        q1.a.r("LK", sparseArray, 94, "MM", 95);
        q1.a.r("IR", sparseArray, 98, "SS", 211);
        sparseArray.put(212, Arrays.asList("MA", "EH"));
        sparseArray.put(213, Collections.singletonList("DZ"));
        q1.a.r("TN", sparseArray, 216, "LY", 218);
        q1.a.r("GM", sparseArray, 220, "SN", 221);
        q1.a.r("MR", sparseArray, 222, "ML", 223);
        q1.a.r("GN", sparseArray, 224, "CI", 225);
        q1.a.r("BF", sparseArray, 226, "NE", 227);
        q1.a.r("TG", sparseArray, 228, "BJ", 229);
        q1.a.r("MU", sparseArray, 230, "LR", 231);
        q1.a.r("SL", sparseArray, 232, "GH", 233);
        q1.a.r("NG", sparseArray, 234, "TD", 235);
        q1.a.r("CF", sparseArray, 236, "CM", 237);
        q1.a.r("CV", sparseArray, 238, "ST", 239);
        q1.a.r("GQ", sparseArray, 240, "GA", 241);
        q1.a.r("CG", sparseArray, 242, "CD", 243);
        q1.a.r("AO", sparseArray, 244, "GW", 245);
        q1.a.r("IO", sparseArray, 246, "AC", 247);
        q1.a.r("SC", sparseArray, 248, "SD", 249);
        q1.a.r("RW", sparseArray, 250, "ET", 251);
        q1.a.r("SO", sparseArray, 252, "DJ", 253);
        q1.a.r("KE", sparseArray, 254, "TZ", 255);
        q1.a.r("UG", sparseArray, 256, "BI", 257);
        q1.a.r("MZ", sparseArray, 258, "ZM", 260);
        sparseArray.put(261, Collections.singletonList("MG"));
        sparseArray.put(262, Arrays.asList("RE", "YT"));
        sparseArray.put(263, Collections.singletonList("ZW"));
        q1.a.r("NA", sparseArray, 264, "MW", 265);
        q1.a.r("LS", sparseArray, 266, "BW", 267);
        q1.a.r("SZ", sparseArray, 268, "KM", 269);
        sparseArray.put(290, Arrays.asList("SH", "TA"));
        sparseArray.put(291, Collections.singletonList("ER"));
        q1.a.r("AW", sparseArray, 297, "FO", 298);
        q1.a.r("GL", sparseArray, 299, "GI", 350);
        q1.a.r("PT", sparseArray, 351, "LU", 352);
        q1.a.r("IE", sparseArray, 353, "IS", 354);
        q1.a.r("AL", sparseArray, 355, "MT", 356);
        sparseArray.put(357, Collections.singletonList("CY"));
        sparseArray.put(358, Arrays.asList("FI", "AX"));
        sparseArray.put(359, Collections.singletonList("BG"));
        q1.a.r("LT", sparseArray, 370, "LV", 371);
        q1.a.r("EE", sparseArray, 372, "MD", 373);
        q1.a.r("AM", sparseArray, 374, "BY", 375);
        q1.a.r("AD", sparseArray, 376, "MC", 377);
        q1.a.r("SM", sparseArray, 378, "VA", 379);
        q1.a.r("UA", sparseArray, 380, "RS", 381);
        q1.a.r("ME", sparseArray, 382, "XK", 383);
        q1.a.r("HR", sparseArray, 385, "SI", 386);
        q1.a.r("BA", sparseArray, 387, "MK", 389);
        q1.a.r("CZ", sparseArray, 420, "SK", 421);
        q1.a.r("LI", sparseArray, 423, "FK", 500);
        q1.a.r("BZ", sparseArray, 501, "GT", 502);
        q1.a.r("SV", sparseArray, 503, "HN", 504);
        q1.a.r("NI", sparseArray, 505, "CR", 506);
        q1.a.r("PA", sparseArray, 507, "PM", 508);
        sparseArray.put(509, Collections.singletonList("HT"));
        sparseArray.put(590, Arrays.asList("GP", "BL", "MF"));
        sparseArray.put(591, Collections.singletonList("BO"));
        q1.a.r("GY", sparseArray, 592, "EC", 593);
        q1.a.r("GF", sparseArray, 594, "PY", 595);
        q1.a.r("MQ", sparseArray, 596, "SR", 597);
        sparseArray.put(598, Collections.singletonList("UY"));
        sparseArray.put(599, Arrays.asList("CW", "BQ"));
        sparseArray.put(670, Collections.singletonList("TL"));
        q1.a.r("NF", sparseArray, 672, "BN", 673);
        q1.a.r("NR", sparseArray, 674, "PG", 675);
        q1.a.r("TO", sparseArray, 676, "SB", 677);
        q1.a.r("VU", sparseArray, 678, "FJ", 679);
        q1.a.r("PW", sparseArray, 680, "WF", 681);
        q1.a.r("CK", sparseArray, 682, "NU", 683);
        q1.a.r("WS", sparseArray, 685, "KI", 686);
        q1.a.r("NC", sparseArray, 687, "TV", 688);
        q1.a.r("PF", sparseArray, 689, "TK", 690);
        q1.a.r("FM", sparseArray, 691, "MH", 692);
        q1.a.r("001", sparseArray, 800, "001", 808);
        q1.a.r("KP", sparseArray, 850, "HK", 852);
        q1.a.r("MO", sparseArray, 853, "KH", 855);
        q1.a.r("LA", sparseArray, 856, "001", 870);
        q1.a.r("001", sparseArray, 878, "BD", 880);
        q1.a.r("001", sparseArray, 881, "001", 882);
        q1.a.r("001", sparseArray, 883, "TW", 886);
        q1.a.r("001", sparseArray, 888, "MV", 960);
        q1.a.r("LB", sparseArray, 961, "JO", 962);
        q1.a.r("SY", sparseArray, 963, "IQ", 964);
        q1.a.r("KW", sparseArray, 965, "SA", 966);
        q1.a.r("YE", sparseArray, 967, "OM", 968);
        q1.a.r("PS", sparseArray, 970, "AE", 971);
        q1.a.r("IL", sparseArray, 972, "BH", 973);
        q1.a.r("QA", sparseArray, 974, "BT", 975);
        q1.a.r("MN", sparseArray, 976, "NP", 977);
        q1.a.r("001", sparseArray, 979, "TJ", 992);
        q1.a.r("TM", sparseArray, 993, "AZ", 994);
        q1.a.r("GE", sparseArray, 995, "KG", 996);
        sparseArray.put(998, Collections.singletonList("UZ"));
        f195d = sparseArray;
    }

    public static String a(String str, s4.a aVar) {
        if (str.startsWith("+")) {
            return str;
        }
        return "+" + String.valueOf(aVar.f8391c) + str.replaceAll("[^\\d.]", "");
    }

    public static Integer b(String str) {
        if (e == null) {
            f();
        }
        if (str == null) {
            return null;
        }
        return (Integer) e.get(str.toUpperCase(Locale.getDefault()));
    }

    public static String c(String str) {
        String strReplaceFirst = str.replaceFirst("^\\+", "");
        int length = strReplaceFirst.length();
        for (int i = 1; i <= 3 && i <= length; i++) {
            String strSubstring = strReplaceFirst.substring(0, i);
            if (f195d.indexOfKey(Integer.valueOf(strSubstring).intValue()) >= 0) {
                return strSubstring;
            }
        }
        return null;
    }

    public static s4.a d(Context context) {
        Integer numB;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String simCountryIso = telephonyManager != null ? telephonyManager.getSimCountryIso() : null;
        Locale locale = TextUtils.isEmpty(simCountryIso) ? null : new Locale("", simCountryIso);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        s4.a aVar = f194c;
        return (locale == null || (numB = b(locale.getCountry())) == null) ? aVar : new s4.a(numB.intValue(), locale);
    }

    public static s4.f e(String str) {
        Locale locale = f193b;
        String country = locale.getCountry();
        boolean zStartsWith = str.startsWith("+");
        String str2 = f192a;
        if (zStartsWith) {
            String strC = c(str);
            if (strC != null) {
                str2 = strC;
            }
            List list = (List) f195d.get(Integer.parseInt(str2));
            country = list != null ? (String) list.get(0) : locale.getCountry();
            str = str.replaceFirst("^\\+?" + str2, "");
        }
        return new s4.f(str, country, str2);
    }

    public static void f() {
        HashMap map = new HashMap(248);
        int i = 0;
        while (true) {
            SparseArray sparseArray = f195d;
            if (i >= sparseArray.size()) {
                map.remove("TA");
                map.put("HM", 672);
                map.put("GS", 500);
                e = Collections.unmodifiableMap(map);
                return;
            }
            int iKeyAt = sparseArray.keyAt(i);
            for (String str : (List) sparseArray.get(iKeyAt)) {
                if (!str.equals("001")) {
                    if (map.containsKey(str)) {
                        throw new IllegalStateException(v.f(iKeyAt, "Duplicate regions for country code: "));
                    }
                    map.put(str, Integer.valueOf(iKeyAt));
                }
            }
            i++;
        }
    }
}
