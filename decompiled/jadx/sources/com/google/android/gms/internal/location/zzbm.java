package com.google.android.gms.internal.location;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbm {
    public static int zza(int i, int i10, @NullableDecl String str) {
        String strZza;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            strZza = zzbn.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
            }
            strZza = zzbn.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i10, @NullableDecl String str) {
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
                strZzd = (i10 < 0 || i10 > i11) ? zzd(i10, i11, "end index") : zzbn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzd);
        }
    }

    private static String zzd(int i, int i10, @NullableDecl String str) {
        if (i < 0) {
            return zzbn.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return zzbn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
