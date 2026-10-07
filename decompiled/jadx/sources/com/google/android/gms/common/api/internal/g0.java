package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g7.d f2099b;

    public /* synthetic */ g0(a aVar, g7.d dVar) {
        this.f2098a = aVar;
        this.f2099b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            if (com.google.android.gms.common.internal.i0.m(this.f2098a, g0Var.f2098a) && com.google.android.gms.common.internal.i0.m(this.f2099b, g0Var.f2099b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2098a, this.f2099b});
    }

    public final String toString() {
        aa.c cVar = new aa.c(this);
        cVar.b(this.f2098a, "key");
        cVar.b(this.f2099b, "feature");
        return cVar.toString();
    }
}
