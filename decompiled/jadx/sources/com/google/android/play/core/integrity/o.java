package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f2680a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9.h f2681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k9.h f2682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k9.h f2683d;
    private final k9.h e;

    public o(Context context, n nVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        e7.i iVar = new e7.i(context, 23);
        this.f2681b = iVar;
        k9.f fVarB = k9.f.b(y.f2695a);
        this.f2682c = fVarB;
        k9.f fVarB2 = k9.f.b(new af(iVar, fVarB));
        this.f2683d = fVarB2;
        this.e = k9.f.b(new x(fVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
