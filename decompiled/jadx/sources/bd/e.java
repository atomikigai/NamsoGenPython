package bd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f1574c = new e(vb.i.q0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.g f1576b;

    public e(Set set, r7.g gVar) {
        this.f1575a = set;
        this.f1576b = gVar;
    }

    public final void a(String str, ic.a aVar) {
        jc.i.e(str, "hostname");
        Iterator it = this.f1575a.iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jc.i.a(eVar.f1575a, this.f1575a) && jc.i.a(eVar.f1576b, this.f1576b);
    }

    public final int hashCode() {
        int iHashCode = (this.f1575a.hashCode() + 1517) * 41;
        r7.g gVar = this.f1576b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }
}
