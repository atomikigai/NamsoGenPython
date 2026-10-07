package fa;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements List, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3848a;

    public t1(List list) {
        this.f3848a = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f3848a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f3848a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f3848a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3848a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f3848a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f3848a.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f3848a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f3848a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f3848a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3848a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f3848a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f3848a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f3848a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f3848a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f3848a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f3848a.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f3848a.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3848a.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        return this.f3848a.subList(i, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f3848a.toArray();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f3848a.add(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f3848a.addAll(i, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f3848a.listIterator(i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f3848a.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3848a.toArray(objArr);
    }
}
