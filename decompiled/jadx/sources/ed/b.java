package ed;

import fd.k;
import fd.l;
import id.o;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f3539f = obj;
    }

    @Override // ed.a
    public final long a() {
        switch (this.e) {
            case 0:
                ((ic.a) this.f3539f).a();
                return -1L;
            case 1:
                l lVar = (l) this.f3539f;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j4 = Long.MIN_VALUE;
                k kVar = null;
                int i10 = 0;
                for (k kVar2 : (ConcurrentLinkedQueue) lVar.e) {
                    i.d(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, jNanoTime) > 0) {
                            i10++;
                        } else {
                            i++;
                            long j10 = jNanoTime - kVar2.f3950q;
                            if (j10 > j4) {
                                kVar = kVar2;
                                j4 = j10;
                            }
                        }
                    }
                }
                long j11 = lVar.f3952b;
                if (j4 < j11 && i <= 5) {
                    if (i > 0) {
                        return j11 - j4;
                    }
                    if (i10 > 0) {
                        return j11;
                    }
                    return -1L;
                }
                i.b(kVar);
                synchronized (kVar) {
                    if (!kVar.f3949p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f3950q + j4 != jNanoTime) {
                        return 0L;
                    }
                    kVar.f3943j = true;
                    ((ConcurrentLinkedQueue) lVar.e).remove(kVar);
                    Socket socket = kVar.f3940d;
                    i.b(socket);
                    cd.b.e(socket);
                    if (!((ConcurrentLinkedQueue) lVar.e).isEmpty()) {
                        return 0L;
                    }
                    ((c) lVar.f3953c).a();
                    return 0L;
                }
            default:
                o oVar = (o) this.f3539f;
                oVar.getClass();
                try {
                    oVar.H.E(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    oVar.c(2, 2, e);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.e = 1;
        this.f3539f = lVar;
    }
}
