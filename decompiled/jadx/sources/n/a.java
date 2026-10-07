package n;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    public final HashMap e = new HashMap();

    @Override // n.f
    public final c d(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override // n.f
    public final Object g(Object obj) {
        Object objG = super.g(obj);
        this.e.remove(obj);
        return objG;
    }
}
