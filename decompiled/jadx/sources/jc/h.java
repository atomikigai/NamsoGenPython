package jc;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends c implements g, nc.a, ub.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5770s;

    public h(int i, Class cls, String str, String str2, int i10) {
        this(i, b.f5759a, cls, str, str2, i10, 0);
    }

    @Override // jc.c
    public final nc.a c() {
        r.f5777a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f5763d.equals(hVar.f5763d) && this.e.equals(hVar.e) && this.f5770s == hVar.f5770s && this.f5769r == hVar.f5769r && i.a(this.f5761b, hVar.f5761b) && d().equals(hVar.d());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        nc.a aVar = this.f5760a;
        if (aVar == null) {
            c();
            this.f5760a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // jc.g
    public final int getArity() {
        return this.f5769r;
    }

    public final int hashCode() {
        d();
        return this.e.hashCode() + v.d(d().hashCode() * 31, 31, this.f5763d);
    }

    public final String toString() {
        nc.a aVar = this.f5760a;
        if (aVar == null) {
            c();
            this.f5760a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f5763d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : v.i("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f5769r = i;
        this.f5770s = 0;
    }
}
