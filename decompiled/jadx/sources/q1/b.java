package q1;

import gb.r;
import ic.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import jc.j;
import pb.c;
import rc.f0;
import rc.y1;
import t.h;
import tc.d;
import tc.g;
import tc.i;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Object obj2) {
        super(1);
        this.f7975a = i;
        this.f7976b = obj;
        this.f7977c = obj2;
    }

    @Override // ic.l
    public final Object invoke(Object obj) throws Throwable {
        Object gVar;
        k kVar;
        k kVar2;
        switch (this.f7975a) {
            case 0:
                Throwable th = (Throwable) obj;
                h hVar = (h) this.f7976b;
                if (th == null) {
                    Object objV = ((f0) this.f7977c).v();
                    hVar.f8515d = true;
                    t.j jVar = hVar.f8513b;
                    if (jVar != null && jVar.f8518b.i(objV)) {
                        hVar.f8512a = null;
                        hVar.f8513b = null;
                        hVar.f8514c = null;
                    }
                } else if (th instanceof CancellationException) {
                    hVar.f8515d = true;
                    t.j jVar2 = hVar.f8513b;
                    if (jVar2 != null && jVar2.f8518b.cancel(true)) {
                        hVar.f8512a = null;
                        hVar.f8513b = null;
                        hVar.f8514c = null;
                    }
                } else {
                    hVar.f8515d = true;
                    t.j jVar3 = hVar.f8513b;
                    if (jVar3 != null && jVar3.f8518b.j(th)) {
                        hVar.f8512a = null;
                        hVar.f8513b = null;
                        hVar.f8514c = null;
                    }
                }
                return k.f9073a;
            default:
                Throwable th2 = (Throwable) obj;
                ((c) this.f7976b).invoke(th2);
                tc.b bVar = (tc.b) ((r) this.f7977c).f4495c;
                bVar.g(false, th2);
                do {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = tc.b.f8679c;
                    long j4 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = tc.b.f8678b;
                    long j10 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.s(j10, true)) {
                        gVar = new g(bVar.n());
                    } else {
                        long j11 = j10 & 1152921504606846975L;
                        tc.h hVar2 = i.f8708a;
                        if (j4 >= j11) {
                            gVar = hVar2;
                        } else {
                            Object obj2 = d.f8695k;
                            tc.j jVar4 = (tc.j) tc.b.f8682r.get(bVar);
                            while (true) {
                                if (bVar.s(atomicLongFieldUpdater2.get(bVar), true)) {
                                    gVar = new g(bVar.n());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                    long j12 = d.f8689b;
                                    long j13 = andIncrement / j12;
                                    int i = (int) (andIncrement % j12);
                                    if (jVar4.f9954c != j13) {
                                        tc.j jVarM = bVar.m(j13, jVar4);
                                        if (jVarM == null) {
                                            continue;
                                        } else {
                                            jVar4 = jVarM;
                                        }
                                    }
                                    Object objA = bVar.A(jVar4, i, andIncrement, obj2);
                                    if (objA == d.f8697m) {
                                        y1 y1Var = obj2 instanceof y1 ? (y1) obj2 : null;
                                        if (y1Var != null) {
                                            y1Var.a(jVar4, i);
                                        }
                                        bVar.C(andIncrement);
                                        jVar4.h();
                                        gVar = hVar2;
                                    } else if (objA == d.f8699o) {
                                        if (andIncrement < bVar.q()) {
                                            jVar4.a();
                                        }
                                    } else {
                                        if (objA == d.f8698n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar4.a();
                                        gVar = objA;
                                    }
                                }
                            }
                        }
                    }
                    kVar = null;
                    if (gVar instanceof tc.h) {
                        gVar = null;
                    }
                    kVar2 = k.f9073a;
                    if (gVar != null) {
                        z0.k kVar3 = (z0.k) gVar;
                        if (kVar3 instanceof z0.j) {
                            ((z0.j) kVar3).f10881b.W(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2);
                        }
                        kVar = kVar2;
                    }
                } while (kVar != null);
                return kVar2;
        }
    }
}
