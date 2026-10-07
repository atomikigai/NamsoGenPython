package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzde {
    private static final Pattern zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        zzd = map;
        q1.a.p(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        q1.a.p(-983041, map, "azure", -657956, "beige");
        q1.a.p(-6972, map, "bisque", -16777216, "black");
        q1.a.p(-5171, map, "blanchedalmond", -16776961, "blue");
        q1.a.p(-7722014, map, "blueviolet", -5952982, "brown");
        q1.a.p(-2180985, map, "burlywood", -10510688, "cadetblue");
        q1.a.p(-8388864, map, "chartreuse", -2987746, "chocolate");
        q1.a.p(-32944, map, "coral", -10185235, "cornflowerblue");
        q1.a.p(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        q1.a.p(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        q1.a.p(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        q1.a.p(-29696, map, "darkorange", -6737204, "darkorchid");
        q1.a.p(-7667712, map, "darkred", -1468806, "darksalmon");
        q1.a.p(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        q1.a.p(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        q1.a.p(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        q1.a.p(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        q1.a.p(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        q1.a.p(-38476, map, "hotpink", -3318692, "indianred");
        q1.a.p(-11861886, map, "indigo", -16, "ivory");
        q1.a.p(-989556, map, "khaki", -1644806, "lavender");
        q1.a.p(-3851, map, "lavenderblush", -8586240, "lawngreen");
        q1.a.p(-1331, map, "lemonchiffon", -5383962, "lightblue");
        q1.a.p(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        q1.a.p(-18751, map, "lightpink", -24454, "lightsalmon");
        q1.a.p(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        q1.a.p(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        q1.a.p(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        q1.a.p(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        q1.a.p(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        q1.a.p(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        q1.a.p(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        q1.a.p(-15132304, map, "midnightblue", -655366, "mintcream");
        q1.a.p(-6943, map, "mistyrose", -6987, "moccasin");
        q1.a.p(-8531, map, "navajowhite", -16777088, "navy");
        q1.a.p(-133658, map, "oldlace", -8355840, "olive");
        q1.a.p(-9728477, map, "olivedrab", -23296, "orange");
        q1.a.p(-47872, map, "orangered", -2461482, "orchid");
        q1.a.p(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        q1.a.p(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        q1.a.p(-4139, map, "papayawhip", -9543, "peachpuff");
        q1.a.p(-3308225, map, "peru", -16181, "pink");
        q1.a.p(-2252579, map, "plum", -5185306, "powderblue");
        q1.a.p(-8388480, map, "purple", -10079335, "rebeccapurple");
        q1.a.p(-65536, map, "red", -4419697, "rosybrown");
        q1.a.p(-12490271, map, "royalblue", -7650029, "saddlebrown");
        q1.a.p(-360334, map, "salmon", -744352, "sandybrown");
        q1.a.p(-13726889, map, "seagreen", -2578, "seashell");
        q1.a.p(-6270419, map, "sienna", -4144960, "silver");
        q1.a.p(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        q1.a.p(-12156236, map, "steelblue", -2968436, "tan");
        q1.a.p(-16744320, map, "teal", -2572328, "thistle");
        q1.a.p(-40121, map, "tomato", 0, "transparent");
        q1.a.p(-12525360, map, "turquoise", -1146130, "violet");
        q1.a.p(-663885, map, "wheat", -1, "white");
        q1.a.p(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int zza(String str) {
        return zzc(str, true);
    }

    public static int zzb(String str) {
        return zzc(str, false);
    }

    private static int zzc(String str, boolean z4) {
        int i;
        zzdb.zzd(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i10 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i10;
            }
            if (strReplace.length() == 9) {
                return ((i10 & 255) << 24) | (i10 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z4 ? zzc : zzb).matcher(strReplace);
            if (matcher.matches()) {
                if (z4) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i11 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i12 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i11, i12, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = zza.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i13 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i14 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i13, i14, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) zzd.get(zzfwa.zza(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
