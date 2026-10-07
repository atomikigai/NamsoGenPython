package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacz {
    public static zzbd zza(zzacs zzacsVar, boolean z4) throws IOException {
        zzbd zzbdVarZza = new zzadh().zza(zzacsVar, z4 ? null : zzagk.zza);
        if (zzbdVarZza == null || zzbdVarZza.zza() == 0) {
            return null;
        }
        return zzbdVarZza;
    }

    public static zzadb zzb(zzed zzedVar) {
        zzedVar.zzM(1);
        int iZzo = zzedVar.zzo();
        long jZzd = zzedVar.zzd();
        long j4 = iZzo;
        int i = iZzo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i10 = 0; i10 < i; i10++) {
            long jZzt = zzedVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jZzt;
            jArrCopyOf2[i10] = zzedVar.zzt();
            zzedVar.zzM(2);
        }
        zzedVar.zzM((int) ((jZzd + j4) - ((long) zzedVar.zzd())));
        return new zzadb(jArrCopyOf, jArrCopyOf2);
    }
}
