package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazr {
    public static int zza(String str) {
        byte[] bytes;
        int length;
        int i;
        int i10;
        int i11;
        try {
            bytes = str.getBytes("UTF-8");
            while (true) {
                i11 = length & (-4);
                if (i >= i11) {
                    break;
                }
                int i12 = ((bytes[i] & 255) | ((bytes[i + 1] & 255) << 8) | ((bytes[i + 2] & 255) << 16) | (bytes[i + 3] << 24)) * (-862048943);
                int i13 = i10 ^ (((i12 >>> 17) | (i12 << 15)) * 461845907);
                i10 = (((i13 >>> 19) | (i13 << 13)) * 5) - 430675100;
                i += 4;
            }
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        length = bytes.length;
        int i14 = 0;
        i = 0;
        i10 = 0;
        int i15 = length & 3;
        if (i15 == 1) {
            int i16 = ((bytes[i11] & 255) | i14) * (-862048943);
            i10 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        } else {
            if (i15 != 2) {
                i14 = i15 == 3 ? (bytes[i11 + 2] & 255) << 16 : 0;
            }
            i14 |= (bytes[i11 + 1] & 255) << 8;
            int i17 = ((bytes[i11] & 255) | i14) * (-862048943);
            i10 ^= ((i17 >>> 17) | (i17 << 15)) * 461845907;
        }
        int i18 = i10 ^ length;
        int i19 = (i18 ^ (i18 >>> 16)) * (-2048144789);
        int i20 = (i19 ^ (i19 >>> 13)) * (-1028477387);
        return i20 ^ (i20 >>> 16);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[DONT_INVERT] */
    public static String[] zzb(String str, boolean z4) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z10 = false;
        int i10 = 0;
        while (i < str.length()) {
            int iCodePointAt = Character.codePointAt(charArray, i);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z10) {
                        arrayList.add(new String(charArray, i10, i - i10));
                    }
                    arrayList.add(new String(charArray, i, iCharCount));
                } else {
                    if (!Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                        if (true != z10) {
                            i10 = i;
                        }
                    } else if (z4 && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z10) {
                            i10 = i;
                        }
                    } else if (z10) {
                        arrayList.add(new String(charArray, i10, i - i10));
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z10) {
                        i10 = i;
                    }
                } else if (true != z10) {
                    i10 = i;
                }
                z10 = true;
            }
            i += iCharCount;
        }
        if (z10) {
            arrayList.add(new String(charArray, i10, i - i10));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
