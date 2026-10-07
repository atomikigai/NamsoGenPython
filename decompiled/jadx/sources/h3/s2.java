package h3;

import app.namso_gen.spacehowen.SettingsActivity;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f4841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(SettingsActivity settingsActivity, yb.d dVar, int i) {
        super(2, dVar);
        this.f4838a = i;
        this.f4841d = settingsActivity;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4838a) {
            case 0:
                s2 s2Var = new s2(this.f4841d, dVar, 0);
                s2Var.f4840c = obj;
                return s2Var;
            default:
                s2 s2Var2 = new s2(this.f4841d, dVar, 1);
                s2Var2.f4840c = obj;
                return s2Var2;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        rc.a0 a0Var = (rc.a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f4838a) {
            case 0:
                break;
        }
        return ((s2) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f4838a;
        SettingsActivity settingsActivity = this.f4841d;
        int i10 = 2;
        yb.d dVar = null;
        ub.k kVar = ub.k.f9073a;
        int i11 = 0;
        int i12 = 1;
        switch (i) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i13 = this.f4839b;
                try {
                    if (i13 == 0) {
                        r7.g.G(obj);
                        bd.s sVar = k3.h.f5941a;
                        this.f4840c = settingsActivity;
                        this.f4839b = 1;
                        Object objY = rc.b0.y(rc.k0.f8293b, new k3.g(i10, dVar, i12), this);
                        if (objY != aVar) {
                            objY = kVar;
                        }
                        if (objY == aVar) {
                        }
                        return aVar;
                    }
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r7.g.G(obj);
                        return kVar;
                    }
                    r7.g.G(obj);
                    String str = (String) Tasks.await(FirebaseMessaging.c().e());
                    bd.s sVar2 = k3.h.f5941a;
                    jc.i.b(str);
                    this.f4840c = null;
                    this.f4839b = 2;
                    Object objY2 = rc.b0.y(rc.k0.f8293b, new k3.f("unregister", str, dVar, i11), this);
                    if (objY2 != aVar) {
                        objY2 = kVar;
                    }
                    if (objY2 != aVar) {
                        objY2 = kVar;
                    }
                    if (objY2 != aVar) {
                        return kVar;
                    }
                    return aVar;
                } catch (Throwable th) {
                    r7.g.m(th);
                    return kVar;
                }
            default:
                zb.a aVar2 = zb.a.f11555a;
                int i14 = this.f4839b;
                try {
                    if (i14 == 0) {
                        r7.g.G(obj);
                        bd.s sVar3 = k3.h.f5941a;
                        this.f4840c = settingsActivity;
                        this.f4839b = 1;
                        Object objY3 = rc.b0.y(rc.k0.f8293b, new k3.g(i10, dVar, i11), this);
                        if (objY3 != aVar2) {
                            objY3 = kVar;
                        }
                        if (objY3 == aVar2) {
                        }
                        return aVar2;
                    }
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r7.g.G(obj);
                        return kVar;
                    }
                    r7.g.G(obj);
                    String str2 = (String) Tasks.await(FirebaseMessaging.c().e());
                    bd.s sVar4 = k3.h.f5941a;
                    jc.i.b(str2);
                    this.f4840c = null;
                    this.f4839b = 2;
                    Object objY4 = rc.b0.y(rc.k0.f8293b, new k3.f("register", str2, dVar, i11), this);
                    if (objY4 != aVar2) {
                        objY4 = kVar;
                    }
                    if (objY4 != aVar2) {
                        objY4 = kVar;
                    }
                    if (objY4 != aVar2) {
                        return kVar;
                    }
                    return aVar2;
                } catch (Throwable th2) {
                    r7.g.m(th2);
                    return kVar;
                }
        }
    }
}
