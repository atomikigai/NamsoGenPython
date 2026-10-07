package n;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f7124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7125b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f7126c;

    public d(f fVar) {
        this.f7126c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f7124a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f7123d;
            this.f7124a = cVar3;
            this.f7125b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7125b) {
            return this.f7126c.f7127a != null;
        }
        c cVar = this.f7124a;
        return (cVar == null || cVar.f7122c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7125b) {
            this.f7125b = false;
            this.f7124a = this.f7126c.f7127a;
        } else {
            c cVar = this.f7124a;
            this.f7124a = cVar != null ? cVar.f7122c : null;
        }
        return this.f7124a;
    }
}
