package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f611a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f614d;

    public b1(x0 x0Var) {
        this.f614d = x0Var;
    }

    public final Iterator a() {
        if (this.f613c == null) {
            this.f613c = this.f614d.f743c.entrySet().iterator();
        }
        return this.f613c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f611a + 1;
        x0 x0Var = this.f614d;
        return i < x0Var.f742b.size() || (!x0Var.f743c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f612b = true;
        int i = this.f611a + 1;
        this.f611a = i;
        x0 x0Var = this.f614d;
        return i < x0Var.f742b.size() ? (Map.Entry) x0Var.f742b.get(this.f611a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f612b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f612b = false;
        int i = x0.f740r;
        x0 x0Var = this.f614d;
        x0Var.b();
        if (this.f611a >= x0Var.f742b.size()) {
            a().remove();
            return;
        }
        int i10 = this.f611a;
        this.f611a = i10 - 1;
        x0Var.g(i10);
    }
}
