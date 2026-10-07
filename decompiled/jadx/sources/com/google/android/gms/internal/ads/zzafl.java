package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzafl {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzafh zza(String str) throws IOException {
        long j4;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzeo.zzc(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzbh.zza("Couldn't find xmp metadata", null);
            }
            zzfzo zzfzoVarZzn = zzfzo.zzn();
            long j10 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzeo.zzc(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i10 = 0; i10 < 4; i10++) {
                        String strZza = zzeo.zza(xmlPullParserNewPullParser, strArr[i10]);
                        if (strZza != null) {
                            if (Integer.parseInt(strZza) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i11 = 0;
                            while (true) {
                                if (i11 < 4) {
                                    String strZza2 = zzeo.zza(xmlPullParserNewPullParser, strArr2[i11]);
                                    if (strZza2 != null) {
                                        j4 = Long.parseLong(strZza2);
                                        if (j4 != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i11++;
                                }
                                j4 = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzfzoVarZzn = zzfzo.zzn();
                                    break;
                                }
                                String strZza3 = zzeo.zza(xmlPullParserNewPullParser, strArr3[i]);
                                if (strZza3 != null) {
                                    zzfzoVarZzn = zzfzo.zzp(new zzafg("image/jpeg", "Primary", 0L, 0L), new zzafg("video/mp4", "MotionPhoto", Long.parseLong(strZza3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j10 = j4;
                        }
                    }
                    return null;
                }
                if (zzeo.zzc(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzfzoVarZzn = zzb(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzeo.zzc(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzfzoVarZzn = zzb(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzeo.zzb(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzfzoVarZzn.isEmpty()) {
                return null;
            }
            return new zzafh(j10, zzfzoVarZzn);
        } catch (zzbh | NumberFormatException | XmlPullParserException unused) {
            zzdt.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfzo zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfzl zzfzlVar = new zzfzl();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzeo.zzc(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZza = zzeo.zza(xmlPullParser, strConcat2);
                String strZza2 = zzeo.zza(xmlPullParser, strConcat3);
                String strZza3 = zzeo.zza(xmlPullParser, strConcat4);
                String strZza4 = zzeo.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return zzfzo.zzn();
                }
                zzfzlVar.zzf(new zzafg(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!zzeo.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfzlVar.zzi();
    }
}
