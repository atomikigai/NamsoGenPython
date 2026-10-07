package oc;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7704b;

    public b(e eVar, int i) {
        this.f7703a = eVar;
        this.f7704b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // oc.e
    public final Iterator iterator() {
        return new jc.a(this);
    }
}
