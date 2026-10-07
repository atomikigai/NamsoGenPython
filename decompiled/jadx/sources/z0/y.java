package z0;

import androidx.lifecycle.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import rc.b0;
import rc.b1;
import rc.l1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final LinkedHashSet f10943t = new LinkedHashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f10944u = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f10945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b9.e f10946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.e f10947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10948d = ".tmp";
    public final ub.i e = new ub.i(new j0(this, 7));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uc.i f10949f = new uc.i(a0.f10862a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f10950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gb.r f10951s;

    public y(j0 j0Var, List list, b9.e eVar, rc.a0 a0Var) {
        this.f10945a = j0Var;
        this.f10946b = eVar;
        yb.d dVar = null;
        this.f10947c = new q3.e((ic.p) new m(this, dVar, 1));
        this.f10950r = vb.i.n0(list);
        pb.c cVar = new pb.c(this, 1);
        m mVar = new m(this, dVar, 0);
        gb.r rVar = new gb.r();
        rVar.f4493a = a0Var;
        rVar.f4494b = mVar;
        rVar.f4495c = tc.i.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 6);
        rVar.f4496d = new AtomicInteger(0);
        b1 b1Var = (b1) a0Var.b().H(rc.y.f8337b);
        if (b1Var != null) {
            ((l1) b1Var).I(false, true, new q1.b(1, cVar, rVar));
        }
        this.f10951s = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r8 == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [ac.i, ic.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ac.i, ic.p] */
    /* JADX WARN: Type inference failed for: r8v0, types: [z0.y] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [z0.y] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(z0.y r8, z0.j r9, ac.c r10) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.y.b(z0.y, z0.j, ac.c):java.lang.Object");
    }

    @Override // z0.f
    public final Object a(ic.p pVar, ac.c cVar) throws Throwable {
        rc.q qVarA = b0.a();
        this.f10951s.m(new j(pVar, qVarA, (z) this.f10949f.f(), cVar.getContext()));
        return qVarA.V(cVar);
    }

    public final File c() {
        return (File) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00cb->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ac.c cVar) throws IOException {
        p pVar;
        zc.a aVarA;
        jc.q qVar;
        y yVar;
        jc.q qVar2;
        y yVar2;
        jc.q qVar3;
        r rVar;
        Iterator it;
        zc.a aVar;
        jc.o oVar;
        jc.o oVar2;
        y yVar3;
        jc.q qVar4;
        zc.a aVar2;
        ic.p pVar2;
        Object obj;
        int iHashCode;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i = pVar.f10904t;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.f10904t = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objH = pVar.f10902r;
        zb.a aVar3 = zb.a.f11555a;
        int i10 = pVar.f10904t;
        if (i10 == 0) {
            r7.g.G(objH);
            uc.i iVar = this.f10949f;
            if (!jc.i.a(iVar.f(), a0.f10862a) && !(iVar.f() instanceof h)) {
                throw new IllegalStateException("Check failed.");
            }
            aVarA = zc.e.a();
            qVar = new jc.q();
            pVar.f10897a = this;
            pVar.f10898b = aVarA;
            pVar.f10899c = qVar;
            pVar.f10900d = qVar;
            pVar.f10904t = 1;
            objH = h(pVar);
            if (objH != aVar3) {
                yVar = this;
                qVar2 = qVar;
            }
            return aVar3;
        }
        if (i10 == 1) {
            qVar = (jc.q) pVar.f10900d;
            qVar2 = (jc.q) pVar.f10899c;
            aVarA = (zc.a) pVar.f10898b;
            yVar = pVar.f10897a;
            r7.g.G(objH);
        } else {
            if (i10 == 2) {
                it = pVar.f10901f;
                rVar = pVar.e;
                oVar = (jc.o) pVar.f10900d;
                qVar3 = (jc.q) pVar.f10899c;
                aVar = (zc.a) pVar.f10898b;
                yVar2 = pVar.f10897a;
                r7.g.G(objH);
                while (it.hasNext()) {
                    pVar2 = (ic.p) it.next();
                    pVar.f10897a = yVar2;
                    pVar.f10898b = aVar;
                    pVar.f10899c = qVar3;
                    pVar.f10900d = oVar;
                    pVar.e = rVar;
                    pVar.f10901f = it;
                    pVar.f10904t = 2;
                    if (pVar2.invoke(rVar, pVar) == aVar3) {
                        return aVar3;
                    }
                }
                oVar2 = oVar;
                qVar2 = qVar3;
                aVarA = aVar;
                yVar3 = yVar2;
                yVar3.f10950r = null;
                pVar.f10897a = yVar3;
                pVar.f10898b = qVar2;
                pVar.f10899c = oVar2;
                pVar.f10900d = aVarA;
                pVar.e = null;
                pVar.f10901f = null;
                pVar.f10904t = 3;
                if (aVarA.c(pVar) != aVar3) {
                    qVar4 = qVar2;
                    aVar2 = aVarA;
                }
                return aVar3;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (zc.a) pVar.f10900d;
            oVar2 = (jc.o) pVar.f10899c;
            qVar4 = (jc.q) pVar.f10898b;
            yVar3 = pVar.f10897a;
            r7.g.G(objH);
        }
        try {
            oVar2.f5774a = true;
            aVar2.d(null);
            uc.i iVar2 = yVar3.f10949f;
            obj = qVar4.f5776a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            b bVar = new b(obj, iHashCode);
            iVar2.getClass();
            iVar2.g(null, bVar);
            return ub.k.f9073a;
        } catch (Throwable th) {
            aVar2.d(null);
            throw th;
        }
        qVar.f5776a = objH;
        jc.o oVar3 = new jc.o();
        r rVar2 = new r(aVarA, oVar3, qVar2, yVar);
        List list = yVar.f10950r;
        if (list == null) {
            oVar2 = oVar3;
            yVar3 = yVar;
        } else {
            yVar2 = yVar;
            qVar3 = qVar2;
            rVar = rVar2;
            it = list.iterator();
            aVar = aVarA;
            oVar = oVar3;
            while (it.hasNext()) {
                pVar2 = (ic.p) it.next();
                pVar.f10897a = yVar2;
                pVar.f10898b = aVar;
                pVar.f10899c = qVar3;
                pVar.f10900d = oVar;
                pVar.e = rVar;
                pVar.f10901f = it;
                pVar.f10904t = 2;
                if (pVar2.invoke(rVar, pVar) == aVar3) {
                    return aVar3;
                }
            }
            oVar2 = oVar;
            qVar2 = qVar3;
            aVarA = aVar;
            yVar3 = yVar2;
        }
        yVar3.f10950r = null;
        pVar.f10897a = yVar3;
        pVar.f10898b = qVar2;
        pVar.f10899c = oVar2;
        pVar.f10900d = aVarA;
        pVar.e = null;
        pVar.f10901f = null;
        pVar.f10904t = 3;
        if (aVarA.c(pVar) != aVar3) {
            qVar4 = qVar2;
            aVar2 = aVarA;
            oVar2.f5774a = true;
            aVar2.d(null);
            uc.i iVar3 = yVar3.f10949f;
            obj = qVar4.f5776a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            b bVar2 = new b(obj, iHashCode);
            iVar3.getClass();
            iVar3.g(null, bVar2);
            return ub.k.f9073a;
        }
        return aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ac.c cVar) throws Throwable {
        s sVar;
        y yVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i = sVar.f10919d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.f10919d = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f10917b;
        zb.a aVar = zb.a.f11555a;
        int i10 = sVar.f10919d;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = sVar.f10916a;
            try {
                r7.g.G(obj);
                return ub.k.f9073a;
            } catch (Throwable th) {
                th = th;
                uc.i iVar = yVar.f10949f;
                h hVar = new h(th);
                iVar.getClass();
                iVar.g(null, hVar);
                throw th;
            }
        }
        r7.g.G(obj);
        try {
            sVar.f10916a = this;
            sVar.f10919d = 1;
            if (d(sVar) == aVar) {
                return aVar;
            }
            return ub.k.f9073a;
        } catch (Throwable th2) {
            th = th2;
            yVar = this;
            uc.i iVar2 = yVar.f10949f;
            h hVar2 = new h(th);
            iVar2.getClass();
            iVar2.g(null, hVar2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ac.c cVar) {
        t tVar;
        y yVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i = tVar.f10923d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.f10923d = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f10921b;
        zb.a aVar = zb.a.f11555a;
        int i10 = tVar.f10923d;
        if (i10 == 0) {
            r7.g.G(obj);
            try {
                tVar.f10920a = this;
                tVar.f10923d = 1;
                if (d(tVar) == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                th = th;
                yVar = this;
                uc.i iVar = yVar.f10949f;
                h hVar = new h(th);
                iVar.getClass();
                iVar.g(null, hVar);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = tVar.f10920a;
            try {
                r7.g.G(obj);
            } catch (Throwable th2) {
                th = th2;
                uc.i iVar2 = yVar.f10949f;
                h hVar2 = new h(th);
                iVar2.getClass();
                iVar2.g(null, hVar2);
            }
        }
        return ub.k.f9073a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [z0.y] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [z0.u] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [z0.y] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object g(ac.c cVar) throws IOException {
        ?? uVar;
        FileInputStream fileInputStream;
        Throwable th;
        if (cVar instanceof u) {
            u uVar2 = (u) cVar;
            int i = uVar2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar2.e = i - Integer.MIN_VALUE;
                uVar = uVar2;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.f10926c;
        zb.a aVar = zb.a.f11555a;
        int i10 = uVar.e;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileInputStream = uVar.f10925b;
                uVar = uVar.f10924a;
                try {
                    r7.g.G(obj);
                    r7.g.h(fileInputStream, null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        r7.g.h(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            r7.g.G(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(c());
                try {
                    d1.g gVar = d1.g.f2799a;
                    uVar.f10924a = this;
                    uVar.f10925b = fileInputStream2;
                    uVar.e = 1;
                    d1.b bVarA = gVar.a(fileInputStream2);
                    if (bVarA == aVar) {
                        return aVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = bVarA;
                    r7.g.h(fileInputStream, null);
                    return obj;
                } catch (Throwable th4) {
                    fileInputStream = fileInputStream2;
                    th = th4;
                    uVar = this;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                uVar = this;
                if (uVar.c().exists()) {
                    throw e;
                }
                return new d1.b(true);
            }
        } catch (FileNotFoundException e4) {
            e = e4;
        }
    }

    @Override // z0.f
    public final uc.b getData() {
        return this.f10947c;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ac.c cVar) throws IOException {
        v vVar;
        y yVar;
        a aVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i = vVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.e = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.f10930c;
        zb.a aVar2 = zb.a.f11555a;
        int i10 = vVar.e;
        if (i10 == 0) {
            r7.g.G(obj);
            try {
                vVar.f10928a = this;
                vVar.e = 1;
                Object objG = g(vVar);
                if (objG == aVar2) {
                    return aVar2;
                }
                return objG;
            } catch (a e) {
                e = e;
                yVar = this;
                b9.e eVar = yVar.f10946b;
                vVar.f10928a = yVar;
                vVar.f10929b = e;
                vVar.e = 2;
                throw e;
            }
        }
        if (i10 == 1) {
            yVar = (y) vVar.f10928a;
            try {
                r7.g.G(obj);
                return obj;
            } catch (a e4) {
                e = e4;
                b9.e eVar2 = yVar.f10946b;
                vVar.f10928a = yVar;
                vVar.f10929b = e;
                vVar.e = 2;
                throw e;
            }
        }
        if (i10 == 2) {
            a aVar3 = (a) vVar.f10929b;
            y yVar2 = (y) vVar.f10928a;
            r7.g.G(obj);
            try {
                vVar.f10928a = aVar3;
                vVar.f10929b = obj;
                vVar.e = 3;
                if (yVar2.j(obj, vVar) == aVar2) {
                    return aVar2;
                }
                return obj;
            } catch (IOException e10) {
                e = e10;
                aVar = aVar3;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = vVar.f10929b;
            aVar = (a) vVar.f10928a;
            try {
                r7.g.G(obj);
                return obj2;
            } catch (IOException e11) {
                e = e11;
            }
        }
        p3.a.a(aVar, e);
        throw aVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ic.p pVar, yb.i iVar, ac.c cVar) {
        w wVar;
        b bVar;
        Object obj;
        y yVar;
        Object obj2;
        y yVar2;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.f10936f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.f10936f = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj3 = wVar.f10935d;
        zb.a aVar = zb.a.f11555a;
        int i10 = wVar.f10936f;
        yb.d dVar = null;
        if (i10 != 0) {
            if (i10 == 1) {
                obj = wVar.f10934c;
                bVar = (b) wVar.f10933b;
                yVar = wVar.f10932a;
                r7.g.G(obj3);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = wVar.f10933b;
                yVar2 = wVar.f10932a;
                r7.g.G(obj3);
            }
            uc.i iVar2 = yVar2.f10949f;
            b bVar2 = new b(obj2, obj2 != null ? obj2.hashCode() : 0);
            iVar2.getClass();
            iVar2.g(null, bVar2);
            return obj2;
        }
        r7.g.G(obj3);
        b bVar3 = (b) this.f10949f.f();
        Object obj4 = bVar3.f10863a;
        if ((obj4 != null ? obj4.hashCode() : 0) != bVar3.f10864b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        Object obj5 = bVar3.f10863a;
        a2.g gVar = new a2.g(pVar, obj5, dVar, 27);
        wVar.f10932a = this;
        wVar.f10933b = bVar3;
        wVar.f10934c = obj5;
        wVar.f10936f = 1;
        Object objY = b0.y(iVar, gVar, wVar);
        if (objY != aVar) {
            bVar = bVar3;
            obj3 = objY;
            obj = obj5;
            yVar = this;
        }
        return aVar;
        Object obj6 = bVar.f10863a;
        if ((obj6 != null ? obj6.hashCode() : 0) != bVar.f10864b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (jc.i.a(obj, obj3)) {
            return obj;
        }
        wVar.f10932a = yVar;
        wVar.f10933b = obj3;
        wVar.f10934c = null;
        wVar.f10936f = 2;
        if (yVar.j(obj3, wVar) != aVar) {
            obj2 = obj3;
            yVar2 = yVar;
            uc.i iVar3 = yVar2.f10949f;
            b bVar4 = new b(obj2, obj2 != null ? obj2.hashCode() : 0);
            iVar3.getClass();
            iVar3.g(null, bVar4);
            return obj2;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    public final Object j(Object obj, ac.c cVar) throws IOException {
        x xVar;
        FileOutputStream fileOutputStream;
        y yVar;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i = xVar.f10942r;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.f10942r = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj2 = xVar.e;
        zb.a aVar = zb.a.f11555a;
        File file = xVar.f10942r;
        ub.k kVar = ub.k.f9073a;
        try {
            if (file == 0) {
                r7.g.G(obj2);
                File fileC = c();
                File parentFile = fileC.getCanonicalFile().getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    if (!parentFile.isDirectory()) {
                        throw new IOException(jc.i.h(fileC, "Unable to create parent directories of "));
                    }
                }
                file = new File(jc.i.h(this.f10948d, c().getAbsolutePath()));
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    d1.g gVar = d1.g.f2799a;
                    l lVar = new l(fileOutputStream3);
                    xVar.f10937a = this;
                    xVar.f10938b = file;
                    xVar.f10939c = fileOutputStream3;
                    xVar.f10940d = fileOutputStream3;
                    xVar.f10942r = 1;
                    gVar.b(obj, lVar);
                    if (kVar == aVar) {
                        return aVar;
                    }
                    yVar = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                    file = file;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } else {
                if (file != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream2 = xVar.f10940d;
                fileOutputStream = xVar.f10939c;
                file = xVar.f10938b;
                yVar = xVar.f10937a;
                try {
                    r7.g.G(obj2);
                    file = file;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        r7.g.h(fileOutputStream, th);
                        throw th3;
                    }
                }
            }
            fileOutputStream2.getFD().sync();
            r7.g.h(fileOutputStream, null);
            if (file.renameTo(yVar.c())) {
                return kVar;
            }
            throw new IOException("Unable to rename " + ((Object) file) + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e) {
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
    }
}
