package vb;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends c implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9289c;

    public b(c cVar, int i, int i10) {
        this.f9287a = cVar;
        this.f9288b = i;
        com.bumptech.glide.d.a(i, i10, cVar.d());
        this.f9289c = i10 - i;
    }

    @Override // vb.c
    public final int d() {
        return this.f9289c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i10 = this.f9289c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        return this.f9287a.get(this.f9288b + i);
    }
}
