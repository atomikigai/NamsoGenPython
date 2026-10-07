package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f2685a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9.h f2686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k9.h f2687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k9.h f2688d;
    private final k9.h e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k9.h f2689f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        e7.i iVar = new e7.i(context, 23);
        this.f2686b = iVar;
        k9.f fVarB = k9.f.b(an.f2633a);
        this.f2687c = fVarB;
        k9.f fVarB2 = k9.f.b(new az(iVar, fVarB));
        this.f2688d = fVarB2;
        k9.f fVarB3 = k9.f.b(new be(fVarB2));
        this.e = fVarB3;
        this.f2689f = k9.f.b(new am(fVarB2, fVarB3));
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f2689f.a();
    }
}
