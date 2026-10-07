package com.google.android.gms.internal.ads;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzali implements zzaki {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalg zzh = new zzalg(30.0f, 1, 1);

    public zzali() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static long zzc(String str, zzalg zzalgVar) throws zzake {
        double d10;
        double d11;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j4 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j10 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j4 + j10;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = 0.0d;
            double d15 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d16 = d12 + d13;
            String strGroup5 = matcher.group(5);
            double d17 = strGroup5 != null ? Long.parseLong(strGroup5) / zzalgVar.zza : 0.0d;
            double d18 = d16 + d15;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d14 = (Long.parseLong(strGroup6) / ((double) zzalgVar.zzb)) / ((double) zzalgVar.zza);
            }
            return (long) ((d18 + d17 + d14) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzake("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d19 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals("s");
                        } else if (iHashCode == 116 && strGroup8.equals("t")) {
                            d10 = zzalgVar.zzc;
                            d19 /= d10;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d10 = 1000.0d;
                        d19 /= d10;
                    }
                } else if (strGroup8.equals("m")) {
                    d11 = 60.0d;
                    d19 *= d11;
                }
            } else if (strGroup8.equals("h")) {
                d11 = 3600.0d;
                d19 *= d11;
            }
        } else if (strGroup8.equals("f")) {
            d10 = zzalgVar.zza;
            d19 /= d10;
        }
        return (long) (d19 * 1000000.0d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Layout.Alignment zzd(String str) {
        String strZza = zzfwa.zza(str);
        switch (strZza.hashCode()) {
            case -1364013995:
                if (strZza.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strZza.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strZza.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strZza.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strZza.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static zzall zze(zzall zzallVar) {
        return zzallVar == null ? new zzall() : zzallVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0250  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:180:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0118 A[Catch: zzake -> 0x0173, TryCatch #0 {zzake -> 0x0173, blocks: (B:34:0x00ab, B:36:0x00bb, B:39:0x00d1, B:42:0x00d9, B:44:0x00df, B:53:0x00f7, B:62:0x0112, B:64:0x0118, B:65:0x0121, B:66:0x0122, B:67:0x013b, B:57:0x0103, B:61:0x010f, B:68:0x013c, B:69:0x013d, B:70:0x0156, B:38:0x00c4, B:71:0x0157, B:72:0x0172), top: B:165:0x00ab }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static zzall zzf(XmlPullParser xmlPullParser, zzall zzallVar) {
        Matcher matcher;
        String strGroup;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        zzallVar = zze(zzallVar);
                        zzallVar.zzt("italic".equalsIgnoreCase(attributeValue));
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        zzallVar = zze(zzallVar);
                        zzallVar.zzp(attributeValue);
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        zzallVar = zze(zzallVar);
                        zzallVar.zzz(zzd(attributeValue));
                    }
                    break;
                case -879295043:
                    if (!attributeName.equals("textDecoration")) {
                        break;
                    } else {
                        String strZza = zzfwa.zza(attributeValue);
                        switch (strZza.hashCode()) {
                            case -1461280213:
                                if (strZza.equals("nounderline")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzC(false);
                                }
                                break;
                            case -1026963764:
                                if (strZza.equals("underline")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzC(true);
                                }
                                break;
                            case 913457136:
                                if (strZza.equals("nolinethrough")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzu(false);
                                }
                                break;
                            case 1679736913:
                                if (strZza.equals("linethrough")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzu(true);
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        zzallVar = zze(zzallVar);
                        zzallVar.zzn("bold".equalsIgnoreCase(attributeValue));
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        zzallVar = zze(zzallVar);
                        zzallVar.zzs(attributeValue);
                    }
                    break;
                case 3511770:
                    if (!attributeName.equals("ruby")) {
                        break;
                    } else {
                        String strZza2 = zzfwa.zza(attributeValue);
                        switch (strZza2.hashCode()) {
                            case -618561360:
                                if (strZza2.equals("baseContainer")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzx(2);
                                }
                                break;
                            case -410956671:
                                if (strZza2.equals("container")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzx(1);
                                }
                                break;
                            case -250518009:
                                if (strZza2.equals("delimiter")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzx(4);
                                }
                                break;
                            case -136074796:
                                if (strZza2.equals("textContainer")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzx(3);
                                }
                                break;
                            case 3016401:
                                if (strZza2.equals("base")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzx(2);
                                }
                                break;
                            case 3556653:
                                if (strZza2.equals("text")) {
                                    zzallVar = zze(zzallVar);
                                    zzallVar.zzx(3);
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        zzallVar = zze(zzallVar);
                        try {
                            zzallVar.zzo(zzde.zzb(attributeValue));
                        } catch (IllegalArgumentException unused) {
                            q1.a.s(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        zzallVar = zze(zzallVar);
                        Matcher matcher2 = zza.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                }
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                            } catch (NumberFormatException e) {
                                zzdt.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                            }
                        } else {
                            q1.a.s(attributeValue, "Invalid value for shear: ", "TtmlParser");
                        }
                        zzallVar.zzy(fMin);
                    } else {
                        continue;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strZza3 = zzfwa.zza(attributeValue);
                        int iHashCode = strZza3.hashCode();
                        if (iHashCode != 96673) {
                            if (iHashCode == 3387192 && strZza3.equals("none")) {
                                zzallVar = zze(zzallVar);
                                zzallVar.zzA(false);
                            }
                        } else if (strZza3.equals("all")) {
                            zzallVar = zze(zzallVar);
                            zzallVar.zzA(true);
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            zzallVar = zze(zzallVar);
                            int i10 = zzen.zza;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            if (length == 1) {
                                matcher = zze.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    throw new zzake("Invalid number of entries for fontSize: " + length + ".");
                                }
                                matcher = zze.matcher(strArrSplit[1]);
                                zzdt.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                throw new zzake("Invalid expression for fontSize: '" + attributeValue + "'.");
                            }
                            String strGroup3 = matcher.group(3);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            int iHashCode2 = strGroup3.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup3.equals("%")) {
                                    throw new zzake("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                zzallVar.zzr(3);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                zzallVar.zzq(Float.parseFloat(strGroup));
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup3.equals("em")) {
                                    throw new zzake("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                zzallVar.zzr(2);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                zzallVar.zzq(Float.parseFloat(strGroup));
                            } else {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    throw new zzake("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                zzallVar.zzr(1);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                zzallVar.zzq(Float.parseFloat(strGroup));
                            }
                        } catch (zzake unused2) {
                            q1.a.s(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        }
                    } else {
                        continue;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        zzallVar = zze(zzallVar);
                        zzallVar.zzB(zzale.zza(attributeValue));
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strZza4 = zzfwa.zza(attributeValue);
                        int iHashCode3 = strZza4.hashCode();
                        if (iHashCode3 != -1392885889) {
                            if (iHashCode3 == 92734940 && strZza4.equals("after")) {
                                zzallVar = zze(zzallVar);
                                zzallVar.zzw(2);
                            }
                        } else if (strZza4.equals("before")) {
                            zzallVar = zze(zzallVar);
                            zzallVar.zzw(1);
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        zzallVar = zze(zzallVar);
                        try {
                            zzallVar.zzm(zzde.zzb(attributeValue));
                        } catch (IllegalArgumentException unused3) {
                            q1.a.s(attributeValue, "Failed parsing background value: ", "TtmlParser");
                        }
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        zzallVar = zze(zzallVar);
                        zzallVar.zzv(zzd(attributeValue));
                    }
                    break;
            }
        }
        return zzallVar;
    }

    private static String[] zzg(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = zzen.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        zzakc.zza(zzb(bArr, i, i10), zzakhVar, zzdgVar);
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03a7 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03be A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, NumberFormatException -> 0x03d8, TryCatch #8 {NumberFormatException -> 0x03d8, blocks: (B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:196:0x03d6, B:197:0x03d7), top: B:397:0x03b8 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03cb A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, NumberFormatException -> 0x03d8, TryCatch #8 {NumberFormatException -> 0x03d8, blocks: (B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:196:0x03d6, B:197:0x03d7), top: B:397:0x03b8 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x03e0 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x03e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x03e8 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:207:0x03f8 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, NumberFormatException -> 0x04a8, TryCatch #1 {NumberFormatException -> 0x04a8, blocks: (B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7), top: B:389:0x03f2 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0403 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, NumberFormatException -> 0x04a8, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x04a8, blocks: (B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7), top: B:389:0x03f2 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x041d A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x042a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0430  */
    /* JADX WARN: Code duplicated, block: B:222:0x043f  */
    /* JADX WARN: Code duplicated, block: B:224:0x0447  */
    /* JADX WARN: Code duplicated, block: B:225:0x0451  */
    /* JADX WARN: Code duplicated, block: B:229:0x0462 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x046e  */
    /* JADX WARN: Code duplicated, block: B:234:0x0473  */
    /* JADX WARN: Code duplicated, block: B:237:0x0479  */
    /* JADX WARN: Code duplicated, block: B:240:0x0484  */
    /* JADX WARN: Code duplicated, block: B:243:0x048d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0495  */
    /* JADX WARN: Code duplicated, block: B:246:0x0498  */
    /* JADX WARN: Code duplicated, block: B:252:0x04b1 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x04bc A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x04fb A[LOOP:1: B:129:0x028b->B:265:0x04fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:412:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #15 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:376:0x06e2, B:127:0x0285, B:129:0x028b, B:131:0x0294, B:133:0x02a3, B:135:0x02b0, B:137:0x02c6, B:139:0x02cc, B:262:0x04ef, B:141:0x02d9, B:144:0x02e5, B:146:0x02eb, B:148:0x02f4, B:150:0x02fa, B:151:0x0301, B:154:0x0308, B:261:0x04ea, B:157:0x031a, B:159:0x0322, B:163:0x0343, B:165:0x0349, B:167:0x0356, B:184:0x03a1, B:186:0x03a7, B:190:0x03b8, B:192:0x03be, B:194:0x03cb, B:211:0x0415, B:213:0x041d, B:227:0x0458, B:229:0x0462, B:247:0x049a, B:196:0x03d6, B:197:0x03d7, B:198:0x03d8, B:199:0x03e0, B:202:0x03e8, B:205:0x03f2, B:207:0x03f8, B:209:0x0403, B:249:0x04a6, B:250:0x04a7, B:251:0x04a8, B:252:0x04b1, B:253:0x04bc, B:168:0x035f, B:169:0x0360, B:170:0x0361, B:172:0x036c, B:175:0x0376, B:178:0x037f, B:180:0x0385, B:182:0x0390, B:255:0x04c3, B:256:0x04c4, B:257:0x04c5, B:258:0x04ce, B:259:0x04d9, B:267:0x0511, B:269:0x0534, B:312:0x05f6, B:274:0x055a, B:277:0x0563, B:348:0x0666, B:288:0x0589, B:295:0x05a6, B:301:0x05c0, B:305:0x05d8, B:309:0x05ee, B:315:0x0607, B:319:0x0613, B:323:0x061b, B:331:0x062d, B:339:0x0640, B:341:0x064e, B:343:0x0653, B:334:0x0634, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:352:0x0687, B:355:0x0698, B:358:0x069c, B:360:0x06a6, B:362:0x06b0, B:366:0x06c0, B:364:0x06b9, B:370:0x06d4, B:374:0x06dc, B:381:0x06fb), top: B:408:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, NumberFormatException -> 0x01d1, TryCatch #10 {NumberFormatException -> 0x01d1, blocks: (B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0), top: B:400:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, NumberFormatException -> 0x01d1, TryCatch #10 {NumberFormatException -> 0x01d1, blocks: (B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0), top: B:400:0x01b3 }] */
    /* JADX WARN: Failed to find 'out' block for switch in B:270:0x0540. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.google.android.gms.internal.ads.zzalj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.google.android.gms.internal.ads.zzalh] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r44v1, types: [com.google.android.gms.internal.ads.zzall, java.lang.Throwable] */
    public final zzakd zzb(byte[] bArr, int i, int i10) {
        String str;
        String str2;
        HashMap map;
        HashMap map2;
        zzalm zzalmVar;
        int i11;
        ArrayDeque arrayDeque;
        zzalf zzalfVar;
        HashMap map3;
        HashMap map4;
        zzalg zzalgVar;
        zzalf zzalfVar2;
        zzalf zzalfVar3;
        long j4;
        long j10;
        Object obj;
        int i12;
        String str3;
        String str4;
        ?? zzaljVar;
        float f10;
        float f11;
        String strZza;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i13;
        String strGroup2;
        float f12;
        float f13;
        float f14;
        String strZza2;
        int i14;
        float f15;
        String strZza3;
        int i15;
        String strZza4;
        int iHashCode;
        String strZza5;
        int iHashCode2;
        String strGroup3;
        float f16;
        String strGroup4;
        String strZza6;
        float f17;
        zzalg zzalgVar2;
        int i16;
        boolean z4;
        String strZza7;
        Matcher matcher3;
        String strGroup5;
        int i17;
        String strGroup6;
        ?? zzalhVar;
        String str5 = "";
        String str6 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            HashMap map7 = new HashMap();
            map6.put("", new zzalj("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i10), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzalg zzalgVar3 = zzh;
            zzalm zzalmVar2 = null;
            ?? r15 = 0;
            int i18 = 0;
            int i19 = 15;
            while (eventType != 1) {
                zzalf zzalfVar4 = (zzalf) arrayDeque2.peek();
                ?? r44 = obj2;
                if (i18 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str5;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRate");
                            int i20 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                int i21 = zzen.zza;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                zzdb.zze(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f17 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f17 = 1.0f;
                            }
                            zzalg zzalgVar4 = zzh;
                            float f18 = f17;
                            int i22 = zzalgVar4.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str6, "subFrameRate");
                            int i23 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i22;
                            int i24 = zzalgVar4.zzc;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str6, "tickRate");
                            zzalg zzalgVar5 = new zzalg(i20 * f18, i23, attributeValue4 != null ? Integer.parseInt(attributeValue4) : i24);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str6, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str6;
                            } else {
                                Matcher matcher4 = zzg.matcher(attributeValue5);
                                str2 = str6;
                                if (matcher4.matches()) {
                                    try {
                                        String strGroup7 = matcher4.group(1);
                                        if (strGroup7 == null) {
                                            throw r44;
                                        }
                                        int i25 = Integer.parseInt(strGroup7);
                                        zzalgVar2 = zzalgVar5;
                                        try {
                                            String strGroup8 = matcher4.group(2);
                                            if (strGroup8 == null) {
                                                throw r44;
                                            }
                                            i16 = Integer.parseInt(strGroup8);
                                            try {
                                                try {
                                                    if (i25 != 0) {
                                                        if (i16 != 0) {
                                                            z4 = true;
                                                        } else {
                                                            i16 = 0;
                                                            z4 = false;
                                                        }
                                                        StringBuilder sb2 = new StringBuilder();
                                                        zzalfVar = zzalfVar4;
                                                        sb2.append("Invalid cell resolution ");
                                                        sb2.append(i25);
                                                        sb2.append(" ");
                                                        sb2.append(i16);
                                                        zzdb.zze(z4, sb2.toString());
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    sb2.append("Invalid cell resolution ");
                                                    sb2.append(i25);
                                                    sb2.append(" ");
                                                    sb2.append(i16);
                                                    zzdb.zze(z4, sb2.toString());
                                                } catch (NumberFormatException unused) {
                                                    zzdt.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                    i16 = 15;
                                                }
                                                StringBuilder sb3 = new StringBuilder();
                                                zzalfVar = zzalfVar4;
                                            } catch (NumberFormatException unused2) {
                                                zzalfVar = zzalfVar4;
                                            }
                                        } catch (NumberFormatException unused3) {
                                            arrayDeque2 = arrayDeque2;
                                        }
                                        zzalfVar = zzalfVar4;
                                    } catch (NumberFormatException unused4) {
                                        arrayDeque2 = arrayDeque2;
                                        zzalfVar = zzalfVar4;
                                        zzalgVar2 = zzalgVar5;
                                    }
                                    zzdt.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i16 = 15;
                                } else {
                                    zzdt.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                                strZza7 = zzeo.zza(xmlPullParserNewPullParser, "extent");
                                if (strZza7 == null) {
                                    zzalhVar = r44;
                                } else {
                                    matcher3 = zzf.matcher(strZza7);
                                    if (matcher3.matches()) {
                                        try {
                                            strGroup5 = matcher3.group(1);
                                            if (strGroup5 != null) {
                                                throw r44;
                                            }
                                            i17 = Integer.parseInt(strGroup5);
                                            strGroup6 = matcher3.group(2);
                                            if (strGroup6 != null) {
                                                throw r44;
                                            }
                                            zzalhVar = new zzalh(i17, Integer.parseInt(strGroup6));
                                        } catch (NumberFormatException unused5) {
                                            zzdt.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(strZza7));
                                            zzalhVar = r44;
                                        }
                                    } else {
                                        zzdt.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza7));
                                    }
                                    zzalhVar = r44;
                                }
                                i19 = i16;
                                zzalgVar3 = zzalgVar2;
                                r15 = zzalhVar;
                            }
                            arrayDeque2 = arrayDeque2;
                            zzalfVar = zzalfVar4;
                            zzalgVar2 = zzalgVar5;
                            i16 = 15;
                            strZza7 = zzeo.zza(xmlPullParserNewPullParser, "extent");
                            if (strZza7 == null) {
                                zzalhVar = r44;
                            } else {
                                matcher3 = zzf.matcher(strZza7);
                                if (matcher3.matches()) {
                                    zzdt.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza7));
                                } else {
                                    strGroup5 = matcher3.group(1);
                                    if (strGroup5 != null) {
                                        throw r44;
                                    }
                                    i17 = Integer.parseInt(strGroup5);
                                    strGroup6 = matcher3.group(2);
                                    if (strGroup6 != null) {
                                        throw r44;
                                    }
                                    zzalhVar = new zzalh(i17, Integer.parseInt(strGroup6));
                                }
                                zzalhVar = r44;
                            }
                            i19 = i16;
                            zzalgVar3 = zzalgVar2;
                            r15 = zzalhVar;
                        } else {
                            str2 = str6;
                            arrayDeque2 = arrayDeque2;
                            zzalfVar = zzalfVar4;
                            zzalmVar2 = zzalmVar2;
                            i19 = i19;
                            r15 = r15;
                        }
                        String str7 = "image";
                        String str8 = "metadata";
                        String str9 = "style";
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzeo.zzc(xmlPullParserNewPullParser, str9)) {
                                        String strZza8 = zzeo.zza(xmlPullParserNewPullParser, str9);
                                        zzall zzallVarZzf = zzf(xmlPullParserNewPullParser, new zzall());
                                        if (strZza8 != null) {
                                            String[] strArrZzg = zzg(strZza8);
                                            int i26 = 0;
                                            for (int length = strArrZzg.length; i26 < length; length = length) {
                                                zzallVarZzf.zzl((zzall) map5.get(strArrZzg[i26]));
                                                i26++;
                                            }
                                        }
                                        String strZzE = zzallVarZzf.zzE();
                                        if (strZzE != null) {
                                            map5.put(strZzE, zzallVarZzf);
                                        }
                                    } else {
                                        zzalgVar3 = zzalgVar3;
                                        str9 = str9;
                                        if (zzeo.zzc(xmlPullParserNewPullParser, "region")) {
                                            String strZza9 = zzeo.zza(xmlPullParserNewPullParser, "id");
                                            if (strZza9 == null) {
                                                zzaljVar = r44;
                                                str3 = str7;
                                                map3 = map5;
                                                map4 = map7;
                                                str4 = str8;
                                            } else {
                                                String strZza10 = zzeo.zza(xmlPullParserNewPullParser, "origin");
                                                if (strZza10 != null) {
                                                    Pattern pattern = zzb;
                                                    Matcher matcher5 = pattern.matcher(strZza10);
                                                    Pattern pattern2 = zzf;
                                                    str3 = str7;
                                                    Matcher matcher6 = pattern2.matcher(strZza10);
                                                    str4 = str8;
                                                    map3 = map5;
                                                    if (matcher5.matches()) {
                                                        map4 = map7;
                                                        try {
                                                            String strGroup9 = matcher5.group(1);
                                                            if (strGroup9 == null) {
                                                                throw r44;
                                                            }
                                                            float f19 = Float.parseFloat(strGroup9) / 100.0f;
                                                            String strGroup10 = matcher5.group(2);
                                                            if (strGroup10 == null) {
                                                                throw r44;
                                                            }
                                                            f10 = Float.parseFloat(strGroup10) / 100.0f;
                                                            f11 = f19;
                                                            strZza = zzeo.zza(xmlPullParserNewPullParser, "extent");
                                                            if (strZza != null) {
                                                                matcher = pattern.matcher(strZza);
                                                                matcher2 = pattern2.matcher(strZza);
                                                                if (matcher.matches()) {
                                                                    try {
                                                                        strGroup3 = matcher.group(1);
                                                                        if (strGroup3 != null) {
                                                                            throw r44;
                                                                        }
                                                                        f16 = Float.parseFloat(strGroup3) / 100.0f;
                                                                        strGroup4 = matcher.group(2);
                                                                        if (strGroup4 != null) {
                                                                            throw r44;
                                                                        }
                                                                        f12 = Float.parseFloat(strGroup4) / 100.0f;
                                                                        f13 = f16;
                                                                        f14 = f12;
                                                                        strZza2 = zzeo.zza(xmlPullParserNewPullParser, "displayAlign");
                                                                        if (strZza2 != null) {
                                                                            strZza5 = zzfwa.zza(strZza2);
                                                                            iHashCode2 = strZza5.hashCode();
                                                                            if (iHashCode2 != -1364013995) {
                                                                                if (iHashCode2 != 92734940 && strZza5.equals("after")) {
                                                                                    f15 = f10 + f14;
                                                                                    i14 = 2;
                                                                                } else {
                                                                                    i14 = 0;
                                                                                    f15 = f10;
                                                                                }
                                                                            } else if (strZza5.equals("center")) {
                                                                                f15 = f10 + (f14 / 2.0f);
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 0;
                                                                                f15 = f10;
                                                                            }
                                                                        } else {
                                                                            i14 = 0;
                                                                            f15 = f10;
                                                                        }
                                                                        float f20 = 1.0f / i19;
                                                                        strZza3 = zzeo.zza(xmlPullParserNewPullParser, "writingMode");
                                                                        if (strZza3 != null) {
                                                                            strZza4 = zzfwa.zza(strZza3);
                                                                            iHashCode = strZza4.hashCode();
                                                                            if (iHashCode != 3694) {
                                                                                if (iHashCode != 3553396) {
                                                                                    if (iHashCode == 3553576 && strZza4.equals("tbrl")) {
                                                                                        i15 = 1;
                                                                                    }
                                                                                } else if (strZza4.equals("tblr")) {
                                                                                    i15 = 2;
                                                                                }
                                                                                i15 = Integer.MIN_VALUE;
                                                                            } else if (strZza4.equals("tb")) {
                                                                                i15 = 2;
                                                                            } else {
                                                                                i15 = Integer.MIN_VALUE;
                                                                            }
                                                                        } else {
                                                                            i15 = Integer.MIN_VALUE;
                                                                        }
                                                                        zzaljVar = new zzalj(strZza9, f11, f15, 0, i14, f13, f14, 1, f20, i15);
                                                                    } catch (NumberFormatException unused6) {
                                                                        zzdt.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza10));
                                                                        zzaljVar = r44;
                                                                    }
                                                                } else if (matcher2.matches()) {
                                                                    zzdt.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza10));
                                                                } else if (r15 == 0) {
                                                                    zzdt.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza10));
                                                                } else {
                                                                    try {
                                                                        strGroup = matcher2.group(1);
                                                                        if (strGroup != null) {
                                                                            throw r44;
                                                                        }
                                                                        i13 = Integer.parseInt(strGroup);
                                                                        strGroup2 = matcher2.group(2);
                                                                        if (strGroup2 != null) {
                                                                            throw r44;
                                                                        }
                                                                        int i27 = Integer.parseInt(strGroup2);
                                                                        float f21 = i13 / r15.zza;
                                                                        f12 = i27 / r15.zzb;
                                                                        f13 = f21;
                                                                        f14 = f12;
                                                                        strZza2 = zzeo.zza(xmlPullParserNewPullParser, "displayAlign");
                                                                        if (strZza2 != null) {
                                                                            strZza5 = zzfwa.zza(strZza2);
                                                                            iHashCode2 = strZza5.hashCode();
                                                                            if (iHashCode2 != -1364013995) {
                                                                                if (iHashCode2 != 92734940) {
                                                                                    i14 = 0;
                                                                                    f15 = f10;
                                                                                } else {
                                                                                    f15 = f10 + f14;
                                                                                    i14 = 2;
                                                                                }
                                                                            } else if (strZza5.equals("center")) {
                                                                                f15 = f10 + (f14 / 2.0f);
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 0;
                                                                                f15 = f10;
                                                                            }
                                                                        } else {
                                                                            i14 = 0;
                                                                            f15 = f10;
                                                                        }
                                                                        float f22 = 1.0f / i19;
                                                                        strZza3 = zzeo.zza(xmlPullParserNewPullParser, "writingMode");
                                                                        if (strZza3 != null) {
                                                                            strZza4 = zzfwa.zza(strZza3);
                                                                            iHashCode = strZza4.hashCode();
                                                                            if (iHashCode != 3694) {
                                                                                if (iHashCode != 3553396) {
                                                                                    if (iHashCode == 3553576) {
                                                                                        i15 = 1;
                                                                                    }
                                                                                } else if (strZza4.equals("tblr")) {
                                                                                    i15 = 2;
                                                                                }
                                                                                i15 = Integer.MIN_VALUE;
                                                                            } else if (strZza4.equals("tb")) {
                                                                                i15 = 2;
                                                                            } else {
                                                                                i15 = Integer.MIN_VALUE;
                                                                            }
                                                                        } else {
                                                                            i15 = Integer.MIN_VALUE;
                                                                        }
                                                                        zzaljVar = new zzalj(strZza9, f11, f15, 0, i14, f13, f14, 1, f22, i15);
                                                                    } catch (NumberFormatException unused7) {
                                                                        zzdt.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza10));
                                                                        zzaljVar = r44;
                                                                    }
                                                                }
                                                            } else {
                                                                zzdt.zzf("TtmlParser", "Ignoring region without an extent");
                                                            }
                                                        } catch (NumberFormatException unused8) {
                                                            zzdt.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza10));
                                                        }
                                                    } else {
                                                        map4 = map7;
                                                        if (!matcher6.matches()) {
                                                            zzdt.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza10));
                                                        } else if (r15 == 0) {
                                                            zzdt.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza10));
                                                        } else {
                                                            try {
                                                                String strGroup11 = matcher6.group(1);
                                                                if (strGroup11 == null) {
                                                                    throw r44;
                                                                }
                                                                int i28 = Integer.parseInt(strGroup11);
                                                                String strGroup12 = matcher6.group(2);
                                                                if (strGroup12 == null) {
                                                                    throw r44;
                                                                }
                                                                int i29 = Integer.parseInt(strGroup12);
                                                                float f23 = i28 / r15.zza;
                                                                f10 = i29 / r15.zzb;
                                                                f11 = f23;
                                                                strZza = zzeo.zza(xmlPullParserNewPullParser, "extent");
                                                                if (strZza != null) {
                                                                    matcher = pattern.matcher(strZza);
                                                                    matcher2 = pattern2.matcher(strZza);
                                                                    if (matcher.matches()) {
                                                                        strGroup3 = matcher.group(1);
                                                                        if (strGroup3 != null) {
                                                                            throw r44;
                                                                        }
                                                                        f16 = Float.parseFloat(strGroup3) / 100.0f;
                                                                        strGroup4 = matcher.group(2);
                                                                        if (strGroup4 != null) {
                                                                            throw r44;
                                                                        }
                                                                        f12 = Float.parseFloat(strGroup4) / 100.0f;
                                                                        f13 = f16;
                                                                        f14 = f12;
                                                                        strZza2 = zzeo.zza(xmlPullParserNewPullParser, "displayAlign");
                                                                        if (strZza2 != null) {
                                                                            strZza5 = zzfwa.zza(strZza2);
                                                                            iHashCode2 = strZza5.hashCode();
                                                                            if (iHashCode2 != -1364013995) {
                                                                                if (iHashCode2 != 92734940) {
                                                                                    i14 = 0;
                                                                                    f15 = f10;
                                                                                } else {
                                                                                    f15 = f10 + f14;
                                                                                    i14 = 2;
                                                                                }
                                                                            } else if (strZza5.equals("center")) {
                                                                                f15 = f10 + (f14 / 2.0f);
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 0;
                                                                                f15 = f10;
                                                                            }
                                                                        } else {
                                                                            i14 = 0;
                                                                            f15 = f10;
                                                                        }
                                                                        float f24 = 1.0f / i19;
                                                                        strZza3 = zzeo.zza(xmlPullParserNewPullParser, "writingMode");
                                                                        if (strZza3 != null) {
                                                                            strZza4 = zzfwa.zza(strZza3);
                                                                            iHashCode = strZza4.hashCode();
                                                                            if (iHashCode != 3694) {
                                                                                if (iHashCode != 3553396) {
                                                                                    if (iHashCode == 3553576) {
                                                                                        i15 = 1;
                                                                                    }
                                                                                } else if (strZza4.equals("tblr")) {
                                                                                    i15 = 2;
                                                                                }
                                                                                i15 = Integer.MIN_VALUE;
                                                                            } else if (strZza4.equals("tb")) {
                                                                                i15 = 2;
                                                                            } else {
                                                                                i15 = Integer.MIN_VALUE;
                                                                            }
                                                                        } else {
                                                                            i15 = Integer.MIN_VALUE;
                                                                        }
                                                                        zzaljVar = new zzalj(strZza9, f11, f15, 0, i14, f13, f14, 1, f24, i15);
                                                                    } else if (matcher2.matches()) {
                                                                        zzdt.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza10));
                                                                    } else if (r15 == 0) {
                                                                        zzdt.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza10));
                                                                    } else {
                                                                        strGroup = matcher2.group(1);
                                                                        if (strGroup != null) {
                                                                            throw r44;
                                                                        }
                                                                        i13 = Integer.parseInt(strGroup);
                                                                        strGroup2 = matcher2.group(2);
                                                                        if (strGroup2 != null) {
                                                                            throw r44;
                                                                        }
                                                                        int i210 = Integer.parseInt(strGroup2);
                                                                        float f25 = i13 / r15.zza;
                                                                        f12 = i210 / r15.zzb;
                                                                        f13 = f25;
                                                                        f14 = f12;
                                                                        strZza2 = zzeo.zza(xmlPullParserNewPullParser, "displayAlign");
                                                                        if (strZza2 != null) {
                                                                            strZza5 = zzfwa.zza(strZza2);
                                                                            iHashCode2 = strZza5.hashCode();
                                                                            if (iHashCode2 != -1364013995) {
                                                                                if (iHashCode2 != 92734940) {
                                                                                    i14 = 0;
                                                                                    f15 = f10;
                                                                                } else {
                                                                                    f15 = f10 + f14;
                                                                                    i14 = 2;
                                                                                }
                                                                            } else if (strZza5.equals("center")) {
                                                                                f15 = f10 + (f14 / 2.0f);
                                                                                i14 = 1;
                                                                            } else {
                                                                                i14 = 0;
                                                                                f15 = f10;
                                                                            }
                                                                        } else {
                                                                            i14 = 0;
                                                                            f15 = f10;
                                                                        }
                                                                        float f26 = 1.0f / i19;
                                                                        strZza3 = zzeo.zza(xmlPullParserNewPullParser, "writingMode");
                                                                        if (strZza3 != null) {
                                                                            strZza4 = zzfwa.zza(strZza3);
                                                                            iHashCode = strZza4.hashCode();
                                                                            if (iHashCode != 3694) {
                                                                                if (iHashCode != 3553396) {
                                                                                    if (iHashCode == 3553576) {
                                                                                        i15 = 1;
                                                                                    }
                                                                                } else if (strZza4.equals("tblr")) {
                                                                                    i15 = 2;
                                                                                }
                                                                                i15 = Integer.MIN_VALUE;
                                                                            } else if (strZza4.equals("tb")) {
                                                                                i15 = 2;
                                                                            } else {
                                                                                i15 = Integer.MIN_VALUE;
                                                                            }
                                                                        } else {
                                                                            i15 = Integer.MIN_VALUE;
                                                                        }
                                                                        zzaljVar = new zzalj(strZza9, f11, f15, 0, i14, f13, f14, 1, f26, i15);
                                                                    }
                                                                } else {
                                                                    zzdt.zzf("TtmlParser", "Ignoring region without an extent");
                                                                }
                                                            } catch (NumberFormatException unused9) {
                                                                zzdt.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza10));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str3 = str7;
                                                    map3 = map5;
                                                    map4 = map7;
                                                    str4 = str8;
                                                    zzdt.zzf("TtmlParser", "Ignoring region without an origin");
                                                }
                                                zzaljVar = r44;
                                            }
                                            if (zzaljVar != 0) {
                                                map6.put(zzaljVar.zza, zzaljVar);
                                            }
                                        } else if (zzeo.zzc(xmlPullParserNewPullParser, str8)) {
                                            do {
                                                xmlPullParserNewPullParser.next();
                                                if (zzeo.zzc(xmlPullParserNewPullParser, str7) && (strZza6 = zzeo.zza(xmlPullParserNewPullParser, "id")) != null) {
                                                    map7.put(strZza6, xmlPullParserNewPullParser.nextText());
                                                }
                                            } while (!zzeo.zzb(xmlPullParserNewPullParser, str8));
                                        }
                                        if (zzeo.zzb(xmlPullParserNewPullParser, "head")) {
                                            zzalgVar = zzalgVar3;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            zzalgVar3 = zzalgVar3;
                                            str9 = str9;
                                            str7 = str3;
                                            str8 = str4;
                                            map5 = map3;
                                            map7 = map4;
                                        }
                                    }
                                    str3 = str7;
                                    map3 = map5;
                                    map4 = map7;
                                    str4 = str8;
                                    if (zzeo.zzb(xmlPullParserNewPullParser, "head")) {
                                        zzalgVar = zzalgVar3;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        zzalgVar3 = zzalgVar3;
                                        str9 = str9;
                                        str7 = str3;
                                        str8 = str4;
                                        map5 = map3;
                                        map7 = map4;
                                    }
                                }
                            } else {
                                map3 = map5;
                                map4 = map7;
                                zzalg zzalgVar6 = zzalgVar3;
                                Object obj3 = "style";
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzall zzallVarZzf2 = zzf(xmlPullParserNewPullParser, r44);
                                    int i30 = 0;
                                    String str10 = str;
                                    long jZzc = -9223372036854775807L;
                                    long jZzc2 = -9223372036854775807L;
                                    long jZzc3 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i30 < attributeCount) {
                                        String attributeName = xmlPullParserNewPullParser.getAttributeName(i30);
                                        String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i30);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                zzalgVar = zzalgVar6;
                                                obj = obj3;
                                                i12 = i30;
                                                if (attributeName.equals("region") && map6.containsKey(attributeValue6)) {
                                                    str10 = attributeValue6;
                                                }
                                                try {
                                                    i30 = i12 + 1;
                                                    zzalgVar6 = zzalgVar;
                                                    obj3 = obj;
                                                } catch (zzake e) {
                                                    e = e;
                                                    arrayDeque = arrayDeque2;
                                                    zzdt.zzg("TtmlParser", "Suppressing parser error", e);
                                                    zzalgVar3 = zzalgVar;
                                                    map = map3;
                                                    map2 = map4;
                                                    i18 = 1;
                                                    xmlPullParserNewPullParser.next();
                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                    map5 = map;
                                                    map7 = map2;
                                                    arrayDeque2 = arrayDeque;
                                                    str5 = str;
                                                    str6 = str2;
                                                    obj2 = null;
                                                    r15 = r15;
                                                }
                                                break;
                                            case 99841:
                                                zzalgVar = zzalgVar6;
                                                obj = obj3;
                                                i12 = i30;
                                                if (attributeName.equals("dur")) {
                                                    jZzc3 = zzc(attributeValue6, zzalgVar);
                                                }
                                                i30 = i12 + 1;
                                                zzalgVar6 = zzalgVar;
                                                obj3 = obj;
                                                break;
                                            case 100571:
                                                zzalgVar = zzalgVar6;
                                                obj = obj3;
                                                i12 = i30;
                                                if (attributeName.equals("end")) {
                                                    jZzc = zzc(attributeValue6, zzalgVar);
                                                }
                                                i30 = i12 + 1;
                                                zzalgVar6 = zzalgVar;
                                                obj3 = obj;
                                                break;
                                            case 93616297:
                                                obj = obj3;
                                                if (attributeName.equals("begin")) {
                                                    zzalgVar = zzalgVar6;
                                                    jZzc2 = zzc(attributeValue6, zzalgVar);
                                                } else {
                                                    zzalgVar = zzalgVar6;
                                                }
                                                i12 = i30;
                                                i30 = i12 + 1;
                                                zzalgVar6 = zzalgVar;
                                                obj3 = obj;
                                                break;
                                            case 109780401:
                                                obj = obj3;
                                                if (attributeName.equals(obj)) {
                                                    String[] strArrZzg2 = zzg(attributeValue6);
                                                    if (strArrZzg2.length > 0) {
                                                        strArr = strArrZzg2;
                                                    }
                                                }
                                                zzalgVar = zzalgVar6;
                                                i12 = i30;
                                                i30 = i12 + 1;
                                                zzalgVar6 = zzalgVar;
                                                obj3 = obj;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            strSubstring = attributeValue6.substring(1);
                                                        }
                                                    } catch (zzake e4) {
                                                        e = e4;
                                                        zzalgVar = zzalgVar6;
                                                        arrayDeque = arrayDeque2;
                                                        zzdt.zzg("TtmlParser", "Suppressing parser error", e);
                                                        zzalgVar3 = zzalgVar;
                                                        map = map3;
                                                        map2 = map4;
                                                        i18 = 1;
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        map5 = map;
                                                        map7 = map2;
                                                        arrayDeque2 = arrayDeque;
                                                        str5 = str;
                                                        str6 = str2;
                                                        obj2 = null;
                                                        r15 = r15;
                                                    }
                                                }
                                                zzalgVar = zzalgVar6;
                                                obj = obj3;
                                                i12 = i30;
                                                i30 = i12 + 1;
                                                zzalgVar6 = zzalgVar;
                                                obj3 = obj;
                                                break;
                                            default:
                                                zzalgVar = zzalgVar6;
                                                obj = obj3;
                                                i12 = i30;
                                                i30 = i12 + 1;
                                                zzalgVar6 = zzalgVar;
                                                obj3 = obj;
                                                break;
                                        }
                                    }
                                    zzalgVar = zzalgVar6;
                                    if (zzalfVar != null) {
                                        zzalfVar2 = zzalfVar;
                                        long j11 = zzalfVar2.zzd;
                                        if (j11 == -9223372036854775807L) {
                                            zzalfVar3 = zzalfVar2;
                                        } else {
                                            jZzc2 = jZzc2 != -9223372036854775807L ? jZzc2 + j11 : -9223372036854775807L;
                                            if (jZzc != -9223372036854775807L) {
                                                jZzc += j11;
                                                zzalfVar3 = zzalfVar2;
                                            } else {
                                                zzalfVar3 = zzalfVar2;
                                                jZzc = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzalfVar2 = zzalfVar;
                                        zzalfVar3 = null;
                                    }
                                    if (jZzc == -9223372036854775807L) {
                                        if (jZzc3 != -9223372036854775807L) {
                                            j10 = jZzc2 + jZzc3;
                                        } else {
                                            if (zzalfVar3 != null) {
                                                j10 = zzalfVar3.zze;
                                                if (j10 != -9223372036854775807L) {
                                                }
                                            }
                                            j4 = -9223372036854775807L;
                                        }
                                        j4 = j10;
                                    } else {
                                        j4 = jZzc;
                                    }
                                    zzalf zzalfVarZzb = zzalf.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j4, zzallVarZzf2, strArr, str10, strSubstring, zzalfVar3);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(zzalfVarZzb);
                                        if (zzalfVar2 != null) {
                                            zzalfVar2.zzf(zzalfVarZzb);
                                        }
                                    } catch (zzake e10) {
                                        e = e10;
                                        zzdt.zzg("TtmlParser", "Suppressing parser error", e);
                                        zzalgVar3 = zzalgVar;
                                        map = map3;
                                        map2 = map4;
                                        i18 = 1;
                                    }
                                } catch (zzake e11) {
                                    e = e11;
                                }
                            }
                            i19 = i19;
                            zzalgVar3 = zzalgVar;
                            zzalmVar2 = zzalmVar2;
                            i18 = i18;
                            map = map3;
                            map2 = map4;
                        } else {
                            zzdt.zze("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            map = map5;
                            map2 = map7;
                            arrayDeque = arrayDeque2;
                        }
                        i18 = 1;
                    } else {
                        str2 = str6;
                        HashMap map8 = map5;
                        HashMap map9 = map7;
                        arrayDeque = arrayDeque2;
                        zzalmVar = zzalmVar2;
                        i11 = i18;
                        if (eventType != 4) {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    zzalf zzalfVar5 = (zzalf) arrayDeque.peek();
                                    if (zzalfVar5 == null) {
                                        throw null;
                                    }
                                    map = map8;
                                    map2 = map9;
                                    zzalmVar2 = new zzalm(zzalfVar5, map, map6, map2);
                                } else {
                                    map = map8;
                                    map2 = map9;
                                    zzalmVar2 = zzalmVar;
                                }
                                arrayDeque.pop();
                            }
                            i18 = i11;
                        } else {
                            if (zzalfVar4 == null) {
                                throw null;
                            }
                            zzalfVar4.zzf(zzalf.zzc(xmlPullParserNewPullParser.getText()));
                        }
                        map = map8;
                        map2 = map9;
                        zzalmVar2 = zzalmVar;
                        i18 = i11;
                    }
                } else {
                    str = str5;
                    str2 = str6;
                    map = map5;
                    map2 = map7;
                    zzalmVar = zzalmVar2;
                    i11 = i18;
                    arrayDeque = arrayDeque2;
                    if (eventType == 2) {
                        i18 = i11 + 1;
                    } else {
                        if (eventType == 3) {
                            i18 = i11 - 1;
                        }
                        zzalmVar2 = zzalmVar;
                        i18 = i11;
                    }
                    zzalmVar2 = zzalmVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                map5 = map;
                map7 = map2;
                arrayDeque2 = arrayDeque;
                str5 = str;
                str6 = str2;
                obj2 = null;
                r15 = r15;
            }
            zzalm zzalmVar3 = zzalmVar2;
            if (zzalmVar3 != null) {
                return zzalmVar3;
            }
            throw null;
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new IllegalStateException("Unable to decode source", e13);
        }
    }
}
