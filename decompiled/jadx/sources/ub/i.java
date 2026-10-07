package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ic.a f9069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f9070b = j.f9072a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9071c = this;

    public i(ic.a aVar) {
        this.f9069a = aVar;
    }

    @Override // ub.c
    public final Object getValue() {
        Object objA;
        Object obj = this.f9070b;
        j jVar = j.f9072a;
        if (obj != jVar) {
            return obj;
        }
        synchronized (this.f9071c) {
            objA = this.f9070b;
            if (objA == jVar) {
                ic.a aVar = this.f9069a;
                jc.i.b(aVar);
                objA = aVar.a();
                this.f9070b = objA;
                this.f9069a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f9070b != j.f9072a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
