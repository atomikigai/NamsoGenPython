package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b implements a0, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f756b;

    static {
        new z(10).f609a = false;
    }

    public z(int i) {
        this(new ArrayList(i));
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final u a(int i) {
        ArrayList arrayList = this.f756b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new z(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        d();
        this.f756b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f756b.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final void b(f fVar) {
        d();
        this.f756b.add(fVar);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final List c() {
        return Collections.unmodifiableList(this.f756b);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f756b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final a0 e() {
        return this.f609a ? new i1(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final Object f(int i) {
        return this.f756b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f756b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof f)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, v.f720a);
            if (q1.f706a.i(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        f fVar = (f) obj;
        String str2 = fVar.size() == 0 ? "" : new String(fVar.f634b, fVar.g(), fVar.size(), v.f720a);
        int iG = fVar.g();
        if (q1.f706a.i(iG, fVar.f634b, fVar.size() + iG) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        Object objRemove = this.f756b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof f)) {
            return new String((byte[]) objRemove, v.f720a);
        }
        f fVar = (f) objRemove;
        return fVar.size() == 0 ? "" : new String(fVar.f634b, fVar.g(), fVar.size(), v.f720a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        Object obj2 = this.f756b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof f)) {
            return new String((byte[]) obj2, v.f720a);
        }
        f fVar = (f) obj2;
        return fVar.size() == 0 ? "" : new String(fVar.f634b, fVar.g(), fVar.size(), v.f720a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f756b.size();
    }

    public z(ArrayList arrayList) {
        this.f756b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        d();
        if (collection instanceof a0) {
            collection = ((a0) collection).c();
        }
        boolean zAddAll = this.f756b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
