package com.google.android.gms.internal.ads;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaqm {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzaqb.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqb.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzaoy zzb(zzapl zzaplVar) {
        long j4;
        boolean z4;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzaplVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z4 = false;
            j10 = 0;
            j11 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z4 = true;
                }
                i++;
            }
            j4 = 0;
            i = 1;
        } else {
            j4 = 0;
            z4 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZza2 = str3 != null ? zza(str3) : j4;
        String str4 = (String) map.get("Last-Modified");
        long jZza3 = str4 != null ? zza(str4) : j4;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j14 = (j11 * 1000) + jCurrentTimeMillis;
            j13 = z4 ? j14 : (j10 * 1000) + j14;
            j12 = j14;
        } else {
            j12 = (jZza <= j4 || jZza2 < jZza) ? j4 : (jZza2 - jZza) + jCurrentTimeMillis;
            j13 = j12;
        }
        zzaoy zzaoyVar = new zzaoy();
        zzaoyVar.zza = zzaplVar.zzb;
        zzaoyVar.zzb = str5;
        zzaoyVar.zzf = j12;
        zzaoyVar.zze = j13;
        zzaoyVar.zzc = jZza;
        zzaoyVar.zzd = jZza3;
        zzaoyVar.zzg = map;
        zzaoyVar.zzh = zzaplVar.zzd;
        return zzaoyVar;
    }

    public static String zzc(long j4) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j4));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
