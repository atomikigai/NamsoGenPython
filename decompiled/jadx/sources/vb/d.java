package vb;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends AbstractList implements List {
    public abstract int d();

    public abstract Object g(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return g(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
