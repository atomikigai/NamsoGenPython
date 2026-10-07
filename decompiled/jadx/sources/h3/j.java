package h3;

import app.namso_gen.spacehowen.CheckerHistoryActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckerHistoryActivity f4736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i, CheckerHistoryActivity checkerHistoryActivity, yb.d dVar) {
        super(2, dVar);
        this.f4735b = i;
        this.f4736c = checkerHistoryActivity;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        return new j(this.f4735b, this.f4736c, dVar);
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((rc.a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[RETURN] */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        zb.a aVar = zb.a.f11555a;
        int i = this.f4734a;
        ub.k kVar = ub.k.f9073a;
        if (i != 0) {
            if (i == 1) {
                r7.g.G(obj);
                return kVar;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(obj);
            return kVar;
        }
        r7.g.G(obj);
        int i10 = this.f4735b;
        CheckerHistoryActivity checkerHistoryActivity = this.f4736c;
        if (i10 == 0) {
            int i11 = CheckerHistoryActivity.Q;
            i3.e eVarT = checkerHistoryActivity.t();
            this.f4734a = 1;
            Object objW = n9.b.w(new o(4), eVarT.f5167a, this, false, true);
            if (objW != aVar) {
                objW = kVar;
            }
            if (objW == aVar) {
                return aVar;
            }
            return kVar;
        }
        int i12 = CheckerHistoryActivity.Q;
        i3.e eVarT2 = checkerHistoryActivity.t();
        this.f4734a = 2;
        Object objW2 = n9.b.w(new o(3), eVarT2.f5167a, this, false, true);
        if (objW2 != aVar) {
            objW2 = kVar;
        }
        if (objW2 == aVar) {
            return aVar;
        }
        return kVar;
    }
}
