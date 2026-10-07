package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.ads.zzbbs;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmg {
    public static final zzlj zza;
    public static final zzlj zzb;
    public static final zzlj zzc;
    private static final ThreadLocal zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;

    static {
        zzli zzliVarZzi = zzlj.zzi();
        zzliVarZzi.zze(-62135596800L);
        zzliVarZzi.zzd(0);
        zza = (zzlj) zzliVarZzi.zzj();
        zzli zzliVarZzi2 = zzlj.zzi();
        zzliVarZzi2.zze(253402300799L);
        zzliVarZzi2.zzd(999999999);
        zzb = (zzlj) zzliVarZzi2.zzj();
        zzli zzliVarZzi3 = zzlj.zzi();
        zzliVarZzi3.zze(0L);
        zzliVarZzi3.zzd(0);
        zzc = (zzlj) zzliVarZzi3.zzj();
        zzd = new zzmf();
        zze = zzd("now");
        zzf = zzd("getEpochSecond");
        zzg = zzd("getNano");
    }

    public static zzlj zza(zzlj zzljVar) {
        long jZzg = zzljVar.zzg();
        int iZzf = zzljVar.zzf();
        if (jZzg >= -62135596800L && jZzg <= 253402300799L && iZzf >= 0 && iZzf < 1000000000) {
            return zzljVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + jZzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + iZzf + ") must be in range [0, +999,999,999].");
    }

    public static zzlj zzb(long j4) {
        int i = (int) ((j4 % 1000) * 1000000);
        long jZza = j4 / 1000;
        if (i <= -1000000000 || i >= 1000000000) {
            jZza = zzgb.zza(jZza, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            jZza = zzgb.zzb(jZza, 1L);
        }
        zzli zzliVarZzi = zzlj.zzi();
        zzliVarZzi.zze(jZza);
        zzliVarZzi.zzd(i);
        zzlj zzljVar = (zzlj) zzliVarZzi.zzj();
        zza(zzljVar);
        return zzljVar;
    }

    public static String zzc(zzlj zzljVar) {
        String str;
        zza(zzljVar);
        long jZzg = zzljVar.zzg();
        int iZzf = zzljVar.zzf();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SimpleDateFormat) zzd.get()).format(new Date(jZzg * 1000)));
        if (iZzf != 0) {
            sb2.append(".");
            if (iZzf % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / 1000000));
            } else {
                str = iZzf % zzbbs.zzq.zzf == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / zzbbs.zzq.zzf)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf));
            }
            sb2.append(str);
        }
        sb2.append("Z");
        return sb2.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
