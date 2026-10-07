package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgc {
    public static void zza(boolean z4, String str, long j4, long j10) {
        if (z4) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j4 + ", " + j10 + ")");
    }

    public static void zzb(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
