package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import d6.p;
import h6.l0;
import h6.r0;
import java.util.concurrent.Executor;
import n7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcag implements Executor {
    private final Handler zza = new l0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            r0 r0Var = p.C.f2979c;
            Context contextZzd = p.C.f2982g.zzd();
            if (contextZzd != null) {
                try {
                    if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
                        c.a(contextZzd, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
