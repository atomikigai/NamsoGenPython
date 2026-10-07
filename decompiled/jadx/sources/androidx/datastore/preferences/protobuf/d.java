package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f619a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f621c;

    public d(f fVar) {
        this.f621c = fVar;
        this.f620b = fVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f619a < this.f620b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f619a;
        if (i >= this.f620b) {
            throw new NoSuchElementException();
        }
        this.f619a = i + 1;
        return Byte.valueOf(this.f621c.f634b[i]);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
