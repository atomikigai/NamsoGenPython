package y1;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f10440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(l0 l0Var, yb.d dVar, int i) {
        super(2, dVar);
        this.f10437a = i;
        this.f10440d = l0Var;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f10437a) {
            case 0:
                g0 g0Var = new g0(this.f10440d, dVar, 0);
                g0Var.f10439c = obj;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0(this.f10440d, dVar, 1);
                g0Var2.f10439c = obj;
                return g0Var2;
            default:
                g0 g0Var3 = new g0(this.f10440d, dVar, 2);
                g0Var3.f10439c = obj;
                return g0Var3;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10437a) {
            case 0:
                return ((g0) create((a2.p) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 1:
                return ((g0) create((b0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            default:
                return ((g0) create((b0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
        }
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        Object objC;
        Object objA;
        b0 b0Var2;
        Object objC2;
        l[] lVarArr;
        l lVar;
        switch (this.f10437a) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i = this.f10438b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                    return obj;
                }
                r7.g.G(obj);
                a2.p pVar = (a2.p) this.f10439c;
                this.f10438b = 1;
                Object objA2 = l0.a(this.f10440d, pVar, this);
                return objA2 == aVar ? aVar : objA2;
            case 1:
                zb.a aVar2 = zb.a.f11555a;
                int i10 = this.f10438b;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            b0Var = (b0) this.f10439c;
                            r7.g.G(obj);
                            objC = obj;
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r7.g.G(obj);
                            objA = obj;
                        }
                        return (Set) objA;
                    }
                    r7.g.G(obj);
                    b0Var = (b0) this.f10439c;
                    this.f10439c = b0Var;
                    this.f10438b = 1;
                    objC = b0Var.c(this);
                    if (objC == aVar2) {
                        return aVar2;
                    }
                    if (!((Boolean) objC).booleanValue()) {
                        a0 a0Var = a0.f10414b;
                        g0 g0Var = new g0(this.f10440d, null, 0);
                        this.f10439c = null;
                        this.f10438b = 2;
                        objA = b0Var.a(a0Var, g0Var, this);
                        if (objA == aVar2) {
                            return aVar2;
                        }
                        return (Set) objA;
                    }
                } catch (SQLException unused) {
                }
                return vb.s.f9299a;
            default:
                zb.a aVar3 = zb.a.f11555a;
                int i11 = this.f10438b;
                ub.k kVar = ub.k.f9073a;
                boolean z4 = true;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b0Var2 = (b0) this.f10439c;
                        r7.g.G(obj);
                        objC2 = obj;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r7.g.G(obj);
                    }
                    return kVar;
                }
                r7.g.G(obj);
                b0Var2 = (b0) this.f10439c;
                this.f10439c = b0Var2;
                this.f10438b = 1;
                objC2 = b0Var2.c(this);
                if (objC2 == aVar3) {
                    return aVar3;
                }
                if (!((Boolean) objC2).booleanValue()) {
                    l0 l0Var = this.f10440d;
                    com.bumptech.glide.manager.q qVar = l0Var.h;
                    long[] jArr = (long[]) qVar.f1934c;
                    ReentrantLock reentrantLock = (ReentrantLock) qVar.f1933b;
                    reentrantLock.lock();
                    try {
                        if (qVar.f1932a) {
                            boolean z10 = false;
                            qVar.f1932a = false;
                            int length = jArr.length;
                            lVarArr = new l[length];
                            int i12 = 0;
                            boolean z11 = false;
                            while (i12 < length) {
                                if (jArr[i12] <= 0) {
                                    z4 = z10;
                                }
                                boolean[] zArr = (boolean[]) qVar.f1935d;
                                if (z4 != zArr[i12]) {
                                    zArr[i12] = z4;
                                    lVar = z4 ? l.f10479b : l.f10480c;
                                    z11 = true;
                                } else {
                                    lVar = l.f10478a;
                                }
                                lVarArr[i12] = lVar;
                                i12++;
                                z4 = true;
                                z10 = false;
                            }
                            if (!z11) {
                                lVarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            lVarArr = null;
                        }
                        if (lVarArr != null) {
                            a0 a0Var2 = a0.f10414b;
                            k0 k0Var = new k0(lVarArr, l0Var, b0Var2, null);
                            this.f10439c = null;
                            this.f10438b = 2;
                            if (b0Var2.a(a0Var2, k0Var, this) == aVar3) {
                                return aVar3;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return kVar;
        }
    }
}
