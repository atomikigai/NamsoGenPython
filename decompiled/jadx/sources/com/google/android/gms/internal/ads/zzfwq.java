package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfwq {
    public static int zza(int i, int i10, String str) {
        String strZzb;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            strZzb = zzfxf.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(v.f(i10, "negative size: "));
            }
            strZzb = zzfxf.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i, int i10, String str) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(zzm(i, i10, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfxf.zzb(str, obj2));
    }

    public static void zze(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z4, String str, char c10) {
        if (!z4) {
            throw new IllegalArgumentException(zzfxf.zzb(str, Character.valueOf(c10)));
        }
    }

    public static void zzh(boolean z4, String str, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(zzfxf.zzb(str, Long.valueOf(j4)));
        }
    }

    public static void zzi(boolean z4, String str, int i, int i10) {
        if (!z4) {
            throw new IllegalArgumentException(zzfxf.zzb(str, Integer.valueOf(i), Integer.valueOf(i10)));
        }
    }

    public static void zzj(int i, int i10, int i11) {
        String strZzm;
        if (i < 0 || i10 < i || i10 > i11) {
            if (i < 0 || i > i11) {
                strZzm = zzm(i, i11, "start index");
            } else {
                strZzm = (i10 < 0 || i10 > i11) ? zzm(i10, i11, "end index") : zzfxf.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzm);
        }
    }

    public static void zzk(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void zzl(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzm(int i, int i10, String str) {
        if (i < 0) {
            return zzfxf.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return zzfxf.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(v.f(i10, "negative size: "));
    }
}
