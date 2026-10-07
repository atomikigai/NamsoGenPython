package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f2154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f2155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f2156d;

    public w0(int i, x xVar, TaskCompletionSource taskCompletionSource, v vVar) {
        super(i);
        this.f2155c = taskCompletionSource;
        this.f2154b = xVar;
        this.f2156d = vVar;
        if (i == 2 && xVar.f2158b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        ((b9.e) this.f2156d).getClass();
        this.f2155c.trySetException(com.google.android.gms.common.internal.i0.n(status));
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(Exception exc) {
        this.f2155c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(f0 f0Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f2155c;
        try {
            x xVar = this.f2154b;
            ((t) ((r0) xVar).f2147d.f1818d).accept(f0Var.f2083b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e4) {
            a(y0.e(e4));
        } catch (RuntimeException e10) {
            taskCompletionSource.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d(a0 a0Var, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) a0Var.f2058b;
        TaskCompletionSource taskCompletionSource = this.f2155c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new a0(a0Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final boolean f(f0 f0Var) {
        return this.f2154b.f2158b;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final g7.d[] g(f0 f0Var) {
        return this.f2154b.f2157a;
    }
}
