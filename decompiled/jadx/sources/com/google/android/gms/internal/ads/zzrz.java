package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzrz extends Handler {
    final /* synthetic */ zzsb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrz(zzsb zzsbVar, Looper looper) {
        super(looper);
        this.zza = zzsbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsb.zza(this.zza, message);
    }
}
