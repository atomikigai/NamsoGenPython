package a2;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import rc.a0;
import rc.b0;
import rc.k0;
import rc.q1;
import rc.y0;
import z0.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f91b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(ic.p pVar, yb.d dVar) {
        super(2, dVar);
        this.f90a = 0;
        this.f92c = (ac.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ac.i, ic.p] */
    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f90a) {
            case 0:
                y yVar = new y((ic.p) this.f92c, dVar);
                yVar.f91b = obj;
                return yVar;
            case 1:
                y yVar2 = new y((LifecycleCoroutineScopeImpl) this.f92c, dVar, 1);
                yVar2.f91b = obj;
                return yVar2;
            case 2:
                y yVar3 = new y((Set) this.f92c, dVar, 2);
                yVar3.f91b = obj;
                return yVar3;
            case 3:
                y yVar4 = new y(dVar, (ic.l) this.f92c);
                yVar4.f91b = obj;
                return yVar4;
            default:
                y yVar5 = new y((z) this.f92c, dVar, 4);
                yVar5.f91b = obj;
                return yVar5;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90a) {
            case 0:
                return ((y) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 1:
                y yVar = (y) create((a0) obj, (yb.d) obj2);
                ub.k kVar = ub.k.f9073a;
                yVar.invokeSuspend(kVar);
                return kVar;
            case 2:
                return ((y) create((d1.b) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 3:
                return ((y) create((p) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            default:
                return ((y) create((z) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ac.i, ic.p] */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f90a;
        yb.d dVar = null;
        boolean z4 = true;
        int i10 = 0;
        Object obj2 = this.f92c;
        switch (i) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                r7.g.G(obj);
                yb.i iVarB = ((a0) this.f91b).b();
                yb.e eVar = yb.e.f10673a;
                yb.g gVarH = iVarB.H(eVar);
                jc.i.b(gVarH);
                yb.f fVar = (yb.f) gVarH;
                rc.q qVarA = b0.a();
                e eVar2 = new e(qVarA, (ac.i) obj2, null);
                yb.i iVarI = b0.i(yb.j.f10674a, fVar, true);
                yc.d dVar2 = k0.f8292a;
                if (iVarI != dVar2 && iVarI.H(eVar) == null) {
                    iVarI = iVarI.B(dVar2);
                }
                rc.a q1Var = new q1(iVarI, true);
                q1Var.X(4, q1Var, eVar2);
                while (qVarA.A() instanceof y0) {
                    try {
                        return b0.u(fVar, new x(qVarA, dVar, i10));
                    } catch (InterruptedException unused) {
                    }
                }
                return qVarA.v();
            case 1:
                zb.a aVar2 = zb.a.f11555a;
                r7.g.G(obj);
                a0 a0Var = (a0) this.f91b;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) obj2;
                androidx.lifecycle.t tVar = lifecycleCoroutineScopeImpl.f1022a;
                if (tVar.f1093d.compareTo(androidx.lifecycle.m.f1066b) >= 0) {
                    tVar.a(lifecycleCoroutineScopeImpl);
                } else {
                    b0.f(a0Var.b(), null);
                }
                return ub.k.f9073a;
            case 2:
                zb.a aVar3 = zb.a.f11555a;
                r7.g.G(obj);
                Set setKeySet = ((d1.b) this.f91b).a().keySet();
                ArrayList arrayList = new ArrayList(vb.k.U(setKeySet));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d1.d) it.next()).f2797a);
                }
                Set set = (Set) obj2;
                if (set != c1.l.f1728a) {
                    if (set == null || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
            case 3:
                zb.a aVar4 = zb.a.f11555a;
                r7.g.G(obj);
                p pVar = (p) this.f91b;
                jc.i.c(pVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return ((ic.l) obj2).invoke(pVar.d());
            default:
                zb.a aVar5 = zb.a.f11555a;
                r7.g.G(obj);
                z zVar = (z) obj2;
                return Boolean.valueOf(((zVar instanceof z0.b) || (zVar instanceof z0.g) || ((z) this.f91b) != zVar) ? false : true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, yb.d dVar, int i) {
        super(2, dVar);
        this.f90a = i;
        this.f92c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yb.d dVar, ic.l lVar) {
        super(2, dVar);
        this.f90a = 3;
        this.f92c = lVar;
    }
}
