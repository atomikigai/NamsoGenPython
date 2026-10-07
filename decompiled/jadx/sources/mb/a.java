package mb;

import da.l;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.d f7083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f7084b = null;

    public a(zc.d dVar) {
        this.f7083a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7083a.equals(aVar.f7083a) && i.a(this.f7084b, aVar.f7084b);
    }

    public final int hashCode() {
        int iHashCode = this.f7083a.hashCode() * 31;
        l lVar = this.f7084b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f7083a + ", subscriber=" + this.f7084b + ')';
    }
}
