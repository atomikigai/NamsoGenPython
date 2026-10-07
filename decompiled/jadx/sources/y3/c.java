package y3;

import p4.j;
import w3.k;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f10547d;

    @Override // p4.j
    public final int b(Object obj) {
        x xVar = (x) obj;
        if (xVar == null) {
            return 1;
        }
        return xVar.d();
    }

    @Override // p4.j
    public final void c(Object obj, Object obj2) {
        x xVar = (x) obj2;
        k kVar = this.f10547d;
        if (kVar == null || xVar == null) {
            return;
        }
        kVar.e.d(xVar, true);
    }
}
