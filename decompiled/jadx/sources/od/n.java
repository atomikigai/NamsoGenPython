package od;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends vb.c implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i[] f7748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f7749b;

    public n(i[] iVarArr, int[] iArr) {
        this.f7748a = iVarArr;
        this.f7749b = iArr;
    }

    @Override // vb.c, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // vb.c
    public final int d() {
        return this.f7748a.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f7748a[i];
    }

    @Override // vb.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // vb.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
