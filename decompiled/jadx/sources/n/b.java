package n;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f7117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f7118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7119c;

    public b(c cVar, c cVar2, int i) {
        this.f7119c = i;
        this.f7117a = cVar2;
        this.f7118b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f7117a == cVar && cVar == this.f7118b) {
            this.f7118b = null;
            this.f7117a = null;
        }
        c cVar3 = this.f7117a;
        if (cVar3 == cVar) {
            switch (this.f7119c) {
                case 0:
                    cVar2 = cVar3.f7123d;
                    break;
                default:
                    cVar2 = cVar3.f7122c;
                    break;
            }
            this.f7117a = cVar2;
        }
        c cVar4 = this.f7118b;
        if (cVar4 == cVar) {
            c cVar5 = this.f7117a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f7118b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f7119c) {
            case 0:
                return cVar.f7122c;
            default:
                return cVar.f7123d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7118b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f7118b;
        c cVar2 = this.f7117a;
        this.f7118b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
