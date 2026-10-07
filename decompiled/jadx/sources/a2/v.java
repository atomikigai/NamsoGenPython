package a2;

import android.database.SQLException;
import androidx.datastore.preferences.protobuf.d1;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import y1.a0;
import y1.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements b0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f83a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb.g f85c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f86d;

    public v(i iVar, boolean z4) {
        jc.i.e(iVar, "delegate");
        this.f83a = iVar;
        this.f84b = z4;
        this.f85c = new vb.g();
        this.f86d = new AtomicBoolean(false);
    }

    @Override // y1.b0
    public final Object a(a0 a0Var, ic.p pVar, ac.i iVar) {
        if (this.f86d.get()) {
            jd.d.K(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().H(a.f2b);
        if (aVar != null && aVar.f3a == this) {
            return g(a0Var, pVar, iVar);
        }
        jd.d.K(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y1.o
    public final Object b(String str, ic.l lVar, ac.c cVar) {
        u uVar;
        i iVar;
        v vVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i = uVar.f82r;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.f82r = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.e;
        zb.a aVar = zb.a.f11555a;
        int i10 = uVar.f82r;
        if (i10 == 0) {
            r7.g.G(obj);
            if (this.f86d.get()) {
                jd.d.K(21, "Connection is recycled");
                throw null;
            }
            a aVar2 = (a) uVar.getContext().H(a.f2b);
            if (aVar2 == null || aVar2.f3a != this) {
                jd.d.K(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            uVar.f77a = this;
            uVar.f78b = str;
            uVar.f79c = lVar;
            iVar = this.f83a;
            uVar.f80d = iVar;
            uVar.f82r = 1;
            if (iVar.f31b.c(uVar) == aVar) {
                return aVar;
            }
            vVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar2 = uVar.f80d;
            lVar = uVar.f79c;
            String str2 = uVar.f78b;
            vVar = uVar.f77a;
            r7.g.G(obj);
            iVar = iVar2;
            str = str2;
        }
        try {
            o oVar = new o(vVar, vVar.f83a.R(str));
            try {
                Object objInvoke = lVar.invoke(oVar);
                a.a.b(oVar, null);
                iVar.d(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a.a.b(oVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            iVar.d(null);
            throw th3;
        }
    }

    @Override // y1.b0
    public final Object c(ac.i iVar) {
        if (this.f86d.get()) {
            jd.d.K(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().H(a.f2b);
        if (aVar != null && aVar.f3a == this) {
            return Boolean.valueOf(!this.f85c.isEmpty());
        }
        jd.d.K(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // a2.w
    public final g2.a d() {
        return this.f83a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(a0 a0Var, ac.c cVar) {
        r rVar;
        i iVar;
        v vVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.f66f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.f66f = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f65d;
        zb.a aVar = zb.a.f11555a;
        int i10 = rVar.f66f;
        if (i10 == 0) {
            r7.g.G(obj);
            rVar.f62a = this;
            rVar.f63b = a0Var;
            iVar = this.f83a;
            rVar.f64c = iVar;
            rVar.f66f = 1;
            if (iVar.f31b.c(rVar) == aVar) {
                return aVar;
            }
            vVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar2 = rVar.f64c;
            a0 a0Var2 = rVar.f63b;
            vVar = rVar.f62a;
            r7.g.G(obj);
            iVar = iVar2;
            a0Var = a0Var2;
        }
        try {
            vb.g gVar = vVar.f85c;
            i iVar3 = vVar.f83a;
            int i11 = gVar.f9295c;
            if (gVar.isEmpty()) {
                int iOrdinal = a0Var.ordinal();
                if (iOrdinal == 0) {
                    jd.d.o(iVar3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    jd.d.o(iVar3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new d1();
                    }
                    jd.d.o(iVar3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                jd.d.o(iVar3, "SAVEPOINT '" + i11 + '\'');
            }
            gVar.addLast(new q(i11));
            ub.k kVar = ub.k.f9073a;
            iVar.d(null);
            return kVar;
        } catch (Throwable th) {
            iVar.d(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z4, ac.c cVar) {
        s sVar;
        v vVar;
        i iVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i = sVar.f71f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.f71f = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f70d;
        zb.a aVar = zb.a.f11555a;
        int i10 = sVar.f71f;
        if (i10 == 0) {
            r7.g.G(obj);
            sVar.f67a = this;
            i iVar2 = this.f83a;
            sVar.f68b = iVar2;
            sVar.f69c = z4;
            sVar.f71f = 1;
            if (iVar2.f31b.c(sVar) == aVar) {
                return aVar;
            }
            vVar = this;
            iVar = iVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = sVar.f69c;
            iVar = sVar.f68b;
            vVar = sVar.f67a;
            r7.g.G(obj);
        }
        try {
            vb.g gVar = vVar.f85c;
            i iVar3 = vVar.f83a;
            if (gVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            jc.i.e(gVar, "<this>");
            if (gVar.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            q qVar = (q) gVar.g(vb.j.R(gVar));
            if (z4) {
                qVar.getClass();
                if (gVar.isEmpty()) {
                    jd.d.o(iVar3, "END TRANSACTION");
                } else {
                    jd.d.o(iVar3, "RELEASE SAVEPOINT '" + qVar.f61a + '\'');
                }
            } else if (gVar.isEmpty()) {
                jd.d.o(iVar3, "ROLLBACK TRANSACTION");
            } else {
                jd.d.o(iVar3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + qVar.f61a + '\'');
            }
            ub.k kVar = ub.k.f9073a;
            iVar.d(null);
            return kVar;
        } catch (Throwable th) {
            iVar.d(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(a0 a0Var, ic.p pVar, ac.c cVar) throws Throwable {
        t tVar;
        v vVar;
        v vVar2;
        int i;
        SQLException e;
        Throwable th;
        boolean z4;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f76f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f76f = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objInvoke = tVar.f75d;
        zb.a aVar = zb.a.f11555a;
        int i11 = tVar.f76f;
        try {
            if (i11 == 0) {
                r7.g.G(objInvoke);
                if (a0Var == null) {
                    a0Var = a0.f10413a;
                }
                tVar.f72a = this;
                tVar.f73b = (Serializable) pVar;
                tVar.f76f = 1;
                if (e(a0Var, tVar) != aVar) {
                    vVar = this;
                }
                return aVar;
            }
            if (i11 == 1) {
                pVar = (ic.p) tVar.f73b;
                vVar = (v) tVar.f72a;
                r7.g.G(objInvoke);
            } else {
                if (i11 != 2) {
                    if (i11 == 3 || i11 == 4) {
                        Object obj = tVar.f72a;
                        r7.g.G(objInvoke);
                        return obj;
                    }
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) tVar.f73b;
                    th = (Throwable) tVar.f72a;
                    try {
                        r7.g.G(objInvoke);
                        throw th;
                    } catch (SQLException e4) {
                        e = e4;
                        if (th != null) {
                            throw e;
                        }
                        p3.a.a(th, e);
                        throw th;
                    }
                }
                i = tVar.f74c;
                vVar2 = (v) tVar.f72a;
                try {
                    r7.g.G(objInvoke);
                    z4 = i != 0;
                    tVar.f72a = objInvoke;
                    tVar.f76f = 3;
                    if (vVar2.f(z4, tVar) != aVar) {
                        return aVar;
                    }
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    vVar = vVar2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            tVar.f72a = th;
                            tVar.f73b = th3;
                            tVar.f76f = 5;
                            if (vVar.f(false, tVar) != aVar) {
                                throw th3;
                            }
                        } catch (SQLException e10) {
                            e = e10;
                            th = th3;
                            if (th != null) {
                                throw e;
                            }
                            p3.a.a(th, e);
                            throw th;
                        }
                    }
                }
            }
            p pVar2 = new p(vVar, 0);
            tVar.f72a = vVar;
            tVar.f73b = null;
            tVar.f74c = 1;
            tVar.f76f = 2;
            objInvoke = pVar.invoke(pVar2, tVar);
            if (objInvoke != aVar) {
                vVar2 = vVar;
                i = 1;
                if (i != 0) {
                }
                tVar.f72a = objInvoke;
                tVar.f76f = 3;
                if (vVar2.f(z4, tVar) != aVar) {
                    return objInvoke;
                }
            }
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
