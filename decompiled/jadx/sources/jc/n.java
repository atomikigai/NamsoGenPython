package jc;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends c implements nc.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f5773r;

    public n(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f5773r = false;
    }

    public final nc.a e() {
        if (this.f5773r) {
            return this;
        }
        nc.a aVar = this.f5760a;
        if (aVar != null) {
            return aVar;
        }
        nc.a aVarC = c();
        this.f5760a = aVarC;
        return aVarC;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return d().equals(nVar.d()) && this.f5763d.equals(nVar.f5763d) && this.e.equals(nVar.e) && i.a(this.f5761b, nVar.f5761b);
        }
        if (obj instanceof nc.c) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + v.d(d().hashCode() * 31, 31, this.f5763d);
    }

    public final String toString() {
        nc.a aVarE = e();
        return aVarE != this ? aVarE.toString() : q1.a.m(new StringBuilder("property "), this.f5763d, " (Kotlin reflection is not available)");
    }
}
