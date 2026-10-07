package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzakc {
    public static void zza(zzakd zzakdVar, zzakh zzakhVar, zzdg zzdgVar) {
        for (int i = 0; i < zzakdVar.zza(); i++) {
            long jZzb = zzakdVar.zzb(i);
            List listZzc = zzakdVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzakdVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzakdVar.zzb(i + 1) - zzakdVar.zzb(i);
                if (jZzb2 > 0) {
                    zzdgVar.zza(new zzaka(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
