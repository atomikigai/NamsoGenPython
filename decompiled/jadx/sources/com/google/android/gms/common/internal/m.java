package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2227a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static s0 f2228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f2229c;

    public static s0 a(Context context) {
        synchronized (f2227a) {
            try {
                if (f2228b == null) {
                    f2228b = new s0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2228b;
    }

    public final void b(String str, String str2, ServiceConnection serviceConnection, boolean z4) {
        p0 p0Var = new p0(str, str2, z4);
        s0 s0Var = (s0) this;
        i0.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (s0Var.f2258d) {
            try {
                q0 q0Var = (q0) s0Var.f2258d.get(p0Var);
                if (q0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(p0Var.toString()));
                }
                if (!q0Var.f2243a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(p0Var.toString()));
                }
                q0Var.f2243a.remove(serviceConnection);
                if (q0Var.f2243a.isEmpty()) {
                    s0Var.f2259f.sendMessageDelayed(s0Var.f2259f.obtainMessage(0, p0Var), s0Var.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean c(p0 p0Var, l0 l0Var, String str, Executor executor);
}
