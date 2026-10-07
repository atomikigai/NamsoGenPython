package h3;

import app.namso_gen.spacehowen.NotificationHistoryActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotificationHistoryActivity f4662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(NotificationHistoryActivity notificationHistoryActivity, yb.d dVar, int i) {
        super(2, dVar);
        this.f4660a = i;
        this.f4662c = notificationHistoryActivity;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4660a) {
            case 0:
                return new d2(this.f4662c, dVar, 0);
            case 1:
                return new d2(this.f4662c, dVar, 1);
            default:
                return new d2(this.f4662c, dVar, 2);
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        rc.a0 a0Var = (rc.a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f4660a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d2) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4660a) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i = this.f4661b;
                if (i == 0) {
                    r7.g.G(obj);
                    i3.n nVar = (i3.n) this.f4662c.N.getValue();
                    long jCurrentTimeMillis = System.currentTimeMillis() - 18000000;
                    this.f4661b = 1;
                    if (nVar.a(jCurrentTimeMillis, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                return ub.k.f9073a;
            case 1:
                zb.a aVar2 = zb.a.f11555a;
                int i10 = this.f4661b;
                if (i10 == 0) {
                    r7.g.G(obj);
                    NotificationHistoryActivity notificationHistoryActivity = this.f4662c;
                    a2.l lVarD = a.a.d(((i3.n) notificationHistoryActivity.N.getValue()).f5188a, new String[]{"notifications"}, new o(6));
                    h hVar = new h(notificationHistoryActivity, 2);
                    this.f4661b = 1;
                    if (lVarD.d(hVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                return ub.k.f9073a;
            default:
                zb.a aVar3 = zb.a.f11555a;
                int i11 = this.f4661b;
                ub.k kVar = ub.k.f9073a;
                if (i11 == 0) {
                    r7.g.G(obj);
                    i3.n nVar2 = (i3.n) this.f4662c.N.getValue();
                    this.f4661b = 1;
                    Object objW = n9.b.w(new o(7), nVar2.f5188a, this, false, true);
                    if (objW != aVar3) {
                        objW = kVar;
                    }
                    if (objW == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                return kVar;
        }
    }
}
