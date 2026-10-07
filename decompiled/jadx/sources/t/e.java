package t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r7.g {
    @Override // r7.g
    public final void A(f fVar, Thread thread) {
        fVar.f8504a = thread;
    }

    @Override // r7.g
    public final boolean b(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f8510b != cVar) {
                    return false;
                }
                gVar.f8510b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r7.g
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f8509a != obj) {
                    return false;
                }
                gVar.f8509a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r7.g
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f8511c != fVar) {
                    return false;
                }
                gVar.f8511c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r7.g
    public final void z(f fVar, f fVar2) {
        fVar.f8505b = fVar2;
    }
}
