package vc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f9322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, yb.d dVar, int i) {
        super(2, dVar);
        this.f9319a = i;
        this.f9322d = fVar;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f9319a) {
            case 0:
                e eVar = new e(this.f9322d, dVar, 0);
                eVar.f9321c = obj;
                return eVar;
            default:
                e eVar2 = new e(this.f9322d, dVar, 1);
                eVar2.f9321c = obj;
                return eVar2;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9319a) {
            case 0:
                return ((e) create((tc.o) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            default:
                return ((e) create((uc.c) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
        }
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9319a) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i = this.f9320b;
                if (i == 0) {
                    r7.g.G(obj);
                    tc.o oVar = (tc.o) this.f9321c;
                    this.f9320b = 1;
                    f fVar = this.f9322d;
                    fVar.getClass();
                    Object objD = fVar.f9326d.d(new o(oVar), this);
                    zb.a aVar2 = zb.a.f11555a;
                    Object obj2 = ub.k.f9073a;
                    if (objD != aVar2) {
                        objD = obj2;
                    }
                    if (objD == aVar2) {
                        obj2 = objD;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                return ub.k.f9073a;
            default:
                zb.a aVar3 = zb.a.f11555a;
                int i10 = this.f9320b;
                ub.k kVar = ub.k.f9073a;
                if (i10 == 0) {
                    r7.g.G(obj);
                    uc.c cVar = (uc.c) this.f9321c;
                    this.f9320b = 1;
                    Object objD2 = this.f9322d.f9326d.d(cVar, this);
                    if (objD2 != aVar3) {
                        objD2 = kVar;
                    }
                    if (objD2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                return kVar;
        }
    }
}
