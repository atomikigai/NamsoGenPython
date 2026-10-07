package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzff {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z4, String str, char c10) {
        if (!z4) {
            throw new IllegalArgumentException(zzfi.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(int i, int i10, int i11) {
        String strZzf;
        if (i < 0 || i10 < i || i10 > i11) {
            if (i < 0 || i > i11) {
                strZzf = zzf(i, i11, "start index");
            } else {
                strZzf = (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzfi.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
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
        return i < 0 ? zzfi.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzfi.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
    }
}
