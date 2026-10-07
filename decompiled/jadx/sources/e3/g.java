package e3;

import fa.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c1 {
    @Override // fa.c1
    public final void A(h hVar, h hVar2) {
        hVar.f3266b = hVar2;
    }

    @Override // fa.c1
    public final void B(h hVar, Thread thread) {
        hVar.f3265a = thread;
    }

    @Override // fa.c1
    public final boolean h(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3271b != dVar) {
                    return false;
                }
                iVar.f3271b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // fa.c1
    public final boolean i(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f3270a != obj) {
                    return false;
                }
                iVar.f3270a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // fa.c1
    public final boolean j(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3272c != hVar) {
                    return false;
                }
                iVar.f3272c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
