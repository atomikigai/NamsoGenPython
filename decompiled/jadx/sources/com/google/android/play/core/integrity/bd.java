package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ax f2664a;

    public bd(ax axVar) {
        this.f2664a = axVar;
    }

    public final /* synthetic */ Task a(long j4, long j10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f2664a.c(standardIntegrityTokenRequest.a(), j4, j10);
    }
}
