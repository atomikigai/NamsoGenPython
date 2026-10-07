package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f2257a;

    public /* synthetic */ r0(s0 s0Var) {
        this.f2257a = s0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f2257a.f2258d) {
                try {
                    p0 p0Var = (p0) message.obj;
                    q0 q0Var = (q0) this.f2257a.f2258d.get(p0Var);
                    if (q0Var != null && q0Var.f2243a.isEmpty()) {
                        if (q0Var.f2245c) {
                            q0Var.f2248r.f2259f.removeMessages(1, q0Var.e);
                            s0 s0Var = q0Var.f2248r;
                            s0Var.f2260g.c(s0Var.e, q0Var);
                            q0Var.f2245c = false;
                            q0Var.f2244b = 2;
                        }
                        this.f2257a.f2258d.remove(p0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f2257a.f2258d) {
            try {
                p0 p0Var2 = (p0) message.obj;
                q0 q0Var2 = (q0) this.f2257a.f2258d.get(p0Var2);
                if (q0Var2 != null && q0Var2.f2244b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(p0Var2)), new Exception());
                    ComponentName componentName = q0Var2.f2247f;
                    if (componentName == null) {
                        p0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = p0Var2.f2238b;
                        i0.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    q0Var2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
