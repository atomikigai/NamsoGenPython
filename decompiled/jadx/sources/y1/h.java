package y1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h extends jc.h implements ic.l {
    @Override // ic.l
    public final Object invoke(Object obj) {
        jc.i.e((Set) obj, "p0");
        i iVar = (i) this.f5761b;
        ReentrantLock reentrantLock = iVar.f10453d;
        reentrantLock.lock();
        try {
            List listN0 = vb.i.n0(iVar.f10452c.values());
            reentrantLock.unlock();
            Iterator it = listN0.iterator();
            if (!it.hasNext()) {
                return ub.k.f9073a;
            }
            ((n) it.next()).getClass();
            throw null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
