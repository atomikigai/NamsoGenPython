package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class aq extends k9.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f2635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f2636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ax axVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f2636b = axVar;
        this.f2635a = context;
    }

    @Override // k9.w
    public final void b() {
        this.f2636b.f2652d.trySetResult(Boolean.valueOf(k9.e.a(this.f2635a)));
    }
}
