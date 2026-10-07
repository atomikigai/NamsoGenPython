package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgzv {
    public static final List zza(Object obj, long j4) {
        zzgzj zzgzjVar = (zzgzj) zzhbu.zzh(obj, j4);
        if (zzgzjVar.zzc()) {
            return zzgzjVar;
        }
        int size = zzgzjVar.size();
        zzgzj zzgzjVarZzf = zzgzjVar.zzf(size == 0 ? 10 : size + size);
        zzhbu.zzv(obj, j4, zzgzjVarZzf);
        return zzgzjVarZzf;
    }
}
