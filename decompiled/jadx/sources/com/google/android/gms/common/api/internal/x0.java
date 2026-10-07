package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f2160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f2161c;

    public x0(m mVar, TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f2160b = taskCompletionSource;
        this.f2161c = mVar;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        this.f2160b.trySetException(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(Exception exc) {
        this.f2160b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(f0 f0Var) throws DeadObjectException {
        try {
            h(f0Var);
        } catch (DeadObjectException e) {
            a(y0.e(e));
            throw e;
        } catch (RemoteException e4) {
            a(y0.e(e4));
        } catch (RuntimeException e10) {
            this.f2160b.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final boolean f(f0 f0Var) {
        q1.a.q(f0Var.f2086f.get(this.f2161c));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final g7.d[] g(f0 f0Var) {
        q1.a.q(f0Var.f2086f.get(this.f2161c));
        return null;
    }

    public final void h(f0 f0Var) {
        q1.a.q(f0Var.f2086f.remove(this.f2161c));
        this.f2160b.trySetResult(Boolean.FALSE);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final /* bridge */ /* synthetic */ void d(a0 a0Var, boolean z4) {
    }
}
