package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2152a;

    public u(e eVar) {
        this.f2152a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onResult(Status status) {
        this.f2152a.setResult(status);
    }
}
