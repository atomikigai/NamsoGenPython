package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends zau {
    public final void a(com.google.android.gms.common.api.t tVar, com.google.android.gms.common.api.s sVar) {
        int i = BasePendingResult.zad;
        com.google.android.gms.common.internal.i0.i(tVar);
        sendMessage(obtainMessage(1, new Pair(tVar, sVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", da.v.f(i, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f2043s);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.first;
        com.google.android.gms.common.api.s sVar = (com.google.android.gms.common.api.s) pair.second;
        try {
            t0 t0Var = (t0) tVar;
            synchronized (t0Var.f2150b) {
                if (sVar.getStatus().g()) {
                } else {
                    t0Var.a(sVar.getStatus());
                    if (sVar instanceof zzcdr) {
                        try {
                            ((zzcdr) sVar).release();
                        } catch (RuntimeException e) {
                            Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(sVar)), e);
                        }
                    }
                }
            }
        } catch (RuntimeException e4) {
            BasePendingResult.zal(sVar);
            throw e4;
        }
    }
}
