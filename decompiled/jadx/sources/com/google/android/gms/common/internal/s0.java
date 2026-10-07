package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2258d = new HashMap();
    public final Context e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile zzi f2259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m7.a f2260g;
    public final long h;
    public final long i;

    public s0(Context context, Looper looper) {
        r0 r0Var = new r0(this);
        this.e = context.getApplicationContext();
        this.f2259f = new zzi(looper, r0Var);
        this.f2260g = m7.a.b();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.m
    public final boolean c(p0 p0Var, l0 l0Var, String str, Executor executor) {
        boolean z4;
        synchronized (this.f2258d) {
            try {
                q0 q0Var = (q0) this.f2258d.get(p0Var);
                if (executor == null) {
                    executor = null;
                }
                if (q0Var == null) {
                    q0Var = new q0(this, p0Var);
                    q0Var.f2243a.put(l0Var, l0Var);
                    q0Var.a(str, executor);
                    this.f2258d.put(p0Var, q0Var);
                } else {
                    this.f2259f.removeMessages(0, p0Var);
                    if (q0Var.f2243a.containsKey(l0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(p0Var.toString()));
                    }
                    q0Var.f2243a.put(l0Var, l0Var);
                    int i = q0Var.f2244b;
                    if (i == 1) {
                        l0Var.onServiceConnected(q0Var.f2247f, q0Var.f2246d);
                    } else if (i == 2) {
                        q0Var.a(str, executor);
                    }
                }
                z4 = q0Var.f2245c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
