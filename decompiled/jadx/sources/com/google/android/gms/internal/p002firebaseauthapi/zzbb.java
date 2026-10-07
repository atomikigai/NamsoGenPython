package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbb {
    private static final long[][] zza = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long zza(long j4, long j10) {
        long j11 = j4 + j10;
        zzbc.zza(((j4 ^ j10) < 0) | ((j4 ^ j11) >= 0), "checkedAdd", j4, j10);
        return j11;
    }

    public static long zzb(long j4, long j10) {
        long j11 = (-1) + j4;
        zzbc.zza(((1 ^ j4) >= 0) | ((j4 ^ j11) >= 0), "checkedSubtract", j4, 1L);
        return j11;
    }
}
