package z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f10888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(y yVar, yb.d dVar, int i) {
        super(2, dVar);
        this.f10885a = i;
        this.f10888d = yVar;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f10885a) {
            case 0:
                m mVar = new m(this.f10888d, dVar, 0);
                mVar.f10887c = obj;
                return mVar;
            default:
                m mVar2 = new m(this.f10888d, dVar, 1);
                mVar2.f10887c = obj;
                return mVar2;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10885a) {
            case 0:
                return ((m) create((k) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            default:
                return ((m) create((uc.c) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        switch (this.f10885a) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i = this.f10886b;
                ub.k kVar = ub.k.f9073a;
                if (i == 0) {
                    r7.g.G(obj);
                    k kVar2 = (k) this.f10887c;
                    boolean z4 = kVar2 instanceof i;
                    y yVar = this.f10888d;
                    if (z4) {
                        i iVar = (i) kVar2;
                        this.f10886b = 1;
                        z zVar = (z) yVar.f10949f.f();
                        if (zVar instanceof b) {
                            objF = kVar;
                        } else if (!(zVar instanceof h)) {
                            if (jc.i.a(zVar, a0.f10862a)) {
                                objF = yVar.f(this);
                                if (objF != aVar) {
                                }
                            } else if (zVar instanceof g) {
                                throw new IllegalStateException("Can't read in final state.");
                            }
                            objF = kVar;
                        } else if (zVar != iVar.f10879a || (objF = yVar.f(this)) != aVar) {
                            objF = kVar;
                        }
                        if (objF == aVar) {
                            return aVar;
                        }
                    } else if (kVar2 instanceof j) {
                        this.f10886b = 2;
                        if (y.b(yVar, (j) kVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                return kVar;
            default:
                y yVar2 = this.f10888d;
                uc.i iVar2 = yVar2.f10949f;
                zb.a aVar2 = zb.a.f11555a;
                int i10 = this.f10886b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                    return ub.k.f9073a;
                }
                r7.g.G(obj);
                uc.c cVar = (uc.c) this.f10887c;
                z zVar2 = (z) iVar2.f();
                if (!(zVar2 instanceof b)) {
                    yVar2.f10951s.m(new i(zVar2));
                }
                a2.y yVar3 = new a2.y(zVar2, null, 4);
                this.f10886b = 1;
                iVar2.d(new a2.k(new jc.o(), new h3.h(cVar, 5), yVar3), this);
                return aVar2;
        }
    }
}
