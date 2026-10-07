package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f2153b;

    public v0(int i, d dVar) {
        super(i);
        com.google.android.gms.common.internal.i0.j(dVar, "Null methods are not runnable.");
        this.f2153b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        try {
            this.f2153b.setFailedResult(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(Exception exc) {
        try {
            this.f2153b.setFailedResult(new Status(10, da.v.u(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(f0 f0Var) throws DeadObjectException {
        try {
            this.f2153b.run(f0Var.f2083b);
        } catch (RuntimeException e) {
            b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d(a0 a0Var, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) a0Var.f2057a;
        d dVar = this.f2153b;
        map.put(dVar, boolValueOf);
        dVar.addStatusListener(new z(a0Var, dVar));
    }
}
