package e3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public final boolean h(Object obj) {
        if (obj == null) {
            obj = i.f3269r;
        }
        if (!i.f3268f.i(this, null, obj)) {
            return false;
        }
        i.b(this);
        return true;
    }

    public final boolean i(Throwable th) {
        if (!i.f3268f.i(this, null, new c(th))) {
            return false;
        }
        i.b(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean j(m9.a aVar) {
        c cVar;
        aVar.getClass();
        Object obj = this.f3270a;
        if (obj != null) {
            if (obj instanceof a) {
                aVar.cancel(((a) obj).f3249a);
            }
        } else if (aVar.isDone()) {
            if (i.f3268f.i(this, null, i.e(aVar))) {
                i.b(this);
                return true;
            }
        } else {
            f fVar = new f(this, aVar);
            if (i.f3268f.i(this, null, fVar)) {
                try {
                    aVar.addListener(fVar, j.f3273a);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Throwable unused) {
                        cVar = c.f3252b;
                    }
                    i.f3268f.i(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.f3270a;
            if (obj instanceof a) {
                aVar.cancel(((a) obj).f3249a);
            }
        }
        return false;
    }
}
