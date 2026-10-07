package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ic.a f9074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9075b;

    @Override // ub.c
    public final Object getValue() {
        if (this.f9075b == j.f9072a) {
            ic.a aVar = this.f9074a;
            jc.i.b(aVar);
            this.f9075b = aVar.a();
            this.f9074a = null;
        }
        return this.f9075b;
    }

    public final String toString() {
        return this.f9075b != j.f9072a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
