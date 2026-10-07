package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzano {
    public static final zzamt zza;
    public static final zzamt zzb;
    public static final zzamt zzc;
    private static final ThreadLocal zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;

    static {
        zzams zzamsVarZzc = zzamt.zzc();
        zzamsVarZzc.zzb(-62135596800L);
        zzamsVarZzc.zza(0);
        zza = (zzamt) zzamsVarZzc.zzi();
        zzams zzamsVarZzc2 = zzamt.zzc();
        zzamsVarZzc2.zzb(253402300799L);
        zzamsVarZzc2.zza(999999999);
        zzb = (zzamt) zzamsVarZzc2.zzi();
        zzams zzamsVarZzc3 = zzamt.zzc();
        zzamsVarZzc3.zzb(0L);
        zzamsVarZzc3.zza(0);
        zzc = (zzamt) zzamsVarZzc3.zzi();
        zzd = new zzann();
        zze = zzc("now");
        zzf = zzc("getEpochSecond");
        zzg = zzc("getNano");
    }

    public static zzamt zza(zzamt zzamtVar) {
        long jZzb = zzamtVar.zzb();
        int iZza = zzamtVar.zza();
        if (jZzb >= -62135596800L && jZzb <= 253402300799L && iZza >= 0 && iZza < 1000000000) {
            return zzamtVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + jZzb + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + iZza + ") must be in range [0, +999,999,999].");
    }

    public static zzamt zzb(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException(v.i("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = "";
        }
        long time = ((SimpleDateFormat) zzd.get()).parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        int i10 = iIndexOf2 + 1;
        if (str.charAt(iIndexOf2) != 'Z') {
            String strSubstring4 = str.substring(i10);
            int iIndexOf4 = strSubstring4.indexOf(58);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
            }
            long j4 = (Long.parseLong(strSubstring4.substring(iIndexOf4 + 1)) + (Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60)) * 60;
            time = str.charAt(iIndexOf2) == '+' ? time - j4 : time + j4;
        } else if (str.length() != i10) {
            throw new ParseException(v.i("Failed to parse timestamp: invalid trailing data \"", str.substring(iIndexOf2), "\""), 0);
        }
        if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
            try {
                time = zzbb.zza(time, iCharAt / 1000000000);
                iCharAt %= 1000000000;
            } catch (IllegalArgumentException e) {
                ParseException parseException = new ParseException(v.i("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
                parseException.initCause(e);
                throw parseException;
            }
        }
        if (iCharAt < 0) {
            iCharAt += 1000000000;
            time = zzbb.zzb(time, 1L);
        }
        zzams zzamsVarZzc = zzamt.zzc();
        zzamsVarZzc.zzb(time);
        zzamsVarZzc.zza(iCharAt);
        zzamt zzamtVar = (zzamt) zzamsVarZzc.zzi();
        zza(zzamtVar);
        return zzamtVar;
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
