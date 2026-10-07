package wb;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends vb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f9910b;

    public /* synthetic */ g(f fVar, int i) {
        this.f9909a = i;
        this.f9910b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9909a) {
            case 0:
                jc.i.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f9909a) {
            case 0:
                jc.i.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                jc.i.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9909a) {
            case 0:
                this.f9910b.clear();
                break;
            default:
                this.f9910b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9909a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f9910b.e((Map.Entry) obj);
            default:
                return this.f9910b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f9909a) {
            case 0:
                jc.i.e(collection, "elements");
                return this.f9910b.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // vb.e
    public final int d() {
        switch (this.f9909a) {
            case 0:
                break;
        }
        return this.f9910b.f9904t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f9909a) {
            case 0:
                break;
        }
        return this.f9910b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9909a) {
            case 0:
                f fVar = this.f9910b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f9910b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9909a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f fVar = this.f9910b;
                fVar.getClass();
                fVar.b();
                int iG = fVar.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = fVar.f9898b;
                jc.i.b(objArr);
                if (!jc.i.a(objArr[iG], entry.getValue())) {
                    return false;
                }
                fVar.k(iG);
                return true;
            default:
                f fVar2 = this.f9910b;
                fVar2.b();
                int iG2 = fVar2.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                fVar2.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f9909a) {
            case 0:
                jc.i.e(collection, "elements");
                this.f9910b.b();
                break;
            default:
                jc.i.e(collection, "elements");
                this.f9910b.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f9909a) {
            case 0:
                jc.i.e(collection, "elements");
                this.f9910b.b();
                break;
            default:
                jc.i.e(collection, "elements");
                this.f9910b.b();
                break;
        }
        return super.retainAll(collection);
    }
}
