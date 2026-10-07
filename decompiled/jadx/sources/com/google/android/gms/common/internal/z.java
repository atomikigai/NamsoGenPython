package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements com.google.android.gms.common.api.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.q f2279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2281c;

    public z(com.google.android.gms.common.api.q qVar, TaskCompletionSource taskCompletionSource, s sVar) {
        this.f2279a = qVar;
        this.f2280b = taskCompletionSource;
        this.f2281c = sVar;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        boolean zG = status.g();
        TaskCompletionSource taskCompletionSource = this.f2280b;
        if (!zG) {
            taskCompletionSource.setException(i0.n(status));
            return;
        }
        taskCompletionSource.setResult(this.f2281c.a(this.f2279a.await(0L, TimeUnit.MILLISECONDS)));
    }
}
