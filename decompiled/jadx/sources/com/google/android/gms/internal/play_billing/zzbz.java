package com.google.android.gms.internal.play_billing;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbz {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(v.f(i10, "at index "));
            }
        }
        return objArr;
    }
}
