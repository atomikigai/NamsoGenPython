package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7.d[] f2157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2159c;

    public x(g7.d[] dVarArr, boolean z4, int i) {
        this.f2157a = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z4) {
            z10 = true;
        }
        this.f2158b = z10;
        this.f2159c = i;
    }

    public static c9.f a() {
        c9.f fVar = new c9.f();
        fVar.f1816b = true;
        fVar.f1817c = 0;
        return fVar;
    }
}
