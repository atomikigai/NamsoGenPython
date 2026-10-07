package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2075b;

    public /* synthetic */ d0(Handler handler, int i) {
        this.f2074a = i;
        this.f2075b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2074a) {
            case 0:
                this.f2075b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f2075b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f2075b.post(runnable);
                return;
        }
    }
}
