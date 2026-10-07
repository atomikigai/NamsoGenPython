package yb;

import ic.p;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f10674a = new j();

    @Override // yb.i
    public final i B(i iVar) {
        jc.i.e(iVar, "context");
        return iVar;
    }

    @Override // yb.i
    public final i E(h hVar) {
        jc.i.e(hVar, "key");
        return this;
    }

    @Override // yb.i
    public final g H(h hVar) {
        jc.i.e(hVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // yb.i
    public final Object G(Object obj, p pVar) {
        return obj;
    }
}
