package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbcx extends zzbcy {
    private static final String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0) {
            int i11 = length - 1;
            if (str.charAt(i11) != ',') {
                break;
            }
            length = i11;
        }
        if (length < i10) {
            return null;
        }
        if (i10 != 0) {
            i = i10;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    public final String zza(String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        if (TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        return TextUtils.isEmpty(strZzb2) ? strZzb : v.u(strZzb, ",", strZzb2);
    }
}
