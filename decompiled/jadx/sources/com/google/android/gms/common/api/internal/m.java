package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2125b;

    public m(Object obj, String str) {
        this.f2124a = obj;
        this.f2125b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2124a == mVar.f2124a && this.f2125b.equals(mVar.f2125b);
    }

    public final int hashCode() {
        return this.f2125b.hashCode() + (System.identityHashCode(this.f2124a) * 31);
    }
}
