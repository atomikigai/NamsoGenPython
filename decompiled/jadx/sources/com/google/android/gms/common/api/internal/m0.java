package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.firebase.ui.auth.KickoffActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends b1 {
    public TaskCompletionSource e;

    public static m0 d(KickoffActivity kickoffActivity) {
        l fragment = LifecycleCallback.getFragment((Activity) kickoffActivity);
        m0 m0Var = (m0) fragment.e(m0.class, "GmsAvailabilityHelper");
        if (m0Var != null) {
            if (m0Var.e.getTask().isComplete()) {
                m0Var.e = new TaskCompletionSource();
            }
            return m0Var;
        }
        int i = g7.e.f4238c;
        m0 m0Var2 = new m0(fragment);
        m0Var2.e = new TaskCompletionSource();
        m0Var2.mLifecycleFragment.a("GmsAvailabilityHelper", m0Var2);
        return m0Var2;
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void a(g7.b bVar, int i) {
        String str = bVar.f4231d;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.e.setException(new com.google.android.gms.common.api.j(new Status(bVar.f4229b, str, bVar.f4230c, bVar)));
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void b() {
        Activity activityG = this.mLifecycleFragment.g();
        if (activityG == null) {
            this.e.trySetException(new com.google.android.gms.common.api.j(new Status(8, null, null, null)));
            return;
        }
        int iD = this.f2066d.d(activityG, g7.f.f4240a);
        if (iD == 0) {
            this.e.trySetResult(null);
        } else {
            if (this.e.getTask().isComplete()) {
                return;
            }
            c(new g7.b(iD, null), 0);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.e.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }
}
