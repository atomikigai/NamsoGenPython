package d1;

import ac.i;
import ic.p;
import java.util.LinkedHashMap;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f2796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, yb.d dVar, int i) {
        super(2, dVar);
        this.f2793a = i;
        switch (i) {
            case 1:
                this.f2796d = (i) pVar;
                super(2, dVar);
                break;
            default:
                this.f2796d = (i) pVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ac.i, ic.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ac.i, ic.p] */
    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f2793a) {
            case 0:
                c cVar = new c(this.f2796d, dVar, 0);
                cVar.f2795c = obj;
                return cVar;
            default:
                c cVar2 = new c(this.f2796d, dVar, 1);
                cVar2.f2795c = obj;
                return cVar2;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f2793a) {
            case 0:
                break;
        }
        return ((c) create(bVar, dVar)).invokeSuspend(k.f9073a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ac.i, ic.p] */
    /* JADX WARN: Type inference failed for: r5v11, types: [ac.i, ic.p] */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2793a) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i = this.f2794b;
                if (i == 0) {
                    r7.g.G(obj);
                    b bVar = (b) this.f2795c;
                    this.f2794b = 1;
                    obj = this.f2796d.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                b bVar2 = (b) obj;
                bVar2.f2792b.set(true);
                return bVar2;
            default:
                zb.a aVar2 = zb.a.f11555a;
                int i10 = this.f2794b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.f2795c;
                    r7.g.G(obj);
                    return bVar3;
                }
                r7.g.G(obj);
                b bVar4 = new b(new LinkedHashMap(((b) this.f2795c).a()), false);
                this.f2795c = bVar4;
                this.f2794b = 1;
                return this.f2796d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
