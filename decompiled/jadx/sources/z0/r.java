package z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc.a f10912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.o f10913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.q f10914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f10915d;

    public r(zc.a aVar, jc.o oVar, jc.q qVar, y yVar) {
        this.f10912a = aVar;
        this.f10913b = oVar;
        this.f10914c = qVar;
        this.f10915d = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(e eVar, ac.c cVar) throws Throwable {
        q qVar;
        zc.a aVar;
        y yVar;
        jc.o oVar;
        jc.q qVar2;
        ic.p pVar;
        zc.a aVar2;
        zc.a aVar3;
        y yVar2;
        Object obj;
        jc.q qVar3;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.f10911s;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.f10911s = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj2 = qVar.f10909f;
        zb.a aVar4 = zb.a.f11555a;
        int i10 = qVar.f10911s;
        try {
            if (i10 == 0) {
                r7.g.G(obj2);
                qVar.f10905a = eVar;
                aVar = this.f10912a;
                qVar.f10906b = aVar;
                jc.o oVar2 = this.f10913b;
                qVar.f10907c = oVar2;
                jc.q qVar4 = this.f10914c;
                qVar.f10908d = qVar4;
                yVar = this.f10915d;
                qVar.e = yVar;
                qVar.f10911s = 1;
                if (aVar.c(qVar) != aVar4) {
                    oVar = oVar2;
                    qVar2 = qVar4;
                    pVar = eVar;
                }
                return aVar4;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = qVar.f10907c;
                    qVar3 = (jc.q) qVar.f10906b;
                    aVar2 = (zc.a) qVar.f10905a;
                    try {
                        r7.g.G(obj2);
                        qVar3.f5776a = obj;
                        qVar2 = qVar3;
                        Object obj3 = qVar2.f5776a;
                        aVar2.d(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        aVar2.d(null);
                        throw th;
                    }
                }
                yVar2 = (y) qVar.f10907c;
                qVar2 = (jc.q) qVar.f10906b;
                aVar3 = (zc.a) qVar.f10905a;
                try {
                    r7.g.G(obj2);
                    if (!jc.i.a(obj2, qVar2.f5776a)) {
                        qVar.f10905a = aVar3;
                        qVar.f10906b = qVar2;
                        qVar.f10907c = obj2;
                        qVar.f10911s = 3;
                        if (yVar2.j(obj2, qVar) != aVar4) {
                            obj = obj2;
                            qVar3 = qVar2;
                            aVar2 = aVar3;
                            qVar3.f5776a = obj;
                            qVar2 = qVar3;
                        }
                        return aVar4;
                    }
                    aVar2 = aVar3;
                    Object obj4 = qVar2.f5776a;
                    aVar2.d(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    aVar2.d(null);
                    throw th;
                }
            }
            y yVar3 = qVar.e;
            qVar2 = qVar.f10908d;
            oVar = (jc.o) qVar.f10907c;
            zc.a aVar5 = (zc.a) qVar.f10906b;
            ic.p pVar2 = (ic.p) qVar.f10905a;
            r7.g.G(obj2);
            yVar = yVar3;
            pVar = pVar2;
            aVar = aVar5;
            if (oVar.f5774a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = qVar2.f5776a;
            qVar.f10905a = aVar;
            qVar.f10906b = qVar2;
            qVar.f10907c = yVar;
            qVar.f10908d = null;
            qVar.e = null;
            qVar.f10911s = 2;
            Object objInvoke = pVar.invoke(obj5, qVar);
            if (objInvoke != aVar4) {
                aVar3 = aVar;
                obj2 = objInvoke;
                yVar2 = yVar;
                if (!jc.i.a(obj2, qVar2.f5776a)) {
                    qVar.f10905a = aVar3;
                    qVar.f10906b = qVar2;
                    qVar.f10907c = obj2;
                    qVar.f10911s = 3;
                    if (yVar2.j(obj2, qVar) != aVar4) {
                        obj = obj2;
                        qVar3 = qVar2;
                        aVar2 = aVar3;
                        qVar3.f5776a = obj;
                        qVar2 = qVar3;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = qVar2.f5776a;
                aVar2.d(null);
                return obj6;
            }
            return aVar4;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.d(null);
            throw th;
        }
    }
}
