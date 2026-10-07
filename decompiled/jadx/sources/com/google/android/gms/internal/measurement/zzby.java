package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzby extends Handler {
    private final Looper zza;

    public zzby() {
        this.zza = Looper.getMainLooper();
    }

    public zzby(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
