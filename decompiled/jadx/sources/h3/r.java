package h3;

import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(String str, yb.d dVar, int i) {
        super(2, dVar);
        this.f4818a = i;
        this.f4821d = str;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4818a) {
            case 0:
                r rVar = new r(this.f4821d, dVar, 0);
                rVar.f4820c = obj;
                return rVar;
            default:
                r rVar2 = new r(this.f4821d, dVar, 1);
                rVar2.f4820c = obj;
                return rVar2;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        rc.a0 a0Var = (rc.a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f4818a) {
            case 0:
                break;
        }
        return ((r) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        Object objM2;
        int i = this.f4818a;
        String str = this.f4821d;
        yb.d dVar = null;
        ub.k kVar = ub.k.f9073a;
        int i10 = 1;
        switch (i) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i11 = this.f4819b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                    return kVar;
                }
                r7.g.G(obj);
                try {
                    objM = (String) Tasks.await(FirebaseMessaging.c().e());
                    break;
                } catch (Throwable th) {
                    objM = r7.g.m(th);
                }
                if (objM instanceof ub.g) {
                    objM = null;
                }
                String str2 = (String) objM;
                if (str2 == null) {
                    return kVar;
                }
                bd.s sVar = k3.i.f5942a;
                this.f4819b = 1;
                Object objY = rc.b0.y(rc.k0.f8293b, new k3.f(str, str2, dVar, i10), this);
                if (objY != zb.a.f11555a) {
                    objY = kVar;
                }
                return objY == aVar ? aVar : kVar;
            default:
                zb.a aVar2 = zb.a.f11555a;
                int i12 = this.f4819b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                    return kVar;
                }
                r7.g.G(obj);
                try {
                    objM2 = (String) Tasks.await(FirebaseMessaging.c().e());
                    break;
                } catch (Throwable th2) {
                    objM2 = r7.g.m(th2);
                }
                if (objM2 instanceof ub.g) {
                    objM2 = null;
                }
                String str3 = (String) objM2;
                if (str3 == null) {
                    return kVar;
                }
                bd.s sVar2 = k3.i.f5942a;
                this.f4819b = 1;
                Object objY2 = rc.b0.y(rc.k0.f8293b, new k3.f(str, str3, dVar, i10), this);
                if (objY2 != zb.a.f11555a) {
                    objY2 = kVar;
                }
                return objY2 == aVar2 ? aVar2 : kVar;
        }
    }
}
