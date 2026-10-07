package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f2172a;

    public x(Status status) {
        super(null);
        this.f2172a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final s createFailedResult(Status status) {
        return this.f2172a;
    }
}
