package com.google.android.gms.internal.play_billing;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbg {
    public static int zza(int i, int i10, String str) {
        String strZza;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            strZza = zzbj.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(v.f(i10, "negative size: "));
            }
            strZza = zzbj.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i10, String str) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(zzf(i, i10, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i, int i10, int i11) {
        String strZzf;
        if (i < 0 || i10 < i || i10 > i11) {
            if (i < 0 || i > i11) {
                strZzf = zzf(i, i11, "start index");
            } else {
                strZzf = (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzbj.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i, int i10, String str) {
        if (i < 0) {
            return zzbj.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return zzbj.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(v.f(i10, "negative size: "));
    }
}
