package com.google.android.gms.internal.measurement;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjd {
    public static Object zza(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(v.f(i, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            zza(objArr[i10], i10);
        }
        return objArr;
    }
}
