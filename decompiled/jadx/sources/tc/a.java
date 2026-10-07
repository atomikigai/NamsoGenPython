package tc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.b0;
import rc.y1;
import wc.t;
import wc.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8675a = d.f8700p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rc.k f8676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f8677c;

    public a(b bVar) {
        this.f8677c = bVar;
    }

    @Override // rc.y1
    public final void a(t tVar, int i) {
        rc.k kVar = this.f8676b;
        if (kVar != null) {
            kVar.a(tVar, i);
        }
    }

    public final Object b(uc.d dVar) throws Throwable {
        j jVarM;
        j jVarM2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f8682r;
        b bVar = this.f8677c;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (!bVar.s(b.f8678b.get(bVar), true)) {
            long andIncrement = b.f8679c.getAndIncrement(bVar);
            long j4 = d.f8689b;
            long j10 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (jVar.f9954c != j10) {
                jVarM = bVar.m(j10, jVar);
                if (jVarM == null) {
                    continue;
                }
            } else {
                jVarM = jVar;
            }
            Object objA = bVar.A(jVarM, i, andIncrement, null);
            i6.e eVar = d.f8697m;
            if (objA == eVar) {
                throw new IllegalStateException("unreachable");
            }
            i6.e eVar2 = d.f8699o;
            if (objA == eVar2) {
                if (andIncrement < bVar.q()) {
                    jVarM.a();
                }
                jVar = jVarM;
            } else {
                if (objA != d.f8698n) {
                    jVarM.a();
                    this.f8675a = objA;
                    return Boolean.TRUE;
                }
                rc.k kVarM = b0.m(qd.b.r(dVar));
                try {
                    this.f8676b = kVarM;
                    try {
                        Object objA2 = bVar.A(jVarM, i, andIncrement, this);
                        if (objA2 == eVar) {
                            a(jVarM, i);
                        } else {
                            if (objA2 == eVar2) {
                                if (andIncrement < bVar.q()) {
                                    jVarM.a();
                                }
                                j jVar2 = (j) b.f8682r.get(bVar);
                                while (true) {
                                    if (bVar.s(b.f8678b.get(bVar), true)) {
                                        rc.k kVar = this.f8676b;
                                        jc.i.b(kVar);
                                        this.f8676b = null;
                                        this.f8675a = d.f8696l;
                                        Throwable thN = bVar.n();
                                        if (thN == null) {
                                            kVar.resumeWith(Boolean.FALSE);
                                        } else {
                                            kVar.resumeWith(r7.g.m(thN));
                                        }
                                    } else {
                                        long andIncrement2 = b.f8679c.getAndIncrement(bVar);
                                        long j11 = d.f8689b;
                                        long j12 = andIncrement2 / j11;
                                        int i10 = (int) (andIncrement2 % j11);
                                        if (jVar2.f9954c != j12) {
                                            jVarM2 = bVar.m(j12, jVar2);
                                            if (jVarM2 == null) {
                                            }
                                        } else {
                                            jVarM2 = jVar2;
                                        }
                                        Object objA3 = bVar.A(jVarM2, i10, andIncrement2, this);
                                        if (objA3 == d.f8697m) {
                                            a(jVarM2, i10);
                                        } else {
                                            if (objA3 != d.f8699o) {
                                                if (objA3 == d.f8698n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                jVarM2.a();
                                                this.f8675a = objA3;
                                                this.f8676b = null;
                                                break;
                                            }
                                            if (andIncrement2 < bVar.q()) {
                                                jVarM2.a();
                                            }
                                            jVar2 = jVarM2;
                                        }
                                    }
                                }
                            } else {
                                jVarM.a();
                                this.f8675a = objA2;
                                this.f8676b = null;
                            }
                            kVarM.f(Boolean.TRUE, null);
                        }
                        Object objR = kVarM.r();
                        zb.a aVar = zb.a.f11555a;
                        return objR;
                    } catch (Throwable th) {
                        th = th;
                        kVarM.z();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        this.f8675a = d.f8696l;
        Throwable thN2 = bVar.n();
        if (thN2 == null) {
            return Boolean.FALSE;
        }
        int i11 = u.f9955a;
        throw thN2;
    }
}
