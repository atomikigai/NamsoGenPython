package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjz {
    public static final boolean zza(Object obj) {
        return !((zzjy) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzjy zzjyVarZzb = (zzjy) obj;
        zzjy zzjyVar = (zzjy) obj2;
        if (!zzjyVar.isEmpty()) {
            if (!zzjyVarZzb.zze()) {
                zzjyVarZzb = zzjyVarZzb.zzb();
            }
            zzjyVarZzb.zzd(zzjyVar);
        }
        return zzjyVarZzb;
    }
}
