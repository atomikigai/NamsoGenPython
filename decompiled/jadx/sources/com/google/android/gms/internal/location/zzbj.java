package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbj {
    public static Looper zza(Looper looper) {
        return looper != null ? looper : zzb();
    }

    public static Looper zzb() {
        i0.k("Can't create handler inside thread that has not called Looper.prepare()", Looper.myLooper() != null);
        return Looper.myLooper();
    }
}
