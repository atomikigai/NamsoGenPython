package vc;

import ic.q;
import rc.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends ac.c implements uc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.c f9331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.i f9332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yb.i f9334d;
    public yb.d e;

    public k(uc.c cVar, yb.i iVar) {
        super(i.f9329a, yb.j.f10674a);
        this.f9331a = cVar;
        this.f9332b = iVar;
        this.f9333c = ((Number) iVar.G(0, j.f9330a)).intValue();
    }

    @Override // uc.c
    public final Object c(Object obj, yb.d dVar) {
        try {
            Object objD = d(dVar, obj);
            return objD == zb.a.f11555a ? objD : ub.k.f9073a;
        } catch (Throwable th) {
            this.f9334d = new g(th, dVar.getContext());
            throw th;
        }
    }

    public final Object d(yb.d dVar, Object obj) {
        yb.i context = dVar.getContext();
        b0.h(context);
        yb.i iVar = this.f9334d;
        if (iVar != context) {
            if (iVar instanceof g) {
                throw new IllegalStateException(pc.h.W("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((g) iVar).f9327a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.G(0, new n(this))).intValue() != this.f9333c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f9332b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f9334d = context;
        }
        this.e = dVar;
        q qVar = m.f9336a;
        uc.c cVar = this.f9331a;
        jc.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objB = qVar.b(cVar, obj, this);
        if (!jc.i.a(objB, zb.a.f11555a)) {
            this.e = null;
        }
        return objB;
    }

    @Override // ac.a, ac.d
    public final ac.d getCallerFrame() {
        yb.d dVar = this.e;
        if (dVar instanceof ac.d) {
            return (ac.d) dVar;
        }
        return null;
    }

    @Override // ac.c, yb.d
    public final yb.i getContext() {
        yb.i iVar = this.f9334d;
        return iVar == null ? yb.j.f10674a : iVar;
    }

    @Override // ac.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = ub.h.a(obj);
        if (thA != null) {
            this.f9334d = new g(thA, getContext());
        }
        yb.d dVar = this.e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return zb.a.f11555a;
    }
}
