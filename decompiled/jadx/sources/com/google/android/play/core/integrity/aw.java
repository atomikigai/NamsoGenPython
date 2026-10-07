package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class aw extends k9.w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ax f2648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f2648f = axVar;
    }

    @Override // k9.w
    public final void a(Exception exc) {
        if (!(exc instanceof k9.d)) {
            super.a(exc);
        } else if (ax.g(this.f2648f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
