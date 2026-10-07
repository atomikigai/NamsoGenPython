package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu {
    public static int zza(int i, int i10, String str) {
        String strZzb;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            strZzb = zzac.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(v.f(i10, "negative size: "));
            }
            strZzb = zzac.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i, int i10, String str) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(zzd(i, i10, "index"));
        }
        return i;
    }

    public static void zzc(int i, int i10, int i11) {
        String strZzd;
        if (i < 0 || i10 < i || i10 > i11) {
            if (i < 0 || i > i11) {
                strZzd = zzd(i, i11, "start index");
            } else {
                strZzd = (i10 < 0 || i10 > i11) ? zzd(i10, i11, "end index") : zzac.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzd);
        }
    }

    private static String zzd(int i, int i10, String str) {
        if (i < 0) {
            return zzac.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return zzac.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(v.f(i10, "negative size: "));
    }
}
